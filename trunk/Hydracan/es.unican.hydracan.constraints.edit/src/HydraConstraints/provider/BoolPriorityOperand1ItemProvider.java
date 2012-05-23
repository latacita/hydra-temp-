/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package HydraConstraints.provider;


import HydraConstraints.BoolPriorityOperand1;
import HydraConstraints.HydraConstraintsFactory;
import HydraConstraints.HydraConstraintsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link HydraConstraints.BoolPriorityOperand1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BoolPriorityOperand1ItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolPriorityOperand1ItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1);
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
	 * This returns BoolPriorityOperand1.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BoolPriorityOperand1"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BoolPriorityOperand1_type");
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

		switch (notification.getFeatureID(BoolPriorityOperand1.class)) {
			case HydraConstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1:
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
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createSimpleFeature()));

		newChildDescriptors.add
			(createChildParameter
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createAny()));

		newChildDescriptors.add
			(createChildParameter
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createNeg()));

		newChildDescriptors.add
			(createChildParameter
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createXor()));

		newChildDescriptors.add
			(createChildParameter
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createImplies()));

		newChildDescriptors.add
			(createChildParameter
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createMore()));

		newChildDescriptors.add
			(createChildParameter
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createLessOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createLess()));

		newChildDescriptors.add
			(createChildParameter
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createNotEqual()));

		newChildDescriptors.add
			(createChildParameter
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1,
				 HydraConstraintsFactory.eINSTANCE.createMoreOrEqual()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HydraConstraintsEditPlugin.INSTANCE;
	}

}
