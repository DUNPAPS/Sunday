/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submodule Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.SubmoduleDef#getDefs <em>Defs</em>}</li>
 *   <li>{@link Trialple.SubmoduleDef#getPhaselist <em>Phaselist</em>}</li>
 *   <li>{@link Trialple.SubmoduleDef#getName <em>Name</em>}</li>
 *   <li>{@link Trialple.SubmoduleDef#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getSubmoduleDef()
 * @model extendedMetaData="name='SubmoduleDef' kind='elementOnly'"
 * @generated
 */
public interface SubmoduleDef extends EObject {
	/**
	 * Returns the value of the '<em><b>Defs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defs</em>' containment reference.
	 * @see #setDefs(Definitions)
	 * @see Trialple.TrialplePackage#getSubmoduleDef_Defs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defs' namespace='##targetNamespace'"
	 * @generated
	 */
	Definitions getDefs();

	/**
	 * Sets the value of the '{@link Trialple.SubmoduleDef#getDefs <em>Defs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defs</em>' containment reference.
	 * @see #getDefs()
	 * @generated
	 */
	void setDefs(Definitions value);

	/**
	 * Returns the value of the '<em><b>Phaselist</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.Phaselist}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phaselist</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phaselist</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getSubmoduleDef_Phaselist()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phaselist' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Phaselist> getPhaselist();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Trialple.TrialplePackage#getSubmoduleDef_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Trialple.SubmoduleDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see Trialple.TrialplePackage#getSubmoduleDef_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='password' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link Trialple.SubmoduleDef#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // SubmoduleDef
