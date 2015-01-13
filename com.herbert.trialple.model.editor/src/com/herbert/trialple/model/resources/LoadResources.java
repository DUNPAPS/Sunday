/**
 */
package com.herbert.trialple.model.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import Trialple.DocumentRoot;
import Trialple.Module;
import Trialple.TrialplePackage;
import Trialple.util.TrialpleResourceFactoryImpl;

/**
 * <!-- begin-user-doc --> A sample utility for the '<em><b>ecatt</b></em>'
 * package. <!-- end-user-doc -->
 * 
 * @generated
 */
public class LoadResources {
	
	private static EObject rootObject;


	public LoadResources(){
		
	}
	
	public void loadResouces(String resources) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(TrialplePackage.eNS_URI, TrialplePackage.eINSTANCE);
		/*Register the package for loading*/

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
		.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new TrialpleResourceFactoryImpl());
		
		final URI platformResourceURI = URI.createFileURI(resources);
		
		Resource resource = resourceSet.getResource(platformResourceURI, true);
		System.out.println(resource);
		rootObject = getRootObject(resource);
	}
	
	/**
	 * The method loads returns the root object of the read XML file needed to populate the 
	 * fields in the UI
	 * @param resource
	 * @return documentRoot
	 */
	protected static EObject getRootObject(Resource resource) {
		EList<EObject> contents = resource.getContents();
		if (contents.size() == 0) {
			return null;
		}
		EObject documentRoot = contents.get(0);
		if (documentRoot != null) {
			for (EObject element : documentRoot.eContents()) {
				if (element instanceof DocumentRoot) {
					return element;
				}
			}
		}
		
		if (documentRoot instanceof DocumentRoot) {
			return documentRoot;
		}
		
		return null;
	}

	public EObject getRootObject() {
		return rootObject;
	}
	
	protected static EObject getModuleList(Resource resource) {
		return null;
		
	}
	
//	protected  EObject getModuleObjects(Resource resource){
//		EList<EObject> contents = resource.getContents();
//		if (contents.size() == 0) {
//			return null;
//		}
//		EObject moduleObjects = contents.get(0);
//		if(moduleObjects !=null){
//			for(EObject element : moduleObjects.eContents()){
//				if(element instanceof Module){
//					return element;
//				}
//			}
//			
//		}
//		if (moduleObjects instanceof Module) {
//			return moduleObjects;
//		}
//		return null;
//	}

	
}
