/**
 */
package Trialple.phaselist.model.tests;

import Trialple.Phaselist;
import Trialple.TrialpleFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Phaselist</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhaselistTest extends TestCase {

	/**
	 * The fixture for this Phaselist test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Phaselist fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PhaselistTest.class);
	}

	/**
	 * Constructs a new Phaselist test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaselistTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Phaselist test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Phaselist fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Phaselist test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Phaselist getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TrialpleFactory.eINSTANCE.createPhaselist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PhaselistTest
