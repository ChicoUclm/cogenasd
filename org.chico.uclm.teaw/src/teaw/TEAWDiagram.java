/**
 */
package teaw;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEAW Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link teaw.TEAWDiagram#getItsNodes <em>Its Nodes</em>}</li>
 * </ul>
 *
 * @see teaw.TeawPackage#getTEAWDiagram()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface TEAWDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Its Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link teaw.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Nodes</em>' containment reference list.
	 * @see teaw.TeawPackage#getTEAWDiagram_ItsNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getItsNodes();

} // TEAWDiagram
