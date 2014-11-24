/**
 *
 * $Id$
 */
package Trialple.validation;

import Trialple.Arguments;
import Trialple.IfType;
import Trialple.OptList;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Trialple.Phase}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PhaseValidator {
	boolean validate();

	boolean validateOptions(OptList value);
	boolean validateArgs(Arguments value);
	boolean validateAction(String value);
	boolean validateUsage(EList<String> value);
	boolean validateIf(EList<IfType> value);
	boolean validateAutorepeat(String value);
	boolean validateBuffersync(boolean value);
	boolean validateCheckuvers(boolean value);
	boolean validateConnect(String value);
	boolean validateContinueOnOqErrors(boolean value);
	boolean validateElgfile(String value);
	boolean validateIgnorable(boolean value);
	boolean validateLogfile(String value);
	boolean validateName(String value);
	boolean validatePassword(String value);
	boolean validateUnlockonerror(boolean value);
}