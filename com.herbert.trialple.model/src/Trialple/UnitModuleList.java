/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Module List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.UnitModuleList#getUnitmodule <em>Unitmodule</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getUnitModuleList()
 * @model extendedMetaData="name='UnitModuleList' kind='elementOnly'"
 * @generated
 */
public interface UnitModuleList extends EObject {
	/**
	 * Returns the value of the '<em><b>Unitmodule</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.UnitModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unitmodule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitmodule</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getUnitModuleList_Unitmodule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitmodule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnitModule> getUnitmodule();

} // UnitModuleList
