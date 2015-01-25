/**
 */
package Trialple.impl;

import Trialple.TrialplePackage;
import Trialple.Unit;
import Trialple.UnitDefinition;

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
 * An implementation of the model object '<em><b>Unit Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.UnitDefinitionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link Trialple.impl.UnitDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link Trialple.impl.UnitDefinitionImpl#getSrcid <em>Srcid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitDefinitionImpl extends MinimalEObjectImpl.Container implements UnitDefinition {
	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> unit;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.UNIT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getUnit() {
		if (unit == null) {
			unit = new EObjectContainmentEList<Unit>(Unit.class, this, TrialplePackage.UNIT_DEFINITION__UNIT);
		}
		return unit;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.UNIT_DEFINITION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.UNIT_DEFINITION__SRCID, oldSrcid, srcid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrialplePackage.UNIT_DEFINITION__UNIT:
				return ((InternalEList<?>)getUnit()).basicRemove(otherEnd, msgs);
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
			case TrialplePackage.UNIT_DEFINITION__UNIT:
				return getUnit();
			case TrialplePackage.UNIT_DEFINITION__NAME:
				return getName();
			case TrialplePackage.UNIT_DEFINITION__SRCID:
				return getSrcid();
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
			case TrialplePackage.UNIT_DEFINITION__UNIT:
				getUnit().clear();
				getUnit().addAll((Collection<? extends Unit>)newValue);
				return;
			case TrialplePackage.UNIT_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case TrialplePackage.UNIT_DEFINITION__SRCID:
				setSrcid((String)newValue);
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
			case TrialplePackage.UNIT_DEFINITION__UNIT:
				getUnit().clear();
				return;
			case TrialplePackage.UNIT_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrialplePackage.UNIT_DEFINITION__SRCID:
				setSrcid(SRCID_EDEFAULT);
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
			case TrialplePackage.UNIT_DEFINITION__UNIT:
				return unit != null && !unit.isEmpty();
			case TrialplePackage.UNIT_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TrialplePackage.UNIT_DEFINITION__SRCID:
				return SRCID_EDEFAULT == null ? srcid != null : !SRCID_EDEFAULT.equals(srcid);
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
		result.append(')');
		return result.toString();
	}

} //UnitDefinitionImpl
