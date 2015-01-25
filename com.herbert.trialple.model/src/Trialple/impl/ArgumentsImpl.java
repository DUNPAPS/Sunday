/**
 */
package Trialple.impl;

import Trialple.Arguments;
import Trialple.ArgxType;
import Trialple.TrialplePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arguments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.ArgumentsImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link Trialple.impl.ArgumentsImpl#getArgx <em>Argx</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentsImpl extends MinimalEObjectImpl.Container implements Arguments {
	/**
	 * The cached value of the '{@link #getArg() <em>Arg</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg()
	 * @generated
	 * @ordered
	 */
	protected EList<String> arg;

	/**
	 * The cached value of the '{@link #getArgx() <em>Argx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgx()
	 * @generated
	 * @ordered
	 */
	protected ArgxType argx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.ARGUMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArg() {
		if (arg == null) {
			arg = new EDataTypeEList<String>(String.class, this, TrialplePackage.ARGUMENTS__ARG);
		}
		return arg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgxType getArgx() {
		return argx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgx(ArgxType newArgx, NotificationChain msgs) {
		ArgxType oldArgx = argx;
		argx = newArgx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrialplePackage.ARGUMENTS__ARGX, oldArgx, newArgx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgx(ArgxType newArgx) {
		if (newArgx != argx) {
			NotificationChain msgs = null;
			if (argx != null)
				msgs = ((InternalEObject)argx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.ARGUMENTS__ARGX, null, msgs);
			if (newArgx != null)
				msgs = ((InternalEObject)newArgx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.ARGUMENTS__ARGX, null, msgs);
			msgs = basicSetArgx(newArgx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.ARGUMENTS__ARGX, newArgx, newArgx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrialplePackage.ARGUMENTS__ARGX:
				return basicSetArgx(null, msgs);
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
			case TrialplePackage.ARGUMENTS__ARG:
				return getArg();
			case TrialplePackage.ARGUMENTS__ARGX:
				return getArgx();
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
			case TrialplePackage.ARGUMENTS__ARG:
				getArg().clear();
				getArg().addAll((Collection<? extends String>)newValue);
				return;
			case TrialplePackage.ARGUMENTS__ARGX:
				setArgx((ArgxType)newValue);
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
			case TrialplePackage.ARGUMENTS__ARG:
				getArg().clear();
				return;
			case TrialplePackage.ARGUMENTS__ARGX:
				setArgx((ArgxType)null);
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
			case TrialplePackage.ARGUMENTS__ARG:
				return arg != null && !arg.isEmpty();
			case TrialplePackage.ARGUMENTS__ARGX:
				return argx != null;
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
		result.append(" (arg: ");
		result.append(arg);
		result.append(')');
		return result.toString();
	}

} //ArgumentsImpl
