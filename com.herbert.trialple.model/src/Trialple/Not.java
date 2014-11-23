/**
 */
package Trialple;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.Not#getBooleanExp <em>Boolean Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getNot()
 * @model extendedMetaData="name='Not' kind='elementOnly'"
 * @generated
 */
public interface Not extends EObject {
	/**
	 * Returns the value of the '<em><b>Boolean Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Exp</em>' containment reference.
	 * @see #setBooleanExp(BooleanExp)
	 * @see Trialple.TrialplePackage#getNot_BooleanExp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='booleanExp' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanExp getBooleanExp();

	/**
	 * Sets the value of the '{@link Trialple.Not#getBooleanExp <em>Boolean Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Exp</em>' containment reference.
	 * @see #getBooleanExp()
	 * @generated
	 */
	void setBooleanExp(BooleanExp value);

} // Not
