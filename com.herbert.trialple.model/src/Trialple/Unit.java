/**
 */
package Trialple;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.Unit#getTitle <em>Title</em>}</li>
 *   <li>{@link Trialple.Unit#getUnitmodules <em>Unitmodules</em>}</li>
 *   <li>{@link Trialple.Unit#getRevokecondition <em>Revokecondition</em>}</li>
 *   <li>{@link Trialple.Unit#getDowntime <em>Downtime</em>}</li>
 *   <li>{@link Trialple.Unit#getId <em>Id</em>}</li>
 *   <li>{@link Trialple.Unit#getName <em>Name</em>}</li>
 *   <li>{@link Trialple.Unit#getRevoke <em>Revoke</em>}</li>
 *   <li>{@link Trialple.Unit#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getUnit()
 * @model extendedMetaData="name='Unit' kind='elementOnly'"
 * @generated
 */
public interface Unit extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see Trialple.TrialplePackage#getUnit_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link Trialple.Unit#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Unitmodules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unitmodules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitmodules</em>' containment reference.
	 * @see #setUnitmodules(UnitModuleList)
	 * @see Trialple.TrialplePackage#getUnit_Unitmodules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitmodules' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitModuleList getUnitmodules();

	/**
	 * Sets the value of the '{@link Trialple.Unit#getUnitmodules <em>Unitmodules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unitmodules</em>' containment reference.
	 * @see #getUnitmodules()
	 * @generated
	 */
	void setUnitmodules(UnitModuleList value);

	/**
	 * Returns the value of the '<em><b>Revokecondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revokecondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revokecondition</em>' containment reference.
	 * @see #setRevokecondition(OptList)
	 * @see Trialple.TrialplePackage#getUnit_Revokecondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='revokecondition' namespace='##targetNamespace'"
	 * @generated
	 */
	OptList getRevokecondition();

	/**
	 * Sets the value of the '{@link Trialple.Unit#getRevokecondition <em>Revokecondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revokecondition</em>' containment reference.
	 * @see #getRevokecondition()
	 * @generated
	 */
	void setRevokecondition(OptList value);

	/**
	 * Returns the value of the '<em><b>Downtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Downtime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downtime</em>' attribute.
	 * @see #setDowntime(String)
	 * @see Trialple.TrialplePackage#getUnit_Downtime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='downtime' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDowntime();

	/**
	 * Sets the value of the '{@link Trialple.Unit#getDowntime <em>Downtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downtime</em>' attribute.
	 * @see #getDowntime()
	 * @generated
	 */
	void setDowntime(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Trialple.TrialplePackage#getUnit_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Trialple.Unit#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see Trialple.TrialplePackage#getUnit_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Trialple.Unit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Revoke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revoke</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revoke</em>' attribute.
	 * @see #setRevoke(String)
	 * @see Trialple.TrialplePackage#getUnit_Revoke()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='revoke' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRevoke();

	/**
	 * Sets the value of the '{@link Trialple.Unit#getRevoke <em>Revoke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revoke</em>' attribute.
	 * @see #getRevoke()
	 * @generated
	 */
	void setRevoke(String value);

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
	 * @see Trialple.TrialplePackage#getUnit_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ModuleType getType();

	/**
	 * Sets the value of the '{@link Trialple.Unit#getType <em>Type</em>}' attribute.
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
	 * Unsets the value of the '{@link Trialple.Unit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ModuleType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link Trialple.Unit#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ModuleType)
	 * @generated
	 */
	boolean isSetType();

} // Unit
