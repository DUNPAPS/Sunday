/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.Modules#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getModules()
 * @model extendedMetaData="name='Modules' kind='elementOnly'"
 * @generated
 */
public interface Modules extends EObject {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getModules_Module()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='module' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Module> getModule();

} // Modules
