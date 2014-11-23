/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.Or#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getOr()
 * @model extendedMetaData="name='Or' kind='elementOnly'"
 * @generated
 */
public interface Or extends EObject {
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
	 * @see Trialple.TrialplePackage#getOr_Option()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='option' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Option> getOption();

} // Or
