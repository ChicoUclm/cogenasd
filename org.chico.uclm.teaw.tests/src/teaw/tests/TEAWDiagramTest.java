/**
 */
package teaw.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import teaw.TEAWDiagram;
import teaw.TeawFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TEAW Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TEAWDiagramTest extends TestCase {

	/**
	 * The fixture for this TEAW Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEAWDiagram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TEAWDiagramTest.class);
	}

	/**
	 * Constructs a new TEAW Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEAWDiagramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this TEAW Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TEAWDiagram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this TEAW Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEAWDiagram getFixture() {
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
		setFixture(TeawFactory.eINSTANCE.createTEAWDiagram());
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

} //TEAWDiagramTest
