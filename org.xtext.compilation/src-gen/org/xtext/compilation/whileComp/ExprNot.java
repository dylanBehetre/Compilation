/**
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation.whileComp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compilation.whileComp.ExprNot#getNot <em>Not</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.ExprNot#getExprEq <em>Expr Eq</em>}</li>
 * </ul>
 *
 * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprNot()
 * @model
 * @generated
 */
public interface ExprNot extends EObject
{
  /**
   * Returns the value of the '<em><b>Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' containment reference.
   * @see #setNot(Not)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprNot_Not()
   * @model containment="true"
   * @generated
   */
  Not getNot();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.ExprNot#getNot <em>Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' containment reference.
   * @see #getNot()
   * @generated
   */
  void setNot(Not value);

  /**
   * Returns the value of the '<em><b>Expr Eq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Eq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Eq</em>' containment reference.
   * @see #setExprEq(ExprEq)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprNot_ExprEq()
   * @model containment="true"
   * @generated
   */
  ExprEq getExprEq();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.ExprNot#getExprEq <em>Expr Eq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Eq</em>' containment reference.
   * @see #getExprEq()
   * @generated
   */
  void setExprEq(ExprEq value);

} // ExprNot
