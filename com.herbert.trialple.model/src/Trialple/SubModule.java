/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.SubModule#getOptions <em>Options</em>}</li>
 *   <li>{@link Trialple.SubModule#getPhaselist <em>Phaselist</em>}</li>
 *   <li>{@link Trialple.SubModule#isExecparallel <em>Execparallel</em>}</li>
 *   <li>{@link Trialple.SubModule#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getSubModule()
 * @model extendedMetaData="name='SubModule' kind='elementOnly'"
 * @generated
 */
public interface SubModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.OptList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getSubModule_Options()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='options' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OptList> getOptions();

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
	 * @see Trialple.TrialplePackage#getSubModule_Phaselist()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phaselist' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Phaselist> getPhaselist();

	/**
	 * Returns the value of the '<em><b>Execparallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execparallel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execparallel</em>' attribute.
	 * @see #isSetExecparallel()
	 * @see #unsetExecparallel()
	 * @see #setExecparallel(boolean)
	 * @see Trialple.TrialplePackage#getSubModule_Execparallel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='execparallel' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isExecparallel();

	/**
	 * Sets the value of the '{@link Trialple.SubModule#isExecparallel <em>Execparallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execparallel</em>' attribute.
	 * @see #isSetExecparallel()
	 * @see #unsetExecparallel()
	 * @see #isExecparallel()
	 * @generated
	 */
	void setExecparallel(boolean value);

	/**
	 * Unsets the value of the '{@link Trialple.SubModule#isExecparallel <em>Execparallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExecparallel()
	 * @see #isExecparallel()
	 * @see #setExecparallel(boolean)
	 * @generated
	 */
	void unsetExecparallel();

	/**
	 * Returns whether the value of the '{@link Trialple.SubModule#isExecparallel <em>Execparallel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Execparallel</em>' attribute is set.
	 * @see #unsetExecparallel()
	 * @see #isExecparallel()
	 * @see #setExecparallel(boolean)
	 * @generated
	 */
	boolean isSetExecparallel();

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
	 * @see Trialple.TrialplePackage#getSubModule_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='password' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link Trialple.SubModule#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // SubModule
