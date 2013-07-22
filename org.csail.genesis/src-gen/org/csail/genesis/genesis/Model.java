/**
 */
package org.csail.genesis.genesis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csail.genesis.genesis.Model#getHeader <em>Header</em>}</li>
 *   <li>{@link org.csail.genesis.genesis.Model#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csail.genesis.genesis.GenesisPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Header</b></em>' containment reference list.
   * The list contents are of type {@link org.csail.genesis.genesis.Sentence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' containment reference list.
   * @see org.csail.genesis.genesis.GenesisPackage#getModel_Header()
   * @model containment="true"
   * @generated
   */
  EList<Sentence> getHeader();

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.csail.genesis.genesis.Section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see org.csail.genesis.genesis.GenesisPackage#getModel_Sections()
   * @model containment="true"
   * @generated
   */
  EList<Section> getSections();

} // Model
