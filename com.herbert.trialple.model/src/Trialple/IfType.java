/**
 */
package Trialple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Trialple.IfType#getPhase <em>Phase</em>}</li>
 *   <li>{@link Trialple.IfType#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see Trialple.TrialplePackage#getIfType()
 * @model extendedMetaData="name='IfType' kind='elementOnly'"
 * @generated
 */
public interface IfType extends EObject {
	/**
	 * Returns the value of the '<em><b>Phase</b></em>' containment reference list.
	 * The list contents are of type {@link Trialple.Phase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' containment reference list.
	 * @see Trialple.TrialplePackage#getIfType_Phase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Phase> getPhase();

	/**
	 * Returns the value of the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' attribute.
	 * @see #setTest(String)
	 * @see Trialple.TrialplePackage#getIfType_Test()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='test' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTest();

	/**
	 * Sets the value of the '{@link Trialple.IfType#getTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' attribute.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(String value);

} // IfType
