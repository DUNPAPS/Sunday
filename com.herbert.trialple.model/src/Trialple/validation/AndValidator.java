/**
 *
 * $Id$
 */
package Trialple.validation;

import Trialple.Not;
import Trialple.Option;
import Trialple.Or;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Trialple.And}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AndValidator {
	boolean validate();

	boolean validateOption(EList<Option> value);
	boolean validateOr(EList<Or> value);
	boolean validateNot(EList<Not> value);
}