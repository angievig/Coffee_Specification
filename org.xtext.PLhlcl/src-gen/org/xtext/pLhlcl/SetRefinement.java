/**
 * generated by Xtext 2.12.0
 */
package org.xtext.pLhlcl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pLhlcl.SetRefinement#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.pLhlcl.SetRefinement#getHead <em>Head</em>}</li>
 *   <li>{@link org.xtext.pLhlcl.SetRefinement#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @see org.xtext.pLhlcl.PLhlclPackage#getSetRefinement()
 * @model
 * @generated
 */
public interface SetRefinement extends Refinement
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference.
   * @see #setVars(ListOfIDs)
   * @see org.xtext.pLhlcl.PLhlclPackage#getSetRefinement_Vars()
   * @model containment="true"
   * @generated
   */
  ListOfIDs getVars();

  /**
   * Sets the value of the '{@link org.xtext.pLhlcl.SetRefinement#getVars <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' containment reference.
   * @see #getVars()
   * @generated
   */
  void setVars(ListOfIDs value);

  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(ListOfValues)
   * @see org.xtext.pLhlcl.PLhlclPackage#getSetRefinement_Head()
   * @model containment="true"
   * @generated
   */
  ListOfValues getHead();

  /**
   * Sets the value of the '{@link org.xtext.pLhlcl.SetRefinement#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(ListOfValues value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.pLhlcl.ListOfValues}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference list.
   * @see org.xtext.pLhlcl.PLhlclPackage#getSetRefinement_Tail()
   * @model containment="true"
   * @generated
   */
  EList<ListOfValues> getTail();

} // SetRefinement