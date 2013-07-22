/**
 */
package org.csail.genesis.genesis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.csail.genesis.genesis.GenesisFactory
 * @model kind="package"
 * @generated
 */
public interface GenesisPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "genesis";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.csail.org/genesis/Genesis";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "genesis";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GenesisPackage eINSTANCE = org.csail.genesis.genesis.impl.GenesisPackageImpl.init();

  /**
   * The meta object id for the '{@link org.csail.genesis.genesis.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.csail.genesis.genesis.impl.ModelImpl
   * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__HEADER = 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SECTIONS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.csail.genesis.genesis.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.csail.genesis.genesis.impl.SectionImpl
   * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getSection()
   * @generated
   */
  int SECTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__NAME = 0;

  /**
   * The number of structural features of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.csail.genesis.genesis.impl.CommonsenseKnowledgeImpl <em>Commonsense Knowledge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.csail.genesis.genesis.impl.CommonsenseKnowledgeImpl
   * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getCommonsenseKnowledge()
   * @generated
   */
  int COMMONSENSE_KNOWLEDGE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMONSENSE_KNOWLEDGE__NAME = SECTION__NAME;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMONSENSE_KNOWLEDGE__BODY = SECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Commonsense Knowledge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMONSENSE_KNOWLEDGE_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.csail.genesis.genesis.impl.ReflexiveKnowledgeImpl <em>Reflexive Knowledge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.csail.genesis.genesis.impl.ReflexiveKnowledgeImpl
   * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getReflexiveKnowledge()
   * @generated
   */
  int REFLEXIVE_KNOWLEDGE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLEXIVE_KNOWLEDGE__NAME = SECTION__NAME;

  /**
   * The feature id for the '<em><b>Subsections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLEXIVE_KNOWLEDGE__SUBSECTIONS = SECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reflexive Knowledge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLEXIVE_KNOWLEDGE_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.csail.genesis.genesis.impl.ReflexiveDescriptionImpl <em>Reflexive Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.csail.genesis.genesis.impl.ReflexiveDescriptionImpl
   * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getReflexiveDescription()
   * @generated
   */
  int REFLEXIVE_DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLEXIVE_DESCRIPTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLEXIVE_DESCRIPTION__BODY = 1;

  /**
   * The number of structural features of the '<em>Reflexive Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLEXIVE_DESCRIPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.csail.genesis.genesis.impl.PerspectiveImpl <em>Perspective</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.csail.genesis.genesis.impl.PerspectiveImpl
   * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getPerspective()
   * @generated
   */
  int PERSPECTIVE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSPECTIVE__NAME = SECTION__NAME;

  /**
   * The feature id for the '<em><b>Subsections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSPECTIVE__SUBSECTIONS = SECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Perspective</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSPECTIVE_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.csail.genesis.genesis.impl.StoryImpl <em>Story</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.csail.genesis.genesis.impl.StoryImpl
   * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getStory()
   * @generated
   */
  int STORY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORY__NAME = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORY__BODY = 1;

  /**
   * The number of structural features of the '<em>Story</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.csail.genesis.genesis.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.csail.genesis.genesis.impl.DescriptionImpl
   * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 7;

  /**
   * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__SENTENCES = 0;

  /**
   * The number of structural features of the '<em>Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.csail.genesis.genesis.impl.SentenceImpl <em>Sentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.csail.genesis.genesis.impl.SentenceImpl
   * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getSentence()
   * @generated
   */
  int SENTENCE = 8;

  /**
   * The feature id for the '<em><b>Fragments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE__FRAGMENTS = 0;

  /**
   * The number of structural features of the '<em>Sentence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.csail.genesis.genesis.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.csail.genesis.genesis.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.csail.genesis.genesis.Model#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Header</em>'.
   * @see org.csail.genesis.genesis.Model#getHeader()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Header();

  /**
   * Returns the meta object for the containment reference list '{@link org.csail.genesis.genesis.Model#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see org.csail.genesis.genesis.Model#getSections()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Sections();

  /**
   * Returns the meta object for class '{@link org.csail.genesis.genesis.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see org.csail.genesis.genesis.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the attribute '{@link org.csail.genesis.genesis.Section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.csail.genesis.genesis.Section#getName()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Name();

  /**
   * Returns the meta object for class '{@link org.csail.genesis.genesis.CommonsenseKnowledge <em>Commonsense Knowledge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Commonsense Knowledge</em>'.
   * @see org.csail.genesis.genesis.CommonsenseKnowledge
   * @generated
   */
  EClass getCommonsenseKnowledge();

  /**
   * Returns the meta object for the containment reference '{@link org.csail.genesis.genesis.CommonsenseKnowledge#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.csail.genesis.genesis.CommonsenseKnowledge#getBody()
   * @see #getCommonsenseKnowledge()
   * @generated
   */
  EReference getCommonsenseKnowledge_Body();

  /**
   * Returns the meta object for class '{@link org.csail.genesis.genesis.ReflexiveKnowledge <em>Reflexive Knowledge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reflexive Knowledge</em>'.
   * @see org.csail.genesis.genesis.ReflexiveKnowledge
   * @generated
   */
  EClass getReflexiveKnowledge();

  /**
   * Returns the meta object for the containment reference list '{@link org.csail.genesis.genesis.ReflexiveKnowledge#getSubsections <em>Subsections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subsections</em>'.
   * @see org.csail.genesis.genesis.ReflexiveKnowledge#getSubsections()
   * @see #getReflexiveKnowledge()
   * @generated
   */
  EReference getReflexiveKnowledge_Subsections();

  /**
   * Returns the meta object for class '{@link org.csail.genesis.genesis.ReflexiveDescription <em>Reflexive Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reflexive Description</em>'.
   * @see org.csail.genesis.genesis.ReflexiveDescription
   * @generated
   */
  EClass getReflexiveDescription();

  /**
   * Returns the meta object for the attribute '{@link org.csail.genesis.genesis.ReflexiveDescription#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.csail.genesis.genesis.ReflexiveDescription#getName()
   * @see #getReflexiveDescription()
   * @generated
   */
  EAttribute getReflexiveDescription_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.csail.genesis.genesis.ReflexiveDescription#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.csail.genesis.genesis.ReflexiveDescription#getBody()
   * @see #getReflexiveDescription()
   * @generated
   */
  EReference getReflexiveDescription_Body();

  /**
   * Returns the meta object for class '{@link org.csail.genesis.genesis.Perspective <em>Perspective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Perspective</em>'.
   * @see org.csail.genesis.genesis.Perspective
   * @generated
   */
  EClass getPerspective();

  /**
   * Returns the meta object for the containment reference list '{@link org.csail.genesis.genesis.Perspective#getSubsections <em>Subsections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subsections</em>'.
   * @see org.csail.genesis.genesis.Perspective#getSubsections()
   * @see #getPerspective()
   * @generated
   */
  EReference getPerspective_Subsections();

  /**
   * Returns the meta object for class '{@link org.csail.genesis.genesis.Story <em>Story</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Story</em>'.
   * @see org.csail.genesis.genesis.Story
   * @generated
   */
  EClass getStory();

  /**
   * Returns the meta object for the attribute '{@link org.csail.genesis.genesis.Story#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.csail.genesis.genesis.Story#getName()
   * @see #getStory()
   * @generated
   */
  EAttribute getStory_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.csail.genesis.genesis.Story#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.csail.genesis.genesis.Story#getBody()
   * @see #getStory()
   * @generated
   */
  EReference getStory_Body();

  /**
   * Returns the meta object for class '{@link org.csail.genesis.genesis.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description</em>'.
   * @see org.csail.genesis.genesis.Description
   * @generated
   */
  EClass getDescription();

  /**
   * Returns the meta object for the containment reference list '{@link org.csail.genesis.genesis.Description#getSentences <em>Sentences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sentences</em>'.
   * @see org.csail.genesis.genesis.Description#getSentences()
   * @see #getDescription()
   * @generated
   */
  EReference getDescription_Sentences();

  /**
   * Returns the meta object for class '{@link org.csail.genesis.genesis.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence</em>'.
   * @see org.csail.genesis.genesis.Sentence
   * @generated
   */
  EClass getSentence();

  /**
   * Returns the meta object for the attribute list '{@link org.csail.genesis.genesis.Sentence#getFragments <em>Fragments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Fragments</em>'.
   * @see org.csail.genesis.genesis.Sentence#getFragments()
   * @see #getSentence()
   * @generated
   */
  EAttribute getSentence_Fragments();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GenesisFactory getGenesisFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.csail.genesis.genesis.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.csail.genesis.genesis.impl.ModelImpl
     * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__HEADER = eINSTANCE.getModel_Header();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SECTIONS = eINSTANCE.getModel_Sections();

    /**
     * The meta object literal for the '{@link org.csail.genesis.genesis.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.csail.genesis.genesis.impl.SectionImpl
     * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getSection()
     * @generated
     */
    EClass SECTION = eINSTANCE.getSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__NAME = eINSTANCE.getSection_Name();

    /**
     * The meta object literal for the '{@link org.csail.genesis.genesis.impl.CommonsenseKnowledgeImpl <em>Commonsense Knowledge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.csail.genesis.genesis.impl.CommonsenseKnowledgeImpl
     * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getCommonsenseKnowledge()
     * @generated
     */
    EClass COMMONSENSE_KNOWLEDGE = eINSTANCE.getCommonsenseKnowledge();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMONSENSE_KNOWLEDGE__BODY = eINSTANCE.getCommonsenseKnowledge_Body();

    /**
     * The meta object literal for the '{@link org.csail.genesis.genesis.impl.ReflexiveKnowledgeImpl <em>Reflexive Knowledge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.csail.genesis.genesis.impl.ReflexiveKnowledgeImpl
     * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getReflexiveKnowledge()
     * @generated
     */
    EClass REFLEXIVE_KNOWLEDGE = eINSTANCE.getReflexiveKnowledge();

    /**
     * The meta object literal for the '<em><b>Subsections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFLEXIVE_KNOWLEDGE__SUBSECTIONS = eINSTANCE.getReflexiveKnowledge_Subsections();

    /**
     * The meta object literal for the '{@link org.csail.genesis.genesis.impl.ReflexiveDescriptionImpl <em>Reflexive Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.csail.genesis.genesis.impl.ReflexiveDescriptionImpl
     * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getReflexiveDescription()
     * @generated
     */
    EClass REFLEXIVE_DESCRIPTION = eINSTANCE.getReflexiveDescription();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFLEXIVE_DESCRIPTION__NAME = eINSTANCE.getReflexiveDescription_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFLEXIVE_DESCRIPTION__BODY = eINSTANCE.getReflexiveDescription_Body();

    /**
     * The meta object literal for the '{@link org.csail.genesis.genesis.impl.PerspectiveImpl <em>Perspective</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.csail.genesis.genesis.impl.PerspectiveImpl
     * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getPerspective()
     * @generated
     */
    EClass PERSPECTIVE = eINSTANCE.getPerspective();

    /**
     * The meta object literal for the '<em><b>Subsections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSPECTIVE__SUBSECTIONS = eINSTANCE.getPerspective_Subsections();

    /**
     * The meta object literal for the '{@link org.csail.genesis.genesis.impl.StoryImpl <em>Story</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.csail.genesis.genesis.impl.StoryImpl
     * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getStory()
     * @generated
     */
    EClass STORY = eINSTANCE.getStory();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STORY__NAME = eINSTANCE.getStory_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORY__BODY = eINSTANCE.getStory_Body();

    /**
     * The meta object literal for the '{@link org.csail.genesis.genesis.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.csail.genesis.genesis.impl.DescriptionImpl
     * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getDescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDescription();

    /**
     * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIPTION__SENTENCES = eINSTANCE.getDescription_Sentences();

    /**
     * The meta object literal for the '{@link org.csail.genesis.genesis.impl.SentenceImpl <em>Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.csail.genesis.genesis.impl.SentenceImpl
     * @see org.csail.genesis.genesis.impl.GenesisPackageImpl#getSentence()
     * @generated
     */
    EClass SENTENCE = eINSTANCE.getSentence();

    /**
     * The meta object literal for the '<em><b>Fragments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENTENCE__FRAGMENTS = eINSTANCE.getSentence_Fragments();

  }

} //GenesisPackage
