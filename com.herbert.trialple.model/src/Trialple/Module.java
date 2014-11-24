/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.Module#getDescription <em>Description</em>}</li>
 *   <li>{@link Trialple.Module#getOptions <em>Options</em>}</li>
 *   <li>{@link Trialple.Module#getPostevent <em>Postevent</em>}</li>
 *   <li>{@link Trialple.Module#getRevokemodule <em>Revokemodule</em>}</li>
 *   <li>{@link Trialple.Module#getPassword <em>Password</em>}</li>
 *   <li>{@link Trialple.Module#getPrecedences <em>Precedences</em>}</li>
 *   <li>{@link Trialple.Module#getPhaselist <em>Phaselist</em>}</li>
 *   <li>{@link Trialple.Module#getCheckmode <em>Checkmode</em>}</li>
 *   <li>{@link Trialple.Module#getErrignorable <em>Errignorable</em>}</li>
 *   <li>{@link Trialple.Module#getInterruptable <em>Interruptable</em>}</li>
 *   <li>{@link Trialple.Module#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link Trialple.Module#getName <em>Name</em>}</li>
 *   <li>{@link Trialple.Module#getReselect <em>Reselect</em>}</li>
 *   <li>{@link Trialple.Module#getRevokeautonext <em>Revokeautonext</em>}</li>
 *   <li>{@link Trialple.Module#getType <em>Type</em>}</li>
 *   <li>{@link Trialple.Module#getUniqueexec <em>Uniqueexec</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getModule()
 * @model extendedMetaData="name='Module' kind='elementOnly'"
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Phaselist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phaselist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phaselist</em>' containment reference.
	 * @see #setPhaselist(Phaselist)
	 * @see Trialple.TrialplePackage#getModule_Phaselist()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phaselist' namespace='##targetNamespace'"
	 * @generated
	 */
	Phaselist getPhaselist();

	/**
	 * Sets the value of the '{@link Trialple.Module#getPhaselist <em>Phaselist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phaselist</em>' containment reference.
	 * @see #getPhaselist()
	 * @generated
	 */
	void setPhaselist(Phaselist value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute list.
	 * @see Trialple.TrialplePackage#getModule_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getDescription();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(OptList)
	 * @see Trialple.TrialplePackage#getModule_Options()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='options' namespace='##targetNamespace'"
	 * @generated
	 */
	OptList getOptions();

	/**
	 * Sets the value of the '{@link Trialple.Module#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(OptList value);

	/**
	 * Returns the value of the '<em><b>Postevent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postevent</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postevent</em>' attribute.
	 * @see #setPostevent(String)
	 * @see Trialple.TrialplePackage#getModule_Postevent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='postevent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostevent();

	/**
	 * Sets the value of the '{@link Trialple.Module#getPostevent <em>Postevent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postevent</em>' attribute.
	 * @see #getPostevent()
	 * @generated
	 */
	void setPostevent(String value);

	/**
	 * Returns the value of the '<em><b>Revokemodule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revokemodule</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revokemodule</em>' attribute.
	 * @see #setRevokemodule(String)
	 * @see Trialple.TrialplePackage#getModule_Revokemodule()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='revokemodule' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRevokemodule();

	/**
	 * Sets the value of the '{@link Trialple.Module#getRevokemodule <em>Revokemodule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revokemodule</em>' attribute.
	 * @see #getRevokemodule()
	 * @generated
	 */
	void setRevokemodule(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see Trialple.TrialplePackage#getModule_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='password' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link Trialple.Module#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Precedences</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.Precedences}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedences</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getModule_Precedences()
	 * @model containment="true" upper="10"
	 *        extendedMetaData="kind='element' name='precedences' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Precedences> getPrecedences();

	/**
	 * Returns the value of the '<em><b>Checkmode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkmode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkmode</em>' attribute.
	 * @see #setCheckmode(String)
	 * @see Trialple.TrialplePackage#getModule_Checkmode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='checkmode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCheckmode();

	/**
	 * Sets the value of the '{@link Trialple.Module#getCheckmode <em>Checkmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkmode</em>' attribute.
	 * @see #getCheckmode()
	 * @generated
	 */
	void setCheckmode(String value);

	/**
	 * Returns the value of the '<em><b>Revokeautonext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revokeautonext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revokeautonext</em>' attribute.
	 * @see #setRevokeautonext(String)
	 * @see Trialple.TrialplePackage#getModule_Revokeautonext()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='revokeautonext' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRevokeautonext();

	/**
	 * Sets the value of the '{@link Trialple.Module#getRevokeautonext <em>Revokeautonext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revokeautonext</em>' attribute.
	 * @see #getRevokeautonext()
	 * @generated
	 */
	void setRevokeautonext(String value);

	/**
	 * Returns the value of the '<em><b>Errignorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errignorable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errignorable</em>' attribute.
	 * @see #setErrignorable(String)
	 * @see Trialple.TrialplePackage#getModule_Errignorable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='errignorable' namespace='##targetNamespace'"
	 * @generated
	 */
	String getErrignorable();

	/**
	 * Sets the value of the '{@link Trialple.Module#getErrignorable <em>Errignorable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errignorable</em>' attribute.
	 * @see #getErrignorable()
	 * @generated
	 */
	void setErrignorable(String value);

	/**
	 * Returns the value of the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interruptable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interruptable</em>' attribute.
	 * @see #setInterruptable(String)
	 * @see Trialple.TrialplePackage#getModule_Interruptable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='interruptable' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInterruptable();

	/**
	 * Sets the value of the '{@link Trialple.Module#getInterruptable <em>Interruptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interruptable</em>' attribute.
	 * @see #getInterruptable()
	 * @generated
	 */
	void setInterruptable(String value);

	/**
	 * Returns the value of the '<em><b>Reselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reselect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reselect</em>' attribute.
	 * @see #setReselect(String)
	 * @see Trialple.TrialplePackage#getModule_Reselect()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='reselect' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReselect();

	/**
	 * Sets the value of the '{@link Trialple.Module#getReselect <em>Reselect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reselect</em>' attribute.
	 * @see #getReselect()
	 * @generated
	 */
	void setReselect(String value);

	/**
	 * Returns the value of the '<em><b>Uniqueexec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uniqueexec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uniqueexec</em>' attribute.
	 * @see #setUniqueexec(String)
	 * @see Trialple.TrialplePackage#getModule_Uniqueexec()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='uniqueexec' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUniqueexec();

	/**
	 * Sets the value of the '{@link Trialple.Module#getUniqueexec <em>Uniqueexec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uniqueexec</em>' attribute.
	 * @see #getUniqueexec()
	 * @generated
	 */
	void setUniqueexec(String value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(String)
	 * @see Trialple.TrialplePackage#getModule_Mandatory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mandatory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMandatory();

	/**
	 * Sets the value of the '{@link Trialple.Module#getMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #getMandatory()
	 * @generated
	 */
	void setMandatory(String value);

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
	 * @see Trialple.TrialplePackage#getModule_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Trialple.Module#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Trialple.ModuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Trialple.ModuleType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(ModuleType)
	 * @see Trialple.TrialplePackage#getModule_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ModuleType getType();

	/**
	 * Sets the value of the '{@link Trialple.Module#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Trialple.ModuleType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(ModuleType value);

	/**
	 * Unsets the value of the '{@link Trialple.Module#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ModuleType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link Trialple.Module#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ModuleType)
	 * @generated
	 */
	boolean isSetType();

} // Module
