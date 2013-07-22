/**
 */
package org.csail.genesis.genesis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csail.genesis.genesis.Sentence#getFragments <em>Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csail.genesis.genesis.GenesisPackage#getSentence()
 * @model
 * @generated
 */
public interface Sentence extends EObject
{
  /**
   * Returns the value of the '<em><b>Fragments</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fragments</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fragments</em>' attribute list.
   * @see org.csail.genesis.genesis.GenesisPackage#getSentence_Fragments()
   * @model unique="false"
   * @generated
   */
  EList<String> getFragments();

} // Sentence
