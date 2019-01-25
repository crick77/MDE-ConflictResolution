/**
 */
package Families.provider;


import Families.FamiliesFactory;
import Families.FamiliesPackage;
import Families.Family;

import Families.uncertainty.UncertaintyFactory;

import Families.uncertainty.provider.ModelElementItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Families.Family} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FamilyItemProvider extends ModelElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyItemProvider(AdapterFactory adapterFactory) {
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

			addLastNamePropertyDescriptor(object);
			addAddressPropertyDescriptor(object);
			addLinksPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Last Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Family_lastName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Family_lastName_feature", "_UI_Family_type"),
				 FamiliesPackage.Literals.FAMILY__LAST_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Family_address_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Family_address_feature", "_UI_Family_type"),
				 FamiliesPackage.Literals.FAMILY__ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Family_links_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Family_links_feature", "_UI_Family_type"),
				 FamiliesPackage.Literals.FAMILY__LINKS,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(FamiliesPackage.Literals.FAMILY__SONS);
			childrenFeatures.add(FamiliesPackage.Literals.FAMILY__DAUGHTERS);
			childrenFeatures.add(FamiliesPackage.Literals.FAMILY__MOTHER);
			childrenFeatures.add(FamiliesPackage.Literals.FAMILY__FATHER);
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
	 * This returns Family.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Family"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Family)object).getLastName();
		return label == null || label.length() == 0 ?
			getString("_UI_Family_type") :
			getString("_UI_Family_type") + " " + label;
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

		switch (notification.getFeatureID(Family.class)) {
			case FamiliesPackage.FAMILY__LAST_NAME:
			case FamiliesPackage.FAMILY__ADDRESS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FamiliesPackage.FAMILY__SONS:
			case FamiliesPackage.FAMILY__DAUGHTERS:
			case FamiliesPackage.FAMILY__MOTHER:
			case FamiliesPackage.FAMILY__FATHER:
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
				(FamiliesPackage.Literals.FAMILY__SONS,
				 FamiliesFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(FamiliesPackage.Literals.FAMILY__SONS,
				 UncertaintyFactory.eINSTANCE.createuMember()));

		newChildDescriptors.add
			(createChildParameter
				(FamiliesPackage.Literals.FAMILY__DAUGHTERS,
				 FamiliesFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(FamiliesPackage.Literals.FAMILY__DAUGHTERS,
				 UncertaintyFactory.eINSTANCE.createuMember()));

		newChildDescriptors.add
			(createChildParameter
				(FamiliesPackage.Literals.FAMILY__MOTHER,
				 FamiliesFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(FamiliesPackage.Literals.FAMILY__MOTHER,
				 UncertaintyFactory.eINSTANCE.createuMember()));

		newChildDescriptors.add
			(createChildParameter
				(FamiliesPackage.Literals.FAMILY__FATHER,
				 FamiliesFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(FamiliesPackage.Literals.FAMILY__FATHER,
				 UncertaintyFactory.eINSTANCE.createuMember()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == FamiliesPackage.Literals.FAMILY__SONS ||
			childFeature == FamiliesPackage.Literals.FAMILY__DAUGHTERS ||
			childFeature == FamiliesPackage.Literals.FAMILY__MOTHER ||
			childFeature == FamiliesPackage.Literals.FAMILY__FATHER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UFamilyEditPlugin.INSTANCE;
	}

}
