/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.Arguments#getArg <em>Arg</em>}</li>
 *   <li>{@link Trialple.Arguments#getArgx <em>Argx</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getArguments()
 * @model extendedMetaData="name='Arguments' kind='elementOnly'"
 * @generated
 */
public interface Arguments extends EObject {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute list.
	 * @see Trialple.TrialplePackage#getArguments_Arg()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='arg' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getArg();

	/**
	 * Returns the value of the '<em><b>Argx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argx</em>' containment reference.
	 * @see #setArgx(ArgxType)
	 * @see Trialple.TrialplePackage#getArguments_Argx()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='argx' namespace='##targetNamespace'"
	 * @generated
	 */
	ArgxType getArgx();

	/**
	 * Sets the value of the '{@link Trialple.Arguments#getArgx <em>Argx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argx</em>' containment reference.
	 * @see #getArgx()
	 * @generated
	 */
	void setArgx(ArgxType value);

} // Arguments
