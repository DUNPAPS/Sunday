/**
 */
package Trialple;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.ExecutionControl#getModules <em>Modules</em>}</li>
 *   <li>{@link Trialple.ExecutionControl#getName <em>Name</em>}</li>
 *   <li>{@link Trialple.ExecutionControl#getSrcid <em>Srcid</em>}</li>
 *   <li>{@link Trialple.ExecutionControl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getExecutionControl()
 * @model extendedMetaData="name='ExecutionControl' kind='elementOnly'"
 * @generated
 */
public interface ExecutionControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference.
	 * @see #setModules(Modules)
	 * @see Trialple.TrialplePackage#getExecutionControl_Modules()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Modules' namespace='##targetNamespace'"
	 * @generated
	 */
	Modules getModules();

	/**
	 * Sets the value of the '{@link Trialple.ExecutionControl#getModules <em>Modules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modules</em>' containment reference.
	 * @see #getModules()
	 * @generated
	 */
	void setModules(Modules value);

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
	 * @see Trialple.TrialplePackage#getExecutionControl_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Trialple.ExecutionControl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Srcid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srcid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srcid</em>' attribute.
	 * @see #setSrcid(String)
	 * @see Trialple.TrialplePackage#getExecutionControl_Srcid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='srcid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSrcid();

	/**
	 * Sets the value of the '{@link Trialple.ExecutionControl#getSrcid <em>Srcid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srcid</em>' attribute.
	 * @see #getSrcid()
	 * @generated
	 */
	void setSrcid(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see Trialple.TrialplePackage#getExecutionControl_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link Trialple.ExecutionControl#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // ExecutionControl
