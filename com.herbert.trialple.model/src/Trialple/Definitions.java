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
	 * Returns the value of the '<em><b>Def</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.Def}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getDefinitions_Def()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='def' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Def> getDef();

} // Definitions
