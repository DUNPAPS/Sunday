/**
 */
package Trialple.provider;

import Trialple.util.TrialpleAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TrialpleItemProviderAdapterFactory extends TrialpleAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrialpleItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.And} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndItemProvider andItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.And}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndAdapter() {
		if (andItemProvider == null) {
			andItemProvider = new AndItemProvider(this);
		}

		return andItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.Arguments} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentsItemProvider argumentsItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.Arguments}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentsAdapter() {
		if (argumentsItemProvider == null) {
			argumentsItemProvider = new ArgumentsItemProvider(this);
		}

		return argumentsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.ArgxType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgxTypeItemProvider argxTypeItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.ArgxType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgxTypeAdapter() {
		if (argxTypeItemProvider == null) {
			argxTypeItemProvider = new ArgxTypeItemProvider(this);
		}

		return argxTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.Def} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefItemProvider defItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.Def}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefAdapter() {
		if (defItemProvider == null) {
			defItemProvider = new DefItemProvider(this);
		}

		return defItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.Definitions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionsItemProvider definitionsItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.Definitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefinitionsAdapter() {
		if (definitionsItemProvider == null) {
			definitionsItemProvider = new DefinitionsItemProvider(this);
		}

		return definitionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.ExecutionControl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionControlItemProvider executionControlItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.ExecutionControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutionControlAdapter() {
		if (executionControlItemProvider == null) {
			executionControlItemProvider = new ExecutionControlItemProvider(this);
		}

		return executionControlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.IfType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfTypeItemProvider ifTypeItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.IfType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfTypeAdapter() {
		if (ifTypeItemProvider == null) {
			ifTypeItemProvider = new IfTypeItemProvider(this);
		}

		return ifTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.Module} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleItemProvider moduleItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleAdapter() {
		if (moduleItemProvider == null) {
			moduleItemProvider = new ModuleItemProvider(this);
		}

		return moduleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.ModuleList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleListItemProvider moduleListItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.ModuleList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleListAdapter() {
		if (moduleListItemProvider == null) {
			moduleListItemProvider = new ModuleListItemProvider(this);
		}

		return moduleListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.Modules} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModulesItemProvider modulesItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.Modules}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModulesAdapter() {
		if (modulesItemProvider == null) {
			modulesItemProvider = new ModulesItemProvider(this);
		}

		return modulesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.Not} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotItemProvider notItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.Not}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotAdapter() {
		if (notItemProvider == null) {
			notItemProvider = new NotItemProvider(this);
		}

		return notItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.Option} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionItemProvider optionItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptionAdapter() {
		if (optionItemProvider == null) {
			optionItemProvider = new OptionItemProvider(this);
		}

		return optionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.OptList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptListItemProvider optListItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.OptList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptListAdapter() {
		if (optListItemProvider == null) {
			optListItemProvider = new OptListItemProvider(this);
		}

		return optListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.Or} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrItemProvider orItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.Or}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrAdapter() {
		if (orItemProvider == null) {
			orItemProvider = new OrItemProvider(this);
		}

		return orItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.Phase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseItemProvider phaseItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.Phase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPhaseAdapter() {
		if (phaseItemProvider == null) {
			phaseItemProvider = new PhaseItemProvider(this);
		}

		return phaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.Phaselist} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaselistItemProvider phaselistItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.Phaselist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPhaselistAdapter() {
		if (phaselistItemProvider == null) {
			phaselistItemProvider = new PhaselistItemProvider(this);
		}

		return phaselistItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.Precedences} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedencesItemProvider precedencesItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.Precedences}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrecedencesAdapter() {
		if (precedencesItemProvider == null) {
			precedencesItemProvider = new PrecedencesItemProvider(this);
		}

		return precedencesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.SubModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubModuleItemProvider subModuleItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.SubModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubModuleAdapter() {
		if (subModuleItemProvider == null) {
			subModuleItemProvider = new SubModuleItemProvider(this);
		}

		return subModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.SubmoduleDef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmoduleDefItemProvider submoduleDefItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.SubmoduleDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubmoduleDefAdapter() {
		if (submoduleDefItemProvider == null) {
			submoduleDefItemProvider = new SubmoduleDefItemProvider(this);
		}

		return submoduleDefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.SubmoduleDefs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmoduleDefsItemProvider submoduleDefsItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.SubmoduleDefs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubmoduleDefsAdapter() {
		if (submoduleDefsItemProvider == null) {
			submoduleDefsItemProvider = new SubmoduleDefsItemProvider(this);
		}

		return submoduleDefsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.SubModuleRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubModuleRefItemProvider subModuleRefItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.SubModuleRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubModuleRefAdapter() {
		if (subModuleRefItemProvider == null) {
			subModuleRefItemProvider = new SubModuleRefItemProvider(this);
		}

		return subModuleRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.Unit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitItemProvider unitItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnitAdapter() {
		if (unitItemProvider == null) {
			unitItemProvider = new UnitItemProvider(this);
		}

		return unitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.UnitDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitDefinitionItemProvider unitDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.UnitDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnitDefinitionAdapter() {
		if (unitDefinitionItemProvider == null) {
			unitDefinitionItemProvider = new UnitDefinitionItemProvider(this);
		}

		return unitDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.UnitModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitModuleItemProvider unitModuleItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.UnitModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnitModuleAdapter() {
		if (unitModuleItemProvider == null) {
			unitModuleItemProvider = new UnitModuleItemProvider(this);
		}

		return unitModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Trialple.UnitModuleList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitModuleListItemProvider unitModuleListItemProvider;

	/**
	 * This creates an adapter for a {@link Trialple.UnitModuleList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnitModuleListAdapter() {
		if (unitModuleListItemProvider == null) {
			unitModuleListItemProvider = new UnitModuleListItemProvider(this);
		}

		return unitModuleListItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (andItemProvider != null) andItemProvider.dispose();
		if (argumentsItemProvider != null) argumentsItemProvider.dispose();
		if (argxTypeItemProvider != null) argxTypeItemProvider.dispose();
		if (defItemProvider != null) defItemProvider.dispose();
		if (definitionsItemProvider != null) definitionsItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (executionControlItemProvider != null) executionControlItemProvider.dispose();
		if (ifTypeItemProvider != null) ifTypeItemProvider.dispose();
		if (moduleItemProvider != null) moduleItemProvider.dispose();
		if (moduleListItemProvider != null) moduleListItemProvider.dispose();
		if (modulesItemProvider != null) modulesItemProvider.dispose();
		if (notItemProvider != null) notItemProvider.dispose();
		if (optionItemProvider != null) optionItemProvider.dispose();
		if (optListItemProvider != null) optListItemProvider.dispose();
		if (orItemProvider != null) orItemProvider.dispose();
		if (phaseItemProvider != null) phaseItemProvider.dispose();
		if (phaselistItemProvider != null) phaselistItemProvider.dispose();
		if (precedencesItemProvider != null) precedencesItemProvider.dispose();
		if (subModuleItemProvider != null) subModuleItemProvider.dispose();
		if (submoduleDefItemProvider != null) submoduleDefItemProvider.dispose();
		if (submoduleDefsItemProvider != null) submoduleDefsItemProvider.dispose();
		if (subModuleRefItemProvider != null) subModuleRefItemProvider.dispose();
		if (unitItemProvider != null) unitItemProvider.dispose();
		if (unitDefinitionItemProvider != null) unitDefinitionItemProvider.dispose();
		if (unitModuleItemProvider != null) unitModuleItemProvider.dispose();
		if (unitModuleListItemProvider != null) unitModuleListItemProvider.dispose();
	}

}
