
/*
 * 
 */
package teaw.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import teaw.diagram.providers.TeawElementTypes;

/**
 * @generated
 */
public class TeawPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createPlanning1Group());
		paletteRoot.add(createEmotions2Group());
	}

	/**
	* Creates "Planning" palette tool group
	* @generated
	*/
	private PaletteContainer createPlanning1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Planning1Group_title);
		paletteContainer.setId("createPlanning1Group"); //$NON-NLS-1$
		paletteContainer.add(createPlanning1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAction3CreationTool());
		paletteContainer.add(createPerson4CreationTool());
		paletteContainer.add(createPlace5CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAACNotebook7CreationTool());
		paletteContainer.add(createAward8CreationTool());
		paletteContainer.add(createSocialstory9CreationTool());
		paletteContainer.add(createEntertainmentCalmingactivity10CreationTool());
		paletteContainer.add(createTimemanagement11CreationTool());
		paletteContainer.add(createRemainingtime12CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createSequenceorder14CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Emotions" palette tool group
	* @generated
	*/
	private PaletteContainer createEmotions2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Emotions2Group_title);
		paletteContainer.setId("createEmotions2Group"); //$NON-NLS-1$
		paletteContainer.add(createEmotions1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createTargetemotion3CreationTool());
		paletteContainer.add(createResponseoption4CreationTool());
		paletteContainer.add(createPositivefeedback5CreationTool());
		paletteContainer.add(createNegativefeedback6CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createCorrectsolution8CreationTool());
		paletteContainer.add(createIncorrectsolution9CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createPlanning1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Planning1CreationTool_title,
				Messages.Planning1CreationTool_desc, Collections.singletonList(TeawElementTypes.Planning_2002));
		entry.setId("createPlanning1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TeawDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.teaw.figures/images/planning_arasaac32.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAction3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Action3CreationTool_title,
				Messages.Action3CreationTool_desc, Collections.singletonList(TeawElementTypes.Action_3004));
		entry.setId("createAction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TeawDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.teaw.figures/images/action_arasaac32.png")); //$NON-NLS-1$
		entry.setLargeIcon(TeawDiagramEditorPlugin.findImageDescriptor("images/action_arasaac128.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPerson4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Person4CreationTool_title,
				Messages.Person4CreationTool_desc, Collections.singletonList(TeawElementTypes.Person_3003));
		entry.setId("createPerson4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TeawDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.teaw.figures/images/person_arasaac32.png")); //$NON-NLS-1$
		entry.setLargeIcon(TeawDiagramEditorPlugin.findImageDescriptor("images/person_arasaac128.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPlace5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Place5CreationTool_title,
				Messages.Place5CreationTool_desc, Collections.singletonList(TeawElementTypes.Place_3005));
		entry.setId("createPlace5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				TeawDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.teaw.figures/images/place_arasaac32.png")); //$NON-NLS-1$
		entry.setLargeIcon(TeawDiagramEditorPlugin.findImageDescriptor("images/place_arasaac128.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAACNotebook7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AACNotebook7CreationTool_title,
				Messages.AACNotebook7CreationTool_desc,
				Collections.singletonList(TeawElementTypes.CommunicationBook_3010));
		entry.setId("createAACNotebook7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TeawDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.teaw.figures/images/notebook_arasaac32.png")); //$NON-NLS-1$
		entry.setLargeIcon(TeawDiagramEditorPlugin.findImageDescriptor("images/notebook_arasaac64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAward8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Award8CreationTool_title,
				Messages.Award8CreationTool_desc, Collections.singletonList(TeawElementTypes.Prize_3007));
		entry.setId("createAward8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				TeawDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.teaw.figures/images/prize_arasaac32.png")); //$NON-NLS-1$
		entry.setLargeIcon(TeawDiagramEditorPlugin.findImageDescriptor("images/prize_arasaac64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSocialstory9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Socialstory9CreationTool_title,
				Messages.Socialstory9CreationTool_desc, Collections.singletonList(TeawElementTypes.SocialStory_3008));
		entry.setId("createSocialstory9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				TeawDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.teaw.figures/images/story_arasaac32.png")); //$NON-NLS-1$
		entry.setLargeIcon(TeawDiagramEditorPlugin.findImageDescriptor("images/story_arasaac64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntertainmentCalmingactivity10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EntertainmentCalmingactivity10CreationTool_title,
				Messages.EntertainmentCalmingactivity10CreationTool_desc,
				Collections.singletonList(TeawElementTypes.SoothingObject_3009));
		entry.setId("createEntertainmentCalmingactivity10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TeawDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.teaw.figures/images/object_arasaac32.png")); //$NON-NLS-1$
		entry.setLargeIcon(TeawDiagramEditorPlugin.findImageDescriptor("images/object_arasaac64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTimemanagement11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Timemanagement11CreationTool_title,
				Messages.Timemanagement11CreationTool_desc, Collections.singletonList(TeawElementTypes.WaitTime_3006));
		entry.setId("createTimemanagement11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				TeawDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.teaw.figures/images/time_arasaac32.png")); //$NON-NLS-1$
		entry.setLargeIcon(TeawDiagramEditorPlugin.findImageDescriptor("images/time_arasaac64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRemainingtime12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Remainingtime12CreationTool_title,
				Messages.Remainingtime12CreationTool_desc,
				Collections.singletonList(TeawElementTypes.ReaminingObject_3013));
		entry.setId("createRemainingtime12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TeawDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.teaw.figures/images/remaining_arasaac32.png")); //$NON-NLS-1$
		entry.setLargeIcon(TeawDiagramEditorPlugin.findImageDescriptor("images/remaining_arasaac64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSequenceorder14CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Sequenceorder14CreationTool_title,
				Messages.Sequenceorder14CreationTool_desc, Collections.singletonList(TeawElementTypes.NormalLink_4001));
		entry.setId("createSequenceorder14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				TeawDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.teaw.figures/images/link32.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEmotions1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Emotions1CreationTool_title,
				Messages.Emotions1CreationTool_desc, Collections.singletonList(TeawElementTypes.Emotions_2001));
		entry.setId("createEmotions1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TeawDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.teaw.figures/images/emotions_arasaac32.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTargetemotion3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Targetemotion3CreationTool_title,
				Messages.Targetemotion3CreationTool_desc,
				Collections.singletonList(TeawElementTypes.EmotionChoice_3001));
		entry.setId("createTargetemotion3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TeawDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.teaw.figures/images/emochoice_arasaac32.png")); //$NON-NLS-1$
		entry.setLargeIcon(TeawDiagramEditorPlugin.findImageDescriptor("images/emochoice_arasaac128.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createResponseoption4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Responseoption4CreationTool_title,
				Messages.Responseoption4CreationTool_desc, Collections.singletonList(TeawElementTypes.Emotion_3002));
		entry.setId("createResponseoption4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TeawDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.teaw.figures/images/emotion_arasaac32.png")); //$NON-NLS-1$
		entry.setLargeIcon(TeawDiagramEditorPlugin.findImageDescriptor("images/emotion_arasaac128.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPositivefeedback5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Positivefeedback5CreationTool_title,
				Messages.Positivefeedback5CreationTool_desc,
				Collections.singletonList(TeawElementTypes.PositiveFeedback_3011));
		entry.setId("createPositivefeedback5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TeawDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.teaw.figures/images/positiveFeedback32.png")); //$NON-NLS-1$
		entry.setLargeIcon(TeawDiagramEditorPlugin.findImageDescriptor("images/positiveFeedback64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNegativefeedback6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Negativefeedback6CreationTool_title,
				Messages.Negativefeedback6CreationTool_desc,
				Collections.singletonList(TeawElementTypes.NegativeFeedback_3012));
		entry.setId("createNegativefeedback6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TeawDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.teaw.figures/images/negativeFeedback32.png")); //$NON-NLS-1$
		entry.setLargeIcon(TeawDiagramEditorPlugin.findImageDescriptor("images/negativeFeedback64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCorrectsolution8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Correctsolution8CreationTool_title,
				Messages.Correctsolution8CreationTool_desc, Collections.singletonList(TeawElementTypes.GreenLink_4003));
		entry.setId("createCorrectsolution8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TeawDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.teaw.figures/images/ok32.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIncorrectsolution9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Incorrectsolution9CreationTool_title,
				Messages.Incorrectsolution9CreationTool_desc, Collections.singletonList(TeawElementTypes.RedLink_4002));
		entry.setId("createIncorrectsolution9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				TeawDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.teaw.figures/images/wrong32.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
