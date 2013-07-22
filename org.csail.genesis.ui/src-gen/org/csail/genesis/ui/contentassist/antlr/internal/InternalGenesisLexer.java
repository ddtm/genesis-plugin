package org.csail.genesis.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGenesisLexer extends Lexer {
    public static final int RULE_QUOTED_TEXT=4;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=8;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=6;
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

    public InternalGenesisLexer() {;} 
    public InternalGenesisLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGenesisLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:11:6: ( ',' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:11:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:12:7: ( ';' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:13:7: ( 'Start' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:13:9: 'Start'
            {
            match("Start"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:14:7: ( 'commonsense' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:14:9: 'commonsense'
            {
            match("commonsense"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:15:7: ( 'knowledge' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:15:9: 'knowledge'
            {
            match("knowledge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:16:7: ( '.' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:16:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:17:7: ( 'reflexive' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:17:9: 'reflexive'
            {
            match("reflexive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:18:7: ( 'The' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:18:9: 'The'
            {
            match("The"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:19:7: ( 'end' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:19:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:20:7: ( 'description' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:20:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:21:7: ( 'of' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:21:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:22:7: ( 'perspective' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:22:9: 'perspective'
            {
            match("perspective"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:23:7: ( 'story' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:23:9: 'story'
            {
            match("story"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:24:7: ( 'titled' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:24:9: 'titled'
            {
            match("titled"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_QUOTED_TEXT"
    public final void mRULE_QUOTED_TEXT() throws RecognitionException {
        try {
            int _type = RULE_QUOTED_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5690:18: ( '\"' (~ ( '\"' ) )* '\"' )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5690:20: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5690:24: (~ ( '\"' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5690:24: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUOTED_TEXT"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5692:11: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '\"' | '\\'' )+ )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5692:13: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '\"' | '\\'' )+
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5692:13: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '\"' | '\\'' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\"'||LA2_0=='\''||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:
            	    {
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5694:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5694:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5694:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5694:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5694:40: ( ( '\\r' )? '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5694:41: ( '\\r' )? '\\n'
                    {
                    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5694:41: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5694:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5696:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5696:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5696:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5698:16: ( . )
            // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:5698:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_QUOTED_TEXT | RULE_WORD | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt7=19;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:93: RULE_QUOTED_TEXT
                {
                mRULE_QUOTED_TEXT(); 

                }
                break;
            case 16 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:110: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 17 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:120: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:136: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // ../org.csail.genesis.ui/src-gen/org/csail/genesis/ui/contentassist/antlr/internal/InternalGenesis.g:1:144: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\3\uffff\3\27\1\uffff\11\27\1\uffff\1\23\4\uffff\1\27\1\uffff\2"+
        "\27\1\uffff\4\27\1\57\4\27\1\45\3\uffff\4\27\1\67\1\70\1\27\1\uffff"+
        "\7\27\2\uffff\4\27\1\105\5\27\1\113\1\27\1\uffff\5\27\1\uffff\1"+
        "\122\5\27\1\uffff\6\27\1\136\1\137\3\27\2\uffff\2\27\1\145\1\146"+
        "\1\147\3\uffff";
    static final String DFA7_eofS =
        "\150\uffff";
    static final String DFA7_minS =
        "\1\0\2\uffff\1\164\1\157\1\156\1\uffff\1\145\1\150\1\156\1\145\1"+
        "\146\1\145\1\164\1\151\1\0\1\uffff\1\57\4\uffff\1\141\1\uffff\1"+
        "\155\1\157\1\uffff\1\146\1\145\1\144\1\163\1\42\1\162\1\157\1\164"+
        "\1\0\1\42\3\uffff\1\162\1\155\1\167\1\154\2\42\1\143\1\uffff\1\163"+
        "\1\162\1\154\1\164\1\157\1\154\1\145\2\uffff\1\162\1\160\1\171\1"+
        "\145\1\42\1\156\1\145\1\170\1\151\1\145\1\42\1\144\1\uffff\1\163"+
        "\1\144\1\151\1\160\1\143\1\uffff\1\42\1\145\1\147\1\166\2\164\1"+
        "\uffff\1\156\2\145\2\151\1\163\2\42\1\157\1\166\1\145\2\uffff\1"+
        "\156\1\145\3\42\3\uffff";
    static final String DFA7_maxS =
        "\1\uffff\2\uffff\1\164\1\157\1\156\1\uffff\1\145\1\150\1\156\1\145"+
        "\1\146\1\145\1\164\1\151\1\uffff\1\uffff\1\57\4\uffff\1\141\1\uffff"+
        "\1\155\1\157\1\uffff\1\146\1\145\1\144\1\163\1\172\1\162\1\157\1"+
        "\164\1\uffff\1\172\3\uffff\1\162\1\155\1\167\1\154\2\172\1\143\1"+
        "\uffff\1\163\1\162\1\154\1\164\1\157\1\154\1\145\2\uffff\1\162\1"+
        "\160\1\171\1\145\1\172\1\156\1\145\1\170\1\151\1\145\1\172\1\144"+
        "\1\uffff\1\163\1\144\1\151\1\160\1\143\1\uffff\1\172\1\145\1\147"+
        "\1\166\2\164\1\uffff\1\156\2\145\2\151\1\163\2\172\1\157\1\166\1"+
        "\145\2\uffff\1\156\1\145\3\172\3\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\6\11\uffff\1\20\1\uffff\1\22\1\23\1\1"+
        "\1\2\1\uffff\1\20\2\uffff\1\6\12\uffff\1\17\1\21\1\22\7\uffff\1"+
        "\13\7\uffff\1\10\1\11\14\uffff\1\3\5\uffff\1\15\6\uffff\1\16\13"+
        "\uffff\1\5\1\7\5\uffff\1\4\1\12\1\14";
    static final String DFA7_specialS =
        "\1\2\16\uffff\1\0\23\uffff\1\1\104\uffff}>";
    static final String[] DFA7_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\4\23\1\20\4\23\1"+
            "\1\1\23\1\6\1\21\12\20\1\23\1\2\5\23\22\20\1\3\1\10\6\20\4\23"+
            "\1\20\1\23\2\20\1\4\1\12\1\11\5\20\1\5\3\20\1\13\1\14\1\20\1"+
            "\7\1\15\1\16\6\20\uff85\23",
            "",
            "",
            "\1\26",
            "\1\30",
            "\1\31",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\42\45\1\44\4\45\1\43\10\45\12\43\7\45\32\43\4\45\1\43\1\45"+
            "\32\43\uff85\45",
            "",
            "\1\46",
            "",
            "",
            "",
            "",
            "\1\50",
            "",
            "\1\51",
            "\1\52",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\27\4\uffff\1\27\10\uffff\12\27\7\uffff\32\27\4\uffff\1\27"+
            "\1\uffff\32\27",
            "\1\60",
            "\1\61",
            "\1\62",
            "\42\45\1\44\4\45\1\43\10\45\12\43\7\45\32\43\4\45\1\43\1\45"+
            "\32\43\uff85\45",
            "\1\27\4\uffff\1\27\10\uffff\12\27\7\uffff\32\27\4\uffff\1\27"+
            "\1\uffff\32\27",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\27\4\uffff\1\27\10\uffff\12\27\7\uffff\32\27\4\uffff\1\27"+
            "\1\uffff\32\27",
            "\1\27\4\uffff\1\27\10\uffff\12\27\7\uffff\32\27\4\uffff\1\27"+
            "\1\uffff\32\27",
            "\1\71",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\27\4\uffff\1\27\10\uffff\12\27\7\uffff\32\27\4\uffff\1\27"+
            "\1\uffff\32\27",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\27\4\uffff\1\27\10\uffff\12\27\7\uffff\32\27\4\uffff\1\27"+
            "\1\uffff\32\27",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\27\4\uffff\1\27\10\uffff\12\27\7\uffff\32\27\4\uffff\1\27"+
            "\1\uffff\32\27",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\27\4\uffff\1\27\10\uffff\12\27\7\uffff\32\27\4\uffff\1\27"+
            "\1\uffff\32\27",
            "\1\27\4\uffff\1\27\10\uffff\12\27\7\uffff\32\27\4\uffff\1\27"+
            "\1\uffff\32\27",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\27\4\uffff\1\27\10\uffff\12\27\7\uffff\32\27\4\uffff\1\27"+
            "\1\uffff\32\27",
            "\1\27\4\uffff\1\27\10\uffff\12\27\7\uffff\32\27\4\uffff\1\27"+
            "\1\uffff\32\27",
            "\1\27\4\uffff\1\27\10\uffff\12\27\7\uffff\32\27\4\uffff\1\27"+
            "\1\uffff\32\27",
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
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_QUOTED_TEXT | RULE_WORD | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_15 = input.LA(1);

                        s = -1;
                        if ( (LA7_15=='\''||(LA7_15>='0' && LA7_15<='9')||(LA7_15>='A' && LA7_15<='Z')||LA7_15=='_'||(LA7_15>='a' && LA7_15<='z')) ) {s = 35;}

                        else if ( (LA7_15=='\"') ) {s = 36;}

                        else if ( ((LA7_15>='\u0000' && LA7_15<='!')||(LA7_15>='#' && LA7_15<='&')||(LA7_15>='(' && LA7_15<='/')||(LA7_15>=':' && LA7_15<='@')||(LA7_15>='[' && LA7_15<='^')||LA7_15=='`'||(LA7_15>='{' && LA7_15<='\uFFFF')) ) {s = 37;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_35 = input.LA(1);

                        s = -1;
                        if ( (LA7_35=='\"') ) {s = 36;}

                        else if ( (LA7_35=='\''||(LA7_35>='0' && LA7_35<='9')||(LA7_35>='A' && LA7_35<='Z')||LA7_35=='_'||(LA7_35>='a' && LA7_35<='z')) ) {s = 35;}

                        else if ( ((LA7_35>='\u0000' && LA7_35<='!')||(LA7_35>='#' && LA7_35<='&')||(LA7_35>='(' && LA7_35<='/')||(LA7_35>=':' && LA7_35<='@')||(LA7_35>='[' && LA7_35<='^')||LA7_35=='`'||(LA7_35>='{' && LA7_35<='\uFFFF')) ) {s = 37;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_0 = input.LA(1);

                        s = -1;
                        if ( (LA7_0==',') ) {s = 1;}

                        else if ( (LA7_0==';') ) {s = 2;}

                        else if ( (LA7_0=='S') ) {s = 3;}

                        else if ( (LA7_0=='c') ) {s = 4;}

                        else if ( (LA7_0=='k') ) {s = 5;}

                        else if ( (LA7_0=='.') ) {s = 6;}

                        else if ( (LA7_0=='r') ) {s = 7;}

                        else if ( (LA7_0=='T') ) {s = 8;}

                        else if ( (LA7_0=='e') ) {s = 9;}

                        else if ( (LA7_0=='d') ) {s = 10;}

                        else if ( (LA7_0=='o') ) {s = 11;}

                        else if ( (LA7_0=='p') ) {s = 12;}

                        else if ( (LA7_0=='s') ) {s = 13;}

                        else if ( (LA7_0=='t') ) {s = 14;}

                        else if ( (LA7_0=='\"') ) {s = 15;}

                        else if ( (LA7_0=='\''||(LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='R')||(LA7_0>='U' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='b')||(LA7_0>='f' && LA7_0<='j')||(LA7_0>='l' && LA7_0<='n')||LA7_0=='q'||(LA7_0>='u' && LA7_0<='z')) ) {s = 16;}

                        else if ( (LA7_0=='/') ) {s = 17;}

                        else if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {s = 18;}

                        else if ( ((LA7_0>='\u0000' && LA7_0<='\b')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\u001F')||LA7_0=='!'||(LA7_0>='#' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='+')||LA7_0=='-'||LA7_0==':'||(LA7_0>='<' && LA7_0<='@')||(LA7_0>='[' && LA7_0<='^')||LA7_0=='`'||(LA7_0>='{' && LA7_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}