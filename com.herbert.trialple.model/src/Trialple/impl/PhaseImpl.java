/**
 */
package Trialple.impl;

import Trialple.Arguments;
import Trialple.OptList;
import Trialple.Phase;
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
 * An implementation of the model object '<em><b>Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.PhaseImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#getAction <em>Action</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#getConnect <em>Connect</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#getElgfile <em>Elgfile</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#getLogfile <em>Logfile</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhaseImpl extends MinimalEObjectImpl.Container implements Phase {
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
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected Arguments args;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> usage;

	/**
	 * The default value of the '{@link #getConnect() <em>Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnect() <em>Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect()
	 * @generated
	 * @ordered
	 */
	protected String connect = CONNECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getElgfile() <em>Elgfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElgfile()
	 * @generated
	 * @ordered
	 */
	protected static final String ELGFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElgfile() <em>Elgfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElgfile()
	 * @generated
	 * @ordered
	 */
	protected String elgfile = ELGFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogfile() <em>Logfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogfile()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogfile() <em>Logfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogfile()
	 * @generated
	 * @ordered
	 */
	protected String logfile = LOGFILE_EDEFAULT;

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
	protected PhaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.PHASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arguments getArgs() {
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgs(Arguments newArgs, NotificationChain msgs) {
		Arguments oldArgs = args;
		args = newArgs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__ARGS, oldArgs, newArgs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgs(Arguments newArgs) {
		if (newArgs != args) {
			NotificationChain msgs = null;
			if (args != null)
				msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.PHASE__ARGS, null, msgs);
			if (newArgs != null)
				msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.PHASE__ARGS, null, msgs);
			msgs = basicSetArgs(newArgs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__ARGS, newArgs, newArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUsage() {
		if (usage == null) {
			usage = new EDataTypeEList<String>(String.class, this, TrialplePackage.PHASE__USAGE);
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnect() {
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnect(String newConnect) {
		String oldConnect = connect;
		connect = newConnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__CONNECT, oldConnect, connect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElgfile() {
		return elgfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElgfile(String newElgfile) {
		String oldElgfile = elgfile;
		elgfile = newElgfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__ELGFILE, oldElgfile, elgfile));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__OPTIONS, oldOptions, newOptions);
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
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.PHASE__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrialplePackage.PHASE__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogfile() {
		return logfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogfile(String newLogfile) {
		String oldLogfile = logfile;
		logfile = newLogfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__LOGFILE, oldLogfile, logfile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrialplePackage.PHASE__OPTIONS:
				return basicSetOptions(null, msgs);
			case TrialplePackage.PHASE__ARGS:
				return basicSetArgs(null, msgs);
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
			case TrialplePackage.PHASE__OPTIONS:
				return getOptions();
			case TrialplePackage.PHASE__ARGS:
				return getArgs();
			case TrialplePackage.PHASE__ACTION:
				return getAction();
			case TrialplePackage.PHASE__USAGE:
				return getUsage();
			case TrialplePackage.PHASE__CONNECT:
				return getConnect();
			case TrialplePackage.PHASE__ELGFILE:
				return getElgfile();
			case TrialplePackage.PHASE__LOGFILE:
				return getLogfile();
			case TrialplePackage.PHASE__NAME:
				return getName();
			case TrialplePackage.PHASE__PASSWORD:
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
			case TrialplePackage.PHASE__OPTIONS:
				setOptions((OptList)newValue);
				return;
			case TrialplePackage.PHASE__ARGS:
				setArgs((Arguments)newValue);
				return;
			case TrialplePackage.PHASE__ACTION:
				setAction((String)newValue);
				return;
			case TrialplePackage.PHASE__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends String>)newValue);
				return;
			case TrialplePackage.PHASE__CONNECT:
				setConnect((String)newValue);
				return;
			case TrialplePackage.PHASE__ELGFILE:
				setElgfile((String)newValue);
				return;
			case TrialplePackage.PHASE__LOGFILE:
				setLogfile((String)newValue);
				return;
			case TrialplePackage.PHASE__NAME:
				setName((String)newValue);
				return;
			case TrialplePackage.PHASE__PASSWORD:
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
			case TrialplePackage.PHASE__OPTIONS:
				setOptions((OptList)null);
				return;
			case TrialplePackage.PHASE__ARGS:
				setArgs((Arguments)null);
				return;
			case TrialplePackage.PHASE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case TrialplePackage.PHASE__USAGE:
				getUsage().clear();
				return;
			case TrialplePackage.PHASE__CONNECT:
				setConnect(CONNECT_EDEFAULT);
				return;
			case TrialplePackage.PHASE__ELGFILE:
				setElgfile(ELGFILE_EDEFAULT);
				return;
			case TrialplePackage.PHASE__LOGFILE:
				setLogfile(LOGFILE_EDEFAULT);
				return;
			case TrialplePackage.PHASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrialplePackage.PHASE__PASSWORD:
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
			case TrialplePackage.PHASE__OPTIONS:
				return options != null;
			case TrialplePackage.PHASE__ARGS:
				return args != null;
			case TrialplePackage.PHASE__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case TrialplePackage.PHASE__USAGE:
				return usage != null && !usage.isEmpty();
			case TrialplePackage.PHASE__CONNECT:
				return CONNECT_EDEFAULT == null ? connect != null : !CONNECT_EDEFAULT.equals(connect);
			case TrialplePackage.PHASE__ELGFILE:
				return ELGFILE_EDEFAULT == null ? elgfile != null : !ELGFILE_EDEFAULT.equals(elgfile);
			case TrialplePackage.PHASE__LOGFILE:
				return LOGFILE_EDEFAULT == null ? logfile != null : !LOGFILE_EDEFAULT.equals(logfile);
			case TrialplePackage.PHASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TrialplePackage.PHASE__PASSWORD:
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
		result.append(" (action: ");
		result.append(action);
		result.append(", usage: ");
		result.append(usage);
		result.append(", connect: ");
		result.append(connect);
		result.append(", elgfile: ");
		result.append(elgfile);
		result.append(", logfile: ");
		result.append(logfile);
		result.append(", name: ");
		result.append(name);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //PhaseImpl
