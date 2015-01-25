/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argx Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.ArgxType#getArgstring <em>Argstring</em>}</li>
 *   <li>{@link Trialple.ArgxType#getSep <em>Sep</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getArgxType()
 * @model extendedMetaData="name='argxType' kind='elementOnly'"
 * @generated
 */
public interface ArgxType extends EObject {
	/**
	 * Returns the value of the '<em><b>Argstring</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argstring</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argstring</em>' attribute list.
	 * @see Trialple.TrialplePackage#getArgxType_Argstring()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='argstring' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getArgstring();

	/**
	 * Returns the value of the '<em><b>Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sep</em>' attribute.
	 * @see #setSep(String)
	 * @see Trialple.TrialplePackage#getArgxType_Sep()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sep' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSep();

	/**
	 * Sets the value of the '{@link Trialple.ArgxType#getSep <em>Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sep</em>' attribute.
	 * @see #getSep()
	 * @generated
	 */
	void setSep(String value);

} // ArgxType
