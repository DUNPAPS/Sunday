/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.Phase#getOptions <em>Options</em>}</li>
 *   <li>{@link Trialple.Phase#getArgs <em>Args</em>}</li>
 *   <li>{@link Trialple.Phase#getAction <em>Action</em>}</li>
 *   <li>{@link Trialple.Phase#getUsage <em>Usage</em>}</li>
 *   <li>{@link Trialple.Phase#getIf <em>If</em>}</li>
 *   <li>{@link Trialple.Phase#getAutorepeat <em>Autorepeat</em>}</li>
 *   <li>{@link Trialple.Phase#isBuffersync <em>Buffersync</em>}</li>
 *   <li>{@link Trialple.Phase#isCheckuvers <em>Checkuvers</em>}</li>
 *   <li>{@link Trialple.Phase#getConnect <em>Connect</em>}</li>
 *   <li>{@link Trialple.Phase#isContinueOnOqErrors <em>Continue On Oq Errors</em>}</li>
 *   <li>{@link Trialple.Phase#getElgfile <em>Elgfile</em>}</li>
 *   <li>{@link Trialple.Phase#isIgnorable <em>Ignorable</em>}</li>
 *   <li>{@link Trialple.Phase#getLogfile <em>Logfile</em>}</li>
 *   <li>{@link Trialple.Phase#getName <em>Name</em>}</li>
 *   <li>{@link Trialple.Phase#getPassword <em>Password</em>}</li>
 *   <li>{@link Trialple.Phase#isUnlockonerror <em>Unlockonerror</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getPhase()
 * @model extendedMetaData="name='Phase' kind='elementOnly'"
 * @generated
 */
public interface Phase extends EObject {
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
	 * @see Trialple.TrialplePackage#getPhase_Options()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='options' namespace='##targetNamespace'"
	 * @generated
	 */
	OptList getOptions();

	/**
	 * Sets the value of the '{@link Trialple.Phase#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(OptList value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference.
	 * @see #setArgs(Arguments)
	 * @see Trialple.TrialplePackage#getPhase_Args()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='args' namespace='##targetNamespace'"
	 * @generated
	 */
	Arguments getArgs();

	/**
	 * Sets the value of the '{@link Trialple.Phase#getArgs <em>Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' containment reference.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(Arguments value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see Trialple.TrialplePackage#getPhase_Action()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link Trialple.Phase#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute list.
	 * @see Trialple.TrialplePackage#getPhase_Usage()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="5"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUsage();

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
	 * @see Trialple.TrialplePackage#getPhase_If()
	 * @model containment="true" upper="10"
	 *        extendedMetaData="kind='element' name='if' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IfType> getIf();

	/**
	 * Returns the value of the '<em><b>Autorepeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autorepeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autorepeat</em>' attribute.
	 * @see #setAutorepeat(String)
	 * @see Trialple.TrialplePackage#getPhase_Autorepeat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='autorepeat' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAutorepeat();

	/**
	 * Sets the value of the '{@link Trialple.Phase#getAutorepeat <em>Autorepeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autorepeat</em>' attribute.
	 * @see #getAutorepeat()
	 * @generated
	 */
	void setAutorepeat(String value);

	/**
	 * Returns the value of the '<em><b>Buffersync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffersync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffersync</em>' attribute.
	 * @see #isSetBuffersync()
	 * @see #unsetBuffersync()
	 * @see #setBuffersync(boolean)
	 * @see Trialple.TrialplePackage#getPhase_Buffersync()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='buffersync' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBuffersync();

	/**
	 * Sets the value of the '{@link Trialple.Phase#isBuffersync <em>Buffersync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffersync</em>' attribute.
	 * @see #isSetBuffersync()
	 * @see #unsetBuffersync()
	 * @see #isBuffersync()
	 * @generated
	 */
	void setBuffersync(boolean value);

	/**
	 * Unsets the value of the '{@link Trialple.Phase#isBuffersync <em>Buffersync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBuffersync()
	 * @see #isBuffersync()
	 * @see #setBuffersync(boolean)
	 * @generated
	 */
	void unsetBuffersync();

	/**
	 * Returns whether the value of the '{@link Trialple.Phase#isBuffersync <em>Buffersync</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Buffersync</em>' attribute is set.
	 * @see #unsetBuffersync()
	 * @see #isBuffersync()
	 * @see #setBuffersync(boolean)
	 * @generated
	 */
	boolean isSetBuffersync();

	/**
	 * Returns the value of the '<em><b>Checkuvers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkuvers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkuvers</em>' attribute.
	 * @see #isSetCheckuvers()
	 * @see #unsetCheckuvers()
	 * @see #setCheckuvers(boolean)
	 * @see Trialple.TrialplePackage#getPhase_Checkuvers()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='checkuvers' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCheckuvers();

	/**
	 * Sets the value of the '{@link Trialple.Phase#isCheckuvers <em>Checkuvers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkuvers</em>' attribute.
	 * @see #isSetCheckuvers()
	 * @see #unsetCheckuvers()
	 * @see #isCheckuvers()
	 * @generated
	 */
	void setCheckuvers(boolean value);

	/**
	 * Unsets the value of the '{@link Trialple.Phase#isCheckuvers <em>Checkuvers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCheckuvers()
	 * @see #isCheckuvers()
	 * @see #setCheckuvers(boolean)
	 * @generated
	 */
	void unsetCheckuvers();

	/**
	 * Returns whether the value of the '{@link Trialple.Phase#isCheckuvers <em>Checkuvers</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Checkuvers</em>' attribute is set.
	 * @see #unsetCheckuvers()
	 * @see #isCheckuvers()
	 * @see #setCheckuvers(boolean)
	 * @generated
	 */
	boolean isSetCheckuvers();

	/**
	 * Returns the value of the '<em><b>Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect</em>' attribute.
	 * @see #setConnect(String)
	 * @see Trialple.TrialplePackage#getPhase_Connect()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='connect' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConnect();

	/**
	 * Sets the value of the '{@link Trialple.Phase#getConnect <em>Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect</em>' attribute.
	 * @see #getConnect()
	 * @generated
	 */
	void setConnect(String value);

	/**
	 * Returns the value of the '<em><b>Continue On Oq Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continue On Oq Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue On Oq Errors</em>' attribute.
	 * @see #isSetContinueOnOqErrors()
	 * @see #unsetContinueOnOqErrors()
	 * @see #setContinueOnOqErrors(boolean)
	 * @see Trialple.TrialplePackage#getPhase_ContinueOnOqErrors()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='continue_on_oq_errors' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isContinueOnOqErrors();

	/**
	 * Sets the value of the '{@link Trialple.Phase#isContinueOnOqErrors <em>Continue On Oq Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue On Oq Errors</em>' attribute.
	 * @see #isSetContinueOnOqErrors()
	 * @see #unsetContinueOnOqErrors()
	 * @see #isContinueOnOqErrors()
	 * @generated
	 */
	void setContinueOnOqErrors(boolean value);

	/**
	 * Unsets the value of the '{@link Trialple.Phase#isContinueOnOqErrors <em>Continue On Oq Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContinueOnOqErrors()
	 * @see #isContinueOnOqErrors()
	 * @see #setContinueOnOqErrors(boolean)
	 * @generated
	 */
	void unsetContinueOnOqErrors();

	/**
	 * Returns whether the value of the '{@link Trialple.Phase#isContinueOnOqErrors <em>Continue On Oq Errors</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Continue On Oq Errors</em>' attribute is set.
	 * @see #unsetContinueOnOqErrors()
	 * @see #isContinueOnOqErrors()
	 * @see #setContinueOnOqErrors(boolean)
	 * @generated
	 */
	boolean isSetContinueOnOqErrors();

	/**
	 * Returns the value of the '<em><b>Elgfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elgfile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elgfile</em>' attribute.
	 * @see #setElgfile(String)
	 * @see Trialple.TrialplePackage#getPhase_Elgfile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='elgfile' namespace='##targetNamespace'"
	 * @generated
	 */
	String getElgfile();

	/**
	 * Sets the value of the '{@link Trialple.Phase#getElgfile <em>Elgfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elgfile</em>' attribute.
	 * @see #getElgfile()
	 * @generated
	 */
	void setElgfile(String value);

	/**
	 * Returns the value of the '<em><b>Ignorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignorable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignorable</em>' attribute.
	 * @see #isSetIgnorable()
	 * @see #unsetIgnorable()
	 * @see #setIgnorable(boolean)
	 * @see Trialple.TrialplePackage#getPhase_Ignorable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='ignorable' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIgnorable();

	/**
	 * Sets the value of the '{@link Trialple.Phase#isIgnorable <em>Ignorable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignorable</em>' attribute.
	 * @see #isSetIgnorable()
	 * @see #unsetIgnorable()
	 * @see #isIgnorable()
	 * @generated
	 */
	void setIgnorable(boolean value);

	/**
	 * Unsets the value of the '{@link Trialple.Phase#isIgnorable <em>Ignorable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnorable()
	 * @see #isIgnorable()
	 * @see #setIgnorable(boolean)
	 * @generated
	 */
	void unsetIgnorable();

	/**
	 * Returns whether the value of the '{@link Trialple.Phase#isIgnorable <em>Ignorable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignorable</em>' attribute is set.
	 * @see #unsetIgnorable()
	 * @see #isIgnorable()
	 * @see #setIgnorable(boolean)
	 * @generated
	 */
	boolean isSetIgnorable();

	/**
	 * Returns the value of the '<em><b>Logfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logfile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logfile</em>' attribute.
	 * @see #setLogfile(String)
	 * @see Trialple.TrialplePackage#getPhase_Logfile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='logfile' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLogfile();

	/**
	 * Sets the value of the '{@link Trialple.Phase#getLogfile <em>Logfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logfile</em>' attribute.
	 * @see #getLogfile()
	 * @generated
	 */
	void setLogfile(String value);

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
	 * @see Trialple.TrialplePackage#getPhase_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Trialple.Phase#getName <em>Name</em>}' attribute.
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
	 * @see Trialple.TrialplePackage#getPhase_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='password' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link Trialple.Phase#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Unlockonerror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unlockonerror</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlockonerror</em>' attribute.
	 * @see #isSetUnlockonerror()
	 * @see #unsetUnlockonerror()
	 * @see #setUnlockonerror(boolean)
	 * @see Trialple.TrialplePackage#getPhase_Unlockonerror()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='unlockonerror' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUnlockonerror();

	/**
	 * Sets the value of the '{@link Trialple.Phase#isUnlockonerror <em>Unlockonerror</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unlockonerror</em>' attribute.
	 * @see #isSetUnlockonerror()
	 * @see #unsetUnlockonerror()
	 * @see #isUnlockonerror()
	 * @generated
	 */
	void setUnlockonerror(boolean value);

	/**
	 * Unsets the value of the '{@link Trialple.Phase#isUnlockonerror <em>Unlockonerror</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnlockonerror()
	 * @see #isUnlockonerror()
	 * @see #setUnlockonerror(boolean)
	 * @generated
	 */
	void unsetUnlockonerror();

	/**
	 * Returns whether the value of the '{@link Trialple.Phase#isUnlockonerror <em>Unlockonerror</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unlockonerror</em>' attribute is set.
	 * @see #unsetUnlockonerror()
	 * @see #isUnlockonerror()
	 * @see #setUnlockonerror(boolean)
	 * @generated
	 */
	boolean isSetUnlockonerror();

} // Phase
