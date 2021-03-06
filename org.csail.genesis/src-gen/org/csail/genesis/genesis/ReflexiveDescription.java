/**
 */
package org.csail.genesis.genesis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflexive Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csail.genesis.genesis.ReflexiveDescription#getName <em>Name</em>}</li>
 *   <li>{@link org.csail.genesis.genesis.ReflexiveDescription#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csail.genesis.genesis.GenesisPackage#getReflexiveDescription()
 * @model
 * @generated
 */
public interface ReflexiveDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.csail.genesis.genesis.GenesisPackage#getReflexiveDescription_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.csail.genesis.genesis.ReflexiveDescription#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Description)
   * @see org.csail.genesis.genesis.GenesisPackage#getReflexiveDescription_Body()
   * @model containment="true"
   * @generated
   */
  Description getBody();

  /**
   * Sets the value of the '{@link org.csail.genesis.genesis.ReflexiveDescription#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Description value);

} // ReflexiveDescription
