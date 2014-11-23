/**
 */
package Trialple.impl;

import Trialple.ExecutionControl;
import Trialple.Modules;
import Trialple.TrialplePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.ExecutionControlImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link Trialple.impl.ExecutionControlImpl#getName <em>Name</em>}</li>
 *   <li>{@link Trialple.impl.ExecutionControlImpl#getSrcid <em>Srcid</em>}</li>
 *   <li>{@link Trialple.impl.ExecutionControlImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionControlImpl extends MinimalEObjectImpl.Container implements ExecutionControl {
	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected Modules modules;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrcid() <em>Srcid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcid()
	 * @generated
	 * @ordered
	 */
	protected static final String SRCID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcid() <em>Srcid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcid()
	 * @generated
	 * @ordered
	 */
	protected String srcid = SRCID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.EXECUTION_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modules getModules() {
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModules(Modules newModules, NotificationChain msgs) {
		Modules oldModules = modules;
		modules = newModules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrialplePackage.EXECUTION_CONTROL__MODULES, oldModules, newModules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModules(Modules newModules) {
		if (newModules != modules) {
			NotificationChain msgs = null;
			if (modules != null)
				msgs = ((InternalEObject)modules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.EXECUTION_CONTROL__MODULES, null, msgs);
			if (newModules != null)
				msgs = ((InternalEObject)newModules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.EXECUTION_CONTROL__MODULES, null, msgs);
			msgs = basicSetModules(newModules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.EXECUTION_CONTROL__MODULES, newModules, newModules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.EXECUTION_CONTROL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcid() {
		return srcid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcid(String newSrcid) {
		String oldSrcid = srcid;
		srcid = newSrcid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.EXECUTION_CONTROL__SRCID, oldSrcid, srcid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.EXECUTION_CONTROL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrialplePackage.EXECUTION_CONTROL__MODULES:
				return basicSetModules(null, msgs);
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
			case TrialplePackage.EXECUTION_CONTROL__MODULES:
				return getModules();
			case TrialplePackage.EXECUTION_CONTROL__NAME:
				return getName();
			case TrialplePackage.EXECUTION_CONTROL__SRCID:
				return getSrcid();
			case TrialplePackage.EXECUTION_CONTROL__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrialplePackage.EXECUTION_CONTROL__MODULES:
				setModules((Modules)newValue);
				return;
			case TrialplePackage.EXECUTION_CONTROL__NAME:
				setName((String)newValue);
				return;
			case TrialplePackage.EXECUTION_CONTROL__SRCID:
				setSrcid((String)newValue);
				return;
			case TrialplePackage.EXECUTION_CONTROL__VERSION:
				setVersion((String)newValue);
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
			case TrialplePackage.EXECUTION_CONTROL__MODULES:
				setModules((Modules)null);
				return;
			case TrialplePackage.EXECUTION_CONTROL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrialplePackage.EXECUTION_CONTROL__SRCID:
				setSrcid(SRCID_EDEFAULT);
				return;
			case TrialplePackage.EXECUTION_CONTROL__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case TrialplePackage.EXECUTION_CONTROL__MODULES:
				return modules != null;
			case TrialplePackage.EXECUTION_CONTROL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TrialplePackage.EXECUTION_CONTROL__SRCID:
				return SRCID_EDEFAULT == null ? srcid != null : !SRCID_EDEFAULT.equals(srcid);
			case TrialplePackage.EXECUTION_CONTROL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", srcid: ");
		result.append(srcid);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ExecutionControlImpl
