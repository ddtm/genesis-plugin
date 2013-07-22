/**
 */
package org.csail.genesis.genesis.impl;

import org.csail.genesis.genesis.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenesisFactoryImpl extends EFactoryImpl implements GenesisFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GenesisFactory init()
  {
    try
    {
      GenesisFactory theGenesisFactory = (GenesisFactory)EPackage.Registry.INSTANCE.getEFactory(GenesisPackage.eNS_URI);
      if (theGenesisFactory != null)
      {
        return theGenesisFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GenesisFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenesisFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GenesisPackage.MODEL: return createModel();
      case GenesisPackage.SECTION: return createSection();
      case GenesisPackage.COMMONSENSE_KNOWLEDGE: return createCommonsenseKnowledge();
      case GenesisPackage.REFLEXIVE_KNOWLEDGE: return createReflexiveKnowledge();
      case GenesisPackage.REFLEXIVE_DESCRIPTION: return createReflexiveDescription();
      case GenesisPackage.PERSPECTIVE: return createPerspective();
      case GenesisPackage.STORY: return createStory();
      case GenesisPackage.DESCRIPTION: return createDescription();
      case GenesisPackage.SENTENCE: return createSentence();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Section createSection()
  {
    SectionImpl section = new SectionImpl();
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonsenseKnowledge createCommonsenseKnowledge()
  {
    CommonsenseKnowledgeImpl commonsenseKnowledge = new CommonsenseKnowledgeImpl();
    return commonsenseKnowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReflexiveKnowledge createReflexiveKnowledge()
  {
    ReflexiveKnowledgeImpl reflexiveKnowledge = new ReflexiveKnowledgeImpl();
    return reflexiveKnowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReflexiveDescription createReflexiveDescription()
  {
    ReflexiveDescriptionImpl reflexiveDescription = new ReflexiveDescriptionImpl();
    return reflexiveDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Perspective createPerspective()
  {
    PerspectiveImpl perspective = new PerspectiveImpl();
    return perspective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Story createStory()
  {
    StoryImpl story = new StoryImpl();
    return story;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description createDescription()
  {
    DescriptionImpl description = new DescriptionImpl();
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sentence createSentence()
  {
    SentenceImpl sentence = new SentenceImpl();
    return sentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenesisPackage getGenesisPackage()
  {
    return (GenesisPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GenesisPackage getPackage()
  {
    return GenesisPackage.eINSTANCE;
  }

} //GenesisFactoryImpl
