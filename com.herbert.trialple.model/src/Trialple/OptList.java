/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opt List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.OptList#getOption <em>Option</em>}</li>
 *   <li>{@link Trialple.OptList#getOr <em>Or</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getOptList()
 * @model extendedMetaData="name='OptList' kind='elementOnly'"
 * @generated
 */
public interface OptList extends EObject {
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
	 * @see Trialple.TrialplePackage#getOptList_Option()
	 * @model containment="true"
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
	 * @see Trialple.TrialplePackage#getOptList_Or()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='or' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Or> getOr();

} // OptList
