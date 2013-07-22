package org.csail.genesis.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class GenesisHighlightingConfiguration implements
        IHighlightingConfiguration {
    public static final String SECTION = "Section";
    public static final String DESCRIPTION = "Description";
    public static final String IDENTIFIER = "Identifier";
    public static final String COMMENT_ID = "comment";
    
    private static final int[] VAR_PERM = {
        21, 5, 2, 15, 10, 6, 27, 16, 13, 7, 4, 20, 24,
        26, 25, 18, 14, 0, 22, 1, 3, 17, 23, 12, 8, 19,
        9, 11
    };
    
    public void configure(IHighlightingConfigurationAcceptor acceptor) {
        // Setup variables' styles.
        for (char c = 'a'; c <= 'z'; ++c) {
            String varId = String.valueOf(c) +  String.valueOf(c);
            String varDesc = "Variable \"" + varId + "\"";
            
            acceptor.acceptDefaultHighlighting(varId, varDesc, variableTextStyle(c - 'a'));
        }
        
        // Setup other styles.
        acceptor.acceptDefaultHighlighting(SECTION, "Section", sectionTextStyle());
        acceptor.acceptDefaultHighlighting(DESCRIPTION, "Description", descriptionTextStyle());
        acceptor.acceptDefaultHighlighting(IDENTIFIER, "Identifier", identifierTextStyle());
        acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
    }
    
    public TextStyle variableTextStyle(int index) {
        float intensity = 0.5f + (0.5f / 28.0f) * VAR_PERM[index];
        
        TextStyle textStyle = new TextStyle();
        textStyle.setStyle(SWT.BOLD);
        textStyle.setColor(new RGB(300.0f, 0.8f, intensity));
        
        return textStyle;
    }
    
    public TextStyle sectionTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setStyle(SWT.BOLD);
        textStyle.setColor(new RGB(0, 100, 0));
        
        return textStyle;
    }
    
    public TextStyle descriptionTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setStyle(SWT.BOLD);
        textStyle.setColor(new RGB(0, 0, 100));
        
        return textStyle;
    }
    
    public TextStyle identifierTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setStyle(SWT.BOLD | SWT.ITALIC);
        textStyle.setColor(new RGB(120, 190, 110));
        
        return textStyle;
    }
    
    public TextStyle commentTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setColor(new RGB(150, 150, 150));
        
        return textStyle;
    }
}
