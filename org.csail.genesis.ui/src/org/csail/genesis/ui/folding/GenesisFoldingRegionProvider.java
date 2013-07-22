package org.csail.genesis.ui.folding;

import org.csail.genesis.genesis.Description;
import org.csail.genesis.genesis.Sentence;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;

public class GenesisFoldingRegionProvider extends DefaultFoldingRegionProvider {
    @Override
    protected boolean isHandled(EObject eObject) {
        return eObject.eContainer() != null && 
               !(eObject instanceof Description ||
                 eObject instanceof Sentence);
    }
}
