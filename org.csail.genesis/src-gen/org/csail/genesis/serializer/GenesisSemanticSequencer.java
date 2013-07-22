package org.csail.genesis.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.csail.genesis.genesis.CommonsenseKnowledge;
import org.csail.genesis.genesis.Description;
import org.csail.genesis.genesis.GenesisPackage;
import org.csail.genesis.genesis.Model;
import org.csail.genesis.genesis.Perspective;
import org.csail.genesis.genesis.ReflexiveDescription;
import org.csail.genesis.genesis.ReflexiveKnowledge;
import org.csail.genesis.genesis.Sentence;
import org.csail.genesis.genesis.Story;
import org.csail.genesis.services.GenesisGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GenesisSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GenesisGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GenesisPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GenesisPackage.COMMONSENSE_KNOWLEDGE:
				if(context == grammarAccess.getCommonsenseKnowledgeRule() ||
				   context == grammarAccess.getSectionRule()) {
					sequence_CommonsenseKnowledge(context, (CommonsenseKnowledge) semanticObject); 
					return; 
				}
				else break;
			case GenesisPackage.DESCRIPTION:
				if(context == grammarAccess.getDescriptionRule()) {
					sequence_Description(context, (Description) semanticObject); 
					return; 
				}
				else break;
			case GenesisPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case GenesisPackage.PERSPECTIVE:
				if(context == grammarAccess.getPerspectiveRule() ||
				   context == grammarAccess.getSectionRule()) {
					sequence_Perspective(context, (Perspective) semanticObject); 
					return; 
				}
				else break;
			case GenesisPackage.REFLEXIVE_DESCRIPTION:
				if(context == grammarAccess.getReflexiveDescriptionRule()) {
					sequence_ReflexiveDescription(context, (ReflexiveDescription) semanticObject); 
					return; 
				}
				else break;
			case GenesisPackage.REFLEXIVE_KNOWLEDGE:
				if(context == grammarAccess.getReflexiveKnowledgeRule() ||
				   context == grammarAccess.getSectionRule()) {
					sequence_ReflexiveKnowledge(context, (ReflexiveKnowledge) semanticObject); 
					return; 
				}
				else break;
			case GenesisPackage.SENTENCE:
				if(context == grammarAccess.getSentenceRule()) {
					sequence_Sentence(context, (Sentence) semanticObject); 
					return; 
				}
				else break;
			case GenesisPackage.STORY:
				if(context == grammarAccess.getStoryRule()) {
					sequence_Story(context, (Story) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=CommonsenseKnowledgeHeader body=Description)
	 */
	protected void sequence_CommonsenseKnowledge(EObject context, CommonsenseKnowledge semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GenesisPackage.Literals.SECTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GenesisPackage.Literals.SECTION__NAME));
			if(transientValues.isValueTransient(semanticObject, GenesisPackage.Literals.COMMONSENSE_KNOWLEDGE__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GenesisPackage.Literals.COMMONSENSE_KNOWLEDGE__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommonsenseKnowledgeAccess().getNameCommonsenseKnowledgeHeaderParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCommonsenseKnowledgeAccess().getBodyDescriptionParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sentences+=Sentence*)
	 */
	protected void sequence_Description(EObject context, Description semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (header+=Sentence* sections+=Section*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=PerspectiveHeader subsections+=Story*)
	 */
	protected void sequence_Perspective(EObject context, Perspective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ReflexiveDescriptionHeader body=Description)
	 */
	protected void sequence_ReflexiveDescription(EObject context, ReflexiveDescription semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GenesisPackage.Literals.REFLEXIVE_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GenesisPackage.Literals.REFLEXIVE_DESCRIPTION__NAME));
			if(transientValues.isValueTransient(semanticObject, GenesisPackage.Literals.REFLEXIVE_DESCRIPTION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GenesisPackage.Literals.REFLEXIVE_DESCRIPTION__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReflexiveDescriptionAccess().getNameReflexiveDescriptionHeaderParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getReflexiveDescriptionAccess().getBodyDescriptionParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ReflexiveKnowledgeHeader subsections+=ReflexiveDescription*)
	 */
	protected void sequence_ReflexiveKnowledge(EObject context, ReflexiveKnowledge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             fragments+=REGULAR_FRAGMENT | 
	 *             (fragments+='Start' fragments+='knowledge') | 
	 *             (fragments+='Start' fragments+='commonsense' fragments+=REGULAR_FRAGMENT) | 
	 *             (fragments+='Start' fragments+='The') | 
	 *             (fragments+='Start' fragments+='end') | 
	 *             (fragments+='Start' fragments+='of') | 
	 *             (fragments+='Start' fragments+='Start') | 
	 *             (fragments+='Start' fragments+=REGULAR_FRAGMENT) | 
	 *             fragments+='knowledge' | 
	 *             fragments+='commonsense' | 
	 *             (fragments+='Start' fragments+='reflexive' fragments+=REGULAR_FRAGMENT) | 
	 *             fragments+='reflexive' | 
	 *             (fragments+='Start' fragments+='description' fragments+=REGULAR_FRAGMENT) | 
	 *             fragments+='description' | 
	 *             fragments+='of' | 
	 *             (fragments+='The' fragments+='commonsense') | 
	 *             (fragments+='The' fragments+='knowledge') | 
	 *             (fragments+='The' fragments+='reflexive') | 
	 *             (fragments+='The' fragments+='description') | 
	 *             (fragments+='The' fragments+='of') | 
	 *             (fragments+='The' fragments+='story') | 
	 *             (fragments+='The' fragments+='titled') | 
	 *             (fragments+='The' fragments+='Start') | 
	 *             (fragments+='The' fragments+='The') | 
	 *             (fragments+='The' fragments+=REGULAR_FRAGMENT) | 
	 *             fragments+='end' | 
	 *             (fragments+='Start' fragments+='titled') | 
	 *             (fragments+='Start' fragments+='story' fragments+=REGULAR_FRAGMENT) | 
	 *             fragments+='story' | 
	 *             fragments+='titled'
	 *         )* 
	 *         (
	 *             fragments+='Start' | 
	 *             fragments+='The' | 
	 *             (fragments+='Start' fragments+='commonsense') | 
	 *             (fragments+='Start' fragments+='reflexive') | 
	 *             (fragments+='Start' fragments+='description') | 
	 *             (fragments+='Start' fragments+='story')
	 *         )?
	 *     )
	 */
	protected void sequence_Sentence(EObject context, Sentence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=StoryHeader body=Description)
	 */
	protected void sequence_Story(EObject context, Story semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GenesisPackage.Literals.STORY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GenesisPackage.Literals.STORY__NAME));
			if(transientValues.isValueTransient(semanticObject, GenesisPackage.Literals.STORY__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GenesisPackage.Literals.STORY__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStoryAccess().getNameStoryHeaderParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStoryAccess().getBodyDescriptionParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
}
