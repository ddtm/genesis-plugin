package org.csail.genesis.ui.highlighting

import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator

import com.google.inject.Inject
import org.csail.genesis.services.GenesisGrammarAccess;
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor

import java.util.regex.Pattern;
import java.util.Stack;
import org.eclipse.xtext.nodemodel.ICompositeNode
import org.eclipse.xtext.Keyword

public class GenesisHighlightingCalculator
    implements ISemanticHighlightingCalculator {
        
    private static final Pattern VARIABLE_PATTERN = Pattern.compile("^([a-z])(\\1)$");

    @Inject GenesisGrammarAccess grammarAccess

    override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) { 
        if (resource == null || resource.parseResult == null)
            return;
    
        var nodesStack = new Stack()
        nodesStack.push(resource.parseResult.rootNode -> false)
        
        while (!nodesStack.empty()) {
            var top = nodesStack.pop()
            
            var parent = top.key
            var doHighlightVars = top.value
            
            for (child : parent.children) {
                var grammarElement = child.grammarElement
                
                switch grammarElement {
                    Keyword: {
//                        if (
//                            grammarElement == grammarAccess.perspectiveHeaderAccess.perspectiveKeyword_1) {
//                            
//                            acceptor.addPosition(parent.offset, parent.length, GenesisHighlightingConfiguration.SECTION);
//                        }
//                        if (grammarElement == grammarAccess.commonsenseKnowledgeAccess.nameStartCommonsenseKnowledgeKeyword_1_0 ||
//                            grammarElement == grammarAccess.reflexiveKnowledgeAccess.nameStartReflexiveKnowledgeKeyword_1_0) {
//                                
//                            acceptor.addPosition(child.offset, child.length, GenesisHighlightingConfiguration.SECTION);
//                        } else if (
//                            grammarElement == grammarAccess.perspectiveHeaderAccess.perspectiveKeyword_1) {
//                            
//                            acceptor.addPosition(parent.offset, parent.length, GenesisHighlightingConfiguration.SECTION);
//                        } else if (
//                            grammarElement == grammarAccess.reflexiveDescriptionAccess.startDescriptionOfKeyword_1 ||
//                            grammarElement == grammarAccess.reflexiveDescriptionAccess.fullStopKeyword_3 ||
//                            grammarElement == grammarAccess.reflexiveDescriptionAccess.theEndKeyword_5 ||
//                            grammarElement == grammarAccess.storyAccess.startStoryTitledKeyword_1 ||
//                            grammarElement == grammarAccess.storyAccess.fullStopKeyword_3 ||
//                            grammarElement == grammarAccess.storyAccess.theEndKeyword_5) {
//                            
//                            acceptor.addPosition(child.offset, child.length, GenesisHighlightingConfiguration.DESCRIPTION);  
//                        }
                    }
                    RuleCall: {
                        if (grammarElement.rule == grammarAccess.reflexiveDescriptionRule) {
                            
                            doHighlightVars = true
                            acceptor.addPosition(child.offset, child.length, GenesisHighlightingConfiguration.DESCRIPTION);  
                        } else if (grammarElement.rule == grammarAccess.commonsenseKnowledgeRule) { 
                               
                            doHighlightVars = true         
                        } else if (
                            grammarElement.rule == grammarAccess.WORDRule &&
                            VARIABLE_PATTERN.matcher(child.text).matches() &&
                            doHighlightVars) {                            
                                
                            acceptor.addPosition(child.offset, child.length, child.text);    
                        } else if  (
                            grammarElement.rule == grammarAccess.commonsenseKnowledgeHeaderRule ||
                            grammarElement.rule == grammarAccess.reflexiveKnowledgeHeaderRule ||
                            grammarElement.rule == grammarAccess.perspectiveHeaderRule) {
                            
                            acceptor.addPosition(child.offset, child.length, GenesisHighlightingConfiguration.SECTION);
                        } else if (
                            grammarElement.rule == grammarAccess.reflexiveDescriptionHeaderRule ||
                            grammarElement.rule == grammarAccess.storyHeaderRule ||
                            grammarElement.rule == grammarAccess.theEndFooterRule) {
                                
                            acceptor.addPosition(child.offset, child.length, GenesisHighlightingConfiguration.DESCRIPTION);
                            nodesStack.push(child as ICompositeNode -> false)               
                        } else if (
                            grammarElement == grammarAccess.reflexiveDescriptionHeaderAccess.QUOTED_TEXTTerminalRuleCall_3 ||
                            grammarElement == grammarAccess.storyHeaderAccess.QUOTED_TEXTTerminalRuleCall_3) {
                            
                            acceptor.addPosition(child.offset, child.length, GenesisHighlightingConfiguration.IDENTIFIER);
                        } else if (child instanceof ICompositeNode) {
                            nodesStack.push(child as ICompositeNode -> doHighlightVars) 
                        }            
                    }
                    default: {
                        if (child instanceof ICompositeNode) {
                            nodesStack.push(child as ICompositeNode -> doHighlightVars) 
                        }
                    }
                }
                
            } 
        }
        
//        for (node : resource.parseResult.rootNode.getAsTreeIterable) {
//            if (/*node.parent != null &&
//                node.parent.parent != null &&
//                node.parent.parent.isSubsectionWithVars &&*/
//                node.isVariable >= 0) {    
//                                
//                acceptor.addPosition(node.offset, node.length, 
//                    GenesisHighlightingConfiguration.CROSS_REF);
//            }
//        }
    }
}
