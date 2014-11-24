/**
 */
package Trialple.impl;

import Trialple.OptList;
import Trialple.Phaselist;
import Trialple.SubModule;
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
 * An implementation of the model object '<em><b>Sub Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.SubModuleImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link Trialple.impl.SubModuleImpl#getPhaselist <em>Phaselist</em>}</li>
 *   <li>{@link Trialple.impl.SubModuleImpl#isExecparallel <em>Execparallel</em>}</li>
 *   <li>{@link Trialple.impl.SubModuleImpl#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubModuleImpl extends MinimalEObjectImpl.Container implements SubModule {
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
	 * The cached value of the '{@link #getPhaselist() <em>Phaselist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaselist()
	 * @generated
	 * @ordered
	 */
	protected EList<Phaselist> phaselist;

	/**
	 * The default value of the '{@link #isExecparallel() <em>Execparallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecparallel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXECPARALLEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExecparallel() <em>Execparallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecparallel()
	 * @generated
	 * @ordered
	 */
	protected boolean execparallel = EXECPARALLEL_EDEFAULT;

	/**
	 * This is true if the Execparallel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean execparallelESet;

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
	protected SubModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.SUB_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptList> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<OptList>(OptList.class, this, TrialplePackage.SUB_MODULE__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phaselist> getPhaselist() {
		if (phaselist == null) {
			phaselist = new EObjectContainmentEList<Phaselist>(Phaselist.class, this, TrialplePackage.SUB_MODULE__PHASELIST);
		}
		return phaselist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExecparallel() {
		return execparallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecparallel(boolean newExecparallel) {
		boolean oldExecparallel = execparallel;
		execparallel = newExecparallel;
		boolean oldExecparallelESet = execparallelESet;
		execparallelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.SUB_MODULE__EXECPARALLEL, oldExecparallel, execparallel, !oldExecparallelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExecparallel() {
		boolean oldExecparallel = execparallel;
		boolean oldExecparallelESet = execparallelESet;
		execparallel = EXECPARALLEL_EDEFAULT;
		execparallelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TrialplePackage.SUB_MODULE__EXECPARALLEL, oldExecparallel, EXECPARALLEL_EDEFAULT, oldExecparallelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExecparallel() {
		return execparallelESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.SUB_MODULE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrialplePackage.SUB_MODULE__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
			case TrialplePackage.SUB_MODULE__PHASELIST:
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
			case TrialplePackage.SUB_MODULE__OPTIONS:
				return getOptions();
			case TrialplePackage.SUB_MODULE__PHASELIST:
				return getPhaselist();
			case TrialplePackage.SUB_MODULE__EXECPARALLEL:
				return isExecparallel();
			case TrialplePackage.SUB_MODULE__PASSWORD:
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
			case TrialplePackage.SUB_MODULE__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends OptList>)newValue);
				return;
			case TrialplePackage.SUB_MODULE__PHASELIST:
				getPhaselist().clear();
				getPhaselist().addAll((Collection<? extends Phaselist>)newValue);
				return;
			case TrialplePackage.SUB_MODULE__EXECPARALLEL:
				setExecparallel((Boolean)newValue);
				return;
			case TrialplePackage.SUB_MODULE__PASSWORD:
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
			case TrialplePackage.SUB_MODULE__OPTIONS:
				getOptions().clear();
				return;
			case TrialplePackage.SUB_MODULE__PHASELIST:
				getPhaselist().clear();
				return;
			case TrialplePackage.SUB_MODULE__EXECPARALLEL:
				unsetExecparallel();
				return;
			case TrialplePackage.SUB_MODULE__PASSWORD:
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
			case TrialplePackage.SUB_MODULE__OPTIONS:
				return options != null && !options.isEmpty();
			case TrialplePackage.SUB_MODULE__PHASELIST:
				return phaselist != null && !phaselist.isEmpty();
			case TrialplePackage.SUB_MODULE__EXECPARALLEL:
				return isSetExecparallel();
			case TrialplePackage.SUB_MODULE__PASSWORD:
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
		result.append(" (execparallel: ");
		if (execparallelESet) result.append(execparallel); else result.append("<unset>");
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //SubModuleImpl
