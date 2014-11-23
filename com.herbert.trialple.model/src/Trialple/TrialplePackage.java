/**
 */
package Trialple;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Trialple.TrialpleFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface TrialplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Trialple";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/com.herbert.trialple.model/model/trialple.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Trialple";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrialplePackage eINSTANCE = Trialple.impl.TrialplePackageImpl.init();

	/**
	 * The meta object id for the '{@link Trialple.impl.ArgumentsImpl <em>Arguments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.ArgumentsImpl
	 * @see Trialple.impl.TrialplePackageImpl#getArguments()
	 * @generated
	 */
	int ARGUMENTS = 0;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS__ARG = 0;

	/**
	 * The number of structural features of the '<em>Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.DocumentRootImpl
	 * @see Trialple.impl.TrialplePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Execution Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXECUTION_CONTROL = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.ExecutionControlImpl <em>Execution Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.ExecutionControlImpl
	 * @see Trialple.impl.TrialplePackageImpl#getExecutionControl()
	 * @generated
	 */
	int EXECUTION_CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTROL__MODULES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTROL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Srcid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTROL__SRCID = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTROL__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Execution Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTROL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Execution Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.IfTypeImpl <em>If Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.IfTypeImpl
	 * @see Trialple.impl.TrialplePackageImpl#getIfType()
	 * @generated
	 */
	int IF_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TYPE__PHASE = 0;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TYPE__TEST = 1;

	/**
	 * The number of structural features of the '<em>If Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>If Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.ModuleImpl
	 * @see Trialple.impl.TrialplePackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Postevent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__POSTEVENT = 2;

	/**
	 * The feature id for the '<em><b>Revokemodule</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__REVOKEMODULE = 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PASSWORD = 4;

	/**
	 * The feature id for the '<em><b>Precedences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PRECEDENCES = 5;

	/**
	 * The feature id for the '<em><b>Phaselist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PHASELIST = 6;

	/**
	 * The feature id for the '<em><b>Checkmode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CHECKMODE = 7;

	/**
	 * The feature id for the '<em><b>Errignorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ERRIGNORABLE = 8;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__INTERRUPTABLE = 9;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MANDATORY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = 11;

	/**
	 * The feature id for the '<em><b>Reselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__RESELECT = 12;

	/**
	 * The feature id for the '<em><b>Revokeautonext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__REVOKEAUTONEXT = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TYPE = 14;

	/**
	 * The feature id for the '<em><b>Uniqueexec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__UNIQUEEXEC = 15;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.ModulesImpl <em>Modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.ModulesImpl
	 * @see Trialple.impl.TrialplePackageImpl#getModules()
	 * @generated
	 */
	int MODULES = 5;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__MODULE = 0;

	/**
	 * The number of structural features of the '<em>Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.OptionImpl
	 * @see Trialple.impl.TrialplePackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.OptListImpl <em>Opt List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.OptListImpl
	 * @see Trialple.impl.TrialplePackageImpl#getOptList()
	 * @generated
	 */
	int OPT_LIST = 7;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_LIST__OPTION = 0;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_LIST__OR = 1;

	/**
	 * The number of structural features of the '<em>Opt List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Opt List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.OrImpl
	 * @see Trialple.impl.TrialplePackageImpl#getOr()
	 * @generated
	 */
	int OR = 8;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OPTION = 0;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.PhaseImpl <em>Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.PhaseImpl
	 * @see Trialple.impl.TrialplePackageImpl#getPhase()
	 * @generated
	 */
	int PHASE = 9;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__OPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__ARGS = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__USAGE = 3;

	/**
	 * The feature id for the '<em><b>Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__CONNECT = 4;

	/**
	 * The feature id for the '<em><b>Elgfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__ELGFILE = 5;

	/**
	 * The feature id for the '<em><b>Logfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__LOGFILE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__PASSWORD = 8;

	/**
	 * The number of structural features of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.PhaselistImpl <em>Phaselist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.PhaselistImpl
	 * @see Trialple.impl.TrialplePackageImpl#getPhaselist()
	 * @generated
	 */
	int PHASELIST = 10;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASELIST__PHASE = 0;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASELIST__IF = 1;

	/**
	 * The feature id for the '<em><b>Srcid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASELIST__SRCID = 2;

	/**
	 * The number of structural features of the '<em>Phaselist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASELIST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Phaselist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASELIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.PrecedencesImpl <em>Precedences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.PrecedencesImpl
	 * @see Trialple.impl.TrialplePackageImpl#getPrecedences()
	 * @generated
	 */
	int PRECEDENCES = 11;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCES__PRECEDENCE = 0;

	/**
	 * The number of structural features of the '<em>Precedences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Precedences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.ModuleType <em>Module Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.ModuleType
	 * @see Trialple.impl.TrialplePackageImpl#getModuleType()
	 * @generated
	 */
	int MODULE_TYPE = 12;

	/**
	 * The meta object id for the '<em>Module Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.ModuleType
	 * @see Trialple.impl.TrialplePackageImpl#getModuleTypeObject()
	 * @generated
	 */
	int MODULE_TYPE_OBJECT = 13;


	/**
	 * Returns the meta object for class '{@link Trialple.Arguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arguments</em>'.
	 * @see Trialple.Arguments
	 * @generated
	 */
	EClass getArguments();

	/**
	 * Returns the meta object for the attribute list '{@link Trialple.Arguments#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arg</em>'.
	 * @see Trialple.Arguments#getArg()
	 * @see #getArguments()
	 * @generated
	 */
	EAttribute getArguments_Arg();

	/**
	 * Returns the meta object for class '{@link Trialple.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see Trialple.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link Trialple.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Trialple.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link Trialple.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see Trialple.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link Trialple.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see Trialple.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link Trialple.DocumentRoot#getExecutionControl <em>Execution Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Control</em>'.
	 * @see Trialple.DocumentRoot#getExecutionControl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExecutionControl();

	/**
	 * Returns the meta object for class '{@link Trialple.ExecutionControl <em>Execution Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Control</em>'.
	 * @see Trialple.ExecutionControl
	 * @generated
	 */
	EClass getExecutionControl();

	/**
	 * Returns the meta object for the containment reference '{@link Trialple.ExecutionControl#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modules</em>'.
	 * @see Trialple.ExecutionControl#getModules()
	 * @see #getExecutionControl()
	 * @generated
	 */
	EReference getExecutionControl_Modules();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.ExecutionControl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Trialple.ExecutionControl#getName()
	 * @see #getExecutionControl()
	 * @generated
	 */
	EAttribute getExecutionControl_Name();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.ExecutionControl#getSrcid <em>Srcid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srcid</em>'.
	 * @see Trialple.ExecutionControl#getSrcid()
	 * @see #getExecutionControl()
	 * @generated
	 */
	EAttribute getExecutionControl_Srcid();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.ExecutionControl#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see Trialple.ExecutionControl#getVersion()
	 * @see #getExecutionControl()
	 * @generated
	 */
	EAttribute getExecutionControl_Version();

	/**
	 * Returns the meta object for class '{@link Trialple.IfType <em>If Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Type</em>'.
	 * @see Trialple.IfType
	 * @generated
	 */
	EClass getIfType();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.IfType#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phase</em>'.
	 * @see Trialple.IfType#getPhase()
	 * @see #getIfType()
	 * @generated
	 */
	EReference getIfType_Phase();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.IfType#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see Trialple.IfType#getTest()
	 * @see #getIfType()
	 * @generated
	 */
	EAttribute getIfType_Test();

	/**
	 * Returns the meta object for class '{@link Trialple.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see Trialple.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference '{@link Trialple.Module#getPhaselist <em>Phaselist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phaselist</em>'.
	 * @see Trialple.Module#getPhaselist()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Phaselist();

	/**
	 * Returns the meta object for the attribute list '{@link Trialple.Module#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description</em>'.
	 * @see Trialple.Module#getDescription()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Description();

	/**
	 * Returns the meta object for the containment reference '{@link Trialple.Module#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see Trialple.Module#getOptions()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Options();

	/**
	 * Returns the meta object for the attribute list '{@link Trialple.Module#getPostevent <em>Postevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Postevent</em>'.
	 * @see Trialple.Module#getPostevent()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Postevent();

	/**
	 * Returns the meta object for the attribute list '{@link Trialple.Module#getRevokemodule <em>Revokemodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Revokemodule</em>'.
	 * @see Trialple.Module#getRevokemodule()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Revokemodule();

	/**
	 * Returns the meta object for the attribute list '{@link Trialple.Module#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Password</em>'.
	 * @see Trialple.Module#getPassword()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Password();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.Module#getPrecedences <em>Precedences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precedences</em>'.
	 * @see Trialple.Module#getPrecedences()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Precedences();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Module#getCheckmode <em>Checkmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checkmode</em>'.
	 * @see Trialple.Module#getCheckmode()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Checkmode();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Module#getRevokeautonext <em>Revokeautonext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revokeautonext</em>'.
	 * @see Trialple.Module#getRevokeautonext()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Revokeautonext();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Module#getErrignorable <em>Errignorable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Errignorable</em>'.
	 * @see Trialple.Module#getErrignorable()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Errignorable();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Module#getInterruptable <em>Interruptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interruptable</em>'.
	 * @see Trialple.Module#getInterruptable()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Interruptable();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Module#getReselect <em>Reselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reselect</em>'.
	 * @see Trialple.Module#getReselect()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Reselect();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Module#getUniqueexec <em>Uniqueexec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uniqueexec</em>'.
	 * @see Trialple.Module#getUniqueexec()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Uniqueexec();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Module#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see Trialple.Module#getMandatory()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Trialple.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Module#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Trialple.Module#getType()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Type();

	/**
	 * Returns the meta object for class '{@link Trialple.Modules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modules</em>'.
	 * @see Trialple.Modules
	 * @generated
	 */
	EClass getModules();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.Modules#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module</em>'.
	 * @see Trialple.Modules#getModule()
	 * @see #getModules()
	 * @generated
	 */
	EReference getModules_Module();

	/**
	 * Returns the meta object for class '{@link Trialple.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see Trialple.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Trialple.Option#getName()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Name();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Trialple.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value();

	/**
	 * Returns the meta object for class '{@link Trialple.OptList <em>Opt List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opt List</em>'.
	 * @see Trialple.OptList
	 * @generated
	 */
	EClass getOptList();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.OptList#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see Trialple.OptList#getOption()
	 * @see #getOptList()
	 * @generated
	 */
	EReference getOptList_Option();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.OptList#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see Trialple.OptList#getOr()
	 * @see #getOptList()
	 * @generated
	 */
	EReference getOptList_Or();

	/**
	 * Returns the meta object for class '{@link Trialple.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see Trialple.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.Or#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see Trialple.Or#getOption()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Option();

	/**
	 * Returns the meta object for class '{@link Trialple.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase</em>'.
	 * @see Trialple.Phase
	 * @generated
	 */
	EClass getPhase();

	/**
	 * Returns the meta object for the containment reference '{@link Trialple.Phase#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Args</em>'.
	 * @see Trialple.Phase#getArgs()
	 * @see #getPhase()
	 * @generated
	 */
	EReference getPhase_Args();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Phase#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see Trialple.Phase#getAction()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Action();

	/**
	 * Returns the meta object for the attribute list '{@link Trialple.Phase#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usage</em>'.
	 * @see Trialple.Phase#getUsage()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Usage();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Phase#getConnect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect</em>'.
	 * @see Trialple.Phase#getConnect()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Connect();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Phase#getElgfile <em>Elgfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elgfile</em>'.
	 * @see Trialple.Phase#getElgfile()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Elgfile();

	/**
	 * Returns the meta object for the containment reference '{@link Trialple.Phase#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see Trialple.Phase#getOptions()
	 * @see #getPhase()
	 * @generated
	 */
	EReference getPhase_Options();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Phase#getLogfile <em>Logfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logfile</em>'.
	 * @see Trialple.Phase#getLogfile()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Logfile();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Phase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Trialple.Phase#getName()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Name();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Phase#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Trialple.Phase#getPassword()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Password();

	/**
	 * Returns the meta object for class '{@link Trialple.Phaselist <em>Phaselist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phaselist</em>'.
	 * @see Trialple.Phaselist
	 * @generated
	 */
	EClass getPhaselist();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.Phaselist#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phase</em>'.
	 * @see Trialple.Phaselist#getPhase()
	 * @see #getPhaselist()
	 * @generated
	 */
	EReference getPhaselist_Phase();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.Phaselist#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see Trialple.Phaselist#getIf()
	 * @see #getPhaselist()
	 * @generated
	 */
	EReference getPhaselist_If();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Phaselist#getSrcid <em>Srcid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srcid</em>'.
	 * @see Trialple.Phaselist#getSrcid()
	 * @see #getPhaselist()
	 * @generated
	 */
	EAttribute getPhaselist_Srcid();

	/**
	 * Returns the meta object for class '{@link Trialple.Precedences <em>Precedences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedences</em>'.
	 * @see Trialple.Precedences
	 * @generated
	 */
	EClass getPrecedences();

	/**
	 * Returns the meta object for the attribute list '{@link Trialple.Precedences#getPrecedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Precedence</em>'.
	 * @see Trialple.Precedences#getPrecedence()
	 * @see #getPrecedences()
	 * @generated
	 */
	EAttribute getPrecedences_Precedence();

	/**
	 * Returns the meta object for enum '{@link Trialple.ModuleType <em>Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Type</em>'.
	 * @see Trialple.ModuleType
	 * @generated
	 */
	EEnum getModuleType();

	/**
	 * Returns the meta object for data type '{@link Trialple.ModuleType <em>Module Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Module Type Object</em>'.
	 * @see Trialple.ModuleType
	 * @model instanceClass="Trialple.ModuleType"
	 *        extendedMetaData="name='ModuleType:Object' baseType='ModuleType'"
	 * @generated
	 */
	EDataType getModuleTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TrialpleFactory getTrialpleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Trialple.impl.ArgumentsImpl <em>Arguments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.ArgumentsImpl
		 * @see Trialple.impl.TrialplePackageImpl#getArguments()
		 * @generated
		 */
		EClass ARGUMENTS = eINSTANCE.getArguments();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENTS__ARG = eINSTANCE.getArguments_Arg();

		/**
		 * The meta object literal for the '{@link Trialple.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.DocumentRootImpl
		 * @see Trialple.impl.TrialplePackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Execution Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXECUTION_CONTROL = eINSTANCE.getDocumentRoot_ExecutionControl();

		/**
		 * The meta object literal for the '{@link Trialple.impl.ExecutionControlImpl <em>Execution Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.ExecutionControlImpl
		 * @see Trialple.impl.TrialplePackageImpl#getExecutionControl()
		 * @generated
		 */
		EClass EXECUTION_CONTROL = eINSTANCE.getExecutionControl();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTROL__MODULES = eINSTANCE.getExecutionControl_Modules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_CONTROL__NAME = eINSTANCE.getExecutionControl_Name();

		/**
		 * The meta object literal for the '<em><b>Srcid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_CONTROL__SRCID = eINSTANCE.getExecutionControl_Srcid();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_CONTROL__VERSION = eINSTANCE.getExecutionControl_Version();

		/**
		 * The meta object literal for the '{@link Trialple.impl.IfTypeImpl <em>If Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.IfTypeImpl
		 * @see Trialple.impl.TrialplePackageImpl#getIfType()
		 * @generated
		 */
		EClass IF_TYPE = eINSTANCE.getIfType();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_TYPE__PHASE = eINSTANCE.getIfType_Phase();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_TYPE__TEST = eINSTANCE.getIfType_Test();

		/**
		 * The meta object literal for the '{@link Trialple.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.ModuleImpl
		 * @see Trialple.impl.TrialplePackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Phaselist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PHASELIST = eINSTANCE.getModule_Phaselist();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__DESCRIPTION = eINSTANCE.getModule_Description();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OPTIONS = eINSTANCE.getModule_Options();

		/**
		 * The meta object literal for the '<em><b>Postevent</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__POSTEVENT = eINSTANCE.getModule_Postevent();

		/**
		 * The meta object literal for the '<em><b>Revokemodule</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__REVOKEMODULE = eINSTANCE.getModule_Revokemodule();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__PASSWORD = eINSTANCE.getModule_Password();

		/**
		 * The meta object literal for the '<em><b>Precedences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PRECEDENCES = eINSTANCE.getModule_Precedences();

		/**
		 * The meta object literal for the '<em><b>Checkmode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__CHECKMODE = eINSTANCE.getModule_Checkmode();

		/**
		 * The meta object literal for the '<em><b>Revokeautonext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__REVOKEAUTONEXT = eINSTANCE.getModule_Revokeautonext();

		/**
		 * The meta object literal for the '<em><b>Errignorable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__ERRIGNORABLE = eINSTANCE.getModule_Errignorable();

		/**
		 * The meta object literal for the '<em><b>Interruptable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__INTERRUPTABLE = eINSTANCE.getModule_Interruptable();

		/**
		 * The meta object literal for the '<em><b>Reselect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__RESELECT = eINSTANCE.getModule_Reselect();

		/**
		 * The meta object literal for the '<em><b>Uniqueexec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__UNIQUEEXEC = eINSTANCE.getModule_Uniqueexec();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__MANDATORY = eINSTANCE.getModule_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__TYPE = eINSTANCE.getModule_Type();

		/**
		 * The meta object literal for the '{@link Trialple.impl.ModulesImpl <em>Modules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.ModulesImpl
		 * @see Trialple.impl.TrialplePackageImpl#getModules()
		 * @generated
		 */
		EClass MODULES = eINSTANCE.getModules();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULES__MODULE = eINSTANCE.getModules_Module();

		/**
		 * The meta object literal for the '{@link Trialple.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.OptionImpl
		 * @see Trialple.impl.TrialplePackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '{@link Trialple.impl.OptListImpl <em>Opt List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.OptListImpl
		 * @see Trialple.impl.TrialplePackageImpl#getOptList()
		 * @generated
		 */
		EClass OPT_LIST = eINSTANCE.getOptList();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPT_LIST__OPTION = eINSTANCE.getOptList_Option();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPT_LIST__OR = eINSTANCE.getOptList_Or();

		/**
		 * The meta object literal for the '{@link Trialple.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.OrImpl
		 * @see Trialple.impl.TrialplePackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__OPTION = eINSTANCE.getOr_Option();

		/**
		 * The meta object literal for the '{@link Trialple.impl.PhaseImpl <em>Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.PhaseImpl
		 * @see Trialple.impl.TrialplePackageImpl#getPhase()
		 * @generated
		 */
		EClass PHASE = eINSTANCE.getPhase();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE__ARGS = eINSTANCE.getPhase_Args();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__ACTION = eINSTANCE.getPhase_Action();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__USAGE = eINSTANCE.getPhase_Usage();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__CONNECT = eINSTANCE.getPhase_Connect();

		/**
		 * The meta object literal for the '<em><b>Elgfile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__ELGFILE = eINSTANCE.getPhase_Elgfile();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE__OPTIONS = eINSTANCE.getPhase_Options();

		/**
		 * The meta object literal for the '<em><b>Logfile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__LOGFILE = eINSTANCE.getPhase_Logfile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__NAME = eINSTANCE.getPhase_Name();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__PASSWORD = eINSTANCE.getPhase_Password();

		/**
		 * The meta object literal for the '{@link Trialple.impl.PhaselistImpl <em>Phaselist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.PhaselistImpl
		 * @see Trialple.impl.TrialplePackageImpl#getPhaselist()
		 * @generated
		 */
		EClass PHASELIST = eINSTANCE.getPhaselist();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASELIST__PHASE = eINSTANCE.getPhaselist_Phase();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASELIST__IF = eINSTANCE.getPhaselist_If();

		/**
		 * The meta object literal for the '<em><b>Srcid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASELIST__SRCID = eINSTANCE.getPhaselist_Srcid();

		/**
		 * The meta object literal for the '{@link Trialple.impl.PrecedencesImpl <em>Precedences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.PrecedencesImpl
		 * @see Trialple.impl.TrialplePackageImpl#getPrecedences()
		 * @generated
		 */
		EClass PRECEDENCES = eINSTANCE.getPrecedences();

		/**
		 * The meta object literal for the '<em><b>Precedence</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDENCES__PRECEDENCE = eINSTANCE.getPrecedences_Precedence();

		/**
		 * The meta object literal for the '{@link Trialple.ModuleType <em>Module Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.ModuleType
		 * @see Trialple.impl.TrialplePackageImpl#getModuleType()
		 * @generated
		 */
		EEnum MODULE_TYPE = eINSTANCE.getModuleType();

		/**
		 * The meta object literal for the '<em>Module Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.ModuleType
		 * @see Trialple.impl.TrialplePackageImpl#getModuleTypeObject()
		 * @generated
		 */
		EDataType MODULE_TYPE_OBJECT = eINSTANCE.getModuleTypeObject();

	}

} //TrialplePackage
