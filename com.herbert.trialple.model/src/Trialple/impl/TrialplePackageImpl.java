/**
 */
package Trialple.impl;

import Trialple.And;
import Trialple.Arguments;
import Trialple.Definitions;
import Trialple.DocumentRoot;
import Trialple.ExecutionControl;
import Trialple.IfType;
import Trialple.Module;
import Trialple.ModuleType;
import Trialple.Modules;
import Trialple.Not;
import Trialple.OptList;
import Trialple.Option;
import Trialple.Or;
import Trialple.Phase;
import Trialple.Phaselist;
import Trialple.Precedences;
import Trialple.SubModule;
import Trialple.SubModuleRef;
import Trialple.SubmoduleDef;
import Trialple.SubmoduleDefs;
import Trialple.TrialpleFactory;
import Trialple.TrialplePackage;
import Trialple.Unit;
import Trialple.UnitDef;
import Trialple.UnitModList;
import Trialple.UnitModule;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrialplePackageImpl extends EPackageImpl implements TrialplePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaselistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submoduleDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submoduleDefsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subModuleRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitModListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moduleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType moduleTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Trialple.TrialplePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TrialplePackageImpl() {
		super(eNS_URI, TrialpleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TrialplePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TrialplePackage init() {
		if (isInited) return (TrialplePackage)EPackage.Registry.INSTANCE.getEPackage(TrialplePackage.eNS_URI);

		// Obtain or create and register package
		TrialplePackageImpl theTrialplePackage = (TrialplePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TrialplePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TrialplePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTrialplePackage.createPackageContents();

		// Initialize created meta-data
		theTrialplePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTrialplePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TrialplePackage.eNS_URI, theTrialplePackage);
		return theTrialplePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_Option() {
		return (EReference)andEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_Or() {
		return (EReference)andEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_Not() {
		return (EReference)andEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArguments() {
		return argumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArguments_Arg() {
		return (EAttribute)argumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitions() {
		return definitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitions_Def() {
		return (EAttribute)definitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExecutionControl() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionControl() {
		return executionControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionControl_Modules() {
		return (EReference)executionControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionControl_Submoduledefs() {
		return (EReference)executionControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionControl_Submoduledef() {
		return (EReference)executionControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionControl_UnitDefinition() {
		return (EReference)executionControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionControl_Name() {
		return (EAttribute)executionControlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionControl_Srcid() {
		return (EAttribute)executionControlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionControl_Version() {
		return (EAttribute)executionControlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfType() {
		return ifTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfType_Phase() {
		return (EReference)ifTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfType_Options() {
		return (EReference)ifTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfType_Submoduleref() {
		return (EReference)ifTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIfType_Test() {
		return (EAttribute)ifTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Phaselist() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Description() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Options() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Postevent() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Revokemodule() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Password() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Precedences() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Checkmode() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Revokeautonext() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Errignorable() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Interruptable() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Reselect() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Uniqueexec() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Mandatory() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Name() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Type() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModules() {
		return modulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModules_Module() {
		return (EReference)modulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModules_Srcid() {
		return (EAttribute)modulesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNot_Option() {
		return (EReference)notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNot_And() {
		return (EReference)notEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Name() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Value() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptList() {
		return optListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptList_Option() {
		return (EReference)optListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptList_Or() {
		return (EReference)optListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptList_Not() {
		return (EReference)optListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptList_And() {
		return (EReference)optListEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOr_Option() {
		return (EReference)orEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOr_And() {
		return (EReference)orEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOr_Not() {
		return (EReference)orEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhase() {
		return phaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhase_Args() {
		return (EReference)phaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Action() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Usage() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhase_If() {
		return (EReference)phaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Autorepeat() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Buffersync() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Checkuvers() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Connect() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_ContinueOnOqErrors() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Elgfile() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Ignorable() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhase_Options() {
		return (EReference)phaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Logfile() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Name() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Password() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Unlockonerror() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhaselist() {
		return phaselistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhaselist_Phase() {
		return (EReference)phaselistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhaselist_If() {
		return (EReference)phaselistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhaselist_Submodule() {
		return (EReference)phaselistEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhaselist_Submoduleref() {
		return (EReference)phaselistEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaselist_Srcid() {
		return (EAttribute)phaselistEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecedences() {
		return precedencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecedences_Precedence() {
		return (EAttribute)precedencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubModule() {
		return subModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubModule_Options() {
		return (EReference)subModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubModule_Phaselist() {
		return (EReference)subModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubModule_Execparallel() {
		return (EAttribute)subModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubModule_Password() {
		return (EAttribute)subModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubmoduleDef() {
		return submoduleDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmoduleDef_Defs() {
		return (EReference)submoduleDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmoduleDef_Phaselist() {
		return (EReference)submoduleDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmoduleDef_Name() {
		return (EAttribute)submoduleDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmoduleDef_Password() {
		return (EAttribute)submoduleDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubmoduleDefs() {
		return submoduleDefsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmoduleDefs_Submoduledef() {
		return (EReference)submoduleDefsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmoduleDefs_If() {
		return (EReference)submoduleDefsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmoduleDefs_Srcid() {
		return (EAttribute)submoduleDefsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubModuleRef() {
		return subModuleRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubModuleRef_Options() {
		return (EReference)subModuleRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubModuleRef_Defs() {
		return (EReference)subModuleRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubModuleRef_Name() {
		return (EAttribute)subModuleRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubModuleRef_Password() {
		return (EAttribute)subModuleRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubModuleRef_Refname() {
		return (EAttribute)subModuleRefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Title() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Unitmodules() {
		return (EReference)unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Id() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Name() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Type() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitDef() {
		return unitDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitDef_Unit() {
		return (EReference)unitDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitDef_Name() {
		return (EAttribute)unitDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitDef_Srcid() {
		return (EAttribute)unitDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitModList() {
		return unitModListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitModList_Unitmodule() {
		return (EReference)unitModListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitModule() {
		return unitModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitModule_Options() {
		return (EReference)unitModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitModule_Name() {
		return (EAttribute)unitModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModuleType() {
		return moduleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModuleTypeObject() {
		return moduleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrialpleFactory getTrialpleFactory() {
		return (TrialpleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		andEClass = createEClass(AND);
		createEReference(andEClass, AND__OPTION);
		createEReference(andEClass, AND__OR);
		createEReference(andEClass, AND__NOT);

		argumentsEClass = createEClass(ARGUMENTS);
		createEAttribute(argumentsEClass, ARGUMENTS__ARG);

		definitionsEClass = createEClass(DEFINITIONS);
		createEAttribute(definitionsEClass, DEFINITIONS__DEF);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXECUTION_CONTROL);

		executionControlEClass = createEClass(EXECUTION_CONTROL);
		createEReference(executionControlEClass, EXECUTION_CONTROL__MODULES);
		createEReference(executionControlEClass, EXECUTION_CONTROL__SUBMODULEDEFS);
		createEReference(executionControlEClass, EXECUTION_CONTROL__SUBMODULEDEF);
		createEReference(executionControlEClass, EXECUTION_CONTROL__UNIT_DEFINITION);
		createEAttribute(executionControlEClass, EXECUTION_CONTROL__NAME);
		createEAttribute(executionControlEClass, EXECUTION_CONTROL__SRCID);
		createEAttribute(executionControlEClass, EXECUTION_CONTROL__VERSION);

		ifTypeEClass = createEClass(IF_TYPE);
		createEReference(ifTypeEClass, IF_TYPE__PHASE);
		createEReference(ifTypeEClass, IF_TYPE__OPTIONS);
		createEReference(ifTypeEClass, IF_TYPE__SUBMODULEREF);
		createEAttribute(ifTypeEClass, IF_TYPE__TEST);

		moduleEClass = createEClass(MODULE);
		createEAttribute(moduleEClass, MODULE__DESCRIPTION);
		createEReference(moduleEClass, MODULE__OPTIONS);
		createEAttribute(moduleEClass, MODULE__POSTEVENT);
		createEAttribute(moduleEClass, MODULE__REVOKEMODULE);
		createEAttribute(moduleEClass, MODULE__PASSWORD);
		createEReference(moduleEClass, MODULE__PRECEDENCES);
		createEReference(moduleEClass, MODULE__PHASELIST);
		createEAttribute(moduleEClass, MODULE__CHECKMODE);
		createEAttribute(moduleEClass, MODULE__ERRIGNORABLE);
		createEAttribute(moduleEClass, MODULE__INTERRUPTABLE);
		createEAttribute(moduleEClass, MODULE__MANDATORY);
		createEAttribute(moduleEClass, MODULE__NAME);
		createEAttribute(moduleEClass, MODULE__RESELECT);
		createEAttribute(moduleEClass, MODULE__REVOKEAUTONEXT);
		createEAttribute(moduleEClass, MODULE__TYPE);
		createEAttribute(moduleEClass, MODULE__UNIQUEEXEC);

		modulesEClass = createEClass(MODULES);
		createEReference(modulesEClass, MODULES__MODULE);
		createEAttribute(modulesEClass, MODULES__SRCID);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__OPTION);
		createEReference(notEClass, NOT__AND);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__NAME);
		createEAttribute(optionEClass, OPTION__VALUE);

		optListEClass = createEClass(OPT_LIST);
		createEReference(optListEClass, OPT_LIST__OPTION);
		createEReference(optListEClass, OPT_LIST__OR);
		createEReference(optListEClass, OPT_LIST__NOT);
		createEReference(optListEClass, OPT_LIST__AND);

		orEClass = createEClass(OR);
		createEReference(orEClass, OR__OPTION);
		createEReference(orEClass, OR__AND);
		createEReference(orEClass, OR__NOT);

		phaseEClass = createEClass(PHASE);
		createEReference(phaseEClass, PHASE__OPTIONS);
		createEReference(phaseEClass, PHASE__ARGS);
		createEAttribute(phaseEClass, PHASE__ACTION);
		createEAttribute(phaseEClass, PHASE__USAGE);
		createEReference(phaseEClass, PHASE__IF);
		createEAttribute(phaseEClass, PHASE__AUTOREPEAT);
		createEAttribute(phaseEClass, PHASE__BUFFERSYNC);
		createEAttribute(phaseEClass, PHASE__CHECKUVERS);
		createEAttribute(phaseEClass, PHASE__CONNECT);
		createEAttribute(phaseEClass, PHASE__CONTINUE_ON_OQ_ERRORS);
		createEAttribute(phaseEClass, PHASE__ELGFILE);
		createEAttribute(phaseEClass, PHASE__IGNORABLE);
		createEAttribute(phaseEClass, PHASE__LOGFILE);
		createEAttribute(phaseEClass, PHASE__NAME);
		createEAttribute(phaseEClass, PHASE__PASSWORD);
		createEAttribute(phaseEClass, PHASE__UNLOCKONERROR);

		phaselistEClass = createEClass(PHASELIST);
		createEReference(phaselistEClass, PHASELIST__PHASE);
		createEReference(phaselistEClass, PHASELIST__IF);
		createEReference(phaselistEClass, PHASELIST__SUBMODULE);
		createEReference(phaselistEClass, PHASELIST__SUBMODULEREF);
		createEAttribute(phaselistEClass, PHASELIST__SRCID);

		precedencesEClass = createEClass(PRECEDENCES);
		createEAttribute(precedencesEClass, PRECEDENCES__PRECEDENCE);

		subModuleEClass = createEClass(SUB_MODULE);
		createEReference(subModuleEClass, SUB_MODULE__OPTIONS);
		createEReference(subModuleEClass, SUB_MODULE__PHASELIST);
		createEAttribute(subModuleEClass, SUB_MODULE__EXECPARALLEL);
		createEAttribute(subModuleEClass, SUB_MODULE__PASSWORD);

		submoduleDefEClass = createEClass(SUBMODULE_DEF);
		createEReference(submoduleDefEClass, SUBMODULE_DEF__DEFS);
		createEReference(submoduleDefEClass, SUBMODULE_DEF__PHASELIST);
		createEAttribute(submoduleDefEClass, SUBMODULE_DEF__NAME);
		createEAttribute(submoduleDefEClass, SUBMODULE_DEF__PASSWORD);

		submoduleDefsEClass = createEClass(SUBMODULE_DEFS);
		createEReference(submoduleDefsEClass, SUBMODULE_DEFS__SUBMODULEDEF);
		createEReference(submoduleDefsEClass, SUBMODULE_DEFS__IF);
		createEAttribute(submoduleDefsEClass, SUBMODULE_DEFS__SRCID);

		subModuleRefEClass = createEClass(SUB_MODULE_REF);
		createEReference(subModuleRefEClass, SUB_MODULE_REF__OPTIONS);
		createEReference(subModuleRefEClass, SUB_MODULE_REF__DEFS);
		createEAttribute(subModuleRefEClass, SUB_MODULE_REF__NAME);
		createEAttribute(subModuleRefEClass, SUB_MODULE_REF__PASSWORD);
		createEAttribute(subModuleRefEClass, SUB_MODULE_REF__REFNAME);

		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__TITLE);
		createEReference(unitEClass, UNIT__UNITMODULES);
		createEAttribute(unitEClass, UNIT__ID);
		createEAttribute(unitEClass, UNIT__NAME);
		createEAttribute(unitEClass, UNIT__TYPE);

		unitDefEClass = createEClass(UNIT_DEF);
		createEReference(unitDefEClass, UNIT_DEF__UNIT);
		createEAttribute(unitDefEClass, UNIT_DEF__NAME);
		createEAttribute(unitDefEClass, UNIT_DEF__SRCID);

		unitModListEClass = createEClass(UNIT_MOD_LIST);
		createEReference(unitModListEClass, UNIT_MOD_LIST__UNITMODULE);

		unitModuleEClass = createEClass(UNIT_MODULE);
		createEReference(unitModuleEClass, UNIT_MODULE__OPTIONS);
		createEAttribute(unitModuleEClass, UNIT_MODULE__NAME);

		// Create enums
		moduleTypeEEnum = createEEnum(MODULE_TYPE);

		// Create data types
		moduleTypeObjectEDataType = createEDataType(MODULE_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnd_Option(), this.getOption(), null, "option", null, 0, 10, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnd_Or(), this.getOr(), null, "or", null, 0, 10, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnd_Not(), this.getNot(), null, "not", null, 0, 10, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentsEClass, Arguments.class, "Arguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArguments_Arg(), theXMLTypePackage.getString(), "arg", null, 0, -1, Arguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionsEClass, Definitions.class, "Definitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefinitions_Def(), theXMLTypePackage.getString(), "def", null, 0, -1, Definitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExecutionControl(), this.getExecutionControl(), null, "executionControl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(executionControlEClass, ExecutionControl.class, "ExecutionControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionControl_Modules(), this.getModules(), null, "modules", null, 0, -1, ExecutionControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionControl_Submoduledefs(), this.getSubmoduleDefs(), null, "submoduledefs", null, 0, -1, ExecutionControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionControl_Submoduledef(), this.getSubmoduleDef(), null, "submoduledef", null, 0, -1, ExecutionControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionControl_UnitDefinition(), this.getUnitDef(), null, "unitDefinition", null, 0, -1, ExecutionControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionControl_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ExecutionControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionControl_Srcid(), theXMLTypePackage.getString(), "srcid", null, 1, 1, ExecutionControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionControl_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, ExecutionControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifTypeEClass, IfType.class, "IfType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfType_Phase(), this.getPhase(), null, "phase", null, 0, -1, IfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfType_Options(), this.getOptList(), null, "options", null, 0, -1, IfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfType_Submoduleref(), this.getSubModuleRef(), null, "submoduleref", null, 0, -1, IfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIfType_Test(), theXMLTypePackage.getString(), "test", null, 1, 1, IfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModule_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Options(), this.getOptList(), null, "options", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Postevent(), theXMLTypePackage.getString(), "postevent", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Revokemodule(), theXMLTypePackage.getString(), "revokemodule", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Precedences(), this.getPrecedences(), null, "precedences", null, 0, 10, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Phaselist(), this.getPhaselist(), null, "phaselist", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Checkmode(), theXMLTypePackage.getString(), "checkmode", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Errignorable(), theXMLTypePackage.getString(), "errignorable", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Interruptable(), theXMLTypePackage.getString(), "interruptable", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Mandatory(), theXMLTypePackage.getString(), "mandatory", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Reselect(), theXMLTypePackage.getString(), "reselect", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Revokeautonext(), theXMLTypePackage.getString(), "revokeautonext", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Type(), this.getModuleType(), "type", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Uniqueexec(), theXMLTypePackage.getString(), "uniqueexec", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modulesEClass, Modules.class, "Modules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModules_Module(), this.getModule(), null, "module", null, 0, -1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModules_Srcid(), theXMLTypePackage.getString(), "srcid", null, 1, 1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNot_Option(), this.getOption(), null, "option", null, 0, 10, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNot_And(), this.getAnd(), null, "and", null, 0, 10, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optListEClass, OptList.class, "OptList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptList_Option(), this.getOption(), null, "option", null, 0, -1, OptList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptList_Or(), this.getOr(), null, "or", null, 0, -1, OptList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptList_Not(), this.getNot(), null, "not", null, 0, -1, OptList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptList_And(), this.getAnd(), null, "and", null, 0, -1, OptList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOr_Option(), this.getOption(), null, "option", null, 0, 10, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOr_And(), this.getAnd(), null, "and", null, 0, 10, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOr_Not(), this.getNot(), null, "not", null, 0, 10, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phaseEClass, Phase.class, "Phase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhase_Options(), this.getOptList(), null, "options", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhase_Args(), this.getArguments(), null, "args", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_Action(), theXMLTypePackage.getString(), "action", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_Usage(), theXMLTypePackage.getString(), "usage", null, 0, 5, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhase_If(), this.getIfType(), null, "if", null, 0, 10, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_Autorepeat(), theXMLTypePackage.getString(), "autorepeat", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_Buffersync(), theXMLTypePackage.getBoolean(), "buffersync", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_Checkuvers(), theXMLTypePackage.getBoolean(), "checkuvers", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_Connect(), theXMLTypePackage.getString(), "connect", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_ContinueOnOqErrors(), theXMLTypePackage.getBoolean(), "continueOnOqErrors", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_Elgfile(), theXMLTypePackage.getString(), "elgfile", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_Ignorable(), theXMLTypePackage.getBoolean(), "ignorable", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_Logfile(), theXMLTypePackage.getString(), "logfile", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_Password(), theXMLTypePackage.getString(), "password", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_Unlockonerror(), theXMLTypePackage.getBoolean(), "unlockonerror", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phaselistEClass, Phaselist.class, "Phaselist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhaselist_Phase(), this.getPhase(), null, "phase", null, 0, -1, Phaselist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhaselist_If(), this.getIfType(), null, "if", null, 0, -1, Phaselist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhaselist_Submodule(), this.getSubModule(), null, "submodule", null, 0, -1, Phaselist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhaselist_Submoduleref(), this.getSubModuleRef(), null, "submoduleref", null, 0, -1, Phaselist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhaselist_Srcid(), theXMLTypePackage.getString(), "srcid", null, 0, 1, Phaselist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precedencesEClass, Precedences.class, "Precedences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecedences_Precedence(), theXMLTypePackage.getString(), "precedence", null, 0, -1, Precedences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subModuleEClass, SubModule.class, "SubModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubModule_Options(), this.getOptList(), null, "options", null, 0, -1, SubModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubModule_Phaselist(), this.getPhaselist(), null, "phaselist", null, 0, -1, SubModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubModule_Execparallel(), theXMLTypePackage.getBoolean(), "execparallel", null, 1, 1, SubModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubModule_Password(), theXMLTypePackage.getString(), "password", null, 1, 1, SubModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submoduleDefEClass, SubmoduleDef.class, "SubmoduleDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubmoduleDef_Defs(), this.getDefinitions(), null, "defs", null, 0, 1, SubmoduleDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmoduleDef_Phaselist(), this.getPhaselist(), null, "phaselist", null, 0, -1, SubmoduleDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubmoduleDef_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SubmoduleDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubmoduleDef_Password(), theXMLTypePackage.getString(), "password", null, 1, 1, SubmoduleDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submoduleDefsEClass, SubmoduleDefs.class, "SubmoduleDefs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubmoduleDefs_Submoduledef(), this.getSubmoduleDef(), null, "submoduledef", null, 0, -1, SubmoduleDefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmoduleDefs_If(), this.getIfType(), null, "if", null, 0, -1, SubmoduleDefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubmoduleDefs_Srcid(), theXMLTypePackage.getString(), "srcid", null, 1, 1, SubmoduleDefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subModuleRefEClass, SubModuleRef.class, "SubModuleRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubModuleRef_Options(), this.getOptList(), null, "options", null, 0, -1, SubModuleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubModuleRef_Defs(), this.getDefinitions(), null, "defs", null, 0, -1, SubModuleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubModuleRef_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SubModuleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubModuleRef_Password(), theXMLTypePackage.getString(), "password", null, 1, 1, SubModuleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubModuleRef_Refname(), theXMLTypePackage.getString(), "refname", null, 1, 1, SubModuleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_Unitmodules(), this.getUnitModList(), null, "unitmodules", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Type(), this.getModuleType(), "type", null, 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitDefEClass, UnitDef.class, "UnitDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitDef_Unit(), this.getUnit(), null, "unit", null, 0, -1, UnitDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitDef_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, UnitDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitDef_Srcid(), theXMLTypePackage.getString(), "srcid", null, 1, 1, UnitDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitModListEClass, UnitModList.class, "UnitModList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitModList_Unitmodule(), this.getUnitModule(), null, "unitmodule", null, 0, -1, UnitModList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitModuleEClass, UnitModule.class, "UnitModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitModule_Options(), this.getOptList(), null, "options", null, 0, -1, UnitModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitModule_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, UnitModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(moduleTypeEEnum, ModuleType.class, "ModuleType");
		addEEnumLiteral(moduleTypeEEnum, ModuleType.PREPARE);
		addEEnumLiteral(moduleTypeEEnum, ModuleType.UPGRADE);
		addEEnumLiteral(moduleTypeEEnum, ModuleType.REVOKE);

		// Initialize data types
		initEDataType(moduleTypeObjectEDataType, ModuleType.class, "ModuleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });	
		addAnnotation
		  (andEClass, 
		   source, 
		   new String[] {
			 "name", "And",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAnd_Option(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "option",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAnd_Or(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "or",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAnd_Not(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "not",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (argumentsEClass, 
		   source, 
		   new String[] {
			 "name", "Arguments",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getArguments_Arg(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "arg",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (definitionsEClass, 
		   source, 
		   new String[] {
			 "name", "Definitions",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDefinitions_Def(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "def",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_ExecutionControl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExecutionControl",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (executionControlEClass, 
		   source, 
		   new String[] {
			 "name", "ExecutionControl",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getExecutionControl_Modules(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "modules",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExecutionControl_Submoduledefs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "submoduledefs",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExecutionControl_Submoduledef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "submoduledef",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExecutionControl_UnitDefinition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UnitDefinition",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExecutionControl_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExecutionControl_Srcid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "srcid",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExecutionControl_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (ifTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IfType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIfType_Phase(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phase",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIfType_Options(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "options",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIfType_Submoduleref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "submoduleref",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIfType_Test(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "test",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (moduleEClass, 
		   source, 
		   new String[] {
			 "name", "Module",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getModule_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Options(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "options",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Postevent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "postevent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Revokemodule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "revokemodule",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Password(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "password",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Precedences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "precedences",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Phaselist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phaselist",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Checkmode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "checkmode",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Errignorable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "errignorable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Interruptable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "interruptable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Mandatory(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mandatory",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Reselect(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "reselect",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Revokeautonext(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "revokeautonext",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModule_Uniqueexec(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uniqueexec",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (modulesEClass, 
		   source, 
		   new String[] {
			 "name", "Modules",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getModules_Module(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "module",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModules_Srcid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "srcid",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (moduleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ModuleType"
		   });	
		addAnnotation
		  (moduleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ModuleType:Object",
			 "baseType", "ModuleType"
		   });	
		addAnnotation
		  (notEClass, 
		   source, 
		   new String[] {
			 "name", "Not",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNot_Option(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "option",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNot_And(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "and",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (optionEClass, 
		   source, 
		   new String[] {
			 "name", "Option",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getOption_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOption_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (optListEClass, 
		   source, 
		   new String[] {
			 "name", "OptList",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOptList_Option(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "option",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOptList_Or(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "or",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOptList_Not(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "not",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOptList_And(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "and",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (orEClass, 
		   source, 
		   new String[] {
			 "name", "Or",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOr_Option(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "option",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOr_And(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "and",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOr_Not(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "not",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (phaseEClass, 
		   source, 
		   new String[] {
			 "name", "Phase",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPhase_Options(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "options",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_Args(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "args",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_Action(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "action",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_Usage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "usage",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_If(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "if",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_Autorepeat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "autorepeat",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_Buffersync(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "buffersync",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_Checkuvers(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "checkuvers",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_Connect(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "connect",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_ContinueOnOqErrors(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "continue_on_oq_errors",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_Elgfile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "elgfile",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_Ignorable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ignorable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_Logfile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "logfile",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_Password(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "password",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhase_Unlockonerror(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unlockonerror",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (phaselistEClass, 
		   source, 
		   new String[] {
			 "name", "Phaselist",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPhaselist_Phase(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phase",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhaselist_If(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "if",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhaselist_Submodule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "submodule",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhaselist_Submoduleref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "submoduleref",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPhaselist_Srcid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "srcid",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (precedencesEClass, 
		   source, 
		   new String[] {
			 "name", "Precedences",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPrecedences_Precedence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "precedence",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (subModuleEClass, 
		   source, 
		   new String[] {
			 "name", "SubModule",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSubModule_Options(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "options",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSubModule_Phaselist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phaselist",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSubModule_Execparallel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "execparallel",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSubModule_Password(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "password",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (submoduleDefEClass, 
		   source, 
		   new String[] {
			 "name", "SubmoduleDef",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSubmoduleDef_Defs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defs",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSubmoduleDef_Phaselist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phaselist",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSubmoduleDef_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSubmoduleDef_Password(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "password",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (submoduleDefsEClass, 
		   source, 
		   new String[] {
			 "name", "SubmoduleDefs",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSubmoduleDefs_Submoduledef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "submoduledef",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSubmoduleDefs_If(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "if",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSubmoduleDefs_Srcid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "srcid",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (subModuleRefEClass, 
		   source, 
		   new String[] {
			 "name", "SubModuleRef",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSubModuleRef_Options(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "options",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSubModuleRef_Defs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defs",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSubModuleRef_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSubModuleRef_Password(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "password",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSubModuleRef_Refname(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "refname",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (unitEClass, 
		   source, 
		   new String[] {
			 "name", "Unit",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getUnit_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUnit_Unitmodules(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unitmodules",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUnit_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUnit_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUnit_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (unitDefEClass, 
		   source, 
		   new String[] {
			 "name", "UnitDef",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getUnitDef_Unit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unit",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUnitDef_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUnitDef_Srcid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "srcid",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (unitModListEClass, 
		   source, 
		   new String[] {
			 "name", "UnitModList",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getUnitModList_Unitmodule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unitmodule",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (unitModuleEClass, 
		   source, 
		   new String[] {
			 "name", "UnitModule",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getUnitModule_Options(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "options",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUnitModule_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });
	}

} //TrialplePackageImpl
