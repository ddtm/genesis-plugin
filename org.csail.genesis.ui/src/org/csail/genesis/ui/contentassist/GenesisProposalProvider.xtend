/*
 * generated by Xtext
 */
package org.csail.genesis.ui.contentassist

import org.csail.genesis.ui.contentassist.AbstractGenesisProposalProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.Keyword

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
class GenesisProposalProvider extends AbstractGenesisProposalProvider {
    override complete_CommonsenseKnowledge(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        super.complete_CommonsenseKnowledge(model, ruleCall, context, acceptor);
 
        var proposal = "Start commonsense knowledge.\n";
 
        acceptor.accept(createCompletionProposal(proposal, context));
    }
    
    override complete_ReflexiveKnowledge(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        super.complete_ReflexiveKnowledge(model, ruleCall, context, acceptor);
 
        var proposal = "Start reflexive knowledge.\n";
 
        acceptor.accept(createCompletionProposal(proposal, context));
    }
    
    override complete_Perspective(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        super.complete_Perspective(model, ruleCall, context, acceptor);
 
        var prefix = context.getPrefix();
        var proposal = prefix + " perspective.\n";
 
        acceptor.accept(createCompletionProposal(proposal, context));
    }

    override completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
            ICompletionProposalAcceptor acceptor) {
    }
}
