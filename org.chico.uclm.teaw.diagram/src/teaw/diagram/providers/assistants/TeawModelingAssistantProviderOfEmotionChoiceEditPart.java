/*
 * 
 */
package teaw.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import teaw.diagram.edit.parts.EmotionChoiceEditPart;
import teaw.diagram.edit.parts.EmotionEditPart;
import teaw.diagram.providers.TeawElementTypes;
import teaw.diagram.providers.TeawModelingAssistantProvider;

/**
 * @generated
 */
public class TeawModelingAssistantProviderOfEmotionChoiceEditPart extends TeawModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((EmotionChoiceEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(EmotionChoiceEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TeawElementTypes.RedLink_4002);
		types.add(TeawElementTypes.GreenLink_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((EmotionChoiceEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(EmotionChoiceEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EmotionEditPart) {
			types.add(TeawElementTypes.RedLink_4002);
		}
		if (targetEditPart instanceof EmotionEditPart) {
			types.add(TeawElementTypes.GreenLink_4003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((EmotionChoiceEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(EmotionChoiceEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TeawElementTypes.RedLink_4002) {
			types.add(TeawElementTypes.Emotion_3002);
		} else if (relationshipType == TeawElementTypes.GreenLink_4003) {
			types.add(TeawElementTypes.Emotion_3002);
		}
		return types;
	}

}
