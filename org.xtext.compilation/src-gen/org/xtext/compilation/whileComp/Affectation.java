/**
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation.whileComp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compilation.whileComp.Affectation#getAffectation <em>Affectation</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.Affectation#getValeur <em>Valeur</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.Affectation#getNil <em>Nil</em>}</li>
 * </ul>
 *
 * @see org.xtext.compilation.whileComp.WhileCompPackage#getAffectation()
 * @model
 * @generated
 */
public interface Affectation extends EObject
{
  /**
   * Returns the value of the '<em><b>Affectation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Affectation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Affectation</em>' attribute.
   * @see #setAffectation(String)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getAffectation_Affectation()
   * @model
   * @generated
   */
  String getAffectation();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.Affectation#getAffectation <em>Affectation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Affectation</em>' attribute.
   * @see #getAffectation()
   * @generated
   */
  void setAffectation(String value);

  /**
   * Returns the value of the '<em><b>Valeur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valeur</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valeur</em>' attribute.
   * @see #setValeur(String)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getAffectation_Valeur()
   * @model
   * @generated
   */
  String getValeur();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.Affectation#getValeur <em>Valeur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valeur</em>' attribute.
   * @see #getValeur()
   * @generated
   */
  void setValeur(String value);

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
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getAffectation_Nil()
   * @model containment="true"
   * @generated
   */
  Nil2 getNil();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.Affectation#getNil <em>Nil</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nil</em>' containment reference.
   * @see #getNil()
   * @generated
   */
  void setNil(Nil2 value);

} // Affectation
