/**
 */
package teaw.tests;

import junit.textui.TestRunner;

import teaw.TeawFactory;
import teaw.WaitTime;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wait Time</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WaitTimeTest extends TransictionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WaitTimeTest.class);
	}

	/**
	 * Constructs a new Wait Time test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitTimeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Wait Time test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WaitTime getFixture() {
		return (WaitTime)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TeawFactory.eINSTANCE.createWaitTime());
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

} //WaitTimeTest
