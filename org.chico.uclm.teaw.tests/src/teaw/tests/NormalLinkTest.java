/**
 */
package teaw.tests;

import junit.textui.TestRunner;

import teaw.NormalLink;
import teaw.TeawFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Normal Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NormalLinkTest extends LinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NormalLinkTest.class);
	}

	/**
	 * Constructs a new Normal Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Normal Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NormalLink getFixture() {
		return (NormalLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TeawFactory.eINSTANCE.createNormalLink());
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

} //NormalLinkTest
