/**
 */
package Trialple.impl;

import Trialple.IfType;
import Trialple.OptList;
import Trialple.Phase;
import Trialple.SubModuleRef;
import Trialple.TrialplePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.IfTypeImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link Trialple.impl.IfTypeImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link Trialple.impl.IfTypeImpl#getSubmoduleref <em>Submoduleref</em>}</li>
 *   <li>{@link Trialple.impl.IfTypeImpl#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfTypeImpl extends MinimalEObjectImpl.Container implements IfType {
	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected EList<Phase> phase;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<OptList> options;

	/**
	 * The cached value of the '{@link #getSubmoduleref() <em>Submoduleref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmoduleref()
	 * @generated
	 * @ordered
	 */
	protected EList<SubModuleRef> submoduleref;

	/**
	 * The default value of the '{@link #getTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected String test = TEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.IF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phase> getPhase() {
		if (phase == null) {
			phase = new EObjectContainmentEList<Phase>(Phase.class, this, TrialplePackage.IF_TYPE__PHASE);
		}
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptList> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<OptList>(OptList.class, this, TrialplePackage.IF_TYPE__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubModuleRef> getSubmoduleref() {
		if (submoduleref == null) {
			submoduleref = new EObjectContainmentEList<SubModuleRef>(SubModuleRef.class, this, TrialplePackage.IF_TYPE__SUBMODULEREF);
		}
		return submoduleref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTest() {
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest(String newTest) {
		String oldTest = test;
		test = newTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.IF_TYPE__TEST, oldTest, test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrialplePackage.IF_TYPE__PHASE:
				return ((InternalEList<?>)getPhase()).basicRemove(otherEnd, msgs);
			case TrialplePackage.IF_TYPE__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
			case TrialplePackage.IF_TYPE__SUBMODULEREF:
				return ((InternalEList<?>)getSubmoduleref()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrialplePackage.IF_TYPE__PHASE:
				return getPhase();
			case TrialplePackage.IF_TYPE__OPTIONS:
				return getOptions();
			case TrialplePackage.IF_TYPE__SUBMODULEREF:
				return getSubmoduleref();
			case TrialplePackage.IF_TYPE__TEST:
				return getTest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrialplePackage.IF_TYPE__PHASE:
				getPhase().clear();
				getPhase().addAll((Collection<? extends Phase>)newValue);
				return;
			case TrialplePackage.IF_TYPE__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends OptList>)newValue);
				return;
			case TrialplePackage.IF_TYPE__SUBMODULEREF:
				getSubmoduleref().clear();
				getSubmoduleref().addAll((Collection<? extends SubModuleRef>)newValue);
				return;
			case TrialplePackage.IF_TYPE__TEST:
				setTest((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TrialplePackage.IF_TYPE__PHASE:
				getPhase().clear();
				return;
			case TrialplePackage.IF_TYPE__OPTIONS:
				getOptions().clear();
				return;
			case TrialplePackage.IF_TYPE__SUBMODULEREF:
				getSubmoduleref().clear();
				return;
			case TrialplePackage.IF_TYPE__TEST:
				setTest(TEST_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TrialplePackage.IF_TYPE__PHASE:
				return phase != null && !phase.isEmpty();
			case TrialplePackage.IF_TYPE__OPTIONS:
				return options != null && !options.isEmpty();
			case TrialplePackage.IF_TYPE__SUBMODULEREF:
				return submoduleref != null && !submoduleref.isEmpty();
			case TrialplePackage.IF_TYPE__TEST:
				return TEST_EDEFAULT == null ? test != null : !TEST_EDEFAULT.equals(test);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (test: ");
		result.append(test);
		result.append(')');
		return result.toString();
	}

} //IfTypeImpl
