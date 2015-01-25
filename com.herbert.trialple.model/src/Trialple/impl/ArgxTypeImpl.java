/**
 */
package Trialple.impl;

import Trialple.ArgxType;
import Trialple.TrialplePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argx Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.ArgxTypeImpl#getArgstring <em>Argstring</em>}</li>
 *   <li>{@link Trialple.impl.ArgxTypeImpl#getSep <em>Sep</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgxTypeImpl extends MinimalEObjectImpl.Container implements ArgxType {
	/**
	 * The cached value of the '{@link #getArgstring() <em>Argstring</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgstring()
	 * @generated
	 * @ordered
	 */
	protected EList<String> argstring;

	/**
	 * The default value of the '{@link #getSep() <em>Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSep()
	 * @generated
	 * @ordered
	 */
	protected static final String SEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSep() <em>Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSep()
	 * @generated
	 * @ordered
	 */
	protected String sep = SEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.ARGX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArgstring() {
		if (argstring == null) {
			argstring = new EDataTypeEList<String>(String.class, this, TrialplePackage.ARGX_TYPE__ARGSTRING);
		}
		return argstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSep() {
		return sep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSep(String newSep) {
		String oldSep = sep;
		sep = newSep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.ARGX_TYPE__SEP, oldSep, sep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrialplePackage.ARGX_TYPE__ARGSTRING:
				return getArgstring();
			case TrialplePackage.ARGX_TYPE__SEP:
				return getSep();
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
			case TrialplePackage.ARGX_TYPE__ARGSTRING:
				getArgstring().clear();
				getArgstring().addAll((Collection<? extends String>)newValue);
				return;
			case TrialplePackage.ARGX_TYPE__SEP:
				setSep((String)newValue);
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
			case TrialplePackage.ARGX_TYPE__ARGSTRING:
				getArgstring().clear();
				return;
			case TrialplePackage.ARGX_TYPE__SEP:
				setSep(SEP_EDEFAULT);
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
			case TrialplePackage.ARGX_TYPE__ARGSTRING:
				return argstring != null && !argstring.isEmpty();
			case TrialplePackage.ARGX_TYPE__SEP:
				return SEP_EDEFAULT == null ? sep != null : !SEP_EDEFAULT.equals(sep);
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
		result.append(" (argstring: ");
		result.append(argstring);
		result.append(", sep: ");
		result.append(sep);
		result.append(')');
		return result.toString();
	}

} //ArgxTypeImpl
