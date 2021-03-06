/**
 */
package Trialple.impl;

import Trialple.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrialpleFactoryImpl extends EFactoryImpl implements TrialpleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TrialpleFactory init() {
		try {
			TrialpleFactory theTrialpleFactory = (TrialpleFactory)EPackage.Registry.INSTANCE.getEFactory(TrialplePackage.eNS_URI);
			if (theTrialpleFactory != null) {
				return theTrialpleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TrialpleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrialpleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TrialplePackage.AND: return createAnd();
			case TrialplePackage.ARGUMENTS: return createArguments();
			case TrialplePackage.ARGX_TYPE: return createArgxType();
			case TrialplePackage.DEF: return createDef();
			case TrialplePackage.DEFINITIONS: return createDefinitions();
			case TrialplePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case TrialplePackage.EXECUTION_CONTROL: return createExecutionControl();
			case TrialplePackage.IF_TYPE: return createIfType();
			case TrialplePackage.MODULE: return createModule();
			case TrialplePackage.MODULE_LIST: return createModuleList();
			case TrialplePackage.MODULES: return createModules();
			case TrialplePackage.NOT: return createNot();
			case TrialplePackage.OPTION: return createOption();
			case TrialplePackage.OPT_LIST: return createOptList();
			case TrialplePackage.OR: return createOr();
			case TrialplePackage.PHASE: return createPhase();
			case TrialplePackage.PHASELIST: return createPhaselist();
			case TrialplePackage.PRECEDENCES: return createPrecedences();
			case TrialplePackage.SUB_MODULE: return createSubModule();
			case TrialplePackage.SUBMODULE_DEF: return createSubmoduleDef();
			case TrialplePackage.SUBMODULE_DEFS: return createSubmoduleDefs();
			case TrialplePackage.SUB_MODULE_REF: return createSubModuleRef();
			case TrialplePackage.UNIT: return createUnit();
			case TrialplePackage.UNIT_DEFINITION: return createUnitDefinition();
			case TrialplePackage.UNIT_MODULE: return createUnitModule();
			case TrialplePackage.UNIT_MODULE_LIST: return createUnitModuleList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TrialplePackage.MODULE_TYPE:
				return createModuleTypeFromString(eDataType, initialValue);
			case TrialplePackage.MODULE_TYPE_OBJECT:
				return createModuleTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TrialplePackage.MODULE_TYPE:
				return convertModuleTypeToString(eDataType, instanceValue);
			case TrialplePackage.MODULE_TYPE_OBJECT:
				return convertModuleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arguments createArguments() {
		ArgumentsImpl arguments = new ArgumentsImpl();
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgxType createArgxType() {
		ArgxTypeImpl argxType = new ArgxTypeImpl();
		return argxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Def createDef() {
		DefImpl def = new DefImpl();
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions createDefinitions() {
		DefinitionsImpl definitions = new DefinitionsImpl();
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionControl createExecutionControl() {
		ExecutionControlImpl executionControl = new ExecutionControlImpl();
		return executionControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfType createIfType() {
		IfTypeImpl ifType = new IfTypeImpl();
		return ifType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleList createModuleList() {
		ModuleListImpl moduleList = new ModuleListImpl();
		return moduleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modules createModules() {
		ModulesImpl modules = new ModulesImpl();
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptList createOptList() {
		OptListImpl optList = new OptListImpl();
		return optList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase createPhase() {
		PhaseImpl phase = new PhaseImpl();
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phaselist createPhaselist() {
		PhaselistImpl phaselist = new PhaselistImpl();
		return phaselist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precedences createPrecedences() {
		PrecedencesImpl precedences = new PrecedencesImpl();
		return precedences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubModule createSubModule() {
		SubModuleImpl subModule = new SubModuleImpl();
		return subModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmoduleDef createSubmoduleDef() {
		SubmoduleDefImpl submoduleDef = new SubmoduleDefImpl();
		return submoduleDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmoduleDefs createSubmoduleDefs() {
		SubmoduleDefsImpl submoduleDefs = new SubmoduleDefsImpl();
		return submoduleDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubModuleRef createSubModuleRef() {
		SubModuleRefImpl subModuleRef = new SubModuleRefImpl();
		return subModuleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitDefinition createUnitDefinition() {
		UnitDefinitionImpl unitDefinition = new UnitDefinitionImpl();
		return unitDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitModule createUnitModule() {
		UnitModuleImpl unitModule = new UnitModuleImpl();
		return unitModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitModuleList createUnitModuleList() {
		UnitModuleListImpl unitModuleList = new UnitModuleListImpl();
		return unitModuleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleType createModuleTypeFromString(EDataType eDataType, String initialValue) {
		ModuleType result = ModuleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleType createModuleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createModuleTypeFromString(TrialplePackage.Literals.MODULE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModuleTypeToString(TrialplePackage.Literals.MODULE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrialplePackage getTrialplePackage() {
		return (TrialplePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TrialplePackage getPackage() {
		return TrialplePackage.eINSTANCE;
	}

} //TrialpleFactoryImpl
