/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phaselist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.Phaselist#getPhase <em>Phase</em>}</li>
 *   <li>{@link Trialple.Phaselist#getIf <em>If</em>}</li>
 *   <li>{@link Trialple.Phaselist#getSubmodule <em>Submodule</em>}</li>
 *   <li>{@link Trialple.Phaselist#getSubmoduleref <em>Submoduleref</em>}</li>
 *   <li>{@link Trialple.Phaselist#getSrcid <em>Srcid</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getPhaselist()
 * @model extendedMetaData="name='Phaselist' kind='elementOnly'"
 * @generated
 */
public interface Phaselist extends EObject {
	/**
	 * Returns the value of the '<em><b>Phase</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.Phase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getPhaselist_Phase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Phase> getPhase();

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.IfType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getPhaselist_If()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='if' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IfType> getIf();

	/**
	 * Returns the value of the '<em><b>Submodule</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.SubModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submodule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodule</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getPhaselist_Submodule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='submodule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubModule> getSubmodule();

	/**
	 * Returns the value of the '<em><b>Submoduleref</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.SubModuleRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submoduleref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submoduleref</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getPhaselist_Submoduleref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='submoduleref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubModuleRef> getSubmoduleref();

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
	 * @see Trialple.TrialplePackage#getPhaselist_Srcid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='srcid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSrcid();

	/**
	 * Sets the value of the '{@link Trialple.Phaselist#getSrcid <em>Srcid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srcid</em>' attribute.
	 * @see #getSrcid()
	 * @generated
	 */
	void setSrcid(String value);

} // Phaselist
