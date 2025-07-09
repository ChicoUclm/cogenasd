/**
 */
package teaw.tests;

import junit.textui.TestRunner;

import teaw.Emotions;
import teaw.TeawFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Emotions</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmotionsTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EmotionsTest.class);
	}

	/**
	 * Constructs a new Emotions test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmotionsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Emotions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Emotions getFixture() {
		return (Emotions)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TeawFactory.eINSTANCE.createEmotions());
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

} //EmotionsTest
