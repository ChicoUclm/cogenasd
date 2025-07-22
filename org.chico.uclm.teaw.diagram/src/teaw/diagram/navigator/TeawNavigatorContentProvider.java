/*
* 
*/
package teaw.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import teaw.diagram.edit.parts.ActionEditPart;
import teaw.diagram.edit.parts.CommunicationBookEditPart;
import teaw.diagram.edit.parts.EmotionChoiceEditPart;
import teaw.diagram.edit.parts.EmotionEditPart;
import teaw.diagram.edit.parts.EmotionsEditPart;
import teaw.diagram.edit.parts.EmotionsEmotionsEmotionsCompartmentEditPart;
import teaw.diagram.edit.parts.GreenLinkEditPart;
import teaw.diagram.edit.parts.NegativeFeedbackEditPart;
import teaw.diagram.edit.parts.NormalLinkEditPart;
import teaw.diagram.edit.parts.PersonEditPart;
import teaw.diagram.edit.parts.PlaceEditPart;
import teaw.diagram.edit.parts.PlanningEditPart;
import teaw.diagram.edit.parts.PlanningPlanningPlanningNodesCompartmentEditPart;
import teaw.diagram.edit.parts.PositiveFeedbackEditPart;
import teaw.diagram.edit.parts.PrizeEditPart;
import teaw.diagram.edit.parts.ReaminingObjectEditPart;
import teaw.diagram.edit.parts.RedLinkEditPart;
import teaw.diagram.edit.parts.SocialStoryEditPart;
import teaw.diagram.edit.parts.SoothingObjectEditPart;
import teaw.diagram.edit.parts.TEAWDiagramEditPart;
import teaw.diagram.edit.parts.WaitTimeEditPart;
import teaw.diagram.part.Messages;
import teaw.diagram.part.TeawVisualIDRegistry;

/**
 * @generated
 */
public class TeawNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public TeawNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<TeawNavigatorItem> result = new ArrayList<TeawNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, TEAWDiagramEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof TeawNavigatorGroup) {
			TeawNavigatorGroup group = (TeawNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof TeawNavigatorItem) {
			TeawNavigatorItem navigatorItem = (TeawNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (TeawVisualIDRegistry.getVisualID(view)) {

		case TEAWDiagramEditPart.VISUAL_ID: {
			LinkedList<TeawAbstractNavigatorItem> result = new LinkedList<TeawAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			TeawNavigatorGroup links = new TeawNavigatorGroup(Messages.NavigatorGroupName_TEAWDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(EmotionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(PlanningEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(NormalLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(RedLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(GreenLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case EmotionsEditPart.VISUAL_ID: {
			LinkedList<TeawAbstractNavigatorItem> result = new LinkedList<TeawAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(EmotionsEmotionsEmotionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TeawVisualIDRegistry.getType(EmotionChoiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(EmotionsEmotionsEmotionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, TeawVisualIDRegistry.getType(EmotionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(EmotionsEmotionsEmotionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TeawVisualIDRegistry.getType(PositiveFeedbackEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(EmotionsEmotionsEmotionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TeawVisualIDRegistry.getType(NegativeFeedbackEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case PlanningEditPart.VISUAL_ID: {
			LinkedList<TeawAbstractNavigatorItem> result = new LinkedList<TeawAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, TeawVisualIDRegistry.getType(PersonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, TeawVisualIDRegistry.getType(ActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, TeawVisualIDRegistry.getType(PlaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TeawVisualIDRegistry.getType(WaitTimeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, TeawVisualIDRegistry.getType(PrizeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TeawVisualIDRegistry.getType(SocialStoryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TeawVisualIDRegistry.getType(SoothingObjectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TeawVisualIDRegistry.getType(ReaminingObjectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TeawVisualIDRegistry.getType(CommunicationBookEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case EmotionChoiceEditPart.VISUAL_ID: {
			LinkedList<TeawAbstractNavigatorItem> result = new LinkedList<TeawAbstractNavigatorItem>();
			Node sv = (Node) view;
			TeawNavigatorGroup outgoinglinks = new TeawNavigatorGroup(
					Messages.NavigatorGroupName_EmotionChoice_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(RedLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(GreenLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EmotionEditPart.VISUAL_ID: {
			LinkedList<TeawAbstractNavigatorItem> result = new LinkedList<TeawAbstractNavigatorItem>();
			Node sv = (Node) view;
			TeawNavigatorGroup incominglinks = new TeawNavigatorGroup(
					Messages.NavigatorGroupName_Emotion_3002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(RedLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(GreenLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case PersonEditPart.VISUAL_ID: {
			LinkedList<TeawAbstractNavigatorItem> result = new LinkedList<TeawAbstractNavigatorItem>();
			Node sv = (Node) view;
			TeawNavigatorGroup incominglinks = new TeawNavigatorGroup(
					Messages.NavigatorGroupName_Person_3003_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			TeawNavigatorGroup outgoinglinks = new TeawNavigatorGroup(
					Messages.NavigatorGroupName_Person_3003_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(NormalLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(NormalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActionEditPart.VISUAL_ID: {
			LinkedList<TeawAbstractNavigatorItem> result = new LinkedList<TeawAbstractNavigatorItem>();
			Node sv = (Node) view;
			TeawNavigatorGroup incominglinks = new TeawNavigatorGroup(
					Messages.NavigatorGroupName_Action_3004_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			TeawNavigatorGroup outgoinglinks = new TeawNavigatorGroup(
					Messages.NavigatorGroupName_Action_3004_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(NormalLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(NormalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PlaceEditPart.VISUAL_ID: {
			LinkedList<TeawAbstractNavigatorItem> result = new LinkedList<TeawAbstractNavigatorItem>();
			Node sv = (Node) view;
			TeawNavigatorGroup incominglinks = new TeawNavigatorGroup(
					Messages.NavigatorGroupName_Place_3005_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			TeawNavigatorGroup outgoinglinks = new TeawNavigatorGroup(
					Messages.NavigatorGroupName_Place_3005_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(NormalLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(NormalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NormalLinkEditPart.VISUAL_ID: {
			LinkedList<TeawAbstractNavigatorItem> result = new LinkedList<TeawAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TeawNavigatorGroup target = new TeawNavigatorGroup(Messages.NavigatorGroupName_NormalLink_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TeawNavigatorGroup source = new TeawNavigatorGroup(Messages.NavigatorGroupName_NormalLink_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(PersonEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(ActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(PlaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(PersonEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(ActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(PlaceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RedLinkEditPart.VISUAL_ID: {
			LinkedList<TeawAbstractNavigatorItem> result = new LinkedList<TeawAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TeawNavigatorGroup target = new TeawNavigatorGroup(Messages.NavigatorGroupName_RedLink_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TeawNavigatorGroup source = new TeawNavigatorGroup(Messages.NavigatorGroupName_RedLink_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(EmotionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(EmotionChoiceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GreenLinkEditPart.VISUAL_ID: {
			LinkedList<TeawAbstractNavigatorItem> result = new LinkedList<TeawAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TeawNavigatorGroup target = new TeawNavigatorGroup(Messages.NavigatorGroupName_GreenLink_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TeawNavigatorGroup source = new TeawNavigatorGroup(Messages.NavigatorGroupName_GreenLink_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(EmotionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TeawVisualIDRegistry.getType(EmotionChoiceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return TEAWDiagramEditPart.MODEL_ID.equals(TeawVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<TeawNavigatorItem> createNavigatorItems(Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<TeawNavigatorItem> result = new ArrayList<TeawNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new TeawNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<TeawNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof TeawAbstractNavigatorItem) {
			TeawAbstractNavigatorItem abstractNavigatorItem = (TeawAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
