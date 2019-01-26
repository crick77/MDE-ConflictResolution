/**
 */
package Families.uncertainty.util;

import Families.uncertainty.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Families.uncertainty.UncertaintyPackage
 * @generated
 */
public class UncertaintyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UncertaintyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UncertaintyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UncertaintySwitch<Adapter> modelSwitch =
		new UncertaintySwitch<Adapter>() {
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseUData(UData object) {
				return createUDataAdapter();
			}
			@Override
			public Adapter caseuFamily(uFamily object) {
				return createuFamilyAdapter();
			}
			@Override
			public Adapter caseaFamily(aFamily object) {
				return createaFamilyAdapter();
			}
			@Override
			public Adapter caseuMember(uMember object) {
				return createuMemberAdapter();
			}
			@Override
			public Adapter caseaMember(aMember object) {
				return createaMemberAdapter();
			}
			@Override
			public Adapter caseuFamilyRegistry(uFamilyRegistry object) {
				return createuFamilyRegistryAdapter();
			}
			@Override
			public Adapter caseaFamilyRegistry(aFamilyRegistry object) {
				return createaFamilyRegistryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Families.uncertainty.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Families.uncertainty.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Families.uncertainty.UData <em>UData</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Families.uncertainty.UData
	 * @generated
	 */
	public Adapter createUDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Families.uncertainty.uFamily <em>uFamily</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Families.uncertainty.uFamily
	 * @generated
	 */
	public Adapter createuFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Families.uncertainty.aFamily <em>aFamily</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Families.uncertainty.aFamily
	 * @generated
	 */
	public Adapter createaFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Families.uncertainty.uMember <em>uMember</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Families.uncertainty.uMember
	 * @generated
	 */
	public Adapter createuMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Families.uncertainty.aMember <em>aMember</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Families.uncertainty.aMember
	 * @generated
	 */
	public Adapter createaMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Families.uncertainty.uFamilyRegistry <em>uFamily Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Families.uncertainty.uFamilyRegistry
	 * @generated
	 */
	public Adapter createuFamilyRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Families.uncertainty.aFamilyRegistry <em>aFamily Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Families.uncertainty.aFamilyRegistry
	 * @generated
	 */
	public Adapter createaFamilyRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UncertaintyAdapterFactory
