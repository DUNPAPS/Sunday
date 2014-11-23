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
 *   <li>{@link Trialple.Phase#getConnect <em>Connect</em>}</li>
 *   <li>{@link Trialple.Phase#getElgfile <em>Elgfile</em>}</li>
 *   <li>{@link Trialple.Phase#getLogfile <em>Logfile</em>}</li>
 *   <li>{@link Trialple.Phase#getName <em>Name</em>}</li>
 *   <li>{@link Trialple.Phase#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getPhase()
 * @model extendedMetaData="name='Phase' kind='elementOnly'"
 * @generated
 */
public interface Phase extends EObject {
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
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
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
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
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

} // Phase
