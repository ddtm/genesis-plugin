package org.csail.genesis.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.csail.genesis.services.GenesisGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGenesisParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_QUOTED_TEXT", "RULE_WORD", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Start'", "'commonsense'", "'knowledge'", "'.'", "'reflexive'", "'The'", "'end'", "'description'", "'of'", "'perspective'", "'story'", "'titled'", "','", "';'"
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
    public String getGrammarFileName() { return "../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g"; }



     	private GenesisGrammarAccess grammarAccess;
     	
        public InternalGenesisParser(TokenStream input, GenesisGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected GenesisGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_header_0_0= ruleSentence ) )* ( (lv_sections_1_0= ruleSection ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_sections_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:79:28: ( ( ( (lv_header_0_0= ruleSentence ) )* ( (lv_sections_1_0= ruleSection ) )* ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:80:1: ( ( (lv_header_0_0= ruleSentence ) )* ( (lv_sections_1_0= ruleSection ) )* )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:80:1: ( ( (lv_header_0_0= ruleSentence ) )* ( (lv_sections_1_0= ruleSection ) )* )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:80:2: ( (lv_header_0_0= ruleSentence ) )* ( (lv_sections_1_0= ruleSection ) )*
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:80:2: ( (lv_header_0_0= ruleSentence ) )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case 9:
                    {
                    switch ( input.LA(2) ) {
                    case RULE_QUOTED_TEXT:
                    case RULE_WORD:
                    case 9:
                    case 11:
                    case 12:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        {
                        alt1=1;
                        }
                        break;
                    case 10:
                        {
                        int LA1_5 = input.LA(3);

                        if ( ((LA1_5>=RULE_QUOTED_TEXT && LA1_5<=RULE_WORD)||LA1_5==12||(LA1_5>=21 && LA1_5<=22)) ) {
                            alt1=1;
                        }


                        }
                        break;
                    case 13:
                        {
                        int LA1_6 = input.LA(3);

                        if ( ((LA1_6>=RULE_QUOTED_TEXT && LA1_6<=RULE_WORD)||LA1_6==12||(LA1_6>=21 && LA1_6<=22)) ) {
                            alt1=1;
                        }


                        }
                        break;

                    }

                    }
                    break;
                case RULE_WORD:
                    {
                    int LA1_2 = input.LA(2);

                    if ( ((LA1_2>=RULE_QUOTED_TEXT && LA1_2<=RULE_WORD)||(LA1_2>=9 && LA1_2<=17)||(LA1_2>=19 && LA1_2<=22)) ) {
                        alt1=1;
                    }


                    }
                    break;
                case RULE_QUOTED_TEXT:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:81:1: (lv_header_0_0= ruleSentence )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:81:1: (lv_header_0_0= ruleSentence )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:82:3: lv_header_0_0= ruleSentence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getHeaderSentenceParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSentence_in_ruleModel131);
            	    lv_header_0_0=ruleSentence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"header",
            	            		lv_header_0_0, 
            	            		"Sentence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:98:3: ( (lv_sections_1_0= ruleSection ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WORD||LA2_0==9) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:99:1: (lv_sections_1_0= ruleSection )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:99:1: (lv_sections_1_0= ruleSection )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:100:3: lv_sections_1_0= ruleSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSectionsSectionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection_in_ruleModel153);
            	    lv_sections_1_0=ruleSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_1_0, 
            	            		"Section");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSection"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:124:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:125:2: (iv_ruleSection= ruleSection EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:126:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection190);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:133:1: ruleSection returns [EObject current=null] : (this_CommonsenseKnowledge_0= ruleCommonsenseKnowledge | this_ReflexiveKnowledge_1= ruleReflexiveKnowledge | this_Perspective_2= rulePerspective ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        EObject this_CommonsenseKnowledge_0 = null;

        EObject this_ReflexiveKnowledge_1 = null;

        EObject this_Perspective_2 = null;


         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:136:28: ( (this_CommonsenseKnowledge_0= ruleCommonsenseKnowledge | this_ReflexiveKnowledge_1= ruleReflexiveKnowledge | this_Perspective_2= rulePerspective ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:137:1: (this_CommonsenseKnowledge_0= ruleCommonsenseKnowledge | this_ReflexiveKnowledge_1= ruleReflexiveKnowledge | this_Perspective_2= rulePerspective )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:137:1: (this_CommonsenseKnowledge_0= ruleCommonsenseKnowledge | this_ReflexiveKnowledge_1= ruleReflexiveKnowledge | this_Perspective_2= rulePerspective )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==9) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==10) ) {
                    alt3=1;
                }
                else if ( (LA3_1==13) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_WORD) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:138:5: this_CommonsenseKnowledge_0= ruleCommonsenseKnowledge
                    {
                     
                            newCompositeNode(grammarAccess.getSectionAccess().getCommonsenseKnowledgeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCommonsenseKnowledge_in_ruleSection247);
                    this_CommonsenseKnowledge_0=ruleCommonsenseKnowledge();

                    state._fsp--;

                     
                            current = this_CommonsenseKnowledge_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:148:5: this_ReflexiveKnowledge_1= ruleReflexiveKnowledge
                    {
                     
                            newCompositeNode(grammarAccess.getSectionAccess().getReflexiveKnowledgeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReflexiveKnowledge_in_ruleSection274);
                    this_ReflexiveKnowledge_1=ruleReflexiveKnowledge();

                    state._fsp--;

                     
                            current = this_ReflexiveKnowledge_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:158:5: this_Perspective_2= rulePerspective
                    {
                     
                            newCompositeNode(grammarAccess.getSectionAccess().getPerspectiveParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePerspective_in_ruleSection301);
                    this_Perspective_2=rulePerspective();

                    state._fsp--;

                     
                            current = this_Perspective_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleCommonsenseKnowledge"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:174:1: entryRuleCommonsenseKnowledge returns [EObject current=null] : iv_ruleCommonsenseKnowledge= ruleCommonsenseKnowledge EOF ;
    public final EObject entryRuleCommonsenseKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonsenseKnowledge = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:175:2: (iv_ruleCommonsenseKnowledge= ruleCommonsenseKnowledge EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:176:2: iv_ruleCommonsenseKnowledge= ruleCommonsenseKnowledge EOF
            {
             newCompositeNode(grammarAccess.getCommonsenseKnowledgeRule()); 
            pushFollow(FOLLOW_ruleCommonsenseKnowledge_in_entryRuleCommonsenseKnowledge336);
            iv_ruleCommonsenseKnowledge=ruleCommonsenseKnowledge();

            state._fsp--;

             current =iv_ruleCommonsenseKnowledge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonsenseKnowledge346); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommonsenseKnowledge"


    // $ANTLR start "ruleCommonsenseKnowledge"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:183:1: ruleCommonsenseKnowledge returns [EObject current=null] : ( () ( (lv_name_1_0= ruleCommonsenseKnowledgeHeader ) ) ( (lv_body_2_0= ruleDescription ) ) ) ;
    public final EObject ruleCommonsenseKnowledge() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:186:28: ( ( () ( (lv_name_1_0= ruleCommonsenseKnowledgeHeader ) ) ( (lv_body_2_0= ruleDescription ) ) ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:187:1: ( () ( (lv_name_1_0= ruleCommonsenseKnowledgeHeader ) ) ( (lv_body_2_0= ruleDescription ) ) )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:187:1: ( () ( (lv_name_1_0= ruleCommonsenseKnowledgeHeader ) ) ( (lv_body_2_0= ruleDescription ) ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:187:2: () ( (lv_name_1_0= ruleCommonsenseKnowledgeHeader ) ) ( (lv_body_2_0= ruleDescription ) )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:187:2: ()
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:188:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCommonsenseKnowledgeAccess().getCommonsenseKnowledgeAction_0(),
                        current);
                

            }

            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:193:2: ( (lv_name_1_0= ruleCommonsenseKnowledgeHeader ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:194:1: (lv_name_1_0= ruleCommonsenseKnowledgeHeader )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:194:1: (lv_name_1_0= ruleCommonsenseKnowledgeHeader )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:195:3: lv_name_1_0= ruleCommonsenseKnowledgeHeader
            {
             
            	        newCompositeNode(grammarAccess.getCommonsenseKnowledgeAccess().getNameCommonsenseKnowledgeHeaderParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCommonsenseKnowledgeHeader_in_ruleCommonsenseKnowledge401);
            lv_name_1_0=ruleCommonsenseKnowledgeHeader();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommonsenseKnowledgeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"CommonsenseKnowledgeHeader");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:211:2: ( (lv_body_2_0= ruleDescription ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:212:1: (lv_body_2_0= ruleDescription )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:212:1: (lv_body_2_0= ruleDescription )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:213:3: lv_body_2_0= ruleDescription
            {
             
            	        newCompositeNode(grammarAccess.getCommonsenseKnowledgeAccess().getBodyDescriptionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDescription_in_ruleCommonsenseKnowledge422);
            lv_body_2_0=ruleDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommonsenseKnowledgeRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_2_0, 
                    		"Description");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommonsenseKnowledge"


    // $ANTLR start "entryRuleCommonsenseKnowledgeHeader"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:237:1: entryRuleCommonsenseKnowledgeHeader returns [String current=null] : iv_ruleCommonsenseKnowledgeHeader= ruleCommonsenseKnowledgeHeader EOF ;
    public final String entryRuleCommonsenseKnowledgeHeader() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommonsenseKnowledgeHeader = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:238:2: (iv_ruleCommonsenseKnowledgeHeader= ruleCommonsenseKnowledgeHeader EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:239:2: iv_ruleCommonsenseKnowledgeHeader= ruleCommonsenseKnowledgeHeader EOF
            {
             newCompositeNode(grammarAccess.getCommonsenseKnowledgeHeaderRule()); 
            pushFollow(FOLLOW_ruleCommonsenseKnowledgeHeader_in_entryRuleCommonsenseKnowledgeHeader459);
            iv_ruleCommonsenseKnowledgeHeader=ruleCommonsenseKnowledgeHeader();

            state._fsp--;

             current =iv_ruleCommonsenseKnowledgeHeader.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonsenseKnowledgeHeader470); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommonsenseKnowledgeHeader"


    // $ANTLR start "ruleCommonsenseKnowledgeHeader"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:246:1: ruleCommonsenseKnowledgeHeader returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Start' kw= 'commonsense' kw= 'knowledge' kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleCommonsenseKnowledgeHeader() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:249:28: ( (kw= 'Start' kw= 'commonsense' kw= 'knowledge' kw= '.' ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:250:1: (kw= 'Start' kw= 'commonsense' kw= 'knowledge' kw= '.' )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:250:1: (kw= 'Start' kw= 'commonsense' kw= 'knowledge' kw= '.' )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:251:2: kw= 'Start' kw= 'commonsense' kw= 'knowledge' kw= '.'
            {
            kw=(Token)match(input,9,FOLLOW_9_in_ruleCommonsenseKnowledgeHeader508); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCommonsenseKnowledgeHeaderAccess().getStartKeyword_0()); 
                
            kw=(Token)match(input,10,FOLLOW_10_in_ruleCommonsenseKnowledgeHeader521); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCommonsenseKnowledgeHeaderAccess().getCommonsenseKeyword_1()); 
                
            kw=(Token)match(input,11,FOLLOW_11_in_ruleCommonsenseKnowledgeHeader534); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCommonsenseKnowledgeHeaderAccess().getKnowledgeKeyword_2()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleCommonsenseKnowledgeHeader547); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCommonsenseKnowledgeHeaderAccess().getFullStopKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommonsenseKnowledgeHeader"


    // $ANTLR start "entryRuleReflexiveKnowledge"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:282:1: entryRuleReflexiveKnowledge returns [EObject current=null] : iv_ruleReflexiveKnowledge= ruleReflexiveKnowledge EOF ;
    public final EObject entryRuleReflexiveKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReflexiveKnowledge = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:283:2: (iv_ruleReflexiveKnowledge= ruleReflexiveKnowledge EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:284:2: iv_ruleReflexiveKnowledge= ruleReflexiveKnowledge EOF
            {
             newCompositeNode(grammarAccess.getReflexiveKnowledgeRule()); 
            pushFollow(FOLLOW_ruleReflexiveKnowledge_in_entryRuleReflexiveKnowledge587);
            iv_ruleReflexiveKnowledge=ruleReflexiveKnowledge();

            state._fsp--;

             current =iv_ruleReflexiveKnowledge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflexiveKnowledge597); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReflexiveKnowledge"


    // $ANTLR start "ruleReflexiveKnowledge"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:291:1: ruleReflexiveKnowledge returns [EObject current=null] : ( () ( (lv_name_1_0= ruleReflexiveKnowledgeHeader ) ) ( (lv_subsections_2_0= ruleReflexiveDescription ) )* ) ;
    public final EObject ruleReflexiveKnowledge() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_subsections_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:294:28: ( ( () ( (lv_name_1_0= ruleReflexiveKnowledgeHeader ) ) ( (lv_subsections_2_0= ruleReflexiveDescription ) )* ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:295:1: ( () ( (lv_name_1_0= ruleReflexiveKnowledgeHeader ) ) ( (lv_subsections_2_0= ruleReflexiveDescription ) )* )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:295:1: ( () ( (lv_name_1_0= ruleReflexiveKnowledgeHeader ) ) ( (lv_subsections_2_0= ruleReflexiveDescription ) )* )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:295:2: () ( (lv_name_1_0= ruleReflexiveKnowledgeHeader ) ) ( (lv_subsections_2_0= ruleReflexiveDescription ) )*
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:295:2: ()
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:296:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReflexiveKnowledgeAccess().getReflexiveKnowledgeAction_0(),
                        current);
                

            }

            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:301:2: ( (lv_name_1_0= ruleReflexiveKnowledgeHeader ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:302:1: (lv_name_1_0= ruleReflexiveKnowledgeHeader )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:302:1: (lv_name_1_0= ruleReflexiveKnowledgeHeader )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:303:3: lv_name_1_0= ruleReflexiveKnowledgeHeader
            {
             
            	        newCompositeNode(grammarAccess.getReflexiveKnowledgeAccess().getNameReflexiveKnowledgeHeaderParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReflexiveKnowledgeHeader_in_ruleReflexiveKnowledge652);
            lv_name_1_0=ruleReflexiveKnowledgeHeader();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReflexiveKnowledgeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ReflexiveKnowledgeHeader");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:319:2: ( (lv_subsections_2_0= ruleReflexiveDescription ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==9) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==16) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:320:1: (lv_subsections_2_0= ruleReflexiveDescription )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:320:1: (lv_subsections_2_0= ruleReflexiveDescription )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:321:3: lv_subsections_2_0= ruleReflexiveDescription
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReflexiveKnowledgeAccess().getSubsectionsReflexiveDescriptionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleReflexiveDescription_in_ruleReflexiveKnowledge673);
            	    lv_subsections_2_0=ruleReflexiveDescription();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReflexiveKnowledgeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subsections",
            	            		lv_subsections_2_0, 
            	            		"ReflexiveDescription");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReflexiveKnowledge"


    // $ANTLR start "entryRuleReflexiveKnowledgeHeader"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:345:1: entryRuleReflexiveKnowledgeHeader returns [String current=null] : iv_ruleReflexiveKnowledgeHeader= ruleReflexiveKnowledgeHeader EOF ;
    public final String entryRuleReflexiveKnowledgeHeader() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReflexiveKnowledgeHeader = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:346:2: (iv_ruleReflexiveKnowledgeHeader= ruleReflexiveKnowledgeHeader EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:347:2: iv_ruleReflexiveKnowledgeHeader= ruleReflexiveKnowledgeHeader EOF
            {
             newCompositeNode(grammarAccess.getReflexiveKnowledgeHeaderRule()); 
            pushFollow(FOLLOW_ruleReflexiveKnowledgeHeader_in_entryRuleReflexiveKnowledgeHeader711);
            iv_ruleReflexiveKnowledgeHeader=ruleReflexiveKnowledgeHeader();

            state._fsp--;

             current =iv_ruleReflexiveKnowledgeHeader.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflexiveKnowledgeHeader722); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReflexiveKnowledgeHeader"


    // $ANTLR start "ruleReflexiveKnowledgeHeader"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:354:1: ruleReflexiveKnowledgeHeader returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Start' kw= 'reflexive' kw= 'knowledge' kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleReflexiveKnowledgeHeader() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:357:28: ( (kw= 'Start' kw= 'reflexive' kw= 'knowledge' kw= '.' ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:358:1: (kw= 'Start' kw= 'reflexive' kw= 'knowledge' kw= '.' )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:358:1: (kw= 'Start' kw= 'reflexive' kw= 'knowledge' kw= '.' )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:359:2: kw= 'Start' kw= 'reflexive' kw= 'knowledge' kw= '.'
            {
            kw=(Token)match(input,9,FOLLOW_9_in_ruleReflexiveKnowledgeHeader760); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getReflexiveKnowledgeHeaderAccess().getStartKeyword_0()); 
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleReflexiveKnowledgeHeader773); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getReflexiveKnowledgeHeaderAccess().getReflexiveKeyword_1()); 
                
            kw=(Token)match(input,11,FOLLOW_11_in_ruleReflexiveKnowledgeHeader786); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getReflexiveKnowledgeHeaderAccess().getKnowledgeKeyword_2()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleReflexiveKnowledgeHeader799); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getReflexiveKnowledgeHeaderAccess().getFullStopKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReflexiveKnowledgeHeader"


    // $ANTLR start "entryRuleReflexiveDescription"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:390:1: entryRuleReflexiveDescription returns [EObject current=null] : iv_ruleReflexiveDescription= ruleReflexiveDescription EOF ;
    public final EObject entryRuleReflexiveDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReflexiveDescription = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:391:2: (iv_ruleReflexiveDescription= ruleReflexiveDescription EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:392:2: iv_ruleReflexiveDescription= ruleReflexiveDescription EOF
            {
             newCompositeNode(grammarAccess.getReflexiveDescriptionRule()); 
            pushFollow(FOLLOW_ruleReflexiveDescription_in_entryRuleReflexiveDescription839);
            iv_ruleReflexiveDescription=ruleReflexiveDescription();

            state._fsp--;

             current =iv_ruleReflexiveDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflexiveDescription849); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReflexiveDescription"


    // $ANTLR start "ruleReflexiveDescription"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:399:1: ruleReflexiveDescription returns [EObject current=null] : ( () ( (lv_name_1_0= ruleReflexiveDescriptionHeader ) ) ( (lv_body_2_0= ruleDescription ) ) ruleTheEndFooter ) ;
    public final EObject ruleReflexiveDescription() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:402:28: ( ( () ( (lv_name_1_0= ruleReflexiveDescriptionHeader ) ) ( (lv_body_2_0= ruleDescription ) ) ruleTheEndFooter ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:403:1: ( () ( (lv_name_1_0= ruleReflexiveDescriptionHeader ) ) ( (lv_body_2_0= ruleDescription ) ) ruleTheEndFooter )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:403:1: ( () ( (lv_name_1_0= ruleReflexiveDescriptionHeader ) ) ( (lv_body_2_0= ruleDescription ) ) ruleTheEndFooter )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:403:2: () ( (lv_name_1_0= ruleReflexiveDescriptionHeader ) ) ( (lv_body_2_0= ruleDescription ) ) ruleTheEndFooter
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:403:2: ()
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:404:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReflexiveDescriptionAccess().getReflexiveDescriptionAction_0(),
                        current);
                

            }

            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:409:2: ( (lv_name_1_0= ruleReflexiveDescriptionHeader ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:410:1: (lv_name_1_0= ruleReflexiveDescriptionHeader )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:410:1: (lv_name_1_0= ruleReflexiveDescriptionHeader )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:411:3: lv_name_1_0= ruleReflexiveDescriptionHeader
            {
             
            	        newCompositeNode(grammarAccess.getReflexiveDescriptionAccess().getNameReflexiveDescriptionHeaderParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReflexiveDescriptionHeader_in_ruleReflexiveDescription904);
            lv_name_1_0=ruleReflexiveDescriptionHeader();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReflexiveDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ReflexiveDescriptionHeader");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:427:2: ( (lv_body_2_0= ruleDescription ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:428:1: (lv_body_2_0= ruleDescription )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:428:1: (lv_body_2_0= ruleDescription )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:429:3: lv_body_2_0= ruleDescription
            {
             
            	        newCompositeNode(grammarAccess.getReflexiveDescriptionAccess().getBodyDescriptionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDescription_in_ruleReflexiveDescription925);
            lv_body_2_0=ruleDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReflexiveDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_2_0, 
                    		"Description");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getReflexiveDescriptionAccess().getTheEndFooterParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleTheEndFooter_in_ruleReflexiveDescription941);
            ruleTheEndFooter();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReflexiveDescription"


    // $ANTLR start "entryRuleTheEndFooter"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:461:1: entryRuleTheEndFooter returns [String current=null] : iv_ruleTheEndFooter= ruleTheEndFooter EOF ;
    public final String entryRuleTheEndFooter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTheEndFooter = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:462:2: (iv_ruleTheEndFooter= ruleTheEndFooter EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:463:2: iv_ruleTheEndFooter= ruleTheEndFooter EOF
            {
             newCompositeNode(grammarAccess.getTheEndFooterRule()); 
            pushFollow(FOLLOW_ruleTheEndFooter_in_entryRuleTheEndFooter977);
            iv_ruleTheEndFooter=ruleTheEndFooter();

            state._fsp--;

             current =iv_ruleTheEndFooter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheEndFooter988); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTheEndFooter"


    // $ANTLR start "ruleTheEndFooter"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:470:1: ruleTheEndFooter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'The' kw= 'end' kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleTheEndFooter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:473:28: ( (kw= 'The' kw= 'end' kw= '.' ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:474:1: (kw= 'The' kw= 'end' kw= '.' )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:474:1: (kw= 'The' kw= 'end' kw= '.' )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:475:2: kw= 'The' kw= 'end' kw= '.'
            {
            kw=(Token)match(input,14,FOLLOW_14_in_ruleTheEndFooter1026); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTheEndFooterAccess().getTheKeyword_0()); 
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleTheEndFooter1039); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTheEndFooterAccess().getEndKeyword_1()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleTheEndFooter1052); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTheEndFooterAccess().getFullStopKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTheEndFooter"


    // $ANTLR start "entryRuleReflexiveDescriptionHeader"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:500:1: entryRuleReflexiveDescriptionHeader returns [String current=null] : iv_ruleReflexiveDescriptionHeader= ruleReflexiveDescriptionHeader EOF ;
    public final String entryRuleReflexiveDescriptionHeader() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReflexiveDescriptionHeader = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:501:2: (iv_ruleReflexiveDescriptionHeader= ruleReflexiveDescriptionHeader EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:502:2: iv_ruleReflexiveDescriptionHeader= ruleReflexiveDescriptionHeader EOF
            {
             newCompositeNode(grammarAccess.getReflexiveDescriptionHeaderRule()); 
            pushFollow(FOLLOW_ruleReflexiveDescriptionHeader_in_entryRuleReflexiveDescriptionHeader1093);
            iv_ruleReflexiveDescriptionHeader=ruleReflexiveDescriptionHeader();

            state._fsp--;

             current =iv_ruleReflexiveDescriptionHeader.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflexiveDescriptionHeader1104); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReflexiveDescriptionHeader"


    // $ANTLR start "ruleReflexiveDescriptionHeader"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:509:1: ruleReflexiveDescriptionHeader returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Start' kw= 'description' kw= 'of' this_QUOTED_TEXT_3= RULE_QUOTED_TEXT kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleReflexiveDescriptionHeader() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_QUOTED_TEXT_3=null;

         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:512:28: ( (kw= 'Start' kw= 'description' kw= 'of' this_QUOTED_TEXT_3= RULE_QUOTED_TEXT kw= '.' ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:513:1: (kw= 'Start' kw= 'description' kw= 'of' this_QUOTED_TEXT_3= RULE_QUOTED_TEXT kw= '.' )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:513:1: (kw= 'Start' kw= 'description' kw= 'of' this_QUOTED_TEXT_3= RULE_QUOTED_TEXT kw= '.' )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:514:2: kw= 'Start' kw= 'description' kw= 'of' this_QUOTED_TEXT_3= RULE_QUOTED_TEXT kw= '.'
            {
            kw=(Token)match(input,9,FOLLOW_9_in_ruleReflexiveDescriptionHeader1142); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getReflexiveDescriptionHeaderAccess().getStartKeyword_0()); 
                
            kw=(Token)match(input,16,FOLLOW_16_in_ruleReflexiveDescriptionHeader1155); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getReflexiveDescriptionHeaderAccess().getDescriptionKeyword_1()); 
                
            kw=(Token)match(input,17,FOLLOW_17_in_ruleReflexiveDescriptionHeader1168); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getReflexiveDescriptionHeaderAccess().getOfKeyword_2()); 
                
            this_QUOTED_TEXT_3=(Token)match(input,RULE_QUOTED_TEXT,FOLLOW_RULE_QUOTED_TEXT_in_ruleReflexiveDescriptionHeader1183); 

            		current.merge(this_QUOTED_TEXT_3);
                
             
                newLeafNode(this_QUOTED_TEXT_3, grammarAccess.getReflexiveDescriptionHeaderAccess().getQUOTED_TEXTTerminalRuleCall_3()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleReflexiveDescriptionHeader1201); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getReflexiveDescriptionHeaderAccess().getFullStopKeyword_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReflexiveDescriptionHeader"


    // $ANTLR start "entryRulePerspective"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:552:1: entryRulePerspective returns [EObject current=null] : iv_rulePerspective= rulePerspective EOF ;
    public final EObject entryRulePerspective() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerspective = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:553:2: (iv_rulePerspective= rulePerspective EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:554:2: iv_rulePerspective= rulePerspective EOF
            {
             newCompositeNode(grammarAccess.getPerspectiveRule()); 
            pushFollow(FOLLOW_rulePerspective_in_entryRulePerspective1241);
            iv_rulePerspective=rulePerspective();

            state._fsp--;

             current =iv_rulePerspective; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerspective1251); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerspective"


    // $ANTLR start "rulePerspective"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:561:1: rulePerspective returns [EObject current=null] : ( () ( (lv_name_1_0= rulePerspectiveHeader ) ) ( (lv_subsections_2_0= ruleStory ) )* ) ;
    public final EObject rulePerspective() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_subsections_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:564:28: ( ( () ( (lv_name_1_0= rulePerspectiveHeader ) ) ( (lv_subsections_2_0= ruleStory ) )* ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:565:1: ( () ( (lv_name_1_0= rulePerspectiveHeader ) ) ( (lv_subsections_2_0= ruleStory ) )* )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:565:1: ( () ( (lv_name_1_0= rulePerspectiveHeader ) ) ( (lv_subsections_2_0= ruleStory ) )* )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:565:2: () ( (lv_name_1_0= rulePerspectiveHeader ) ) ( (lv_subsections_2_0= ruleStory ) )*
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:565:2: ()
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:566:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPerspectiveAccess().getPerspectiveAction_0(),
                        current);
                

            }

            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:571:2: ( (lv_name_1_0= rulePerspectiveHeader ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:572:1: (lv_name_1_0= rulePerspectiveHeader )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:572:1: (lv_name_1_0= rulePerspectiveHeader )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:573:3: lv_name_1_0= rulePerspectiveHeader
            {
             
            	        newCompositeNode(grammarAccess.getPerspectiveAccess().getNamePerspectiveHeaderParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePerspectiveHeader_in_rulePerspective1306);
            lv_name_1_0=rulePerspectiveHeader();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPerspectiveRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"PerspectiveHeader");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:589:2: ( (lv_subsections_2_0= ruleStory ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==9) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==19) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:590:1: (lv_subsections_2_0= ruleStory )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:590:1: (lv_subsections_2_0= ruleStory )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:591:3: lv_subsections_2_0= ruleStory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPerspectiveAccess().getSubsectionsStoryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStory_in_rulePerspective1327);
            	    lv_subsections_2_0=ruleStory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPerspectiveRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subsections",
            	            		lv_subsections_2_0, 
            	            		"Story");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerspective"


    // $ANTLR start "entryRulePerspectiveHeader"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:615:1: entryRulePerspectiveHeader returns [String current=null] : iv_rulePerspectiveHeader= rulePerspectiveHeader EOF ;
    public final String entryRulePerspectiveHeader() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePerspectiveHeader = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:616:2: (iv_rulePerspectiveHeader= rulePerspectiveHeader EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:617:2: iv_rulePerspectiveHeader= rulePerspectiveHeader EOF
            {
             newCompositeNode(grammarAccess.getPerspectiveHeaderRule()); 
            pushFollow(FOLLOW_rulePerspectiveHeader_in_entryRulePerspectiveHeader1365);
            iv_rulePerspectiveHeader=rulePerspectiveHeader();

            state._fsp--;

             current =iv_rulePerspectiveHeader.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerspectiveHeader1376); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerspectiveHeader"


    // $ANTLR start "rulePerspectiveHeader"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:624:1: rulePerspectiveHeader returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD kw= 'perspective' kw= '.' ) ;
    public final AntlrDatatypeRuleToken rulePerspectiveHeader() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:627:28: ( (this_WORD_0= RULE_WORD kw= 'perspective' kw= '.' ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:628:1: (this_WORD_0= RULE_WORD kw= 'perspective' kw= '.' )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:628:1: (this_WORD_0= RULE_WORD kw= 'perspective' kw= '.' )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:628:6: this_WORD_0= RULE_WORD kw= 'perspective' kw= '.'
            {
            this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rulePerspectiveHeader1416); 

            		current.merge(this_WORD_0);
                
             
                newLeafNode(this_WORD_0, grammarAccess.getPerspectiveHeaderAccess().getWORDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,18,FOLLOW_18_in_rulePerspectiveHeader1434); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPerspectiveHeaderAccess().getPerspectiveKeyword_1()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_rulePerspectiveHeader1447); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPerspectiveHeaderAccess().getFullStopKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerspectiveHeader"


    // $ANTLR start "entryRuleStory"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:655:1: entryRuleStory returns [EObject current=null] : iv_ruleStory= ruleStory EOF ;
    public final EObject entryRuleStory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStory = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:656:2: (iv_ruleStory= ruleStory EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:657:2: iv_ruleStory= ruleStory EOF
            {
             newCompositeNode(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_ruleStory_in_entryRuleStory1487);
            iv_ruleStory=ruleStory();

            state._fsp--;

             current =iv_ruleStory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStory1497); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:664:1: ruleStory returns [EObject current=null] : ( () ( (lv_name_1_0= ruleStoryHeader ) ) ( (lv_body_2_0= ruleDescription ) ) ruleTheEndFooter ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:667:28: ( ( () ( (lv_name_1_0= ruleStoryHeader ) ) ( (lv_body_2_0= ruleDescription ) ) ruleTheEndFooter ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:668:1: ( () ( (lv_name_1_0= ruleStoryHeader ) ) ( (lv_body_2_0= ruleDescription ) ) ruleTheEndFooter )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:668:1: ( () ( (lv_name_1_0= ruleStoryHeader ) ) ( (lv_body_2_0= ruleDescription ) ) ruleTheEndFooter )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:668:2: () ( (lv_name_1_0= ruleStoryHeader ) ) ( (lv_body_2_0= ruleDescription ) ) ruleTheEndFooter
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:668:2: ()
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:669:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStoryAccess().getStoryAction_0(),
                        current);
                

            }

            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:674:2: ( (lv_name_1_0= ruleStoryHeader ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:675:1: (lv_name_1_0= ruleStoryHeader )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:675:1: (lv_name_1_0= ruleStoryHeader )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:676:3: lv_name_1_0= ruleStoryHeader
            {
             
            	        newCompositeNode(grammarAccess.getStoryAccess().getNameStoryHeaderParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStoryHeader_in_ruleStory1552);
            lv_name_1_0=ruleStoryHeader();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStoryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"StoryHeader");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:692:2: ( (lv_body_2_0= ruleDescription ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:693:1: (lv_body_2_0= ruleDescription )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:693:1: (lv_body_2_0= ruleDescription )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:694:3: lv_body_2_0= ruleDescription
            {
             
            	        newCompositeNode(grammarAccess.getStoryAccess().getBodyDescriptionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDescription_in_ruleStory1573);
            lv_body_2_0=ruleDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStoryRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_2_0, 
                    		"Description");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getStoryAccess().getTheEndFooterParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleTheEndFooter_in_ruleStory1589);
            ruleTheEndFooter();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleStoryHeader"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:726:1: entryRuleStoryHeader returns [String current=null] : iv_ruleStoryHeader= ruleStoryHeader EOF ;
    public final String entryRuleStoryHeader() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStoryHeader = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:727:2: (iv_ruleStoryHeader= ruleStoryHeader EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:728:2: iv_ruleStoryHeader= ruleStoryHeader EOF
            {
             newCompositeNode(grammarAccess.getStoryHeaderRule()); 
            pushFollow(FOLLOW_ruleStoryHeader_in_entryRuleStoryHeader1625);
            iv_ruleStoryHeader=ruleStoryHeader();

            state._fsp--;

             current =iv_ruleStoryHeader.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStoryHeader1636); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStoryHeader"


    // $ANTLR start "ruleStoryHeader"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:735:1: ruleStoryHeader returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Start' kw= 'story' kw= 'titled' this_QUOTED_TEXT_3= RULE_QUOTED_TEXT kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleStoryHeader() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_QUOTED_TEXT_3=null;

         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:738:28: ( (kw= 'Start' kw= 'story' kw= 'titled' this_QUOTED_TEXT_3= RULE_QUOTED_TEXT kw= '.' ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:739:1: (kw= 'Start' kw= 'story' kw= 'titled' this_QUOTED_TEXT_3= RULE_QUOTED_TEXT kw= '.' )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:739:1: (kw= 'Start' kw= 'story' kw= 'titled' this_QUOTED_TEXT_3= RULE_QUOTED_TEXT kw= '.' )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:740:2: kw= 'Start' kw= 'story' kw= 'titled' this_QUOTED_TEXT_3= RULE_QUOTED_TEXT kw= '.'
            {
            kw=(Token)match(input,9,FOLLOW_9_in_ruleStoryHeader1674); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStoryHeaderAccess().getStartKeyword_0()); 
                
            kw=(Token)match(input,19,FOLLOW_19_in_ruleStoryHeader1687); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStoryHeaderAccess().getStoryKeyword_1()); 
                
            kw=(Token)match(input,20,FOLLOW_20_in_ruleStoryHeader1700); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStoryHeaderAccess().getTitledKeyword_2()); 
                
            this_QUOTED_TEXT_3=(Token)match(input,RULE_QUOTED_TEXT,FOLLOW_RULE_QUOTED_TEXT_in_ruleStoryHeader1715); 

            		current.merge(this_QUOTED_TEXT_3);
                
             
                newLeafNode(this_QUOTED_TEXT_3, grammarAccess.getStoryHeaderAccess().getQUOTED_TEXTTerminalRuleCall_3()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleStoryHeader1733); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStoryHeaderAccess().getFullStopKeyword_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStoryHeader"


    // $ANTLR start "entryRuleDescription"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:778:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:779:2: (iv_ruleDescription= ruleDescription EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:780:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription1773);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription1783); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:787:1: ruleDescription returns [EObject current=null] : ( () ( (lv_sentences_1_0= ruleSentence ) )* ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        EObject lv_sentences_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:790:28: ( ( () ( (lv_sentences_1_0= ruleSentence ) )* ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:791:1: ( () ( (lv_sentences_1_0= ruleSentence ) )* )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:791:1: ( () ( (lv_sentences_1_0= ruleSentence ) )* )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:791:2: () ( (lv_sentences_1_0= ruleSentence ) )*
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:791:2: ()
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:792:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDescriptionAccess().getDescriptionAction_0(),
                        current);
                

            }

            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:797:2: ( (lv_sentences_1_0= ruleSentence ) )*
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case 9:
                    {
                    switch ( input.LA(2) ) {
                    case RULE_QUOTED_TEXT:
                    case RULE_WORD:
                    case 9:
                    case 11:
                    case 12:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        {
                        alt6=1;
                        }
                        break;
                    case 13:
                        {
                        int LA6_6 = input.LA(3);

                        if ( ((LA6_6>=RULE_QUOTED_TEXT && LA6_6<=RULE_WORD)||LA6_6==12||(LA6_6>=21 && LA6_6<=22)) ) {
                            alt6=1;
                        }


                        }
                        break;
                    case 10:
                        {
                        int LA6_7 = input.LA(3);

                        if ( ((LA6_7>=RULE_QUOTED_TEXT && LA6_7<=RULE_WORD)||LA6_7==12||(LA6_7>=21 && LA6_7<=22)) ) {
                            alt6=1;
                        }


                        }
                        break;

                    }

                    }
                    break;
                case RULE_WORD:
                    {
                    int LA6_3 = input.LA(2);

                    if ( ((LA6_3>=RULE_QUOTED_TEXT && LA6_3<=RULE_WORD)||(LA6_3>=9 && LA6_3<=17)||(LA6_3>=19 && LA6_3<=22)) ) {
                        alt6=1;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA6_4 = input.LA(2);

                    if ( ((LA6_4>=RULE_QUOTED_TEXT && LA6_4<=RULE_WORD)||(LA6_4>=9 && LA6_4<=14)||(LA6_4>=16 && LA6_4<=17)||(LA6_4>=19 && LA6_4<=22)) ) {
                        alt6=1;
                    }


                    }
                    break;
                case RULE_QUOTED_TEXT:
                case 10:
                case 11:
                case 12:
                case 13:
                case 15:
                case 16:
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                    {
                    alt6=1;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:798:1: (lv_sentences_1_0= ruleSentence )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:798:1: (lv_sentences_1_0= ruleSentence )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:799:3: lv_sentences_1_0= ruleSentence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSentence_in_ruleDescription1838);
            	    lv_sentences_1_0=ruleSentence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDescriptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentences",
            	            		lv_sentences_1_0, 
            	            		"Sentence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleSentence"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:823:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:824:2: (iv_ruleSentence= ruleSentence EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:825:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_ruleSentence_in_entryRuleSentence1875);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentence1885); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:832:1: ruleSentence returns [EObject current=null] : ( () ( ( ( (lv_fragments_1_0= ruleREGULAR_FRAGMENT ) ) | ( ( (lv_fragments_2_0= 'Start' ) ) ( (lv_fragments_3_0= 'knowledge' ) ) ) | ( ( (lv_fragments_4_0= 'Start' ) ) ( (lv_fragments_5_0= 'commonsense' ) ) ( (lv_fragments_6_0= ruleREGULAR_FRAGMENT ) ) ) | ( ( (lv_fragments_7_0= 'Start' ) ) ( (lv_fragments_8_0= 'The' ) ) ) | ( ( (lv_fragments_9_0= 'Start' ) ) ( (lv_fragments_10_0= 'end' ) ) ) | ( ( (lv_fragments_11_0= 'Start' ) ) ( (lv_fragments_12_0= 'of' ) ) ) | ( ( (lv_fragments_13_0= 'Start' ) ) ( (lv_fragments_14_0= 'Start' ) ) ) | ( ( (lv_fragments_15_0= 'Start' ) ) ( (lv_fragments_16_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_17_0= 'knowledge' ) ) | ( (lv_fragments_18_0= 'commonsense' ) ) | ( ( (lv_fragments_19_0= 'Start' ) ) ( (lv_fragments_20_0= 'reflexive' ) ) ( (lv_fragments_21_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_22_0= 'reflexive' ) ) | ( ( (lv_fragments_23_0= 'Start' ) ) ( (lv_fragments_24_0= 'description' ) ) ( (lv_fragments_25_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_26_0= 'description' ) ) | ( (lv_fragments_27_0= 'of' ) ) | ( ( (lv_fragments_28_0= 'The' ) ) ( (lv_fragments_29_0= 'commonsense' ) ) ) | ( ( (lv_fragments_30_0= 'The' ) ) ( (lv_fragments_31_0= 'knowledge' ) ) ) | ( ( (lv_fragments_32_0= 'The' ) ) ( (lv_fragments_33_0= 'reflexive' ) ) ) | ( ( (lv_fragments_34_0= 'The' ) ) ( (lv_fragments_35_0= 'description' ) ) ) | ( ( (lv_fragments_36_0= 'The' ) ) ( (lv_fragments_37_0= 'of' ) ) ) | ( ( (lv_fragments_38_0= 'The' ) ) ( (lv_fragments_39_0= 'story' ) ) ) | ( ( (lv_fragments_40_0= 'The' ) ) ( (lv_fragments_41_0= 'titled' ) ) ) | ( ( (lv_fragments_42_0= 'The' ) ) ( (lv_fragments_43_0= 'Start' ) ) ) | ( ( (lv_fragments_44_0= 'The' ) ) ( (lv_fragments_45_0= 'The' ) ) ) | ( ( (lv_fragments_46_0= 'The' ) ) ( (lv_fragments_47_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_48_0= 'end' ) ) | ( ( (lv_fragments_49_0= 'Start' ) ) ( (lv_fragments_50_0= 'titled' ) ) ) | ( ( (lv_fragments_51_0= 'Start' ) ) ( (lv_fragments_52_0= 'story' ) ) ( (lv_fragments_53_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_54_0= 'story' ) ) | ( (lv_fragments_55_0= 'titled' ) ) )* ( ( (lv_fragments_56_0= 'Start' ) ) | ( (lv_fragments_57_0= 'The' ) ) | ( ( (lv_fragments_58_0= 'Start' ) ) ( (lv_fragments_59_0= 'commonsense' ) ) ) | ( ( (lv_fragments_60_0= 'Start' ) ) ( (lv_fragments_61_0= 'reflexive' ) ) ) | ( ( (lv_fragments_62_0= 'Start' ) ) ( (lv_fragments_63_0= 'description' ) ) ) | ( ( (lv_fragments_64_0= 'Start' ) ) ( (lv_fragments_65_0= 'story' ) ) ) )? otherlv_66= '.' ) ) ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        Token lv_fragments_2_0=null;
        Token lv_fragments_3_0=null;
        Token lv_fragments_4_0=null;
        Token lv_fragments_5_0=null;
        Token lv_fragments_7_0=null;
        Token lv_fragments_8_0=null;
        Token lv_fragments_9_0=null;
        Token lv_fragments_10_0=null;
        Token lv_fragments_11_0=null;
        Token lv_fragments_12_0=null;
        Token lv_fragments_13_0=null;
        Token lv_fragments_14_0=null;
        Token lv_fragments_15_0=null;
        Token lv_fragments_17_0=null;
        Token lv_fragments_18_0=null;
        Token lv_fragments_19_0=null;
        Token lv_fragments_20_0=null;
        Token lv_fragments_22_0=null;
        Token lv_fragments_23_0=null;
        Token lv_fragments_24_0=null;
        Token lv_fragments_26_0=null;
        Token lv_fragments_27_0=null;
        Token lv_fragments_28_0=null;
        Token lv_fragments_29_0=null;
        Token lv_fragments_30_0=null;
        Token lv_fragments_31_0=null;
        Token lv_fragments_32_0=null;
        Token lv_fragments_33_0=null;
        Token lv_fragments_34_0=null;
        Token lv_fragments_35_0=null;
        Token lv_fragments_36_0=null;
        Token lv_fragments_37_0=null;
        Token lv_fragments_38_0=null;
        Token lv_fragments_39_0=null;
        Token lv_fragments_40_0=null;
        Token lv_fragments_41_0=null;
        Token lv_fragments_42_0=null;
        Token lv_fragments_43_0=null;
        Token lv_fragments_44_0=null;
        Token lv_fragments_45_0=null;
        Token lv_fragments_46_0=null;
        Token lv_fragments_48_0=null;
        Token lv_fragments_49_0=null;
        Token lv_fragments_50_0=null;
        Token lv_fragments_51_0=null;
        Token lv_fragments_52_0=null;
        Token lv_fragments_54_0=null;
        Token lv_fragments_55_0=null;
        Token lv_fragments_56_0=null;
        Token lv_fragments_57_0=null;
        Token lv_fragments_58_0=null;
        Token lv_fragments_59_0=null;
        Token lv_fragments_60_0=null;
        Token lv_fragments_61_0=null;
        Token lv_fragments_62_0=null;
        Token lv_fragments_63_0=null;
        Token lv_fragments_64_0=null;
        Token lv_fragments_65_0=null;
        Token otherlv_66=null;
        AntlrDatatypeRuleToken lv_fragments_1_0 = null;

        AntlrDatatypeRuleToken lv_fragments_6_0 = null;

        AntlrDatatypeRuleToken lv_fragments_16_0 = null;

        AntlrDatatypeRuleToken lv_fragments_21_0 = null;

        AntlrDatatypeRuleToken lv_fragments_25_0 = null;

        AntlrDatatypeRuleToken lv_fragments_47_0 = null;

        AntlrDatatypeRuleToken lv_fragments_53_0 = null;


         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:835:28: ( ( () ( ( ( (lv_fragments_1_0= ruleREGULAR_FRAGMENT ) ) | ( ( (lv_fragments_2_0= 'Start' ) ) ( (lv_fragments_3_0= 'knowledge' ) ) ) | ( ( (lv_fragments_4_0= 'Start' ) ) ( (lv_fragments_5_0= 'commonsense' ) ) ( (lv_fragments_6_0= ruleREGULAR_FRAGMENT ) ) ) | ( ( (lv_fragments_7_0= 'Start' ) ) ( (lv_fragments_8_0= 'The' ) ) ) | ( ( (lv_fragments_9_0= 'Start' ) ) ( (lv_fragments_10_0= 'end' ) ) ) | ( ( (lv_fragments_11_0= 'Start' ) ) ( (lv_fragments_12_0= 'of' ) ) ) | ( ( (lv_fragments_13_0= 'Start' ) ) ( (lv_fragments_14_0= 'Start' ) ) ) | ( ( (lv_fragments_15_0= 'Start' ) ) ( (lv_fragments_16_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_17_0= 'knowledge' ) ) | ( (lv_fragments_18_0= 'commonsense' ) ) | ( ( (lv_fragments_19_0= 'Start' ) ) ( (lv_fragments_20_0= 'reflexive' ) ) ( (lv_fragments_21_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_22_0= 'reflexive' ) ) | ( ( (lv_fragments_23_0= 'Start' ) ) ( (lv_fragments_24_0= 'description' ) ) ( (lv_fragments_25_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_26_0= 'description' ) ) | ( (lv_fragments_27_0= 'of' ) ) | ( ( (lv_fragments_28_0= 'The' ) ) ( (lv_fragments_29_0= 'commonsense' ) ) ) | ( ( (lv_fragments_30_0= 'The' ) ) ( (lv_fragments_31_0= 'knowledge' ) ) ) | ( ( (lv_fragments_32_0= 'The' ) ) ( (lv_fragments_33_0= 'reflexive' ) ) ) | ( ( (lv_fragments_34_0= 'The' ) ) ( (lv_fragments_35_0= 'description' ) ) ) | ( ( (lv_fragments_36_0= 'The' ) ) ( (lv_fragments_37_0= 'of' ) ) ) | ( ( (lv_fragments_38_0= 'The' ) ) ( (lv_fragments_39_0= 'story' ) ) ) | ( ( (lv_fragments_40_0= 'The' ) ) ( (lv_fragments_41_0= 'titled' ) ) ) | ( ( (lv_fragments_42_0= 'The' ) ) ( (lv_fragments_43_0= 'Start' ) ) ) | ( ( (lv_fragments_44_0= 'The' ) ) ( (lv_fragments_45_0= 'The' ) ) ) | ( ( (lv_fragments_46_0= 'The' ) ) ( (lv_fragments_47_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_48_0= 'end' ) ) | ( ( (lv_fragments_49_0= 'Start' ) ) ( (lv_fragments_50_0= 'titled' ) ) ) | ( ( (lv_fragments_51_0= 'Start' ) ) ( (lv_fragments_52_0= 'story' ) ) ( (lv_fragments_53_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_54_0= 'story' ) ) | ( (lv_fragments_55_0= 'titled' ) ) )* ( ( (lv_fragments_56_0= 'Start' ) ) | ( (lv_fragments_57_0= 'The' ) ) | ( ( (lv_fragments_58_0= 'Start' ) ) ( (lv_fragments_59_0= 'commonsense' ) ) ) | ( ( (lv_fragments_60_0= 'Start' ) ) ( (lv_fragments_61_0= 'reflexive' ) ) ) | ( ( (lv_fragments_62_0= 'Start' ) ) ( (lv_fragments_63_0= 'description' ) ) ) | ( ( (lv_fragments_64_0= 'Start' ) ) ( (lv_fragments_65_0= 'story' ) ) ) )? otherlv_66= '.' ) ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:836:1: ( () ( ( ( (lv_fragments_1_0= ruleREGULAR_FRAGMENT ) ) | ( ( (lv_fragments_2_0= 'Start' ) ) ( (lv_fragments_3_0= 'knowledge' ) ) ) | ( ( (lv_fragments_4_0= 'Start' ) ) ( (lv_fragments_5_0= 'commonsense' ) ) ( (lv_fragments_6_0= ruleREGULAR_FRAGMENT ) ) ) | ( ( (lv_fragments_7_0= 'Start' ) ) ( (lv_fragments_8_0= 'The' ) ) ) | ( ( (lv_fragments_9_0= 'Start' ) ) ( (lv_fragments_10_0= 'end' ) ) ) | ( ( (lv_fragments_11_0= 'Start' ) ) ( (lv_fragments_12_0= 'of' ) ) ) | ( ( (lv_fragments_13_0= 'Start' ) ) ( (lv_fragments_14_0= 'Start' ) ) ) | ( ( (lv_fragments_15_0= 'Start' ) ) ( (lv_fragments_16_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_17_0= 'knowledge' ) ) | ( (lv_fragments_18_0= 'commonsense' ) ) | ( ( (lv_fragments_19_0= 'Start' ) ) ( (lv_fragments_20_0= 'reflexive' ) ) ( (lv_fragments_21_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_22_0= 'reflexive' ) ) | ( ( (lv_fragments_23_0= 'Start' ) ) ( (lv_fragments_24_0= 'description' ) ) ( (lv_fragments_25_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_26_0= 'description' ) ) | ( (lv_fragments_27_0= 'of' ) ) | ( ( (lv_fragments_28_0= 'The' ) ) ( (lv_fragments_29_0= 'commonsense' ) ) ) | ( ( (lv_fragments_30_0= 'The' ) ) ( (lv_fragments_31_0= 'knowledge' ) ) ) | ( ( (lv_fragments_32_0= 'The' ) ) ( (lv_fragments_33_0= 'reflexive' ) ) ) | ( ( (lv_fragments_34_0= 'The' ) ) ( (lv_fragments_35_0= 'description' ) ) ) | ( ( (lv_fragments_36_0= 'The' ) ) ( (lv_fragments_37_0= 'of' ) ) ) | ( ( (lv_fragments_38_0= 'The' ) ) ( (lv_fragments_39_0= 'story' ) ) ) | ( ( (lv_fragments_40_0= 'The' ) ) ( (lv_fragments_41_0= 'titled' ) ) ) | ( ( (lv_fragments_42_0= 'The' ) ) ( (lv_fragments_43_0= 'Start' ) ) ) | ( ( (lv_fragments_44_0= 'The' ) ) ( (lv_fragments_45_0= 'The' ) ) ) | ( ( (lv_fragments_46_0= 'The' ) ) ( (lv_fragments_47_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_48_0= 'end' ) ) | ( ( (lv_fragments_49_0= 'Start' ) ) ( (lv_fragments_50_0= 'titled' ) ) ) | ( ( (lv_fragments_51_0= 'Start' ) ) ( (lv_fragments_52_0= 'story' ) ) ( (lv_fragments_53_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_54_0= 'story' ) ) | ( (lv_fragments_55_0= 'titled' ) ) )* ( ( (lv_fragments_56_0= 'Start' ) ) | ( (lv_fragments_57_0= 'The' ) ) | ( ( (lv_fragments_58_0= 'Start' ) ) ( (lv_fragments_59_0= 'commonsense' ) ) ) | ( ( (lv_fragments_60_0= 'Start' ) ) ( (lv_fragments_61_0= 'reflexive' ) ) ) | ( ( (lv_fragments_62_0= 'Start' ) ) ( (lv_fragments_63_0= 'description' ) ) ) | ( ( (lv_fragments_64_0= 'Start' ) ) ( (lv_fragments_65_0= 'story' ) ) ) )? otherlv_66= '.' ) )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:836:1: ( () ( ( ( (lv_fragments_1_0= ruleREGULAR_FRAGMENT ) ) | ( ( (lv_fragments_2_0= 'Start' ) ) ( (lv_fragments_3_0= 'knowledge' ) ) ) | ( ( (lv_fragments_4_0= 'Start' ) ) ( (lv_fragments_5_0= 'commonsense' ) ) ( (lv_fragments_6_0= ruleREGULAR_FRAGMENT ) ) ) | ( ( (lv_fragments_7_0= 'Start' ) ) ( (lv_fragments_8_0= 'The' ) ) ) | ( ( (lv_fragments_9_0= 'Start' ) ) ( (lv_fragments_10_0= 'end' ) ) ) | ( ( (lv_fragments_11_0= 'Start' ) ) ( (lv_fragments_12_0= 'of' ) ) ) | ( ( (lv_fragments_13_0= 'Start' ) ) ( (lv_fragments_14_0= 'Start' ) ) ) | ( ( (lv_fragments_15_0= 'Start' ) ) ( (lv_fragments_16_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_17_0= 'knowledge' ) ) | ( (lv_fragments_18_0= 'commonsense' ) ) | ( ( (lv_fragments_19_0= 'Start' ) ) ( (lv_fragments_20_0= 'reflexive' ) ) ( (lv_fragments_21_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_22_0= 'reflexive' ) ) | ( ( (lv_fragments_23_0= 'Start' ) ) ( (lv_fragments_24_0= 'description' ) ) ( (lv_fragments_25_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_26_0= 'description' ) ) | ( (lv_fragments_27_0= 'of' ) ) | ( ( (lv_fragments_28_0= 'The' ) ) ( (lv_fragments_29_0= 'commonsense' ) ) ) | ( ( (lv_fragments_30_0= 'The' ) ) ( (lv_fragments_31_0= 'knowledge' ) ) ) | ( ( (lv_fragments_32_0= 'The' ) ) ( (lv_fragments_33_0= 'reflexive' ) ) ) | ( ( (lv_fragments_34_0= 'The' ) ) ( (lv_fragments_35_0= 'description' ) ) ) | ( ( (lv_fragments_36_0= 'The' ) ) ( (lv_fragments_37_0= 'of' ) ) ) | ( ( (lv_fragments_38_0= 'The' ) ) ( (lv_fragments_39_0= 'story' ) ) ) | ( ( (lv_fragments_40_0= 'The' ) ) ( (lv_fragments_41_0= 'titled' ) ) ) | ( ( (lv_fragments_42_0= 'The' ) ) ( (lv_fragments_43_0= 'Start' ) ) ) | ( ( (lv_fragments_44_0= 'The' ) ) ( (lv_fragments_45_0= 'The' ) ) ) | ( ( (lv_fragments_46_0= 'The' ) ) ( (lv_fragments_47_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_48_0= 'end' ) ) | ( ( (lv_fragments_49_0= 'Start' ) ) ( (lv_fragments_50_0= 'titled' ) ) ) | ( ( (lv_fragments_51_0= 'Start' ) ) ( (lv_fragments_52_0= 'story' ) ) ( (lv_fragments_53_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_54_0= 'story' ) ) | ( (lv_fragments_55_0= 'titled' ) ) )* ( ( (lv_fragments_56_0= 'Start' ) ) | ( (lv_fragments_57_0= 'The' ) ) | ( ( (lv_fragments_58_0= 'Start' ) ) ( (lv_fragments_59_0= 'commonsense' ) ) ) | ( ( (lv_fragments_60_0= 'Start' ) ) ( (lv_fragments_61_0= 'reflexive' ) ) ) | ( ( (lv_fragments_62_0= 'Start' ) ) ( (lv_fragments_63_0= 'description' ) ) ) | ( ( (lv_fragments_64_0= 'Start' ) ) ( (lv_fragments_65_0= 'story' ) ) ) )? otherlv_66= '.' ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:836:2: () ( ( ( (lv_fragments_1_0= ruleREGULAR_FRAGMENT ) ) | ( ( (lv_fragments_2_0= 'Start' ) ) ( (lv_fragments_3_0= 'knowledge' ) ) ) | ( ( (lv_fragments_4_0= 'Start' ) ) ( (lv_fragments_5_0= 'commonsense' ) ) ( (lv_fragments_6_0= ruleREGULAR_FRAGMENT ) ) ) | ( ( (lv_fragments_7_0= 'Start' ) ) ( (lv_fragments_8_0= 'The' ) ) ) | ( ( (lv_fragments_9_0= 'Start' ) ) ( (lv_fragments_10_0= 'end' ) ) ) | ( ( (lv_fragments_11_0= 'Start' ) ) ( (lv_fragments_12_0= 'of' ) ) ) | ( ( (lv_fragments_13_0= 'Start' ) ) ( (lv_fragments_14_0= 'Start' ) ) ) | ( ( (lv_fragments_15_0= 'Start' ) ) ( (lv_fragments_16_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_17_0= 'knowledge' ) ) | ( (lv_fragments_18_0= 'commonsense' ) ) | ( ( (lv_fragments_19_0= 'Start' ) ) ( (lv_fragments_20_0= 'reflexive' ) ) ( (lv_fragments_21_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_22_0= 'reflexive' ) ) | ( ( (lv_fragments_23_0= 'Start' ) ) ( (lv_fragments_24_0= 'description' ) ) ( (lv_fragments_25_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_26_0= 'description' ) ) | ( (lv_fragments_27_0= 'of' ) ) | ( ( (lv_fragments_28_0= 'The' ) ) ( (lv_fragments_29_0= 'commonsense' ) ) ) | ( ( (lv_fragments_30_0= 'The' ) ) ( (lv_fragments_31_0= 'knowledge' ) ) ) | ( ( (lv_fragments_32_0= 'The' ) ) ( (lv_fragments_33_0= 'reflexive' ) ) ) | ( ( (lv_fragments_34_0= 'The' ) ) ( (lv_fragments_35_0= 'description' ) ) ) | ( ( (lv_fragments_36_0= 'The' ) ) ( (lv_fragments_37_0= 'of' ) ) ) | ( ( (lv_fragments_38_0= 'The' ) ) ( (lv_fragments_39_0= 'story' ) ) ) | ( ( (lv_fragments_40_0= 'The' ) ) ( (lv_fragments_41_0= 'titled' ) ) ) | ( ( (lv_fragments_42_0= 'The' ) ) ( (lv_fragments_43_0= 'Start' ) ) ) | ( ( (lv_fragments_44_0= 'The' ) ) ( (lv_fragments_45_0= 'The' ) ) ) | ( ( (lv_fragments_46_0= 'The' ) ) ( (lv_fragments_47_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_48_0= 'end' ) ) | ( ( (lv_fragments_49_0= 'Start' ) ) ( (lv_fragments_50_0= 'titled' ) ) ) | ( ( (lv_fragments_51_0= 'Start' ) ) ( (lv_fragments_52_0= 'story' ) ) ( (lv_fragments_53_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_54_0= 'story' ) ) | ( (lv_fragments_55_0= 'titled' ) ) )* ( ( (lv_fragments_56_0= 'Start' ) ) | ( (lv_fragments_57_0= 'The' ) ) | ( ( (lv_fragments_58_0= 'Start' ) ) ( (lv_fragments_59_0= 'commonsense' ) ) ) | ( ( (lv_fragments_60_0= 'Start' ) ) ( (lv_fragments_61_0= 'reflexive' ) ) ) | ( ( (lv_fragments_62_0= 'Start' ) ) ( (lv_fragments_63_0= 'description' ) ) ) | ( ( (lv_fragments_64_0= 'Start' ) ) ( (lv_fragments_65_0= 'story' ) ) ) )? otherlv_66= '.' )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:836:2: ()
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:837:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSentenceAccess().getSentenceAction_0(),
                        current);
                

            }

            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:842:2: ( ( ( (lv_fragments_1_0= ruleREGULAR_FRAGMENT ) ) | ( ( (lv_fragments_2_0= 'Start' ) ) ( (lv_fragments_3_0= 'knowledge' ) ) ) | ( ( (lv_fragments_4_0= 'Start' ) ) ( (lv_fragments_5_0= 'commonsense' ) ) ( (lv_fragments_6_0= ruleREGULAR_FRAGMENT ) ) ) | ( ( (lv_fragments_7_0= 'Start' ) ) ( (lv_fragments_8_0= 'The' ) ) ) | ( ( (lv_fragments_9_0= 'Start' ) ) ( (lv_fragments_10_0= 'end' ) ) ) | ( ( (lv_fragments_11_0= 'Start' ) ) ( (lv_fragments_12_0= 'of' ) ) ) | ( ( (lv_fragments_13_0= 'Start' ) ) ( (lv_fragments_14_0= 'Start' ) ) ) | ( ( (lv_fragments_15_0= 'Start' ) ) ( (lv_fragments_16_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_17_0= 'knowledge' ) ) | ( (lv_fragments_18_0= 'commonsense' ) ) | ( ( (lv_fragments_19_0= 'Start' ) ) ( (lv_fragments_20_0= 'reflexive' ) ) ( (lv_fragments_21_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_22_0= 'reflexive' ) ) | ( ( (lv_fragments_23_0= 'Start' ) ) ( (lv_fragments_24_0= 'description' ) ) ( (lv_fragments_25_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_26_0= 'description' ) ) | ( (lv_fragments_27_0= 'of' ) ) | ( ( (lv_fragments_28_0= 'The' ) ) ( (lv_fragments_29_0= 'commonsense' ) ) ) | ( ( (lv_fragments_30_0= 'The' ) ) ( (lv_fragments_31_0= 'knowledge' ) ) ) | ( ( (lv_fragments_32_0= 'The' ) ) ( (lv_fragments_33_0= 'reflexive' ) ) ) | ( ( (lv_fragments_34_0= 'The' ) ) ( (lv_fragments_35_0= 'description' ) ) ) | ( ( (lv_fragments_36_0= 'The' ) ) ( (lv_fragments_37_0= 'of' ) ) ) | ( ( (lv_fragments_38_0= 'The' ) ) ( (lv_fragments_39_0= 'story' ) ) ) | ( ( (lv_fragments_40_0= 'The' ) ) ( (lv_fragments_41_0= 'titled' ) ) ) | ( ( (lv_fragments_42_0= 'The' ) ) ( (lv_fragments_43_0= 'Start' ) ) ) | ( ( (lv_fragments_44_0= 'The' ) ) ( (lv_fragments_45_0= 'The' ) ) ) | ( ( (lv_fragments_46_0= 'The' ) ) ( (lv_fragments_47_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_48_0= 'end' ) ) | ( ( (lv_fragments_49_0= 'Start' ) ) ( (lv_fragments_50_0= 'titled' ) ) ) | ( ( (lv_fragments_51_0= 'Start' ) ) ( (lv_fragments_52_0= 'story' ) ) ( (lv_fragments_53_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_54_0= 'story' ) ) | ( (lv_fragments_55_0= 'titled' ) ) )* ( ( (lv_fragments_56_0= 'Start' ) ) | ( (lv_fragments_57_0= 'The' ) ) | ( ( (lv_fragments_58_0= 'Start' ) ) ( (lv_fragments_59_0= 'commonsense' ) ) ) | ( ( (lv_fragments_60_0= 'Start' ) ) ( (lv_fragments_61_0= 'reflexive' ) ) ) | ( ( (lv_fragments_62_0= 'Start' ) ) ( (lv_fragments_63_0= 'description' ) ) ) | ( ( (lv_fragments_64_0= 'Start' ) ) ( (lv_fragments_65_0= 'story' ) ) ) )? otherlv_66= '.' )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:842:3: ( ( (lv_fragments_1_0= ruleREGULAR_FRAGMENT ) ) | ( ( (lv_fragments_2_0= 'Start' ) ) ( (lv_fragments_3_0= 'knowledge' ) ) ) | ( ( (lv_fragments_4_0= 'Start' ) ) ( (lv_fragments_5_0= 'commonsense' ) ) ( (lv_fragments_6_0= ruleREGULAR_FRAGMENT ) ) ) | ( ( (lv_fragments_7_0= 'Start' ) ) ( (lv_fragments_8_0= 'The' ) ) ) | ( ( (lv_fragments_9_0= 'Start' ) ) ( (lv_fragments_10_0= 'end' ) ) ) | ( ( (lv_fragments_11_0= 'Start' ) ) ( (lv_fragments_12_0= 'of' ) ) ) | ( ( (lv_fragments_13_0= 'Start' ) ) ( (lv_fragments_14_0= 'Start' ) ) ) | ( ( (lv_fragments_15_0= 'Start' ) ) ( (lv_fragments_16_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_17_0= 'knowledge' ) ) | ( (lv_fragments_18_0= 'commonsense' ) ) | ( ( (lv_fragments_19_0= 'Start' ) ) ( (lv_fragments_20_0= 'reflexive' ) ) ( (lv_fragments_21_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_22_0= 'reflexive' ) ) | ( ( (lv_fragments_23_0= 'Start' ) ) ( (lv_fragments_24_0= 'description' ) ) ( (lv_fragments_25_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_26_0= 'description' ) ) | ( (lv_fragments_27_0= 'of' ) ) | ( ( (lv_fragments_28_0= 'The' ) ) ( (lv_fragments_29_0= 'commonsense' ) ) ) | ( ( (lv_fragments_30_0= 'The' ) ) ( (lv_fragments_31_0= 'knowledge' ) ) ) | ( ( (lv_fragments_32_0= 'The' ) ) ( (lv_fragments_33_0= 'reflexive' ) ) ) | ( ( (lv_fragments_34_0= 'The' ) ) ( (lv_fragments_35_0= 'description' ) ) ) | ( ( (lv_fragments_36_0= 'The' ) ) ( (lv_fragments_37_0= 'of' ) ) ) | ( ( (lv_fragments_38_0= 'The' ) ) ( (lv_fragments_39_0= 'story' ) ) ) | ( ( (lv_fragments_40_0= 'The' ) ) ( (lv_fragments_41_0= 'titled' ) ) ) | ( ( (lv_fragments_42_0= 'The' ) ) ( (lv_fragments_43_0= 'Start' ) ) ) | ( ( (lv_fragments_44_0= 'The' ) ) ( (lv_fragments_45_0= 'The' ) ) ) | ( ( (lv_fragments_46_0= 'The' ) ) ( (lv_fragments_47_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_48_0= 'end' ) ) | ( ( (lv_fragments_49_0= 'Start' ) ) ( (lv_fragments_50_0= 'titled' ) ) ) | ( ( (lv_fragments_51_0= 'Start' ) ) ( (lv_fragments_52_0= 'story' ) ) ( (lv_fragments_53_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_54_0= 'story' ) ) | ( (lv_fragments_55_0= 'titled' ) ) )* ( ( (lv_fragments_56_0= 'Start' ) ) | ( (lv_fragments_57_0= 'The' ) ) | ( ( (lv_fragments_58_0= 'Start' ) ) ( (lv_fragments_59_0= 'commonsense' ) ) ) | ( ( (lv_fragments_60_0= 'Start' ) ) ( (lv_fragments_61_0= 'reflexive' ) ) ) | ( ( (lv_fragments_62_0= 'Start' ) ) ( (lv_fragments_63_0= 'description' ) ) ) | ( ( (lv_fragments_64_0= 'Start' ) ) ( (lv_fragments_65_0= 'story' ) ) ) )? otherlv_66= '.'
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:842:3: ( ( (lv_fragments_1_0= ruleREGULAR_FRAGMENT ) ) | ( ( (lv_fragments_2_0= 'Start' ) ) ( (lv_fragments_3_0= 'knowledge' ) ) ) | ( ( (lv_fragments_4_0= 'Start' ) ) ( (lv_fragments_5_0= 'commonsense' ) ) ( (lv_fragments_6_0= ruleREGULAR_FRAGMENT ) ) ) | ( ( (lv_fragments_7_0= 'Start' ) ) ( (lv_fragments_8_0= 'The' ) ) ) | ( ( (lv_fragments_9_0= 'Start' ) ) ( (lv_fragments_10_0= 'end' ) ) ) | ( ( (lv_fragments_11_0= 'Start' ) ) ( (lv_fragments_12_0= 'of' ) ) ) | ( ( (lv_fragments_13_0= 'Start' ) ) ( (lv_fragments_14_0= 'Start' ) ) ) | ( ( (lv_fragments_15_0= 'Start' ) ) ( (lv_fragments_16_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_17_0= 'knowledge' ) ) | ( (lv_fragments_18_0= 'commonsense' ) ) | ( ( (lv_fragments_19_0= 'Start' ) ) ( (lv_fragments_20_0= 'reflexive' ) ) ( (lv_fragments_21_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_22_0= 'reflexive' ) ) | ( ( (lv_fragments_23_0= 'Start' ) ) ( (lv_fragments_24_0= 'description' ) ) ( (lv_fragments_25_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_26_0= 'description' ) ) | ( (lv_fragments_27_0= 'of' ) ) | ( ( (lv_fragments_28_0= 'The' ) ) ( (lv_fragments_29_0= 'commonsense' ) ) ) | ( ( (lv_fragments_30_0= 'The' ) ) ( (lv_fragments_31_0= 'knowledge' ) ) ) | ( ( (lv_fragments_32_0= 'The' ) ) ( (lv_fragments_33_0= 'reflexive' ) ) ) | ( ( (lv_fragments_34_0= 'The' ) ) ( (lv_fragments_35_0= 'description' ) ) ) | ( ( (lv_fragments_36_0= 'The' ) ) ( (lv_fragments_37_0= 'of' ) ) ) | ( ( (lv_fragments_38_0= 'The' ) ) ( (lv_fragments_39_0= 'story' ) ) ) | ( ( (lv_fragments_40_0= 'The' ) ) ( (lv_fragments_41_0= 'titled' ) ) ) | ( ( (lv_fragments_42_0= 'The' ) ) ( (lv_fragments_43_0= 'Start' ) ) ) | ( ( (lv_fragments_44_0= 'The' ) ) ( (lv_fragments_45_0= 'The' ) ) ) | ( ( (lv_fragments_46_0= 'The' ) ) ( (lv_fragments_47_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_48_0= 'end' ) ) | ( ( (lv_fragments_49_0= 'Start' ) ) ( (lv_fragments_50_0= 'titled' ) ) ) | ( ( (lv_fragments_51_0= 'Start' ) ) ( (lv_fragments_52_0= 'story' ) ) ( (lv_fragments_53_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_54_0= 'story' ) ) | ( (lv_fragments_55_0= 'titled' ) ) )*
            loop7:
            do {
                int alt7=31;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:842:4: ( (lv_fragments_1_0= ruleREGULAR_FRAGMENT ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:842:4: ( (lv_fragments_1_0= ruleREGULAR_FRAGMENT ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:843:1: (lv_fragments_1_0= ruleREGULAR_FRAGMENT )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:843:1: (lv_fragments_1_0= ruleREGULAR_FRAGMENT )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:844:3: lv_fragments_1_0= ruleREGULAR_FRAGMENT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_ruleSentence1942);
            	    lv_fragments_1_0=ruleREGULAR_FRAGMENT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSentenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fragments",
            	            		lv_fragments_1_0, 
            	            		"REGULAR_FRAGMENT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:861:6: ( ( (lv_fragments_2_0= 'Start' ) ) ( (lv_fragments_3_0= 'knowledge' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:861:6: ( ( (lv_fragments_2_0= 'Start' ) ) ( (lv_fragments_3_0= 'knowledge' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:861:7: ( (lv_fragments_2_0= 'Start' ) ) ( (lv_fragments_3_0= 'knowledge' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:861:7: ( (lv_fragments_2_0= 'Start' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:862:1: (lv_fragments_2_0= 'Start' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:862:1: (lv_fragments_2_0= 'Start' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:863:3: lv_fragments_2_0= 'Start'
            	    {
            	    lv_fragments_2_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence1967); 

            	            newLeafNode(lv_fragments_2_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_2_0, "Start");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:876:2: ( (lv_fragments_3_0= 'knowledge' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:877:1: (lv_fragments_3_0= 'knowledge' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:877:1: (lv_fragments_3_0= 'knowledge' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:878:3: lv_fragments_3_0= 'knowledge'
            	    {
            	    lv_fragments_3_0=(Token)match(input,11,FOLLOW_11_in_ruleSentence1998); 

            	            newLeafNode(lv_fragments_3_0, grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_3_0, "knowledge");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:892:6: ( ( (lv_fragments_4_0= 'Start' ) ) ( (lv_fragments_5_0= 'commonsense' ) ) ( (lv_fragments_6_0= ruleREGULAR_FRAGMENT ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:892:6: ( ( (lv_fragments_4_0= 'Start' ) ) ( (lv_fragments_5_0= 'commonsense' ) ) ( (lv_fragments_6_0= ruleREGULAR_FRAGMENT ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:892:7: ( (lv_fragments_4_0= 'Start' ) ) ( (lv_fragments_5_0= 'commonsense' ) ) ( (lv_fragments_6_0= ruleREGULAR_FRAGMENT ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:892:7: ( (lv_fragments_4_0= 'Start' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:893:1: (lv_fragments_4_0= 'Start' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:893:1: (lv_fragments_4_0= 'Start' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:894:3: lv_fragments_4_0= 'Start'
            	    {
            	    lv_fragments_4_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence2037); 

            	            newLeafNode(lv_fragments_4_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_2_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_4_0, "Start");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:907:2: ( (lv_fragments_5_0= 'commonsense' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:908:1: (lv_fragments_5_0= 'commonsense' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:908:1: (lv_fragments_5_0= 'commonsense' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:909:3: lv_fragments_5_0= 'commonsense'
            	    {
            	    lv_fragments_5_0=(Token)match(input,10,FOLLOW_10_in_ruleSentence2068); 

            	            newLeafNode(lv_fragments_5_0, grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_2_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_5_0, "commonsense");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:922:2: ( (lv_fragments_6_0= ruleREGULAR_FRAGMENT ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:923:1: (lv_fragments_6_0= ruleREGULAR_FRAGMENT )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:923:1: (lv_fragments_6_0= ruleREGULAR_FRAGMENT )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:924:3: lv_fragments_6_0= ruleREGULAR_FRAGMENT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_ruleSentence2102);
            	    lv_fragments_6_0=ruleREGULAR_FRAGMENT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSentenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fragments",
            	            		lv_fragments_6_0, 
            	            		"REGULAR_FRAGMENT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:941:6: ( ( (lv_fragments_7_0= 'Start' ) ) ( (lv_fragments_8_0= 'The' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:941:6: ( ( (lv_fragments_7_0= 'Start' ) ) ( (lv_fragments_8_0= 'The' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:941:7: ( (lv_fragments_7_0= 'Start' ) ) ( (lv_fragments_8_0= 'The' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:941:7: ( (lv_fragments_7_0= 'Start' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:942:1: (lv_fragments_7_0= 'Start' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:942:1: (lv_fragments_7_0= 'Start' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:943:3: lv_fragments_7_0= 'Start'
            	    {
            	    lv_fragments_7_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence2128); 

            	            newLeafNode(lv_fragments_7_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_3_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_7_0, "Start");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:956:2: ( (lv_fragments_8_0= 'The' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:957:1: (lv_fragments_8_0= 'The' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:957:1: (lv_fragments_8_0= 'The' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:958:3: lv_fragments_8_0= 'The'
            	    {
            	    lv_fragments_8_0=(Token)match(input,14,FOLLOW_14_in_ruleSentence2159); 

            	            newLeafNode(lv_fragments_8_0, grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_3_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_8_0, "The");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:972:6: ( ( (lv_fragments_9_0= 'Start' ) ) ( (lv_fragments_10_0= 'end' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:972:6: ( ( (lv_fragments_9_0= 'Start' ) ) ( (lv_fragments_10_0= 'end' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:972:7: ( (lv_fragments_9_0= 'Start' ) ) ( (lv_fragments_10_0= 'end' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:972:7: ( (lv_fragments_9_0= 'Start' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:973:1: (lv_fragments_9_0= 'Start' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:973:1: (lv_fragments_9_0= 'Start' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:974:3: lv_fragments_9_0= 'Start'
            	    {
            	    lv_fragments_9_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence2198); 

            	            newLeafNode(lv_fragments_9_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_4_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_9_0, "Start");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:987:2: ( (lv_fragments_10_0= 'end' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:988:1: (lv_fragments_10_0= 'end' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:988:1: (lv_fragments_10_0= 'end' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:989:3: lv_fragments_10_0= 'end'
            	    {
            	    lv_fragments_10_0=(Token)match(input,15,FOLLOW_15_in_ruleSentence2229); 

            	            newLeafNode(lv_fragments_10_0, grammarAccess.getSentenceAccess().getFragmentsEndKeyword_1_0_4_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_10_0, "end");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1003:6: ( ( (lv_fragments_11_0= 'Start' ) ) ( (lv_fragments_12_0= 'of' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1003:6: ( ( (lv_fragments_11_0= 'Start' ) ) ( (lv_fragments_12_0= 'of' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1003:7: ( (lv_fragments_11_0= 'Start' ) ) ( (lv_fragments_12_0= 'of' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1003:7: ( (lv_fragments_11_0= 'Start' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1004:1: (lv_fragments_11_0= 'Start' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1004:1: (lv_fragments_11_0= 'Start' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1005:3: lv_fragments_11_0= 'Start'
            	    {
            	    lv_fragments_11_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence2268); 

            	            newLeafNode(lv_fragments_11_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_5_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_11_0, "Start");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1018:2: ( (lv_fragments_12_0= 'of' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1019:1: (lv_fragments_12_0= 'of' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1019:1: (lv_fragments_12_0= 'of' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1020:3: lv_fragments_12_0= 'of'
            	    {
            	    lv_fragments_12_0=(Token)match(input,17,FOLLOW_17_in_ruleSentence2299); 

            	            newLeafNode(lv_fragments_12_0, grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_5_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_12_0, "of");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1034:6: ( ( (lv_fragments_13_0= 'Start' ) ) ( (lv_fragments_14_0= 'Start' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1034:6: ( ( (lv_fragments_13_0= 'Start' ) ) ( (lv_fragments_14_0= 'Start' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1034:7: ( (lv_fragments_13_0= 'Start' ) ) ( (lv_fragments_14_0= 'Start' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1034:7: ( (lv_fragments_13_0= 'Start' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1035:1: (lv_fragments_13_0= 'Start' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1035:1: (lv_fragments_13_0= 'Start' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1036:3: lv_fragments_13_0= 'Start'
            	    {
            	    lv_fragments_13_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence2338); 

            	            newLeafNode(lv_fragments_13_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_6_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_13_0, "Start");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1049:2: ( (lv_fragments_14_0= 'Start' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1050:1: (lv_fragments_14_0= 'Start' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1050:1: (lv_fragments_14_0= 'Start' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1051:3: lv_fragments_14_0= 'Start'
            	    {
            	    lv_fragments_14_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence2369); 

            	            newLeafNode(lv_fragments_14_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_6_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_14_0, "Start");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1065:6: ( ( (lv_fragments_15_0= 'Start' ) ) ( (lv_fragments_16_0= ruleREGULAR_FRAGMENT ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1065:6: ( ( (lv_fragments_15_0= 'Start' ) ) ( (lv_fragments_16_0= ruleREGULAR_FRAGMENT ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1065:7: ( (lv_fragments_15_0= 'Start' ) ) ( (lv_fragments_16_0= ruleREGULAR_FRAGMENT ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1065:7: ( (lv_fragments_15_0= 'Start' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1066:1: (lv_fragments_15_0= 'Start' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1066:1: (lv_fragments_15_0= 'Start' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1067:3: lv_fragments_15_0= 'Start'
            	    {
            	    lv_fragments_15_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence2408); 

            	            newLeafNode(lv_fragments_15_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_7_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_15_0, "Start");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1080:2: ( (lv_fragments_16_0= ruleREGULAR_FRAGMENT ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1081:1: (lv_fragments_16_0= ruleREGULAR_FRAGMENT )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1081:1: (lv_fragments_16_0= ruleREGULAR_FRAGMENT )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1082:3: lv_fragments_16_0= ruleREGULAR_FRAGMENT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_ruleSentence2442);
            	    lv_fragments_16_0=ruleREGULAR_FRAGMENT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSentenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fragments",
            	            		lv_fragments_16_0, 
            	            		"REGULAR_FRAGMENT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1099:6: ( (lv_fragments_17_0= 'knowledge' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1099:6: ( (lv_fragments_17_0= 'knowledge' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1100:1: (lv_fragments_17_0= 'knowledge' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1100:1: (lv_fragments_17_0= 'knowledge' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1101:3: lv_fragments_17_0= 'knowledge'
            	    {
            	    lv_fragments_17_0=(Token)match(input,11,FOLLOW_11_in_ruleSentence2467); 

            	            newLeafNode(lv_fragments_17_0, grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_8_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_17_0, "knowledge");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1115:6: ( (lv_fragments_18_0= 'commonsense' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1115:6: ( (lv_fragments_18_0= 'commonsense' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1116:1: (lv_fragments_18_0= 'commonsense' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1116:1: (lv_fragments_18_0= 'commonsense' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1117:3: lv_fragments_18_0= 'commonsense'
            	    {
            	    lv_fragments_18_0=(Token)match(input,10,FOLLOW_10_in_ruleSentence2504); 

            	            newLeafNode(lv_fragments_18_0, grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_9_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_18_0, "commonsense");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1131:6: ( ( (lv_fragments_19_0= 'Start' ) ) ( (lv_fragments_20_0= 'reflexive' ) ) ( (lv_fragments_21_0= ruleREGULAR_FRAGMENT ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1131:6: ( ( (lv_fragments_19_0= 'Start' ) ) ( (lv_fragments_20_0= 'reflexive' ) ) ( (lv_fragments_21_0= ruleREGULAR_FRAGMENT ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1131:7: ( (lv_fragments_19_0= 'Start' ) ) ( (lv_fragments_20_0= 'reflexive' ) ) ( (lv_fragments_21_0= ruleREGULAR_FRAGMENT ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1131:7: ( (lv_fragments_19_0= 'Start' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1132:1: (lv_fragments_19_0= 'Start' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1132:1: (lv_fragments_19_0= 'Start' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1133:3: lv_fragments_19_0= 'Start'
            	    {
            	    lv_fragments_19_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence2542); 

            	            newLeafNode(lv_fragments_19_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_10_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_19_0, "Start");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1146:2: ( (lv_fragments_20_0= 'reflexive' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1147:1: (lv_fragments_20_0= 'reflexive' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1147:1: (lv_fragments_20_0= 'reflexive' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1148:3: lv_fragments_20_0= 'reflexive'
            	    {
            	    lv_fragments_20_0=(Token)match(input,13,FOLLOW_13_in_ruleSentence2573); 

            	            newLeafNode(lv_fragments_20_0, grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_10_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_20_0, "reflexive");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1161:2: ( (lv_fragments_21_0= ruleREGULAR_FRAGMENT ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1162:1: (lv_fragments_21_0= ruleREGULAR_FRAGMENT )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1162:1: (lv_fragments_21_0= ruleREGULAR_FRAGMENT )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1163:3: lv_fragments_21_0= ruleREGULAR_FRAGMENT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_10_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_ruleSentence2607);
            	    lv_fragments_21_0=ruleREGULAR_FRAGMENT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSentenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fragments",
            	            		lv_fragments_21_0, 
            	            		"REGULAR_FRAGMENT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1180:6: ( (lv_fragments_22_0= 'reflexive' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1180:6: ( (lv_fragments_22_0= 'reflexive' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1181:1: (lv_fragments_22_0= 'reflexive' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1181:1: (lv_fragments_22_0= 'reflexive' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1182:3: lv_fragments_22_0= 'reflexive'
            	    {
            	    lv_fragments_22_0=(Token)match(input,13,FOLLOW_13_in_ruleSentence2632); 

            	            newLeafNode(lv_fragments_22_0, grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_11_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_22_0, "reflexive");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1196:6: ( ( (lv_fragments_23_0= 'Start' ) ) ( (lv_fragments_24_0= 'description' ) ) ( (lv_fragments_25_0= ruleREGULAR_FRAGMENT ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1196:6: ( ( (lv_fragments_23_0= 'Start' ) ) ( (lv_fragments_24_0= 'description' ) ) ( (lv_fragments_25_0= ruleREGULAR_FRAGMENT ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1196:7: ( (lv_fragments_23_0= 'Start' ) ) ( (lv_fragments_24_0= 'description' ) ) ( (lv_fragments_25_0= ruleREGULAR_FRAGMENT ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1196:7: ( (lv_fragments_23_0= 'Start' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1197:1: (lv_fragments_23_0= 'Start' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1197:1: (lv_fragments_23_0= 'Start' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1198:3: lv_fragments_23_0= 'Start'
            	    {
            	    lv_fragments_23_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence2670); 

            	            newLeafNode(lv_fragments_23_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_12_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_23_0, "Start");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1211:2: ( (lv_fragments_24_0= 'description' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1212:1: (lv_fragments_24_0= 'description' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1212:1: (lv_fragments_24_0= 'description' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1213:3: lv_fragments_24_0= 'description'
            	    {
            	    lv_fragments_24_0=(Token)match(input,16,FOLLOW_16_in_ruleSentence2701); 

            	            newLeafNode(lv_fragments_24_0, grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_12_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_24_0, "description");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1226:2: ( (lv_fragments_25_0= ruleREGULAR_FRAGMENT ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1227:1: (lv_fragments_25_0= ruleREGULAR_FRAGMENT )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1227:1: (lv_fragments_25_0= ruleREGULAR_FRAGMENT )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1228:3: lv_fragments_25_0= ruleREGULAR_FRAGMENT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_12_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_ruleSentence2735);
            	    lv_fragments_25_0=ruleREGULAR_FRAGMENT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSentenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fragments",
            	            		lv_fragments_25_0, 
            	            		"REGULAR_FRAGMENT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1245:6: ( (lv_fragments_26_0= 'description' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1245:6: ( (lv_fragments_26_0= 'description' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1246:1: (lv_fragments_26_0= 'description' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1246:1: (lv_fragments_26_0= 'description' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1247:3: lv_fragments_26_0= 'description'
            	    {
            	    lv_fragments_26_0=(Token)match(input,16,FOLLOW_16_in_ruleSentence2760); 

            	            newLeafNode(lv_fragments_26_0, grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_13_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_26_0, "description");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1261:6: ( (lv_fragments_27_0= 'of' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1261:6: ( (lv_fragments_27_0= 'of' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1262:1: (lv_fragments_27_0= 'of' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1262:1: (lv_fragments_27_0= 'of' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1263:3: lv_fragments_27_0= 'of'
            	    {
            	    lv_fragments_27_0=(Token)match(input,17,FOLLOW_17_in_ruleSentence2797); 

            	            newLeafNode(lv_fragments_27_0, grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_14_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_27_0, "of");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1277:6: ( ( (lv_fragments_28_0= 'The' ) ) ( (lv_fragments_29_0= 'commonsense' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1277:6: ( ( (lv_fragments_28_0= 'The' ) ) ( (lv_fragments_29_0= 'commonsense' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1277:7: ( (lv_fragments_28_0= 'The' ) ) ( (lv_fragments_29_0= 'commonsense' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1277:7: ( (lv_fragments_28_0= 'The' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1278:1: (lv_fragments_28_0= 'The' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1278:1: (lv_fragments_28_0= 'The' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1279:3: lv_fragments_28_0= 'The'
            	    {
            	    lv_fragments_28_0=(Token)match(input,14,FOLLOW_14_in_ruleSentence2835); 

            	            newLeafNode(lv_fragments_28_0, grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_15_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_28_0, "The");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1292:2: ( (lv_fragments_29_0= 'commonsense' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1293:1: (lv_fragments_29_0= 'commonsense' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1293:1: (lv_fragments_29_0= 'commonsense' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1294:3: lv_fragments_29_0= 'commonsense'
            	    {
            	    lv_fragments_29_0=(Token)match(input,10,FOLLOW_10_in_ruleSentence2866); 

            	            newLeafNode(lv_fragments_29_0, grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_0_15_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_29_0, "commonsense");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1308:6: ( ( (lv_fragments_30_0= 'The' ) ) ( (lv_fragments_31_0= 'knowledge' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1308:6: ( ( (lv_fragments_30_0= 'The' ) ) ( (lv_fragments_31_0= 'knowledge' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1308:7: ( (lv_fragments_30_0= 'The' ) ) ( (lv_fragments_31_0= 'knowledge' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1308:7: ( (lv_fragments_30_0= 'The' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1309:1: (lv_fragments_30_0= 'The' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1309:1: (lv_fragments_30_0= 'The' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1310:3: lv_fragments_30_0= 'The'
            	    {
            	    lv_fragments_30_0=(Token)match(input,14,FOLLOW_14_in_ruleSentence2905); 

            	            newLeafNode(lv_fragments_30_0, grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_16_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_30_0, "The");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1323:2: ( (lv_fragments_31_0= 'knowledge' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1324:1: (lv_fragments_31_0= 'knowledge' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1324:1: (lv_fragments_31_0= 'knowledge' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1325:3: lv_fragments_31_0= 'knowledge'
            	    {
            	    lv_fragments_31_0=(Token)match(input,11,FOLLOW_11_in_ruleSentence2936); 

            	            newLeafNode(lv_fragments_31_0, grammarAccess.getSentenceAccess().getFragmentsKnowledgeKeyword_1_0_16_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_31_0, "knowledge");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 18 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1339:6: ( ( (lv_fragments_32_0= 'The' ) ) ( (lv_fragments_33_0= 'reflexive' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1339:6: ( ( (lv_fragments_32_0= 'The' ) ) ( (lv_fragments_33_0= 'reflexive' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1339:7: ( (lv_fragments_32_0= 'The' ) ) ( (lv_fragments_33_0= 'reflexive' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1339:7: ( (lv_fragments_32_0= 'The' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1340:1: (lv_fragments_32_0= 'The' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1340:1: (lv_fragments_32_0= 'The' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1341:3: lv_fragments_32_0= 'The'
            	    {
            	    lv_fragments_32_0=(Token)match(input,14,FOLLOW_14_in_ruleSentence2975); 

            	            newLeafNode(lv_fragments_32_0, grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_17_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_32_0, "The");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1354:2: ( (lv_fragments_33_0= 'reflexive' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1355:1: (lv_fragments_33_0= 'reflexive' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1355:1: (lv_fragments_33_0= 'reflexive' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1356:3: lv_fragments_33_0= 'reflexive'
            	    {
            	    lv_fragments_33_0=(Token)match(input,13,FOLLOW_13_in_ruleSentence3006); 

            	            newLeafNode(lv_fragments_33_0, grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_0_17_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_33_0, "reflexive");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 19 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1370:6: ( ( (lv_fragments_34_0= 'The' ) ) ( (lv_fragments_35_0= 'description' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1370:6: ( ( (lv_fragments_34_0= 'The' ) ) ( (lv_fragments_35_0= 'description' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1370:7: ( (lv_fragments_34_0= 'The' ) ) ( (lv_fragments_35_0= 'description' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1370:7: ( (lv_fragments_34_0= 'The' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1371:1: (lv_fragments_34_0= 'The' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1371:1: (lv_fragments_34_0= 'The' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1372:3: lv_fragments_34_0= 'The'
            	    {
            	    lv_fragments_34_0=(Token)match(input,14,FOLLOW_14_in_ruleSentence3045); 

            	            newLeafNode(lv_fragments_34_0, grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_18_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_34_0, "The");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1385:2: ( (lv_fragments_35_0= 'description' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1386:1: (lv_fragments_35_0= 'description' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1386:1: (lv_fragments_35_0= 'description' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1387:3: lv_fragments_35_0= 'description'
            	    {
            	    lv_fragments_35_0=(Token)match(input,16,FOLLOW_16_in_ruleSentence3076); 

            	            newLeafNode(lv_fragments_35_0, grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_0_18_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_35_0, "description");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 20 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1401:6: ( ( (lv_fragments_36_0= 'The' ) ) ( (lv_fragments_37_0= 'of' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1401:6: ( ( (lv_fragments_36_0= 'The' ) ) ( (lv_fragments_37_0= 'of' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1401:7: ( (lv_fragments_36_0= 'The' ) ) ( (lv_fragments_37_0= 'of' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1401:7: ( (lv_fragments_36_0= 'The' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1402:1: (lv_fragments_36_0= 'The' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1402:1: (lv_fragments_36_0= 'The' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1403:3: lv_fragments_36_0= 'The'
            	    {
            	    lv_fragments_36_0=(Token)match(input,14,FOLLOW_14_in_ruleSentence3115); 

            	            newLeafNode(lv_fragments_36_0, grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_19_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_36_0, "The");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1416:2: ( (lv_fragments_37_0= 'of' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1417:1: (lv_fragments_37_0= 'of' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1417:1: (lv_fragments_37_0= 'of' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1418:3: lv_fragments_37_0= 'of'
            	    {
            	    lv_fragments_37_0=(Token)match(input,17,FOLLOW_17_in_ruleSentence3146); 

            	            newLeafNode(lv_fragments_37_0, grammarAccess.getSentenceAccess().getFragmentsOfKeyword_1_0_19_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_37_0, "of");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 21 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1432:6: ( ( (lv_fragments_38_0= 'The' ) ) ( (lv_fragments_39_0= 'story' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1432:6: ( ( (lv_fragments_38_0= 'The' ) ) ( (lv_fragments_39_0= 'story' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1432:7: ( (lv_fragments_38_0= 'The' ) ) ( (lv_fragments_39_0= 'story' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1432:7: ( (lv_fragments_38_0= 'The' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1433:1: (lv_fragments_38_0= 'The' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1433:1: (lv_fragments_38_0= 'The' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1434:3: lv_fragments_38_0= 'The'
            	    {
            	    lv_fragments_38_0=(Token)match(input,14,FOLLOW_14_in_ruleSentence3185); 

            	            newLeafNode(lv_fragments_38_0, grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_20_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_38_0, "The");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1447:2: ( (lv_fragments_39_0= 'story' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1448:1: (lv_fragments_39_0= 'story' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1448:1: (lv_fragments_39_0= 'story' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1449:3: lv_fragments_39_0= 'story'
            	    {
            	    lv_fragments_39_0=(Token)match(input,19,FOLLOW_19_in_ruleSentence3216); 

            	            newLeafNode(lv_fragments_39_0, grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_20_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_39_0, "story");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 22 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1463:6: ( ( (lv_fragments_40_0= 'The' ) ) ( (lv_fragments_41_0= 'titled' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1463:6: ( ( (lv_fragments_40_0= 'The' ) ) ( (lv_fragments_41_0= 'titled' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1463:7: ( (lv_fragments_40_0= 'The' ) ) ( (lv_fragments_41_0= 'titled' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1463:7: ( (lv_fragments_40_0= 'The' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1464:1: (lv_fragments_40_0= 'The' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1464:1: (lv_fragments_40_0= 'The' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1465:3: lv_fragments_40_0= 'The'
            	    {
            	    lv_fragments_40_0=(Token)match(input,14,FOLLOW_14_in_ruleSentence3255); 

            	            newLeafNode(lv_fragments_40_0, grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_21_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_40_0, "The");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1478:2: ( (lv_fragments_41_0= 'titled' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1479:1: (lv_fragments_41_0= 'titled' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1479:1: (lv_fragments_41_0= 'titled' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1480:3: lv_fragments_41_0= 'titled'
            	    {
            	    lv_fragments_41_0=(Token)match(input,20,FOLLOW_20_in_ruleSentence3286); 

            	            newLeafNode(lv_fragments_41_0, grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_21_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_41_0, "titled");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 23 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1494:6: ( ( (lv_fragments_42_0= 'The' ) ) ( (lv_fragments_43_0= 'Start' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1494:6: ( ( (lv_fragments_42_0= 'The' ) ) ( (lv_fragments_43_0= 'Start' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1494:7: ( (lv_fragments_42_0= 'The' ) ) ( (lv_fragments_43_0= 'Start' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1494:7: ( (lv_fragments_42_0= 'The' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1495:1: (lv_fragments_42_0= 'The' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1495:1: (lv_fragments_42_0= 'The' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1496:3: lv_fragments_42_0= 'The'
            	    {
            	    lv_fragments_42_0=(Token)match(input,14,FOLLOW_14_in_ruleSentence3325); 

            	            newLeafNode(lv_fragments_42_0, grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_22_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_42_0, "The");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1509:2: ( (lv_fragments_43_0= 'Start' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1510:1: (lv_fragments_43_0= 'Start' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1510:1: (lv_fragments_43_0= 'Start' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1511:3: lv_fragments_43_0= 'Start'
            	    {
            	    lv_fragments_43_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence3356); 

            	            newLeafNode(lv_fragments_43_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_22_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_43_0, "Start");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 24 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1525:6: ( ( (lv_fragments_44_0= 'The' ) ) ( (lv_fragments_45_0= 'The' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1525:6: ( ( (lv_fragments_44_0= 'The' ) ) ( (lv_fragments_45_0= 'The' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1525:7: ( (lv_fragments_44_0= 'The' ) ) ( (lv_fragments_45_0= 'The' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1525:7: ( (lv_fragments_44_0= 'The' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1526:1: (lv_fragments_44_0= 'The' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1526:1: (lv_fragments_44_0= 'The' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1527:3: lv_fragments_44_0= 'The'
            	    {
            	    lv_fragments_44_0=(Token)match(input,14,FOLLOW_14_in_ruleSentence3395); 

            	            newLeafNode(lv_fragments_44_0, grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_23_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_44_0, "The");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1540:2: ( (lv_fragments_45_0= 'The' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1541:1: (lv_fragments_45_0= 'The' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1541:1: (lv_fragments_45_0= 'The' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1542:3: lv_fragments_45_0= 'The'
            	    {
            	    lv_fragments_45_0=(Token)match(input,14,FOLLOW_14_in_ruleSentence3426); 

            	            newLeafNode(lv_fragments_45_0, grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_23_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_45_0, "The");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 25 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1556:6: ( ( (lv_fragments_46_0= 'The' ) ) ( (lv_fragments_47_0= ruleREGULAR_FRAGMENT ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1556:6: ( ( (lv_fragments_46_0= 'The' ) ) ( (lv_fragments_47_0= ruleREGULAR_FRAGMENT ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1556:7: ( (lv_fragments_46_0= 'The' ) ) ( (lv_fragments_47_0= ruleREGULAR_FRAGMENT ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1556:7: ( (lv_fragments_46_0= 'The' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1557:1: (lv_fragments_46_0= 'The' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1557:1: (lv_fragments_46_0= 'The' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1558:3: lv_fragments_46_0= 'The'
            	    {
            	    lv_fragments_46_0=(Token)match(input,14,FOLLOW_14_in_ruleSentence3465); 

            	            newLeafNode(lv_fragments_46_0, grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_0_24_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_46_0, "The");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1571:2: ( (lv_fragments_47_0= ruleREGULAR_FRAGMENT ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1572:1: (lv_fragments_47_0= ruleREGULAR_FRAGMENT )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1572:1: (lv_fragments_47_0= ruleREGULAR_FRAGMENT )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1573:3: lv_fragments_47_0= ruleREGULAR_FRAGMENT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_24_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_ruleSentence3499);
            	    lv_fragments_47_0=ruleREGULAR_FRAGMENT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSentenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fragments",
            	            		lv_fragments_47_0, 
            	            		"REGULAR_FRAGMENT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 26 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1590:6: ( (lv_fragments_48_0= 'end' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1590:6: ( (lv_fragments_48_0= 'end' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1591:1: (lv_fragments_48_0= 'end' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1591:1: (lv_fragments_48_0= 'end' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1592:3: lv_fragments_48_0= 'end'
            	    {
            	    lv_fragments_48_0=(Token)match(input,15,FOLLOW_15_in_ruleSentence3524); 

            	            newLeafNode(lv_fragments_48_0, grammarAccess.getSentenceAccess().getFragmentsEndKeyword_1_0_25_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_48_0, "end");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 27 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1606:6: ( ( (lv_fragments_49_0= 'Start' ) ) ( (lv_fragments_50_0= 'titled' ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1606:6: ( ( (lv_fragments_49_0= 'Start' ) ) ( (lv_fragments_50_0= 'titled' ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1606:7: ( (lv_fragments_49_0= 'Start' ) ) ( (lv_fragments_50_0= 'titled' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1606:7: ( (lv_fragments_49_0= 'Start' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1607:1: (lv_fragments_49_0= 'Start' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1607:1: (lv_fragments_49_0= 'Start' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1608:3: lv_fragments_49_0= 'Start'
            	    {
            	    lv_fragments_49_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence3562); 

            	            newLeafNode(lv_fragments_49_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_26_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_49_0, "Start");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1621:2: ( (lv_fragments_50_0= 'titled' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1622:1: (lv_fragments_50_0= 'titled' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1622:1: (lv_fragments_50_0= 'titled' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1623:3: lv_fragments_50_0= 'titled'
            	    {
            	    lv_fragments_50_0=(Token)match(input,20,FOLLOW_20_in_ruleSentence3593); 

            	            newLeafNode(lv_fragments_50_0, grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_26_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_50_0, "titled");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 28 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1637:6: ( ( (lv_fragments_51_0= 'Start' ) ) ( (lv_fragments_52_0= 'story' ) ) ( (lv_fragments_53_0= ruleREGULAR_FRAGMENT ) ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1637:6: ( ( (lv_fragments_51_0= 'Start' ) ) ( (lv_fragments_52_0= 'story' ) ) ( (lv_fragments_53_0= ruleREGULAR_FRAGMENT ) ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1637:7: ( (lv_fragments_51_0= 'Start' ) ) ( (lv_fragments_52_0= 'story' ) ) ( (lv_fragments_53_0= ruleREGULAR_FRAGMENT ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1637:7: ( (lv_fragments_51_0= 'Start' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1638:1: (lv_fragments_51_0= 'Start' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1638:1: (lv_fragments_51_0= 'Start' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1639:3: lv_fragments_51_0= 'Start'
            	    {
            	    lv_fragments_51_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence3632); 

            	            newLeafNode(lv_fragments_51_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_0_27_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_51_0, "Start");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1652:2: ( (lv_fragments_52_0= 'story' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1653:1: (lv_fragments_52_0= 'story' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1653:1: (lv_fragments_52_0= 'story' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1654:3: lv_fragments_52_0= 'story'
            	    {
            	    lv_fragments_52_0=(Token)match(input,19,FOLLOW_19_in_ruleSentence3663); 

            	            newLeafNode(lv_fragments_52_0, grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_27_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_52_0, "story");
            	    	    

            	    }


            	    }

            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1667:2: ( (lv_fragments_53_0= ruleREGULAR_FRAGMENT ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1668:1: (lv_fragments_53_0= ruleREGULAR_FRAGMENT )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1668:1: (lv_fragments_53_0= ruleREGULAR_FRAGMENT )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1669:3: lv_fragments_53_0= ruleREGULAR_FRAGMENT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSentenceAccess().getFragmentsREGULAR_FRAGMENTParserRuleCall_1_0_27_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_ruleSentence3697);
            	    lv_fragments_53_0=ruleREGULAR_FRAGMENT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSentenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fragments",
            	            		lv_fragments_53_0, 
            	            		"REGULAR_FRAGMENT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 29 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1686:6: ( (lv_fragments_54_0= 'story' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1686:6: ( (lv_fragments_54_0= 'story' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1687:1: (lv_fragments_54_0= 'story' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1687:1: (lv_fragments_54_0= 'story' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1688:3: lv_fragments_54_0= 'story'
            	    {
            	    lv_fragments_54_0=(Token)match(input,19,FOLLOW_19_in_ruleSentence3722); 

            	            newLeafNode(lv_fragments_54_0, grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_0_28_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_54_0, "story");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 30 :
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1702:6: ( (lv_fragments_55_0= 'titled' ) )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1702:6: ( (lv_fragments_55_0= 'titled' ) )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1703:1: (lv_fragments_55_0= 'titled' )
            	    {
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1703:1: (lv_fragments_55_0= 'titled' )
            	    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1704:3: lv_fragments_55_0= 'titled'
            	    {
            	    lv_fragments_55_0=(Token)match(input,20,FOLLOW_20_in_ruleSentence3759); 

            	            newLeafNode(lv_fragments_55_0, grammarAccess.getSentenceAccess().getFragmentsTitledKeyword_1_0_29_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSentenceRule());
            	    	        }
            	           		addWithLastConsumed(current, "fragments", lv_fragments_55_0, "titled");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1717:4: ( ( (lv_fragments_56_0= 'Start' ) ) | ( (lv_fragments_57_0= 'The' ) ) | ( ( (lv_fragments_58_0= 'Start' ) ) ( (lv_fragments_59_0= 'commonsense' ) ) ) | ( ( (lv_fragments_60_0= 'Start' ) ) ( (lv_fragments_61_0= 'reflexive' ) ) ) | ( ( (lv_fragments_62_0= 'Start' ) ) ( (lv_fragments_63_0= 'description' ) ) ) | ( ( (lv_fragments_64_0= 'Start' ) ) ( (lv_fragments_65_0= 'story' ) ) ) )?
            int alt8=7;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==9) ) {
                switch ( input.LA(2) ) {
                    case 12:
                        {
                        alt8=1;
                        }
                        break;
                    case 10:
                        {
                        alt8=3;
                        }
                        break;
                    case 13:
                        {
                        alt8=4;
                        }
                        break;
                    case 19:
                        {
                        alt8=6;
                        }
                        break;
                    case 16:
                        {
                        alt8=5;
                        }
                        break;
                }

            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1717:5: ( (lv_fragments_56_0= 'Start' ) )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1717:5: ( (lv_fragments_56_0= 'Start' ) )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1718:1: (lv_fragments_56_0= 'Start' )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1718:1: (lv_fragments_56_0= 'Start' )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1719:3: lv_fragments_56_0= 'Start'
                    {
                    lv_fragments_56_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence3793); 

                            newLeafNode(lv_fragments_56_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSentenceRule());
                    	        }
                           		addWithLastConsumed(current, "fragments", lv_fragments_56_0, "Start");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1733:6: ( (lv_fragments_57_0= 'The' ) )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1733:6: ( (lv_fragments_57_0= 'The' ) )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1734:1: (lv_fragments_57_0= 'The' )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1734:1: (lv_fragments_57_0= 'The' )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1735:3: lv_fragments_57_0= 'The'
                    {
                    lv_fragments_57_0=(Token)match(input,14,FOLLOW_14_in_ruleSentence3830); 

                            newLeafNode(lv_fragments_57_0, grammarAccess.getSentenceAccess().getFragmentsTheKeyword_1_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSentenceRule());
                    	        }
                           		addWithLastConsumed(current, "fragments", lv_fragments_57_0, "The");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1749:6: ( ( (lv_fragments_58_0= 'Start' ) ) ( (lv_fragments_59_0= 'commonsense' ) ) )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1749:6: ( ( (lv_fragments_58_0= 'Start' ) ) ( (lv_fragments_59_0= 'commonsense' ) ) )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1749:7: ( (lv_fragments_58_0= 'Start' ) ) ( (lv_fragments_59_0= 'commonsense' ) )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1749:7: ( (lv_fragments_58_0= 'Start' ) )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1750:1: (lv_fragments_58_0= 'Start' )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1750:1: (lv_fragments_58_0= 'Start' )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1751:3: lv_fragments_58_0= 'Start'
                    {
                    lv_fragments_58_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence3868); 

                            newLeafNode(lv_fragments_58_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSentenceRule());
                    	        }
                           		addWithLastConsumed(current, "fragments", lv_fragments_58_0, "Start");
                    	    

                    }


                    }

                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1764:2: ( (lv_fragments_59_0= 'commonsense' ) )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1765:1: (lv_fragments_59_0= 'commonsense' )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1765:1: (lv_fragments_59_0= 'commonsense' )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1766:3: lv_fragments_59_0= 'commonsense'
                    {
                    lv_fragments_59_0=(Token)match(input,10,FOLLOW_10_in_ruleSentence3899); 

                            newLeafNode(lv_fragments_59_0, grammarAccess.getSentenceAccess().getFragmentsCommonsenseKeyword_1_1_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSentenceRule());
                    	        }
                           		addWithLastConsumed(current, "fragments", lv_fragments_59_0, "commonsense");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1780:6: ( ( (lv_fragments_60_0= 'Start' ) ) ( (lv_fragments_61_0= 'reflexive' ) ) )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1780:6: ( ( (lv_fragments_60_0= 'Start' ) ) ( (lv_fragments_61_0= 'reflexive' ) ) )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1780:7: ( (lv_fragments_60_0= 'Start' ) ) ( (lv_fragments_61_0= 'reflexive' ) )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1780:7: ( (lv_fragments_60_0= 'Start' ) )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1781:1: (lv_fragments_60_0= 'Start' )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1781:1: (lv_fragments_60_0= 'Start' )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1782:3: lv_fragments_60_0= 'Start'
                    {
                    lv_fragments_60_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence3938); 

                            newLeafNode(lv_fragments_60_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSentenceRule());
                    	        }
                           		addWithLastConsumed(current, "fragments", lv_fragments_60_0, "Start");
                    	    

                    }


                    }

                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1795:2: ( (lv_fragments_61_0= 'reflexive' ) )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1796:1: (lv_fragments_61_0= 'reflexive' )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1796:1: (lv_fragments_61_0= 'reflexive' )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1797:3: lv_fragments_61_0= 'reflexive'
                    {
                    lv_fragments_61_0=(Token)match(input,13,FOLLOW_13_in_ruleSentence3969); 

                            newLeafNode(lv_fragments_61_0, grammarAccess.getSentenceAccess().getFragmentsReflexiveKeyword_1_1_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSentenceRule());
                    	        }
                           		addWithLastConsumed(current, "fragments", lv_fragments_61_0, "reflexive");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1811:6: ( ( (lv_fragments_62_0= 'Start' ) ) ( (lv_fragments_63_0= 'description' ) ) )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1811:6: ( ( (lv_fragments_62_0= 'Start' ) ) ( (lv_fragments_63_0= 'description' ) ) )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1811:7: ( (lv_fragments_62_0= 'Start' ) ) ( (lv_fragments_63_0= 'description' ) )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1811:7: ( (lv_fragments_62_0= 'Start' ) )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1812:1: (lv_fragments_62_0= 'Start' )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1812:1: (lv_fragments_62_0= 'Start' )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1813:3: lv_fragments_62_0= 'Start'
                    {
                    lv_fragments_62_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence4008); 

                            newLeafNode(lv_fragments_62_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSentenceRule());
                    	        }
                           		addWithLastConsumed(current, "fragments", lv_fragments_62_0, "Start");
                    	    

                    }


                    }

                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1826:2: ( (lv_fragments_63_0= 'description' ) )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1827:1: (lv_fragments_63_0= 'description' )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1827:1: (lv_fragments_63_0= 'description' )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1828:3: lv_fragments_63_0= 'description'
                    {
                    lv_fragments_63_0=(Token)match(input,16,FOLLOW_16_in_ruleSentence4039); 

                            newLeafNode(lv_fragments_63_0, grammarAccess.getSentenceAccess().getFragmentsDescriptionKeyword_1_1_4_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSentenceRule());
                    	        }
                           		addWithLastConsumed(current, "fragments", lv_fragments_63_0, "description");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1842:6: ( ( (lv_fragments_64_0= 'Start' ) ) ( (lv_fragments_65_0= 'story' ) ) )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1842:6: ( ( (lv_fragments_64_0= 'Start' ) ) ( (lv_fragments_65_0= 'story' ) ) )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1842:7: ( (lv_fragments_64_0= 'Start' ) ) ( (lv_fragments_65_0= 'story' ) )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1842:7: ( (lv_fragments_64_0= 'Start' ) )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1843:1: (lv_fragments_64_0= 'Start' )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1843:1: (lv_fragments_64_0= 'Start' )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1844:3: lv_fragments_64_0= 'Start'
                    {
                    lv_fragments_64_0=(Token)match(input,9,FOLLOW_9_in_ruleSentence4078); 

                            newLeafNode(lv_fragments_64_0, grammarAccess.getSentenceAccess().getFragmentsStartKeyword_1_1_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSentenceRule());
                    	        }
                           		addWithLastConsumed(current, "fragments", lv_fragments_64_0, "Start");
                    	    

                    }


                    }

                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1857:2: ( (lv_fragments_65_0= 'story' ) )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1858:1: (lv_fragments_65_0= 'story' )
                    {
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1858:1: (lv_fragments_65_0= 'story' )
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1859:3: lv_fragments_65_0= 'story'
                    {
                    lv_fragments_65_0=(Token)match(input,19,FOLLOW_19_in_ruleSentence4109); 

                            newLeafNode(lv_fragments_65_0, grammarAccess.getSentenceAccess().getFragmentsStoryKeyword_1_1_5_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSentenceRule());
                    	        }
                           		addWithLastConsumed(current, "fragments", lv_fragments_65_0, "story");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_66=(Token)match(input,12,FOLLOW_12_in_ruleSentence4137); 

                	newLeafNode(otherlv_66, grammarAccess.getSentenceAccess().getFullStopKeyword_1_2());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleREGULAR_FRAGMENT"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1884:1: entryRuleREGULAR_FRAGMENT returns [String current=null] : iv_ruleREGULAR_FRAGMENT= ruleREGULAR_FRAGMENT EOF ;
    public final String entryRuleREGULAR_FRAGMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREGULAR_FRAGMENT = null;


        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1885:2: (iv_ruleREGULAR_FRAGMENT= ruleREGULAR_FRAGMENT EOF )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1886:2: iv_ruleREGULAR_FRAGMENT= ruleREGULAR_FRAGMENT EOF
            {
             newCompositeNode(grammarAccess.getREGULAR_FRAGMENTRule()); 
            pushFollow(FOLLOW_ruleREGULAR_FRAGMENT_in_entryRuleREGULAR_FRAGMENT4175);
            iv_ruleREGULAR_FRAGMENT=ruleREGULAR_FRAGMENT();

            state._fsp--;

             current =iv_ruleREGULAR_FRAGMENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREGULAR_FRAGMENT4186); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREGULAR_FRAGMENT"


    // $ANTLR start "ruleREGULAR_FRAGMENT"
    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1893:1: ruleREGULAR_FRAGMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QUOTED_TEXT_0= RULE_QUOTED_TEXT | this_WORD_1= RULE_WORD | kw= ',' | kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleREGULAR_FRAGMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUOTED_TEXT_0=null;
        Token this_WORD_1=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1896:28: ( (this_QUOTED_TEXT_0= RULE_QUOTED_TEXT | this_WORD_1= RULE_WORD | kw= ',' | kw= ';' ) )
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1897:1: (this_QUOTED_TEXT_0= RULE_QUOTED_TEXT | this_WORD_1= RULE_WORD | kw= ',' | kw= ';' )
            {
            // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1897:1: (this_QUOTED_TEXT_0= RULE_QUOTED_TEXT | this_WORD_1= RULE_WORD | kw= ',' | kw= ';' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_QUOTED_TEXT:
                {
                alt9=1;
                }
                break;
            case RULE_WORD:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1897:6: this_QUOTED_TEXT_0= RULE_QUOTED_TEXT
                    {
                    this_QUOTED_TEXT_0=(Token)match(input,RULE_QUOTED_TEXT,FOLLOW_RULE_QUOTED_TEXT_in_ruleREGULAR_FRAGMENT4226); 

                    		current.merge(this_QUOTED_TEXT_0);
                        
                     
                        newLeafNode(this_QUOTED_TEXT_0, grammarAccess.getREGULAR_FRAGMENTAccess().getQUOTED_TEXTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1905:10: this_WORD_1= RULE_WORD
                    {
                    this_WORD_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleREGULAR_FRAGMENT4252); 

                    		current.merge(this_WORD_1);
                        
                     
                        newLeafNode(this_WORD_1, grammarAccess.getREGULAR_FRAGMENTAccess().getWORDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1914:2: kw= ','
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleREGULAR_FRAGMENT4276); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getREGULAR_FRAGMENTAccess().getCommaKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.csail.genesis/src-gen/org/csail/genesis/parser/antlr/internal/InternalGenesis.g:1921:2: kw= ';'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleREGULAR_FRAGMENT4295); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getREGULAR_FRAGMENTAccess().getSemicolonKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleREGULAR_FRAGMENT"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\46\uffff";
    static final String DFA7_eofS =
        "\46\uffff";
    static final String DFA7_minS =
        "\3\4\14\uffff\3\4\2\uffff\1\4\21\uffff";
    static final String DFA7_maxS =
        "\3\26\14\uffff\3\26\2\uffff\1\26\21\uffff";
    static final String DFA7_acceptS =
        "\3\uffff\1\37\1\1\1\11\1\12\1\14\1\16\1\17\1\32\1\35\1\36\1\33\1"+
        "\4\3\uffff\1\10\1\6\1\uffff\1\5\1\7\1\2\1\30\1\23\1\24\1\20\1\22"+
        "\1\21\1\26\1\25\1\31\1\27\1\13\1\15\1\3\1\34";
    static final String DFA7_specialS =
        "\46\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\4\3\uffff\1\1\1\6\1\5\1\3\1\7\1\2\1\12\1\10\1\11\1\uffff"+
            "\1\13\1\14\2\4",
            "\2\22\3\uffff\1\26\1\21\1\27\1\3\1\17\1\16\1\25\1\20\1\23\1"+
            "\uffff\1\24\1\15\2\22",
            "\2\40\3\uffff\1\41\1\33\1\35\1\3\1\34\1\30\1\uffff\1\31\1\32"+
            "\1\uffff\1\37\1\36\2\40",
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
            "\2\42\6\uffff\1\3\10\uffff\2\42",
            "\2\43\6\uffff\1\3\10\uffff\2\43",
            "\2\44\6\uffff\1\3\10\uffff\2\44",
            "",
            "",
            "\2\45\6\uffff\1\3\10\uffff\2\45",
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 842:3: ( ( (lv_fragments_1_0= ruleREGULAR_FRAGMENT ) ) | ( ( (lv_fragments_2_0= 'Start' ) ) ( (lv_fragments_3_0= 'knowledge' ) ) ) | ( ( (lv_fragments_4_0= 'Start' ) ) ( (lv_fragments_5_0= 'commonsense' ) ) ( (lv_fragments_6_0= ruleREGULAR_FRAGMENT ) ) ) | ( ( (lv_fragments_7_0= 'Start' ) ) ( (lv_fragments_8_0= 'The' ) ) ) | ( ( (lv_fragments_9_0= 'Start' ) ) ( (lv_fragments_10_0= 'end' ) ) ) | ( ( (lv_fragments_11_0= 'Start' ) ) ( (lv_fragments_12_0= 'of' ) ) ) | ( ( (lv_fragments_13_0= 'Start' ) ) ( (lv_fragments_14_0= 'Start' ) ) ) | ( ( (lv_fragments_15_0= 'Start' ) ) ( (lv_fragments_16_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_17_0= 'knowledge' ) ) | ( (lv_fragments_18_0= 'commonsense' ) ) | ( ( (lv_fragments_19_0= 'Start' ) ) ( (lv_fragments_20_0= 'reflexive' ) ) ( (lv_fragments_21_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_22_0= 'reflexive' ) ) | ( ( (lv_fragments_23_0= 'Start' ) ) ( (lv_fragments_24_0= 'description' ) ) ( (lv_fragments_25_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_26_0= 'description' ) ) | ( (lv_fragments_27_0= 'of' ) ) | ( ( (lv_fragments_28_0= 'The' ) ) ( (lv_fragments_29_0= 'commonsense' ) ) ) | ( ( (lv_fragments_30_0= 'The' ) ) ( (lv_fragments_31_0= 'knowledge' ) ) ) | ( ( (lv_fragments_32_0= 'The' ) ) ( (lv_fragments_33_0= 'reflexive' ) ) ) | ( ( (lv_fragments_34_0= 'The' ) ) ( (lv_fragments_35_0= 'description' ) ) ) | ( ( (lv_fragments_36_0= 'The' ) ) ( (lv_fragments_37_0= 'of' ) ) ) | ( ( (lv_fragments_38_0= 'The' ) ) ( (lv_fragments_39_0= 'story' ) ) ) | ( ( (lv_fragments_40_0= 'The' ) ) ( (lv_fragments_41_0= 'titled' ) ) ) | ( ( (lv_fragments_42_0= 'The' ) ) ( (lv_fragments_43_0= 'Start' ) ) ) | ( ( (lv_fragments_44_0= 'The' ) ) ( (lv_fragments_45_0= 'The' ) ) ) | ( ( (lv_fragments_46_0= 'The' ) ) ( (lv_fragments_47_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_48_0= 'end' ) ) | ( ( (lv_fragments_49_0= 'Start' ) ) ( (lv_fragments_50_0= 'titled' ) ) ) | ( ( (lv_fragments_51_0= 'Start' ) ) ( (lv_fragments_52_0= 'story' ) ) ( (lv_fragments_53_0= ruleREGULAR_FRAGMENT ) ) ) | ( (lv_fragments_54_0= 'story' ) ) | ( (lv_fragments_55_0= 'titled' ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_ruleModel131 = new BitSet(new long[]{0x00000000007BFE32L});
    public static final BitSet FOLLOW_ruleSection_in_ruleModel153 = new BitSet(new long[]{0x0000000000000222L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonsenseKnowledge_in_ruleSection247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflexiveKnowledge_in_ruleSection274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerspective_in_ruleSection301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonsenseKnowledge_in_entryRuleCommonsenseKnowledge336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonsenseKnowledge346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonsenseKnowledgeHeader_in_ruleCommonsenseKnowledge401 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_ruleDescription_in_ruleCommonsenseKnowledge422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonsenseKnowledgeHeader_in_entryRuleCommonsenseKnowledgeHeader459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonsenseKnowledgeHeader470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleCommonsenseKnowledgeHeader508 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleCommonsenseKnowledgeHeader521 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleCommonsenseKnowledgeHeader534 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCommonsenseKnowledgeHeader547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflexiveKnowledge_in_entryRuleReflexiveKnowledge587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflexiveKnowledge597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflexiveKnowledgeHeader_in_ruleReflexiveKnowledge652 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleReflexiveDescription_in_ruleReflexiveKnowledge673 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleReflexiveKnowledgeHeader_in_entryRuleReflexiveKnowledgeHeader711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflexiveKnowledgeHeader722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleReflexiveKnowledgeHeader760 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleReflexiveKnowledgeHeader773 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleReflexiveKnowledgeHeader786 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleReflexiveKnowledgeHeader799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflexiveDescription_in_entryRuleReflexiveDescription839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflexiveDescription849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflexiveDescriptionHeader_in_ruleReflexiveDescription904 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_ruleDescription_in_ruleReflexiveDescription925 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleTheEndFooter_in_ruleReflexiveDescription941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheEndFooter_in_entryRuleTheEndFooter977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheEndFooter988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTheEndFooter1026 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTheEndFooter1039 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTheEndFooter1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflexiveDescriptionHeader_in_entryRuleReflexiveDescriptionHeader1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflexiveDescriptionHeader1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleReflexiveDescriptionHeader1142 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleReflexiveDescriptionHeader1155 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleReflexiveDescriptionHeader1168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_QUOTED_TEXT_in_ruleReflexiveDescriptionHeader1183 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleReflexiveDescriptionHeader1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerspective_in_entryRulePerspective1241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerspective1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerspectiveHeader_in_rulePerspective1306 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleStory_in_rulePerspective1327 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rulePerspectiveHeader_in_entryRulePerspectiveHeader1365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerspectiveHeader1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rulePerspectiveHeader1416 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePerspectiveHeader1434 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePerspectiveHeader1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStory_in_entryRuleStory1487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStory1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoryHeader_in_ruleStory1552 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_ruleDescription_in_ruleStory1573 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleTheEndFooter_in_ruleStory1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoryHeader_in_entryRuleStoryHeader1625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStoryHeader1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleStoryHeader1674 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStoryHeader1687 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStoryHeader1700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_QUOTED_TEXT_in_ruleStoryHeader1715 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStoryHeader1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription1773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_ruleDescription1838 = new BitSet(new long[]{0x00000000007BFE32L});
    public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence1875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentence1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_ruleSentence1942 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_9_in_ruleSentence1967 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSentence1998 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_9_in_ruleSentence2037 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleSentence2068 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_ruleSentence2102 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_9_in_ruleSentence2128 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSentence2159 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_9_in_ruleSentence2198 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSentence2229 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_9_in_ruleSentence2268 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSentence2299 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_9_in_ruleSentence2338 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_ruleSentence2369 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_9_in_ruleSentence2408 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_ruleSentence2442 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_11_in_ruleSentence2467 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_10_in_ruleSentence2504 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_9_in_ruleSentence2542 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSentence2573 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_ruleSentence2607 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_13_in_ruleSentence2632 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_9_in_ruleSentence2670 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSentence2701 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_ruleSentence2735 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_16_in_ruleSentence2760 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_17_in_ruleSentence2797 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_14_in_ruleSentence2835 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleSentence2866 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_14_in_ruleSentence2905 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSentence2936 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_14_in_ruleSentence2975 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSentence3006 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_14_in_ruleSentence3045 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSentence3076 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_14_in_ruleSentence3115 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSentence3146 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_14_in_ruleSentence3185 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSentence3216 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_14_in_ruleSentence3255 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSentence3286 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_14_in_ruleSentence3325 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_ruleSentence3356 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_14_in_ruleSentence3395 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSentence3426 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_14_in_ruleSentence3465 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_ruleSentence3499 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_15_in_ruleSentence3524 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_9_in_ruleSentence3562 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSentence3593 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_9_in_ruleSentence3632 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSentence3663 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_ruleSentence3697 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_19_in_ruleSentence3722 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_20_in_ruleSentence3759 = new BitSet(new long[]{0x00000000007BFE30L});
    public static final BitSet FOLLOW_9_in_ruleSentence3793 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_14_in_ruleSentence3830 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9_in_ruleSentence3868 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleSentence3899 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9_in_ruleSentence3938 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSentence3969 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9_in_ruleSentence4008 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSentence4039 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9_in_ruleSentence4078 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSentence4109 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSentence4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGULAR_FRAGMENT_in_entryRuleREGULAR_FRAGMENT4175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREGULAR_FRAGMENT4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUOTED_TEXT_in_ruleREGULAR_FRAGMENT4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleREGULAR_FRAGMENT4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleREGULAR_FRAGMENT4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleREGULAR_FRAGMENT4295 = new BitSet(new long[]{0x0000000000000002L});

}