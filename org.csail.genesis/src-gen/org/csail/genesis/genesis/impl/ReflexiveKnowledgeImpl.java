/**
 */
package org.csail.genesis.genesis.impl;

import java.util.Collection;

import org.csail.genesis.genesis.GenesisPackage;
import org.csail.genesis.genesis.ReflexiveDescription;
import org.csail.genesis.genesis.ReflexiveKnowledge;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflexive Knowledge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csail.genesis.genesis.impl.ReflexiveKnowledgeImpl#getSubsections <em>Subsections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReflexiveKnowledgeImpl extends SectionImpl implements ReflexiveKnowledge
{
  /**
   * The cached value of the '{@link #getSubsections() <em>Subsections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubsections()
   * @generated
   * @ordered
   */
  protected EList<ReflexiveDescription> subsections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReflexiveKnowledgeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GenesisPackage.Literals.REFLEXIVE_KNOWLEDGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReflexiveDescription> getSubsections()
  {
    if (subsections == null)
    {
      subsections = new EObjectContainmentEList<ReflexiveDescription>(ReflexiveDescription.class, this, GenesisPackage.REFLEXIVE_KNOWLEDGE__SUBSECTIONS);
    }
    return subsections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GenesisPackage.REFLEXIVE_KNOWLEDGE__SUBSECTIONS:
        return ((InternalEList<?>)getSubsections()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GenesisPackage.REFLEXIVE_KNOWLEDGE__SUBSECTIONS:
        return getSubsections();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GenesisPackage.REFLEXIVE_KNOWLEDGE__SUBSECTIONS:
        getSubsections().clear();
        getSubsections().addAll((Collection<? extends ReflexiveDescription>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GenesisPackage.REFLEXIVE_KNOWLEDGE__SUBSECTIONS:
        getSubsections().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GenesisPackage.REFLEXIVE_KNOWLEDGE__SUBSECTIONS:
        return subsections != null && !subsections.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReflexiveKnowledgeImpl
