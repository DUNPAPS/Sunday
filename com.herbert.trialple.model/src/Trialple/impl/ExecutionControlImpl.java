/**
 */
package Trialple.impl;

import Trialple.ExecutionControl;
import Trialple.Modules;
import Trialple.SubmoduleDef;
import Trialple.SubmoduleDefs;
import Trialple.TrialplePackage;

import Trialple.UnitDef;
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
 * An implementation of the model object '<em><b>Execution Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.ExecutionControlImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link Trialple.impl.ExecutionControlImpl#getSubmoduledefs <em>Submoduledefs</em>}</li>
 *   <li>{@link Trialple.impl.ExecutionControlImpl#getSubmoduledef <em>Submoduledef</em>}</li>
 *   <li>{@link Trialple.impl.ExecutionControlImpl#getUnitDefinition <em>Unit Definition</em>}</li>
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
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Modules> modules;

	/**
	 * The cached value of the '{@link #getSubmoduledefs() <em>Submoduledefs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmoduledefs()
	 * @generated
	 * @ordered
	 */
	protected EList<SubmoduleDefs> submoduledefs;

	/**
	 * The cached value of the '{@link #getSubmoduledef() <em>Submoduledef</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmoduledef()
	 * @generated
	 * @ordered
	 */
	protected EList<SubmoduleDef> submoduledef;

	/**
	 * The cached value of the '{@link #getUnitDefinition() <em>Unit Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitDef> unitDefinition;

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
	public EList<Modules> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<Modules>(Modules.class, this, TrialplePackage.EXECUTION_CONTROL__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubmoduleDefs> getSubmoduledefs() {
		if (submoduledefs == null) {
			submoduledefs = new EObjectContainmentEList<SubmoduleDefs>(SubmoduleDefs.class, this, TrialplePackage.EXECUTION_CONTROL__SUBMODULEDEFS);
		}
		return submoduledefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubmoduleDef> getSubmoduledef() {
		if (submoduledef == null) {
			submoduledef = new EObjectContainmentEList<SubmoduleDef>(SubmoduleDef.class, this, TrialplePackage.EXECUTION_CONTROL__SUBMODULEDEF);
		}
		return submoduledef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitDef> getUnitDefinition() {
		if (unitDefinition == null) {
			unitDefinition = new EObjectContainmentEList<UnitDef>(UnitDef.class, this, TrialplePackage.EXECUTION_CONTROL__UNIT_DEFINITION);
		}
		return unitDefinition;
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
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case TrialplePackage.EXECUTION_CONTROL__SUBMODULEDEFS:
				return ((InternalEList<?>)getSubmoduledefs()).basicRemove(otherEnd, msgs);
			case TrialplePackage.EXECUTION_CONTROL__SUBMODULEDEF:
				return ((InternalEList<?>)getSubmoduledef()).basicRemove(otherEnd, msgs);
			case TrialplePackage.EXECUTION_CONTROL__UNIT_DEFINITION:
				return ((InternalEList<?>)getUnitDefinition()).basicRemove(otherEnd, msgs);
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
			case TrialplePackage.EXECUTION_CONTROL__SUBMODULEDEFS:
				return getSubmoduledefs();
			case TrialplePackage.EXECUTION_CONTROL__SUBMODULEDEF:
				return getSubmoduledef();
			case TrialplePackage.EXECUTION_CONTROL__UNIT_DEFINITION:
				return getUnitDefinition();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrialplePackage.EXECUTION_CONTROL__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Modules>)newValue);
				return;
			case TrialplePackage.EXECUTION_CONTROL__SUBMODULEDEFS:
				getSubmoduledefs().clear();
				getSubmoduledefs().addAll((Collection<? extends SubmoduleDefs>)newValue);
				return;
			case TrialplePackage.EXECUTION_CONTROL__SUBMODULEDEF:
				getSubmoduledef().clear();
				getSubmoduledef().addAll((Collection<? extends SubmoduleDef>)newValue);
				return;
			case TrialplePackage.EXECUTION_CONTROL__UNIT_DEFINITION:
				getUnitDefinition().clear();
				getUnitDefinition().addAll((Collection<? extends UnitDef>)newValue);
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
				getModules().clear();
				return;
			case TrialplePackage.EXECUTION_CONTROL__SUBMODULEDEFS:
				getSubmoduledefs().clear();
				return;
			case TrialplePackage.EXECUTION_CONTROL__SUBMODULEDEF:
				getSubmoduledef().clear();
				return;
			case TrialplePackage.EXECUTION_CONTROL__UNIT_DEFINITION:
				getUnitDefinition().clear();
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
				return modules != null && !modules.isEmpty();
			case TrialplePackage.EXECUTION_CONTROL__SUBMODULEDEFS:
				return submoduledefs != null && !submoduledefs.isEmpty();
			case TrialplePackage.EXECUTION_CONTROL__SUBMODULEDEF:
				return submoduledef != null && !submoduledef.isEmpty();
			case TrialplePackage.EXECUTION_CONTROL__UNIT_DEFINITION:
				return unitDefinition != null && !unitDefinition.isEmpty();
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
