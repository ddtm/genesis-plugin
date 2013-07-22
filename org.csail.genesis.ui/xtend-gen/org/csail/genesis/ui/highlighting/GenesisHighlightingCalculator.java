package org.csail.genesis.ui.highlighting;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.csail.genesis.services.GenesisGrammarAccess;
import org.csail.genesis.services.GenesisGrammarAccess.ReflexiveDescriptionHeaderElements;
import org.csail.genesis.services.GenesisGrammarAccess.StoryHeaderElements;
import org.csail.genesis.ui.highlighting.GenesisHighlightingConfiguration;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.nodemodel.BidiIterable;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class GenesisHighlightingCalculator implements ISemanticHighlightingCalculator {
  private final static Pattern VARIABLE_PATTERN = new Function0<Pattern>() {
    public Pattern apply() {
      Pattern _compile = Pattern.compile("^([a-z])(\\1)$");
      return _compile;
    }
  }.apply();
  
  @Inject
  private GenesisGrammarAccess grammarAccess;
  
  public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
    boolean _or = false;
    boolean _equals = Objects.equal(resource, null);
    if (_equals) {
      _or = true;
    } else {
      IParseResult _parseResult = resource.getParseResult();
      boolean _equals_1 = Objects.equal(_parseResult, null);
      _or = (_equals || _equals_1);
    }
    if (_or) {
      return;
    }
    Stack<Pair<ICompositeNode,Boolean>> _stack = new Stack<Pair<ICompositeNode,Boolean>>();
    Stack<Pair<ICompositeNode,Boolean>> nodesStack = _stack;
    IParseResult _parseResult_1 = resource.getParseResult();
    ICompositeNode _rootNode = _parseResult_1.getRootNode();
    Pair<ICompositeNode,Boolean> _mappedTo = Pair.<ICompositeNode, Boolean>of(_rootNode, Boolean.valueOf(false));
    nodesStack.push(_mappedTo);
    boolean _empty = nodesStack.empty();
    boolean _not = (!_empty);
    boolean _while = _not;
    while (_while) {
      {
        Pair<ICompositeNode,Boolean> top = nodesStack.pop();
        ICompositeNode parent = top.getKey();
        Boolean doHighlightVars = top.getValue();
        BidiIterable<INode> _children = parent.getChildren();
        for (final INode child : _children) {
          {
            EObject grammarElement = child.getGrammarElement();
            boolean _matched = false;
            if (!_matched) {
              if (grammarElement instanceof Keyword) {
                final Keyword _keyword = (Keyword)grammarElement;
                _matched=true;
              }
            }
            if (!_matched) {
              if (grammarElement instanceof RuleCall) {
                final RuleCall _ruleCall = (RuleCall)grammarElement;
                _matched=true;
                AbstractRule _rule = _ruleCall.getRule();
                ParserRule _reflexiveDescriptionRule = this.grammarAccess.getReflexiveDescriptionRule();
                boolean _equals_2 = Objects.equal(_rule, _reflexiveDescriptionRule);
                if (_equals_2) {
                  doHighlightVars = Boolean.valueOf(true);
                  int _offset = child.getOffset();
                  int _length = child.getLength();
                  acceptor.addPosition(_offset, _length, GenesisHighlightingConfiguration.DESCRIPTION);
                } else {
                  AbstractRule _rule_1 = _ruleCall.getRule();
                  ParserRule _commonsenseKnowledgeRule = this.grammarAccess.getCommonsenseKnowledgeRule();
                  boolean _equals_3 = Objects.equal(_rule_1, _commonsenseKnowledgeRule);
                  if (_equals_3) {
                    doHighlightVars = Boolean.valueOf(true);
                  } else {
                    boolean _and = false;
                    boolean _and_1 = false;
                    AbstractRule _rule_2 = _ruleCall.getRule();
                    TerminalRule _wORDRule = this.grammarAccess.getWORDRule();
                    boolean _equals_4 = Objects.equal(_rule_2, _wORDRule);
                    if (!_equals_4) {
                      _and_1 = false;
                    } else {
                      String _text = child.getText();
                      Matcher _matcher = GenesisHighlightingCalculator.VARIABLE_PATTERN.matcher(_text);
                      boolean _matches = _matcher.matches();
                      _and_1 = (_equals_4 && _matches);
                    }
                    if (!_and_1) {
                      _and = false;
                    } else {
                      _and = (_and_1 && (doHighlightVars).booleanValue());
                    }
                    if (_and) {
                      int _offset_1 = child.getOffset();
                      int _length_1 = child.getLength();
                      String _text_1 = child.getText();
                      acceptor.addPosition(_offset_1, _length_1, _text_1);
                    } else {
                      boolean _or_1 = false;
                      boolean _or_2 = false;
                      AbstractRule _rule_3 = _ruleCall.getRule();
                      ParserRule _commonsenseKnowledgeHeaderRule = this.grammarAccess.getCommonsenseKnowledgeHeaderRule();
                      boolean _equals_5 = Objects.equal(_rule_3, _commonsenseKnowledgeHeaderRule);
                      if (_equals_5) {
                        _or_2 = true;
                      } else {
                        AbstractRule _rule_4 = _ruleCall.getRule();
                        ParserRule _reflexiveKnowledgeHeaderRule = this.grammarAccess.getReflexiveKnowledgeHeaderRule();
                        boolean _equals_6 = Objects.equal(_rule_4, _reflexiveKnowledgeHeaderRule);
                        _or_2 = (_equals_5 || _equals_6);
                      }
                      if (_or_2) {
                        _or_1 = true;
                      } else {
                        AbstractRule _rule_5 = _ruleCall.getRule();
                        ParserRule _perspectiveHeaderRule = this.grammarAccess.getPerspectiveHeaderRule();
                        boolean _equals_7 = Objects.equal(_rule_5, _perspectiveHeaderRule);
                        _or_1 = (_or_2 || _equals_7);
                      }
                      if (_or_1) {
                        int _offset_2 = child.getOffset();
                        int _length_2 = child.getLength();
                        acceptor.addPosition(_offset_2, _length_2, GenesisHighlightingConfiguration.SECTION);
                      } else {
                        boolean _or_3 = false;
                        boolean _or_4 = false;
                        AbstractRule _rule_6 = _ruleCall.getRule();
                        ParserRule _reflexiveDescriptionHeaderRule = this.grammarAccess.getReflexiveDescriptionHeaderRule();
                        boolean _equals_8 = Objects.equal(_rule_6, _reflexiveDescriptionHeaderRule);
                        if (_equals_8) {
                          _or_4 = true;
                        } else {
                          AbstractRule _rule_7 = _ruleCall.getRule();
                          ParserRule _storyHeaderRule = this.grammarAccess.getStoryHeaderRule();
                          boolean _equals_9 = Objects.equal(_rule_7, _storyHeaderRule);
                          _or_4 = (_equals_8 || _equals_9);
                        }
                        if (_or_4) {
                          _or_3 = true;
                        } else {
                          AbstractRule _rule_8 = _ruleCall.getRule();
                          ParserRule _theEndFooterRule = this.grammarAccess.getTheEndFooterRule();
                          boolean _equals_10 = Objects.equal(_rule_8, _theEndFooterRule);
                          _or_3 = (_or_4 || _equals_10);
                        }
                        if (_or_3) {
                          int _offset_3 = child.getOffset();
                          int _length_3 = child.getLength();
                          acceptor.addPosition(_offset_3, _length_3, GenesisHighlightingConfiguration.DESCRIPTION);
                          Pair<ICompositeNode,Boolean> _mappedTo_1 = Pair.<ICompositeNode, Boolean>of(((ICompositeNode) child), Boolean.valueOf(false));
                          nodesStack.push(_mappedTo_1);
                        } else {
                          boolean _or_5 = false;
                          ReflexiveDescriptionHeaderElements _reflexiveDescriptionHeaderAccess = this.grammarAccess.getReflexiveDescriptionHeaderAccess();
                          RuleCall _qUOTED_TEXTTerminalRuleCall_3 = _reflexiveDescriptionHeaderAccess.getQUOTED_TEXTTerminalRuleCall_3();
                          boolean _equals_11 = Objects.equal(_ruleCall, _qUOTED_TEXTTerminalRuleCall_3);
                          if (_equals_11) {
                            _or_5 = true;
                          } else {
                            StoryHeaderElements _storyHeaderAccess = this.grammarAccess.getStoryHeaderAccess();
                            RuleCall _qUOTED_TEXTTerminalRuleCall_3_1 = _storyHeaderAccess.getQUOTED_TEXTTerminalRuleCall_3();
                            boolean _equals_12 = Objects.equal(_ruleCall, _qUOTED_TEXTTerminalRuleCall_3_1);
                            _or_5 = (_equals_11 || _equals_12);
                          }
                          if (_or_5) {
                            int _offset_4 = child.getOffset();
                            int _length_4 = child.getLength();
                            acceptor.addPosition(_offset_4, _length_4, GenesisHighlightingConfiguration.IDENTIFIER);
                          } else {
                            if ((child instanceof ICompositeNode)) {
                              Pair<ICompositeNode,Boolean> _mappedTo_2 = Pair.<ICompositeNode, Boolean>of(((ICompositeNode) child), doHighlightVars);
                              nodesStack.push(_mappedTo_2);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            if (!_matched) {
              if ((child instanceof ICompositeNode)) {
                Pair<ICompositeNode,Boolean> _mappedTo_1 = Pair.<ICompositeNode, Boolean>of(((ICompositeNode) child), doHighlightVars);
                nodesStack.push(_mappedTo_1);
              }
            }
          }
        }
      }
      boolean _empty_1 = nodesStack.empty();
      boolean _not_1 = (!_empty_1);
      _while = _not_1;
    }
  }
}
