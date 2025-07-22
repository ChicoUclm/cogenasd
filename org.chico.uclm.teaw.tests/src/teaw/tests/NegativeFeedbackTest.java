/**
 */
package teaw.tests;

import junit.textui.TestRunner;

import teaw.NegativeFeedback;
import teaw.TeawFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Negative Feedback</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NegativeFeedbackTest extends FeedbackTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NegativeFeedbackTest.class);
	}

	/**
	 * Constructs a new Negative Feedback test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeFeedbackTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Negative Feedback test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NegativeFeedback getFixture() {
		return (NegativeFeedback)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TeawFactory.eINSTANCE.createNegativeFeedback());
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

} //NegativeFeedbackTest
