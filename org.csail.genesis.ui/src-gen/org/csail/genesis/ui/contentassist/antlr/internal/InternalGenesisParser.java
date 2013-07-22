package org.csail.genesis.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.csail.genesis.services.GenesisGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGenesisParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_QUOTED_TEXT", "RULE_WORD", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "';'", "'Start'", "'commonsense'", "'knowledge'", "'.'", "'reflexive'", "'The'", "'end'", "'description'", "'of'", "'perspective'", "'story'", "'titled'"
    };
    public static final int RULE_QUOTED_TEXT=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=8;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=6;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int RULE_WS=7;
    public static final int RULE_WORD=5;

    // delegates
    // delegators


        public InternalGenesisParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGenesisParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGenesisParser.tokenNames; }
    public String getGrammarFileName() { return "../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g"; }


     
     	private GenesisGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GenesisGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:61:1: ( ruleModel EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:76:1: ( rule__Model__Group__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSection"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:88:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:89:1: ( ruleSection EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:90:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection121);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:97:1: ruleSection : ( ( rule__Section__Alternatives ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:101:2: ( ( ( rule__Section__Alternatives ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:102:1: ( ( rule__Section__Alternatives ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:102:1: ( ( rule__Section__Alternatives ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:103:1: ( rule__Section__Alternatives )
            {
             before(grammarAccess.getSectionAccess().getAlternatives()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:104:1: ( rule__Section__Alternatives )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:104:2: rule__Section__Alternatives
            {
            pushFollow(FOLLOW_rule__Section__Alternatives_in_ruleSection154);
            rule__Section__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleCommonsenseKnowledge"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:116:1: entryRuleCommonsenseKnowledge : ruleCommonsenseKnowledge EOF ;
    public final void entryRuleCommonsenseKnowledge() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:117:1: ( ruleCommonsenseKnowledge EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:118:1: ruleCommonsenseKnowledge EOF
            {
             before(grammarAccess.getCommonsenseKnowledgeRule()); 
            pushFollow(FOLLOW_ruleCommonsenseKnowledge_in_entryRuleCommonsenseKnowledge181);
            ruleCommonsenseKnowledge();

            state._fsp--;

             after(grammarAccess.getCommonsenseKnowledgeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonsenseKnowledge188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommonsenseKnowledge"


    // $ANTLR start "ruleCommonsenseKnowledge"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:125:1: ruleCommonsenseKnowledge : ( ( rule__CommonsenseKnowledge__Group__0 ) ) ;
    public final void ruleCommonsenseKnowledge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:129:2: ( ( ( rule__CommonsenseKnowledge__Group__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:130:1: ( ( rule__CommonsenseKnowledge__Group__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:130:1: ( ( rule__CommonsenseKnowledge__Group__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:131:1: ( rule__CommonsenseKnowledge__Group__0 )
            {
             before(grammarAccess.getCommonsenseKnowledgeAccess().getGroup()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:132:1: ( rule__CommonsenseKnowledge__Group__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:132:2: rule__CommonsenseKnowledge__Group__0
            {
            pushFollow(FOLLOW_rule__CommonsenseKnowledge__Group__0_in_ruleCommonsenseKnowledge214);
            rule__CommonsenseKnowledge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommonsenseKnowledgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommonsenseKnowledge"


    // $ANTLR start "entryRuleCommonsenseKnowledgeHeader"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:144:1: entryRuleCommonsenseKnowledgeHeader : ruleCommonsenseKnowledgeHeader EOF ;
    public final void entryRuleCommonsenseKnowledgeHeader() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:145:1: ( ruleCommonsenseKnowledgeHeader EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:146:1: ruleCommonsenseKnowledgeHeader EOF
            {
             before(grammarAccess.getCommonsenseKnowledgeHeaderRule()); 
            pushFollow(FOLLOW_ruleCommonsenseKnowledgeHeader_in_entryRuleCommonsenseKnowledgeHeader241);
            ruleCommonsenseKnowledgeHeader();

            state._fsp--;

             after(grammarAccess.getCommonsenseKnowledgeHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonsenseKnowledgeHeader248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommonsenseKnowledgeHeader"


    // $ANTLR start "ruleCommonsenseKnowledgeHeader"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:153:1: ruleCommonsenseKnowledgeHeader : ( ( rule__CommonsenseKnowledgeHeader__Group__0 ) ) ;
    public final void ruleCommonsenseKnowledgeHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:157:2: ( ( ( rule__CommonsenseKnowledgeHeader__Group__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:158:1: ( ( rule__CommonsenseKnowledgeHeader__Group__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:158:1: ( ( rule__CommonsenseKnowledgeHeader__Group__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:159:1: ( rule__CommonsenseKnowledgeHeader__Group__0 )
            {
             before(grammarAccess.getCommonsenseKnowledgeHeaderAccess().getGroup()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:160:1: ( rule__CommonsenseKnowledgeHeader__Group__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:160:2: rule__CommonsenseKnowledgeHeader__Group__0
            {
            pushFollow(FOLLOW_rule__CommonsenseKnowledgeHeader__Group__0_in_ruleCommonsenseKnowledgeHeader274);
            rule__CommonsenseKnowledgeHeader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommonsenseKnowledgeHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommonsenseKnowledgeHeader"


    // $ANTLR start "entryRuleReflexiveKnowledge"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:172:1: entryRuleReflexiveKnowledge : ruleReflexiveKnowledge EOF ;
    public final void entryRuleReflexiveKnowledge() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:173:1: ( ruleReflexiveKnowledge EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:174:1: ruleReflexiveKnowledge EOF
            {
             before(grammarAccess.getReflexiveKnowledgeRule()); 
            pushFollow(FOLLOW_ruleReflexiveKnowledge_in_entryRuleReflexiveKnowledge301);
            ruleReflexiveKnowledge();

            state._fsp--;

             after(grammarAccess.getReflexiveKnowledgeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflexiveKnowledge308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReflexiveKnowledge"


    // $ANTLR start "ruleReflexiveKnowledge"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:181:1: ruleReflexiveKnowledge : ( ( rule__ReflexiveKnowledge__Group__0 ) ) ;
    public final void ruleReflexiveKnowledge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:185:2: ( ( ( rule__ReflexiveKnowledge__Group__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:186:1: ( ( rule__ReflexiveKnowledge__Group__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:186:1: ( ( rule__ReflexiveKnowledge__Group__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:187:1: ( rule__ReflexiveKnowledge__Group__0 )
            {
             before(grammarAccess.getReflexiveKnowledgeAccess().getGroup()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:188:1: ( rule__ReflexiveKnowledge__Group__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:188:2: rule__ReflexiveKnowledge__Group__0
            {
            pushFollow(FOLLOW_rule__ReflexiveKnowledge__Group__0_in_ruleReflexiveKnowledge334);
            rule__ReflexiveKnowledge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReflexiveKnowledgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReflexiveKnowledge"


    // $ANTLR start "entryRuleReflexiveKnowledgeHeader"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:200:1: entryRuleReflexiveKnowledgeHeader : ruleReflexiveKnowledgeHeader EOF ;
    public final void entryRuleReflexiveKnowledgeHeader() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:201:1: ( ruleReflexiveKnowledgeHeader EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:202:1: ruleReflexiveKnowledgeHeader EOF
            {
             before(grammarAccess.getReflexiveKnowledgeHeaderRule()); 
            pushFollow(FOLLOW_ruleReflexiveKnowledgeHeader_in_entryRuleReflexiveKnowledgeHeader361);
            ruleReflexiveKnowledgeHeader();

            state._fsp--;

             after(grammarAccess.getReflexiveKnowledgeHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflexiveKnowledgeHeader368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReflexiveKnowledgeHeader"


    // $ANTLR start "ruleReflexiveKnowledgeHeader"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:209:1: ruleReflexiveKnowledgeHeader : ( ( rule__ReflexiveKnowledgeHeader__Group__0 ) ) ;
    public final void ruleReflexiveKnowledgeHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:213:2: ( ( ( rule__ReflexiveKnowledgeHeader__Group__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:214:1: ( ( rule__ReflexiveKnowledgeHeader__Group__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:214:1: ( ( rule__ReflexiveKnowledgeHeader__Group__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:215:1: ( rule__ReflexiveKnowledgeHeader__Group__0 )
            {
             before(grammarAccess.getReflexiveKnowledgeHeaderAccess().getGroup()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:216:1: ( rule__ReflexiveKnowledgeHeader__Group__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:216:2: rule__ReflexiveKnowledgeHeader__Group__0
            {
            pushFollow(FOLLOW_rule__ReflexiveKnowledgeHeader__Group__0_in_ruleReflexiveKnowledgeHeader394);
            rule__ReflexiveKnowledgeHeader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReflexiveKnowledgeHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReflexiveKnowledgeHeader"


    // $ANTLR start "entryRuleReflexiveDescription"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:228:1: entryRuleReflexiveDescription : ruleReflexiveDescription EOF ;
    public final void entryRuleReflexiveDescription() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:229:1: ( ruleReflexiveDescription EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:230:1: ruleReflexiveDescription EOF
            {
             before(grammarAccess.getReflexiveDescriptionRule()); 
            pushFollow(FOLLOW_ruleReflexiveDescription_in_entryRuleReflexiveDescription421);
            ruleReflexiveDescription();

            state._fsp--;

             after(grammarAccess.getReflexiveDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflexiveDescription428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReflexiveDescription"


    // $ANTLR start "ruleReflexiveDescription"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:237:1: ruleReflexiveDescription : ( ( rule__ReflexiveDescription__Group__0 ) ) ;
    public final void ruleReflexiveDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:241:2: ( ( ( rule__ReflexiveDescription__Group__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:242:1: ( ( rule__ReflexiveDescription__Group__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:242:1: ( ( rule__ReflexiveDescription__Group__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:243:1: ( rule__ReflexiveDescription__Group__0 )
            {
             before(grammarAccess.getReflexiveDescriptionAccess().getGroup()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:244:1: ( rule__ReflexiveDescription__Group__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:244:2: rule__ReflexiveDescription__Group__0
            {
            pushFollow(FOLLOW_rule__ReflexiveDescription__Group__0_in_ruleReflexiveDescription454);
            rule__ReflexiveDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReflexiveDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReflexiveDescription"


    // $ANTLR start "entryRuleTheEndFooter"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:256:1: entryRuleTheEndFooter : ruleTheEndFooter EOF ;
    public final void entryRuleTheEndFooter() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:257:1: ( ruleTheEndFooter EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:258:1: ruleTheEndFooter EOF
            {
             before(grammarAccess.getTheEndFooterRule()); 
            pushFollow(FOLLOW_ruleTheEndFooter_in_entryRuleTheEndFooter481);
            ruleTheEndFooter();

            state._fsp--;

             after(grammarAccess.getTheEndFooterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheEndFooter488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTheEndFooter"


    // $ANTLR start "ruleTheEndFooter"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:265:1: ruleTheEndFooter : ( ( rule__TheEndFooter__Group__0 ) ) ;
    public final void ruleTheEndFooter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:269:2: ( ( ( rule__TheEndFooter__Group__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:270:1: ( ( rule__TheEndFooter__Group__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:270:1: ( ( rule__TheEndFooter__Group__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:271:1: ( rule__TheEndFooter__Group__0 )
            {
             before(grammarAccess.getTheEndFooterAccess().getGroup()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:272:1: ( rule__TheEndFooter__Group__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:272:2: rule__TheEndFooter__Group__0
            {
            pushFollow(FOLLOW_rule__TheEndFooter__Group__0_in_ruleTheEndFooter514);
            rule__TheEndFooter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTheEndFooterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTheEndFooter"


    // $ANTLR start "entryRuleReflexiveDescriptionHeader"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:284:1: entryRuleReflexiveDescriptionHeader : ruleReflexiveDescriptionHeader EOF ;
    public final void entryRuleReflexiveDescriptionHeader() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:285:1: ( ruleReflexiveDescriptionHeader EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:286:1: ruleReflexiveDescriptionHeader EOF
            {
             before(grammarAccess.getReflexiveDescriptionHeaderRule()); 
            pushFollow(FOLLOW_ruleReflexiveDescriptionHeader_in_entryRuleReflexiveDescriptionHeader541);
            ruleReflexiveDescriptionHeader();

            state._fsp--;

             after(grammarAccess.getReflexiveDescriptionHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflexiveDescriptionHeader548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReflexiveDescriptionHeader"


    // $ANTLR start "ruleReflexiveDescriptionHeader"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:293:1: ruleReflexiveDescriptionHeader : ( ( rule__ReflexiveDescriptionHeader__Group__0 ) ) ;
    public final void ruleReflexiveDescriptionHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:297:2: ( ( ( rule__ReflexiveDescriptionHeader__Group__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:298:1: ( ( rule__ReflexiveDescriptionHeader__Group__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:298:1: ( ( rule__ReflexiveDescriptionHeader__Group__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:299:1: ( rule__ReflexiveDescriptionHeader__Group__0 )
            {
             before(grammarAccess.getReflexiveDescriptionHeaderAccess().getGroup()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:300:1: ( rule__ReflexiveDescriptionHeader__Group__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:300:2: rule__ReflexiveDescriptionHeader__Group__0
            {
            pushFollow(FOLLOW_rule__ReflexiveDescriptionHeader__Group__0_in_ruleReflexiveDescriptionHeader574);
            rule__ReflexiveDescriptionHeader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReflexiveDescriptionHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReflexiveDescriptionHeader"


    // $ANTLR start "entryRulePerspective"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:312:1: entryRulePerspective : rulePerspective EOF ;
    public final void entryRulePerspective() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:313:1: ( rulePerspective EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:314:1: rulePerspective EOF
            {
             before(grammarAccess.getPerspectiveRule()); 
            pushFollow(FOLLOW_rulePerspective_in_entryRulePerspective601);
            rulePerspective();

            state._fsp--;

             after(grammarAccess.getPerspectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerspective608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerspective"


    // $ANTLR start "rulePerspective"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:321:1: rulePerspective : ( ( rule__Perspective__Group__0 ) ) ;
    public final void rulePerspective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:325:2: ( ( ( rule__Perspective__Group__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:326:1: ( ( rule__Perspective__Group__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:326:1: ( ( rule__Perspective__Group__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:327:1: ( rule__Perspective__Group__0 )
            {
             before(grammarAccess.getPerspectiveAccess().getGroup()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:328:1: ( rule__Perspective__Group__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:328:2: rule__Perspective__Group__0
            {
            pushFollow(FOLLOW_rule__Perspective__Group__0_in_rulePerspective634);
            rule__Perspective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerspective"


    // $ANTLR start "entryRulePerspectiveHeader"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:340:1: entryRulePerspectiveHeader : rulePerspectiveHeader EOF ;
    public final void entryRulePerspectiveHeader() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:341:1: ( rulePerspectiveHeader EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:342:1: rulePerspectiveHeader EOF
            {
             before(grammarAccess.getPerspectiveHeaderRule()); 
            pushFollow(FOLLOW_rulePerspectiveHeader_in_entryRulePerspectiveHeader661);
            rulePerspectiveHeader();

            state._fsp--;

             after(grammarAccess.getPerspectiveHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerspectiveHeader668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerspectiveHeader"


    // $ANTLR start "rulePerspectiveHeader"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:349:1: rulePerspectiveHeader : ( ( rule__PerspectiveHeader__Group__0 ) ) ;
    public final void rulePerspectiveHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:353:2: ( ( ( rule__PerspectiveHeader__Group__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:354:1: ( ( rule__PerspectiveHeader__Group__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:354:1: ( ( rule__PerspectiveHeader__Group__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:355:1: ( rule__PerspectiveHeader__Group__0 )
            {
             before(grammarAccess.getPerspectiveHeaderAccess().getGroup()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:356:1: ( rule__PerspectiveHeader__Group__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:356:2: rule__PerspectiveHeader__Group__0
            {
            pushFollow(FOLLOW_rule__PerspectiveHeader__Group__0_in_rulePerspectiveHeader694);
            rule__PerspectiveHeader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerspectiveHeader"


    // $ANTLR start "entryRuleStory"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:368:1: entryRuleStory : ruleStory EOF ;
    public final void entryRuleStory() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:369:1: ( ruleStory EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:370:1: ruleStory EOF
            {
             before(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_ruleStory_in_entryRuleStory721);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getStoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStory728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:377:1: ruleStory : ( ( rule__Story__Group__0 ) ) ;
    public final void ruleStory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:381:2: ( ( ( rule__Story__Group__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:382:1: ( ( rule__Story__Group__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:382:1: ( ( rule__Story__Group__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:383:1: ( rule__Story__Group__0 )
            {
             before(grammarAccess.getStoryAccess().getGroup()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:384:1: ( rule__Story__Group__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:384:2: rule__Story__Group__0
            {
            pushFollow(FOLLOW_rule__Story__Group__0_in_ruleStory754);
            rule__Story__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleStoryHeader"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:396:1: entryRuleStoryHeader : ruleStoryHeader EOF ;
    public final void entryRuleStoryHeader() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:397:1: ( ruleStoryHeader EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:398:1: ruleStoryHeader EOF
            {
             before(grammarAccess.getStoryHeaderRule()); 
            pushFollow(FOLLOW_ruleStoryHeader_in_entryRuleStoryHeader781);
            ruleStoryHeader();

            state._fsp--;

             after(grammarAccess.getStoryHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStoryHeader788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStoryHeader"


    // $ANTLR start "ruleStoryHeader"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:405:1: ruleStoryHeader : ( ( rule__StoryHeader__Group__0 ) ) ;
    public final void ruleStoryHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:409:2: ( ( ( rule__StoryHeader__Group__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:410:1: ( ( rule__StoryHeader__Group__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:410:1: ( ( rule__StoryHeader__Group__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:411:1: ( rule__StoryHeader__Group__0 )
            {
             before(grammarAccess.getStoryHeaderAccess().getGroup()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:412:1: ( rule__StoryHeader__Group__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:412:2: rule__StoryHeader__Group__0
            {
            pushFollow(FOLLOW_rule__StoryHeader__Group__0_in_ruleStoryHeader814);
            rule__StoryHeader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoryHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStoryHeader"


    // $ANTLR start "entryRuleDescription"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:424:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:425:1: ( ruleDescription EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:426:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription841);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:433:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:437:2: ( ( ( rule__Description__Group__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:438:1: ( ( rule__Description__Group__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:438:1: ( ( rule__Description__Group__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:439:1: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:440:1: ( rule__Description__Group__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:440:2: rule__Description__Group__0
            {
            pushFollow(FOLLOW_rule__Description__Group__0_in_ruleDescription874);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleSentence"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:452:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:453:1: ( ruleSentence EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:454:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_ruleSentence_in_entryRuleSentence901);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentence908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:461:1: ruleSentence : ( ( rule__Sentence__Group__0 ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:465:2: ( ( ( rule__Sentence__Group__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:466:1: ( ( rule__Sentence__Group__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:466:1: ( ( rule__Sentence__Group__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:467:1: ( rule__Sentence__Group__0 )
            {
             before(grammarAccess.getSentenceAccess().getGroup()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:468:1: ( rule__Sentence__Group__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:468:2: rule__Sentence__Group__0
            {
            pushFollow(FOLLOW_rule__Sentence__Group__0_in_ruleSentence934);
            rule__Sentence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleREGULAR_FRAGMENT"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:480:1: entryRuleREGULAR_FRAGMENT : ruleREGULAR_FRAGMENT EOF ;
    public final void entryRuleREGULAR_FRAGMENT() throws RecognitionException {
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:481:1: ( ruleREGULAR_FRAGMENT EOF )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:482:1: ruleREGULAR_FRAGMENT EOF
            {
             before(grammarAccess.getREGULAR_FRAGMENTRule()); 
            pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_entryRuleREGULAR_FRAGMENT961);
            ruleREGULAR_FRAGMENT();

            state._fsp--;

             after(grammarAccess.getREGULAR_FRAGMENTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREGULAR_FRAGMENT968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleREGULAR_FRAGMENT"


    // $ANTLR start "ruleREGULAR_FRAGMENT"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:489:1: ruleREGULAR_FRAGMENT : ( ( rule__REGULAR_FRAGMENT__Alternatives ) ) ;
    public final void ruleREGULAR_FRAGMENT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:493:2: ( ( ( rule__REGULAR_FRAGMENT__Alternatives ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:494:1: ( ( rule__REGULAR_FRAGMENT__Alternatives ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:494:1: ( ( rule__REGULAR_FRAGMENT__Alternatives ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:495:1: ( rule__REGULAR_FRAGMENT__Alternatives )
            {
             before(grammarAccess.getREGULAR_FRAGMENTAccess().getAlternatives()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:496:1: ( rule__REGULAR_FRAGMENT__Alternatives )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:496:2: rule__REGULAR_FRAGMENT__Alternatives
            {
            pushFollow(FOLLOW_rule__REGULAR_FRAGMENT__Alternatives_in_ruleREGULAR_FRAGMENT994);
            rule__REGULAR_FRAGMENT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getREGULAR_FRAGMENTAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleREGULAR_FRAGMENT"


    // $ANTLR start "rule__Section__Alternatives"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:508:1: rule__Section__Alternatives : ( ( ruleCommonsenseKnowledge ) | ( ruleReflexiveKnowledge ) | ( rulePerspective ) );
    public final void rule__Section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:512:1: ( ( ruleCommonsenseKnowledge ) | ( ruleReflexiveKnowledge ) | ( rulePerspective ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==15) ) {
                    alt1=2;
                }
                else if ( (LA1_1==12) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_WORD) ) {
                alt1=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:513:1: ( ruleCommonsenseKnowledge )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:513:1: ( ruleCommonsenseKnowledge )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:514:1: ruleCommonsenseKnowledge
                    {
                     before(grammarAccess.getSectionAccess().getCommonsenseKnowledgeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCommonsenseKnowledge_in_rule__Section__Alternatives1030);
                    ruleCommonsenseKnowledge();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getCommonsenseKnowledgeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:519:6: ( ruleReflexiveKnowledge )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:519:6: ( ruleReflexiveKnowledge )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:520:1: ruleReflexiveKnowledge
                    {
                     before(grammarAccess.getSectionAccess().getReflexiveKnowledgeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReflexiveKnowledge_in_rule__Section__Alternatives1047);
                    ruleReflexiveKnowledge();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getReflexiveKnowledgeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:525:6: ( rulePerspective )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:525:6: ( rulePerspective )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:526:1: rulePerspective
                    {
                     before(grammarAccess.getSectionAccess().getPerspectiveParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePerspective_in_rule__Section__Alternatives1064);
                    rulePerspective();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getPerspectiveParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Alternatives"


    // $ANTLR start "rule__Sentence__Alternatives_1_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:536:1: rule__Sentence__Alternatives_1_0 : ( ( ( rule__Sentence__FragmentsAssignment_1_0_0 ) ) | ( ( rule__Sentence__Group_1_0_1__0 ) ) | ( ( rule__Sentence__Group_1_0_2__0 ) ) | ( ( rule__Sentence__Group_1_0_3__0 ) ) | ( ( rule__Sentence__Group_1_0_4__0 ) ) | ( ( rule__Sentence__Group_1_0_5__0 ) ) | ( ( rule__Sentence__Group_1_0_6__0 ) ) | ( ( rule__Sentence__Group_1_0_7__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_8 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_9 ) ) | ( ( rule__Sentence__Group_1_0_10__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_11 ) ) | ( ( rule__Sentence__Group_1_0_12__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_13 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_14 ) ) | ( ( rule__Sentence__Group_1_0_15__0 ) ) | ( ( rule__Sentence__Group_1_0_16__0 ) ) | ( ( rule__Sentence__Group_1_0_17__0 ) ) | ( ( rule__Sentence__Group_1_0_18__0 ) ) | ( ( rule__Sentence__Group_1_0_19__0 ) ) | ( ( rule__Sentence__Group_1_0_20__0 ) ) | ( ( rule__Sentence__Group_1_0_21__0 ) ) | ( ( rule__Sentence__Group_1_0_22__0 ) ) | ( ( rule__Sentence__Group_1_0_23__0 ) ) | ( ( rule__Sentence__Group_1_0_24__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_25 ) ) | ( ( rule__Sentence__Group_1_0_26__0 ) ) | ( ( rule__Sentence__Group_1_0_27__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_28 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_29 ) ) );
    public final void rule__Sentence__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:540:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_0 ) ) | ( ( rule__Sentence__Group_1_0_1__0 ) ) | ( ( rule__Sentence__Group_1_0_2__0 ) ) | ( ( rule__Sentence__Group_1_0_3__0 ) ) | ( ( rule__Sentence__Group_1_0_4__0 ) ) | ( ( rule__Sentence__Group_1_0_5__0 ) ) | ( ( rule__Sentence__Group_1_0_6__0 ) ) | ( ( rule__Sentence__Group_1_0_7__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_8 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_9 ) ) | ( ( rule__Sentence__Group_1_0_10__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_11 ) ) | ( ( rule__Sentence__Group_1_0_12__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_13 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_14 ) ) | ( ( rule__Sentence__Group_1_0_15__0 ) ) | ( ( rule__Sentence__Group_1_0_16__0 ) ) | ( ( rule__Sentence__Group_1_0_17__0 ) ) | ( ( rule__Sentence__Group_1_0_18__0 ) ) | ( ( rule__Sentence__Group_1_0_19__0 ) ) | ( ( rule__Sentence__Group_1_0_20__0 ) ) | ( ( rule__Sentence__Group_1_0_21__0 ) ) | ( ( rule__Sentence__Group_1_0_22__0 ) ) | ( ( rule__Sentence__Group_1_0_23__0 ) ) | ( ( rule__Sentence__Group_1_0_24__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_25 ) ) | ( ( rule__Sentence__Group_1_0_26__0 ) ) | ( ( rule__Sentence__Group_1_0_27__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_28 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_29 ) ) )
            int alt2=30;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:541:1: ( ( rule__Sentence__FragmentsAssignment_1_0_0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:541:1: ( ( rule__Sentence__FragmentsAssignment_1_0_0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:542:1: ( rule__Sentence__FragmentsAssignment_1_0_0 )
                    {
                     before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_0()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:543:1: ( rule__Sentence__FragmentsAssignment_1_0_0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:543:2: rule__Sentence__FragmentsAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_0_in_rule__Sentence__Alternatives_1_01096);
                    rule__Sentence__FragmentsAssignment_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:547:6: ( ( rule__Sentence__Group_1_0_1__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:547:6: ( ( rule__Sentence__Group_1_0_1__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:548:1: ( rule__Sentence__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_1()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:549:1: ( rule__Sentence__Group_1_0_1__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:549:2: rule__Sentence__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_1__0_in_rule__Sentence__Alternatives_1_01114);
                    rule__Sentence__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:553:6: ( ( rule__Sentence__Group_1_0_2__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:553:6: ( ( rule__Sentence__Group_1_0_2__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:554:1: ( rule__Sentence__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_2()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:555:1: ( rule__Sentence__Group_1_0_2__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:555:2: rule__Sentence__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_2__0_in_rule__Sentence__Alternatives_1_01132);
                    rule__Sentence__Group_1_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:559:6: ( ( rule__Sentence__Group_1_0_3__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:559:6: ( ( rule__Sentence__Group_1_0_3__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:560:1: ( rule__Sentence__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_3()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:561:1: ( rule__Sentence__Group_1_0_3__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:561:2: rule__Sentence__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_3__0_in_rule__Sentence__Alternatives_1_01150);
                    rule__Sentence__Group_1_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:565:6: ( ( rule__Sentence__Group_1_0_4__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:565:6: ( ( rule__Sentence__Group_1_0_4__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:566:1: ( rule__Sentence__Group_1_0_4__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_4()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:567:1: ( rule__Sentence__Group_1_0_4__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:567:2: rule__Sentence__Group_1_0_4__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_4__0_in_rule__Sentence__Alternatives_1_01168);
                    rule__Sentence__Group_1_0_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:571:6: ( ( rule__Sentence__Group_1_0_5__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:571:6: ( ( rule__Sentence__Group_1_0_5__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:572:1: ( rule__Sentence__Group_1_0_5__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_5()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:573:1: ( rule__Sentence__Group_1_0_5__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:573:2: rule__Sentence__Group_1_0_5__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_5__0_in_rule__Sentence__Alternatives_1_01186);
                    rule__Sentence__Group_1_0_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:577:6: ( ( rule__Sentence__Group_1_0_6__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:577:6: ( ( rule__Sentence__Group_1_0_6__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:578:1: ( rule__Sentence__Group_1_0_6__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_6()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:579:1: ( rule__Sentence__Group_1_0_6__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:579:2: rule__Sentence__Group_1_0_6__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_6__0_in_rule__Sentence__Alternatives_1_01204);
                    rule__Sentence__Group_1_0_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:583:6: ( ( rule__Sentence__Group_1_0_7__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:583:6: ( ( rule__Sentence__Group_1_0_7__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:584:1: ( rule__Sentence__Group_1_0_7__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_7()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:585:1: ( rule__Sentence__Group_1_0_7__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:585:2: rule__Sentence__Group_1_0_7__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_7__0_in_rule__Sentence__Alternatives_1_01222);
                    rule__Sentence__Group_1_0_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:589:6: ( ( rule__Sentence__FragmentsAssignment_1_0_8 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:589:6: ( ( rule__Sentence__FragmentsAssignment_1_0_8 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:590:1: ( rule__Sentence__FragmentsAssignment_1_0_8 )
                    {
                     before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_8()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:591:1: ( rule__Sentence__FragmentsAssignment_1_0_8 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:591:2: rule__Sentence__FragmentsAssignment_1_0_8
                    {
                    pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_8_in_rule__Sentence__Alternatives_1_01240);
                    rule__Sentence__FragmentsAssignment_1_0_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:595:6: ( ( rule__Sentence__FragmentsAssignment_1_0_9 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:595:6: ( ( rule__Sentence__FragmentsAssignment_1_0_9 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:596:1: ( rule__Sentence__FragmentsAssignment_1_0_9 )
                    {
                     before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_9()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:597:1: ( rule__Sentence__FragmentsAssignment_1_0_9 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:597:2: rule__Sentence__FragmentsAssignment_1_0_9
                    {
                    pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_9_in_rule__Sentence__Alternatives_1_01258);
                    rule__Sentence__FragmentsAssignment_1_0_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:601:6: ( ( rule__Sentence__Group_1_0_10__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:601:6: ( ( rule__Sentence__Group_1_0_10__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:602:1: ( rule__Sentence__Group_1_0_10__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_10()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:603:1: ( rule__Sentence__Group_1_0_10__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:603:2: rule__Sentence__Group_1_0_10__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_10__0_in_rule__Sentence__Alternatives_1_01276);
                    rule__Sentence__Group_1_0_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:607:6: ( ( rule__Sentence__FragmentsAssignment_1_0_11 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:607:6: ( ( rule__Sentence__FragmentsAssignment_1_0_11 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:608:1: ( rule__Sentence__FragmentsAssignment_1_0_11 )
                    {
                     before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_11()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:609:1: ( rule__Sentence__FragmentsAssignment_1_0_11 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:609:2: rule__Sentence__FragmentsAssignment_1_0_11
                    {
                    pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_11_in_rule__Sentence__Alternatives_1_01294);
                    rule__Sentence__FragmentsAssignment_1_0_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:613:6: ( ( rule__Sentence__Group_1_0_12__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:613:6: ( ( rule__Sentence__Group_1_0_12__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:614:1: ( rule__Sentence__Group_1_0_12__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_12()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:615:1: ( rule__Sentence__Group_1_0_12__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:615:2: rule__Sentence__Group_1_0_12__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_12__0_in_rule__Sentence__Alternatives_1_01312);
                    rule__Sentence__Group_1_0_12__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:619:6: ( ( rule__Sentence__FragmentsAssignment_1_0_13 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:619:6: ( ( rule__Sentence__FragmentsAssignment_1_0_13 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:620:1: ( rule__Sentence__FragmentsAssignment_1_0_13 )
                    {
                     before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_13()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:621:1: ( rule__Sentence__FragmentsAssignment_1_0_13 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:621:2: rule__Sentence__FragmentsAssignment_1_0_13
                    {
                    pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_13_in_rule__Sentence__Alternatives_1_01330);
                    rule__Sentence__FragmentsAssignment_1_0_13();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:625:6: ( ( rule__Sentence__FragmentsAssignment_1_0_14 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:625:6: ( ( rule__Sentence__FragmentsAssignment_1_0_14 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:626:1: ( rule__Sentence__FragmentsAssignment_1_0_14 )
                    {
                     before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_14()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:627:1: ( rule__Sentence__FragmentsAssignment_1_0_14 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:627:2: rule__Sentence__FragmentsAssignment_1_0_14
                    {
                    pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_14_in_rule__Sentence__Alternatives_1_01348);
                    rule__Sentence__FragmentsAssignment_1_0_14();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:631:6: ( ( rule__Sentence__Group_1_0_15__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:631:6: ( ( rule__Sentence__Group_1_0_15__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:632:1: ( rule__Sentence__Group_1_0_15__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_15()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:633:1: ( rule__Sentence__Group_1_0_15__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:633:2: rule__Sentence__Group_1_0_15__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_15__0_in_rule__Sentence__Alternatives_1_01366);
                    rule__Sentence__Group_1_0_15__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:637:6: ( ( rule__Sentence__Group_1_0_16__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:637:6: ( ( rule__Sentence__Group_1_0_16__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:638:1: ( rule__Sentence__Group_1_0_16__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_16()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:639:1: ( rule__Sentence__Group_1_0_16__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:639:2: rule__Sentence__Group_1_0_16__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_16__0_in_rule__Sentence__Alternatives_1_01384);
                    rule__Sentence__Group_1_0_16__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:643:6: ( ( rule__Sentence__Group_1_0_17__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:643:6: ( ( rule__Sentence__Group_1_0_17__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:644:1: ( rule__Sentence__Group_1_0_17__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_17()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:645:1: ( rule__Sentence__Group_1_0_17__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:645:2: rule__Sentence__Group_1_0_17__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_17__0_in_rule__Sentence__Alternatives_1_01402);
                    rule__Sentence__Group_1_0_17__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:649:6: ( ( rule__Sentence__Group_1_0_18__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:649:6: ( ( rule__Sentence__Group_1_0_18__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:650:1: ( rule__Sentence__Group_1_0_18__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_18()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:651:1: ( rule__Sentence__Group_1_0_18__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:651:2: rule__Sentence__Group_1_0_18__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_18__0_in_rule__Sentence__Alternatives_1_01420);
                    rule__Sentence__Group_1_0_18__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:655:6: ( ( rule__Sentence__Group_1_0_19__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:655:6: ( ( rule__Sentence__Group_1_0_19__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:656:1: ( rule__Sentence__Group_1_0_19__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_19()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:657:1: ( rule__Sentence__Group_1_0_19__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:657:2: rule__Sentence__Group_1_0_19__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_19__0_in_rule__Sentence__Alternatives_1_01438);
                    rule__Sentence__Group_1_0_19__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:661:6: ( ( rule__Sentence__Group_1_0_20__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:661:6: ( ( rule__Sentence__Group_1_0_20__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:662:1: ( rule__Sentence__Group_1_0_20__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_20()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:663:1: ( rule__Sentence__Group_1_0_20__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:663:2: rule__Sentence__Group_1_0_20__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_20__0_in_rule__Sentence__Alternatives_1_01456);
                    rule__Sentence__Group_1_0_20__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:667:6: ( ( rule__Sentence__Group_1_0_21__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:667:6: ( ( rule__Sentence__Group_1_0_21__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:668:1: ( rule__Sentence__Group_1_0_21__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_21()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:669:1: ( rule__Sentence__Group_1_0_21__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:669:2: rule__Sentence__Group_1_0_21__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_21__0_in_rule__Sentence__Alternatives_1_01474);
                    rule__Sentence__Group_1_0_21__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:673:6: ( ( rule__Sentence__Group_1_0_22__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:673:6: ( ( rule__Sentence__Group_1_0_22__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:674:1: ( rule__Sentence__Group_1_0_22__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_22()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:675:1: ( rule__Sentence__Group_1_0_22__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:675:2: rule__Sentence__Group_1_0_22__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_22__0_in_rule__Sentence__Alternatives_1_01492);
                    rule__Sentence__Group_1_0_22__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:679:6: ( ( rule__Sentence__Group_1_0_23__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:679:6: ( ( rule__Sentence__Group_1_0_23__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:680:1: ( rule__Sentence__Group_1_0_23__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_23()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:681:1: ( rule__Sentence__Group_1_0_23__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:681:2: rule__Sentence__Group_1_0_23__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_23__0_in_rule__Sentence__Alternatives_1_01510);
                    rule__Sentence__Group_1_0_23__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:685:6: ( ( rule__Sentence__Group_1_0_24__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:685:6: ( ( rule__Sentence__Group_1_0_24__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:686:1: ( rule__Sentence__Group_1_0_24__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_24()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:687:1: ( rule__Sentence__Group_1_0_24__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:687:2: rule__Sentence__Group_1_0_24__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_24__0_in_rule__Sentence__Alternatives_1_01528);
                    rule__Sentence__Group_1_0_24__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:691:6: ( ( rule__Sentence__FragmentsAssignment_1_0_25 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:691:6: ( ( rule__Sentence__FragmentsAssignment_1_0_25 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:692:1: ( rule__Sentence__FragmentsAssignment_1_0_25 )
                    {
                     before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_25()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:693:1: ( rule__Sentence__FragmentsAssignment_1_0_25 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:693:2: rule__Sentence__FragmentsAssignment_1_0_25
                    {
                    pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_25_in_rule__Sentence__Alternatives_1_01546);
                    rule__Sentence__FragmentsAssignment_1_0_25();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:697:6: ( ( rule__Sentence__Group_1_0_26__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:697:6: ( ( rule__Sentence__Group_1_0_26__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:698:1: ( rule__Sentence__Group_1_0_26__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_26()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:699:1: ( rule__Sentence__Group_1_0_26__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:699:2: rule__Sentence__Group_1_0_26__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_26__0_in_rule__Sentence__Alternatives_1_01564);
                    rule__Sentence__Group_1_0_26__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:703:6: ( ( rule__Sentence__Group_1_0_27__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:703:6: ( ( rule__Sentence__Group_1_0_27__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:704:1: ( rule__Sentence__Group_1_0_27__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_0_27()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:705:1: ( rule__Sentence__Group_1_0_27__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:705:2: rule__Sentence__Group_1_0_27__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_0_27__0_in_rule__Sentence__Alternatives_1_01582);
                    rule__Sentence__Group_1_0_27__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_0_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:709:6: ( ( rule__Sentence__FragmentsAssignment_1_0_28 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:709:6: ( ( rule__Sentence__FragmentsAssignment_1_0_28 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:710:1: ( rule__Sentence__FragmentsAssignment_1_0_28 )
                    {
                     before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_28()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:711:1: ( rule__Sentence__FragmentsAssignment_1_0_28 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:711:2: rule__Sentence__FragmentsAssignment_1_0_28
                    {
                    pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_28_in_rule__Sentence__Alternatives_1_01600);
                    rule__Sentence__FragmentsAssignment_1_0_28();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_28()); 

                    }


                    }
                    break;
                case 30 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:715:6: ( ( rule__Sentence__FragmentsAssignment_1_0_29 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:715:6: ( ( rule__Sentence__FragmentsAssignment_1_0_29 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:716:1: ( rule__Sentence__FragmentsAssignment_1_0_29 )
                    {
                     before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_29()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:717:1: ( rule__Sentence__FragmentsAssignment_1_0_29 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:717:2: rule__Sentence__FragmentsAssignment_1_0_29
                    {
                    pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_29_in_rule__Sentence__Alternatives_1_01618);
                    rule__Sentence__FragmentsAssignment_1_0_29();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_29()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Alternatives_1_0"


    // $ANTLR start "rule__Sentence__Alternatives_1_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:726:1: rule__Sentence__Alternatives_1_1 : ( ( ( rule__Sentence__FragmentsAssignment_1_1_0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_1_1 ) ) | ( ( rule__Sentence__Group_1_1_2__0 ) ) | ( ( rule__Sentence__Group_1_1_3__0 ) ) | ( ( rule__Sentence__Group_1_1_4__0 ) ) | ( ( rule__Sentence__Group_1_1_5__0 ) ) );
    public final void rule__Sentence__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:730:1: ( ( ( rule__Sentence__FragmentsAssignment_1_1_0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_1_1 ) ) | ( ( rule__Sentence__Group_1_1_2__0 ) ) | ( ( rule__Sentence__Group_1_1_3__0 ) ) | ( ( rule__Sentence__Group_1_1_4__0 ) ) | ( ( rule__Sentence__Group_1_1_5__0 ) ) )
            int alt3=6;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                switch ( input.LA(2) ) {
                case 12:
                    {
                    alt3=3;
                    }
                    break;
                case 21:
                    {
                    alt3=6;
                    }
                    break;
                case 18:
                    {
                    alt3=5;
                    }
                    break;
                case 15:
                    {
                    alt3=4;
                    }
                    break;
                case 14:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:731:1: ( ( rule__Sentence__FragmentsAssignment_1_1_0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:731:1: ( ( rule__Sentence__FragmentsAssignment_1_1_0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:732:1: ( rule__Sentence__FragmentsAssignment_1_1_0 )
                    {
                     before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_0()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:733:1: ( rule__Sentence__FragmentsAssignment_1_1_0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:733:2: rule__Sentence__FragmentsAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_1_0_in_rule__Sentence__Alternatives_1_11651);
                    rule__Sentence__FragmentsAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:737:6: ( ( rule__Sentence__FragmentsAssignment_1_1_1 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:737:6: ( ( rule__Sentence__FragmentsAssignment_1_1_1 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:738:1: ( rule__Sentence__FragmentsAssignment_1_1_1 )
                    {
                     before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_1()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:739:1: ( rule__Sentence__FragmentsAssignment_1_1_1 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:739:2: rule__Sentence__FragmentsAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_1_1_in_rule__Sentence__Alternatives_1_11669);
                    rule__Sentence__FragmentsAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:743:6: ( ( rule__Sentence__Group_1_1_2__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:743:6: ( ( rule__Sentence__Group_1_1_2__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:744:1: ( rule__Sentence__Group_1_1_2__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_1_2()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:745:1: ( rule__Sentence__Group_1_1_2__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:745:2: rule__Sentence__Group_1_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_1_2__0_in_rule__Sentence__Alternatives_1_11687);
                    rule__Sentence__Group_1_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:749:6: ( ( rule__Sentence__Group_1_1_3__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:749:6: ( ( rule__Sentence__Group_1_1_3__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:750:1: ( rule__Sentence__Group_1_1_3__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_1_3()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:751:1: ( rule__Sentence__Group_1_1_3__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:751:2: rule__Sentence__Group_1_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_1_3__0_in_rule__Sentence__Alternatives_1_11705);
                    rule__Sentence__Group_1_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:755:6: ( ( rule__Sentence__Group_1_1_4__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:755:6: ( ( rule__Sentence__Group_1_1_4__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:756:1: ( rule__Sentence__Group_1_1_4__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_1_4()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:757:1: ( rule__Sentence__Group_1_1_4__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:757:2: rule__Sentence__Group_1_1_4__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_1_4__0_in_rule__Sentence__Alternatives_1_11723);
                    rule__Sentence__Group_1_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:761:6: ( ( rule__Sentence__Group_1_1_5__0 ) )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:761:6: ( ( rule__Sentence__Group_1_1_5__0 ) )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:762:1: ( rule__Sentence__Group_1_1_5__0 )
                    {
                     before(grammarAccess.getSentenceAccess().getGroup_1_1_5()); 
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:763:1: ( rule__Sentence__Group_1_1_5__0 )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:763:2: rule__Sentence__Group_1_1_5__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_1_1_5__0_in_rule__Sentence__Alternatives_1_11741);
                    rule__Sentence__Group_1_1_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSentenceAccess().getGroup_1_1_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Alternatives_1_1"


    // $ANTLR start "rule__REGULAR_FRAGMENT__Alternatives"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:772:1: rule__REGULAR_FRAGMENT__Alternatives : ( ( RULE_QUOTED_TEXT ) | ( RULE_WORD ) | ( ',' ) | ( ';' ) );
    public final void rule__REGULAR_FRAGMENT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:776:1: ( ( RULE_QUOTED_TEXT ) | ( RULE_WORD ) | ( ',' ) | ( ';' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_QUOTED_TEXT:
                {
                alt4=1;
                }
                break;
            case RULE_WORD:
                {
                alt4=2;
                }
                break;
            case 9:
                {
                alt4=3;
                }
                break;
            case 10:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:777:1: ( RULE_QUOTED_TEXT )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:777:1: ( RULE_QUOTED_TEXT )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:778:1: RULE_QUOTED_TEXT
                    {
                     before(grammarAccess.getREGULAR_FRAGMENTAccess().getQUOTED_TEXTTerminalRuleCall_0()); 
                    match(input,RULE_QUOTED_TEXT,FOLLOW_RULE_QUOTED_TEXT_in_rule__REGULAR_FRAGMENT__Alternatives1774); 
                     after(grammarAccess.getREGULAR_FRAGMENTAccess().getQUOTED_TEXTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:783:6: ( RULE_WORD )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:783:6: ( RULE_WORD )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:784:1: RULE_WORD
                    {
                     before(grammarAccess.getREGULAR_FRAGMENTAccess().getWORDTerminalRuleCall_1()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__REGULAR_FRAGMENT__Alternatives1791); 
                     after(grammarAccess.getREGULAR_FRAGMENTAccess().getWORDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:789:6: ( ',' )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:789:6: ( ',' )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:790:1: ','
                    {
                     before(grammarAccess.getREGULAR_FRAGMENTAccess().getCommaKeyword_2()); 
                    match(input,9,FOLLOW_9_in_rule__REGULAR_FRAGMENT__Alternatives1809); 
                     after(grammarAccess.getREGULAR_FRAGMENTAccess().getCommaKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:797:6: ( ';' )
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:797:6: ( ';' )
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:798:1: ';'
                    {
                     before(grammarAccess.getREGULAR_FRAGMENTAccess().getSemicolonKeyword_3()); 
                    match(input,10,FOLLOW_10_in_rule__REGULAR_FRAGMENT__Alternatives1829); 
                     after(grammarAccess.getREGULAR_FRAGMENTAccess().getSemicolonKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REGULAR_FRAGMENT__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:812:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:816:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:817:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01861);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01864);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:824:1: rule__Model__Group__0__Impl : ( ( rule__Model__HeaderAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:828:1: ( ( ( rule__Model__HeaderAssignment_0 )* ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:829:1: ( ( rule__Model__HeaderAssignment_0 )* )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:829:1: ( ( rule__Model__HeaderAssignment_0 )* )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:830:1: ( rule__Model__HeaderAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getHeaderAssignment_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:831:1: ( rule__Model__HeaderAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    switch ( input.LA(2) ) {
                    case 12:
                        {
                        int LA5_5 = input.LA(3);

                        if ( ((LA5_5>=RULE_QUOTED_TEXT && LA5_5<=RULE_WORD)||(LA5_5>=9 && LA5_5<=10)||LA5_5==14) ) {
                            alt5=1;
                        }


                        }
                        break;
                    case 15:
                        {
                        int LA5_6 = input.LA(3);

                        if ( ((LA5_6>=RULE_QUOTED_TEXT && LA5_6<=RULE_WORD)||(LA5_6>=9 && LA5_6<=10)||LA5_6==14) ) {
                            alt5=1;
                        }


                        }
                        break;
                    case RULE_QUOTED_TEXT:
                    case RULE_WORD:
                    case 9:
                    case 10:
                    case 11:
                    case 13:
                    case 14:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 22:
                        {
                        alt5=1;
                        }
                        break;

                    }

                    }
                    break;
                case RULE_WORD:
                    {
                    int LA5_2 = input.LA(2);

                    if ( ((LA5_2>=RULE_QUOTED_TEXT && LA5_2<=RULE_WORD)||(LA5_2>=9 && LA5_2<=19)||(LA5_2>=21 && LA5_2<=22)) ) {
                        alt5=1;
                    }


                    }
                    break;
                case RULE_QUOTED_TEXT:
                case 9:
                case 10:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 21:
                case 22:
                    {
                    alt5=1;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:831:2: rule__Model__HeaderAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__HeaderAssignment_0_in_rule__Model__Group__0__Impl1891);
            	    rule__Model__HeaderAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getHeaderAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:841:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:845:1: ( rule__Model__Group__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:846:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11922);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:852:1: rule__Model__Group__1__Impl : ( ( rule__Model__SectionsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:856:1: ( ( ( rule__Model__SectionsAssignment_1 )* ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:857:1: ( ( rule__Model__SectionsAssignment_1 )* )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:857:1: ( ( rule__Model__SectionsAssignment_1 )* )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:858:1: ( rule__Model__SectionsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getSectionsAssignment_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:859:1: ( rule__Model__SectionsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WORD||LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:859:2: rule__Model__SectionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__SectionsAssignment_1_in_rule__Model__Group__1__Impl1949);
            	    rule__Model__SectionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSectionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__CommonsenseKnowledge__Group__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:873:1: rule__CommonsenseKnowledge__Group__0 : rule__CommonsenseKnowledge__Group__0__Impl rule__CommonsenseKnowledge__Group__1 ;
    public final void rule__CommonsenseKnowledge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:877:1: ( rule__CommonsenseKnowledge__Group__0__Impl rule__CommonsenseKnowledge__Group__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:878:2: rule__CommonsenseKnowledge__Group__0__Impl rule__CommonsenseKnowledge__Group__1
            {
            pushFollow(FOLLOW_rule__CommonsenseKnowledge__Group__0__Impl_in_rule__CommonsenseKnowledge__Group__01984);
            rule__CommonsenseKnowledge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonsenseKnowledge__Group__1_in_rule__CommonsenseKnowledge__Group__01987);
            rule__CommonsenseKnowledge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledge__Group__0"


    // $ANTLR start "rule__CommonsenseKnowledge__Group__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:885:1: rule__CommonsenseKnowledge__Group__0__Impl : ( () ) ;
    public final void rule__CommonsenseKnowledge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:889:1: ( ( () ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:890:1: ( () )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:890:1: ( () )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:891:1: ()
            {
             before(grammarAccess.getCommonsenseKnowledgeAccess().getCommonsenseKnowledgeAction_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:892:1: ()
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:894:1: 
            {
            }

             after(grammarAccess.getCommonsenseKnowledgeAccess().getCommonsenseKnowledgeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledge__Group__0__Impl"


    // $ANTLR start "rule__CommonsenseKnowledge__Group__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:904:1: rule__CommonsenseKnowledge__Group__1 : rule__CommonsenseKnowledge__Group__1__Impl rule__CommonsenseKnowledge__Group__2 ;
    public final void rule__CommonsenseKnowledge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:908:1: ( rule__CommonsenseKnowledge__Group__1__Impl rule__CommonsenseKnowledge__Group__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:909:2: rule__CommonsenseKnowledge__Group__1__Impl rule__CommonsenseKnowledge__Group__2
            {
            pushFollow(FOLLOW_rule__CommonsenseKnowledge__Group__1__Impl_in_rule__CommonsenseKnowledge__Group__12045);
            rule__CommonsenseKnowledge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonsenseKnowledge__Group__2_in_rule__CommonsenseKnowledge__Group__12048);
            rule__CommonsenseKnowledge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledge__Group__1"


    // $ANTLR start "rule__CommonsenseKnowledge__Group__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:916:1: rule__CommonsenseKnowledge__Group__1__Impl : ( ( rule__CommonsenseKnowledge__NameAssignment_1 ) ) ;
    public final void rule__CommonsenseKnowledge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:920:1: ( ( ( rule__CommonsenseKnowledge__NameAssignment_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:921:1: ( ( rule__CommonsenseKnowledge__NameAssignment_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:921:1: ( ( rule__CommonsenseKnowledge__NameAssignment_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:922:1: ( rule__CommonsenseKnowledge__NameAssignment_1 )
            {
             before(grammarAccess.getCommonsenseKnowledgeAccess().getNameAssignment_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:923:1: ( rule__CommonsenseKnowledge__NameAssignment_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:923:2: rule__CommonsenseKnowledge__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CommonsenseKnowledge__NameAssignment_1_in_rule__CommonsenseKnowledge__Group__1__Impl2075);
            rule__CommonsenseKnowledge__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommonsenseKnowledgeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledge__Group__1__Impl"


    // $ANTLR start "rule__CommonsenseKnowledge__Group__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:933:1: rule__CommonsenseKnowledge__Group__2 : rule__CommonsenseKnowledge__Group__2__Impl ;
    public final void rule__CommonsenseKnowledge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:937:1: ( rule__CommonsenseKnowledge__Group__2__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:938:2: rule__CommonsenseKnowledge__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CommonsenseKnowledge__Group__2__Impl_in_rule__CommonsenseKnowledge__Group__22105);
            rule__CommonsenseKnowledge__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledge__Group__2"


    // $ANTLR start "rule__CommonsenseKnowledge__Group__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:944:1: rule__CommonsenseKnowledge__Group__2__Impl : ( ( rule__CommonsenseKnowledge__BodyAssignment_2 ) ) ;
    public final void rule__CommonsenseKnowledge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:948:1: ( ( ( rule__CommonsenseKnowledge__BodyAssignment_2 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:949:1: ( ( rule__CommonsenseKnowledge__BodyAssignment_2 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:949:1: ( ( rule__CommonsenseKnowledge__BodyAssignment_2 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:950:1: ( rule__CommonsenseKnowledge__BodyAssignment_2 )
            {
             before(grammarAccess.getCommonsenseKnowledgeAccess().getBodyAssignment_2()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:951:1: ( rule__CommonsenseKnowledge__BodyAssignment_2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:951:2: rule__CommonsenseKnowledge__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__CommonsenseKnowledge__BodyAssignment_2_in_rule__CommonsenseKnowledge__Group__2__Impl2132);
            rule__CommonsenseKnowledge__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCommonsenseKnowledgeAccess().getBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledge__Group__2__Impl"


    // $ANTLR start "rule__CommonsenseKnowledgeHeader__Group__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:967:1: rule__CommonsenseKnowledgeHeader__Group__0 : rule__CommonsenseKnowledgeHeader__Group__0__Impl rule__CommonsenseKnowledgeHeader__Group__1 ;
    public final void rule__CommonsenseKnowledgeHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:971:1: ( rule__CommonsenseKnowledgeHeader__Group__0__Impl rule__CommonsenseKnowledgeHeader__Group__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:972:2: rule__CommonsenseKnowledgeHeader__Group__0__Impl rule__CommonsenseKnowledgeHeader__Group__1
            {
            pushFollow(FOLLOW_rule__CommonsenseKnowledgeHeader__Group__0__Impl_in_rule__CommonsenseKnowledgeHeader__Group__02168);
            rule__CommonsenseKnowledgeHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonsenseKnowledgeHeader__Group__1_in_rule__CommonsenseKnowledgeHeader__Group__02171);
            rule__CommonsenseKnowledgeHeader__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledgeHeader__Group__0"


    // $ANTLR start "rule__CommonsenseKnowledgeHeader__Group__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:979:1: rule__CommonsenseKnowledgeHeader__Group__0__Impl : ( 'Start' ) ;
    public final void rule__CommonsenseKnowledgeHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:983:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:984:1: ( 'Start' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:984:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:985:1: 'Start'
            {
             before(grammarAccess.getCommonsenseKnowledgeHeaderAccess().getStartKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__CommonsenseKnowledgeHeader__Group__0__Impl2199); 
             after(grammarAccess.getCommonsenseKnowledgeHeaderAccess().getStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledgeHeader__Group__0__Impl"


    // $ANTLR start "rule__CommonsenseKnowledgeHeader__Group__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:998:1: rule__CommonsenseKnowledgeHeader__Group__1 : rule__CommonsenseKnowledgeHeader__Group__1__Impl rule__CommonsenseKnowledgeHeader__Group__2 ;
    public final void rule__CommonsenseKnowledgeHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1002:1: ( rule__CommonsenseKnowledgeHeader__Group__1__Impl rule__CommonsenseKnowledgeHeader__Group__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1003:2: rule__CommonsenseKnowledgeHeader__Group__1__Impl rule__CommonsenseKnowledgeHeader__Group__2
            {
            pushFollow(FOLLOW_rule__CommonsenseKnowledgeHeader__Group__1__Impl_in_rule__CommonsenseKnowledgeHeader__Group__12230);
            rule__CommonsenseKnowledgeHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonsenseKnowledgeHeader__Group__2_in_rule__CommonsenseKnowledgeHeader__Group__12233);
            rule__CommonsenseKnowledgeHeader__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledgeHeader__Group__1"


    // $ANTLR start "rule__CommonsenseKnowledgeHeader__Group__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1010:1: rule__CommonsenseKnowledgeHeader__Group__1__Impl : ( 'commonsense' ) ;
    public final void rule__CommonsenseKnowledgeHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1014:1: ( ( 'commonsense' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1015:1: ( 'commonsense' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1015:1: ( 'commonsense' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1016:1: 'commonsense'
            {
             before(grammarAccess.getCommonsenseKnowledgeHeaderAccess().getCommonsenseKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__CommonsenseKnowledgeHeader__Group__1__Impl2261); 
             after(grammarAccess.getCommonsenseKnowledgeHeaderAccess().getCommonsenseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledgeHeader__Group__1__Impl"


    // $ANTLR start "rule__CommonsenseKnowledgeHeader__Group__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1029:1: rule__CommonsenseKnowledgeHeader__Group__2 : rule__CommonsenseKnowledgeHeader__Group__2__Impl rule__CommonsenseKnowledgeHeader__Group__3 ;
    public final void rule__CommonsenseKnowledgeHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1033:1: ( rule__CommonsenseKnowledgeHeader__Group__2__Impl rule__CommonsenseKnowledgeHeader__Group__3 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1034:2: rule__CommonsenseKnowledgeHeader__Group__2__Impl rule__CommonsenseKnowledgeHeader__Group__3
            {
            pushFollow(FOLLOW_rule__CommonsenseKnowledgeHeader__Group__2__Impl_in_rule__CommonsenseKnowledgeHeader__Group__22292);
            rule__CommonsenseKnowledgeHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommonsenseKnowledgeHeader__Group__3_in_rule__CommonsenseKnowledgeHeader__Group__22295);
            rule__CommonsenseKnowledgeHeader__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledgeHeader__Group__2"


    // $ANTLR start "rule__CommonsenseKnowledgeHeader__Group__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1041:1: rule__CommonsenseKnowledgeHeader__Group__2__Impl : ( 'knowledge' ) ;
    public final void rule__CommonsenseKnowledgeHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1045:1: ( ( 'knowledge' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1046:1: ( 'knowledge' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1046:1: ( 'knowledge' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1047:1: 'knowledge'
            {
             before(grammarAccess.getCommonsenseKnowledgeHeaderAccess().getKnowledgeKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__CommonsenseKnowledgeHeader__Group__2__Impl2323); 
             after(grammarAccess.getCommonsenseKnowledgeHeaderAccess().getKnowledgeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledgeHeader__Group__2__Impl"


    // $ANTLR start "rule__CommonsenseKnowledgeHeader__Group__3"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1060:1: rule__CommonsenseKnowledgeHeader__Group__3 : rule__CommonsenseKnowledgeHeader__Group__3__Impl ;
    public final void rule__CommonsenseKnowledgeHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1064:1: ( rule__CommonsenseKnowledgeHeader__Group__3__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1065:2: rule__CommonsenseKnowledgeHeader__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CommonsenseKnowledgeHeader__Group__3__Impl_in_rule__CommonsenseKnowledgeHeader__Group__32354);
            rule__CommonsenseKnowledgeHeader__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledgeHeader__Group__3"


    // $ANTLR start "rule__CommonsenseKnowledgeHeader__Group__3__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1071:1: rule__CommonsenseKnowledgeHeader__Group__3__Impl : ( '.' ) ;
    public final void rule__CommonsenseKnowledgeHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1075:1: ( ( '.' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1076:1: ( '.' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1076:1: ( '.' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1077:1: '.'
            {
             before(grammarAccess.getCommonsenseKnowledgeHeaderAccess().getFullStopKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__CommonsenseKnowledgeHeader__Group__3__Impl2382); 
             after(grammarAccess.getCommonsenseKnowledgeHeaderAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledgeHeader__Group__3__Impl"


    // $ANTLR start "rule__ReflexiveKnowledge__Group__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1098:1: rule__ReflexiveKnowledge__Group__0 : rule__ReflexiveKnowledge__Group__0__Impl rule__ReflexiveKnowledge__Group__1 ;
    public final void rule__ReflexiveKnowledge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1102:1: ( rule__ReflexiveKnowledge__Group__0__Impl rule__ReflexiveKnowledge__Group__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1103:2: rule__ReflexiveKnowledge__Group__0__Impl rule__ReflexiveKnowledge__Group__1
            {
            pushFollow(FOLLOW_rule__ReflexiveKnowledge__Group__0__Impl_in_rule__ReflexiveKnowledge__Group__02421);
            rule__ReflexiveKnowledge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReflexiveKnowledge__Group__1_in_rule__ReflexiveKnowledge__Group__02424);
            rule__ReflexiveKnowledge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledge__Group__0"


    // $ANTLR start "rule__ReflexiveKnowledge__Group__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1110:1: rule__ReflexiveKnowledge__Group__0__Impl : ( () ) ;
    public final void rule__ReflexiveKnowledge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1114:1: ( ( () ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1115:1: ( () )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1115:1: ( () )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1116:1: ()
            {
             before(grammarAccess.getReflexiveKnowledgeAccess().getReflexiveKnowledgeAction_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1117:1: ()
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1119:1: 
            {
            }

             after(grammarAccess.getReflexiveKnowledgeAccess().getReflexiveKnowledgeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledge__Group__0__Impl"


    // $ANTLR start "rule__ReflexiveKnowledge__Group__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1129:1: rule__ReflexiveKnowledge__Group__1 : rule__ReflexiveKnowledge__Group__1__Impl rule__ReflexiveKnowledge__Group__2 ;
    public final void rule__ReflexiveKnowledge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1133:1: ( rule__ReflexiveKnowledge__Group__1__Impl rule__ReflexiveKnowledge__Group__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1134:2: rule__ReflexiveKnowledge__Group__1__Impl rule__ReflexiveKnowledge__Group__2
            {
            pushFollow(FOLLOW_rule__ReflexiveKnowledge__Group__1__Impl_in_rule__ReflexiveKnowledge__Group__12482);
            rule__ReflexiveKnowledge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReflexiveKnowledge__Group__2_in_rule__ReflexiveKnowledge__Group__12485);
            rule__ReflexiveKnowledge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledge__Group__1"


    // $ANTLR start "rule__ReflexiveKnowledge__Group__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1141:1: rule__ReflexiveKnowledge__Group__1__Impl : ( ( rule__ReflexiveKnowledge__NameAssignment_1 ) ) ;
    public final void rule__ReflexiveKnowledge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1145:1: ( ( ( rule__ReflexiveKnowledge__NameAssignment_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1146:1: ( ( rule__ReflexiveKnowledge__NameAssignment_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1146:1: ( ( rule__ReflexiveKnowledge__NameAssignment_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1147:1: ( rule__ReflexiveKnowledge__NameAssignment_1 )
            {
             before(grammarAccess.getReflexiveKnowledgeAccess().getNameAssignment_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1148:1: ( rule__ReflexiveKnowledge__NameAssignment_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1148:2: rule__ReflexiveKnowledge__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ReflexiveKnowledge__NameAssignment_1_in_rule__ReflexiveKnowledge__Group__1__Impl2512);
            rule__ReflexiveKnowledge__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReflexiveKnowledgeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledge__Group__1__Impl"


    // $ANTLR start "rule__ReflexiveKnowledge__Group__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1158:1: rule__ReflexiveKnowledge__Group__2 : rule__ReflexiveKnowledge__Group__2__Impl ;
    public final void rule__ReflexiveKnowledge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1162:1: ( rule__ReflexiveKnowledge__Group__2__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1163:2: rule__ReflexiveKnowledge__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ReflexiveKnowledge__Group__2__Impl_in_rule__ReflexiveKnowledge__Group__22542);
            rule__ReflexiveKnowledge__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledge__Group__2"


    // $ANTLR start "rule__ReflexiveKnowledge__Group__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1169:1: rule__ReflexiveKnowledge__Group__2__Impl : ( ( rule__ReflexiveKnowledge__SubsectionsAssignment_2 )* ) ;
    public final void rule__ReflexiveKnowledge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1173:1: ( ( ( rule__ReflexiveKnowledge__SubsectionsAssignment_2 )* ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1174:1: ( ( rule__ReflexiveKnowledge__SubsectionsAssignment_2 )* )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1174:1: ( ( rule__ReflexiveKnowledge__SubsectionsAssignment_2 )* )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1175:1: ( rule__ReflexiveKnowledge__SubsectionsAssignment_2 )*
            {
             before(grammarAccess.getReflexiveKnowledgeAccess().getSubsectionsAssignment_2()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1176:1: ( rule__ReflexiveKnowledge__SubsectionsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==11) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==18) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1176:2: rule__ReflexiveKnowledge__SubsectionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ReflexiveKnowledge__SubsectionsAssignment_2_in_rule__ReflexiveKnowledge__Group__2__Impl2569);
            	    rule__ReflexiveKnowledge__SubsectionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getReflexiveKnowledgeAccess().getSubsectionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledge__Group__2__Impl"


    // $ANTLR start "rule__ReflexiveKnowledgeHeader__Group__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1192:1: rule__ReflexiveKnowledgeHeader__Group__0 : rule__ReflexiveKnowledgeHeader__Group__0__Impl rule__ReflexiveKnowledgeHeader__Group__1 ;
    public final void rule__ReflexiveKnowledgeHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1196:1: ( rule__ReflexiveKnowledgeHeader__Group__0__Impl rule__ReflexiveKnowledgeHeader__Group__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1197:2: rule__ReflexiveKnowledgeHeader__Group__0__Impl rule__ReflexiveKnowledgeHeader__Group__1
            {
            pushFollow(FOLLOW_rule__ReflexiveKnowledgeHeader__Group__0__Impl_in_rule__ReflexiveKnowledgeHeader__Group__02606);
            rule__ReflexiveKnowledgeHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReflexiveKnowledgeHeader__Group__1_in_rule__ReflexiveKnowledgeHeader__Group__02609);
            rule__ReflexiveKnowledgeHeader__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledgeHeader__Group__0"


    // $ANTLR start "rule__ReflexiveKnowledgeHeader__Group__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1204:1: rule__ReflexiveKnowledgeHeader__Group__0__Impl : ( 'Start' ) ;
    public final void rule__ReflexiveKnowledgeHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1208:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1209:1: ( 'Start' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1209:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1210:1: 'Start'
            {
             before(grammarAccess.getReflexiveKnowledgeHeaderAccess().getStartKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__ReflexiveKnowledgeHeader__Group__0__Impl2637); 
             after(grammarAccess.getReflexiveKnowledgeHeaderAccess().getStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledgeHeader__Group__0__Impl"


    // $ANTLR start "rule__ReflexiveKnowledgeHeader__Group__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1223:1: rule__ReflexiveKnowledgeHeader__Group__1 : rule__ReflexiveKnowledgeHeader__Group__1__Impl rule__ReflexiveKnowledgeHeader__Group__2 ;
    public final void rule__ReflexiveKnowledgeHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1227:1: ( rule__ReflexiveKnowledgeHeader__Group__1__Impl rule__ReflexiveKnowledgeHeader__Group__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1228:2: rule__ReflexiveKnowledgeHeader__Group__1__Impl rule__ReflexiveKnowledgeHeader__Group__2
            {
            pushFollow(FOLLOW_rule__ReflexiveKnowledgeHeader__Group__1__Impl_in_rule__ReflexiveKnowledgeHeader__Group__12668);
            rule__ReflexiveKnowledgeHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReflexiveKnowledgeHeader__Group__2_in_rule__ReflexiveKnowledgeHeader__Group__12671);
            rule__ReflexiveKnowledgeHeader__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledgeHeader__Group__1"


    // $ANTLR start "rule__ReflexiveKnowledgeHeader__Group__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1235:1: rule__ReflexiveKnowledgeHeader__Group__1__Impl : ( 'reflexive' ) ;
    public final void rule__ReflexiveKnowledgeHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1239:1: ( ( 'reflexive' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1240:1: ( 'reflexive' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1240:1: ( 'reflexive' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1241:1: 'reflexive'
            {
             before(grammarAccess.getReflexiveKnowledgeHeaderAccess().getReflexiveKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__ReflexiveKnowledgeHeader__Group__1__Impl2699); 
             after(grammarAccess.getReflexiveKnowledgeHeaderAccess().getReflexiveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledgeHeader__Group__1__Impl"


    // $ANTLR start "rule__ReflexiveKnowledgeHeader__Group__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1254:1: rule__ReflexiveKnowledgeHeader__Group__2 : rule__ReflexiveKnowledgeHeader__Group__2__Impl rule__ReflexiveKnowledgeHeader__Group__3 ;
    public final void rule__ReflexiveKnowledgeHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1258:1: ( rule__ReflexiveKnowledgeHeader__Group__2__Impl rule__ReflexiveKnowledgeHeader__Group__3 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1259:2: rule__ReflexiveKnowledgeHeader__Group__2__Impl rule__ReflexiveKnowledgeHeader__Group__3
            {
            pushFollow(FOLLOW_rule__ReflexiveKnowledgeHeader__Group__2__Impl_in_rule__ReflexiveKnowledgeHeader__Group__22730);
            rule__ReflexiveKnowledgeHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReflexiveKnowledgeHeader__Group__3_in_rule__ReflexiveKnowledgeHeader__Group__22733);
            rule__ReflexiveKnowledgeHeader__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledgeHeader__Group__2"


    // $ANTLR start "rule__ReflexiveKnowledgeHeader__Group__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1266:1: rule__ReflexiveKnowledgeHeader__Group__2__Impl : ( 'knowledge' ) ;
    public final void rule__ReflexiveKnowledgeHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1270:1: ( ( 'knowledge' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1271:1: ( 'knowledge' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1271:1: ( 'knowledge' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1272:1: 'knowledge'
            {
             before(grammarAccess.getReflexiveKnowledgeHeaderAccess().getKnowledgeKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__ReflexiveKnowledgeHeader__Group__2__Impl2761); 
             after(grammarAccess.getReflexiveKnowledgeHeaderAccess().getKnowledgeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledgeHeader__Group__2__Impl"


    // $ANTLR start "rule__ReflexiveKnowledgeHeader__Group__3"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1285:1: rule__ReflexiveKnowledgeHeader__Group__3 : rule__ReflexiveKnowledgeHeader__Group__3__Impl ;
    public final void rule__ReflexiveKnowledgeHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1289:1: ( rule__ReflexiveKnowledgeHeader__Group__3__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1290:2: rule__ReflexiveKnowledgeHeader__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ReflexiveKnowledgeHeader__Group__3__Impl_in_rule__ReflexiveKnowledgeHeader__Group__32792);
            rule__ReflexiveKnowledgeHeader__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledgeHeader__Group__3"


    // $ANTLR start "rule__ReflexiveKnowledgeHeader__Group__3__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1296:1: rule__ReflexiveKnowledgeHeader__Group__3__Impl : ( '.' ) ;
    public final void rule__ReflexiveKnowledgeHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1300:1: ( ( '.' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1301:1: ( '.' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1301:1: ( '.' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1302:1: '.'
            {
             before(grammarAccess.getReflexiveKnowledgeHeaderAccess().getFullStopKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__ReflexiveKnowledgeHeader__Group__3__Impl2820); 
             after(grammarAccess.getReflexiveKnowledgeHeaderAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledgeHeader__Group__3__Impl"


    // $ANTLR start "rule__ReflexiveDescription__Group__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1323:1: rule__ReflexiveDescription__Group__0 : rule__ReflexiveDescription__Group__0__Impl rule__ReflexiveDescription__Group__1 ;
    public final void rule__ReflexiveDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1327:1: ( rule__ReflexiveDescription__Group__0__Impl rule__ReflexiveDescription__Group__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1328:2: rule__ReflexiveDescription__Group__0__Impl rule__ReflexiveDescription__Group__1
            {
            pushFollow(FOLLOW_rule__ReflexiveDescription__Group__0__Impl_in_rule__ReflexiveDescription__Group__02859);
            rule__ReflexiveDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReflexiveDescription__Group__1_in_rule__ReflexiveDescription__Group__02862);
            rule__ReflexiveDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescription__Group__0"


    // $ANTLR start "rule__ReflexiveDescription__Group__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1335:1: rule__ReflexiveDescription__Group__0__Impl : ( () ) ;
    public final void rule__ReflexiveDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1339:1: ( ( () ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1340:1: ( () )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1340:1: ( () )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1341:1: ()
            {
             before(grammarAccess.getReflexiveDescriptionAccess().getReflexiveDescriptionAction_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1342:1: ()
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1344:1: 
            {
            }

             after(grammarAccess.getReflexiveDescriptionAccess().getReflexiveDescriptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescription__Group__0__Impl"


    // $ANTLR start "rule__ReflexiveDescription__Group__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1354:1: rule__ReflexiveDescription__Group__1 : rule__ReflexiveDescription__Group__1__Impl rule__ReflexiveDescription__Group__2 ;
    public final void rule__ReflexiveDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1358:1: ( rule__ReflexiveDescription__Group__1__Impl rule__ReflexiveDescription__Group__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1359:2: rule__ReflexiveDescription__Group__1__Impl rule__ReflexiveDescription__Group__2
            {
            pushFollow(FOLLOW_rule__ReflexiveDescription__Group__1__Impl_in_rule__ReflexiveDescription__Group__12920);
            rule__ReflexiveDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReflexiveDescription__Group__2_in_rule__ReflexiveDescription__Group__12923);
            rule__ReflexiveDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescription__Group__1"


    // $ANTLR start "rule__ReflexiveDescription__Group__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1366:1: rule__ReflexiveDescription__Group__1__Impl : ( ( rule__ReflexiveDescription__NameAssignment_1 ) ) ;
    public final void rule__ReflexiveDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1370:1: ( ( ( rule__ReflexiveDescription__NameAssignment_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1371:1: ( ( rule__ReflexiveDescription__NameAssignment_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1371:1: ( ( rule__ReflexiveDescription__NameAssignment_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1372:1: ( rule__ReflexiveDescription__NameAssignment_1 )
            {
             before(grammarAccess.getReflexiveDescriptionAccess().getNameAssignment_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1373:1: ( rule__ReflexiveDescription__NameAssignment_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1373:2: rule__ReflexiveDescription__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ReflexiveDescription__NameAssignment_1_in_rule__ReflexiveDescription__Group__1__Impl2950);
            rule__ReflexiveDescription__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReflexiveDescriptionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescription__Group__1__Impl"


    // $ANTLR start "rule__ReflexiveDescription__Group__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1383:1: rule__ReflexiveDescription__Group__2 : rule__ReflexiveDescription__Group__2__Impl rule__ReflexiveDescription__Group__3 ;
    public final void rule__ReflexiveDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1387:1: ( rule__ReflexiveDescription__Group__2__Impl rule__ReflexiveDescription__Group__3 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1388:2: rule__ReflexiveDescription__Group__2__Impl rule__ReflexiveDescription__Group__3
            {
            pushFollow(FOLLOW_rule__ReflexiveDescription__Group__2__Impl_in_rule__ReflexiveDescription__Group__22980);
            rule__ReflexiveDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReflexiveDescription__Group__3_in_rule__ReflexiveDescription__Group__22983);
            rule__ReflexiveDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescription__Group__2"


    // $ANTLR start "rule__ReflexiveDescription__Group__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1395:1: rule__ReflexiveDescription__Group__2__Impl : ( ( rule__ReflexiveDescription__BodyAssignment_2 ) ) ;
    public final void rule__ReflexiveDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1399:1: ( ( ( rule__ReflexiveDescription__BodyAssignment_2 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1400:1: ( ( rule__ReflexiveDescription__BodyAssignment_2 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1400:1: ( ( rule__ReflexiveDescription__BodyAssignment_2 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1401:1: ( rule__ReflexiveDescription__BodyAssignment_2 )
            {
             before(grammarAccess.getReflexiveDescriptionAccess().getBodyAssignment_2()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1402:1: ( rule__ReflexiveDescription__BodyAssignment_2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1402:2: rule__ReflexiveDescription__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__ReflexiveDescription__BodyAssignment_2_in_rule__ReflexiveDescription__Group__2__Impl3010);
            rule__ReflexiveDescription__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReflexiveDescriptionAccess().getBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescription__Group__2__Impl"


    // $ANTLR start "rule__ReflexiveDescription__Group__3"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1412:1: rule__ReflexiveDescription__Group__3 : rule__ReflexiveDescription__Group__3__Impl ;
    public final void rule__ReflexiveDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1416:1: ( rule__ReflexiveDescription__Group__3__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1417:2: rule__ReflexiveDescription__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ReflexiveDescription__Group__3__Impl_in_rule__ReflexiveDescription__Group__33040);
            rule__ReflexiveDescription__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescription__Group__3"


    // $ANTLR start "rule__ReflexiveDescription__Group__3__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1423:1: rule__ReflexiveDescription__Group__3__Impl : ( ruleTheEndFooter ) ;
    public final void rule__ReflexiveDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1427:1: ( ( ruleTheEndFooter ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1428:1: ( ruleTheEndFooter )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1428:1: ( ruleTheEndFooter )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1429:1: ruleTheEndFooter
            {
             before(grammarAccess.getReflexiveDescriptionAccess().getTheEndFooterParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleTheEndFooter_in_rule__ReflexiveDescription__Group__3__Impl3067);
            ruleTheEndFooter();

            state._fsp--;

             after(grammarAccess.getReflexiveDescriptionAccess().getTheEndFooterParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescription__Group__3__Impl"


    // $ANTLR start "rule__TheEndFooter__Group__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1448:1: rule__TheEndFooter__Group__0 : rule__TheEndFooter__Group__0__Impl rule__TheEndFooter__Group__1 ;
    public final void rule__TheEndFooter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1452:1: ( rule__TheEndFooter__Group__0__Impl rule__TheEndFooter__Group__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1453:2: rule__TheEndFooter__Group__0__Impl rule__TheEndFooter__Group__1
            {
            pushFollow(FOLLOW_rule__TheEndFooter__Group__0__Impl_in_rule__TheEndFooter__Group__03104);
            rule__TheEndFooter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TheEndFooter__Group__1_in_rule__TheEndFooter__Group__03107);
            rule__TheEndFooter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheEndFooter__Group__0"


    // $ANTLR start "rule__TheEndFooter__Group__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1460:1: rule__TheEndFooter__Group__0__Impl : ( 'The' ) ;
    public final void rule__TheEndFooter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1464:1: ( ( 'The' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1465:1: ( 'The' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1465:1: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1466:1: 'The'
            {
             before(grammarAccess.getTheEndFooterAccess().getTheKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__TheEndFooter__Group__0__Impl3135); 
             after(grammarAccess.getTheEndFooterAccess().getTheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheEndFooter__Group__0__Impl"


    // $ANTLR start "rule__TheEndFooter__Group__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1479:1: rule__TheEndFooter__Group__1 : rule__TheEndFooter__Group__1__Impl rule__TheEndFooter__Group__2 ;
    public final void rule__TheEndFooter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1483:1: ( rule__TheEndFooter__Group__1__Impl rule__TheEndFooter__Group__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1484:2: rule__TheEndFooter__Group__1__Impl rule__TheEndFooter__Group__2
            {
            pushFollow(FOLLOW_rule__TheEndFooter__Group__1__Impl_in_rule__TheEndFooter__Group__13166);
            rule__TheEndFooter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TheEndFooter__Group__2_in_rule__TheEndFooter__Group__13169);
            rule__TheEndFooter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheEndFooter__Group__1"


    // $ANTLR start "rule__TheEndFooter__Group__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1491:1: rule__TheEndFooter__Group__1__Impl : ( 'end' ) ;
    public final void rule__TheEndFooter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1495:1: ( ( 'end' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1496:1: ( 'end' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1496:1: ( 'end' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1497:1: 'end'
            {
             before(grammarAccess.getTheEndFooterAccess().getEndKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__TheEndFooter__Group__1__Impl3197); 
             after(grammarAccess.getTheEndFooterAccess().getEndKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheEndFooter__Group__1__Impl"


    // $ANTLR start "rule__TheEndFooter__Group__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1510:1: rule__TheEndFooter__Group__2 : rule__TheEndFooter__Group__2__Impl ;
    public final void rule__TheEndFooter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1514:1: ( rule__TheEndFooter__Group__2__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1515:2: rule__TheEndFooter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TheEndFooter__Group__2__Impl_in_rule__TheEndFooter__Group__23228);
            rule__TheEndFooter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheEndFooter__Group__2"


    // $ANTLR start "rule__TheEndFooter__Group__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1521:1: rule__TheEndFooter__Group__2__Impl : ( '.' ) ;
    public final void rule__TheEndFooter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1525:1: ( ( '.' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1526:1: ( '.' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1526:1: ( '.' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1527:1: '.'
            {
             before(grammarAccess.getTheEndFooterAccess().getFullStopKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__TheEndFooter__Group__2__Impl3256); 
             after(grammarAccess.getTheEndFooterAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheEndFooter__Group__2__Impl"


    // $ANTLR start "rule__ReflexiveDescriptionHeader__Group__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1546:1: rule__ReflexiveDescriptionHeader__Group__0 : rule__ReflexiveDescriptionHeader__Group__0__Impl rule__ReflexiveDescriptionHeader__Group__1 ;
    public final void rule__ReflexiveDescriptionHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1550:1: ( rule__ReflexiveDescriptionHeader__Group__0__Impl rule__ReflexiveDescriptionHeader__Group__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1551:2: rule__ReflexiveDescriptionHeader__Group__0__Impl rule__ReflexiveDescriptionHeader__Group__1
            {
            pushFollow(FOLLOW_rule__ReflexiveDescriptionHeader__Group__0__Impl_in_rule__ReflexiveDescriptionHeader__Group__03293);
            rule__ReflexiveDescriptionHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReflexiveDescriptionHeader__Group__1_in_rule__ReflexiveDescriptionHeader__Group__03296);
            rule__ReflexiveDescriptionHeader__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescriptionHeader__Group__0"


    // $ANTLR start "rule__ReflexiveDescriptionHeader__Group__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1558:1: rule__ReflexiveDescriptionHeader__Group__0__Impl : ( 'Start' ) ;
    public final void rule__ReflexiveDescriptionHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1562:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1563:1: ( 'Start' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1563:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1564:1: 'Start'
            {
             before(grammarAccess.getReflexiveDescriptionHeaderAccess().getStartKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__ReflexiveDescriptionHeader__Group__0__Impl3324); 
             after(grammarAccess.getReflexiveDescriptionHeaderAccess().getStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescriptionHeader__Group__0__Impl"


    // $ANTLR start "rule__ReflexiveDescriptionHeader__Group__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1577:1: rule__ReflexiveDescriptionHeader__Group__1 : rule__ReflexiveDescriptionHeader__Group__1__Impl rule__ReflexiveDescriptionHeader__Group__2 ;
    public final void rule__ReflexiveDescriptionHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1581:1: ( rule__ReflexiveDescriptionHeader__Group__1__Impl rule__ReflexiveDescriptionHeader__Group__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1582:2: rule__ReflexiveDescriptionHeader__Group__1__Impl rule__ReflexiveDescriptionHeader__Group__2
            {
            pushFollow(FOLLOW_rule__ReflexiveDescriptionHeader__Group__1__Impl_in_rule__ReflexiveDescriptionHeader__Group__13355);
            rule__ReflexiveDescriptionHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReflexiveDescriptionHeader__Group__2_in_rule__ReflexiveDescriptionHeader__Group__13358);
            rule__ReflexiveDescriptionHeader__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescriptionHeader__Group__1"


    // $ANTLR start "rule__ReflexiveDescriptionHeader__Group__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1589:1: rule__ReflexiveDescriptionHeader__Group__1__Impl : ( 'description' ) ;
    public final void rule__ReflexiveDescriptionHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1593:1: ( ( 'description' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1594:1: ( 'description' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1594:1: ( 'description' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1595:1: 'description'
            {
             before(grammarAccess.getReflexiveDescriptionHeaderAccess().getDescriptionKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__ReflexiveDescriptionHeader__Group__1__Impl3386); 
             after(grammarAccess.getReflexiveDescriptionHeaderAccess().getDescriptionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescriptionHeader__Group__1__Impl"


    // $ANTLR start "rule__ReflexiveDescriptionHeader__Group__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1608:1: rule__ReflexiveDescriptionHeader__Group__2 : rule__ReflexiveDescriptionHeader__Group__2__Impl rule__ReflexiveDescriptionHeader__Group__3 ;
    public final void rule__ReflexiveDescriptionHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1612:1: ( rule__ReflexiveDescriptionHeader__Group__2__Impl rule__ReflexiveDescriptionHeader__Group__3 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1613:2: rule__ReflexiveDescriptionHeader__Group__2__Impl rule__ReflexiveDescriptionHeader__Group__3
            {
            pushFollow(FOLLOW_rule__ReflexiveDescriptionHeader__Group__2__Impl_in_rule__ReflexiveDescriptionHeader__Group__23417);
            rule__ReflexiveDescriptionHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReflexiveDescriptionHeader__Group__3_in_rule__ReflexiveDescriptionHeader__Group__23420);
            rule__ReflexiveDescriptionHeader__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescriptionHeader__Group__2"


    // $ANTLR start "rule__ReflexiveDescriptionHeader__Group__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1620:1: rule__ReflexiveDescriptionHeader__Group__2__Impl : ( 'of' ) ;
    public final void rule__ReflexiveDescriptionHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1624:1: ( ( 'of' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1625:1: ( 'of' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1625:1: ( 'of' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1626:1: 'of'
            {
             before(grammarAccess.getReflexiveDescriptionHeaderAccess().getOfKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__ReflexiveDescriptionHeader__Group__2__Impl3448); 
             after(grammarAccess.getReflexiveDescriptionHeaderAccess().getOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescriptionHeader__Group__2__Impl"


    // $ANTLR start "rule__ReflexiveDescriptionHeader__Group__3"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1639:1: rule__ReflexiveDescriptionHeader__Group__3 : rule__ReflexiveDescriptionHeader__Group__3__Impl rule__ReflexiveDescriptionHeader__Group__4 ;
    public final void rule__ReflexiveDescriptionHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1643:1: ( rule__ReflexiveDescriptionHeader__Group__3__Impl rule__ReflexiveDescriptionHeader__Group__4 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1644:2: rule__ReflexiveDescriptionHeader__Group__3__Impl rule__ReflexiveDescriptionHeader__Group__4
            {
            pushFollow(FOLLOW_rule__ReflexiveDescriptionHeader__Group__3__Impl_in_rule__ReflexiveDescriptionHeader__Group__33479);
            rule__ReflexiveDescriptionHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReflexiveDescriptionHeader__Group__4_in_rule__ReflexiveDescriptionHeader__Group__33482);
            rule__ReflexiveDescriptionHeader__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescriptionHeader__Group__3"


    // $ANTLR start "rule__ReflexiveDescriptionHeader__Group__3__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1651:1: rule__ReflexiveDescriptionHeader__Group__3__Impl : ( RULE_QUOTED_TEXT ) ;
    public final void rule__ReflexiveDescriptionHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1655:1: ( ( RULE_QUOTED_TEXT ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1656:1: ( RULE_QUOTED_TEXT )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1656:1: ( RULE_QUOTED_TEXT )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1657:1: RULE_QUOTED_TEXT
            {
             before(grammarAccess.getReflexiveDescriptionHeaderAccess().getQUOTED_TEXTTerminalRuleCall_3()); 
            match(input,RULE_QUOTED_TEXT,FOLLOW_RULE_QUOTED_TEXT_in_rule__ReflexiveDescriptionHeader__Group__3__Impl3509); 
             after(grammarAccess.getReflexiveDescriptionHeaderAccess().getQUOTED_TEXTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescriptionHeader__Group__3__Impl"


    // $ANTLR start "rule__ReflexiveDescriptionHeader__Group__4"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1668:1: rule__ReflexiveDescriptionHeader__Group__4 : rule__ReflexiveDescriptionHeader__Group__4__Impl ;
    public final void rule__ReflexiveDescriptionHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1672:1: ( rule__ReflexiveDescriptionHeader__Group__4__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1673:2: rule__ReflexiveDescriptionHeader__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ReflexiveDescriptionHeader__Group__4__Impl_in_rule__ReflexiveDescriptionHeader__Group__43538);
            rule__ReflexiveDescriptionHeader__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescriptionHeader__Group__4"


    // $ANTLR start "rule__ReflexiveDescriptionHeader__Group__4__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1679:1: rule__ReflexiveDescriptionHeader__Group__4__Impl : ( '.' ) ;
    public final void rule__ReflexiveDescriptionHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1683:1: ( ( '.' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1684:1: ( '.' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1684:1: ( '.' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1685:1: '.'
            {
             before(grammarAccess.getReflexiveDescriptionHeaderAccess().getFullStopKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__ReflexiveDescriptionHeader__Group__4__Impl3566); 
             after(grammarAccess.getReflexiveDescriptionHeaderAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescriptionHeader__Group__4__Impl"


    // $ANTLR start "rule__Perspective__Group__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1708:1: rule__Perspective__Group__0 : rule__Perspective__Group__0__Impl rule__Perspective__Group__1 ;
    public final void rule__Perspective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1712:1: ( rule__Perspective__Group__0__Impl rule__Perspective__Group__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1713:2: rule__Perspective__Group__0__Impl rule__Perspective__Group__1
            {
            pushFollow(FOLLOW_rule__Perspective__Group__0__Impl_in_rule__Perspective__Group__03607);
            rule__Perspective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Perspective__Group__1_in_rule__Perspective__Group__03610);
            rule__Perspective__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__0"


    // $ANTLR start "rule__Perspective__Group__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1720:1: rule__Perspective__Group__0__Impl : ( () ) ;
    public final void rule__Perspective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1724:1: ( ( () ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1725:1: ( () )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1725:1: ( () )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1726:1: ()
            {
             before(grammarAccess.getPerspectiveAccess().getPerspectiveAction_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1727:1: ()
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1729:1: 
            {
            }

             after(grammarAccess.getPerspectiveAccess().getPerspectiveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__0__Impl"


    // $ANTLR start "rule__Perspective__Group__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1739:1: rule__Perspective__Group__1 : rule__Perspective__Group__1__Impl rule__Perspective__Group__2 ;
    public final void rule__Perspective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1743:1: ( rule__Perspective__Group__1__Impl rule__Perspective__Group__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1744:2: rule__Perspective__Group__1__Impl rule__Perspective__Group__2
            {
            pushFollow(FOLLOW_rule__Perspective__Group__1__Impl_in_rule__Perspective__Group__13668);
            rule__Perspective__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Perspective__Group__2_in_rule__Perspective__Group__13671);
            rule__Perspective__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__1"


    // $ANTLR start "rule__Perspective__Group__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1751:1: rule__Perspective__Group__1__Impl : ( ( rule__Perspective__NameAssignment_1 ) ) ;
    public final void rule__Perspective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1755:1: ( ( ( rule__Perspective__NameAssignment_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1756:1: ( ( rule__Perspective__NameAssignment_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1756:1: ( ( rule__Perspective__NameAssignment_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1757:1: ( rule__Perspective__NameAssignment_1 )
            {
             before(grammarAccess.getPerspectiveAccess().getNameAssignment_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1758:1: ( rule__Perspective__NameAssignment_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1758:2: rule__Perspective__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Perspective__NameAssignment_1_in_rule__Perspective__Group__1__Impl3698);
            rule__Perspective__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__1__Impl"


    // $ANTLR start "rule__Perspective__Group__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1768:1: rule__Perspective__Group__2 : rule__Perspective__Group__2__Impl ;
    public final void rule__Perspective__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1772:1: ( rule__Perspective__Group__2__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1773:2: rule__Perspective__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Perspective__Group__2__Impl_in_rule__Perspective__Group__23728);
            rule__Perspective__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__2"


    // $ANTLR start "rule__Perspective__Group__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1779:1: rule__Perspective__Group__2__Impl : ( ( rule__Perspective__SubsectionsAssignment_2 )* ) ;
    public final void rule__Perspective__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1783:1: ( ( ( rule__Perspective__SubsectionsAssignment_2 )* ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1784:1: ( ( rule__Perspective__SubsectionsAssignment_2 )* )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1784:1: ( ( rule__Perspective__SubsectionsAssignment_2 )* )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1785:1: ( rule__Perspective__SubsectionsAssignment_2 )*
            {
             before(grammarAccess.getPerspectiveAccess().getSubsectionsAssignment_2()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1786:1: ( rule__Perspective__SubsectionsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==11) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==21) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1786:2: rule__Perspective__SubsectionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Perspective__SubsectionsAssignment_2_in_rule__Perspective__Group__2__Impl3755);
            	    rule__Perspective__SubsectionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPerspectiveAccess().getSubsectionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__2__Impl"


    // $ANTLR start "rule__PerspectiveHeader__Group__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1802:1: rule__PerspectiveHeader__Group__0 : rule__PerspectiveHeader__Group__0__Impl rule__PerspectiveHeader__Group__1 ;
    public final void rule__PerspectiveHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1806:1: ( rule__PerspectiveHeader__Group__0__Impl rule__PerspectiveHeader__Group__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1807:2: rule__PerspectiveHeader__Group__0__Impl rule__PerspectiveHeader__Group__1
            {
            pushFollow(FOLLOW_rule__PerspectiveHeader__Group__0__Impl_in_rule__PerspectiveHeader__Group__03792);
            rule__PerspectiveHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PerspectiveHeader__Group__1_in_rule__PerspectiveHeader__Group__03795);
            rule__PerspectiveHeader__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerspectiveHeader__Group__0"


    // $ANTLR start "rule__PerspectiveHeader__Group__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1814:1: rule__PerspectiveHeader__Group__0__Impl : ( RULE_WORD ) ;
    public final void rule__PerspectiveHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1818:1: ( ( RULE_WORD ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1819:1: ( RULE_WORD )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1819:1: ( RULE_WORD )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1820:1: RULE_WORD
            {
             before(grammarAccess.getPerspectiveHeaderAccess().getWORDTerminalRuleCall_0()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__PerspectiveHeader__Group__0__Impl3822); 
             after(grammarAccess.getPerspectiveHeaderAccess().getWORDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerspectiveHeader__Group__0__Impl"


    // $ANTLR start "rule__PerspectiveHeader__Group__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1831:1: rule__PerspectiveHeader__Group__1 : rule__PerspectiveHeader__Group__1__Impl rule__PerspectiveHeader__Group__2 ;
    public final void rule__PerspectiveHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1835:1: ( rule__PerspectiveHeader__Group__1__Impl rule__PerspectiveHeader__Group__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1836:2: rule__PerspectiveHeader__Group__1__Impl rule__PerspectiveHeader__Group__2
            {
            pushFollow(FOLLOW_rule__PerspectiveHeader__Group__1__Impl_in_rule__PerspectiveHeader__Group__13851);
            rule__PerspectiveHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PerspectiveHeader__Group__2_in_rule__PerspectiveHeader__Group__13854);
            rule__PerspectiveHeader__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerspectiveHeader__Group__1"


    // $ANTLR start "rule__PerspectiveHeader__Group__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1843:1: rule__PerspectiveHeader__Group__1__Impl : ( 'perspective' ) ;
    public final void rule__PerspectiveHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1847:1: ( ( 'perspective' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1848:1: ( 'perspective' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1848:1: ( 'perspective' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1849:1: 'perspective'
            {
             before(grammarAccess.getPerspectiveHeaderAccess().getPerspectiveKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__PerspectiveHeader__Group__1__Impl3882); 
             after(grammarAccess.getPerspectiveHeaderAccess().getPerspectiveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerspectiveHeader__Group__1__Impl"


    // $ANTLR start "rule__PerspectiveHeader__Group__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1862:1: rule__PerspectiveHeader__Group__2 : rule__PerspectiveHeader__Group__2__Impl ;
    public final void rule__PerspectiveHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1866:1: ( rule__PerspectiveHeader__Group__2__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1867:2: rule__PerspectiveHeader__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PerspectiveHeader__Group__2__Impl_in_rule__PerspectiveHeader__Group__23913);
            rule__PerspectiveHeader__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerspectiveHeader__Group__2"


    // $ANTLR start "rule__PerspectiveHeader__Group__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1873:1: rule__PerspectiveHeader__Group__2__Impl : ( '.' ) ;
    public final void rule__PerspectiveHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1877:1: ( ( '.' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1878:1: ( '.' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1878:1: ( '.' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1879:1: '.'
            {
             before(grammarAccess.getPerspectiveHeaderAccess().getFullStopKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__PerspectiveHeader__Group__2__Impl3941); 
             after(grammarAccess.getPerspectiveHeaderAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerspectiveHeader__Group__2__Impl"


    // $ANTLR start "rule__Story__Group__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1898:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1902:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1903:2: rule__Story__Group__0__Impl rule__Story__Group__1
            {
            pushFollow(FOLLOW_rule__Story__Group__0__Impl_in_rule__Story__Group__03978);
            rule__Story__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Story__Group__1_in_rule__Story__Group__03981);
            rule__Story__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__0"


    // $ANTLR start "rule__Story__Group__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1910:1: rule__Story__Group__0__Impl : ( () ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1914:1: ( ( () ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1915:1: ( () )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1915:1: ( () )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1916:1: ()
            {
             before(grammarAccess.getStoryAccess().getStoryAction_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1917:1: ()
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1919:1: 
            {
            }

             after(grammarAccess.getStoryAccess().getStoryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__0__Impl"


    // $ANTLR start "rule__Story__Group__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1929:1: rule__Story__Group__1 : rule__Story__Group__1__Impl rule__Story__Group__2 ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1933:1: ( rule__Story__Group__1__Impl rule__Story__Group__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1934:2: rule__Story__Group__1__Impl rule__Story__Group__2
            {
            pushFollow(FOLLOW_rule__Story__Group__1__Impl_in_rule__Story__Group__14039);
            rule__Story__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Story__Group__2_in_rule__Story__Group__14042);
            rule__Story__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__1"


    // $ANTLR start "rule__Story__Group__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1941:1: rule__Story__Group__1__Impl : ( ( rule__Story__NameAssignment_1 ) ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1945:1: ( ( ( rule__Story__NameAssignment_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1946:1: ( ( rule__Story__NameAssignment_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1946:1: ( ( rule__Story__NameAssignment_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1947:1: ( rule__Story__NameAssignment_1 )
            {
             before(grammarAccess.getStoryAccess().getNameAssignment_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1948:1: ( rule__Story__NameAssignment_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1948:2: rule__Story__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Story__NameAssignment_1_in_rule__Story__Group__1__Impl4069);
            rule__Story__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__1__Impl"


    // $ANTLR start "rule__Story__Group__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1958:1: rule__Story__Group__2 : rule__Story__Group__2__Impl rule__Story__Group__3 ;
    public final void rule__Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1962:1: ( rule__Story__Group__2__Impl rule__Story__Group__3 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1963:2: rule__Story__Group__2__Impl rule__Story__Group__3
            {
            pushFollow(FOLLOW_rule__Story__Group__2__Impl_in_rule__Story__Group__24099);
            rule__Story__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Story__Group__3_in_rule__Story__Group__24102);
            rule__Story__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__2"


    // $ANTLR start "rule__Story__Group__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1970:1: rule__Story__Group__2__Impl : ( ( rule__Story__BodyAssignment_2 ) ) ;
    public final void rule__Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1974:1: ( ( ( rule__Story__BodyAssignment_2 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1975:1: ( ( rule__Story__BodyAssignment_2 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1975:1: ( ( rule__Story__BodyAssignment_2 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1976:1: ( rule__Story__BodyAssignment_2 )
            {
             before(grammarAccess.getStoryAccess().getBodyAssignment_2()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1977:1: ( rule__Story__BodyAssignment_2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1977:2: rule__Story__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__Story__BodyAssignment_2_in_rule__Story__Group__2__Impl4129);
            rule__Story__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__2__Impl"


    // $ANTLR start "rule__Story__Group__3"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1987:1: rule__Story__Group__3 : rule__Story__Group__3__Impl ;
    public final void rule__Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1991:1: ( rule__Story__Group__3__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1992:2: rule__Story__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Story__Group__3__Impl_in_rule__Story__Group__34159);
            rule__Story__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__3"


    // $ANTLR start "rule__Story__Group__3__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1998:1: rule__Story__Group__3__Impl : ( ruleTheEndFooter ) ;
    public final void rule__Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2002:1: ( ( ruleTheEndFooter ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2003:1: ( ruleTheEndFooter )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2003:1: ( ruleTheEndFooter )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2004:1: ruleTheEndFooter
            {
             before(grammarAccess.getStoryAccess().getTheEndFooterParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleTheEndFooter_in_rule__Story__Group__3__Impl4186);
            ruleTheEndFooter();

            state._fsp--;

             after(grammarAccess.getStoryAccess().getTheEndFooterParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__3__Impl"


    // $ANTLR start "rule__StoryHeader__Group__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2023:1: rule__StoryHeader__Group__0 : rule__StoryHeader__Group__0__Impl rule__StoryHeader__Group__1 ;
    public final void rule__StoryHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2027:1: ( rule__StoryHeader__Group__0__Impl rule__StoryHeader__Group__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2028:2: rule__StoryHeader__Group__0__Impl rule__StoryHeader__Group__1
            {
            pushFollow(FOLLOW_rule__StoryHeader__Group__0__Impl_in_rule__StoryHeader__Group__04223);
            rule__StoryHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StoryHeader__Group__1_in_rule__StoryHeader__Group__04226);
            rule__StoryHeader__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoryHeader__Group__0"


    // $ANTLR start "rule__StoryHeader__Group__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2035:1: rule__StoryHeader__Group__0__Impl : ( 'Start' ) ;
    public final void rule__StoryHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2039:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2040:1: ( 'Start' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2040:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2041:1: 'Start'
            {
             before(grammarAccess.getStoryHeaderAccess().getStartKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__StoryHeader__Group__0__Impl4254); 
             after(grammarAccess.getStoryHeaderAccess().getStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoryHeader__Group__0__Impl"


    // $ANTLR start "rule__StoryHeader__Group__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2054:1: rule__StoryHeader__Group__1 : rule__StoryHeader__Group__1__Impl rule__StoryHeader__Group__2 ;
    public final void rule__StoryHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2058:1: ( rule__StoryHeader__Group__1__Impl rule__StoryHeader__Group__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2059:2: rule__StoryHeader__Group__1__Impl rule__StoryHeader__Group__2
            {
            pushFollow(FOLLOW_rule__StoryHeader__Group__1__Impl_in_rule__StoryHeader__Group__14285);
            rule__StoryHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StoryHeader__Group__2_in_rule__StoryHeader__Group__14288);
            rule__StoryHeader__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoryHeader__Group__1"


    // $ANTLR start "rule__StoryHeader__Group__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2066:1: rule__StoryHeader__Group__1__Impl : ( 'story' ) ;
    public final void rule__StoryHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2070:1: ( ( 'story' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2071:1: ( 'story' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2071:1: ( 'story' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2072:1: 'story'
            {
             before(grammarAccess.getStoryHeaderAccess().getStoryKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__StoryHeader__Group__1__Impl4316); 
             after(grammarAccess.getStoryHeaderAccess().getStoryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoryHeader__Group__1__Impl"


    // $ANTLR start "rule__StoryHeader__Group__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2085:1: rule__StoryHeader__Group__2 : rule__StoryHeader__Group__2__Impl rule__StoryHeader__Group__3 ;
    public final void rule__StoryHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2089:1: ( rule__StoryHeader__Group__2__Impl rule__StoryHeader__Group__3 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2090:2: rule__StoryHeader__Group__2__Impl rule__StoryHeader__Group__3
            {
            pushFollow(FOLLOW_rule__StoryHeader__Group__2__Impl_in_rule__StoryHeader__Group__24347);
            rule__StoryHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StoryHeader__Group__3_in_rule__StoryHeader__Group__24350);
            rule__StoryHeader__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoryHeader__Group__2"


    // $ANTLR start "rule__StoryHeader__Group__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2097:1: rule__StoryHeader__Group__2__Impl : ( 'titled' ) ;
    public final void rule__StoryHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2101:1: ( ( 'titled' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2102:1: ( 'titled' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2102:1: ( 'titled' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2103:1: 'titled'
            {
             before(grammarAccess.getStoryHeaderAccess().getTitledKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__StoryHeader__Group__2__Impl4378); 
             after(grammarAccess.getStoryHeaderAccess().getTitledKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoryHeader__Group__2__Impl"


    // $ANTLR start "rule__StoryHeader__Group__3"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2116:1: rule__StoryHeader__Group__3 : rule__StoryHeader__Group__3__Impl rule__StoryHeader__Group__4 ;
    public final void rule__StoryHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2120:1: ( rule__StoryHeader__Group__3__Impl rule__StoryHeader__Group__4 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2121:2: rule__StoryHeader__Group__3__Impl rule__StoryHeader__Group__4
            {
            pushFollow(FOLLOW_rule__StoryHeader__Group__3__Impl_in_rule__StoryHeader__Group__34409);
            rule__StoryHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StoryHeader__Group__4_in_rule__StoryHeader__Group__34412);
            rule__StoryHeader__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoryHeader__Group__3"


    // $ANTLR start "rule__StoryHeader__Group__3__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2128:1: rule__StoryHeader__Group__3__Impl : ( RULE_QUOTED_TEXT ) ;
    public final void rule__StoryHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2132:1: ( ( RULE_QUOTED_TEXT ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2133:1: ( RULE_QUOTED_TEXT )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2133:1: ( RULE_QUOTED_TEXT )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2134:1: RULE_QUOTED_TEXT
            {
             before(grammarAccess.getStoryHeaderAccess().getQUOTED_TEXTTerminalRuleCall_3()); 
            match(input,RULE_QUOTED_TEXT,FOLLOW_RULE_QUOTED_TEXT_in_rule__StoryHeader__Group__3__Impl4439); 
             after(grammarAccess.getStoryHeaderAccess().getQUOTED_TEXTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoryHeader__Group__3__Impl"


    // $ANTLR start "rule__StoryHeader__Group__4"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2145:1: rule__StoryHeader__Group__4 : rule__StoryHeader__Group__4__Impl ;
    public final void rule__StoryHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2149:1: ( rule__StoryHeader__Group__4__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2150:2: rule__StoryHeader__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StoryHeader__Group__4__Impl_in_rule__StoryHeader__Group__44468);
            rule__StoryHeader__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoryHeader__Group__4"


    // $ANTLR start "rule__StoryHeader__Group__4__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2156:1: rule__StoryHeader__Group__4__Impl : ( '.' ) ;
    public final void rule__StoryHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2160:1: ( ( '.' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2161:1: ( '.' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2161:1: ( '.' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2162:1: '.'
            {
             before(grammarAccess.getStoryHeaderAccess().getFullStopKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__StoryHeader__Group__4__Impl4496); 
             after(grammarAccess.getStoryHeaderAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoryHeader__Group__4__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2185:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2189:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2190:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_rule__Description__Group__0__Impl_in_rule__Description__Group__04537);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Description__Group__1_in_rule__Description__Group__04540);
            rule__Description__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2197:1: rule__Description__Group__0__Impl : ( () ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2201:1: ( ( () ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2202:1: ( () )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2202:1: ( () )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2203:1: ()
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2204:1: ()
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2206:1: 
            {
            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2216:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2220:1: ( rule__Description__Group__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2221:2: rule__Description__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Description__Group__1__Impl_in_rule__Description__Group__14598);
            rule__Description__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2227:1: rule__Description__Group__1__Impl : ( ( rule__Description__SentencesAssignment_1 )* ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2231:1: ( ( ( rule__Description__SentencesAssignment_1 )* ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2232:1: ( ( rule__Description__SentencesAssignment_1 )* )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2232:1: ( ( rule__Description__SentencesAssignment_1 )* )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2233:1: ( rule__Description__SentencesAssignment_1 )*
            {
             before(grammarAccess.getDescriptionAccess().getSentencesAssignment_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2234:1: ( rule__Description__SentencesAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    switch ( input.LA(2) ) {
                    case RULE_QUOTED_TEXT:
                    case RULE_WORD:
                    case 9:
                    case 10:
                    case 11:
                    case 13:
                    case 14:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 22:
                        {
                        alt9=1;
                        }
                        break;
                    case 12:
                        {
                        int LA9_6 = input.LA(3);

                        if ( ((LA9_6>=RULE_QUOTED_TEXT && LA9_6<=RULE_WORD)||(LA9_6>=9 && LA9_6<=10)||LA9_6==14) ) {
                            alt9=1;
                        }


                        }
                        break;
                    case 15:
                        {
                        int LA9_7 = input.LA(3);

                        if ( ((LA9_7>=RULE_QUOTED_TEXT && LA9_7<=RULE_WORD)||(LA9_7>=9 && LA9_7<=10)||LA9_7==14) ) {
                            alt9=1;
                        }


                        }
                        break;

                    }

                    }
                    break;
                case RULE_WORD:
                    {
                    int LA9_3 = input.LA(2);

                    if ( ((LA9_3>=RULE_QUOTED_TEXT && LA9_3<=RULE_WORD)||(LA9_3>=9 && LA9_3<=19)||(LA9_3>=21 && LA9_3<=22)) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 16:
                    {
                    int LA9_4 = input.LA(2);

                    if ( ((LA9_4>=RULE_QUOTED_TEXT && LA9_4<=RULE_WORD)||(LA9_4>=9 && LA9_4<=16)||(LA9_4>=18 && LA9_4<=19)||(LA9_4>=21 && LA9_4<=22)) ) {
                        alt9=1;
                    }


                    }
                    break;
                case RULE_QUOTED_TEXT:
                case 9:
                case 10:
                case 12:
                case 13:
                case 14:
                case 15:
                case 17:
                case 18:
                case 19:
                case 21:
                case 22:
                    {
                    alt9=1;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2234:2: rule__Description__SentencesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Description__SentencesAssignment_1_in_rule__Description__Group__1__Impl4625);
            	    rule__Description__SentencesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDescriptionAccess().getSentencesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Sentence__Group__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2248:1: rule__Sentence__Group__0 : rule__Sentence__Group__0__Impl rule__Sentence__Group__1 ;
    public final void rule__Sentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2252:1: ( rule__Sentence__Group__0__Impl rule__Sentence__Group__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2253:2: rule__Sentence__Group__0__Impl rule__Sentence__Group__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group__0__Impl_in_rule__Sentence__Group__04660);
            rule__Sentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group__1_in_rule__Sentence__Group__04663);
            rule__Sentence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__0"


    // $ANTLR start "rule__Sentence__Group__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2260:1: rule__Sentence__Group__0__Impl : ( () ) ;
    public final void rule__Sentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2264:1: ( ( () ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2265:1: ( () )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2265:1: ( () )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2266:1: ()
            {
             before(grammarAccess.getSentenceAccess().getSentenceAction_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2267:1: ()
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2269:1: 
            {
            }

             after(grammarAccess.getSentenceAccess().getSentenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__0__Impl"


    // $ANTLR start "rule__Sentence__Group__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2279:1: rule__Sentence__Group__1 : rule__Sentence__Group__1__Impl ;
    public final void rule__Sentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2283:1: ( rule__Sentence__Group__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2284:2: rule__Sentence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group__1__Impl_in_rule__Sentence__Group__14721);
            rule__Sentence__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__1"


    // $ANTLR start "rule__Sentence__Group__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2290:1: rule__Sentence__Group__1__Impl : ( ( rule__Sentence__Group_1__0 ) ) ;
    public final void rule__Sentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2294:1: ( ( ( rule__Sentence__Group_1__0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2295:1: ( ( rule__Sentence__Group_1__0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2295:1: ( ( rule__Sentence__Group_1__0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2296:1: ( rule__Sentence__Group_1__0 )
            {
             before(grammarAccess.getSentenceAccess().getGroup_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2297:1: ( rule__Sentence__Group_1__0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2297:2: rule__Sentence__Group_1__0
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1__0_in_rule__Sentence__Group__1__Impl4748);
            rule__Sentence__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2311:1: rule__Sentence__Group_1__0 : rule__Sentence__Group_1__0__Impl rule__Sentence__Group_1__1 ;
    public final void rule__Sentence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2315:1: ( rule__Sentence__Group_1__0__Impl rule__Sentence__Group_1__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2316:2: rule__Sentence__Group_1__0__Impl rule__Sentence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1__0__Impl_in_rule__Sentence__Group_1__04782);
            rule__Sentence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1__1_in_rule__Sentence__Group_1__04785);
            rule__Sentence__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1__0"


    // $ANTLR start "rule__Sentence__Group_1__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2323:1: rule__Sentence__Group_1__0__Impl : ( ( rule__Sentence__Alternatives_1_0 )* ) ;
    public final void rule__Sentence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2327:1: ( ( ( rule__Sentence__Alternatives_1_0 )* ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2328:1: ( ( rule__Sentence__Alternatives_1_0 )* )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2328:1: ( ( rule__Sentence__Alternatives_1_0 )* )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2329:1: ( rule__Sentence__Alternatives_1_0 )*
            {
             before(grammarAccess.getSentenceAccess().getAlternatives_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2330:1: ( rule__Sentence__Alternatives_1_0 )*
            loop10:
            do {
                int alt10=2;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    switch ( input.LA(2) ) {
                    case RULE_QUOTED_TEXT:
                    case RULE_WORD:
                    case 9:
                    case 10:
                    case 11:
                    case 13:
                    case 16:
                    case 17:
                    case 19:
                    case 22:
                        {
                        alt10=1;
                        }
                        break;
                    case 12:
                        {
                        int LA10_5 = input.LA(3);

                        if ( ((LA10_5>=RULE_QUOTED_TEXT && LA10_5<=RULE_WORD)||(LA10_5>=9 && LA10_5<=10)) ) {
                            alt10=1;
                        }


                        }
                        break;
                    case 15:
                        {
                        int LA10_6 = input.LA(3);

                        if ( ((LA10_6>=RULE_QUOTED_TEXT && LA10_6<=RULE_WORD)||(LA10_6>=9 && LA10_6<=10)) ) {
                            alt10=1;
                        }


                        }
                        break;
                    case 18:
                        {
                        int LA10_7 = input.LA(3);

                        if ( ((LA10_7>=RULE_QUOTED_TEXT && LA10_7<=RULE_WORD)||(LA10_7>=9 && LA10_7<=10)) ) {
                            alt10=1;
                        }


                        }
                        break;
                    case 21:
                        {
                        int LA10_8 = input.LA(3);

                        if ( ((LA10_8>=RULE_QUOTED_TEXT && LA10_8<=RULE_WORD)||(LA10_8>=9 && LA10_8<=10)) ) {
                            alt10=1;
                        }


                        }
                        break;

                    }

                    }
                    break;
                case 16:
                    {
                    int LA10_2 = input.LA(2);

                    if ( ((LA10_2>=RULE_QUOTED_TEXT && LA10_2<=RULE_WORD)||(LA10_2>=9 && LA10_2<=13)||(LA10_2>=15 && LA10_2<=16)||(LA10_2>=18 && LA10_2<=19)||(LA10_2>=21 && LA10_2<=22)) ) {
                        alt10=1;
                    }


                    }
                    break;
                case RULE_QUOTED_TEXT:
                case RULE_WORD:
                case 9:
                case 10:
                case 12:
                case 13:
                case 15:
                case 17:
                case 18:
                case 19:
                case 21:
                case 22:
                    {
                    alt10=1;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2330:2: rule__Sentence__Alternatives_1_0
            	    {
            	    pushFollow(FOLLOW_rule__Sentence__Alternatives_1_0_in_rule__Sentence__Group_1__0__Impl4812);
            	    rule__Sentence__Alternatives_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSentenceAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2340:1: rule__Sentence__Group_1__1 : rule__Sentence__Group_1__1__Impl rule__Sentence__Group_1__2 ;
    public final void rule__Sentence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2344:1: ( rule__Sentence__Group_1__1__Impl rule__Sentence__Group_1__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2345:2: rule__Sentence__Group_1__1__Impl rule__Sentence__Group_1__2
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1__1__Impl_in_rule__Sentence__Group_1__14843);
            rule__Sentence__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1__2_in_rule__Sentence__Group_1__14846);
            rule__Sentence__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1__1"


    // $ANTLR start "rule__Sentence__Group_1__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2352:1: rule__Sentence__Group_1__1__Impl : ( ( rule__Sentence__Alternatives_1_1 )? ) ;
    public final void rule__Sentence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2356:1: ( ( ( rule__Sentence__Alternatives_1_1 )? ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2357:1: ( ( rule__Sentence__Alternatives_1_1 )? )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2357:1: ( ( rule__Sentence__Alternatives_1_1 )? )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2358:1: ( rule__Sentence__Alternatives_1_1 )?
            {
             before(grammarAccess.getSentenceAccess().getAlternatives_1_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2359:1: ( rule__Sentence__Alternatives_1_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11||LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2359:2: rule__Sentence__Alternatives_1_1
                    {
                    pushFollow(FOLLOW_rule__Sentence__Alternatives_1_1_in_rule__Sentence__Group_1__1__Impl4873);
                    rule__Sentence__Alternatives_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSentenceAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2369:1: rule__Sentence__Group_1__2 : rule__Sentence__Group_1__2__Impl ;
    public final void rule__Sentence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2373:1: ( rule__Sentence__Group_1__2__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2374:2: rule__Sentence__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1__2__Impl_in_rule__Sentence__Group_1__24904);
            rule__Sentence__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1__2"


    // $ANTLR start "rule__Sentence__Group_1__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2380:1: rule__Sentence__Group_1__2__Impl : ( '.' ) ;
    public final void rule__Sentence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2384:1: ( ( '.' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2385:1: ( '.' )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2385:1: ( '.' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2386:1: '.'
            {
             before(grammarAccess.getSentenceAccess().getFullStopKeyword_1_2()); 
            match(input,14,FOLLOW_14_in_rule__Sentence__Group_1__2__Impl4932); 
             after(grammarAccess.getSentenceAccess().getFullStopKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1__2__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_1__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2405:1: rule__Sentence__Group_1_0_1__0 : rule__Sentence__Group_1_0_1__0__Impl rule__Sentence__Group_1_0_1__1 ;
    public final void rule__Sentence__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2409:1: ( rule__Sentence__Group_1_0_1__0__Impl rule__Sentence__Group_1_0_1__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2410:2: rule__Sentence__Group_1_0_1__0__Impl rule__Sentence__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_1__0__Impl_in_rule__Sentence__Group_1_0_1__04969);
            rule__Sentence__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_1__1_in_rule__Sentence__Group_1_0_1__04972);
            rule__Sentence__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_1__0"


    // $ANTLR start "rule__Sentence__Group_1_0_1__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2417:1: rule__Sentence__Group_1_0_1__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_1_0 ) ) ;
    public final void rule__Sentence__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2421:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_1_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2422:1: ( ( rule__Sentence__FragmentsAssignment_1_0_1_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2422:1: ( ( rule__Sentence__FragmentsAssignment_1_0_1_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2423:1: ( rule__Sentence__FragmentsAssignment_1_0_1_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2424:1: ( rule__Sentence__FragmentsAssignment_1_0_1_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2424:2: rule__Sentence__FragmentsAssignment_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_1_0_in_rule__Sentence__Group_1_0_1__0__Impl4999);
            rule__Sentence__FragmentsAssignment_1_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_1__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2434:1: rule__Sentence__Group_1_0_1__1 : rule__Sentence__Group_1_0_1__1__Impl ;
    public final void rule__Sentence__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2438:1: ( rule__Sentence__Group_1_0_1__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2439:2: rule__Sentence__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_1__1__Impl_in_rule__Sentence__Group_1_0_1__15029);
            rule__Sentence__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_1__1"


    // $ANTLR start "rule__Sentence__Group_1_0_1__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2445:1: rule__Sentence__Group_1_0_1__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_1_1 ) ) ;
    public final void rule__Sentence__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2449:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_1_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2450:1: ( ( rule__Sentence__FragmentsAssignment_1_0_1_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2450:1: ( ( rule__Sentence__FragmentsAssignment_1_0_1_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2451:1: ( rule__Sentence__FragmentsAssignment_1_0_1_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_1_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2452:1: ( rule__Sentence__FragmentsAssignment_1_0_1_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2452:2: rule__Sentence__FragmentsAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_1_1_in_rule__Sentence__Group_1_0_1__1__Impl5056);
            rule__Sentence__FragmentsAssignment_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_2__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2466:1: rule__Sentence__Group_1_0_2__0 : rule__Sentence__Group_1_0_2__0__Impl rule__Sentence__Group_1_0_2__1 ;
    public final void rule__Sentence__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2470:1: ( rule__Sentence__Group_1_0_2__0__Impl rule__Sentence__Group_1_0_2__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2471:2: rule__Sentence__Group_1_0_2__0__Impl rule__Sentence__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_2__0__Impl_in_rule__Sentence__Group_1_0_2__05090);
            rule__Sentence__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_2__1_in_rule__Sentence__Group_1_0_2__05093);
            rule__Sentence__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_2__0"


    // $ANTLR start "rule__Sentence__Group_1_0_2__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2478:1: rule__Sentence__Group_1_0_2__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_2_0 ) ) ;
    public final void rule__Sentence__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2482:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_2_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2483:1: ( ( rule__Sentence__FragmentsAssignment_1_0_2_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2483:1: ( ( rule__Sentence__FragmentsAssignment_1_0_2_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2484:1: ( rule__Sentence__FragmentsAssignment_1_0_2_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_2_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2485:1: ( rule__Sentence__FragmentsAssignment_1_0_2_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2485:2: rule__Sentence__FragmentsAssignment_1_0_2_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_2_0_in_rule__Sentence__Group_1_0_2__0__Impl5120);
            rule__Sentence__FragmentsAssignment_1_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_2__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2495:1: rule__Sentence__Group_1_0_2__1 : rule__Sentence__Group_1_0_2__1__Impl rule__Sentence__Group_1_0_2__2 ;
    public final void rule__Sentence__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2499:1: ( rule__Sentence__Group_1_0_2__1__Impl rule__Sentence__Group_1_0_2__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2500:2: rule__Sentence__Group_1_0_2__1__Impl rule__Sentence__Group_1_0_2__2
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_2__1__Impl_in_rule__Sentence__Group_1_0_2__15150);
            rule__Sentence__Group_1_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_2__2_in_rule__Sentence__Group_1_0_2__15153);
            rule__Sentence__Group_1_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_2__1"


    // $ANTLR start "rule__Sentence__Group_1_0_2__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2507:1: rule__Sentence__Group_1_0_2__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_2_1 ) ) ;
    public final void rule__Sentence__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2511:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_2_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2512:1: ( ( rule__Sentence__FragmentsAssignment_1_0_2_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2512:1: ( ( rule__Sentence__FragmentsAssignment_1_0_2_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2513:1: ( rule__Sentence__FragmentsAssignment_1_0_2_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_2_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2514:1: ( rule__Sentence__FragmentsAssignment_1_0_2_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2514:2: rule__Sentence__FragmentsAssignment_1_0_2_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_2_1_in_rule__Sentence__Group_1_0_2__1__Impl5180);
            rule__Sentence__FragmentsAssignment_1_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_2__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2524:1: rule__Sentence__Group_1_0_2__2 : rule__Sentence__Group_1_0_2__2__Impl ;
    public final void rule__Sentence__Group_1_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2528:1: ( rule__Sentence__Group_1_0_2__2__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2529:2: rule__Sentence__Group_1_0_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_2__2__Impl_in_rule__Sentence__Group_1_0_2__25210);
            rule__Sentence__Group_1_0_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_2__2"


    // $ANTLR start "rule__Sentence__Group_1_0_2__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2535:1: rule__Sentence__Group_1_0_2__2__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_2_2 ) ) ;
    public final void rule__Sentence__Group_1_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2539:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_2_2 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2540:1: ( ( rule__Sentence__FragmentsAssignment_1_0_2_2 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2540:1: ( ( rule__Sentence__FragmentsAssignment_1_0_2_2 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2541:1: ( rule__Sentence__FragmentsAssignment_1_0_2_2 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_2_2()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2542:1: ( rule__Sentence__FragmentsAssignment_1_0_2_2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2542:2: rule__Sentence__FragmentsAssignment_1_0_2_2
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_2_2_in_rule__Sentence__Group_1_0_2__2__Impl5237);
            rule__Sentence__FragmentsAssignment_1_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_2__2__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_3__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2558:1: rule__Sentence__Group_1_0_3__0 : rule__Sentence__Group_1_0_3__0__Impl rule__Sentence__Group_1_0_3__1 ;
    public final void rule__Sentence__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2562:1: ( rule__Sentence__Group_1_0_3__0__Impl rule__Sentence__Group_1_0_3__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2563:2: rule__Sentence__Group_1_0_3__0__Impl rule__Sentence__Group_1_0_3__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_3__0__Impl_in_rule__Sentence__Group_1_0_3__05273);
            rule__Sentence__Group_1_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_3__1_in_rule__Sentence__Group_1_0_3__05276);
            rule__Sentence__Group_1_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_3__0"


    // $ANTLR start "rule__Sentence__Group_1_0_3__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2570:1: rule__Sentence__Group_1_0_3__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_3_0 ) ) ;
    public final void rule__Sentence__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2574:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_3_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2575:1: ( ( rule__Sentence__FragmentsAssignment_1_0_3_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2575:1: ( ( rule__Sentence__FragmentsAssignment_1_0_3_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2576:1: ( rule__Sentence__FragmentsAssignment_1_0_3_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_3_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2577:1: ( rule__Sentence__FragmentsAssignment_1_0_3_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2577:2: rule__Sentence__FragmentsAssignment_1_0_3_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_3_0_in_rule__Sentence__Group_1_0_3__0__Impl5303);
            rule__Sentence__FragmentsAssignment_1_0_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_3__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2587:1: rule__Sentence__Group_1_0_3__1 : rule__Sentence__Group_1_0_3__1__Impl ;
    public final void rule__Sentence__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2591:1: ( rule__Sentence__Group_1_0_3__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2592:2: rule__Sentence__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_3__1__Impl_in_rule__Sentence__Group_1_0_3__15333);
            rule__Sentence__Group_1_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_3__1"


    // $ANTLR start "rule__Sentence__Group_1_0_3__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2598:1: rule__Sentence__Group_1_0_3__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_3_1 ) ) ;
    public final void rule__Sentence__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2602:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_3_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2603:1: ( ( rule__Sentence__FragmentsAssignment_1_0_3_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2603:1: ( ( rule__Sentence__FragmentsAssignment_1_0_3_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2604:1: ( rule__Sentence__FragmentsAssignment_1_0_3_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_3_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2605:1: ( rule__Sentence__FragmentsAssignment_1_0_3_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2605:2: rule__Sentence__FragmentsAssignment_1_0_3_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_3_1_in_rule__Sentence__Group_1_0_3__1__Impl5360);
            rule__Sentence__FragmentsAssignment_1_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_4__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2619:1: rule__Sentence__Group_1_0_4__0 : rule__Sentence__Group_1_0_4__0__Impl rule__Sentence__Group_1_0_4__1 ;
    public final void rule__Sentence__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2623:1: ( rule__Sentence__Group_1_0_4__0__Impl rule__Sentence__Group_1_0_4__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2624:2: rule__Sentence__Group_1_0_4__0__Impl rule__Sentence__Group_1_0_4__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_4__0__Impl_in_rule__Sentence__Group_1_0_4__05394);
            rule__Sentence__Group_1_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_4__1_in_rule__Sentence__Group_1_0_4__05397);
            rule__Sentence__Group_1_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_4__0"


    // $ANTLR start "rule__Sentence__Group_1_0_4__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2631:1: rule__Sentence__Group_1_0_4__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_4_0 ) ) ;
    public final void rule__Sentence__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2635:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_4_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2636:1: ( ( rule__Sentence__FragmentsAssignment_1_0_4_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2636:1: ( ( rule__Sentence__FragmentsAssignment_1_0_4_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2637:1: ( rule__Sentence__FragmentsAssignment_1_0_4_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_4_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2638:1: ( rule__Sentence__FragmentsAssignment_1_0_4_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2638:2: rule__Sentence__FragmentsAssignment_1_0_4_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_4_0_in_rule__Sentence__Group_1_0_4__0__Impl5424);
            rule__Sentence__FragmentsAssignment_1_0_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_4__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_4__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2648:1: rule__Sentence__Group_1_0_4__1 : rule__Sentence__Group_1_0_4__1__Impl ;
    public final void rule__Sentence__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2652:1: ( rule__Sentence__Group_1_0_4__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2653:2: rule__Sentence__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_4__1__Impl_in_rule__Sentence__Group_1_0_4__15454);
            rule__Sentence__Group_1_0_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_4__1"


    // $ANTLR start "rule__Sentence__Group_1_0_4__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2659:1: rule__Sentence__Group_1_0_4__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_4_1 ) ) ;
    public final void rule__Sentence__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2663:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_4_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2664:1: ( ( rule__Sentence__FragmentsAssignment_1_0_4_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2664:1: ( ( rule__Sentence__FragmentsAssignment_1_0_4_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2665:1: ( rule__Sentence__FragmentsAssignment_1_0_4_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_4_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2666:1: ( rule__Sentence__FragmentsAssignment_1_0_4_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2666:2: rule__Sentence__FragmentsAssignment_1_0_4_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_4_1_in_rule__Sentence__Group_1_0_4__1__Impl5481);
            rule__Sentence__FragmentsAssignment_1_0_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_4__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_5__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2680:1: rule__Sentence__Group_1_0_5__0 : rule__Sentence__Group_1_0_5__0__Impl rule__Sentence__Group_1_0_5__1 ;
    public final void rule__Sentence__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2684:1: ( rule__Sentence__Group_1_0_5__0__Impl rule__Sentence__Group_1_0_5__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2685:2: rule__Sentence__Group_1_0_5__0__Impl rule__Sentence__Group_1_0_5__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_5__0__Impl_in_rule__Sentence__Group_1_0_5__05515);
            rule__Sentence__Group_1_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_5__1_in_rule__Sentence__Group_1_0_5__05518);
            rule__Sentence__Group_1_0_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_5__0"


    // $ANTLR start "rule__Sentence__Group_1_0_5__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2692:1: rule__Sentence__Group_1_0_5__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_5_0 ) ) ;
    public final void rule__Sentence__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2696:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_5_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2697:1: ( ( rule__Sentence__FragmentsAssignment_1_0_5_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2697:1: ( ( rule__Sentence__FragmentsAssignment_1_0_5_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2698:1: ( rule__Sentence__FragmentsAssignment_1_0_5_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_5_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2699:1: ( rule__Sentence__FragmentsAssignment_1_0_5_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2699:2: rule__Sentence__FragmentsAssignment_1_0_5_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_5_0_in_rule__Sentence__Group_1_0_5__0__Impl5545);
            rule__Sentence__FragmentsAssignment_1_0_5_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_5__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_5__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2709:1: rule__Sentence__Group_1_0_5__1 : rule__Sentence__Group_1_0_5__1__Impl ;
    public final void rule__Sentence__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2713:1: ( rule__Sentence__Group_1_0_5__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2714:2: rule__Sentence__Group_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_5__1__Impl_in_rule__Sentence__Group_1_0_5__15575);
            rule__Sentence__Group_1_0_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_5__1"


    // $ANTLR start "rule__Sentence__Group_1_0_5__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2720:1: rule__Sentence__Group_1_0_5__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_5_1 ) ) ;
    public final void rule__Sentence__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2724:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_5_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2725:1: ( ( rule__Sentence__FragmentsAssignment_1_0_5_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2725:1: ( ( rule__Sentence__FragmentsAssignment_1_0_5_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2726:1: ( rule__Sentence__FragmentsAssignment_1_0_5_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_5_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2727:1: ( rule__Sentence__FragmentsAssignment_1_0_5_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2727:2: rule__Sentence__FragmentsAssignment_1_0_5_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_5_1_in_rule__Sentence__Group_1_0_5__1__Impl5602);
            rule__Sentence__FragmentsAssignment_1_0_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_5__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_6__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2741:1: rule__Sentence__Group_1_0_6__0 : rule__Sentence__Group_1_0_6__0__Impl rule__Sentence__Group_1_0_6__1 ;
    public final void rule__Sentence__Group_1_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2745:1: ( rule__Sentence__Group_1_0_6__0__Impl rule__Sentence__Group_1_0_6__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2746:2: rule__Sentence__Group_1_0_6__0__Impl rule__Sentence__Group_1_0_6__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_6__0__Impl_in_rule__Sentence__Group_1_0_6__05636);
            rule__Sentence__Group_1_0_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_6__1_in_rule__Sentence__Group_1_0_6__05639);
            rule__Sentence__Group_1_0_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_6__0"


    // $ANTLR start "rule__Sentence__Group_1_0_6__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2753:1: rule__Sentence__Group_1_0_6__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_6_0 ) ) ;
    public final void rule__Sentence__Group_1_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2757:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_6_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2758:1: ( ( rule__Sentence__FragmentsAssignment_1_0_6_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2758:1: ( ( rule__Sentence__FragmentsAssignment_1_0_6_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2759:1: ( rule__Sentence__FragmentsAssignment_1_0_6_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_6_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2760:1: ( rule__Sentence__FragmentsAssignment_1_0_6_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2760:2: rule__Sentence__FragmentsAssignment_1_0_6_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_6_0_in_rule__Sentence__Group_1_0_6__0__Impl5666);
            rule__Sentence__FragmentsAssignment_1_0_6_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_6__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_6__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2770:1: rule__Sentence__Group_1_0_6__1 : rule__Sentence__Group_1_0_6__1__Impl ;
    public final void rule__Sentence__Group_1_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2774:1: ( rule__Sentence__Group_1_0_6__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2775:2: rule__Sentence__Group_1_0_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_6__1__Impl_in_rule__Sentence__Group_1_0_6__15696);
            rule__Sentence__Group_1_0_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_6__1"


    // $ANTLR start "rule__Sentence__Group_1_0_6__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2781:1: rule__Sentence__Group_1_0_6__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_6_1 ) ) ;
    public final void rule__Sentence__Group_1_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2785:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_6_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2786:1: ( ( rule__Sentence__FragmentsAssignment_1_0_6_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2786:1: ( ( rule__Sentence__FragmentsAssignment_1_0_6_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2787:1: ( rule__Sentence__FragmentsAssignment_1_0_6_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_6_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2788:1: ( rule__Sentence__FragmentsAssignment_1_0_6_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2788:2: rule__Sentence__FragmentsAssignment_1_0_6_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_6_1_in_rule__Sentence__Group_1_0_6__1__Impl5723);
            rule__Sentence__FragmentsAssignment_1_0_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_6__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_7__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2802:1: rule__Sentence__Group_1_0_7__0 : rule__Sentence__Group_1_0_7__0__Impl rule__Sentence__Group_1_0_7__1 ;
    public final void rule__Sentence__Group_1_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2806:1: ( rule__Sentence__Group_1_0_7__0__Impl rule__Sentence__Group_1_0_7__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2807:2: rule__Sentence__Group_1_0_7__0__Impl rule__Sentence__Group_1_0_7__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_7__0__Impl_in_rule__Sentence__Group_1_0_7__05757);
            rule__Sentence__Group_1_0_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_7__1_in_rule__Sentence__Group_1_0_7__05760);
            rule__Sentence__Group_1_0_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_7__0"


    // $ANTLR start "rule__Sentence__Group_1_0_7__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2814:1: rule__Sentence__Group_1_0_7__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_7_0 ) ) ;
    public final void rule__Sentence__Group_1_0_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2818:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_7_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2819:1: ( ( rule__Sentence__FragmentsAssignment_1_0_7_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2819:1: ( ( rule__Sentence__FragmentsAssignment_1_0_7_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2820:1: ( rule__Sentence__FragmentsAssignment_1_0_7_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_7_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2821:1: ( rule__Sentence__FragmentsAssignment_1_0_7_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2821:2: rule__Sentence__FragmentsAssignment_1_0_7_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_7_0_in_rule__Sentence__Group_1_0_7__0__Impl5787);
            rule__Sentence__FragmentsAssignment_1_0_7_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_7__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_7__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2831:1: rule__Sentence__Group_1_0_7__1 : rule__Sentence__Group_1_0_7__1__Impl ;
    public final void rule__Sentence__Group_1_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2835:1: ( rule__Sentence__Group_1_0_7__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2836:2: rule__Sentence__Group_1_0_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_7__1__Impl_in_rule__Sentence__Group_1_0_7__15817);
            rule__Sentence__Group_1_0_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_7__1"


    // $ANTLR start "rule__Sentence__Group_1_0_7__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2842:1: rule__Sentence__Group_1_0_7__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_7_1 ) ) ;
    public final void rule__Sentence__Group_1_0_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2846:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_7_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2847:1: ( ( rule__Sentence__FragmentsAssignment_1_0_7_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2847:1: ( ( rule__Sentence__FragmentsAssignment_1_0_7_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2848:1: ( rule__Sentence__FragmentsAssignment_1_0_7_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_7_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2849:1: ( rule__Sentence__FragmentsAssignment_1_0_7_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2849:2: rule__Sentence__FragmentsAssignment_1_0_7_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_7_1_in_rule__Sentence__Group_1_0_7__1__Impl5844);
            rule__Sentence__FragmentsAssignment_1_0_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_7__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_10__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2863:1: rule__Sentence__Group_1_0_10__0 : rule__Sentence__Group_1_0_10__0__Impl rule__Sentence__Group_1_0_10__1 ;
    public final void rule__Sentence__Group_1_0_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2867:1: ( rule__Sentence__Group_1_0_10__0__Impl rule__Sentence__Group_1_0_10__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2868:2: rule__Sentence__Group_1_0_10__0__Impl rule__Sentence__Group_1_0_10__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_10__0__Impl_in_rule__Sentence__Group_1_0_10__05878);
            rule__Sentence__Group_1_0_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_10__1_in_rule__Sentence__Group_1_0_10__05881);
            rule__Sentence__Group_1_0_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_10__0"


    // $ANTLR start "rule__Sentence__Group_1_0_10__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2875:1: rule__Sentence__Group_1_0_10__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_10_0 ) ) ;
    public final void rule__Sentence__Group_1_0_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2879:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_10_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2880:1: ( ( rule__Sentence__FragmentsAssignment_1_0_10_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2880:1: ( ( rule__Sentence__FragmentsAssignment_1_0_10_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2881:1: ( rule__Sentence__FragmentsAssignment_1_0_10_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_10_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2882:1: ( rule__Sentence__FragmentsAssignment_1_0_10_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2882:2: rule__Sentence__FragmentsAssignment_1_0_10_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_10_0_in_rule__Sentence__Group_1_0_10__0__Impl5908);
            rule__Sentence__FragmentsAssignment_1_0_10_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_10__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_10__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2892:1: rule__Sentence__Group_1_0_10__1 : rule__Sentence__Group_1_0_10__1__Impl rule__Sentence__Group_1_0_10__2 ;
    public final void rule__Sentence__Group_1_0_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2896:1: ( rule__Sentence__Group_1_0_10__1__Impl rule__Sentence__Group_1_0_10__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2897:2: rule__Sentence__Group_1_0_10__1__Impl rule__Sentence__Group_1_0_10__2
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_10__1__Impl_in_rule__Sentence__Group_1_0_10__15938);
            rule__Sentence__Group_1_0_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_10__2_in_rule__Sentence__Group_1_0_10__15941);
            rule__Sentence__Group_1_0_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_10__1"


    // $ANTLR start "rule__Sentence__Group_1_0_10__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2904:1: rule__Sentence__Group_1_0_10__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_10_1 ) ) ;
    public final void rule__Sentence__Group_1_0_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2908:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_10_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2909:1: ( ( rule__Sentence__FragmentsAssignment_1_0_10_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2909:1: ( ( rule__Sentence__FragmentsAssignment_1_0_10_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2910:1: ( rule__Sentence__FragmentsAssignment_1_0_10_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_10_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2911:1: ( rule__Sentence__FragmentsAssignment_1_0_10_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2911:2: rule__Sentence__FragmentsAssignment_1_0_10_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_10_1_in_rule__Sentence__Group_1_0_10__1__Impl5968);
            rule__Sentence__FragmentsAssignment_1_0_10_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_10__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_10__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2921:1: rule__Sentence__Group_1_0_10__2 : rule__Sentence__Group_1_0_10__2__Impl ;
    public final void rule__Sentence__Group_1_0_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2925:1: ( rule__Sentence__Group_1_0_10__2__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2926:2: rule__Sentence__Group_1_0_10__2__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_10__2__Impl_in_rule__Sentence__Group_1_0_10__25998);
            rule__Sentence__Group_1_0_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_10__2"


    // $ANTLR start "rule__Sentence__Group_1_0_10__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2932:1: rule__Sentence__Group_1_0_10__2__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_10_2 ) ) ;
    public final void rule__Sentence__Group_1_0_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2936:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_10_2 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2937:1: ( ( rule__Sentence__FragmentsAssignment_1_0_10_2 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2937:1: ( ( rule__Sentence__FragmentsAssignment_1_0_10_2 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2938:1: ( rule__Sentence__FragmentsAssignment_1_0_10_2 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_10_2()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2939:1: ( rule__Sentence__FragmentsAssignment_1_0_10_2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2939:2: rule__Sentence__FragmentsAssignment_1_0_10_2
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_10_2_in_rule__Sentence__Group_1_0_10__2__Impl6025);
            rule__Sentence__FragmentsAssignment_1_0_10_2();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_10__2__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_12__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2955:1: rule__Sentence__Group_1_0_12__0 : rule__Sentence__Group_1_0_12__0__Impl rule__Sentence__Group_1_0_12__1 ;
    public final void rule__Sentence__Group_1_0_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2959:1: ( rule__Sentence__Group_1_0_12__0__Impl rule__Sentence__Group_1_0_12__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2960:2: rule__Sentence__Group_1_0_12__0__Impl rule__Sentence__Group_1_0_12__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_12__0__Impl_in_rule__Sentence__Group_1_0_12__06061);
            rule__Sentence__Group_1_0_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_12__1_in_rule__Sentence__Group_1_0_12__06064);
            rule__Sentence__Group_1_0_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_12__0"


    // $ANTLR start "rule__Sentence__Group_1_0_12__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2967:1: rule__Sentence__Group_1_0_12__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_12_0 ) ) ;
    public final void rule__Sentence__Group_1_0_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2971:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_12_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2972:1: ( ( rule__Sentence__FragmentsAssignment_1_0_12_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2972:1: ( ( rule__Sentence__FragmentsAssignment_1_0_12_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2973:1: ( rule__Sentence__FragmentsAssignment_1_0_12_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_12_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2974:1: ( rule__Sentence__FragmentsAssignment_1_0_12_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2974:2: rule__Sentence__FragmentsAssignment_1_0_12_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_12_0_in_rule__Sentence__Group_1_0_12__0__Impl6091);
            rule__Sentence__FragmentsAssignment_1_0_12_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_12__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_12__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2984:1: rule__Sentence__Group_1_0_12__1 : rule__Sentence__Group_1_0_12__1__Impl rule__Sentence__Group_1_0_12__2 ;
    public final void rule__Sentence__Group_1_0_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2988:1: ( rule__Sentence__Group_1_0_12__1__Impl rule__Sentence__Group_1_0_12__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2989:2: rule__Sentence__Group_1_0_12__1__Impl rule__Sentence__Group_1_0_12__2
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_12__1__Impl_in_rule__Sentence__Group_1_0_12__16121);
            rule__Sentence__Group_1_0_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_12__2_in_rule__Sentence__Group_1_0_12__16124);
            rule__Sentence__Group_1_0_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_12__1"


    // $ANTLR start "rule__Sentence__Group_1_0_12__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:2996:1: rule__Sentence__Group_1_0_12__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_12_1 ) ) ;
    public final void rule__Sentence__Group_1_0_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3000:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_12_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3001:1: ( ( rule__Sentence__FragmentsAssignment_1_0_12_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3001:1: ( ( rule__Sentence__FragmentsAssignment_1_0_12_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3002:1: ( rule__Sentence__FragmentsAssignment_1_0_12_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_12_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3003:1: ( rule__Sentence__FragmentsAssignment_1_0_12_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3003:2: rule__Sentence__FragmentsAssignment_1_0_12_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_12_1_in_rule__Sentence__Group_1_0_12__1__Impl6151);
            rule__Sentence__FragmentsAssignment_1_0_12_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_12__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_12__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3013:1: rule__Sentence__Group_1_0_12__2 : rule__Sentence__Group_1_0_12__2__Impl ;
    public final void rule__Sentence__Group_1_0_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3017:1: ( rule__Sentence__Group_1_0_12__2__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3018:2: rule__Sentence__Group_1_0_12__2__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_12__2__Impl_in_rule__Sentence__Group_1_0_12__26181);
            rule__Sentence__Group_1_0_12__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_12__2"


    // $ANTLR start "rule__Sentence__Group_1_0_12__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3024:1: rule__Sentence__Group_1_0_12__2__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_12_2 ) ) ;
    public final void rule__Sentence__Group_1_0_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3028:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_12_2 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3029:1: ( ( rule__Sentence__FragmentsAssignment_1_0_12_2 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3029:1: ( ( rule__Sentence__FragmentsAssignment_1_0_12_2 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3030:1: ( rule__Sentence__FragmentsAssignment_1_0_12_2 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_12_2()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3031:1: ( rule__Sentence__FragmentsAssignment_1_0_12_2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3031:2: rule__Sentence__FragmentsAssignment_1_0_12_2
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_12_2_in_rule__Sentence__Group_1_0_12__2__Impl6208);
            rule__Sentence__FragmentsAssignment_1_0_12_2();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_12__2__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_15__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3047:1: rule__Sentence__Group_1_0_15__0 : rule__Sentence__Group_1_0_15__0__Impl rule__Sentence__Group_1_0_15__1 ;
    public final void rule__Sentence__Group_1_0_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3051:1: ( rule__Sentence__Group_1_0_15__0__Impl rule__Sentence__Group_1_0_15__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3052:2: rule__Sentence__Group_1_0_15__0__Impl rule__Sentence__Group_1_0_15__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_15__0__Impl_in_rule__Sentence__Group_1_0_15__06244);
            rule__Sentence__Group_1_0_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_15__1_in_rule__Sentence__Group_1_0_15__06247);
            rule__Sentence__Group_1_0_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_15__0"


    // $ANTLR start "rule__Sentence__Group_1_0_15__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3059:1: rule__Sentence__Group_1_0_15__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_15_0 ) ) ;
    public final void rule__Sentence__Group_1_0_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3063:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_15_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3064:1: ( ( rule__Sentence__FragmentsAssignment_1_0_15_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3064:1: ( ( rule__Sentence__FragmentsAssignment_1_0_15_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3065:1: ( rule__Sentence__FragmentsAssignment_1_0_15_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_15_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3066:1: ( rule__Sentence__FragmentsAssignment_1_0_15_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3066:2: rule__Sentence__FragmentsAssignment_1_0_15_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_15_0_in_rule__Sentence__Group_1_0_15__0__Impl6274);
            rule__Sentence__FragmentsAssignment_1_0_15_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_15__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_15__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3076:1: rule__Sentence__Group_1_0_15__1 : rule__Sentence__Group_1_0_15__1__Impl ;
    public final void rule__Sentence__Group_1_0_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3080:1: ( rule__Sentence__Group_1_0_15__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3081:2: rule__Sentence__Group_1_0_15__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_15__1__Impl_in_rule__Sentence__Group_1_0_15__16304);
            rule__Sentence__Group_1_0_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_15__1"


    // $ANTLR start "rule__Sentence__Group_1_0_15__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3087:1: rule__Sentence__Group_1_0_15__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_15_1 ) ) ;
    public final void rule__Sentence__Group_1_0_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3091:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_15_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3092:1: ( ( rule__Sentence__FragmentsAssignment_1_0_15_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3092:1: ( ( rule__Sentence__FragmentsAssignment_1_0_15_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3093:1: ( rule__Sentence__FragmentsAssignment_1_0_15_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_15_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3094:1: ( rule__Sentence__FragmentsAssignment_1_0_15_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3094:2: rule__Sentence__FragmentsAssignment_1_0_15_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_15_1_in_rule__Sentence__Group_1_0_15__1__Impl6331);
            rule__Sentence__FragmentsAssignment_1_0_15_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_15__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_16__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3108:1: rule__Sentence__Group_1_0_16__0 : rule__Sentence__Group_1_0_16__0__Impl rule__Sentence__Group_1_0_16__1 ;
    public final void rule__Sentence__Group_1_0_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3112:1: ( rule__Sentence__Group_1_0_16__0__Impl rule__Sentence__Group_1_0_16__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3113:2: rule__Sentence__Group_1_0_16__0__Impl rule__Sentence__Group_1_0_16__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_16__0__Impl_in_rule__Sentence__Group_1_0_16__06365);
            rule__Sentence__Group_1_0_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_16__1_in_rule__Sentence__Group_1_0_16__06368);
            rule__Sentence__Group_1_0_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_16__0"


    // $ANTLR start "rule__Sentence__Group_1_0_16__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3120:1: rule__Sentence__Group_1_0_16__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_16_0 ) ) ;
    public final void rule__Sentence__Group_1_0_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3124:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_16_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3125:1: ( ( rule__Sentence__FragmentsAssignment_1_0_16_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3125:1: ( ( rule__Sentence__FragmentsAssignment_1_0_16_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3126:1: ( rule__Sentence__FragmentsAssignment_1_0_16_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_16_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3127:1: ( rule__Sentence__FragmentsAssignment_1_0_16_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3127:2: rule__Sentence__FragmentsAssignment_1_0_16_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_16_0_in_rule__Sentence__Group_1_0_16__0__Impl6395);
            rule__Sentence__FragmentsAssignment_1_0_16_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_16__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_16__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3137:1: rule__Sentence__Group_1_0_16__1 : rule__Sentence__Group_1_0_16__1__Impl ;
    public final void rule__Sentence__Group_1_0_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3141:1: ( rule__Sentence__Group_1_0_16__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3142:2: rule__Sentence__Group_1_0_16__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_16__1__Impl_in_rule__Sentence__Group_1_0_16__16425);
            rule__Sentence__Group_1_0_16__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_16__1"


    // $ANTLR start "rule__Sentence__Group_1_0_16__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3148:1: rule__Sentence__Group_1_0_16__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_16_1 ) ) ;
    public final void rule__Sentence__Group_1_0_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3152:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_16_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3153:1: ( ( rule__Sentence__FragmentsAssignment_1_0_16_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3153:1: ( ( rule__Sentence__FragmentsAssignment_1_0_16_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3154:1: ( rule__Sentence__FragmentsAssignment_1_0_16_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_16_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3155:1: ( rule__Sentence__FragmentsAssignment_1_0_16_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3155:2: rule__Sentence__FragmentsAssignment_1_0_16_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_16_1_in_rule__Sentence__Group_1_0_16__1__Impl6452);
            rule__Sentence__FragmentsAssignment_1_0_16_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_16__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_17__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3169:1: rule__Sentence__Group_1_0_17__0 : rule__Sentence__Group_1_0_17__0__Impl rule__Sentence__Group_1_0_17__1 ;
    public final void rule__Sentence__Group_1_0_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3173:1: ( rule__Sentence__Group_1_0_17__0__Impl rule__Sentence__Group_1_0_17__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3174:2: rule__Sentence__Group_1_0_17__0__Impl rule__Sentence__Group_1_0_17__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_17__0__Impl_in_rule__Sentence__Group_1_0_17__06486);
            rule__Sentence__Group_1_0_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_17__1_in_rule__Sentence__Group_1_0_17__06489);
            rule__Sentence__Group_1_0_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_17__0"


    // $ANTLR start "rule__Sentence__Group_1_0_17__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3181:1: rule__Sentence__Group_1_0_17__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_17_0 ) ) ;
    public final void rule__Sentence__Group_1_0_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3185:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_17_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3186:1: ( ( rule__Sentence__FragmentsAssignment_1_0_17_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3186:1: ( ( rule__Sentence__FragmentsAssignment_1_0_17_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3187:1: ( rule__Sentence__FragmentsAssignment_1_0_17_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_17_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3188:1: ( rule__Sentence__FragmentsAssignment_1_0_17_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3188:2: rule__Sentence__FragmentsAssignment_1_0_17_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_17_0_in_rule__Sentence__Group_1_0_17__0__Impl6516);
            rule__Sentence__FragmentsAssignment_1_0_17_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_17__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_17__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3198:1: rule__Sentence__Group_1_0_17__1 : rule__Sentence__Group_1_0_17__1__Impl ;
    public final void rule__Sentence__Group_1_0_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3202:1: ( rule__Sentence__Group_1_0_17__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3203:2: rule__Sentence__Group_1_0_17__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_17__1__Impl_in_rule__Sentence__Group_1_0_17__16546);
            rule__Sentence__Group_1_0_17__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_17__1"


    // $ANTLR start "rule__Sentence__Group_1_0_17__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3209:1: rule__Sentence__Group_1_0_17__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_17_1 ) ) ;
    public final void rule__Sentence__Group_1_0_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3213:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_17_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3214:1: ( ( rule__Sentence__FragmentsAssignment_1_0_17_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3214:1: ( ( rule__Sentence__FragmentsAssignment_1_0_17_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3215:1: ( rule__Sentence__FragmentsAssignment_1_0_17_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_17_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3216:1: ( rule__Sentence__FragmentsAssignment_1_0_17_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3216:2: rule__Sentence__FragmentsAssignment_1_0_17_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_17_1_in_rule__Sentence__Group_1_0_17__1__Impl6573);
            rule__Sentence__FragmentsAssignment_1_0_17_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_17__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_18__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3230:1: rule__Sentence__Group_1_0_18__0 : rule__Sentence__Group_1_0_18__0__Impl rule__Sentence__Group_1_0_18__1 ;
    public final void rule__Sentence__Group_1_0_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3234:1: ( rule__Sentence__Group_1_0_18__0__Impl rule__Sentence__Group_1_0_18__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3235:2: rule__Sentence__Group_1_0_18__0__Impl rule__Sentence__Group_1_0_18__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_18__0__Impl_in_rule__Sentence__Group_1_0_18__06607);
            rule__Sentence__Group_1_0_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_18__1_in_rule__Sentence__Group_1_0_18__06610);
            rule__Sentence__Group_1_0_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_18__0"


    // $ANTLR start "rule__Sentence__Group_1_0_18__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3242:1: rule__Sentence__Group_1_0_18__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_18_0 ) ) ;
    public final void rule__Sentence__Group_1_0_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3246:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_18_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3247:1: ( ( rule__Sentence__FragmentsAssignment_1_0_18_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3247:1: ( ( rule__Sentence__FragmentsAssignment_1_0_18_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3248:1: ( rule__Sentence__FragmentsAssignment_1_0_18_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_18_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3249:1: ( rule__Sentence__FragmentsAssignment_1_0_18_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3249:2: rule__Sentence__FragmentsAssignment_1_0_18_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_18_0_in_rule__Sentence__Group_1_0_18__0__Impl6637);
            rule__Sentence__FragmentsAssignment_1_0_18_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_18__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_18__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3259:1: rule__Sentence__Group_1_0_18__1 : rule__Sentence__Group_1_0_18__1__Impl ;
    public final void rule__Sentence__Group_1_0_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3263:1: ( rule__Sentence__Group_1_0_18__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3264:2: rule__Sentence__Group_1_0_18__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_18__1__Impl_in_rule__Sentence__Group_1_0_18__16667);
            rule__Sentence__Group_1_0_18__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_18__1"


    // $ANTLR start "rule__Sentence__Group_1_0_18__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3270:1: rule__Sentence__Group_1_0_18__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_18_1 ) ) ;
    public final void rule__Sentence__Group_1_0_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3274:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_18_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3275:1: ( ( rule__Sentence__FragmentsAssignment_1_0_18_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3275:1: ( ( rule__Sentence__FragmentsAssignment_1_0_18_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3276:1: ( rule__Sentence__FragmentsAssignment_1_0_18_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_18_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3277:1: ( rule__Sentence__FragmentsAssignment_1_0_18_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3277:2: rule__Sentence__FragmentsAssignment_1_0_18_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_18_1_in_rule__Sentence__Group_1_0_18__1__Impl6694);
            rule__Sentence__FragmentsAssignment_1_0_18_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_18__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_19__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3291:1: rule__Sentence__Group_1_0_19__0 : rule__Sentence__Group_1_0_19__0__Impl rule__Sentence__Group_1_0_19__1 ;
    public final void rule__Sentence__Group_1_0_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3295:1: ( rule__Sentence__Group_1_0_19__0__Impl rule__Sentence__Group_1_0_19__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3296:2: rule__Sentence__Group_1_0_19__0__Impl rule__Sentence__Group_1_0_19__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_19__0__Impl_in_rule__Sentence__Group_1_0_19__06728);
            rule__Sentence__Group_1_0_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_19__1_in_rule__Sentence__Group_1_0_19__06731);
            rule__Sentence__Group_1_0_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_19__0"


    // $ANTLR start "rule__Sentence__Group_1_0_19__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3303:1: rule__Sentence__Group_1_0_19__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_19_0 ) ) ;
    public final void rule__Sentence__Group_1_0_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3307:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_19_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3308:1: ( ( rule__Sentence__FragmentsAssignment_1_0_19_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3308:1: ( ( rule__Sentence__FragmentsAssignment_1_0_19_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3309:1: ( rule__Sentence__FragmentsAssignment_1_0_19_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_19_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3310:1: ( rule__Sentence__FragmentsAssignment_1_0_19_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3310:2: rule__Sentence__FragmentsAssignment_1_0_19_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_19_0_in_rule__Sentence__Group_1_0_19__0__Impl6758);
            rule__Sentence__FragmentsAssignment_1_0_19_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_19__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_19__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3320:1: rule__Sentence__Group_1_0_19__1 : rule__Sentence__Group_1_0_19__1__Impl ;
    public final void rule__Sentence__Group_1_0_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3324:1: ( rule__Sentence__Group_1_0_19__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3325:2: rule__Sentence__Group_1_0_19__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_19__1__Impl_in_rule__Sentence__Group_1_0_19__16788);
            rule__Sentence__Group_1_0_19__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_19__1"


    // $ANTLR start "rule__Sentence__Group_1_0_19__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3331:1: rule__Sentence__Group_1_0_19__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_19_1 ) ) ;
    public final void rule__Sentence__Group_1_0_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3335:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_19_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3336:1: ( ( rule__Sentence__FragmentsAssignment_1_0_19_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3336:1: ( ( rule__Sentence__FragmentsAssignment_1_0_19_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3337:1: ( rule__Sentence__FragmentsAssignment_1_0_19_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_19_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3338:1: ( rule__Sentence__FragmentsAssignment_1_0_19_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3338:2: rule__Sentence__FragmentsAssignment_1_0_19_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_19_1_in_rule__Sentence__Group_1_0_19__1__Impl6815);
            rule__Sentence__FragmentsAssignment_1_0_19_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_19__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_20__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3352:1: rule__Sentence__Group_1_0_20__0 : rule__Sentence__Group_1_0_20__0__Impl rule__Sentence__Group_1_0_20__1 ;
    public final void rule__Sentence__Group_1_0_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3356:1: ( rule__Sentence__Group_1_0_20__0__Impl rule__Sentence__Group_1_0_20__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3357:2: rule__Sentence__Group_1_0_20__0__Impl rule__Sentence__Group_1_0_20__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_20__0__Impl_in_rule__Sentence__Group_1_0_20__06849);
            rule__Sentence__Group_1_0_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_20__1_in_rule__Sentence__Group_1_0_20__06852);
            rule__Sentence__Group_1_0_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_20__0"


    // $ANTLR start "rule__Sentence__Group_1_0_20__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3364:1: rule__Sentence__Group_1_0_20__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_20_0 ) ) ;
    public final void rule__Sentence__Group_1_0_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3368:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_20_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3369:1: ( ( rule__Sentence__FragmentsAssignment_1_0_20_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3369:1: ( ( rule__Sentence__FragmentsAssignment_1_0_20_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3370:1: ( rule__Sentence__FragmentsAssignment_1_0_20_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_20_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3371:1: ( rule__Sentence__FragmentsAssignment_1_0_20_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3371:2: rule__Sentence__FragmentsAssignment_1_0_20_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_20_0_in_rule__Sentence__Group_1_0_20__0__Impl6879);
            rule__Sentence__FragmentsAssignment_1_0_20_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_20__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_20__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3381:1: rule__Sentence__Group_1_0_20__1 : rule__Sentence__Group_1_0_20__1__Impl ;
    public final void rule__Sentence__Group_1_0_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3385:1: ( rule__Sentence__Group_1_0_20__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3386:2: rule__Sentence__Group_1_0_20__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_20__1__Impl_in_rule__Sentence__Group_1_0_20__16909);
            rule__Sentence__Group_1_0_20__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_20__1"


    // $ANTLR start "rule__Sentence__Group_1_0_20__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3392:1: rule__Sentence__Group_1_0_20__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_20_1 ) ) ;
    public final void rule__Sentence__Group_1_0_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3396:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_20_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3397:1: ( ( rule__Sentence__FragmentsAssignment_1_0_20_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3397:1: ( ( rule__Sentence__FragmentsAssignment_1_0_20_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3398:1: ( rule__Sentence__FragmentsAssignment_1_0_20_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_20_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3399:1: ( rule__Sentence__FragmentsAssignment_1_0_20_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3399:2: rule__Sentence__FragmentsAssignment_1_0_20_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_20_1_in_rule__Sentence__Group_1_0_20__1__Impl6936);
            rule__Sentence__FragmentsAssignment_1_0_20_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_20__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_21__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3413:1: rule__Sentence__Group_1_0_21__0 : rule__Sentence__Group_1_0_21__0__Impl rule__Sentence__Group_1_0_21__1 ;
    public final void rule__Sentence__Group_1_0_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3417:1: ( rule__Sentence__Group_1_0_21__0__Impl rule__Sentence__Group_1_0_21__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3418:2: rule__Sentence__Group_1_0_21__0__Impl rule__Sentence__Group_1_0_21__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_21__0__Impl_in_rule__Sentence__Group_1_0_21__06970);
            rule__Sentence__Group_1_0_21__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_21__1_in_rule__Sentence__Group_1_0_21__06973);
            rule__Sentence__Group_1_0_21__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_21__0"


    // $ANTLR start "rule__Sentence__Group_1_0_21__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3425:1: rule__Sentence__Group_1_0_21__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_21_0 ) ) ;
    public final void rule__Sentence__Group_1_0_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3429:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_21_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3430:1: ( ( rule__Sentence__FragmentsAssignment_1_0_21_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3430:1: ( ( rule__Sentence__FragmentsAssignment_1_0_21_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3431:1: ( rule__Sentence__FragmentsAssignment_1_0_21_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_21_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3432:1: ( rule__Sentence__FragmentsAssignment_1_0_21_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3432:2: rule__Sentence__FragmentsAssignment_1_0_21_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_21_0_in_rule__Sentence__Group_1_0_21__0__Impl7000);
            rule__Sentence__FragmentsAssignment_1_0_21_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_21__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_21__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3442:1: rule__Sentence__Group_1_0_21__1 : rule__Sentence__Group_1_0_21__1__Impl ;
    public final void rule__Sentence__Group_1_0_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3446:1: ( rule__Sentence__Group_1_0_21__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3447:2: rule__Sentence__Group_1_0_21__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_21__1__Impl_in_rule__Sentence__Group_1_0_21__17030);
            rule__Sentence__Group_1_0_21__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_21__1"


    // $ANTLR start "rule__Sentence__Group_1_0_21__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3453:1: rule__Sentence__Group_1_0_21__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_21_1 ) ) ;
    public final void rule__Sentence__Group_1_0_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3457:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_21_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3458:1: ( ( rule__Sentence__FragmentsAssignment_1_0_21_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3458:1: ( ( rule__Sentence__FragmentsAssignment_1_0_21_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3459:1: ( rule__Sentence__FragmentsAssignment_1_0_21_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_21_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3460:1: ( rule__Sentence__FragmentsAssignment_1_0_21_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3460:2: rule__Sentence__FragmentsAssignment_1_0_21_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_21_1_in_rule__Sentence__Group_1_0_21__1__Impl7057);
            rule__Sentence__FragmentsAssignment_1_0_21_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_21_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_21__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_22__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3474:1: rule__Sentence__Group_1_0_22__0 : rule__Sentence__Group_1_0_22__0__Impl rule__Sentence__Group_1_0_22__1 ;
    public final void rule__Sentence__Group_1_0_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3478:1: ( rule__Sentence__Group_1_0_22__0__Impl rule__Sentence__Group_1_0_22__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3479:2: rule__Sentence__Group_1_0_22__0__Impl rule__Sentence__Group_1_0_22__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_22__0__Impl_in_rule__Sentence__Group_1_0_22__07091);
            rule__Sentence__Group_1_0_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_22__1_in_rule__Sentence__Group_1_0_22__07094);
            rule__Sentence__Group_1_0_22__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_22__0"


    // $ANTLR start "rule__Sentence__Group_1_0_22__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3486:1: rule__Sentence__Group_1_0_22__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_22_0 ) ) ;
    public final void rule__Sentence__Group_1_0_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3490:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_22_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3491:1: ( ( rule__Sentence__FragmentsAssignment_1_0_22_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3491:1: ( ( rule__Sentence__FragmentsAssignment_1_0_22_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3492:1: ( rule__Sentence__FragmentsAssignment_1_0_22_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_22_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3493:1: ( rule__Sentence__FragmentsAssignment_1_0_22_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3493:2: rule__Sentence__FragmentsAssignment_1_0_22_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_22_0_in_rule__Sentence__Group_1_0_22__0__Impl7121);
            rule__Sentence__FragmentsAssignment_1_0_22_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_22__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_22__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3503:1: rule__Sentence__Group_1_0_22__1 : rule__Sentence__Group_1_0_22__1__Impl ;
    public final void rule__Sentence__Group_1_0_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3507:1: ( rule__Sentence__Group_1_0_22__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3508:2: rule__Sentence__Group_1_0_22__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_22__1__Impl_in_rule__Sentence__Group_1_0_22__17151);
            rule__Sentence__Group_1_0_22__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_22__1"


    // $ANTLR start "rule__Sentence__Group_1_0_22__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3514:1: rule__Sentence__Group_1_0_22__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_22_1 ) ) ;
    public final void rule__Sentence__Group_1_0_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3518:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_22_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3519:1: ( ( rule__Sentence__FragmentsAssignment_1_0_22_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3519:1: ( ( rule__Sentence__FragmentsAssignment_1_0_22_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3520:1: ( rule__Sentence__FragmentsAssignment_1_0_22_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_22_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3521:1: ( rule__Sentence__FragmentsAssignment_1_0_22_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3521:2: rule__Sentence__FragmentsAssignment_1_0_22_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_22_1_in_rule__Sentence__Group_1_0_22__1__Impl7178);
            rule__Sentence__FragmentsAssignment_1_0_22_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_22_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_22__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_23__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3535:1: rule__Sentence__Group_1_0_23__0 : rule__Sentence__Group_1_0_23__0__Impl rule__Sentence__Group_1_0_23__1 ;
    public final void rule__Sentence__Group_1_0_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3539:1: ( rule__Sentence__Group_1_0_23__0__Impl rule__Sentence__Group_1_0_23__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3540:2: rule__Sentence__Group_1_0_23__0__Impl rule__Sentence__Group_1_0_23__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_23__0__Impl_in_rule__Sentence__Group_1_0_23__07212);
            rule__Sentence__Group_1_0_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_23__1_in_rule__Sentence__Group_1_0_23__07215);
            rule__Sentence__Group_1_0_23__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_23__0"


    // $ANTLR start "rule__Sentence__Group_1_0_23__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3547:1: rule__Sentence__Group_1_0_23__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_23_0 ) ) ;
    public final void rule__Sentence__Group_1_0_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3551:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_23_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3552:1: ( ( rule__Sentence__FragmentsAssignment_1_0_23_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3552:1: ( ( rule__Sentence__FragmentsAssignment_1_0_23_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3553:1: ( rule__Sentence__FragmentsAssignment_1_0_23_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_23_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3554:1: ( rule__Sentence__FragmentsAssignment_1_0_23_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3554:2: rule__Sentence__FragmentsAssignment_1_0_23_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_23_0_in_rule__Sentence__Group_1_0_23__0__Impl7242);
            rule__Sentence__FragmentsAssignment_1_0_23_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_23__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_23__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3564:1: rule__Sentence__Group_1_0_23__1 : rule__Sentence__Group_1_0_23__1__Impl ;
    public final void rule__Sentence__Group_1_0_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3568:1: ( rule__Sentence__Group_1_0_23__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3569:2: rule__Sentence__Group_1_0_23__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_23__1__Impl_in_rule__Sentence__Group_1_0_23__17272);
            rule__Sentence__Group_1_0_23__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_23__1"


    // $ANTLR start "rule__Sentence__Group_1_0_23__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3575:1: rule__Sentence__Group_1_0_23__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_23_1 ) ) ;
    public final void rule__Sentence__Group_1_0_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3579:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_23_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3580:1: ( ( rule__Sentence__FragmentsAssignment_1_0_23_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3580:1: ( ( rule__Sentence__FragmentsAssignment_1_0_23_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3581:1: ( rule__Sentence__FragmentsAssignment_1_0_23_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_23_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3582:1: ( rule__Sentence__FragmentsAssignment_1_0_23_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3582:2: rule__Sentence__FragmentsAssignment_1_0_23_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_23_1_in_rule__Sentence__Group_1_0_23__1__Impl7299);
            rule__Sentence__FragmentsAssignment_1_0_23_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_23_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_23__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_24__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3596:1: rule__Sentence__Group_1_0_24__0 : rule__Sentence__Group_1_0_24__0__Impl rule__Sentence__Group_1_0_24__1 ;
    public final void rule__Sentence__Group_1_0_24__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3600:1: ( rule__Sentence__Group_1_0_24__0__Impl rule__Sentence__Group_1_0_24__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3601:2: rule__Sentence__Group_1_0_24__0__Impl rule__Sentence__Group_1_0_24__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_24__0__Impl_in_rule__Sentence__Group_1_0_24__07333);
            rule__Sentence__Group_1_0_24__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_24__1_in_rule__Sentence__Group_1_0_24__07336);
            rule__Sentence__Group_1_0_24__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_24__0"


    // $ANTLR start "rule__Sentence__Group_1_0_24__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3608:1: rule__Sentence__Group_1_0_24__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_24_0 ) ) ;
    public final void rule__Sentence__Group_1_0_24__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3612:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_24_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3613:1: ( ( rule__Sentence__FragmentsAssignment_1_0_24_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3613:1: ( ( rule__Sentence__FragmentsAssignment_1_0_24_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3614:1: ( rule__Sentence__FragmentsAssignment_1_0_24_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_24_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3615:1: ( rule__Sentence__FragmentsAssignment_1_0_24_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3615:2: rule__Sentence__FragmentsAssignment_1_0_24_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_24_0_in_rule__Sentence__Group_1_0_24__0__Impl7363);
            rule__Sentence__FragmentsAssignment_1_0_24_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_24_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_24__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_24__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3625:1: rule__Sentence__Group_1_0_24__1 : rule__Sentence__Group_1_0_24__1__Impl ;
    public final void rule__Sentence__Group_1_0_24__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3629:1: ( rule__Sentence__Group_1_0_24__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3630:2: rule__Sentence__Group_1_0_24__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_24__1__Impl_in_rule__Sentence__Group_1_0_24__17393);
            rule__Sentence__Group_1_0_24__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_24__1"


    // $ANTLR start "rule__Sentence__Group_1_0_24__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3636:1: rule__Sentence__Group_1_0_24__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_24_1 ) ) ;
    public final void rule__Sentence__Group_1_0_24__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3640:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_24_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3641:1: ( ( rule__Sentence__FragmentsAssignment_1_0_24_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3641:1: ( ( rule__Sentence__FragmentsAssignment_1_0_24_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3642:1: ( rule__Sentence__FragmentsAssignment_1_0_24_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_24_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3643:1: ( rule__Sentence__FragmentsAssignment_1_0_24_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3643:2: rule__Sentence__FragmentsAssignment_1_0_24_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_24_1_in_rule__Sentence__Group_1_0_24__1__Impl7420);
            rule__Sentence__FragmentsAssignment_1_0_24_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_24_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_24__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_26__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3657:1: rule__Sentence__Group_1_0_26__0 : rule__Sentence__Group_1_0_26__0__Impl rule__Sentence__Group_1_0_26__1 ;
    public final void rule__Sentence__Group_1_0_26__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3661:1: ( rule__Sentence__Group_1_0_26__0__Impl rule__Sentence__Group_1_0_26__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3662:2: rule__Sentence__Group_1_0_26__0__Impl rule__Sentence__Group_1_0_26__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_26__0__Impl_in_rule__Sentence__Group_1_0_26__07454);
            rule__Sentence__Group_1_0_26__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_26__1_in_rule__Sentence__Group_1_0_26__07457);
            rule__Sentence__Group_1_0_26__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_26__0"


    // $ANTLR start "rule__Sentence__Group_1_0_26__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3669:1: rule__Sentence__Group_1_0_26__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_26_0 ) ) ;
    public final void rule__Sentence__Group_1_0_26__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3673:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_26_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3674:1: ( ( rule__Sentence__FragmentsAssignment_1_0_26_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3674:1: ( ( rule__Sentence__FragmentsAssignment_1_0_26_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3675:1: ( rule__Sentence__FragmentsAssignment_1_0_26_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_26_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3676:1: ( rule__Sentence__FragmentsAssignment_1_0_26_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3676:2: rule__Sentence__FragmentsAssignment_1_0_26_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_26_0_in_rule__Sentence__Group_1_0_26__0__Impl7484);
            rule__Sentence__FragmentsAssignment_1_0_26_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_26_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_26__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_26__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3686:1: rule__Sentence__Group_1_0_26__1 : rule__Sentence__Group_1_0_26__1__Impl ;
    public final void rule__Sentence__Group_1_0_26__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3690:1: ( rule__Sentence__Group_1_0_26__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3691:2: rule__Sentence__Group_1_0_26__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_26__1__Impl_in_rule__Sentence__Group_1_0_26__17514);
            rule__Sentence__Group_1_0_26__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_26__1"


    // $ANTLR start "rule__Sentence__Group_1_0_26__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3697:1: rule__Sentence__Group_1_0_26__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_26_1 ) ) ;
    public final void rule__Sentence__Group_1_0_26__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3701:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_26_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3702:1: ( ( rule__Sentence__FragmentsAssignment_1_0_26_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3702:1: ( ( rule__Sentence__FragmentsAssignment_1_0_26_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3703:1: ( rule__Sentence__FragmentsAssignment_1_0_26_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_26_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3704:1: ( rule__Sentence__FragmentsAssignment_1_0_26_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3704:2: rule__Sentence__FragmentsAssignment_1_0_26_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_26_1_in_rule__Sentence__Group_1_0_26__1__Impl7541);
            rule__Sentence__FragmentsAssignment_1_0_26_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_26_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_26__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_27__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3718:1: rule__Sentence__Group_1_0_27__0 : rule__Sentence__Group_1_0_27__0__Impl rule__Sentence__Group_1_0_27__1 ;
    public final void rule__Sentence__Group_1_0_27__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3722:1: ( rule__Sentence__Group_1_0_27__0__Impl rule__Sentence__Group_1_0_27__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3723:2: rule__Sentence__Group_1_0_27__0__Impl rule__Sentence__Group_1_0_27__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_27__0__Impl_in_rule__Sentence__Group_1_0_27__07575);
            rule__Sentence__Group_1_0_27__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_27__1_in_rule__Sentence__Group_1_0_27__07578);
            rule__Sentence__Group_1_0_27__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_27__0"


    // $ANTLR start "rule__Sentence__Group_1_0_27__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3730:1: rule__Sentence__Group_1_0_27__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_27_0 ) ) ;
    public final void rule__Sentence__Group_1_0_27__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3734:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_27_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3735:1: ( ( rule__Sentence__FragmentsAssignment_1_0_27_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3735:1: ( ( rule__Sentence__FragmentsAssignment_1_0_27_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3736:1: ( rule__Sentence__FragmentsAssignment_1_0_27_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_27_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3737:1: ( rule__Sentence__FragmentsAssignment_1_0_27_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3737:2: rule__Sentence__FragmentsAssignment_1_0_27_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_27_0_in_rule__Sentence__Group_1_0_27__0__Impl7605);
            rule__Sentence__FragmentsAssignment_1_0_27_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_27__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_27__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3747:1: rule__Sentence__Group_1_0_27__1 : rule__Sentence__Group_1_0_27__1__Impl rule__Sentence__Group_1_0_27__2 ;
    public final void rule__Sentence__Group_1_0_27__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3751:1: ( rule__Sentence__Group_1_0_27__1__Impl rule__Sentence__Group_1_0_27__2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3752:2: rule__Sentence__Group_1_0_27__1__Impl rule__Sentence__Group_1_0_27__2
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_27__1__Impl_in_rule__Sentence__Group_1_0_27__17635);
            rule__Sentence__Group_1_0_27__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_0_27__2_in_rule__Sentence__Group_1_0_27__17638);
            rule__Sentence__Group_1_0_27__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_27__1"


    // $ANTLR start "rule__Sentence__Group_1_0_27__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3759:1: rule__Sentence__Group_1_0_27__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_27_1 ) ) ;
    public final void rule__Sentence__Group_1_0_27__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3763:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_27_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3764:1: ( ( rule__Sentence__FragmentsAssignment_1_0_27_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3764:1: ( ( rule__Sentence__FragmentsAssignment_1_0_27_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3765:1: ( rule__Sentence__FragmentsAssignment_1_0_27_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_27_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3766:1: ( rule__Sentence__FragmentsAssignment_1_0_27_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3766:2: rule__Sentence__FragmentsAssignment_1_0_27_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_27_1_in_rule__Sentence__Group_1_0_27__1__Impl7665);
            rule__Sentence__FragmentsAssignment_1_0_27_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_27_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_27__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_0_27__2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3776:1: rule__Sentence__Group_1_0_27__2 : rule__Sentence__Group_1_0_27__2__Impl ;
    public final void rule__Sentence__Group_1_0_27__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3780:1: ( rule__Sentence__Group_1_0_27__2__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3781:2: rule__Sentence__Group_1_0_27__2__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_0_27__2__Impl_in_rule__Sentence__Group_1_0_27__27695);
            rule__Sentence__Group_1_0_27__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_27__2"


    // $ANTLR start "rule__Sentence__Group_1_0_27__2__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3787:1: rule__Sentence__Group_1_0_27__2__Impl : ( ( rule__Sentence__FragmentsAssignment_1_0_27_2 ) ) ;
    public final void rule__Sentence__Group_1_0_27__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3791:1: ( ( ( rule__Sentence__FragmentsAssignment_1_0_27_2 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3792:1: ( ( rule__Sentence__FragmentsAssignment_1_0_27_2 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3792:1: ( ( rule__Sentence__FragmentsAssignment_1_0_27_2 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3793:1: ( rule__Sentence__FragmentsAssignment_1_0_27_2 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_27_2()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3794:1: ( rule__Sentence__FragmentsAssignment_1_0_27_2 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3794:2: rule__Sentence__FragmentsAssignment_1_0_27_2
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_0_27_2_in_rule__Sentence__Group_1_0_27__2__Impl7722);
            rule__Sentence__FragmentsAssignment_1_0_27_2();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_0_27_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_0_27__2__Impl"


    // $ANTLR start "rule__Sentence__Group_1_1_2__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3810:1: rule__Sentence__Group_1_1_2__0 : rule__Sentence__Group_1_1_2__0__Impl rule__Sentence__Group_1_1_2__1 ;
    public final void rule__Sentence__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3814:1: ( rule__Sentence__Group_1_1_2__0__Impl rule__Sentence__Group_1_1_2__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3815:2: rule__Sentence__Group_1_1_2__0__Impl rule__Sentence__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_1_2__0__Impl_in_rule__Sentence__Group_1_1_2__07758);
            rule__Sentence__Group_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_1_2__1_in_rule__Sentence__Group_1_1_2__07761);
            rule__Sentence__Group_1_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_2__0"


    // $ANTLR start "rule__Sentence__Group_1_1_2__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3822:1: rule__Sentence__Group_1_1_2__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_1_2_0 ) ) ;
    public final void rule__Sentence__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3826:1: ( ( ( rule__Sentence__FragmentsAssignment_1_1_2_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3827:1: ( ( rule__Sentence__FragmentsAssignment_1_1_2_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3827:1: ( ( rule__Sentence__FragmentsAssignment_1_1_2_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3828:1: ( rule__Sentence__FragmentsAssignment_1_1_2_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_2_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3829:1: ( rule__Sentence__FragmentsAssignment_1_1_2_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3829:2: rule__Sentence__FragmentsAssignment_1_1_2_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_1_2_0_in_rule__Sentence__Group_1_1_2__0__Impl7788);
            rule__Sentence__FragmentsAssignment_1_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_1_2__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3839:1: rule__Sentence__Group_1_1_2__1 : rule__Sentence__Group_1_1_2__1__Impl ;
    public final void rule__Sentence__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3843:1: ( rule__Sentence__Group_1_1_2__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3844:2: rule__Sentence__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_1_2__1__Impl_in_rule__Sentence__Group_1_1_2__17818);
            rule__Sentence__Group_1_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_2__1"


    // $ANTLR start "rule__Sentence__Group_1_1_2__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3850:1: rule__Sentence__Group_1_1_2__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_1_2_1 ) ) ;
    public final void rule__Sentence__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3854:1: ( ( ( rule__Sentence__FragmentsAssignment_1_1_2_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3855:1: ( ( rule__Sentence__FragmentsAssignment_1_1_2_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3855:1: ( ( rule__Sentence__FragmentsAssignment_1_1_2_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3856:1: ( rule__Sentence__FragmentsAssignment_1_1_2_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_2_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3857:1: ( rule__Sentence__FragmentsAssignment_1_1_2_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3857:2: rule__Sentence__FragmentsAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_1_2_1_in_rule__Sentence__Group_1_1_2__1__Impl7845);
            rule__Sentence__FragmentsAssignment_1_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_1_3__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3871:1: rule__Sentence__Group_1_1_3__0 : rule__Sentence__Group_1_1_3__0__Impl rule__Sentence__Group_1_1_3__1 ;
    public final void rule__Sentence__Group_1_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3875:1: ( rule__Sentence__Group_1_1_3__0__Impl rule__Sentence__Group_1_1_3__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3876:2: rule__Sentence__Group_1_1_3__0__Impl rule__Sentence__Group_1_1_3__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_1_3__0__Impl_in_rule__Sentence__Group_1_1_3__07879);
            rule__Sentence__Group_1_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_1_3__1_in_rule__Sentence__Group_1_1_3__07882);
            rule__Sentence__Group_1_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_3__0"


    // $ANTLR start "rule__Sentence__Group_1_1_3__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3883:1: rule__Sentence__Group_1_1_3__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_1_3_0 ) ) ;
    public final void rule__Sentence__Group_1_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3887:1: ( ( ( rule__Sentence__FragmentsAssignment_1_1_3_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3888:1: ( ( rule__Sentence__FragmentsAssignment_1_1_3_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3888:1: ( ( rule__Sentence__FragmentsAssignment_1_1_3_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3889:1: ( rule__Sentence__FragmentsAssignment_1_1_3_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_3_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3890:1: ( rule__Sentence__FragmentsAssignment_1_1_3_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3890:2: rule__Sentence__FragmentsAssignment_1_1_3_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_1_3_0_in_rule__Sentence__Group_1_1_3__0__Impl7909);
            rule__Sentence__FragmentsAssignment_1_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_3__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_1_3__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3900:1: rule__Sentence__Group_1_1_3__1 : rule__Sentence__Group_1_1_3__1__Impl ;
    public final void rule__Sentence__Group_1_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3904:1: ( rule__Sentence__Group_1_1_3__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3905:2: rule__Sentence__Group_1_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_1_3__1__Impl_in_rule__Sentence__Group_1_1_3__17939);
            rule__Sentence__Group_1_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_3__1"


    // $ANTLR start "rule__Sentence__Group_1_1_3__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3911:1: rule__Sentence__Group_1_1_3__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_1_3_1 ) ) ;
    public final void rule__Sentence__Group_1_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3915:1: ( ( ( rule__Sentence__FragmentsAssignment_1_1_3_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3916:1: ( ( rule__Sentence__FragmentsAssignment_1_1_3_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3916:1: ( ( rule__Sentence__FragmentsAssignment_1_1_3_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3917:1: ( rule__Sentence__FragmentsAssignment_1_1_3_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_3_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3918:1: ( rule__Sentence__FragmentsAssignment_1_1_3_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3918:2: rule__Sentence__FragmentsAssignment_1_1_3_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_1_3_1_in_rule__Sentence__Group_1_1_3__1__Impl7966);
            rule__Sentence__FragmentsAssignment_1_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_3__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_1_4__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3932:1: rule__Sentence__Group_1_1_4__0 : rule__Sentence__Group_1_1_4__0__Impl rule__Sentence__Group_1_1_4__1 ;
    public final void rule__Sentence__Group_1_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3936:1: ( rule__Sentence__Group_1_1_4__0__Impl rule__Sentence__Group_1_1_4__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3937:2: rule__Sentence__Group_1_1_4__0__Impl rule__Sentence__Group_1_1_4__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_1_4__0__Impl_in_rule__Sentence__Group_1_1_4__08000);
            rule__Sentence__Group_1_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_1_4__1_in_rule__Sentence__Group_1_1_4__08003);
            rule__Sentence__Group_1_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_4__0"


    // $ANTLR start "rule__Sentence__Group_1_1_4__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3944:1: rule__Sentence__Group_1_1_4__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_1_4_0 ) ) ;
    public final void rule__Sentence__Group_1_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3948:1: ( ( ( rule__Sentence__FragmentsAssignment_1_1_4_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3949:1: ( ( rule__Sentence__FragmentsAssignment_1_1_4_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3949:1: ( ( rule__Sentence__FragmentsAssignment_1_1_4_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3950:1: ( rule__Sentence__FragmentsAssignment_1_1_4_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_4_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3951:1: ( rule__Sentence__FragmentsAssignment_1_1_4_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3951:2: rule__Sentence__FragmentsAssignment_1_1_4_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_1_4_0_in_rule__Sentence__Group_1_1_4__0__Impl8030);
            rule__Sentence__FragmentsAssignment_1_1_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_4__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_1_4__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3961:1: rule__Sentence__Group_1_1_4__1 : rule__Sentence__Group_1_1_4__1__Impl ;
    public final void rule__Sentence__Group_1_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3965:1: ( rule__Sentence__Group_1_1_4__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3966:2: rule__Sentence__Group_1_1_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_1_4__1__Impl_in_rule__Sentence__Group_1_1_4__18060);
            rule__Sentence__Group_1_1_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_4__1"


    // $ANTLR start "rule__Sentence__Group_1_1_4__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3972:1: rule__Sentence__Group_1_1_4__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_1_4_1 ) ) ;
    public final void rule__Sentence__Group_1_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3976:1: ( ( ( rule__Sentence__FragmentsAssignment_1_1_4_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3977:1: ( ( rule__Sentence__FragmentsAssignment_1_1_4_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3977:1: ( ( rule__Sentence__FragmentsAssignment_1_1_4_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3978:1: ( rule__Sentence__FragmentsAssignment_1_1_4_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_4_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3979:1: ( rule__Sentence__FragmentsAssignment_1_1_4_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3979:2: rule__Sentence__FragmentsAssignment_1_1_4_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_1_4_1_in_rule__Sentence__Group_1_1_4__1__Impl8087);
            rule__Sentence__FragmentsAssignment_1_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_4__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_1_5__0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3993:1: rule__Sentence__Group_1_1_5__0 : rule__Sentence__Group_1_1_5__0__Impl rule__Sentence__Group_1_1_5__1 ;
    public final void rule__Sentence__Group_1_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3997:1: ( rule__Sentence__Group_1_1_5__0__Impl rule__Sentence__Group_1_1_5__1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:3998:2: rule__Sentence__Group_1_1_5__0__Impl rule__Sentence__Group_1_1_5__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_1_5__0__Impl_in_rule__Sentence__Group_1_1_5__08121);
            rule__Sentence__Group_1_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_1_5__1_in_rule__Sentence__Group_1_1_5__08124);
            rule__Sentence__Group_1_1_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_5__0"


    // $ANTLR start "rule__Sentence__Group_1_1_5__0__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4005:1: rule__Sentence__Group_1_1_5__0__Impl : ( ( rule__Sentence__FragmentsAssignment_1_1_5_0 ) ) ;
    public final void rule__Sentence__Group_1_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4009:1: ( ( ( rule__Sentence__FragmentsAssignment_1_1_5_0 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4010:1: ( ( rule__Sentence__FragmentsAssignment_1_1_5_0 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4010:1: ( ( rule__Sentence__FragmentsAssignment_1_1_5_0 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4011:1: ( rule__Sentence__FragmentsAssignment_1_1_5_0 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_5_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4012:1: ( rule__Sentence__FragmentsAssignment_1_1_5_0 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4012:2: rule__Sentence__FragmentsAssignment_1_1_5_0
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_1_5_0_in_rule__Sentence__Group_1_1_5__0__Impl8151);
            rule__Sentence__FragmentsAssignment_1_1_5_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_5__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_1_5__1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4022:1: rule__Sentence__Group_1_1_5__1 : rule__Sentence__Group_1_1_5__1__Impl ;
    public final void rule__Sentence__Group_1_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4026:1: ( rule__Sentence__Group_1_1_5__1__Impl )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4027:2: rule__Sentence__Group_1_1_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_1_5__1__Impl_in_rule__Sentence__Group_1_1_5__18181);
            rule__Sentence__Group_1_1_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_5__1"


    // $ANTLR start "rule__Sentence__Group_1_1_5__1__Impl"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4033:1: rule__Sentence__Group_1_1_5__1__Impl : ( ( rule__Sentence__FragmentsAssignment_1_1_5_1 ) ) ;
    public final void rule__Sentence__Group_1_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4037:1: ( ( ( rule__Sentence__FragmentsAssignment_1_1_5_1 ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4038:1: ( ( rule__Sentence__FragmentsAssignment_1_1_5_1 ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4038:1: ( ( rule__Sentence__FragmentsAssignment_1_1_5_1 ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4039:1: ( rule__Sentence__FragmentsAssignment_1_1_5_1 )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_5_1()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4040:1: ( rule__Sentence__FragmentsAssignment_1_1_5_1 )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4040:2: rule__Sentence__FragmentsAssignment_1_1_5_1
            {
            pushFollow(FOLLOW_rule__Sentence__FragmentsAssignment_1_1_5_1_in_rule__Sentence__Group_1_1_5__1__Impl8208);
            rule__Sentence__FragmentsAssignment_1_1_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getFragmentsAssignment_1_1_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1_5__1__Impl"


    // $ANTLR start "rule__Model__HeaderAssignment_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4055:1: rule__Model__HeaderAssignment_0 : ( ruleSentence ) ;
    public final void rule__Model__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4059:1: ( ( ruleSentence ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4060:1: ( ruleSentence )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4060:1: ( ruleSentence )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4061:1: ruleSentence
            {
             before(grammarAccess.getModelAccess().getHeaderSentenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSentence_in_rule__Model__HeaderAssignment_08247);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getModelAccess().getHeaderSentenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__HeaderAssignment_0"


    // $ANTLR start "rule__Model__SectionsAssignment_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4070:1: rule__Model__SectionsAssignment_1 : ( ruleSection ) ;
    public final void rule__Model__SectionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4074:1: ( ( ruleSection ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4075:1: ( ruleSection )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4075:1: ( ruleSection )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4076:1: ruleSection
            {
             before(grammarAccess.getModelAccess().getSectionsSectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Model__SectionsAssignment_18278);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSectionsSectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SectionsAssignment_1"


    // $ANTLR start "rule__CommonsenseKnowledge__NameAssignment_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4085:1: rule__CommonsenseKnowledge__NameAssignment_1 : ( ruleCommonsenseKnowledgeHeader ) ;
    public final void rule__CommonsenseKnowledge__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4089:1: ( ( ruleCommonsenseKnowledgeHeader ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4090:1: ( ruleCommonsenseKnowledgeHeader )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4090:1: ( ruleCommonsenseKnowledgeHeader )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4091:1: ruleCommonsenseKnowledgeHeader
            {
             before(grammarAccess.getCommonsenseKnowledgeAccess().getNameCommonsenseKnowledgeHeaderParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCommonsenseKnowledgeHeader_in_rule__CommonsenseKnowledge__NameAssignment_18309);
            ruleCommonsenseKnowledgeHeader();

            state._fsp--;

             after(grammarAccess.getCommonsenseKnowledgeAccess().getNameCommonsenseKnowledgeHeaderParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledge__NameAssignment_1"


    // $ANTLR start "rule__CommonsenseKnowledge__BodyAssignment_2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4100:1: rule__CommonsenseKnowledge__BodyAssignment_2 : ( ruleDescription ) ;
    public final void rule__CommonsenseKnowledge__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4104:1: ( ( ruleDescription ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4105:1: ( ruleDescription )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4105:1: ( ruleDescription )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4106:1: ruleDescription
            {
             before(grammarAccess.getCommonsenseKnowledgeAccess().getBodyDescriptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__CommonsenseKnowledge__BodyAssignment_28340);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getCommonsenseKnowledgeAccess().getBodyDescriptionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonsenseKnowledge__BodyAssignment_2"


    // $ANTLR start "rule__ReflexiveKnowledge__NameAssignment_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4115:1: rule__ReflexiveKnowledge__NameAssignment_1 : ( ruleReflexiveKnowledgeHeader ) ;
    public final void rule__ReflexiveKnowledge__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4119:1: ( ( ruleReflexiveKnowledgeHeader ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4120:1: ( ruleReflexiveKnowledgeHeader )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4120:1: ( ruleReflexiveKnowledgeHeader )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4121:1: ruleReflexiveKnowledgeHeader
            {
             before(grammarAccess.getReflexiveKnowledgeAccess().getNameReflexiveKnowledgeHeaderParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReflexiveKnowledgeHeader_in_rule__ReflexiveKnowledge__NameAssignment_18371);
            ruleReflexiveKnowledgeHeader();

            state._fsp--;

             after(grammarAccess.getReflexiveKnowledgeAccess().getNameReflexiveKnowledgeHeaderParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledge__NameAssignment_1"


    // $ANTLR start "rule__ReflexiveKnowledge__SubsectionsAssignment_2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4130:1: rule__ReflexiveKnowledge__SubsectionsAssignment_2 : ( ruleReflexiveDescription ) ;
    public final void rule__ReflexiveKnowledge__SubsectionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4134:1: ( ( ruleReflexiveDescription ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4135:1: ( ruleReflexiveDescription )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4135:1: ( ruleReflexiveDescription )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4136:1: ruleReflexiveDescription
            {
             before(grammarAccess.getReflexiveKnowledgeAccess().getSubsectionsReflexiveDescriptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleReflexiveDescription_in_rule__ReflexiveKnowledge__SubsectionsAssignment_28402);
            ruleReflexiveDescription();

            state._fsp--;

             after(grammarAccess.getReflexiveKnowledgeAccess().getSubsectionsReflexiveDescriptionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveKnowledge__SubsectionsAssignment_2"


    // $ANTLR start "rule__ReflexiveDescription__NameAssignment_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4145:1: rule__ReflexiveDescription__NameAssignment_1 : ( ruleReflexiveDescriptionHeader ) ;
    public final void rule__ReflexiveDescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4149:1: ( ( ruleReflexiveDescriptionHeader ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4150:1: ( ruleReflexiveDescriptionHeader )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4150:1: ( ruleReflexiveDescriptionHeader )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4151:1: ruleReflexiveDescriptionHeader
            {
             before(grammarAccess.getReflexiveDescriptionAccess().getNameReflexiveDescriptionHeaderParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReflexiveDescriptionHeader_in_rule__ReflexiveDescription__NameAssignment_18433);
            ruleReflexiveDescriptionHeader();

            state._fsp--;

             after(grammarAccess.getReflexiveDescriptionAccess().getNameReflexiveDescriptionHeaderParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescription__NameAssignment_1"


    // $ANTLR start "rule__ReflexiveDescription__BodyAssignment_2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4160:1: rule__ReflexiveDescription__BodyAssignment_2 : ( ruleDescription ) ;
    public final void rule__ReflexiveDescription__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4164:1: ( ( ruleDescription ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4165:1: ( ruleDescription )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4165:1: ( ruleDescription )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4166:1: ruleDescription
            {
             before(grammarAccess.getReflexiveDescriptionAccess().getBodyDescriptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__ReflexiveDescription__BodyAssignment_28464);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getReflexiveDescriptionAccess().getBodyDescriptionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflexiveDescription__BodyAssignment_2"


    // $ANTLR start "rule__Perspective__NameAssignment_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4175:1: rule__Perspective__NameAssignment_1 : ( rulePerspectiveHeader ) ;
    public final void rule__Perspective__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4179:1: ( ( rulePerspectiveHeader ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4180:1: ( rulePerspectiveHeader )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4180:1: ( rulePerspectiveHeader )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4181:1: rulePerspectiveHeader
            {
             before(grammarAccess.getPerspectiveAccess().getNamePerspectiveHeaderParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePerspectiveHeader_in_rule__Perspective__NameAssignment_18495);
            rulePerspectiveHeader();

            state._fsp--;

             after(grammarAccess.getPerspectiveAccess().getNamePerspectiveHeaderParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__NameAssignment_1"


    // $ANTLR start "rule__Perspective__SubsectionsAssignment_2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4190:1: rule__Perspective__SubsectionsAssignment_2 : ( ruleStory ) ;
    public final void rule__Perspective__SubsectionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4194:1: ( ( ruleStory ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4195:1: ( ruleStory )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4195:1: ( ruleStory )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4196:1: ruleStory
            {
             before(grammarAccess.getPerspectiveAccess().getSubsectionsStoryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStory_in_rule__Perspective__SubsectionsAssignment_28526);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getPerspectiveAccess().getSubsectionsStoryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__SubsectionsAssignment_2"


    // $ANTLR start "rule__Story__NameAssignment_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4205:1: rule__Story__NameAssignment_1 : ( ruleStoryHeader ) ;
    public final void rule__Story__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4209:1: ( ( ruleStoryHeader ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4210:1: ( ruleStoryHeader )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4210:1: ( ruleStoryHeader )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4211:1: ruleStoryHeader
            {
             before(grammarAccess.getStoryAccess().getNameStoryHeaderParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStoryHeader_in_rule__Story__NameAssignment_18557);
            ruleStoryHeader();

            state._fsp--;

             after(grammarAccess.getStoryAccess().getNameStoryHeaderParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__NameAssignment_1"


    // $ANTLR start "rule__Story__BodyAssignment_2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4220:1: rule__Story__BodyAssignment_2 : ( ruleDescription ) ;
    public final void rule__Story__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4224:1: ( ( ruleDescription ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4225:1: ( ruleDescription )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4225:1: ( ruleDescription )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4226:1: ruleDescription
            {
             before(grammarAccess.getStoryAccess().getBodyDescriptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__Story__BodyAssignment_28588);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getStoryAccess().getBodyDescriptionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__BodyAssignment_2"


    // $ANTLR start "rule__Description__SentencesAssignment_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4235:1: rule__Description__SentencesAssignment_1 : ( ruleSentence ) ;
    public final void rule__Description__SentencesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4239:1: ( ( ruleSentence ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4240:1: ( ruleSentence )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4240:1: ( ruleSentence )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4241:1: ruleSentence
            {
             before(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSentence_in_rule__Description__SentencesAssignment_18619);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__SentencesAssignment_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4250:1: rule__Sentence__FragmentsAssignment_1_0_0 : ( ruleREGULAR_FRAGMENT ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4254:1: ( ( ruleREGULAR_FRAGMENT ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4255:1: ( ruleREGULAR_FRAGMENT )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4255:1: ( ruleREGULAR_FRAGMENT )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4256:1: ruleREGULAR_FRAGMENT
            {
             before(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_rule__Sentence__FragmentsAssignment_1_0_08650);
            ruleREGULAR_FRAGMENT();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_1_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4265:1: rule__Sentence__FragmentsAssignment_1_0_1_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4269:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4270:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4270:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4271:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_1_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4272:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4273:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_1_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_1_08686); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_1_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_1_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_1_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4288:1: rule__Sentence__FragmentsAssignment_1_0_1_1 : ( ( 'knowledge' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4292:1: ( ( ( 'knowledge' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4293:1: ( ( 'knowledge' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4293:1: ( ( 'knowledge' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4294:1: ( 'knowledge' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_1_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4295:1: ( 'knowledge' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4296:1: 'knowledge'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_1_1_0()); 
            match(input,13,FOLLOW_13_in_rule__Sentence__FragmentsAssignment_1_0_1_18730); 
             after(grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_1_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_1_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_2_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4311:1: rule__Sentence__FragmentsAssignment_1_0_2_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4315:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4316:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4316:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4317:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_2_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4318:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4319:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_2_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_2_08774); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_2_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_2_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_2_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4334:1: rule__Sentence__FragmentsAssignment_1_0_2_1 : ( ( 'commonsense' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4338:1: ( ( ( 'commonsense' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4339:1: ( ( 'commonsense' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4339:1: ( ( 'commonsense' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4340:1: ( 'commonsense' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_2_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4341:1: ( 'commonsense' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4342:1: 'commonsense'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_2_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Sentence__FragmentsAssignment_1_0_2_18818); 
             after(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_2_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_2_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_2_2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4357:1: rule__Sentence__FragmentsAssignment_1_0_2_2 : ( ruleREGULAR_FRAGMENT ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4361:1: ( ( ruleREGULAR_FRAGMENT ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4362:1: ( ruleREGULAR_FRAGMENT )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4362:1: ( ruleREGULAR_FRAGMENT )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4363:1: ruleREGULAR_FRAGMENT
            {
             before(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_2_2_0()); 
            pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_rule__Sentence__FragmentsAssignment_1_0_2_28857);
            ruleREGULAR_FRAGMENT();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_2_2"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_3_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4372:1: rule__Sentence__FragmentsAssignment_1_0_3_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4376:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4377:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4377:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4378:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_3_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4379:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4380:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_3_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_3_08893); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_3_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_3_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_3_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4395:1: rule__Sentence__FragmentsAssignment_1_0_3_1 : ( ( 'The' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4399:1: ( ( ( 'The' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4400:1: ( ( 'The' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4400:1: ( ( 'The' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4401:1: ( 'The' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_3_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4402:1: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4403:1: 'The'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_3_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_3_18937); 
             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_3_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_3_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_4_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4418:1: rule__Sentence__FragmentsAssignment_1_0_4_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4422:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4423:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4423:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4424:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_4_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4425:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4426:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_4_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_4_08981); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_4_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_4_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_4_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4441:1: rule__Sentence__FragmentsAssignment_1_0_4_1 : ( ( 'end' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4445:1: ( ( ( 'end' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4446:1: ( ( 'end' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4446:1: ( ( 'end' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4447:1: ( 'end' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsEndKeyword_1_0_4_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4448:1: ( 'end' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4449:1: 'end'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsEndKeyword_1_0_4_1_0()); 
            match(input,17,FOLLOW_17_in_rule__Sentence__FragmentsAssignment_1_0_4_19025); 
             after(grammarAccess.getSentenceAccess().getFragmentsEndKeyword_1_0_4_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsEndKeyword_1_0_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_4_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_5_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4464:1: rule__Sentence__FragmentsAssignment_1_0_5_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4468:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4469:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4469:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4470:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_5_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4471:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4472:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_5_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_5_09069); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_5_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_5_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_5_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4487:1: rule__Sentence__FragmentsAssignment_1_0_5_1 : ( ( 'of' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4491:1: ( ( ( 'of' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4492:1: ( ( 'of' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4492:1: ( ( 'of' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4493:1: ( 'of' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_5_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4494:1: ( 'of' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4495:1: 'of'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_5_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Sentence__FragmentsAssignment_1_0_5_19113); 
             after(grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_5_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_5_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_6_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4510:1: rule__Sentence__FragmentsAssignment_1_0_6_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4514:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4515:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4515:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4516:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_6_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4517:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4518:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_6_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_6_09157); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_6_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_6_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_6_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4533:1: rule__Sentence__FragmentsAssignment_1_0_6_1 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4537:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4538:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4538:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4539:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_6_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4540:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4541:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_6_1_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_6_19201); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_6_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_6_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_7_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4556:1: rule__Sentence__FragmentsAssignment_1_0_7_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4560:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4561:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4561:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4562:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_7_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4563:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4564:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_7_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_7_09245); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_7_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_7_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_7_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4579:1: rule__Sentence__FragmentsAssignment_1_0_7_1 : ( ruleREGULAR_FRAGMENT ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4583:1: ( ( ruleREGULAR_FRAGMENT ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4584:1: ( ruleREGULAR_FRAGMENT )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4584:1: ( ruleREGULAR_FRAGMENT )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4585:1: ruleREGULAR_FRAGMENT
            {
             before(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_7_1_0()); 
            pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_rule__Sentence__FragmentsAssignment_1_0_7_19284);
            ruleREGULAR_FRAGMENT();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_7_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_8"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4594:1: rule__Sentence__FragmentsAssignment_1_0_8 : ( ( 'knowledge' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4598:1: ( ( ( 'knowledge' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4599:1: ( ( 'knowledge' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4599:1: ( ( 'knowledge' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4600:1: ( 'knowledge' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_8_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4601:1: ( 'knowledge' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4602:1: 'knowledge'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_8_0()); 
            match(input,13,FOLLOW_13_in_rule__Sentence__FragmentsAssignment_1_0_89320); 
             after(grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_8_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_8"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_9"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4617:1: rule__Sentence__FragmentsAssignment_1_0_9 : ( ( 'commonsense' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4621:1: ( ( ( 'commonsense' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4622:1: ( ( 'commonsense' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4622:1: ( ( 'commonsense' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4623:1: ( 'commonsense' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_9_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4624:1: ( 'commonsense' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4625:1: 'commonsense'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_9_0()); 
            match(input,12,FOLLOW_12_in_rule__Sentence__FragmentsAssignment_1_0_99364); 
             after(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_9_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_9"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_10_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4640:1: rule__Sentence__FragmentsAssignment_1_0_10_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4644:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4645:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4645:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4646:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_10_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4647:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4648:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_10_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_10_09408); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_10_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_10_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_10_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4663:1: rule__Sentence__FragmentsAssignment_1_0_10_1 : ( ( 'reflexive' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4667:1: ( ( ( 'reflexive' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4668:1: ( ( 'reflexive' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4668:1: ( ( 'reflexive' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4669:1: ( 'reflexive' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_10_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4670:1: ( 'reflexive' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4671:1: 'reflexive'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_10_1_0()); 
            match(input,15,FOLLOW_15_in_rule__Sentence__FragmentsAssignment_1_0_10_19452); 
             after(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_10_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_10_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_10_2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4686:1: rule__Sentence__FragmentsAssignment_1_0_10_2 : ( ruleREGULAR_FRAGMENT ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4690:1: ( ( ruleREGULAR_FRAGMENT ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4691:1: ( ruleREGULAR_FRAGMENT )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4691:1: ( ruleREGULAR_FRAGMENT )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4692:1: ruleREGULAR_FRAGMENT
            {
             before(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_10_2_0()); 
            pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_rule__Sentence__FragmentsAssignment_1_0_10_29491);
            ruleREGULAR_FRAGMENT();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_10_2"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_11"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4701:1: rule__Sentence__FragmentsAssignment_1_0_11 : ( ( 'reflexive' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4705:1: ( ( ( 'reflexive' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4706:1: ( ( 'reflexive' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4706:1: ( ( 'reflexive' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4707:1: ( 'reflexive' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_11_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4708:1: ( 'reflexive' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4709:1: 'reflexive'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_11_0()); 
            match(input,15,FOLLOW_15_in_rule__Sentence__FragmentsAssignment_1_0_119527); 
             after(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_11_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_11"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_12_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4724:1: rule__Sentence__FragmentsAssignment_1_0_12_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4728:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4729:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4729:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4730:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_12_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4731:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4732:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_12_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_12_09571); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_12_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_12_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_12_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_12_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4747:1: rule__Sentence__FragmentsAssignment_1_0_12_1 : ( ( 'description' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4751:1: ( ( ( 'description' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4752:1: ( ( 'description' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4752:1: ( ( 'description' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4753:1: ( 'description' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_12_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4754:1: ( 'description' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4755:1: 'description'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_12_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Sentence__FragmentsAssignment_1_0_12_19615); 
             after(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_12_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_12_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_12_2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4770:1: rule__Sentence__FragmentsAssignment_1_0_12_2 : ( ruleREGULAR_FRAGMENT ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4774:1: ( ( ruleREGULAR_FRAGMENT ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4775:1: ( ruleREGULAR_FRAGMENT )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4775:1: ( ruleREGULAR_FRAGMENT )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4776:1: ruleREGULAR_FRAGMENT
            {
             before(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_12_2_0()); 
            pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_rule__Sentence__FragmentsAssignment_1_0_12_29654);
            ruleREGULAR_FRAGMENT();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_12_2"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_13"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4785:1: rule__Sentence__FragmentsAssignment_1_0_13 : ( ( 'description' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4789:1: ( ( ( 'description' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4790:1: ( ( 'description' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4790:1: ( ( 'description' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4791:1: ( 'description' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_13_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4792:1: ( 'description' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4793:1: 'description'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_13_0()); 
            match(input,18,FOLLOW_18_in_rule__Sentence__FragmentsAssignment_1_0_139690); 
             after(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_13_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_13"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_14"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4808:1: rule__Sentence__FragmentsAssignment_1_0_14 : ( ( 'of' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4812:1: ( ( ( 'of' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4813:1: ( ( 'of' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4813:1: ( ( 'of' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4814:1: ( 'of' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_14_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4815:1: ( 'of' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4816:1: 'of'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_14_0()); 
            match(input,19,FOLLOW_19_in_rule__Sentence__FragmentsAssignment_1_0_149734); 
             after(grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_14_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_14"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_15_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4831:1: rule__Sentence__FragmentsAssignment_1_0_15_0 : ( ( 'The' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4835:1: ( ( ( 'The' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4836:1: ( ( 'The' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4836:1: ( ( 'The' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4837:1: ( 'The' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_15_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4838:1: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4839:1: 'The'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_15_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_15_09778); 
             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_15_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_15_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_15_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_15_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4854:1: rule__Sentence__FragmentsAssignment_1_0_15_1 : ( ( 'commonsense' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4858:1: ( ( ( 'commonsense' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4859:1: ( ( 'commonsense' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4859:1: ( ( 'commonsense' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4860:1: ( 'commonsense' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_15_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4861:1: ( 'commonsense' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4862:1: 'commonsense'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_15_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Sentence__FragmentsAssignment_1_0_15_19822); 
             after(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_15_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_15_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_16_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4877:1: rule__Sentence__FragmentsAssignment_1_0_16_0 : ( ( 'The' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4881:1: ( ( ( 'The' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4882:1: ( ( 'The' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4882:1: ( ( 'The' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4883:1: ( 'The' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_16_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4884:1: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4885:1: 'The'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_16_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_16_09866); 
             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_16_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_16_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_16_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_16_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4900:1: rule__Sentence__FragmentsAssignment_1_0_16_1 : ( ( 'knowledge' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4904:1: ( ( ( 'knowledge' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4905:1: ( ( 'knowledge' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4905:1: ( ( 'knowledge' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4906:1: ( 'knowledge' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_16_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4907:1: ( 'knowledge' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4908:1: 'knowledge'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_16_1_0()); 
            match(input,13,FOLLOW_13_in_rule__Sentence__FragmentsAssignment_1_0_16_19910); 
             after(grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_16_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_16_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_16_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_17_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4923:1: rule__Sentence__FragmentsAssignment_1_0_17_0 : ( ( 'The' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_17_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4927:1: ( ( ( 'The' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4928:1: ( ( 'The' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4928:1: ( ( 'The' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4929:1: ( 'The' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_17_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4930:1: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4931:1: 'The'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_17_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_17_09954); 
             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_17_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_17_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_17_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_17_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4946:1: rule__Sentence__FragmentsAssignment_1_0_17_1 : ( ( 'reflexive' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4950:1: ( ( ( 'reflexive' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4951:1: ( ( 'reflexive' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4951:1: ( ( 'reflexive' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4952:1: ( 'reflexive' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_17_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4953:1: ( 'reflexive' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4954:1: 'reflexive'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_17_1_0()); 
            match(input,15,FOLLOW_15_in_rule__Sentence__FragmentsAssignment_1_0_17_19998); 
             after(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_17_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_17_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_17_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_18_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4969:1: rule__Sentence__FragmentsAssignment_1_0_18_0 : ( ( 'The' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_18_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4973:1: ( ( ( 'The' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4974:1: ( ( 'The' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4974:1: ( ( 'The' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4975:1: ( 'The' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_18_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4976:1: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4977:1: 'The'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_18_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_18_010042); 
             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_18_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_18_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_18_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_18_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4992:1: rule__Sentence__FragmentsAssignment_1_0_18_1 : ( ( 'description' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4996:1: ( ( ( 'description' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4997:1: ( ( 'description' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4997:1: ( ( 'description' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4998:1: ( 'description' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_18_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:4999:1: ( 'description' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5000:1: 'description'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_18_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Sentence__FragmentsAssignment_1_0_18_110086); 
             after(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_18_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_18_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_18_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_19_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5015:1: rule__Sentence__FragmentsAssignment_1_0_19_0 : ( ( 'The' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_19_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5019:1: ( ( ( 'The' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5020:1: ( ( 'The' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5020:1: ( ( 'The' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5021:1: ( 'The' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_19_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5022:1: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5023:1: 'The'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_19_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_19_010130); 
             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_19_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_19_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_19_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_19_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5038:1: rule__Sentence__FragmentsAssignment_1_0_19_1 : ( ( 'of' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_19_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5042:1: ( ( ( 'of' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5043:1: ( ( 'of' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5043:1: ( ( 'of' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5044:1: ( 'of' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_19_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5045:1: ( 'of' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5046:1: 'of'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_19_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Sentence__FragmentsAssignment_1_0_19_110174); 
             after(grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_19_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_19_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_19_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_20_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5061:1: rule__Sentence__FragmentsAssignment_1_0_20_0 : ( ( 'The' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_20_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5065:1: ( ( ( 'The' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5066:1: ( ( 'The' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5066:1: ( ( 'The' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5067:1: ( 'The' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_20_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5068:1: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5069:1: 'The'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_20_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_20_010218); 
             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_20_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_20_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_20_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_20_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5084:1: rule__Sentence__FragmentsAssignment_1_0_20_1 : ( ( 'story' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5088:1: ( ( ( 'story' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5089:1: ( ( 'story' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5089:1: ( ( 'story' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5090:1: ( 'story' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_20_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5091:1: ( 'story' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5092:1: 'story'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_20_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Sentence__FragmentsAssignment_1_0_20_110262); 
             after(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_20_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_20_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_20_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_21_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5107:1: rule__Sentence__FragmentsAssignment_1_0_21_0 : ( ( 'The' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_21_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5111:1: ( ( ( 'The' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5112:1: ( ( 'The' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5112:1: ( ( 'The' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5113:1: ( 'The' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_21_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5114:1: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5115:1: 'The'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_21_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_21_010306); 
             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_21_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_21_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_21_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_21_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5130:1: rule__Sentence__FragmentsAssignment_1_0_21_1 : ( ( 'titled' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_21_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5134:1: ( ( ( 'titled' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5135:1: ( ( 'titled' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5135:1: ( ( 'titled' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5136:1: ( 'titled' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_21_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5137:1: ( 'titled' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5138:1: 'titled'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_21_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Sentence__FragmentsAssignment_1_0_21_110350); 
             after(grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_21_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_21_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_21_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_22_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5153:1: rule__Sentence__FragmentsAssignment_1_0_22_0 : ( ( 'The' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_22_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5157:1: ( ( ( 'The' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5158:1: ( ( 'The' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5158:1: ( ( 'The' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5159:1: ( 'The' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_22_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5160:1: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5161:1: 'The'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_22_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_22_010394); 
             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_22_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_22_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_22_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_22_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5176:1: rule__Sentence__FragmentsAssignment_1_0_22_1 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_22_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5180:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5181:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5181:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5182:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_22_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5183:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5184:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_22_1_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_22_110438); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_22_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_22_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_22_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_23_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5199:1: rule__Sentence__FragmentsAssignment_1_0_23_0 : ( ( 'The' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_23_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5203:1: ( ( ( 'The' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5204:1: ( ( 'The' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5204:1: ( ( 'The' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5205:1: ( 'The' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_23_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5206:1: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5207:1: 'The'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_23_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_23_010482); 
             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_23_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_23_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_23_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_23_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5222:1: rule__Sentence__FragmentsAssignment_1_0_23_1 : ( ( 'The' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_23_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5226:1: ( ( ( 'The' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5227:1: ( ( 'The' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5227:1: ( ( 'The' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5228:1: ( 'The' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_23_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5229:1: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5230:1: 'The'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_23_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_23_110526); 
             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_23_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_23_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_23_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_24_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5245:1: rule__Sentence__FragmentsAssignment_1_0_24_0 : ( ( 'The' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_24_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5249:1: ( ( ( 'The' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5250:1: ( ( 'The' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5250:1: ( ( 'The' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5251:1: ( 'The' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_24_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5252:1: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5253:1: 'The'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_24_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_24_010570); 
             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_24_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_24_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_24_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_24_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5268:1: rule__Sentence__FragmentsAssignment_1_0_24_1 : ( ruleREGULAR_FRAGMENT ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_24_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5272:1: ( ( ruleREGULAR_FRAGMENT ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5273:1: ( ruleREGULAR_FRAGMENT )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5273:1: ( ruleREGULAR_FRAGMENT )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5274:1: ruleREGULAR_FRAGMENT
            {
             before(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_24_1_0()); 
            pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_rule__Sentence__FragmentsAssignment_1_0_24_110609);
            ruleREGULAR_FRAGMENT();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_24_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_24_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_25"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5283:1: rule__Sentence__FragmentsAssignment_1_0_25 : ( ( 'end' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5287:1: ( ( ( 'end' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5288:1: ( ( 'end' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5288:1: ( ( 'end' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5289:1: ( 'end' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsEndKeyword_1_0_25_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5290:1: ( 'end' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5291:1: 'end'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsEndKeyword_1_0_25_0()); 
            match(input,17,FOLLOW_17_in_rule__Sentence__FragmentsAssignment_1_0_2510645); 
             after(grammarAccess.getSentenceAccess().getFragmentsEndKeyword_1_0_25_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsEndKeyword_1_0_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_25"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_26_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5306:1: rule__Sentence__FragmentsAssignment_1_0_26_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_26_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5310:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5311:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5311:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5312:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_26_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5313:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5314:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_26_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_26_010689); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_26_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_26_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_26_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_26_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5329:1: rule__Sentence__FragmentsAssignment_1_0_26_1 : ( ( 'titled' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_26_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5333:1: ( ( ( 'titled' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5334:1: ( ( 'titled' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5334:1: ( ( 'titled' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5335:1: ( 'titled' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_26_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5336:1: ( 'titled' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5337:1: 'titled'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_26_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Sentence__FragmentsAssignment_1_0_26_110733); 
             after(grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_26_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_26_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_26_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_27_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5352:1: rule__Sentence__FragmentsAssignment_1_0_27_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_27_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5356:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5357:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5357:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5358:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_27_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5359:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5360:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_27_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_27_010777); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_27_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_27_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_27_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_27_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5375:1: rule__Sentence__FragmentsAssignment_1_0_27_1 : ( ( 'story' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_27_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5379:1: ( ( ( 'story' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5380:1: ( ( 'story' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5380:1: ( ( 'story' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5381:1: ( 'story' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_27_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5382:1: ( 'story' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5383:1: 'story'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_27_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Sentence__FragmentsAssignment_1_0_27_110821); 
             after(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_27_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_27_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_27_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_27_2"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5398:1: rule__Sentence__FragmentsAssignment_1_0_27_2 : ( ruleREGULAR_FRAGMENT ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_27_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5402:1: ( ( ruleREGULAR_FRAGMENT ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5403:1: ( ruleREGULAR_FRAGMENT )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5403:1: ( ruleREGULAR_FRAGMENT )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5404:1: ruleREGULAR_FRAGMENT
            {
             before(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_27_2_0()); 
            pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_rule__Sentence__FragmentsAssignment_1_0_27_210860);
            ruleREGULAR_FRAGMENT();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_27_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_27_2"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_28"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5413:1: rule__Sentence__FragmentsAssignment_1_0_28 : ( ( 'story' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5417:1: ( ( ( 'story' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5418:1: ( ( 'story' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5418:1: ( ( 'story' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5419:1: ( 'story' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_28_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5420:1: ( 'story' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5421:1: 'story'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_28_0()); 
            match(input,21,FOLLOW_21_in_rule__Sentence__FragmentsAssignment_1_0_2810896); 
             after(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_28_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_28_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_28"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_0_29"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5436:1: rule__Sentence__FragmentsAssignment_1_0_29 : ( ( 'titled' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_0_29() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5440:1: ( ( ( 'titled' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5441:1: ( ( 'titled' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5441:1: ( ( 'titled' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5442:1: ( 'titled' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_29_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5443:1: ( 'titled' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5444:1: 'titled'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_29_0()); 
            match(input,22,FOLLOW_22_in_rule__Sentence__FragmentsAssignment_1_0_2910940); 
             after(grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_29_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_29_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_0_29"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_1_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5459:1: rule__Sentence__FragmentsAssignment_1_1_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5463:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5464:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5464:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5465:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5466:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5467:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_1_010984); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_1_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_1_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5482:1: rule__Sentence__FragmentsAssignment_1_1_1 : ( ( 'The' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5486:1: ( ( ( 'The' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5487:1: ( ( 'The' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5487:1: ( ( 'The' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5488:1: ( 'The' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_1_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5489:1: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5490:1: 'The'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_1_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_1_111028); 
             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_1_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_1_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_1_2_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5505:1: rule__Sentence__FragmentsAssignment_1_1_2_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5509:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5510:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5510:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5511:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_2_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5512:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5513:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_2_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_1_2_011072); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_2_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_1_2_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_1_2_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5528:1: rule__Sentence__FragmentsAssignment_1_1_2_1 : ( ( 'commonsense' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5532:1: ( ( ( 'commonsense' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5533:1: ( ( 'commonsense' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5533:1: ( ( 'commonsense' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5534:1: ( 'commonsense' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_1_2_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5535:1: ( 'commonsense' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5536:1: 'commonsense'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_1_2_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Sentence__FragmentsAssignment_1_1_2_111116); 
             after(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_1_2_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_1_2_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_1_3_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5551:1: rule__Sentence__FragmentsAssignment_1_1_3_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5555:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5556:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5556:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5557:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_3_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5558:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5559:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_3_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_1_3_011160); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_3_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_1_3_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_1_3_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5574:1: rule__Sentence__FragmentsAssignment_1_1_3_1 : ( ( 'reflexive' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5578:1: ( ( ( 'reflexive' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5579:1: ( ( 'reflexive' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5579:1: ( ( 'reflexive' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5580:1: ( 'reflexive' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_1_3_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5581:1: ( 'reflexive' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5582:1: 'reflexive'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_1_3_1_0()); 
            match(input,15,FOLLOW_15_in_rule__Sentence__FragmentsAssignment_1_1_3_111204); 
             after(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_1_3_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_1_3_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_1_4_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5597:1: rule__Sentence__FragmentsAssignment_1_1_4_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5601:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5602:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5602:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5603:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_4_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5604:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5605:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_4_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_1_4_011248); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_4_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_1_4_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_1_4_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5620:1: rule__Sentence__FragmentsAssignment_1_1_4_1 : ( ( 'description' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5624:1: ( ( ( 'description' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5625:1: ( ( 'description' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5625:1: ( ( 'description' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5626:1: ( 'description' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_1_4_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5627:1: ( 'description' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5628:1: 'description'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_1_4_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Sentence__FragmentsAssignment_1_1_4_111292); 
             after(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_1_4_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_1_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_1_4_1"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_1_5_0"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5643:1: rule__Sentence__FragmentsAssignment_1_1_5_0 : ( ( 'Start' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_1_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5647:1: ( ( ( 'Start' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5648:1: ( ( 'Start' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5648:1: ( ( 'Start' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5649:1: ( 'Start' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_5_0_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5650:1: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5651:1: 'Start'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_5_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_1_5_011336); 
             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_5_0_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_1_5_0"


    // $ANTLR start "rule__Sentence__FragmentsAssignment_1_1_5_1"
    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5666:1: rule__Sentence__FragmentsAssignment_1_1_5_1 : ( ( 'story' ) ) ;
    public final void rule__Sentence__FragmentsAssignment_1_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5670:1: ( ( ( 'story' ) ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5671:1: ( ( 'story' ) )
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5671:1: ( ( 'story' ) )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5672:1: ( 'story' )
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_1_5_1_0()); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5673:1: ( 'story' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5674:1: 'story'
            {
             before(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_1_5_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Sentence__FragmentsAssignment_1_1_5_111380); 
             after(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_1_5_1_0()); 

            }

             after(grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_1_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__FragmentsAssignment_1_1_5_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\41\uffff";
    static final String DFA2_eofS =
        "\41\uffff";
    static final String DFA2_minS =
        "\1\4\1\uffff\1\4\5\uffff\1\4\30\uffff";
    static final String DFA2_maxS =
        "\1\26\1\uffff\1\26\5\uffff\1\26\30\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\uffff\1\11\1\12\1\14\1\16\1\17\1\uffff\1\32\1\35"+
        "\1\36\1\34\1\33\1\13\1\6\1\4\1\5\1\3\1\15\1\10\1\7\1\2\1\31\1\30"+
        "\1\23\1\22\1\26\1\24\1\25\1\21\1\20\1\27";
    static final String DFA2_specialS =
        "\41\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\1\3\uffff\2\1\1\2\1\4\1\3\1\uffff\1\5\1\10\1\11\1\6\1\7\1"+
            "\uffff\1\12\1\13",
            "",
            "\2\24\3\uffff\2\24\1\25\1\22\1\26\1\uffff\1\16\1\20\1\21\1"+
            "\23\1\17\1\uffff\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "\2\27\3\uffff\2\27\1\40\1\37\1\36\1\uffff\1\32\1\30\1\uffff"+
            "\1\31\1\34\1\uffff\1\35\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "536:1: rule__Sentence__Alternatives_1_0 : ( ( ( rule__Sentence__FragmentsAssignment_1_0_0 ) ) | ( ( rule__Sentence__Group_1_0_1__0 ) ) | ( ( rule__Sentence__Group_1_0_2__0 ) ) | ( ( rule__Sentence__Group_1_0_3__0 ) ) | ( ( rule__Sentence__Group_1_0_4__0 ) ) | ( ( rule__Sentence__Group_1_0_5__0 ) ) | ( ( rule__Sentence__Group_1_0_6__0 ) ) | ( ( rule__Sentence__Group_1_0_7__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_8 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_9 ) ) | ( ( rule__Sentence__Group_1_0_10__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_11 ) ) | ( ( rule__Sentence__Group_1_0_12__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_13 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_14 ) ) | ( ( rule__Sentence__Group_1_0_15__0 ) ) | ( ( rule__Sentence__Group_1_0_16__0 ) ) | ( ( rule__Sentence__Group_1_0_17__0 ) ) | ( ( rule__Sentence__Group_1_0_18__0 ) ) | ( ( rule__Sentence__Group_1_0_19__0 ) ) | ( ( rule__Sentence__Group_1_0_20__0 ) ) | ( ( rule__Sentence__Group_1_0_21__0 ) ) | ( ( rule__Sentence__Group_1_0_22__0 ) ) | ( ( rule__Sentence__Group_1_0_23__0 ) ) | ( ( rule__Sentence__Group_1_0_24__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_25 ) ) | ( ( rule__Sentence__Group_1_0_26__0 ) ) | ( ( rule__Sentence__Group_1_0_27__0 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_28 ) ) | ( ( rule__Sentence__FragmentsAssignment_1_0_29 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Alternatives_in_ruleSection154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonsenseKnowledge_in_entryRuleCommonsenseKnowledge181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonsenseKnowledge188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledge__Group__0_in_ruleCommonsenseKnowledge214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonsenseKnowledgeHeader_in_entryRuleCommonsenseKnowledgeHeader241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonsenseKnowledgeHeader248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledgeHeader__Group__0_in_ruleCommonsenseKnowledgeHeader274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflexiveKnowledge_in_entryRuleReflexiveKnowledge301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflexiveKnowledge308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledge__Group__0_in_ruleReflexiveKnowledge334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflexiveKnowledgeHeader_in_entryRuleReflexiveKnowledgeHeader361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflexiveKnowledgeHeader368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledgeHeader__Group__0_in_ruleReflexiveKnowledgeHeader394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflexiveDescription_in_entryRuleReflexiveDescription421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflexiveDescription428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveDescription__Group__0_in_ruleReflexiveDescription454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheEndFooter_in_entryRuleTheEndFooter481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheEndFooter488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TheEndFooter__Group__0_in_ruleTheEndFooter514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflexiveDescriptionHeader_in_entryRuleReflexiveDescriptionHeader541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflexiveDescriptionHeader548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveDescriptionHeader__Group__0_in_ruleReflexiveDescriptionHeader574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerspective_in_entryRulePerspective601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerspective608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perspective__Group__0_in_rulePerspective634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerspectiveHeader_in_entryRulePerspectiveHeader661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerspectiveHeader668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PerspectiveHeader__Group__0_in_rulePerspectiveHeader694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStory_in_entryRuleStory721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStory728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Story__Group__0_in_ruleStory754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoryHeader_in_entryRuleStoryHeader781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStoryHeader788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StoryHeader__Group__0_in_ruleStoryHeader814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__0_in_ruleDescription874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentence908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group__0_in_ruleSentence934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_entryRuleREGULAR_FRAGMENT961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREGULAR_FRAGMENT968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REGULAR_FRAGMENT__Alternatives_in_ruleREGULAR_FRAGMENT994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonsenseKnowledge_in_rule__Section__Alternatives1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflexiveKnowledge_in_rule__Section__Alternatives1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerspective_in_rule__Section__Alternatives1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_0_in_rule__Sentence__Alternatives_1_01096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_1__0_in_rule__Sentence__Alternatives_1_01114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_2__0_in_rule__Sentence__Alternatives_1_01132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_3__0_in_rule__Sentence__Alternatives_1_01150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_4__0_in_rule__Sentence__Alternatives_1_01168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_5__0_in_rule__Sentence__Alternatives_1_01186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_6__0_in_rule__Sentence__Alternatives_1_01204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_7__0_in_rule__Sentence__Alternatives_1_01222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_8_in_rule__Sentence__Alternatives_1_01240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_9_in_rule__Sentence__Alternatives_1_01258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_10__0_in_rule__Sentence__Alternatives_1_01276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_11_in_rule__Sentence__Alternatives_1_01294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_12__0_in_rule__Sentence__Alternatives_1_01312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_13_in_rule__Sentence__Alternatives_1_01330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_14_in_rule__Sentence__Alternatives_1_01348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_15__0_in_rule__Sentence__Alternatives_1_01366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_16__0_in_rule__Sentence__Alternatives_1_01384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_17__0_in_rule__Sentence__Alternatives_1_01402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_18__0_in_rule__Sentence__Alternatives_1_01420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_19__0_in_rule__Sentence__Alternatives_1_01438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_20__0_in_rule__Sentence__Alternatives_1_01456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_21__0_in_rule__Sentence__Alternatives_1_01474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_22__0_in_rule__Sentence__Alternatives_1_01492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_23__0_in_rule__Sentence__Alternatives_1_01510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_24__0_in_rule__Sentence__Alternatives_1_01528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_25_in_rule__Sentence__Alternatives_1_01546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_26__0_in_rule__Sentence__Alternatives_1_01564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_27__0_in_rule__Sentence__Alternatives_1_01582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_28_in_rule__Sentence__Alternatives_1_01600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_29_in_rule__Sentence__Alternatives_1_01618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_1_0_in_rule__Sentence__Alternatives_1_11651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_1_1_in_rule__Sentence__Alternatives_1_11669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_2__0_in_rule__Sentence__Alternatives_1_11687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_3__0_in_rule__Sentence__Alternatives_1_11705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_4__0_in_rule__Sentence__Alternatives_1_11723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_5__0_in_rule__Sentence__Alternatives_1_11741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUOTED_TEXT_in_rule__REGULAR_FRAGMENT__Alternatives1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__REGULAR_FRAGMENT__Alternatives1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__REGULAR_FRAGMENT__Alternatives1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__REGULAR_FRAGMENT__Alternatives1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01861 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HeaderAssignment_0_in_rule__Model__Group__0__Impl1891 = new BitSet(new long[]{0x00000000006FFE32L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SectionsAssignment_1_in_rule__Model__Group__1__Impl1949 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledge__Group__0__Impl_in_rule__CommonsenseKnowledge__Group__01984 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledge__Group__1_in_rule__CommonsenseKnowledge__Group__01987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledge__Group__1__Impl_in_rule__CommonsenseKnowledge__Group__12045 = new BitSet(new long[]{0x00000000006FFE30L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledge__Group__2_in_rule__CommonsenseKnowledge__Group__12048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledge__NameAssignment_1_in_rule__CommonsenseKnowledge__Group__1__Impl2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledge__Group__2__Impl_in_rule__CommonsenseKnowledge__Group__22105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledge__BodyAssignment_2_in_rule__CommonsenseKnowledge__Group__2__Impl2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledgeHeader__Group__0__Impl_in_rule__CommonsenseKnowledgeHeader__Group__02168 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledgeHeader__Group__1_in_rule__CommonsenseKnowledgeHeader__Group__02171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CommonsenseKnowledgeHeader__Group__0__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledgeHeader__Group__1__Impl_in_rule__CommonsenseKnowledgeHeader__Group__12230 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledgeHeader__Group__2_in_rule__CommonsenseKnowledgeHeader__Group__12233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CommonsenseKnowledgeHeader__Group__1__Impl2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledgeHeader__Group__2__Impl_in_rule__CommonsenseKnowledgeHeader__Group__22292 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledgeHeader__Group__3_in_rule__CommonsenseKnowledgeHeader__Group__22295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CommonsenseKnowledgeHeader__Group__2__Impl2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonsenseKnowledgeHeader__Group__3__Impl_in_rule__CommonsenseKnowledgeHeader__Group__32354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CommonsenseKnowledgeHeader__Group__3__Impl2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledge__Group__0__Impl_in_rule__ReflexiveKnowledge__Group__02421 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledge__Group__1_in_rule__ReflexiveKnowledge__Group__02424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledge__Group__1__Impl_in_rule__ReflexiveKnowledge__Group__12482 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledge__Group__2_in_rule__ReflexiveKnowledge__Group__12485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledge__NameAssignment_1_in_rule__ReflexiveKnowledge__Group__1__Impl2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledge__Group__2__Impl_in_rule__ReflexiveKnowledge__Group__22542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledge__SubsectionsAssignment_2_in_rule__ReflexiveKnowledge__Group__2__Impl2569 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledgeHeader__Group__0__Impl_in_rule__ReflexiveKnowledgeHeader__Group__02606 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledgeHeader__Group__1_in_rule__ReflexiveKnowledgeHeader__Group__02609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ReflexiveKnowledgeHeader__Group__0__Impl2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledgeHeader__Group__1__Impl_in_rule__ReflexiveKnowledgeHeader__Group__12668 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledgeHeader__Group__2_in_rule__ReflexiveKnowledgeHeader__Group__12671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ReflexiveKnowledgeHeader__Group__1__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledgeHeader__Group__2__Impl_in_rule__ReflexiveKnowledgeHeader__Group__22730 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledgeHeader__Group__3_in_rule__ReflexiveKnowledgeHeader__Group__22733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ReflexiveKnowledgeHeader__Group__2__Impl2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveKnowledgeHeader__Group__3__Impl_in_rule__ReflexiveKnowledgeHeader__Group__32792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ReflexiveKnowledgeHeader__Group__3__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveDescription__Group__0__Impl_in_rule__ReflexiveDescription__Group__02859 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ReflexiveDescription__Group__1_in_rule__ReflexiveDescription__Group__02862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveDescription__Group__1__Impl_in_rule__ReflexiveDescription__Group__12920 = new BitSet(new long[]{0x00000000006FFE30L});
    public static final BitSet FOLLOW_rule__ReflexiveDescription__Group__2_in_rule__ReflexiveDescription__Group__12923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveDescription__NameAssignment_1_in_rule__ReflexiveDescription__Group__1__Impl2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveDescription__Group__2__Impl_in_rule__ReflexiveDescription__Group__22980 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ReflexiveDescription__Group__3_in_rule__ReflexiveDescription__Group__22983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveDescription__BodyAssignment_2_in_rule__ReflexiveDescription__Group__2__Impl3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveDescription__Group__3__Impl_in_rule__ReflexiveDescription__Group__33040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheEndFooter_in_rule__ReflexiveDescription__Group__3__Impl3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TheEndFooter__Group__0__Impl_in_rule__TheEndFooter__Group__03104 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TheEndFooter__Group__1_in_rule__TheEndFooter__Group__03107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TheEndFooter__Group__0__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TheEndFooter__Group__1__Impl_in_rule__TheEndFooter__Group__13166 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__TheEndFooter__Group__2_in_rule__TheEndFooter__Group__13169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TheEndFooter__Group__1__Impl3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TheEndFooter__Group__2__Impl_in_rule__TheEndFooter__Group__23228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TheEndFooter__Group__2__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveDescriptionHeader__Group__0__Impl_in_rule__ReflexiveDescriptionHeader__Group__03293 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ReflexiveDescriptionHeader__Group__1_in_rule__ReflexiveDescriptionHeader__Group__03296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ReflexiveDescriptionHeader__Group__0__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveDescriptionHeader__Group__1__Impl_in_rule__ReflexiveDescriptionHeader__Group__13355 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ReflexiveDescriptionHeader__Group__2_in_rule__ReflexiveDescriptionHeader__Group__13358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ReflexiveDescriptionHeader__Group__1__Impl3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveDescriptionHeader__Group__2__Impl_in_rule__ReflexiveDescriptionHeader__Group__23417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ReflexiveDescriptionHeader__Group__3_in_rule__ReflexiveDescriptionHeader__Group__23420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ReflexiveDescriptionHeader__Group__2__Impl3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveDescriptionHeader__Group__3__Impl_in_rule__ReflexiveDescriptionHeader__Group__33479 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ReflexiveDescriptionHeader__Group__4_in_rule__ReflexiveDescriptionHeader__Group__33482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUOTED_TEXT_in_rule__ReflexiveDescriptionHeader__Group__3__Impl3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflexiveDescriptionHeader__Group__4__Impl_in_rule__ReflexiveDescriptionHeader__Group__43538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ReflexiveDescriptionHeader__Group__4__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perspective__Group__0__Impl_in_rule__Perspective__Group__03607 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_rule__Perspective__Group__1_in_rule__Perspective__Group__03610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perspective__Group__1__Impl_in_rule__Perspective__Group__13668 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Perspective__Group__2_in_rule__Perspective__Group__13671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perspective__NameAssignment_1_in_rule__Perspective__Group__1__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perspective__Group__2__Impl_in_rule__Perspective__Group__23728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perspective__SubsectionsAssignment_2_in_rule__Perspective__Group__2__Impl3755 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__PerspectiveHeader__Group__0__Impl_in_rule__PerspectiveHeader__Group__03792 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__PerspectiveHeader__Group__1_in_rule__PerspectiveHeader__Group__03795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__PerspectiveHeader__Group__0__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PerspectiveHeader__Group__1__Impl_in_rule__PerspectiveHeader__Group__13851 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PerspectiveHeader__Group__2_in_rule__PerspectiveHeader__Group__13854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PerspectiveHeader__Group__1__Impl3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PerspectiveHeader__Group__2__Impl_in_rule__PerspectiveHeader__Group__23913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PerspectiveHeader__Group__2__Impl3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Story__Group__0__Impl_in_rule__Story__Group__03978 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Story__Group__1_in_rule__Story__Group__03981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Story__Group__1__Impl_in_rule__Story__Group__14039 = new BitSet(new long[]{0x00000000006FFE30L});
    public static final BitSet FOLLOW_rule__Story__Group__2_in_rule__Story__Group__14042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Story__NameAssignment_1_in_rule__Story__Group__1__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Story__Group__2__Impl_in_rule__Story__Group__24099 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Story__Group__3_in_rule__Story__Group__24102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Story__BodyAssignment_2_in_rule__Story__Group__2__Impl4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Story__Group__3__Impl_in_rule__Story__Group__34159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheEndFooter_in_rule__Story__Group__3__Impl4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StoryHeader__Group__0__Impl_in_rule__StoryHeader__Group__04223 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StoryHeader__Group__1_in_rule__StoryHeader__Group__04226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__StoryHeader__Group__0__Impl4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StoryHeader__Group__1__Impl_in_rule__StoryHeader__Group__14285 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__StoryHeader__Group__2_in_rule__StoryHeader__Group__14288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StoryHeader__Group__1__Impl4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StoryHeader__Group__2__Impl_in_rule__StoryHeader__Group__24347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StoryHeader__Group__3_in_rule__StoryHeader__Group__24350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StoryHeader__Group__2__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StoryHeader__Group__3__Impl_in_rule__StoryHeader__Group__34409 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__StoryHeader__Group__4_in_rule__StoryHeader__Group__34412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUOTED_TEXT_in_rule__StoryHeader__Group__3__Impl4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StoryHeader__Group__4__Impl_in_rule__StoryHeader__Group__44468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StoryHeader__Group__4__Impl4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__0__Impl_in_rule__Description__Group__04537 = new BitSet(new long[]{0x00000000006FFE30L});
    public static final BitSet FOLLOW_rule__Description__Group__1_in_rule__Description__Group__04540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__1__Impl_in_rule__Description__Group__14598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__SentencesAssignment_1_in_rule__Description__Group__1__Impl4625 = new BitSet(new long[]{0x00000000006FFE32L});
    public static final BitSet FOLLOW_rule__Sentence__Group__0__Impl_in_rule__Sentence__Group__04660 = new BitSet(new long[]{0x00000000006FFE30L});
    public static final BitSet FOLLOW_rule__Sentence__Group__1_in_rule__Sentence__Group__04663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group__1__Impl_in_rule__Sentence__Group__14721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1__0_in_rule__Sentence__Group__1__Impl4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1__0__Impl_in_rule__Sentence__Group_1__04782 = new BitSet(new long[]{0x00000000006FFE30L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1__1_in_rule__Sentence__Group_1__04785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Alternatives_1_0_in_rule__Sentence__Group_1__0__Impl4812 = new BitSet(new long[]{0x00000000006FBE32L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1__1__Impl_in_rule__Sentence__Group_1__14843 = new BitSet(new long[]{0x00000000006FFE30L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1__2_in_rule__Sentence__Group_1__14846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Alternatives_1_1_in_rule__Sentence__Group_1__1__Impl4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1__2__Impl_in_rule__Sentence__Group_1__24904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Sentence__Group_1__2__Impl4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_1__0__Impl_in_rule__Sentence__Group_1_0_1__04969 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_1__1_in_rule__Sentence__Group_1_0_1__04972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_1_0_in_rule__Sentence__Group_1_0_1__0__Impl4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_1__1__Impl_in_rule__Sentence__Group_1_0_1__15029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_1_1_in_rule__Sentence__Group_1_0_1__1__Impl5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_2__0__Impl_in_rule__Sentence__Group_1_0_2__05090 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_2__1_in_rule__Sentence__Group_1_0_2__05093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_2_0_in_rule__Sentence__Group_1_0_2__0__Impl5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_2__1__Impl_in_rule__Sentence__Group_1_0_2__15150 = new BitSet(new long[]{0x0000000000000630L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_2__2_in_rule__Sentence__Group_1_0_2__15153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_2_1_in_rule__Sentence__Group_1_0_2__1__Impl5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_2__2__Impl_in_rule__Sentence__Group_1_0_2__25210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_2_2_in_rule__Sentence__Group_1_0_2__2__Impl5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_3__0__Impl_in_rule__Sentence__Group_1_0_3__05273 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_3__1_in_rule__Sentence__Group_1_0_3__05276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_3_0_in_rule__Sentence__Group_1_0_3__0__Impl5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_3__1__Impl_in_rule__Sentence__Group_1_0_3__15333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_3_1_in_rule__Sentence__Group_1_0_3__1__Impl5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_4__0__Impl_in_rule__Sentence__Group_1_0_4__05394 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_4__1_in_rule__Sentence__Group_1_0_4__05397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_4_0_in_rule__Sentence__Group_1_0_4__0__Impl5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_4__1__Impl_in_rule__Sentence__Group_1_0_4__15454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_4_1_in_rule__Sentence__Group_1_0_4__1__Impl5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_5__0__Impl_in_rule__Sentence__Group_1_0_5__05515 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_5__1_in_rule__Sentence__Group_1_0_5__05518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_5_0_in_rule__Sentence__Group_1_0_5__0__Impl5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_5__1__Impl_in_rule__Sentence__Group_1_0_5__15575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_5_1_in_rule__Sentence__Group_1_0_5__1__Impl5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_6__0__Impl_in_rule__Sentence__Group_1_0_6__05636 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_6__1_in_rule__Sentence__Group_1_0_6__05639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_6_0_in_rule__Sentence__Group_1_0_6__0__Impl5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_6__1__Impl_in_rule__Sentence__Group_1_0_6__15696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_6_1_in_rule__Sentence__Group_1_0_6__1__Impl5723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_7__0__Impl_in_rule__Sentence__Group_1_0_7__05757 = new BitSet(new long[]{0x0000000000000630L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_7__1_in_rule__Sentence__Group_1_0_7__05760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_7_0_in_rule__Sentence__Group_1_0_7__0__Impl5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_7__1__Impl_in_rule__Sentence__Group_1_0_7__15817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_7_1_in_rule__Sentence__Group_1_0_7__1__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_10__0__Impl_in_rule__Sentence__Group_1_0_10__05878 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_10__1_in_rule__Sentence__Group_1_0_10__05881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_10_0_in_rule__Sentence__Group_1_0_10__0__Impl5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_10__1__Impl_in_rule__Sentence__Group_1_0_10__15938 = new BitSet(new long[]{0x0000000000000630L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_10__2_in_rule__Sentence__Group_1_0_10__15941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_10_1_in_rule__Sentence__Group_1_0_10__1__Impl5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_10__2__Impl_in_rule__Sentence__Group_1_0_10__25998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_10_2_in_rule__Sentence__Group_1_0_10__2__Impl6025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_12__0__Impl_in_rule__Sentence__Group_1_0_12__06061 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_12__1_in_rule__Sentence__Group_1_0_12__06064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_12_0_in_rule__Sentence__Group_1_0_12__0__Impl6091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_12__1__Impl_in_rule__Sentence__Group_1_0_12__16121 = new BitSet(new long[]{0x0000000000000630L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_12__2_in_rule__Sentence__Group_1_0_12__16124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_12_1_in_rule__Sentence__Group_1_0_12__1__Impl6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_12__2__Impl_in_rule__Sentence__Group_1_0_12__26181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_12_2_in_rule__Sentence__Group_1_0_12__2__Impl6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_15__0__Impl_in_rule__Sentence__Group_1_0_15__06244 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_15__1_in_rule__Sentence__Group_1_0_15__06247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_15_0_in_rule__Sentence__Group_1_0_15__0__Impl6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_15__1__Impl_in_rule__Sentence__Group_1_0_15__16304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_15_1_in_rule__Sentence__Group_1_0_15__1__Impl6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_16__0__Impl_in_rule__Sentence__Group_1_0_16__06365 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_16__1_in_rule__Sentence__Group_1_0_16__06368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_16_0_in_rule__Sentence__Group_1_0_16__0__Impl6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_16__1__Impl_in_rule__Sentence__Group_1_0_16__16425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_16_1_in_rule__Sentence__Group_1_0_16__1__Impl6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_17__0__Impl_in_rule__Sentence__Group_1_0_17__06486 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_17__1_in_rule__Sentence__Group_1_0_17__06489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_17_0_in_rule__Sentence__Group_1_0_17__0__Impl6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_17__1__Impl_in_rule__Sentence__Group_1_0_17__16546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_17_1_in_rule__Sentence__Group_1_0_17__1__Impl6573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_18__0__Impl_in_rule__Sentence__Group_1_0_18__06607 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_18__1_in_rule__Sentence__Group_1_0_18__06610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_18_0_in_rule__Sentence__Group_1_0_18__0__Impl6637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_18__1__Impl_in_rule__Sentence__Group_1_0_18__16667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_18_1_in_rule__Sentence__Group_1_0_18__1__Impl6694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_19__0__Impl_in_rule__Sentence__Group_1_0_19__06728 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_19__1_in_rule__Sentence__Group_1_0_19__06731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_19_0_in_rule__Sentence__Group_1_0_19__0__Impl6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_19__1__Impl_in_rule__Sentence__Group_1_0_19__16788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_19_1_in_rule__Sentence__Group_1_0_19__1__Impl6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_20__0__Impl_in_rule__Sentence__Group_1_0_20__06849 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_20__1_in_rule__Sentence__Group_1_0_20__06852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_20_0_in_rule__Sentence__Group_1_0_20__0__Impl6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_20__1__Impl_in_rule__Sentence__Group_1_0_20__16909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_20_1_in_rule__Sentence__Group_1_0_20__1__Impl6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_21__0__Impl_in_rule__Sentence__Group_1_0_21__06970 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_21__1_in_rule__Sentence__Group_1_0_21__06973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_21_0_in_rule__Sentence__Group_1_0_21__0__Impl7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_21__1__Impl_in_rule__Sentence__Group_1_0_21__17030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_21_1_in_rule__Sentence__Group_1_0_21__1__Impl7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_22__0__Impl_in_rule__Sentence__Group_1_0_22__07091 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_22__1_in_rule__Sentence__Group_1_0_22__07094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_22_0_in_rule__Sentence__Group_1_0_22__0__Impl7121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_22__1__Impl_in_rule__Sentence__Group_1_0_22__17151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_22_1_in_rule__Sentence__Group_1_0_22__1__Impl7178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_23__0__Impl_in_rule__Sentence__Group_1_0_23__07212 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_23__1_in_rule__Sentence__Group_1_0_23__07215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_23_0_in_rule__Sentence__Group_1_0_23__0__Impl7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_23__1__Impl_in_rule__Sentence__Group_1_0_23__17272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_23_1_in_rule__Sentence__Group_1_0_23__1__Impl7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_24__0__Impl_in_rule__Sentence__Group_1_0_24__07333 = new BitSet(new long[]{0x0000000000000630L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_24__1_in_rule__Sentence__Group_1_0_24__07336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_24_0_in_rule__Sentence__Group_1_0_24__0__Impl7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_24__1__Impl_in_rule__Sentence__Group_1_0_24__17393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_24_1_in_rule__Sentence__Group_1_0_24__1__Impl7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_26__0__Impl_in_rule__Sentence__Group_1_0_26__07454 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_26__1_in_rule__Sentence__Group_1_0_26__07457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_26_0_in_rule__Sentence__Group_1_0_26__0__Impl7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_26__1__Impl_in_rule__Sentence__Group_1_0_26__17514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_26_1_in_rule__Sentence__Group_1_0_26__1__Impl7541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_27__0__Impl_in_rule__Sentence__Group_1_0_27__07575 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_27__1_in_rule__Sentence__Group_1_0_27__07578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_27_0_in_rule__Sentence__Group_1_0_27__0__Impl7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_27__1__Impl_in_rule__Sentence__Group_1_0_27__17635 = new BitSet(new long[]{0x0000000000000630L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_27__2_in_rule__Sentence__Group_1_0_27__17638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_27_1_in_rule__Sentence__Group_1_0_27__1__Impl7665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_0_27__2__Impl_in_rule__Sentence__Group_1_0_27__27695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_0_27_2_in_rule__Sentence__Group_1_0_27__2__Impl7722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_2__0__Impl_in_rule__Sentence__Group_1_1_2__07758 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_2__1_in_rule__Sentence__Group_1_1_2__07761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_1_2_0_in_rule__Sentence__Group_1_1_2__0__Impl7788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_2__1__Impl_in_rule__Sentence__Group_1_1_2__17818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_1_2_1_in_rule__Sentence__Group_1_1_2__1__Impl7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_3__0__Impl_in_rule__Sentence__Group_1_1_3__07879 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_3__1_in_rule__Sentence__Group_1_1_3__07882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_1_3_0_in_rule__Sentence__Group_1_1_3__0__Impl7909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_3__1__Impl_in_rule__Sentence__Group_1_1_3__17939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_1_3_1_in_rule__Sentence__Group_1_1_3__1__Impl7966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_4__0__Impl_in_rule__Sentence__Group_1_1_4__08000 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_4__1_in_rule__Sentence__Group_1_1_4__08003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_1_4_0_in_rule__Sentence__Group_1_1_4__0__Impl8030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_4__1__Impl_in_rule__Sentence__Group_1_1_4__18060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_1_4_1_in_rule__Sentence__Group_1_1_4__1__Impl8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_5__0__Impl_in_rule__Sentence__Group_1_1_5__08121 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_5__1_in_rule__Sentence__Group_1_1_5__08124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_1_5_0_in_rule__Sentence__Group_1_1_5__0__Impl8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1_5__1__Impl_in_rule__Sentence__Group_1_1_5__18181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__FragmentsAssignment_1_1_5_1_in_rule__Sentence__Group_1_1_5__1__Impl8208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_rule__Model__HeaderAssignment_08247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Model__SectionsAssignment_18278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonsenseKnowledgeHeader_in_rule__CommonsenseKnowledge__NameAssignment_18309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__CommonsenseKnowledge__BodyAssignment_28340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflexiveKnowledgeHeader_in_rule__ReflexiveKnowledge__NameAssignment_18371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflexiveDescription_in_rule__ReflexiveKnowledge__SubsectionsAssignment_28402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflexiveDescriptionHeader_in_rule__ReflexiveDescription__NameAssignment_18433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__ReflexiveDescription__BodyAssignment_28464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerspectiveHeader_in_rule__Perspective__NameAssignment_18495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStory_in_rule__Perspective__SubsectionsAssignment_28526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoryHeader_in_rule__Story__NameAssignment_18557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__Story__BodyAssignment_28588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_rule__Description__SentencesAssignment_18619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_rule__Sentence__FragmentsAssignment_1_0_08650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_1_08686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Sentence__FragmentsAssignment_1_0_1_18730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_2_08774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Sentence__FragmentsAssignment_1_0_2_18818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_rule__Sentence__FragmentsAssignment_1_0_2_28857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_3_08893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_3_18937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_4_08981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Sentence__FragmentsAssignment_1_0_4_19025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_5_09069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Sentence__FragmentsAssignment_1_0_5_19113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_6_09157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_6_19201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_7_09245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_rule__Sentence__FragmentsAssignment_1_0_7_19284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Sentence__FragmentsAssignment_1_0_89320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Sentence__FragmentsAssignment_1_0_99364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_10_09408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Sentence__FragmentsAssignment_1_0_10_19452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_rule__Sentence__FragmentsAssignment_1_0_10_29491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Sentence__FragmentsAssignment_1_0_119527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_12_09571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Sentence__FragmentsAssignment_1_0_12_19615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_rule__Sentence__FragmentsAssignment_1_0_12_29654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Sentence__FragmentsAssignment_1_0_139690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Sentence__FragmentsAssignment_1_0_149734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_15_09778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Sentence__FragmentsAssignment_1_0_15_19822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_16_09866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Sentence__FragmentsAssignment_1_0_16_19910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_17_09954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Sentence__FragmentsAssignment_1_0_17_19998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_18_010042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Sentence__FragmentsAssignment_1_0_18_110086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_19_010130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Sentence__FragmentsAssignment_1_0_19_110174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_20_010218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Sentence__FragmentsAssignment_1_0_20_110262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_21_010306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Sentence__FragmentsAssignment_1_0_21_110350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_22_010394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_22_110438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_23_010482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_23_110526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_0_24_010570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_rule__Sentence__FragmentsAssignment_1_0_24_110609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Sentence__FragmentsAssignment_1_0_2510645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_26_010689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Sentence__FragmentsAssignment_1_0_26_110733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_0_27_010777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Sentence__FragmentsAssignment_1_0_27_110821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_rule__Sentence__FragmentsAssignment_1_0_27_210860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Sentence__FragmentsAssignment_1_0_2810896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Sentence__FragmentsAssignment_1_0_2910940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_1_010984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sentence__FragmentsAssignment_1_1_111028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_1_2_011072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Sentence__FragmentsAssignment_1_1_2_111116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_1_3_011160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Sentence__FragmentsAssignment_1_1_3_111204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_1_4_011248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Sentence__FragmentsAssignment_1_1_4_111292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sentence__FragmentsAssignment_1_1_5_011336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Sentence__FragmentsAssignment_1_1_5_111380 = new BitSet(new long[]{0x0000000000000002L});

}