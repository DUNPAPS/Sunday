/**
 */
package Trialple.impl;

import Trialple.Module;
import Trialple.ModuleList;
import Trialple.Modules;
import Trialple.SubmoduleDef;
import Trialple.SubmoduleDefs;
import Trialple.TrialplePackage;

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
 * An implementation of the model object '<em><b>Module List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.ModuleListImpl#getModule <em>Module</em>}</li>
 *   <li>{@link Trialple.impl.ModuleListImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link Trialple.impl.ModuleListImpl#getSubmoduledefs <em>Submoduledefs</em>}</li>
 *   <li>{@link Trialple.impl.ModuleListImpl#getSubmoduledef <em>Submoduledef</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleListImpl extends MinimalEObjectImpl.Container implements ModuleList {
	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> module;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.MODULE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getModule() {
		if (module == null) {
			module = new EObjectContainmentEList<Module>(Module.class, this, TrialplePackage.MODULE_LIST__MODULE);
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modules> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<Modules>(Modules.class, this, TrialplePackage.MODULE_LIST__MODULES);
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
			submoduledefs = new EObjectContainmentEList<SubmoduleDefs>(SubmoduleDefs.class, this, TrialplePackage.MODULE_LIST__SUBMODULEDEFS);
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
			submoduledef = new EObjectContainmentEList<SubmoduleDef>(SubmoduleDef.class, this, TrialplePackage.MODULE_LIST__SUBMODULEDEF);
		}
		return submoduledef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrialplePackage.MODULE_LIST__MODULE:
				return ((InternalEList<?>)getModule()).basicRemove(otherEnd, msgs);
			case TrialplePackage.MODULE_LIST__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case TrialplePackage.MODULE_LIST__SUBMODULEDEFS:
				return ((InternalEList<?>)getSubmoduledefs()).basicRemove(otherEnd, msgs);
			case TrialplePackage.MODULE_LIST__SUBMODULEDEF:
				return ((InternalEList<?>)getSubmoduledef()).basicRemove(otherEnd, msgs);
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
			case TrialplePackage.MODULE_LIST__MODULE:
				return getModule();
			case TrialplePackage.MODULE_LIST__MODULES:
				return getModules();
			case TrialplePackage.MODULE_LIST__SUBMODULEDEFS:
				return getSubmoduledefs();
			case TrialplePackage.MODULE_LIST__SUBMODULEDEF:
				return getSubmoduledef();
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
			case TrialplePackage.MODULE_LIST__MODULE:
				getModule().clear();
				getModule().addAll((Collection<? extends Module>)newValue);
				return;
			case TrialplePackage.MODULE_LIST__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Modules>)newValue);
				return;
			case TrialplePackage.MODULE_LIST__SUBMODULEDEFS:
				getSubmoduledefs().clear();
				getSubmoduledefs().addAll((Collection<? extends SubmoduleDefs>)newValue);
				return;
			case TrialplePackage.MODULE_LIST__SUBMODULEDEF:
				getSubmoduledef().clear();
				getSubmoduledef().addAll((Collection<? extends SubmoduleDef>)newValue);
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
			case TrialplePackage.MODULE_LIST__MODULE:
				getModule().clear();
				return;
			case TrialplePackage.MODULE_LIST__MODULES:
				getModules().clear();
				return;
			case TrialplePackage.MODULE_LIST__SUBMODULEDEFS:
				getSubmoduledefs().clear();
				return;
			case TrialplePackage.MODULE_LIST__SUBMODULEDEF:
				getSubmoduledef().clear();
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
			case TrialplePackage.MODULE_LIST__MODULE:
				return module != null && !module.isEmpty();
			case TrialplePackage.MODULE_LIST__MODULES:
				return modules != null && !modules.isEmpty();
			case TrialplePackage.MODULE_LIST__SUBMODULEDEFS:
				return submoduledefs != null && !submoduledefs.isEmpty();
			case TrialplePackage.MODULE_LIST__SUBMODULEDEF:
				return submoduledef != null && !submoduledef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleListImpl
