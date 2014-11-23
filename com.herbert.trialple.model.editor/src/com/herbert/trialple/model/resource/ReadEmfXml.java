//package com.herbert.trialple.model.resource;
//
//import org.eclipse.emf.common.util.EList;
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//
//import Trialple.DocumentRoot;
//import Trialple.TrialplePackage;
//import Trialple.util.TrialpleResourceFactoryImpl;
//
//public class ReadEmfXml {
//	/**
//	 * 
//	 * @param args
//	 */
//	private final static String CONTENT_FILE = "C:/Users/D063076/Desktop/new_trial_phl .xml";
//	public static void main(String[] args) {
//		ResourceSet resourceSet = new ResourceSetImpl();
//		resourceSet.getPackageRegistry().put(TrialplePackage.eNS_URI, TrialplePackage.eINSTANCE);
//		/*Register the package for loading*/
//
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
//		.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new TrialpleResourceFactoryImpl());
//		
//		final URI platformResourceURI = URI.createFileURI(CONTENT_FILE);
//		Resource resource = resourceSet.getResource(platformResourceURI, true);
//		EObject rootObject = getRootObject(resource);
//	}
//	protected static EObject getRootObject(Resource resource) {
//		EList<EObject> contents = resource.getContents();
//		if (contents.size() == 0) {
//			// something wrong, but what? I don't understand.
//			return null;
//		}
//		EObject documentRoot = contents.get(0);
//		if (documentRoot != null) {
//			for (EObject element : documentRoot.eContents()) {
//				if (element instanceof DocumentRoot) {
//					return element;
//				}
//			}
//		}
//		if (documentRoot instanceof DocumentRoot) {
//			return documentRoot;
//		}
//		return null;
//	}
//
// }
