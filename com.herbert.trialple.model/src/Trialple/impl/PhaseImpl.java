/**
 */
package Trialple.impl;

import Trialple.Arguments;
import Trialple.IfType;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link Trialple.impl.PhaseImpl#getIf <em>If</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#getAutorepeat <em>Autorepeat</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#isBuffersync <em>Buffersync</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#isCheckuvers <em>Checkuvers</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#getConnect <em>Connect</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#isContinueOnOqErrors <em>Continue On Oq Errors</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#getElgfile <em>Elgfile</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#isIgnorable <em>Ignorable</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#getLogfile <em>Logfile</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link Trialple.impl.PhaseImpl#isUnlockonerror <em>Unlockonerror</em>}</li>
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
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected EList<IfType> if_;

	/**
	 * The default value of the '{@link #getAutorepeat() <em>Autorepeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutorepeat()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOREPEAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutorepeat() <em>Autorepeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutorepeat()
	 * @generated
	 * @ordered
	 */
	protected String autorepeat = AUTOREPEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isBuffersync() <em>Buffersync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuffersync()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUFFERSYNC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBuffersync() <em>Buffersync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuffersync()
	 * @generated
	 * @ordered
	 */
	protected boolean buffersync = BUFFERSYNC_EDEFAULT;

	/**
	 * This is true if the Buffersync attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean buffersyncESet;

	/**
	 * The default value of the '{@link #isCheckuvers() <em>Checkuvers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckuvers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKUVERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckuvers() <em>Checkuvers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckuvers()
	 * @generated
	 * @ordered
	 */
	protected boolean checkuvers = CHECKUVERS_EDEFAULT;

	/**
	 * This is true if the Checkuvers attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean checkuversESet;

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
	 * The default value of the '{@link #isContinueOnOqErrors() <em>Continue On Oq Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinueOnOqErrors()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTINUE_ON_OQ_ERRORS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContinueOnOqErrors() <em>Continue On Oq Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinueOnOqErrors()
	 * @generated
	 * @ordered
	 */
	protected boolean continueOnOqErrors = CONTINUE_ON_OQ_ERRORS_EDEFAULT;

	/**
	 * This is true if the Continue On Oq Errors attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean continueOnOqErrorsESet;

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
	 * The default value of the '{@link #isIgnorable() <em>Ignorable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnorable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnorable() <em>Ignorable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnorable()
	 * @generated
	 * @ordered
	 */
	protected boolean ignorable = IGNORABLE_EDEFAULT;

	/**
	 * This is true if the Ignorable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignorableESet;

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
	 * The default value of the '{@link #isUnlockonerror() <em>Unlockonerror</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnlockonerror()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNLOCKONERROR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnlockonerror() <em>Unlockonerror</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnlockonerror()
	 * @generated
	 * @ordered
	 */
	protected boolean unlockonerror = UNLOCKONERROR_EDEFAULT;

	/**
	 * This is true if the Unlockonerror attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unlockonerrorESet;

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
	public EList<IfType> getIf() {
		if (if_ == null) {
			if_ = new EObjectContainmentEList<IfType>(IfType.class, this, TrialplePackage.PHASE__IF);
		}
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutorepeat() {
		return autorepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutorepeat(String newAutorepeat) {
		String oldAutorepeat = autorepeat;
		autorepeat = newAutorepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__AUTOREPEAT, oldAutorepeat, autorepeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBuffersync() {
		return buffersync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffersync(boolean newBuffersync) {
		boolean oldBuffersync = buffersync;
		buffersync = newBuffersync;
		boolean oldBuffersyncESet = buffersyncESet;
		buffersyncESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__BUFFERSYNC, oldBuffersync, buffersync, !oldBuffersyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBuffersync() {
		boolean oldBuffersync = buffersync;
		boolean oldBuffersyncESet = buffersyncESet;
		buffersync = BUFFERSYNC_EDEFAULT;
		buffersyncESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TrialplePackage.PHASE__BUFFERSYNC, oldBuffersync, BUFFERSYNC_EDEFAULT, oldBuffersyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBuffersync() {
		return buffersyncESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckuvers() {
		return checkuvers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckuvers(boolean newCheckuvers) {
		boolean oldCheckuvers = checkuvers;
		checkuvers = newCheckuvers;
		boolean oldCheckuversESet = checkuversESet;
		checkuversESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__CHECKUVERS, oldCheckuvers, checkuvers, !oldCheckuversESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCheckuvers() {
		boolean oldCheckuvers = checkuvers;
		boolean oldCheckuversESet = checkuversESet;
		checkuvers = CHECKUVERS_EDEFAULT;
		checkuversESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TrialplePackage.PHASE__CHECKUVERS, oldCheckuvers, CHECKUVERS_EDEFAULT, oldCheckuversESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCheckuvers() {
		return checkuversESet;
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
	public boolean isContinueOnOqErrors() {
		return continueOnOqErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinueOnOqErrors(boolean newContinueOnOqErrors) {
		boolean oldContinueOnOqErrors = continueOnOqErrors;
		continueOnOqErrors = newContinueOnOqErrors;
		boolean oldContinueOnOqErrorsESet = continueOnOqErrorsESet;
		continueOnOqErrorsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__CONTINUE_ON_OQ_ERRORS, oldContinueOnOqErrors, continueOnOqErrors, !oldContinueOnOqErrorsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContinueOnOqErrors() {
		boolean oldContinueOnOqErrors = continueOnOqErrors;
		boolean oldContinueOnOqErrorsESet = continueOnOqErrorsESet;
		continueOnOqErrors = CONTINUE_ON_OQ_ERRORS_EDEFAULT;
		continueOnOqErrorsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TrialplePackage.PHASE__CONTINUE_ON_OQ_ERRORS, oldContinueOnOqErrors, CONTINUE_ON_OQ_ERRORS_EDEFAULT, oldContinueOnOqErrorsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContinueOnOqErrors() {
		return continueOnOqErrorsESet;
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
	public boolean isIgnorable() {
		return ignorable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnorable(boolean newIgnorable) {
		boolean oldIgnorable = ignorable;
		ignorable = newIgnorable;
		boolean oldIgnorableESet = ignorableESet;
		ignorableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__IGNORABLE, oldIgnorable, ignorable, !oldIgnorableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIgnorable() {
		boolean oldIgnorable = ignorable;
		boolean oldIgnorableESet = ignorableESet;
		ignorable = IGNORABLE_EDEFAULT;
		ignorableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TrialplePackage.PHASE__IGNORABLE, oldIgnorable, IGNORABLE_EDEFAULT, oldIgnorableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIgnorable() {
		return ignorableESet;
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
	public boolean isUnlockonerror() {
		return unlockonerror;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnlockonerror(boolean newUnlockonerror) {
		boolean oldUnlockonerror = unlockonerror;
		unlockonerror = newUnlockonerror;
		boolean oldUnlockonerrorESet = unlockonerrorESet;
		unlockonerrorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrialplePackage.PHASE__UNLOCKONERROR, oldUnlockonerror, unlockonerror, !oldUnlockonerrorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnlockonerror() {
		boolean oldUnlockonerror = unlockonerror;
		boolean oldUnlockonerrorESet = unlockonerrorESet;
		unlockonerror = UNLOCKONERROR_EDEFAULT;
		unlockonerrorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TrialplePackage.PHASE__UNLOCKONERROR, oldUnlockonerror, UNLOCKONERROR_EDEFAULT, oldUnlockonerrorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnlockonerror() {
		return unlockonerrorESet;
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
			case TrialplePackage.PHASE__IF:
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
			case TrialplePackage.PHASE__OPTIONS:
				return getOptions();
			case TrialplePackage.PHASE__ARGS:
				return getArgs();
			case TrialplePackage.PHASE__ACTION:
				return getAction();
			case TrialplePackage.PHASE__USAGE:
				return getUsage();
			case TrialplePackage.PHASE__IF:
				return getIf();
			case TrialplePackage.PHASE__AUTOREPEAT:
				return getAutorepeat();
			case TrialplePackage.PHASE__BUFFERSYNC:
				return isBuffersync();
			case TrialplePackage.PHASE__CHECKUVERS:
				return isCheckuvers();
			case TrialplePackage.PHASE__CONNECT:
				return getConnect();
			case TrialplePackage.PHASE__CONTINUE_ON_OQ_ERRORS:
				return isContinueOnOqErrors();
			case TrialplePackage.PHASE__ELGFILE:
				return getElgfile();
			case TrialplePackage.PHASE__IGNORABLE:
				return isIgnorable();
			case TrialplePackage.PHASE__LOGFILE:
				return getLogfile();
			case TrialplePackage.PHASE__NAME:
				return getName();
			case TrialplePackage.PHASE__PASSWORD:
				return getPassword();
			case TrialplePackage.PHASE__UNLOCKONERROR:
				return isUnlockonerror();
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
			case TrialplePackage.PHASE__IF:
				getIf().clear();
				getIf().addAll((Collection<? extends IfType>)newValue);
				return;
			case TrialplePackage.PHASE__AUTOREPEAT:
				setAutorepeat((String)newValue);
				return;
			case TrialplePackage.PHASE__BUFFERSYNC:
				setBuffersync((Boolean)newValue);
				return;
			case TrialplePackage.PHASE__CHECKUVERS:
				setCheckuvers((Boolean)newValue);
				return;
			case TrialplePackage.PHASE__CONNECT:
				setConnect((String)newValue);
				return;
			case TrialplePackage.PHASE__CONTINUE_ON_OQ_ERRORS:
				setContinueOnOqErrors((Boolean)newValue);
				return;
			case TrialplePackage.PHASE__ELGFILE:
				setElgfile((String)newValue);
				return;
			case TrialplePackage.PHASE__IGNORABLE:
				setIgnorable((Boolean)newValue);
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
			case TrialplePackage.PHASE__UNLOCKONERROR:
				setUnlockonerror((Boolean)newValue);
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
			case TrialplePackage.PHASE__IF:
				getIf().clear();
				return;
			case TrialplePackage.PHASE__AUTOREPEAT:
				setAutorepeat(AUTOREPEAT_EDEFAULT);
				return;
			case TrialplePackage.PHASE__BUFFERSYNC:
				unsetBuffersync();
				return;
			case TrialplePackage.PHASE__CHECKUVERS:
				unsetCheckuvers();
				return;
			case TrialplePackage.PHASE__CONNECT:
				setConnect(CONNECT_EDEFAULT);
				return;
			case TrialplePackage.PHASE__CONTINUE_ON_OQ_ERRORS:
				unsetContinueOnOqErrors();
				return;
			case TrialplePackage.PHASE__ELGFILE:
				setElgfile(ELGFILE_EDEFAULT);
				return;
			case TrialplePackage.PHASE__IGNORABLE:
				unsetIgnorable();
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
			case TrialplePackage.PHASE__UNLOCKONERROR:
				unsetUnlockonerror();
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
			case TrialplePackage.PHASE__IF:
				return if_ != null && !if_.isEmpty();
			case TrialplePackage.PHASE__AUTOREPEAT:
				return AUTOREPEAT_EDEFAULT == null ? autorepeat != null : !AUTOREPEAT_EDEFAULT.equals(autorepeat);
			case TrialplePackage.PHASE__BUFFERSYNC:
				return isSetBuffersync();
			case TrialplePackage.PHASE__CHECKUVERS:
				return isSetCheckuvers();
			case TrialplePackage.PHASE__CONNECT:
				return CONNECT_EDEFAULT == null ? connect != null : !CONNECT_EDEFAULT.equals(connect);
			case TrialplePackage.PHASE__CONTINUE_ON_OQ_ERRORS:
				return isSetContinueOnOqErrors();
			case TrialplePackage.PHASE__ELGFILE:
				return ELGFILE_EDEFAULT == null ? elgfile != null : !ELGFILE_EDEFAULT.equals(elgfile);
			case TrialplePackage.PHASE__IGNORABLE:
				return isSetIgnorable();
			case TrialplePackage.PHASE__LOGFILE:
				return LOGFILE_EDEFAULT == null ? logfile != null : !LOGFILE_EDEFAULT.equals(logfile);
			case TrialplePackage.PHASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TrialplePackage.PHASE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case TrialplePackage.PHASE__UNLOCKONERROR:
				return isSetUnlockonerror();
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
		result.append(", autorepeat: ");
		result.append(autorepeat);
		result.append(", buffersync: ");
		if (buffersyncESet) result.append(buffersync); else result.append("<unset>");
		result.append(", checkuvers: ");
		if (checkuversESet) result.append(checkuvers); else result.append("<unset>");
		result.append(", connect: ");
		result.append(connect);
		result.append(", continueOnOqErrors: ");
		if (continueOnOqErrorsESet) result.append(continueOnOqErrors); else result.append("<unset>");
		result.append(", elgfile: ");
		result.append(elgfile);
		result.append(", ignorable: ");
		if (ignorableESet) result.append(ignorable); else result.append("<unset>");
		result.append(", logfile: ");
		result.append(logfile);
		result.append(", name: ");
		result.append(name);
		result.append(", password: ");
		result.append(password);
		result.append(", unlockonerror: ");
		if (unlockonerrorESet) result.append(unlockonerror); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PhaseImpl
