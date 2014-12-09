/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.Definitions#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getDefinitions()
 * @model extendedMetaData="name='Definitions' kind='elementOnly'"
 * @generated
 */
public interface Definitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Def</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' attribute list.
	 * @see Trialple.TrialplePackage#getDefinitions_Def()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='def' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getDef();

} // Definitions
