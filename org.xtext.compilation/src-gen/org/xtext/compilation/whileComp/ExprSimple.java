/**
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation.whileComp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compilation.whileComp.ExprSimple#getNil <em>Nil</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.ExprSimple#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.ExprSimple#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.ExprSimple#getCons <em>Cons</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.ExprSimple#getLexpr <em>Lexpr</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.ExprSimple#getList <em>List</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.ExprSimple#getHd <em>Hd</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.ExprSimple#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.ExprSimple#getTl <em>Tl</em>}</li>
 * </ul>
 *
 * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprSimple()
 * @model
 * @generated
 */
public interface ExprSimple extends EObject
{
  /**
   * Returns the value of the '<em><b>Nil</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nil</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nil</em>' containment reference.
   * @see #setNil(Nil2)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprSimple_Nil()
   * @model containment="true"
   * @generated
   */
  Nil2 getNil();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.ExprSimple#getNil <em>Nil</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nil</em>' containment reference.
   * @see #getNil()
   * @generated
   */
  void setNil(Nil2 value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute.
   * @see #setVariable(String)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprSimple_Variable()
   * @model
   * @generated
   */
  String getVariable();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.ExprSimple#getVariable <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' attribute.
   * @see #getVariable()
   * @generated
   */
  void setVariable(String value);

  /**
   * Returns the value of the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol</em>' attribute.
   * @see #setSymbol(String)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprSimple_Symbol()
   * @model
   * @generated
   */
  String getSymbol();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.ExprSimple#getSymbol <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' attribute.
   * @see #getSymbol()
   * @generated
   */
  void setSymbol(String value);

  /**
   * Returns the value of the '<em><b>Cons</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cons</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cons</em>' containment reference.
   * @see #setCons(Cons)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprSimple_Cons()
   * @model containment="true"
   * @generated
   */
  Cons getCons();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.ExprSimple#getCons <em>Cons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cons</em>' containment reference.
   * @see #getCons()
   * @generated
   */
  void setCons(Cons value);

  /**
   * Returns the value of the '<em><b>Lexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lexpr</em>' containment reference.
   * @see #setLexpr(Lexpr)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprSimple_Lexpr()
   * @model containment="true"
   * @generated
   */
  Lexpr getLexpr();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.ExprSimple#getLexpr <em>Lexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lexpr</em>' containment reference.
   * @see #getLexpr()
   * @generated
   */
  void setLexpr(Lexpr value);

  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(List)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprSimple_List()
   * @model containment="true"
   * @generated
   */
  List getList();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.ExprSimple#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(List value);

  /**
   * Returns the value of the '<em><b>Hd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hd</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hd</em>' containment reference.
   * @see #setHd(Hd)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprSimple_Hd()
   * @model containment="true"
   * @generated
   */
  Hd getHd();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.ExprSimple#getHd <em>Hd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hd</em>' containment reference.
   * @see #getHd()
   * @generated
   */
  void setHd(Hd value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprSimple_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.ExprSimple#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

  /**
   * Returns the value of the '<em><b>Tl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tl</em>' containment reference.
   * @see #setTl(Tl)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getExprSimple_Tl()
   * @model containment="true"
   * @generated
   */
  Tl getTl();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.ExprSimple#getTl <em>Tl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tl</em>' containment reference.
   * @see #getTl()
   * @generated
   */
  void setTl(Tl value);

} // ExprSimple
