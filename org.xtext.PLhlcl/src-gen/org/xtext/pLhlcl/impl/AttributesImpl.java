/**
 * generated by Xtext 2.12.0
 */
package org.xtext.pLhlcl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.pLhlcl.Attributes;
import org.xtext.pLhlcl.ListOfIDs;
import org.xtext.pLhlcl.PLhlclPackage;
import org.xtext.pLhlcl.VarDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pLhlcl.impl.AttributesImpl#getAtt <em>Att</em>}</li>
 *   <li>{@link org.xtext.pLhlcl.impl.AttributesImpl#getVar1 <em>Var1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributesImpl extends ConsExpressionImpl implements Attributes
{
  /**
   * The cached value of the '{@link #getAtt() <em>Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtt()
   * @generated
   * @ordered
   */
  protected ListOfIDs att;

  /**
   * The cached value of the '{@link #getVar1() <em>Var1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar1()
   * @generated
   * @ordered
   */
  protected VarDeclaration var1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributesImpl()
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
    return PLhlclPackage.Literals.ATTRIBUTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfIDs getAtt()
  {
    return att;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtt(ListOfIDs newAtt, NotificationChain msgs)
  {
    ListOfIDs oldAtt = att;
    att = newAtt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PLhlclPackage.ATTRIBUTES__ATT, oldAtt, newAtt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtt(ListOfIDs newAtt)
  {
    if (newAtt != att)
    {
      NotificationChain msgs = null;
      if (att != null)
        msgs = ((InternalEObject)att).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PLhlclPackage.ATTRIBUTES__ATT, null, msgs);
      if (newAtt != null)
        msgs = ((InternalEObject)newAtt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PLhlclPackage.ATTRIBUTES__ATT, null, msgs);
      msgs = basicSetAtt(newAtt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PLhlclPackage.ATTRIBUTES__ATT, newAtt, newAtt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDeclaration getVar1()
  {
    if (var1 != null && var1.eIsProxy())
    {
      InternalEObject oldVar1 = (InternalEObject)var1;
      var1 = (VarDeclaration)eResolveProxy(oldVar1);
      if (var1 != oldVar1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PLhlclPackage.ATTRIBUTES__VAR1, oldVar1, var1));
      }
    }
    return var1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDeclaration basicGetVar1()
  {
    return var1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar1(VarDeclaration newVar1)
  {
    VarDeclaration oldVar1 = var1;
    var1 = newVar1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PLhlclPackage.ATTRIBUTES__VAR1, oldVar1, var1));
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
      case PLhlclPackage.ATTRIBUTES__ATT:
        return basicSetAtt(null, msgs);
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
      case PLhlclPackage.ATTRIBUTES__ATT:
        return getAtt();
      case PLhlclPackage.ATTRIBUTES__VAR1:
        if (resolve) return getVar1();
        return basicGetVar1();
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
      case PLhlclPackage.ATTRIBUTES__ATT:
        setAtt((ListOfIDs)newValue);
        return;
      case PLhlclPackage.ATTRIBUTES__VAR1:
        setVar1((VarDeclaration)newValue);
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
      case PLhlclPackage.ATTRIBUTES__ATT:
        setAtt((ListOfIDs)null);
        return;
      case PLhlclPackage.ATTRIBUTES__VAR1:
        setVar1((VarDeclaration)null);
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
      case PLhlclPackage.ATTRIBUTES__ATT:
        return att != null;
      case PLhlclPackage.ATTRIBUTES__VAR1:
        return var1 != null;
    }
    return super.eIsSet(featureID);
  }

} //AttributesImpl