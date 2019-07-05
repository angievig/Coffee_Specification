/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.hLVL.impl;

import com.coffee.hlvl.hLVL.HLVLPackage;
import com.coffee.hlvl.hLVL.ListOfRelRefs;
import com.coffee.hlvl.hLVL.Relational;
import com.coffee.hlvl.hLVL.Visibility;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.hLVL.impl.VisibilityImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.coffee.hlvl.hLVL.impl.VisibilityImpl#getList <em>List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisibilityImpl extends RelationImpl implements Visibility
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Relational condition;

  /**
   * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected ListOfRelRefs list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VisibilityImpl()
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
    return HLVLPackage.Literals.VISIBILITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relational getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Relational newCondition, NotificationChain msgs)
  {
    Relational oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLVLPackage.VISIBILITY__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Relational newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLVLPackage.VISIBILITY__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLVLPackage.VISIBILITY__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HLVLPackage.VISIBILITY__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfRelRefs getList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetList(ListOfRelRefs newList, NotificationChain msgs)
  {
    ListOfRelRefs oldList = list;
    list = newList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLVLPackage.VISIBILITY__LIST, oldList, newList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList(ListOfRelRefs newList)
  {
    if (newList != list)
    {
      NotificationChain msgs = null;
      if (list != null)
        msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLVLPackage.VISIBILITY__LIST, null, msgs);
      if (newList != null)
        msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLVLPackage.VISIBILITY__LIST, null, msgs);
      msgs = basicSetList(newList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HLVLPackage.VISIBILITY__LIST, newList, newList));
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
      case HLVLPackage.VISIBILITY__CONDITION:
        return basicSetCondition(null, msgs);
      case HLVLPackage.VISIBILITY__LIST:
        return basicSetList(null, msgs);
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
      case HLVLPackage.VISIBILITY__CONDITION:
        return getCondition();
      case HLVLPackage.VISIBILITY__LIST:
        return getList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HLVLPackage.VISIBILITY__CONDITION:
        setCondition((Relational)newValue);
        return;
      case HLVLPackage.VISIBILITY__LIST:
        setList((ListOfRelRefs)newValue);
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
      case HLVLPackage.VISIBILITY__CONDITION:
        setCondition((Relational)null);
        return;
      case HLVLPackage.VISIBILITY__LIST:
        setList((ListOfRelRefs)null);
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
      case HLVLPackage.VISIBILITY__CONDITION:
        return condition != null;
      case HLVLPackage.VISIBILITY__LIST:
        return list != null;
    }
    return super.eIsSet(featureID);
  }

} //VisibilityImpl