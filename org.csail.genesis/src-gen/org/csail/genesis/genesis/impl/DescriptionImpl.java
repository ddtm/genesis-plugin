/**
 */
package org.csail.genesis.genesis.impl;

import java.util.Collection;

import org.csail.genesis.genesis.Description;
import org.csail.genesis.genesis.GenesisPackage;
import org.csail.genesis.genesis.Sentence;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csail.genesis.genesis.impl.DescriptionImpl#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptionImpl extends MinimalEObjectImpl.Container implements Description
{
  /**
   * The cached value of the '{@link #getSentences() <em>Sentences</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSentences()
   * @generated
   * @ordered
   */
  protected EList<Sentence> sentences;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DescriptionImpl()
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
    return GenesisPackage.Literals.DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Sentence> getSentences()
  {
    if (sentences == null)
    {
      sentences = new EObjectContainmentEList<Sentence>(Sentence.class, this, GenesisPackage.DESCRIPTION__SENTENCES);
    }
    return sentences;
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
      case GenesisPackage.DESCRIPTION__SENTENCES:
        return ((InternalEList<?>)getSentences()).basicRemove(otherEnd, msgs);
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
      case GenesisPackage.DESCRIPTION__SENTENCES:
        return getSentences();
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
      case GenesisPackage.DESCRIPTION__SENTENCES:
        getSentences().clear();
        getSentences().addAll((Collection<? extends Sentence>)newValue);
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
      case GenesisPackage.DESCRIPTION__SENTENCES:
        getSentences().clear();
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
      case GenesisPackage.DESCRIPTION__SENTENCES:
        return sentences != null && !sentences.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DescriptionImpl
