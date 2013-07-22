/**
 */
package org.csail.genesis.genesis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.csail.genesis.genesis.GenesisPackage
 * @generated
 */
public interface GenesisFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GenesisFactory eINSTANCE = org.csail.genesis.genesis.impl.GenesisFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Section</em>'.
   * @generated
   */
  Section createSection();

  /**
   * Returns a new object of class '<em>Commonsense Knowledge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Commonsense Knowledge</em>'.
   * @generated
   */
  CommonsenseKnowledge createCommonsenseKnowledge();

  /**
   * Returns a new object of class '<em>Reflexive Knowledge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reflexive Knowledge</em>'.
   * @generated
   */
  ReflexiveKnowledge createReflexiveKnowledge();

  /**
   * Returns a new object of class '<em>Reflexive Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reflexive Description</em>'.
   * @generated
   */
  ReflexiveDescription createReflexiveDescription();

  /**
   * Returns a new object of class '<em>Perspective</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Perspective</em>'.
   * @generated
   */
  Perspective createPerspective();

  /**
   * Returns a new object of class '<em>Story</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Story</em>'.
   * @generated
   */
  Story createStory();

  /**
   * Returns a new object of class '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description</em>'.
   * @generated
   */
  Description createDescription();

  /**
   * Returns a new object of class '<em>Sentence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sentence</em>'.
   * @generated
   */
  Sentence createSentence();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GenesisPackage getGenesisPackage();

} //GenesisFactory
