/**
 */
package Trialple.impl;

import Trialple.TrialplePackage;
import Trialple.UnitModList;
import Trialple.UnitModule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Mod List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.UnitModListImpl#getUnitmodule <em>Unitmodule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitModListImpl extends MinimalEObjectImpl.Container implements UnitModList {
	/**
	 * The cached value of the '{@link #getUnitmodule() <em>Unitmodule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitmodule()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitModule> unitmodule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitModListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.UNIT_MOD_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitModule> getUnitmodule() {
		if (unitmodule == null) {
			unitmodule = new EObjectContainmentEList<UnitModule>(UnitModule.class, this, TrialplePackage.UNIT_MOD_LIST__UNITMODULE);
		}
		return unitmodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrialplePackage.UNIT_MOD_LIST__UNITMODULE:
				return ((InternalEList<?>)getUnitmodule()).basicRemove(otherEnd, msgs);
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
			case TrialplePackage.UNIT_MOD_LIST__UNITMODULE:
				return getUnitmodule();
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
			case TrialplePackage.UNIT_MOD_LIST__UNITMODULE:
				getUnitmodule().clear();
				getUnitmodule().addAll((Collection<? extends UnitModule>)newValue);
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
			case TrialplePackage.UNIT_MOD_LIST__UNITMODULE:
				getUnitmodule().clear();
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
			case TrialplePackage.UNIT_MOD_LIST__UNITMODULE:
				return unitmodule != null && !unitmodule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnitModListImpl
