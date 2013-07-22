/**
 */
package org.csail.genesis.genesis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csail.genesis.genesis.Description#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csail.genesis.genesis.GenesisPackage#getDescription()
 * @model
 * @generated
 */
public interface Description extends EObject
{
  /**
   * Returns the value of the '<em><b>Sentences</b></em>' containment reference list.
   * The list contents are of type {@link org.csail.genesis.genesis.Sentence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sentences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sentences</em>' containment reference list.
   * @see org.csail.genesis.genesis.GenesisPackage#getDescription_Sentences()
   * @model containment="true"
   * @generated
   */
  EList<Sentence> getSentences();

} // Description
