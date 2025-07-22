/**
 */
package teaw.tests;

import junit.textui.TestRunner;

import teaw.TeawFactory;
import teaw.Transiction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transiction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransictionTest extends PlanningNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransictionTest.class);
	}

	/**
	 * Constructs a new Transiction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransictionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transiction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Transiction getFixture() {
		return (Transiction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TeawFactory.eINSTANCE.createTransiction());
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

} //TransictionTest
