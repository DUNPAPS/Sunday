/**
 */
package com.herbert.trialple.model.resource;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import Trialple.DocumentRoot;
import Trialple.ExecutionControl;
import Trialple.Module;
import Trialple.Modules;
import Trialple.TrialpleFactory;
import Trialple.TrialplePackage;
import Trialple.util.TrialpleResourceFactoryImpl;

/**
 * <!-- begin-user-doc --> A sample utility for the '<em><b>ecatt</b></em>'
 * package. <!-- end-user-doc -->
 * 
 * @generated
 */
public class WriteFile {
	/**
	 * <!-- begin-user-doc --> Load all the argument file paths or URIs as
	 * instances of the model. <!-- end-user-doc -->
	 * 
	 * @param args
	 *            the file paths or URIs.
	 * @generated
	 */
	public static void main(String[] args) {
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new TrialpleResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(TrialplePackage.eNS_URI,
				TrialplePackage.eINSTANCE);

		// If there are no arguments, emit an appropriate usage message.
		//
		try {
			Resource resource = resourceSet.createResource(URI
					.createURI("http:///My.ecatt"));
			DocumentRoot documentRoot = TrialpleFactory.eINSTANCE
					.createDocumentRoot();
			ExecutionControl createExecutionControl = TrialpleFactory.eINSTANCE
					.createExecutionControl();
			documentRoot.setExecutionControl(createExecutionControl);
			Modules createModules = TrialpleFactory.eINSTANCE.createModules();
			Module createModule = TrialpleFactory.eINSTANCE.createModule();
			createModule.setName("Mic Test");
			createModule.setCheckmode("chill Mode");
			EList<Module> module = createModules.getModule();
			module.add(createModule);
			createExecutionControl.setModules(createModules);
			resource.getContents().add(documentRoot);
			resource.save(System.out, null);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

} // EcattExample
