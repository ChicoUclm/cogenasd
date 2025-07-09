/**
 */
package teaw;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link teaw.Planning#getName <em>Name</em>}</li>
 *   <li>{@link teaw.Planning#getPlanningNodes <em>Planning Nodes</em>}</li>
 *   <li>{@link teaw.Planning#getNormalLinks <em>Normal Links</em>}</li>
 * </ul>
 *
 * @see teaw.TeawPackage#getPlanning()
 * @model annotation="gmf.node label='name' tool.name='Planning' tool.small.bundle='org.chico.uclm.teaw.figures' tool.small.path='images/planning_arasaac32.png'"
 * @generated
 */
public interface Planning extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"<Planning ...>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see teaw.TeawPackage#getPlanning_Name()
	 * @model default="&lt;Planning ...&gt;"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link teaw.Planning#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Planning Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link teaw.PlanningNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning Nodes</em>' containment reference list.
	 * @see teaw.TeawPackage#getPlanning_PlanningNodes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free' collapsible='false'"
	 * @generated
	 */
	EList<PlanningNode> getPlanningNodes();

	/**
	 * Returns the value of the '<em><b>Normal Links</b></em>' containment reference list.
	 * The list contents are of type {@link teaw.NormalLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Links</em>' containment reference list.
	 * @see teaw.TeawPackage#getPlanning_NormalLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<NormalLink> getNormalLinks();

} // Planning
