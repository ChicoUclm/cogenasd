/**
 */
package teaw.tests;

import junit.textui.TestRunner;

import teaw.Planning;
import teaw.TeawFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Planning</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanningTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlanningTest.class);
	}

	/**
	 * Constructs a new Planning test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanningTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Planning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Planning getFixture() {
		return (Planning)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TeawFactory.eINSTANCE.createPlanning());
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

} //PlanningTest
