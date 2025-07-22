/**
 */
package teaw.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import teaw.Emotions;
import teaw.TeawFactory;
import teaw.TeawPackage;

/**
 * This is the item provider adapter for a {@link teaw.Emotions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EmotionsItemProvider extends NodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmotionsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Emotions_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Emotions_name_feature", "_UI_Emotions_type"),
				 TeawPackage.Literals.EMOTIONS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TeawPackage.Literals.EMOTIONS__EMOTIONS);
			childrenFeatures.add(TeawPackage.Literals.EMOTIONS__RED_LINKS);
			childrenFeatures.add(TeawPackage.Literals.EMOTIONS__GREEN_LINK);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Emotions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Emotions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Emotions)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Emotions_type") :
			getString("_UI_Emotions_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Emotions.class)) {
			case TeawPackage.EMOTIONS__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TeawPackage.EMOTIONS__EMOTIONS:
			case TeawPackage.EMOTIONS__RED_LINKS:
			case TeawPackage.EMOTIONS__GREEN_LINK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TeawPackage.Literals.EMOTIONS__EMOTIONS,
				 TeawFactory.eINSTANCE.createEmotionChoice()));

		newChildDescriptors.add
			(createChildParameter
				(TeawPackage.Literals.EMOTIONS__EMOTIONS,
				 TeawFactory.eINSTANCE.createEmotion()));

		newChildDescriptors.add
			(createChildParameter
				(TeawPackage.Literals.EMOTIONS__EMOTIONS,
				 TeawFactory.eINSTANCE.createPositiveFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(TeawPackage.Literals.EMOTIONS__EMOTIONS,
				 TeawFactory.eINSTANCE.createNegativeFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(TeawPackage.Literals.EMOTIONS__RED_LINKS,
				 TeawFactory.eINSTANCE.createRedLink()));

		newChildDescriptors.add
			(createChildParameter
				(TeawPackage.Literals.EMOTIONS__GREEN_LINK,
				 TeawFactory.eINSTANCE.createGreenLink()));
	}

}
