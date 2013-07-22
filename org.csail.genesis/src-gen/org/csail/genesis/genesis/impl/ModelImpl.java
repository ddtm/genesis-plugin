/**
 */
package org.csail.genesis.genesis.impl;

import java.util.Collection;

import org.csail.genesis.genesis.GenesisPackage;
import org.csail.genesis.genesis.Model;
import org.csail.genesis.genesis.Section;
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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csail.genesis.genesis.impl.ModelImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.csail.genesis.genesis.impl.ModelImpl#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected EList<Sentence> header;

  /**
   * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSections()
   * @generated
   * @ordered
   */
  protected EList<Section> sections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return GenesisPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Sentence> getHeader()
  {
    if (header == null)
    {
      header = new EObjectContainmentEList<Sentence>(Sentence.class, this, GenesisPackage.MODEL__HEADER);
    }
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Section> getSections()
  {
    if (sections == null)
    {
      sections = new EObjectContainmentEList<Section>(Section.class, this, GenesisPackage.MODEL__SECTIONS);
    }
    return sections;
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
      case GenesisPackage.MODEL__HEADER:
        return ((InternalEList<?>)getHeader()).basicRemove(otherEnd, msgs);
      case GenesisPackage.MODEL__SECTIONS:
        return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
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
      case GenesisPackage.MODEL__HEADER:
        return getHeader();
      case GenesisPackage.MODEL__SECTIONS:
        return getSections();
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
      case GenesisPackage.MODEL__HEADER:
        getHeader().clear();
        getHeader().addAll((Collection<? extends Sentence>)newValue);
        return;
      case GenesisPackage.MODEL__SECTIONS:
        getSections().clear();
        getSections().addAll((Collection<? extends Section>)newValue);
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
      case GenesisPackage.MODEL__HEADER:
        getHeader().clear();
        return;
      case GenesisPackage.MODEL__SECTIONS:
        getSections().clear();
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
      case GenesisPackage.MODEL__HEADER:
        return header != null && !header.isEmpty();
      case GenesisPackage.MODEL__SECTIONS:
        return sections != null && !sections.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
