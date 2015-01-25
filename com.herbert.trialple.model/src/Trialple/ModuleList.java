/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.ModuleList#getModule <em>Module</em>}</li>
 *   <li>{@link Trialple.ModuleList#getModules <em>Modules</em>}</li>
 *   <li>{@link Trialple.ModuleList#getSubmoduledefs <em>Submoduledefs</em>}</li>
 *   <li>{@link Trialple.ModuleList#getSubmoduledef <em>Submoduledef</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getModuleList()
 * @model extendedMetaData="name='ModuleList' kind='elementOnly'"
 * @generated
 */
public interface ModuleList extends EObject {
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
	 * @see Trialple.TrialplePackage#getModuleList_Module()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='module' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Module> getModule();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.Modules}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getModuleList_Modules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modules' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Modules> getModules();

	/**
	 * Returns the value of the '<em><b>Submoduledefs</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.SubmoduleDefs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submoduledefs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submoduledefs</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getModuleList_Submoduledefs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='submoduledefs' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubmoduleDefs> getSubmoduledefs();

	/**
	 * Returns the value of the '<em><b>Submoduledef</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.SubmoduleDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submoduledef</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submoduledef</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getModuleList_Submoduledef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='submoduledef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubmoduleDef> getSubmoduledef();

} // ModuleList
