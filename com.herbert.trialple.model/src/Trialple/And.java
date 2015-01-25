/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.And#getOption <em>Option</em>}</li>
 *   <li>{@link Trialple.And#getOr <em>Or</em>}</li>
 *   <li>{@link Trialple.And#getNot <em>Not</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getAnd()
 * @model extendedMetaData="name='And' kind='elementOnly'"
 * @generated
 */
public interface And extends EObject {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getAnd_Option()
	 * @model containment="true" upper="10"
	 *        extendedMetaData="kind='element' name='option' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Option> getOption();

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.Or}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getAnd_Or()
	 * @model containment="true" upper="10"
	 *        extendedMetaData="kind='element' name='or' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Or> getOr();

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.Not}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getAnd_Not()
	 * @model containment="true" upper="10"
	 *        extendedMetaData="kind='element' name='not' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Not> getNot();

} // And
