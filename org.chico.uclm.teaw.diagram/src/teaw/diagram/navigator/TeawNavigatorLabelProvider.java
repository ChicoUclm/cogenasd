/*
* 
*/
package teaw.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import teaw.Action;
import teaw.CommunicationBook;
import teaw.Emotion;
import teaw.EmotionChoice;
import teaw.Person;
import teaw.Place;
import teaw.Prize;
import teaw.ReaminingObject;
import teaw.SocialStory;
import teaw.SoothingObject;
import teaw.WaitTime;
import teaw.diagram.edit.parts.ActionEditPart;
import teaw.diagram.edit.parts.CommunicationBookEditPart;
import teaw.diagram.edit.parts.EmotionChoiceEditPart;
import teaw.diagram.edit.parts.EmotionEditPart;
import teaw.diagram.edit.parts.EmotionsEditPart;
import teaw.diagram.edit.parts.EmotionsNameEditPart;
import teaw.diagram.edit.parts.GreenLinkEditPart;
import teaw.diagram.edit.parts.NegativeFeedbackEditPart;
import teaw.diagram.edit.parts.NormalLinkEditPart;
import teaw.diagram.edit.parts.PersonEditPart;
import teaw.diagram.edit.parts.PlaceEditPart;
import teaw.diagram.edit.parts.PlanningEditPart;
import teaw.diagram.edit.parts.PlanningNameEditPart;
import teaw.diagram.edit.parts.PositiveFeedbackEditPart;
import teaw.diagram.edit.parts.PrizeEditPart;
import teaw.diagram.edit.parts.ReaminingObjectEditPart;
import teaw.diagram.edit.parts.RedLinkEditPart;
import teaw.diagram.edit.parts.SocialStoryEditPart;
import teaw.diagram.edit.parts.SoothingObjectEditPart;
import teaw.diagram.edit.parts.TEAWDiagramEditPart;
import teaw.diagram.edit.parts.WaitTimeEditPart;
import teaw.diagram.part.TeawDiagramEditorPlugin;
import teaw.diagram.part.TeawVisualIDRegistry;
import teaw.diagram.providers.TeawElementTypes;
import teaw.diagram.providers.TeawParserProvider;

/**
 * @generated
 */
public class TeawNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		TeawDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		TeawDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TeawNavigatorItem && !isOwnView(((TeawNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof TeawNavigatorGroup) {
			TeawNavigatorGroup group = (TeawNavigatorGroup) element;
			return TeawDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof TeawNavigatorItem) {
			TeawNavigatorItem navigatorItem = (TeawNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (TeawVisualIDRegistry.getVisualID(view)) {
		case TEAWDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?teaw?TEAWDiagram", TeawElementTypes.TEAWDiagram_1000); //$NON-NLS-1$
		case EmotionsEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?teaw?Emotions", TeawElementTypes.Emotions_2001); //$NON-NLS-1$
		case PlanningEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?teaw?Planning", TeawElementTypes.Planning_2002); //$NON-NLS-1$
		case EmotionChoiceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?teaw?EmotionChoice", TeawElementTypes.EmotionChoice_3001); //$NON-NLS-1$
		case EmotionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?teaw?Emotion", TeawElementTypes.Emotion_3002); //$NON-NLS-1$
		case PersonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?teaw?Person", TeawElementTypes.Person_3003); //$NON-NLS-1$
		case ActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?teaw?Action", TeawElementTypes.Action_3004); //$NON-NLS-1$
		case PlaceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?teaw?Place", TeawElementTypes.Place_3005); //$NON-NLS-1$
		case WaitTimeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?teaw?WaitTime", TeawElementTypes.WaitTime_3006); //$NON-NLS-1$
		case PrizeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?teaw?Prize", TeawElementTypes.Prize_3007); //$NON-NLS-1$
		case SocialStoryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?teaw?SocialStory", TeawElementTypes.SocialStory_3008); //$NON-NLS-1$
		case SoothingObjectEditPart.VISUAL_ID:
			return getImage("Navigator?Node?teaw?SoothingObject", TeawElementTypes.SoothingObject_3009); //$NON-NLS-1$
		case CommunicationBookEditPart.VISUAL_ID:
			return getImage("Navigator?Node?teaw?CommunicationBook", TeawElementTypes.CommunicationBook_3010); //$NON-NLS-1$
		case PositiveFeedbackEditPart.VISUAL_ID:
			return getImage("Navigator?Node?teaw?PositiveFeedback", TeawElementTypes.PositiveFeedback_3011); //$NON-NLS-1$
		case NegativeFeedbackEditPart.VISUAL_ID:
			return getImage("Navigator?Node?teaw?NegativeFeedback", TeawElementTypes.NegativeFeedback_3012); //$NON-NLS-1$
		case ReaminingObjectEditPart.VISUAL_ID:
			return getImage("Navigator?Node?teaw?ReaminingObject", TeawElementTypes.ReaminingObject_3013); //$NON-NLS-1$
		case NormalLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?teaw?NormalLink", TeawElementTypes.NormalLink_4001); //$NON-NLS-1$
		case RedLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?teaw?RedLink", TeawElementTypes.RedLink_4002); //$NON-NLS-1$
		case GreenLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?teaw?GreenLink", TeawElementTypes.GreenLink_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TeawDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && TeawElementTypes.isKnownElementType(elementType)) {
			image = TeawElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof TeawNavigatorGroup) {
			TeawNavigatorGroup group = (TeawNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TeawNavigatorItem) {
			TeawNavigatorItem navigatorItem = (TeawNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (TeawVisualIDRegistry.getVisualID(view)) {
		case TEAWDiagramEditPart.VISUAL_ID:
			return getTEAWDiagram_1000Text(view);
		case EmotionsEditPart.VISUAL_ID:
			return getEmotions_2001Text(view);
		case PlanningEditPart.VISUAL_ID:
			return getPlanning_2002Text(view);
		case EmotionChoiceEditPart.VISUAL_ID:
			return getEmotionChoice_3001Text(view);
		case EmotionEditPart.VISUAL_ID:
			return getEmotion_3002Text(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_3003Text(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_3004Text(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_3005Text(view);
		case WaitTimeEditPart.VISUAL_ID:
			return getWaitTime_3006Text(view);
		case PrizeEditPart.VISUAL_ID:
			return getPrize_3007Text(view);
		case SocialStoryEditPart.VISUAL_ID:
			return getSocialStory_3008Text(view);
		case SoothingObjectEditPart.VISUAL_ID:
			return getSoothingObject_3009Text(view);
		case CommunicationBookEditPart.VISUAL_ID:
			return getCommunicationBook_3010Text(view);
		case PositiveFeedbackEditPart.VISUAL_ID:
			return getPositiveFeedback_3011Text(view);
		case NegativeFeedbackEditPart.VISUAL_ID:
			return getNegativeFeedback_3012Text(view);
		case ReaminingObjectEditPart.VISUAL_ID:
			return getReaminingObject_3013Text(view);
		case NormalLinkEditPart.VISUAL_ID:
			return getNormalLink_4001Text(view);
		case RedLinkEditPart.VISUAL_ID:
			return getRedLink_4002Text(view);
		case GreenLinkEditPart.VISUAL_ID:
			return getGreenLink_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getTEAWDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getEmotions_2001Text(View view) {
		IParser parser = TeawParserProvider.getParser(TeawElementTypes.Emotions_2001,
				view.getElement() != null ? view.getElement() : view,
				TeawVisualIDRegistry.getType(EmotionsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TeawDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPlanning_2002Text(View view) {
		IParser parser = TeawParserProvider.getParser(TeawElementTypes.Planning_2002,
				view.getElement() != null ? view.getElement() : view,
				TeawVisualIDRegistry.getType(PlanningNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TeawDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEmotionChoice_3001Text(View view) {
		EmotionChoice domainModelElement = (EmotionChoice) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			TeawDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEmotion_3002Text(View view) {
		Emotion domainModelElement = (Emotion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			TeawDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPerson_3003Text(View view) {
		Person domainModelElement = (Person) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			TeawDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAction_3004Text(View view) {
		Action domainModelElement = (Action) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			TeawDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPlace_3005Text(View view) {
		Place domainModelElement = (Place) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			TeawDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWaitTime_3006Text(View view) {
		WaitTime domainModelElement = (WaitTime) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			TeawDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPrize_3007Text(View view) {
		Prize domainModelElement = (Prize) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			TeawDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSocialStory_3008Text(View view) {
		SocialStory domainModelElement = (SocialStory) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			TeawDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSoothingObject_3009Text(View view) {
		SoothingObject domainModelElement = (SoothingObject) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			TeawDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCommunicationBook_3010Text(View view) {
		CommunicationBook domainModelElement = (CommunicationBook) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			TeawDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPositiveFeedback_3011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getNegativeFeedback_3012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getReaminingObject_3013Text(View view) {
		ReaminingObject domainModelElement = (ReaminingObject) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			TeawDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNormalLink_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getRedLink_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getGreenLink_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return TEAWDiagramEditPart.MODEL_ID.equals(TeawVisualIDRegistry.getModelID(view));
	}

}
