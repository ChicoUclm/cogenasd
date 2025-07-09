/**
 */
package teaw.tests;

import junit.textui.TestRunner;

import teaw.Prize;
import teaw.TeawFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prize</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrizeTest extends TransictionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrizeTest.class);
	}

	/**
	 * Constructs a new Prize test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrizeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Prize test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Prize getFixture() {
		return (Prize)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TeawFactory.eINSTANCE.createPrize());
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

} //PrizeTest
