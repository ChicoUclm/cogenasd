/**
 */
package teaw.tests;

import junit.textui.TestRunner;

import teaw.PositiveFeedback;
import teaw.TeawFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Positive Feedback</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PositiveFeedbackTest extends FeedbackTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PositiveFeedbackTest.class);
	}

	/**
	 * Constructs a new Positive Feedback test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveFeedbackTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Positive Feedback test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PositiveFeedback getFixture() {
		return (PositiveFeedback)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TeawFactory.eINSTANCE.createPositiveFeedback());
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

} //PositiveFeedbackTest
