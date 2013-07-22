/**
 */
package org.csail.genesis.genesis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perspective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csail.genesis.genesis.Perspective#getSubsections <em>Subsections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csail.genesis.genesis.GenesisPackage#getPerspective()
 * @model
 * @generated
 */
public interface Perspective extends Section
{
  /**
   * Returns the value of the '<em><b>Subsections</b></em>' containment reference list.
   * The list contents are of type {@link org.csail.genesis.genesis.Story}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subsections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subsections</em>' containment reference list.
   * @see org.csail.genesis.genesis.GenesisPackage#getPerspective_Subsections()
   * @model containment="true"
   * @generated
   */
  EList<Story> getSubsections();

} // Perspective
