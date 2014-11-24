/**
 */
package Trialple.impl;

import Trialple.Module;
import Trialple.ModuleType;
import Trialple.OptList;
import Trialple.Phaselist;
import Trialple.Precedences;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.ModuleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getPostevent <em>Postevent</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getRevokemodule <em>Revokemodule</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getPrecedences <em>Precedences</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getPhaselist <em>Phaselist</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getCheckmode <em>Checkmode</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getErrignorable <em>Errignorable</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getInterruptable <em>Interruptable</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getReselect <em>Reselect</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getRevokeautonext <em>Revokeautonext</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link Trialple.impl.ModuleImpl#getUniqueexec <em>Uniqueexec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<String> description;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected OptList options;

	/**
	 * The default value of the '{@link #getPostevent() <em>Postevent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostevent()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTEVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostevent() <em>Postevent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostevent()
	 * @generated
	 * @ordered
	 */
	protected String postevent = POSTEVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevokemodule() <em>Revokemodule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevokemodule()
	 * @generated
	 * @ordered
	 */
	protected static final String REVOKEMODULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevokemodule() <em>Revokemodule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevokemodule()
	 * @generated
	 * @ordered
	 */
	protected String revokemodule = REVOKEMODULE_EDEFAULT;

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
	 * The cached value of the '{@link #getPrecedences() <em>Precedences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedences()
	 * @generated
	 * @ordered
	 */
	protected EList<Precedences> precedences;

	/**
	 * The cached value of the '{@link #getPhaselist() <em>Phaselist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaselist()
	 * @generated
	 * @ordered
	 */
	protected Phaselist phaselist;

	/**
	 * The default value of the '{@link #getCheckmode() <em>Checkmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckmode()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECKMODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckmode() <em>Checkmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckmode()
	 * @generated
	 * @ordered
	 */
	protected String checkmode = CHECKMODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrignorable() <em>Errignorable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrignorable()
	 * @generated
	 * @ordered
	 */
	protected static final String ERRIGNORABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrignorable() <em>Errignorable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrignorable()
	 * @generated
	 * @ordered
	 */
	protected String errignorable = ERRIGNORABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterruptable() <em>Interruptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptable()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERRUPTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterruptable() <em>Interruptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptable()
	 * @generated
	 * @ordered
	 */
	protected String interruptable = INTERRUPTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final String MANDATORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected String mandatory = MANDATORY_EDEFAULT;

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
	 * The default value of the '{@link #getReselect() <em>Reselect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReselect()
	 * @generated
	 * @ordered
	 */
	protected static final String RESELECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReselect() <em>Reselect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReselect()
	 * @generated
	 * @ordered
	 */
	protected String reselect = RESELECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevokeautonext() <em>Revokeautonext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevokeautonext()
	 * @generated
	 * @ordered
	 */
	protected static final String REVOKEAUTONEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevokeautonext() <em>Revokeautonext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevokeautonext()
	 * @generated
	 * @ordered
	 */
	protected String revokeautonext = REVOKEAUTONEXT_EDEFAULT;

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
	 * The default value of the '{@link #getUniqueexec() <em>Uniqueexec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueexec()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUEEXEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueexec() <em>Uniqueexec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueexec()
	 * @generated
	 * @ordered
	 */
	protected String uniqueexec = UNIQUEEXEC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phaselist getPhaselist() {
		return phaselist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhaselist(Phaselist newPhaselist, NotificationChain msgs) {
		Phaselist oldPhaselist = phaselist;
		phaselist = newPhaselist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__PHASELIST, oldPhaselist, newPhaselist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaselist(Phaselist newPhaselist) {
		if (newPhaselist != phaselist) {
			NotificationChain msgs = null;
			if (phaselist != null)
				msgs = ((InternalEObject)phaselist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.MODULE__PHASELIST, null, msgs);
			if (newPhaselist != null)
				msgs = ((InternalEObject)newPhaselist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.MODULE__PHASELIST, null, msgs);
			msgs = basicSetPhaselist(newPhaselist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__PHASELIST, newPhaselist, newPhaselist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDescription() {
		if (description == null) {
			description = new EDataTypeEList<String>(String.class, this, TrialplePackage.MODULE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptList getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(OptList newOptions, NotificationChain msgs) {
		OptList oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(OptList newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.MODULE__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.MODULE__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostevent() {
		return postevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostevent(String newPostevent) {
		String oldPostevent = postevent;
		postevent = newPostevent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__POSTEVENT, oldPostevent, postevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevokemodule() {
		return revokemodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevokemodule(String newRevokemodule) {
		String oldRevokemodule = revokemodule;
		revokemodule = newRevokemodule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__REVOKEMODULE, oldRevokemodule, revokemodule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Precedences> getPrecedences() {
		if (precedences == null) {
			precedences = new EObjectContainmentEList<Precedences>(Precedences.class, this, TrialplePackage.MODULE__PRECEDENCES);
		}
		return precedences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckmode() {
		return checkmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckmode(String newCheckmode) {
		String oldCheckmode = checkmode;
		checkmode = newCheckmode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__CHECKMODE, oldCheckmode, checkmode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevokeautonext() {
		return revokeautonext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevokeautonext(String newRevokeautonext) {
		String oldRevokeautonext = revokeautonext;
		revokeautonext = newRevokeautonext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__REVOKEAUTONEXT, oldRevokeautonext, revokeautonext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrignorable() {
		return errignorable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrignorable(String newErrignorable) {
		String oldErrignorable = errignorable;
		errignorable = newErrignorable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__ERRIGNORABLE, oldErrignorable, errignorable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterruptable() {
		return interruptable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterruptable(String newInterruptable) {
		String oldInterruptable = interruptable;
		interruptable = newInterruptable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__INTERRUPTABLE, oldInterruptable, interruptable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReselect() {
		return reselect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReselect(String newReselect) {
		String oldReselect = reselect;
		reselect = newReselect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__RESELECT, oldReselect, reselect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueexec() {
		return uniqueexec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueexec(String newUniqueexec) {
		String oldUniqueexec = uniqueexec;
		uniqueexec = newUniqueexec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__UNIQUEEXEC, oldUniqueexec, uniqueexec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(String newMandatory) {
		String oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__MANDATORY, oldMandatory, mandatory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.MODULE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TrialplePackage.MODULE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case TrialplePackage.MODULE__OPTIONS:
				return basicSetOptions(null, msgs);
			case TrialplePackage.MODULE__PRECEDENCES:
				return ((InternalEList<?>)getPrecedences()).basicRemove(otherEnd, msgs);
			case TrialplePackage.MODULE__PHASELIST:
				return basicSetPhaselist(null, msgs);
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
			case TrialplePackage.MODULE__DESCRIPTION:
				return getDescription();
			case TrialplePackage.MODULE__OPTIONS:
				return getOptions();
			case TrialplePackage.MODULE__POSTEVENT:
				return getPostevent();
			case TrialplePackage.MODULE__REVOKEMODULE:
				return getRevokemodule();
			case TrialplePackage.MODULE__PASSWORD:
				return getPassword();
			case TrialplePackage.MODULE__PRECEDENCES:
				return getPrecedences();
			case TrialplePackage.MODULE__PHASELIST:
				return getPhaselist();
			case TrialplePackage.MODULE__CHECKMODE:
				return getCheckmode();
			case TrialplePackage.MODULE__ERRIGNORABLE:
				return getErrignorable();
			case TrialplePackage.MODULE__INTERRUPTABLE:
				return getInterruptable();
			case TrialplePackage.MODULE__MANDATORY:
				return getMandatory();
			case TrialplePackage.MODULE__NAME:
				return getName();
			case TrialplePackage.MODULE__RESELECT:
				return getReselect();
			case TrialplePackage.MODULE__REVOKEAUTONEXT:
				return getRevokeautonext();
			case TrialplePackage.MODULE__TYPE:
				return getType();
			case TrialplePackage.MODULE__UNIQUEEXEC:
				return getUniqueexec();
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
			case TrialplePackage.MODULE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends String>)newValue);
				return;
			case TrialplePackage.MODULE__OPTIONS:
				setOptions((OptList)newValue);
				return;
			case TrialplePackage.MODULE__POSTEVENT:
				setPostevent((String)newValue);
				return;
			case TrialplePackage.MODULE__REVOKEMODULE:
				setRevokemodule((String)newValue);
				return;
			case TrialplePackage.MODULE__PASSWORD:
				setPassword((String)newValue);
				return;
			case TrialplePackage.MODULE__PRECEDENCES:
				getPrecedences().clear();
				getPrecedences().addAll((Collection<? extends Precedences>)newValue);
				return;
			case TrialplePackage.MODULE__PHASELIST:
				setPhaselist((Phaselist)newValue);
				return;
			case TrialplePackage.MODULE__CHECKMODE:
				setCheckmode((String)newValue);
				return;
			case TrialplePackage.MODULE__ERRIGNORABLE:
				setErrignorable((String)newValue);
				return;
			case TrialplePackage.MODULE__INTERRUPTABLE:
				setInterruptable((String)newValue);
				return;
			case TrialplePackage.MODULE__MANDATORY:
				setMandatory((String)newValue);
				return;
			case TrialplePackage.MODULE__NAME:
				setName((String)newValue);
				return;
			case TrialplePackage.MODULE__RESELECT:
				setReselect((String)newValue);
				return;
			case TrialplePackage.MODULE__REVOKEAUTONEXT:
				setRevokeautonext((String)newValue);
				return;
			case TrialplePackage.MODULE__TYPE:
				setType((ModuleType)newValue);
				return;
			case TrialplePackage.MODULE__UNIQUEEXEC:
				setUniqueexec((String)newValue);
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
			case TrialplePackage.MODULE__DESCRIPTION:
				getDescription().clear();
				return;
			case TrialplePackage.MODULE__OPTIONS:
				setOptions((OptList)null);
				return;
			case TrialplePackage.MODULE__POSTEVENT:
				setPostevent(POSTEVENT_EDEFAULT);
				return;
			case TrialplePackage.MODULE__REVOKEMODULE:
				setRevokemodule(REVOKEMODULE_EDEFAULT);
				return;
			case TrialplePackage.MODULE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case TrialplePackage.MODULE__PRECEDENCES:
				getPrecedences().clear();
				return;
			case TrialplePackage.MODULE__PHASELIST:
				setPhaselist((Phaselist)null);
				return;
			case TrialplePackage.MODULE__CHECKMODE:
				setCheckmode(CHECKMODE_EDEFAULT);
				return;
			case TrialplePackage.MODULE__ERRIGNORABLE:
				setErrignorable(ERRIGNORABLE_EDEFAULT);
				return;
			case TrialplePackage.MODULE__INTERRUPTABLE:
				setInterruptable(INTERRUPTABLE_EDEFAULT);
				return;
			case TrialplePackage.MODULE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case TrialplePackage.MODULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrialplePackage.MODULE__RESELECT:
				setReselect(RESELECT_EDEFAULT);
				return;
			case TrialplePackage.MODULE__REVOKEAUTONEXT:
				setRevokeautonext(REVOKEAUTONEXT_EDEFAULT);
				return;
			case TrialplePackage.MODULE__TYPE:
				unsetType();
				return;
			case TrialplePackage.MODULE__UNIQUEEXEC:
				setUniqueexec(UNIQUEEXEC_EDEFAULT);
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
			case TrialplePackage.MODULE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case TrialplePackage.MODULE__OPTIONS:
				return options != null;
			case TrialplePackage.MODULE__POSTEVENT:
				return POSTEVENT_EDEFAULT == null ? postevent != null : !POSTEVENT_EDEFAULT.equals(postevent);
			case TrialplePackage.MODULE__REVOKEMODULE:
				return REVOKEMODULE_EDEFAULT == null ? revokemodule != null : !REVOKEMODULE_EDEFAULT.equals(revokemodule);
			case TrialplePackage.MODULE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case TrialplePackage.MODULE__PRECEDENCES:
				return precedences != null && !precedences.isEmpty();
			case TrialplePackage.MODULE__PHASELIST:
				return phaselist != null;
			case TrialplePackage.MODULE__CHECKMODE:
				return CHECKMODE_EDEFAULT == null ? checkmode != null : !CHECKMODE_EDEFAULT.equals(checkmode);
			case TrialplePackage.MODULE__ERRIGNORABLE:
				return ERRIGNORABLE_EDEFAULT == null ? errignorable != null : !ERRIGNORABLE_EDEFAULT.equals(errignorable);
			case TrialplePackage.MODULE__INTERRUPTABLE:
				return INTERRUPTABLE_EDEFAULT == null ? interruptable != null : !INTERRUPTABLE_EDEFAULT.equals(interruptable);
			case TrialplePackage.MODULE__MANDATORY:
				return MANDATORY_EDEFAULT == null ? mandatory != null : !MANDATORY_EDEFAULT.equals(mandatory);
			case TrialplePackage.MODULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TrialplePackage.MODULE__RESELECT:
				return RESELECT_EDEFAULT == null ? reselect != null : !RESELECT_EDEFAULT.equals(reselect);
			case TrialplePackage.MODULE__REVOKEAUTONEXT:
				return REVOKEAUTONEXT_EDEFAULT == null ? revokeautonext != null : !REVOKEAUTONEXT_EDEFAULT.equals(revokeautonext);
			case TrialplePackage.MODULE__TYPE:
				return isSetType();
			case TrialplePackage.MODULE__UNIQUEEXEC:
				return UNIQUEEXEC_EDEFAULT == null ? uniqueexec != null : !UNIQUEEXEC_EDEFAULT.equals(uniqueexec);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", postevent: ");
		result.append(postevent);
		result.append(", revokemodule: ");
		result.append(revokemodule);
		result.append(", password: ");
		result.append(password);
		result.append(", checkmode: ");
		result.append(checkmode);
		result.append(", errignorable: ");
		result.append(errignorable);
		result.append(", interruptable: ");
		result.append(interruptable);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(", name: ");
		result.append(name);
		result.append(", reselect: ");
		result.append(reselect);
		result.append(", revokeautonext: ");
		result.append(revokeautonext);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", uniqueexec: ");
		result.append(uniqueexec);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
