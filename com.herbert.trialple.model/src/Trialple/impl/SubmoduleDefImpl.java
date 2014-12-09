/**
 */
package Trialple.impl;

import Trialple.Definitions;
import Trialple.Phaselist;
import Trialple.SubmoduleDef;
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
 * An implementation of the model object '<em><b>Submodule Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.SubmoduleDefImpl#getDefs <em>Defs</em>}</li>
 *   <li>{@link Trialple.impl.SubmoduleDefImpl#getPhaselist <em>Phaselist</em>}</li>
 *   <li>{@link Trialple.impl.SubmoduleDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link Trialple.impl.SubmoduleDefImpl#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubmoduleDefImpl extends MinimalEObjectImpl.Container implements SubmoduleDef {
	/**
	 * The cached value of the '{@link #getDefs() <em>Defs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefs()
	 * @generated
	 * @ordered
	 */
	protected Definitions defs;

	/**
	 * The cached value of the '{@link #getPhaselist() <em>Phaselist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaselist()
	 * @generated
	 * @ordered
	 */
	protected EList<Phaselist> phaselist;

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
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmoduleDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.SUBMODULE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions getDefs() {
		return defs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefs(Definitions newDefs, NotificationChain msgs) {
		Definitions oldDefs = defs;
		defs = newDefs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrialplePackage.SUBMODULE_DEF__DEFS, oldDefs, newDefs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefs(Definitions newDefs) {
		if (newDefs != defs) {
			NotificationChain msgs = null;
			if (defs != null)
				msgs = ((InternalEObject)defs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.SUBMODULE_DEF__DEFS, null, msgs);
			if (newDefs != null)
				msgs = ((InternalEObject)newDefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.SUBMODULE_DEF__DEFS, null, msgs);
			msgs = basicSetDefs(newDefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.SUBMODULE_DEF__DEFS, newDefs, newDefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phaselist> getPhaselist() {
		if (phaselist == null) {
			phaselist = new EObjectContainmentEList<Phaselist>(Phaselist.class, this, TrialplePackage.SUBMODULE_DEF__PHASELIST);
		}
		return phaselist;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.SUBMODULE_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.SUBMODULE_DEF__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrialplePackage.SUBMODULE_DEF__DEFS:
				return basicSetDefs(null, msgs);
			case TrialplePackage.SUBMODULE_DEF__PHASELIST:
				return ((InternalEList<?>)getPhaselist()).basicRemove(otherEnd, msgs);
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
			case TrialplePackage.SUBMODULE_DEF__DEFS:
				return getDefs();
			case TrialplePackage.SUBMODULE_DEF__PHASELIST:
				return getPhaselist();
			case TrialplePackage.SUBMODULE_DEF__NAME:
				return getName();
			case TrialplePackage.SUBMODULE_DEF__PASSWORD:
				return getPassword();
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
			case TrialplePackage.SUBMODULE_DEF__DEFS:
				setDefs((Definitions)newValue);
				return;
			case TrialplePackage.SUBMODULE_DEF__PHASELIST:
				getPhaselist().clear();
				getPhaselist().addAll((Collection<? extends Phaselist>)newValue);
				return;
			case TrialplePackage.SUBMODULE_DEF__NAME:
				setName((String)newValue);
				return;
			case TrialplePackage.SUBMODULE_DEF__PASSWORD:
				setPassword((String)newValue);
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
			case TrialplePackage.SUBMODULE_DEF__DEFS:
				setDefs((Definitions)null);
				return;
			case TrialplePackage.SUBMODULE_DEF__PHASELIST:
				getPhaselist().clear();
				return;
			case TrialplePackage.SUBMODULE_DEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrialplePackage.SUBMODULE_DEF__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
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
			case TrialplePackage.SUBMODULE_DEF__DEFS:
				return defs != null;
			case TrialplePackage.SUBMODULE_DEF__PHASELIST:
				return phaselist != null && !phaselist.isEmpty();
			case TrialplePackage.SUBMODULE_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TrialplePackage.SUBMODULE_DEF__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //SubmoduleDefImpl
