/**
 */
package Trialple.impl;

import Trialple.IfType;
import Trialple.Phase;
import Trialple.Phaselist;
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
 * An implementation of the model object '<em><b>Phaselist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.PhaselistImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link Trialple.impl.PhaselistImpl#getIf <em>If</em>}</li>
 *   <li>{@link Trialple.impl.PhaselistImpl#getSrcid <em>Srcid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhaselistImpl extends MinimalEObjectImpl.Container implements Phaselist {
	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected EList<Phase> phase;

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
	protected PhaselistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.PHASELIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phase> getPhase() {
		if (phase == null) {
			phase = new EObjectContainmentEList<Phase>(Phase.class, this, TrialplePackage.PHASELIST__PHASE);
		}
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfType> getIf() {
		if (if_ == null) {
			if_ = new EObjectContainmentEList<IfType>(IfType.class, this, TrialplePackage.PHASELIST__IF);
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASELIST__SRCID, oldSrcid, srcid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrialplePackage.PHASELIST__PHASE:
				return ((InternalEList<?>)getPhase()).basicRemove(otherEnd, msgs);
			case TrialplePackage.PHASELIST__IF:
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
			case TrialplePackage.PHASELIST__PHASE:
				return getPhase();
			case TrialplePackage.PHASELIST__IF:
				return getIf();
			case TrialplePackage.PHASELIST__SRCID:
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
			case TrialplePackage.PHASELIST__PHASE:
				getPhase().clear();
				getPhase().addAll((Collection<? extends Phase>)newValue);
				return;
			case TrialplePackage.PHASELIST__IF:
				getIf().clear();
				getIf().addAll((Collection<? extends IfType>)newValue);
				return;
			case TrialplePackage.PHASELIST__SRCID:
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
			case TrialplePackage.PHASELIST__PHASE:
				getPhase().clear();
				return;
			case TrialplePackage.PHASELIST__IF:
				getIf().clear();
				return;
			case TrialplePackage.PHASELIST__SRCID:
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
			case TrialplePackage.PHASELIST__PHASE:
				return phase != null && !phase.isEmpty();
			case TrialplePackage.PHASELIST__IF:
				return if_ != null && !if_.isEmpty();
			case TrialplePackage.PHASELIST__SRCID:
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

} //PhaselistImpl
