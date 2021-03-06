/**
 */
package Trialple.impl;

import Trialple.ModuleType;
import Trialple.OptList;
import Trialple.TrialplePackage;
import Trialple.Unit;
import Trialple.UnitModuleList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.UnitImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link Trialple.impl.UnitImpl#getUnitmodules <em>Unitmodules</em>}</li>
 *   <li>{@link Trialple.impl.UnitImpl#getRevokecondition <em>Revokecondition</em>}</li>
 *   <li>{@link Trialple.impl.UnitImpl#getDowntime <em>Downtime</em>}</li>
 *   <li>{@link Trialple.impl.UnitImpl#getId <em>Id</em>}</li>
 *   <li>{@link Trialple.impl.UnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link Trialple.impl.UnitImpl#getRevoke <em>Revoke</em>}</li>
 *   <li>{@link Trialple.impl.UnitImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitImpl extends MinimalEObjectImpl.Container implements Unit {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnitmodules() <em>Unitmodules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitmodules()
	 * @generated
	 * @ordered
	 */
	protected UnitModuleList unitmodules;

	/**
	 * The cached value of the '{@link #getRevokecondition() <em>Revokecondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevokecondition()
	 * @generated
	 * @ordered
	 */
	protected OptList revokecondition;

	/**
	 * The default value of the '{@link #getDowntime() <em>Downtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDowntime()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWNTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDowntime() <em>Downtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDowntime()
	 * @generated
	 * @ordered
	 */
	protected String downtime = DOWNTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getRevoke() <em>Revoke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevoke()
	 * @generated
	 * @ordered
	 */
	protected static final String REVOKE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevoke() <em>Revoke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevoke()
	 * @generated
	 * @ordered
	 */
	protected String revoke = REVOKE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ModuleType TYPE_EDEFAULT = ModuleType.PREPARE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ModuleType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.UNIT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitModuleList getUnitmodules() {
		return unitmodules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitmodules(UnitModuleList newUnitmodules, NotificationChain msgs) {
		UnitModuleList oldUnitmodules = unitmodules;
		unitmodules = newUnitmodules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrialplePackage.UNIT__UNITMODULES, oldUnitmodules, newUnitmodules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitmodules(UnitModuleList newUnitmodules) {
		if (newUnitmodules != unitmodules) {
			NotificationChain msgs = null;
			if (unitmodules != null)
				msgs = ((InternalEObject)unitmodules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.UNIT__UNITMODULES, null, msgs);
			if (newUnitmodules != null)
				msgs = ((InternalEObject)newUnitmodules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.UNIT__UNITMODULES, null, msgs);
			msgs = basicSetUnitmodules(newUnitmodules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.UNIT__UNITMODULES, newUnitmodules, newUnitmodules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptList getRevokecondition() {
		return revokecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevokecondition(OptList newRevokecondition, NotificationChain msgs) {
		OptList oldRevokecondition = revokecondition;
		revokecondition = newRevokecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrialplePackage.UNIT__REVOKECONDITION, oldRevokecondition, newRevokecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevokecondition(OptList newRevokecondition) {
		if (newRevokecondition != revokecondition) {
			NotificationChain msgs = null;
			if (revokecondition != null)
				msgs = ((InternalEObject)revokecondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.UNIT__REVOKECONDITION, null, msgs);
			if (newRevokecondition != null)
				msgs = ((InternalEObject)newRevokecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.UNIT__REVOKECONDITION, null, msgs);
			msgs = basicSetRevokecondition(newRevokecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.UNIT__REVOKECONDITION, newRevokecondition, newRevokecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDowntime() {
		return downtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDowntime(String newDowntime) {
		String oldDowntime = downtime;
		downtime = newDowntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.UNIT__DOWNTIME, oldDowntime, downtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.UNIT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevoke() {
		return revoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevoke(String newRevoke) {
		String oldRevoke = revoke;
		revoke = newRevoke;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.UNIT__REVOKE, oldRevoke, revoke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ModuleType newType) {
		ModuleType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.UNIT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		ModuleType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TrialplePackage.UNIT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrialplePackage.UNIT__UNITMODULES:
				return basicSetUnitmodules(null, msgs);
			case TrialplePackage.UNIT__REVOKECONDITION:
				return basicSetRevokecondition(null, msgs);
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
			case TrialplePackage.UNIT__TITLE:
				return getTitle();
			case TrialplePackage.UNIT__UNITMODULES:
				return getUnitmodules();
			case TrialplePackage.UNIT__REVOKECONDITION:
				return getRevokecondition();
			case TrialplePackage.UNIT__DOWNTIME:
				return getDowntime();
			case TrialplePackage.UNIT__ID:
				return getId();
			case TrialplePackage.UNIT__NAME:
				return getName();
			case TrialplePackage.UNIT__REVOKE:
				return getRevoke();
			case TrialplePackage.UNIT__TYPE:
				return getType();
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
			case TrialplePackage.UNIT__TITLE:
				setTitle((String)newValue);
				return;
			case TrialplePackage.UNIT__UNITMODULES:
				setUnitmodules((UnitModuleList)newValue);
				return;
			case TrialplePackage.UNIT__REVOKECONDITION:
				setRevokecondition((OptList)newValue);
				return;
			case TrialplePackage.UNIT__DOWNTIME:
				setDowntime((String)newValue);
				return;
			case TrialplePackage.UNIT__ID:
				setId((String)newValue);
				return;
			case TrialplePackage.UNIT__NAME:
				setName((String)newValue);
				return;
			case TrialplePackage.UNIT__REVOKE:
				setRevoke((String)newValue);
				return;
			case TrialplePackage.UNIT__TYPE:
				setType((ModuleType)newValue);
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
			case TrialplePackage.UNIT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case TrialplePackage.UNIT__UNITMODULES:
				setUnitmodules((UnitModuleList)null);
				return;
			case TrialplePackage.UNIT__REVOKECONDITION:
				setRevokecondition((OptList)null);
				return;
			case TrialplePackage.UNIT__DOWNTIME:
				setDowntime(DOWNTIME_EDEFAULT);
				return;
			case TrialplePackage.UNIT__ID:
				setId(ID_EDEFAULT);
				return;
			case TrialplePackage.UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrialplePackage.UNIT__REVOKE:
				setRevoke(REVOKE_EDEFAULT);
				return;
			case TrialplePackage.UNIT__TYPE:
				unsetType();
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
			case TrialplePackage.UNIT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case TrialplePackage.UNIT__UNITMODULES:
				return unitmodules != null;
			case TrialplePackage.UNIT__REVOKECONDITION:
				return revokecondition != null;
			case TrialplePackage.UNIT__DOWNTIME:
				return DOWNTIME_EDEFAULT == null ? downtime != null : !DOWNTIME_EDEFAULT.equals(downtime);
			case TrialplePackage.UNIT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TrialplePackage.UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TrialplePackage.UNIT__REVOKE:
				return REVOKE_EDEFAULT == null ? revoke != null : !REVOKE_EDEFAULT.equals(revoke);
			case TrialplePackage.UNIT__TYPE:
				return isSetType();
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
		result.append(" (title: ");
		result.append(title);
		result.append(", downtime: ");
		result.append(downtime);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", revoke: ");
		result.append(revoke);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UnitImpl
