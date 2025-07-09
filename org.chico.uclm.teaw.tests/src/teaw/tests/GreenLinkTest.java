/**
 */
package teaw.tests;

import junit.textui.TestRunner;

import teaw.GreenLink;
import teaw.TeawFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Green Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GreenLinkTest extends LinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GreenLinkTest.class);
	}

	/**
	 * Constructs a new Green Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreenLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Green Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GreenLink getFixture() {
		return (GreenLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TeawFactory.eINSTANCE.createGreenLink());
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

} //GreenLinkTest
