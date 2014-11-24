/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.Not#getOption <em>Option</em>}</li>
 *   <li>{@link Trialple.Not#getAnd <em>And</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getNot()
 * @model extendedMetaData="name='Not' kind='elementOnly'"
 * @generated
 */
public interface Not extends EObject {
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
	 * @see Trialple.TrialplePackage#getNot_Option()
	 * @model containment="true" upper="10"
	 *        extendedMetaData="kind='element' name='option' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Option> getOption();

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.And}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getNot_And()
	 * @model containment="true" upper="10"
	 *        extendedMetaData="kind='element' name='and' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<And> getAnd();

} // Not
