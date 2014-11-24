/**
 */
package Trialple.impl;

import Trialple.IfType;
import Trialple.SubmoduleDef;
import Trialple.SubmoduleDefs;
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
 * An implementation of the model object '<em><b>Submodule Defs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.SubmoduleDefsImpl#getSubmoduledef <em>Submoduledef</em>}</li>
 *   <li>{@link Trialple.impl.SubmoduleDefsImpl#getIf <em>If</em>}</li>
 *   <li>{@link Trialple.impl.SubmoduleDefsImpl#getSrcid <em>Srcid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubmoduleDefsImpl extends MinimalEObjectImpl.Container implements SubmoduleDefs {
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
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected EList<IfType> if_;

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
	protected SubmoduleDefsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.SUBMODULE_DEFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubmoduleDef> getSubmoduledef() {
		if (submoduledef == null) {
			submoduledef = new EObjectContainmentEList<SubmoduleDef>(SubmoduleDef.class, this, TrialplePackage.SUBMODULE_DEFS__SUBMODULEDEF);
		}
		return submoduledef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfType> getIf() {
		if (if_ == null) {
			if_ = new EObjectContainmentEList<IfType>(IfType.class, this, TrialplePackage.SUBMODULE_DEFS__IF);
		}
		return if_;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.SUBMODULE_DEFS__SRCID, oldSrcid, srcid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrialplePackage.SUBMODULE_DEFS__SUBMODULEDEF:
				return ((InternalEList<?>)getSubmoduledef()).basicRemove(otherEnd, msgs);
			case TrialplePackage.SUBMODULE_DEFS__IF:
				return ((InternalEList<?>)getIf()).basicRemove(otherEnd, msgs);
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
			case TrialplePackage.SUBMODULE_DEFS__SUBMODULEDEF:
				return getSubmoduledef();
			case TrialplePackage.SUBMODULE_DEFS__IF:
				return getIf();
			case TrialplePackage.SUBMODULE_DEFS__SRCID:
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
			case TrialplePackage.SUBMODULE_DEFS__SUBMODULEDEF:
				getSubmoduledef().clear();
				getSubmoduledef().addAll((Collection<? extends SubmoduleDef>)newValue);
				return;
			case TrialplePackage.SUBMODULE_DEFS__IF:
				getIf().clear();
				getIf().addAll((Collection<? extends IfType>)newValue);
				return;
			case TrialplePackage.SUBMODULE_DEFS__SRCID:
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
			case TrialplePackage.SUBMODULE_DEFS__SUBMODULEDEF:
				getSubmoduledef().clear();
				return;
			case TrialplePackage.SUBMODULE_DEFS__IF:
				getIf().clear();
				return;
			case TrialplePackage.SUBMODULE_DEFS__SRCID:
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
			case TrialplePackage.SUBMODULE_DEFS__SUBMODULEDEF:
				return submoduledef != null && !submoduledef.isEmpty();
			case TrialplePackage.SUBMODULE_DEFS__IF:
				return if_ != null && !if_.isEmpty();
			case TrialplePackage.SUBMODULE_DEFS__SRCID:
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
		result.append(" (srcid: ");
		result.append(srcid);
		result.append(')');
		return result.toString();
	}

} //SubmoduleDefsImpl
