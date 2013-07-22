/**
 */
package org.csail.genesis.genesis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commonsense Knowledge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csail.genesis.genesis.CommonsenseKnowledge#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csail.genesis.genesis.GenesisPackage#getCommonsenseKnowledge()
 * @model
 * @generated
 */
public interface CommonsenseKnowledge extends Section
{
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
   * @see org.csail.genesis.genesis.GenesisPackage#getCommonsenseKnowledge_Body()
   * @model containment="true"
   * @generated
   */
  Description getBody();

  /**
   * Sets the value of the '{@link org.csail.genesis.genesis.CommonsenseKnowledge#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Description value);

} // CommonsenseKnowledge
