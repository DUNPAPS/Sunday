/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submodule Defs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.SubmoduleDefs#getSubmoduledef <em>Submoduledef</em>}</li>
 *   <li>{@link Trialple.SubmoduleDefs#getIf <em>If</em>}</li>
 *   <li>{@link Trialple.SubmoduleDefs#getSrcid <em>Srcid</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getSubmoduleDefs()
 * @model extendedMetaData="name='SubmoduleDefs' kind='elementOnly'"
 * @generated
 */
public interface SubmoduleDefs extends EObject {
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
	 * @see Trialple.TrialplePackage#getSubmoduleDefs_Submoduledef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='submoduledef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubmoduleDef> getSubmoduledef();

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
	 * @see Trialple.TrialplePackage#getSubmoduleDefs_If()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='if' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IfType> getIf();

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
	 * @see Trialple.TrialplePackage#getSubmoduleDefs_Srcid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='srcid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSrcid();

	/**
	 * Sets the value of the '{@link Trialple.SubmoduleDefs#getSrcid <em>Srcid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srcid</em>' attribute.
	 * @see #getSrcid()
	 * @generated
	 */
	void setSrcid(String value);

} // SubmoduleDefs
