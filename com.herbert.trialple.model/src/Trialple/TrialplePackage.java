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
	 * The meta object id for the '{@link Trialple.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.AndImpl
	 * @see Trialple.impl.TrialplePackageImpl#getAnd()
	 * @generated
	 */
	int AND = 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OPTION = 0;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OR = 1;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__NOT = 2;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.ArgumentsImpl <em>Arguments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.ArgumentsImpl
	 * @see Trialple.impl.TrialplePackageImpl#getArguments()
	 * @generated
	 */
	int ARGUMENTS = 1;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS__ARG = 0;

	/**
	 * The feature id for the '<em><b>Argx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS__ARGX = 1;

	/**
	 * The number of structural features of the '<em>Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.ArgxTypeImpl <em>Argx Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.ArgxTypeImpl
	 * @see Trialple.impl.TrialplePackageImpl#getArgxType()
	 * @generated
	 */
	int ARGX_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Argstring</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGX_TYPE__ARGSTRING = 0;

	/**
	 * The feature id for the '<em><b>Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGX_TYPE__SEP = 1;

	/**
	 * The number of structural features of the '<em>Argx Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGX_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Argx Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.DefImpl <em>Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.DefImpl
	 * @see Trialple.impl.TrialplePackageImpl#getDef()
	 * @generated
	 */
	int DEF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF__NAME = 0;

	/**
	 * The number of structural features of the '<em>Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.DefinitionsImpl <em>Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.DefinitionsImpl
	 * @see Trialple.impl.TrialplePackageImpl#getDefinitions()
	 * @generated
	 */
	int DEFINITIONS = 4;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__DEF = 0;

	/**
	 * The number of structural features of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.DocumentRootImpl
	 * @see Trialple.impl.TrialplePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	int EXECUTION_CONTROL = 6;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTROL__MODULES = 0;

	/**
	 * The feature id for the '<em><b>Unit Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTROL__UNIT_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTROL__NAME = 2;

	/**
	 * The feature id for the '<em><b>Srcid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTROL__SRCID = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTROL__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Execution Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTROL_FEATURE_COUNT = 5;

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
	int IF_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TYPE__PHASE = 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TYPE__OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Submoduleref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TYPE__SUBMODULEREF = 2;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TYPE__TEST = 3;

	/**
	 * The number of structural features of the '<em>If Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TYPE_FEATURE_COUNT = 4;

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
	int MODULE = 8;

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
	 * The feature id for the '<em><b>Postevent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__POSTEVENT = 2;

	/**
	 * The feature id for the '<em><b>Revokemodule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__REVOKEMODULE = 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
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
	 * The meta object id for the '{@link Trialple.impl.ModuleListImpl <em>Module List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.ModuleListImpl
	 * @see Trialple.impl.TrialplePackageImpl#getModuleList()
	 * @generated
	 */
	int MODULE_LIST = 9;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIST__MODULE = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIST__MODULES = 1;

	/**
	 * The feature id for the '<em><b>Submoduledefs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIST__SUBMODULEDEFS = 2;

	/**
	 * The feature id for the '<em><b>Submoduledef</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIST__SUBMODULEDEF = 3;

	/**
	 * The number of structural features of the '<em>Module List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Module List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.ModulesImpl <em>Modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.ModulesImpl
	 * @see Trialple.impl.TrialplePackageImpl#getModules()
	 * @generated
	 */
	int MODULES = 10;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__MODULE = 0;

	/**
	 * The feature id for the '<em><b>Srcid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__SRCID = 1;

	/**
	 * The number of structural features of the '<em>Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.NotImpl
	 * @see Trialple.impl.TrialplePackageImpl#getNot()
	 * @generated
	 */
	int NOT = 11;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OPTION = 0;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__AND = 1;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.OptionImpl
	 * @see Trialple.impl.TrialplePackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 12;

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
	int OPT_LIST = 13;

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
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_LIST__NOT = 2;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_LIST__AND = 3;

	/**
	 * The number of structural features of the '<em>Opt List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_LIST_FEATURE_COUNT = 4;

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
	int OR = 14;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OPTION = 0;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__AND = 1;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__NOT = 2;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = 3;

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
	int PHASE = 15;

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
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__IF = 4;

	/**
	 * The feature id for the '<em><b>Autorepeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__AUTOREPEAT = 5;

	/**
	 * The feature id for the '<em><b>Buffersync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__BUFFERSYNC = 6;

	/**
	 * The feature id for the '<em><b>Checkuvers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__CHECKUVERS = 7;

	/**
	 * The feature id for the '<em><b>Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__CONNECT = 8;

	/**
	 * The feature id for the '<em><b>Continue On Oq Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__CONTINUE_ON_OQ_ERRORS = 9;

	/**
	 * The feature id for the '<em><b>Elgfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__ELGFILE = 10;

	/**
	 * The feature id for the '<em><b>Ignorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__IGNORABLE = 11;

	/**
	 * The feature id for the '<em><b>Logfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__LOGFILE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__NAME = 13;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__PASSWORD = 14;

	/**
	 * The feature id for the '<em><b>Unlockonerror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__UNLOCKONERROR = 15;

	/**
	 * The number of structural features of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_FEATURE_COUNT = 16;

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
	int PHASELIST = 16;

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
	 * The feature id for the '<em><b>Submodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASELIST__SUBMODULE = 2;

	/**
	 * The feature id for the '<em><b>Submoduleref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASELIST__SUBMODULEREF = 3;

	/**
	 * The feature id for the '<em><b>Srcid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASELIST__SRCID = 4;

	/**
	 * The number of structural features of the '<em>Phaselist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASELIST_FEATURE_COUNT = 5;

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
	int PRECEDENCES = 17;

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
	 * The meta object id for the '{@link Trialple.impl.SubModuleImpl <em>Sub Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.SubModuleImpl
	 * @see Trialple.impl.TrialplePackageImpl#getSubModule()
	 * @generated
	 */
	int SUB_MODULE = 18;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__OPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Phaselist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__PHASELIST = 1;

	/**
	 * The feature id for the '<em><b>Execparallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__EXECPARALLEL = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__PASSWORD = 3;

	/**
	 * The number of structural features of the '<em>Sub Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sub Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.SubmoduleDefImpl <em>Submodule Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.SubmoduleDefImpl
	 * @see Trialple.impl.TrialplePackageImpl#getSubmoduleDef()
	 * @generated
	 */
	int SUBMODULE_DEF = 19;

	/**
	 * The feature id for the '<em><b>Defs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_DEF__DEFS = 0;

	/**
	 * The feature id for the '<em><b>Phaselist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_DEF__PHASELIST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_DEF__NAME = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_DEF__PASSWORD = 3;

	/**
	 * The number of structural features of the '<em>Submodule Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_DEF_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Submodule Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_DEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.SubmoduleDefsImpl <em>Submodule Defs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.SubmoduleDefsImpl
	 * @see Trialple.impl.TrialplePackageImpl#getSubmoduleDefs()
	 * @generated
	 */
	int SUBMODULE_DEFS = 20;

	/**
	 * The feature id for the '<em><b>Submoduledef</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_DEFS__SUBMODULEDEF = 0;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_DEFS__IF = 1;

	/**
	 * The feature id for the '<em><b>Srcid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_DEFS__SRCID = 2;

	/**
	 * The number of structural features of the '<em>Submodule Defs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_DEFS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Submodule Defs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_DEFS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.SubModuleRefImpl <em>Sub Module Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.SubModuleRefImpl
	 * @see Trialple.impl.TrialplePackageImpl#getSubModuleRef()
	 * @generated
	 */
	int SUB_MODULE_REF = 21;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE_REF__OPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE_REF__DEFS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE_REF__NAME = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE_REF__PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Refname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE_REF__REFNAME = 4;

	/**
	 * The number of structural features of the '<em>Sub Module Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE_REF_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sub Module Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.UnitImpl
	 * @see Trialple.impl.TrialplePackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 22;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Unitmodules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__UNITMODULES = 1;

	/**
	 * The feature id for the '<em><b>Revokecondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__REVOKECONDITION = 2;

	/**
	 * The feature id for the '<em><b>Downtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__DOWNTIME = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = 5;

	/**
	 * The feature id for the '<em><b>Revoke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__REVOKE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.UnitDefinitionImpl <em>Unit Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.UnitDefinitionImpl
	 * @see Trialple.impl.TrialplePackageImpl#getUnitDefinition()
	 * @generated
	 */
	int UNIT_DEFINITION = 23;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEFINITION__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEFINITION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Srcid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEFINITION__SRCID = 2;

	/**
	 * The number of structural features of the '<em>Unit Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unit Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.UnitModuleImpl <em>Unit Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.UnitModuleImpl
	 * @see Trialple.impl.TrialplePackageImpl#getUnitModule()
	 * @generated
	 */
	int UNIT_MODULE = 24;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MODULE__OPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MODULE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Unit Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MODULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unit Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.impl.UnitModuleListImpl <em>Unit Module List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.impl.UnitModuleListImpl
	 * @see Trialple.impl.TrialplePackageImpl#getUnitModuleList()
	 * @generated
	 */
	int UNIT_MODULE_LIST = 25;

	/**
	 * The feature id for the '<em><b>Unitmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MODULE_LIST__UNITMODULE = 0;

	/**
	 * The number of structural features of the '<em>Unit Module List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MODULE_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unit Module List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MODULE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Trialple.ModuleType <em>Module Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.ModuleType
	 * @see Trialple.impl.TrialplePackageImpl#getModuleType()
	 * @generated
	 */
	int MODULE_TYPE = 26;

	/**
	 * The meta object id for the '<em>Module Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Trialple.ModuleType
	 * @see Trialple.impl.TrialplePackageImpl#getModuleTypeObject()
	 * @generated
	 */
	int MODULE_TYPE_OBJECT = 27;


	/**
	 * Returns the meta object for class '{@link Trialple.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see Trialple.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.And#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see Trialple.And#getOption()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Option();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.And#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see Trialple.And#getOr()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.And#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see Trialple.And#getNot()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Not();

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
	 * Returns the meta object for the containment reference '{@link Trialple.Arguments#getArgx <em>Argx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argx</em>'.
	 * @see Trialple.Arguments#getArgx()
	 * @see #getArguments()
	 * @generated
	 */
	EReference getArguments_Argx();

	/**
	 * Returns the meta object for class '{@link Trialple.ArgxType <em>Argx Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argx Type</em>'.
	 * @see Trialple.ArgxType
	 * @generated
	 */
	EClass getArgxType();

	/**
	 * Returns the meta object for the attribute list '{@link Trialple.ArgxType#getArgstring <em>Argstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Argstring</em>'.
	 * @see Trialple.ArgxType#getArgstring()
	 * @see #getArgxType()
	 * @generated
	 */
	EAttribute getArgxType_Argstring();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.ArgxType#getSep <em>Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sep</em>'.
	 * @see Trialple.ArgxType#getSep()
	 * @see #getArgxType()
	 * @generated
	 */
	EAttribute getArgxType_Sep();

	/**
	 * Returns the meta object for class '{@link Trialple.Def <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Def</em>'.
	 * @see Trialple.Def
	 * @generated
	 */
	EClass getDef();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Def#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Trialple.Def#getName()
	 * @see #getDef()
	 * @generated
	 */
	EAttribute getDef_Name();

	/**
	 * Returns the meta object for class '{@link Trialple.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions</em>'.
	 * @see Trialple.Definitions
	 * @generated
	 */
	EClass getDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.Definitions#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Def</em>'.
	 * @see Trialple.Definitions#getDef()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Def();

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
	 * Returns the meta object for the containment reference list '{@link Trialple.ExecutionControl#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see Trialple.ExecutionControl#getModules()
	 * @see #getExecutionControl()
	 * @generated
	 */
	EReference getExecutionControl_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.ExecutionControl#getUnitDefinition <em>Unit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Definition</em>'.
	 * @see Trialple.ExecutionControl#getUnitDefinition()
	 * @see #getExecutionControl()
	 * @generated
	 */
	EReference getExecutionControl_UnitDefinition();

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
	 * Returns the meta object for the containment reference list '{@link Trialple.IfType#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see Trialple.IfType#getOptions()
	 * @see #getIfType()
	 * @generated
	 */
	EReference getIfType_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.IfType#getSubmoduleref <em>Submoduleref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submoduleref</em>'.
	 * @see Trialple.IfType#getSubmoduleref()
	 * @see #getIfType()
	 * @generated
	 */
	EReference getIfType_Submoduleref();

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
	 * Returns the meta object for the attribute '{@link Trialple.Module#getPostevent <em>Postevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postevent</em>'.
	 * @see Trialple.Module#getPostevent()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Postevent();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Module#getRevokemodule <em>Revokemodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revokemodule</em>'.
	 * @see Trialple.Module#getRevokemodule()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Revokemodule();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Module#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
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
	 * Returns the meta object for class '{@link Trialple.ModuleList <em>Module List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module List</em>'.
	 * @see Trialple.ModuleList
	 * @generated
	 */
	EClass getModuleList();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.ModuleList#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module</em>'.
	 * @see Trialple.ModuleList#getModule()
	 * @see #getModuleList()
	 * @generated
	 */
	EReference getModuleList_Module();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.ModuleList#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see Trialple.ModuleList#getModules()
	 * @see #getModuleList()
	 * @generated
	 */
	EReference getModuleList_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.ModuleList#getSubmoduledefs <em>Submoduledefs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submoduledefs</em>'.
	 * @see Trialple.ModuleList#getSubmoduledefs()
	 * @see #getModuleList()
	 * @generated
	 */
	EReference getModuleList_Submoduledefs();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.ModuleList#getSubmoduledef <em>Submoduledef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submoduledef</em>'.
	 * @see Trialple.ModuleList#getSubmoduledef()
	 * @see #getModuleList()
	 * @generated
	 */
	EReference getModuleList_Submoduledef();

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
	 * Returns the meta object for the attribute '{@link Trialple.Modules#getSrcid <em>Srcid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srcid</em>'.
	 * @see Trialple.Modules#getSrcid()
	 * @see #getModules()
	 * @generated
	 */
	EAttribute getModules_Srcid();

	/**
	 * Returns the meta object for class '{@link Trialple.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see Trialple.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.Not#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see Trialple.Not#getOption()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Option();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.Not#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see Trialple.Not#getAnd()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_And();

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
	 * Returns the meta object for the containment reference list '{@link Trialple.OptList#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see Trialple.OptList#getNot()
	 * @see #getOptList()
	 * @generated
	 */
	EReference getOptList_Not();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.OptList#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see Trialple.OptList#getAnd()
	 * @see #getOptList()
	 * @generated
	 */
	EReference getOptList_And();

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
	 * Returns the meta object for the containment reference list '{@link Trialple.Or#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see Trialple.Or#getAnd()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_And();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.Or#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see Trialple.Or#getNot()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Not();

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
	 * Returns the meta object for the containment reference list '{@link Trialple.Phase#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see Trialple.Phase#getIf()
	 * @see #getPhase()
	 * @generated
	 */
	EReference getPhase_If();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Phase#getAutorepeat <em>Autorepeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autorepeat</em>'.
	 * @see Trialple.Phase#getAutorepeat()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Autorepeat();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Phase#isBuffersync <em>Buffersync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffersync</em>'.
	 * @see Trialple.Phase#isBuffersync()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Buffersync();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Phase#isCheckuvers <em>Checkuvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checkuvers</em>'.
	 * @see Trialple.Phase#isCheckuvers()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Checkuvers();

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
	 * Returns the meta object for the attribute '{@link Trialple.Phase#isContinueOnOqErrors <em>Continue On Oq Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continue On Oq Errors</em>'.
	 * @see Trialple.Phase#isContinueOnOqErrors()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_ContinueOnOqErrors();

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
	 * Returns the meta object for the attribute '{@link Trialple.Phase#isIgnorable <em>Ignorable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignorable</em>'.
	 * @see Trialple.Phase#isIgnorable()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Ignorable();

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
	 * Returns the meta object for the attribute '{@link Trialple.Phase#isUnlockonerror <em>Unlockonerror</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unlockonerror</em>'.
	 * @see Trialple.Phase#isUnlockonerror()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Unlockonerror();

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
	 * Returns the meta object for the containment reference list '{@link Trialple.Phaselist#getSubmodule <em>Submodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submodule</em>'.
	 * @see Trialple.Phaselist#getSubmodule()
	 * @see #getPhaselist()
	 * @generated
	 */
	EReference getPhaselist_Submodule();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.Phaselist#getSubmoduleref <em>Submoduleref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submoduleref</em>'.
	 * @see Trialple.Phaselist#getSubmoduleref()
	 * @see #getPhaselist()
	 * @generated
	 */
	EReference getPhaselist_Submoduleref();

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
	 * Returns the meta object for class '{@link Trialple.SubModule <em>Sub Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Module</em>'.
	 * @see Trialple.SubModule
	 * @generated
	 */
	EClass getSubModule();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.SubModule#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see Trialple.SubModule#getOptions()
	 * @see #getSubModule()
	 * @generated
	 */
	EReference getSubModule_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.SubModule#getPhaselist <em>Phaselist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phaselist</em>'.
	 * @see Trialple.SubModule#getPhaselist()
	 * @see #getSubModule()
	 * @generated
	 */
	EReference getSubModule_Phaselist();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.SubModule#isExecparallel <em>Execparallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execparallel</em>'.
	 * @see Trialple.SubModule#isExecparallel()
	 * @see #getSubModule()
	 * @generated
	 */
	EAttribute getSubModule_Execparallel();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.SubModule#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Trialple.SubModule#getPassword()
	 * @see #getSubModule()
	 * @generated
	 */
	EAttribute getSubModule_Password();

	/**
	 * Returns the meta object for class '{@link Trialple.SubmoduleDef <em>Submodule Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submodule Def</em>'.
	 * @see Trialple.SubmoduleDef
	 * @generated
	 */
	EClass getSubmoduleDef();

	/**
	 * Returns the meta object for the containment reference '{@link Trialple.SubmoduleDef#getDefs <em>Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defs</em>'.
	 * @see Trialple.SubmoduleDef#getDefs()
	 * @see #getSubmoduleDef()
	 * @generated
	 */
	EReference getSubmoduleDef_Defs();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.SubmoduleDef#getPhaselist <em>Phaselist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phaselist</em>'.
	 * @see Trialple.SubmoduleDef#getPhaselist()
	 * @see #getSubmoduleDef()
	 * @generated
	 */
	EReference getSubmoduleDef_Phaselist();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.SubmoduleDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Trialple.SubmoduleDef#getName()
	 * @see #getSubmoduleDef()
	 * @generated
	 */
	EAttribute getSubmoduleDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.SubmoduleDef#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Trialple.SubmoduleDef#getPassword()
	 * @see #getSubmoduleDef()
	 * @generated
	 */
	EAttribute getSubmoduleDef_Password();

	/**
	 * Returns the meta object for class '{@link Trialple.SubmoduleDefs <em>Submodule Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submodule Defs</em>'.
	 * @see Trialple.SubmoduleDefs
	 * @generated
	 */
	EClass getSubmoduleDefs();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.SubmoduleDefs#getSubmoduledef <em>Submoduledef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submoduledef</em>'.
	 * @see Trialple.SubmoduleDefs#getSubmoduledef()
	 * @see #getSubmoduleDefs()
	 * @generated
	 */
	EReference getSubmoduleDefs_Submoduledef();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.SubmoduleDefs#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see Trialple.SubmoduleDefs#getIf()
	 * @see #getSubmoduleDefs()
	 * @generated
	 */
	EReference getSubmoduleDefs_If();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.SubmoduleDefs#getSrcid <em>Srcid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srcid</em>'.
	 * @see Trialple.SubmoduleDefs#getSrcid()
	 * @see #getSubmoduleDefs()
	 * @generated
	 */
	EAttribute getSubmoduleDefs_Srcid();

	/**
	 * Returns the meta object for class '{@link Trialple.SubModuleRef <em>Sub Module Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Module Ref</em>'.
	 * @see Trialple.SubModuleRef
	 * @generated
	 */
	EClass getSubModuleRef();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.SubModuleRef#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see Trialple.SubModuleRef#getOptions()
	 * @see #getSubModuleRef()
	 * @generated
	 */
	EReference getSubModuleRef_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.SubModuleRef#getDefs <em>Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defs</em>'.
	 * @see Trialple.SubModuleRef#getDefs()
	 * @see #getSubModuleRef()
	 * @generated
	 */
	EReference getSubModuleRef_Defs();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.SubModuleRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Trialple.SubModuleRef#getName()
	 * @see #getSubModuleRef()
	 * @generated
	 */
	EAttribute getSubModuleRef_Name();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.SubModuleRef#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Trialple.SubModuleRef#getPassword()
	 * @see #getSubModuleRef()
	 * @generated
	 */
	EAttribute getSubModuleRef_Password();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.SubModuleRef#getRefname <em>Refname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refname</em>'.
	 * @see Trialple.SubModuleRef#getRefname()
	 * @see #getSubModuleRef()
	 * @generated
	 */
	EAttribute getSubModuleRef_Refname();

	/**
	 * Returns the meta object for class '{@link Trialple.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see Trialple.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Unit#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see Trialple.Unit#getTitle()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Title();

	/**
	 * Returns the meta object for the containment reference '{@link Trialple.Unit#getUnitmodules <em>Unitmodules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unitmodules</em>'.
	 * @see Trialple.Unit#getUnitmodules()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Unitmodules();

	/**
	 * Returns the meta object for the containment reference '{@link Trialple.Unit#getRevokecondition <em>Revokecondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revokecondition</em>'.
	 * @see Trialple.Unit#getRevokecondition()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Revokecondition();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Unit#getDowntime <em>Downtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Downtime</em>'.
	 * @see Trialple.Unit#getDowntime()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Downtime();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Unit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Trialple.Unit#getId()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Id();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Unit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Trialple.Unit#getName()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Name();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Unit#getRevoke <em>Revoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revoke</em>'.
	 * @see Trialple.Unit#getRevoke()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Revoke();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.Unit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Trialple.Unit#getType()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Type();

	/**
	 * Returns the meta object for class '{@link Trialple.UnitDefinition <em>Unit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Definition</em>'.
	 * @see Trialple.UnitDefinition
	 * @generated
	 */
	EClass getUnitDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.UnitDefinition#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit</em>'.
	 * @see Trialple.UnitDefinition#getUnit()
	 * @see #getUnitDefinition()
	 * @generated
	 */
	EReference getUnitDefinition_Unit();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.UnitDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Trialple.UnitDefinition#getName()
	 * @see #getUnitDefinition()
	 * @generated
	 */
	EAttribute getUnitDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.UnitDefinition#getSrcid <em>Srcid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srcid</em>'.
	 * @see Trialple.UnitDefinition#getSrcid()
	 * @see #getUnitDefinition()
	 * @generated
	 */
	EAttribute getUnitDefinition_Srcid();

	/**
	 * Returns the meta object for class '{@link Trialple.UnitModule <em>Unit Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Module</em>'.
	 * @see Trialple.UnitModule
	 * @generated
	 */
	EClass getUnitModule();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.UnitModule#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see Trialple.UnitModule#getOptions()
	 * @see #getUnitModule()
	 * @generated
	 */
	EReference getUnitModule_Options();

	/**
	 * Returns the meta object for the attribute '{@link Trialple.UnitModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Trialple.UnitModule#getName()
	 * @see #getUnitModule()
	 * @generated
	 */
	EAttribute getUnitModule_Name();

	/**
	 * Returns the meta object for class '{@link Trialple.UnitModuleList <em>Unit Module List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Module List</em>'.
	 * @see Trialple.UnitModuleList
	 * @generated
	 */
	EClass getUnitModuleList();

	/**
	 * Returns the meta object for the containment reference list '{@link Trialple.UnitModuleList#getUnitmodule <em>Unitmodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unitmodule</em>'.
	 * @see Trialple.UnitModuleList#getUnitmodule()
	 * @see #getUnitModuleList()
	 * @generated
	 */
	EReference getUnitModuleList_Unitmodule();

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
		 * The meta object literal for the '{@link Trialple.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.AndImpl
		 * @see Trialple.impl.TrialplePackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__OPTION = eINSTANCE.getAnd_Option();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__OR = eINSTANCE.getAnd_Or();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__NOT = eINSTANCE.getAnd_Not();

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
		 * The meta object literal for the '<em><b>Argx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTS__ARGX = eINSTANCE.getArguments_Argx();

		/**
		 * The meta object literal for the '{@link Trialple.impl.ArgxTypeImpl <em>Argx Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.ArgxTypeImpl
		 * @see Trialple.impl.TrialplePackageImpl#getArgxType()
		 * @generated
		 */
		EClass ARGX_TYPE = eINSTANCE.getArgxType();

		/**
		 * The meta object literal for the '<em><b>Argstring</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGX_TYPE__ARGSTRING = eINSTANCE.getArgxType_Argstring();

		/**
		 * The meta object literal for the '<em><b>Sep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGX_TYPE__SEP = eINSTANCE.getArgxType_Sep();

		/**
		 * The meta object literal for the '{@link Trialple.impl.DefImpl <em>Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.DefImpl
		 * @see Trialple.impl.TrialplePackageImpl#getDef()
		 * @generated
		 */
		EClass DEF = eINSTANCE.getDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEF__NAME = eINSTANCE.getDef_Name();

		/**
		 * The meta object literal for the '{@link Trialple.impl.DefinitionsImpl <em>Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.DefinitionsImpl
		 * @see Trialple.impl.TrialplePackageImpl#getDefinitions()
		 * @generated
		 */
		EClass DEFINITIONS = eINSTANCE.getDefinitions();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITIONS__DEF = eINSTANCE.getDefinitions_Def();

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
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTROL__MODULES = eINSTANCE.getExecutionControl_Modules();

		/**
		 * The meta object literal for the '<em><b>Unit Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTROL__UNIT_DEFINITION = eINSTANCE.getExecutionControl_UnitDefinition();

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
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_TYPE__OPTIONS = eINSTANCE.getIfType_Options();

		/**
		 * The meta object literal for the '<em><b>Submoduleref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_TYPE__SUBMODULEREF = eINSTANCE.getIfType_Submoduleref();

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
		 * The meta object literal for the '<em><b>Postevent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__POSTEVENT = eINSTANCE.getModule_Postevent();

		/**
		 * The meta object literal for the '<em><b>Revokemodule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__REVOKEMODULE = eINSTANCE.getModule_Revokemodule();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
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
		 * The meta object literal for the '<em><b>Phaselist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PHASELIST = eINSTANCE.getModule_Phaselist();

		/**
		 * The meta object literal for the '<em><b>Checkmode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__CHECKMODE = eINSTANCE.getModule_Checkmode();

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
		 * The meta object literal for the '<em><b>Reselect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__RESELECT = eINSTANCE.getModule_Reselect();

		/**
		 * The meta object literal for the '<em><b>Revokeautonext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__REVOKEAUTONEXT = eINSTANCE.getModule_Revokeautonext();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__TYPE = eINSTANCE.getModule_Type();

		/**
		 * The meta object literal for the '<em><b>Uniqueexec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__UNIQUEEXEC = eINSTANCE.getModule_Uniqueexec();

		/**
		 * The meta object literal for the '{@link Trialple.impl.ModuleListImpl <em>Module List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.ModuleListImpl
		 * @see Trialple.impl.TrialplePackageImpl#getModuleList()
		 * @generated
		 */
		EClass MODULE_LIST = eINSTANCE.getModuleList();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_LIST__MODULE = eINSTANCE.getModuleList_Module();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_LIST__MODULES = eINSTANCE.getModuleList_Modules();

		/**
		 * The meta object literal for the '<em><b>Submoduledefs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_LIST__SUBMODULEDEFS = eINSTANCE.getModuleList_Submoduledefs();

		/**
		 * The meta object literal for the '<em><b>Submoduledef</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_LIST__SUBMODULEDEF = eINSTANCE.getModuleList_Submoduledef();

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
		 * The meta object literal for the '<em><b>Srcid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULES__SRCID = eINSTANCE.getModules_Srcid();

		/**
		 * The meta object literal for the '{@link Trialple.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.NotImpl
		 * @see Trialple.impl.TrialplePackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__OPTION = eINSTANCE.getNot_Option();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__AND = eINSTANCE.getNot_And();

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
		 * The meta object literal for the '<em><b>Not</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPT_LIST__NOT = eINSTANCE.getOptList_Not();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPT_LIST__AND = eINSTANCE.getOptList_And();

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
		 * The meta object literal for the '<em><b>And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__AND = eINSTANCE.getOr_And();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__NOT = eINSTANCE.getOr_Not();

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
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE__OPTIONS = eINSTANCE.getPhase_Options();

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
		 * The meta object literal for the '<em><b>If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE__IF = eINSTANCE.getPhase_If();

		/**
		 * The meta object literal for the '<em><b>Autorepeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__AUTOREPEAT = eINSTANCE.getPhase_Autorepeat();

		/**
		 * The meta object literal for the '<em><b>Buffersync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__BUFFERSYNC = eINSTANCE.getPhase_Buffersync();

		/**
		 * The meta object literal for the '<em><b>Checkuvers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__CHECKUVERS = eINSTANCE.getPhase_Checkuvers();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__CONNECT = eINSTANCE.getPhase_Connect();

		/**
		 * The meta object literal for the '<em><b>Continue On Oq Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__CONTINUE_ON_OQ_ERRORS = eINSTANCE.getPhase_ContinueOnOqErrors();

		/**
		 * The meta object literal for the '<em><b>Elgfile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__ELGFILE = eINSTANCE.getPhase_Elgfile();

		/**
		 * The meta object literal for the '<em><b>Ignorable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__IGNORABLE = eINSTANCE.getPhase_Ignorable();

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
		 * The meta object literal for the '<em><b>Unlockonerror</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__UNLOCKONERROR = eINSTANCE.getPhase_Unlockonerror();

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
		 * The meta object literal for the '<em><b>Submodule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASELIST__SUBMODULE = eINSTANCE.getPhaselist_Submodule();

		/**
		 * The meta object literal for the '<em><b>Submoduleref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASELIST__SUBMODULEREF = eINSTANCE.getPhaselist_Submoduleref();

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
		 * The meta object literal for the '{@link Trialple.impl.SubModuleImpl <em>Sub Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.SubModuleImpl
		 * @see Trialple.impl.TrialplePackageImpl#getSubModule()
		 * @generated
		 */
		EClass SUB_MODULE = eINSTANCE.getSubModule();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODULE__OPTIONS = eINSTANCE.getSubModule_Options();

		/**
		 * The meta object literal for the '<em><b>Phaselist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODULE__PHASELIST = eINSTANCE.getSubModule_Phaselist();

		/**
		 * The meta object literal for the '<em><b>Execparallel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_MODULE__EXECPARALLEL = eINSTANCE.getSubModule_Execparallel();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_MODULE__PASSWORD = eINSTANCE.getSubModule_Password();

		/**
		 * The meta object literal for the '{@link Trialple.impl.SubmoduleDefImpl <em>Submodule Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.SubmoduleDefImpl
		 * @see Trialple.impl.TrialplePackageImpl#getSubmoduleDef()
		 * @generated
		 */
		EClass SUBMODULE_DEF = eINSTANCE.getSubmoduleDef();

		/**
		 * The meta object literal for the '<em><b>Defs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODULE_DEF__DEFS = eINSTANCE.getSubmoduleDef_Defs();

		/**
		 * The meta object literal for the '<em><b>Phaselist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODULE_DEF__PHASELIST = eINSTANCE.getSubmoduleDef_Phaselist();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMODULE_DEF__NAME = eINSTANCE.getSubmoduleDef_Name();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMODULE_DEF__PASSWORD = eINSTANCE.getSubmoduleDef_Password();

		/**
		 * The meta object literal for the '{@link Trialple.impl.SubmoduleDefsImpl <em>Submodule Defs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.SubmoduleDefsImpl
		 * @see Trialple.impl.TrialplePackageImpl#getSubmoduleDefs()
		 * @generated
		 */
		EClass SUBMODULE_DEFS = eINSTANCE.getSubmoduleDefs();

		/**
		 * The meta object literal for the '<em><b>Submoduledef</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODULE_DEFS__SUBMODULEDEF = eINSTANCE.getSubmoduleDefs_Submoduledef();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODULE_DEFS__IF = eINSTANCE.getSubmoduleDefs_If();

		/**
		 * The meta object literal for the '<em><b>Srcid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMODULE_DEFS__SRCID = eINSTANCE.getSubmoduleDefs_Srcid();

		/**
		 * The meta object literal for the '{@link Trialple.impl.SubModuleRefImpl <em>Sub Module Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.SubModuleRefImpl
		 * @see Trialple.impl.TrialplePackageImpl#getSubModuleRef()
		 * @generated
		 */
		EClass SUB_MODULE_REF = eINSTANCE.getSubModuleRef();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODULE_REF__OPTIONS = eINSTANCE.getSubModuleRef_Options();

		/**
		 * The meta object literal for the '<em><b>Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODULE_REF__DEFS = eINSTANCE.getSubModuleRef_Defs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_MODULE_REF__NAME = eINSTANCE.getSubModuleRef_Name();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_MODULE_REF__PASSWORD = eINSTANCE.getSubModuleRef_Password();

		/**
		 * The meta object literal for the '<em><b>Refname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_MODULE_REF__REFNAME = eINSTANCE.getSubModuleRef_Refname();

		/**
		 * The meta object literal for the '{@link Trialple.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.UnitImpl
		 * @see Trialple.impl.TrialplePackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__TITLE = eINSTANCE.getUnit_Title();

		/**
		 * The meta object literal for the '<em><b>Unitmodules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__UNITMODULES = eINSTANCE.getUnit_Unitmodules();

		/**
		 * The meta object literal for the '<em><b>Revokecondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__REVOKECONDITION = eINSTANCE.getUnit_Revokecondition();

		/**
		 * The meta object literal for the '<em><b>Downtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__DOWNTIME = eINSTANCE.getUnit_Downtime();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__ID = eINSTANCE.getUnit_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Revoke</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__REVOKE = eINSTANCE.getUnit_Revoke();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__TYPE = eINSTANCE.getUnit_Type();

		/**
		 * The meta object literal for the '{@link Trialple.impl.UnitDefinitionImpl <em>Unit Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.UnitDefinitionImpl
		 * @see Trialple.impl.TrialplePackageImpl#getUnitDefinition()
		 * @generated
		 */
		EClass UNIT_DEFINITION = eINSTANCE.getUnitDefinition();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_DEFINITION__UNIT = eINSTANCE.getUnitDefinition_Unit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_DEFINITION__NAME = eINSTANCE.getUnitDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Srcid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_DEFINITION__SRCID = eINSTANCE.getUnitDefinition_Srcid();

		/**
		 * The meta object literal for the '{@link Trialple.impl.UnitModuleImpl <em>Unit Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.UnitModuleImpl
		 * @see Trialple.impl.TrialplePackageImpl#getUnitModule()
		 * @generated
		 */
		EClass UNIT_MODULE = eINSTANCE.getUnitModule();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_MODULE__OPTIONS = eINSTANCE.getUnitModule_Options();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_MODULE__NAME = eINSTANCE.getUnitModule_Name();

		/**
		 * The meta object literal for the '{@link Trialple.impl.UnitModuleListImpl <em>Unit Module List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Trialple.impl.UnitModuleListImpl
		 * @see Trialple.impl.TrialplePackageImpl#getUnitModuleList()
		 * @generated
		 */
		EClass UNIT_MODULE_LIST = eINSTANCE.getUnitModuleList();

		/**
		 * The meta object literal for the '<em><b>Unitmodule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_MODULE_LIST__UNITMODULE = eINSTANCE.getUnitModuleList_Unitmodule();

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
