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

} // Arguments
