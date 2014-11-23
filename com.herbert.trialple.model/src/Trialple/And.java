/**
 */
package Trialple;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.And#getBooleanExp1 <em>Boolean Exp1</em>}</li>
 *   <li>{@link Trialple.And#getBooleanExp2 <em>Boolean Exp2</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getAnd()
 * @model extendedMetaData="name='And' kind='elementOnly'"
 * @generated
 */
public interface And extends EObject {
	/**
	 * Returns the value of the '<em><b>Boolean Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Exp1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Exp1</em>' containment reference.
	 * @see #setBooleanExp1(BooleanExp)
	 * @see Trialple.TrialplePackage#getAnd_BooleanExp1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='booleanExp1' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanExp getBooleanExp1();

	/**
	 * Sets the value of the '{@link Trialple.And#getBooleanExp1 <em>Boolean Exp1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Exp1</em>' containment reference.
	 * @see #getBooleanExp1()
	 * @generated
	 */
	void setBooleanExp1(BooleanExp value);

	/**
	 * Returns the value of the '<em><b>Boolean Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Exp2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Exp2</em>' containment reference.
	 * @see #setBooleanExp2(BooleanExp)
	 * @see Trialple.TrialplePackage#getAnd_BooleanExp2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='booleanExp2' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanExp getBooleanExp2();

	/**
	 * Sets the value of the '{@link Trialple.And#getBooleanExp2 <em>Boolean Exp2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Exp2</em>' containment reference.
	 * @see #getBooleanExp2()
	 * @generated
	 */
	void setBooleanExp2(BooleanExp value);

} // And
