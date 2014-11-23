/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.Precedences#getPrecedence <em>Precedence</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getPrecedences()
 * @model extendedMetaData="name='Precedences' kind='elementOnly'"
 * @generated
 */
public interface Precedences extends EObject {
	/**
	 * Returns the value of the '<em><b>Precedence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence</em>' attribute list.
	 * @see Trialple.TrialplePackage#getPrecedences_Precedence()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='precedence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getPrecedence();

} // Precedences
