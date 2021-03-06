/**
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation.whileComp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compilation.whileComp.ExprAnd#getExprOr <em>Expr Or</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.ExprAnd#getExprAnd <em>Expr And</em>}</li>
 * </ul>
 *
 * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprAnd()
 * @model
 * @generated
 */
public interface ExprAnd extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr Or</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Or</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Or</em>' containment reference.
   * @see #setExprOr(ExprOr)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprAnd_ExprOr()
   * @model containment="true"
   * @generated
   */
  ExprOr getExprOr();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.ExprAnd#getExprOr <em>Expr Or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Or</em>' containment reference.
   * @see #getExprOr()
   * @generated
   */
  void setExprOr(ExprOr value);

  /**
   * Returns the value of the '<em><b>Expr And</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr And</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr And</em>' containment reference.
   * @see #setExprAnd(ExprAnd)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprAnd_ExprAnd()
   * @model containment="true"
   * @generated
   */
  ExprAnd getExprAnd();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.ExprAnd#getExprAnd <em>Expr And</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr And</em>' containment reference.
   * @see #getExprAnd()
   * @generated
   */
  void setExprAnd(ExprAnd value);

} // ExprAnd
