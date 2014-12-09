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
 *   <li>{@link Trialple.Modules#getSrcid <em>Srcid</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Srcid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srcid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srcid</em>' attribute.
	 * @see #setSrcid(String)
	 * @see Trialple.TrialplePackage#getModules_Srcid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='srcid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSrcid();

	/**
	 * Sets the value of the '{@link Trialple.Modules#getSrcid <em>Srcid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srcid</em>' attribute.
	 * @see #getSrcid()
	 * @generated
	 */
	void setSrcid(String value);

} // Modules
