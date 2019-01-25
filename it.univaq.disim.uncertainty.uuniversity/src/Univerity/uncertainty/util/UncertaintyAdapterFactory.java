/**
 */
package Univerity.uncertainty.util;

import Univerity.uncertainty.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Univerity.uncertainty.UncertaintyPackage
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
			public Adapter caseuCourses(uCourses object) {
				return createuCoursesAdapter();
			}
			@Override
			public Adapter caseaCourses(aCourses object) {
				return createaCoursesAdapter();
			}
			@Override
			public Adapter caseuPerson(uPerson object) {
				return createuPersonAdapter();
			}
			@Override
			public Adapter caseaPerson(aPerson object) {
				return createaPersonAdapter();
			}
			@Override
			public Adapter caseuUniversity(uUniversity object) {
				return createuUniversityAdapter();
			}
			@Override
			public Adapter caseaUniversity(aUniversity object) {
				return createaUniversityAdapter();
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
	 * Creates a new adapter for an object of class '{@link Univerity.uncertainty.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Univerity.uncertainty.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Univerity.uncertainty.UData <em>UData</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Univerity.uncertainty.UData
	 * @generated
	 */
	public Adapter createUDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Univerity.uncertainty.uCourses <em>uCourses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Univerity.uncertainty.uCourses
	 * @generated
	 */
	public Adapter createuCoursesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Univerity.uncertainty.aCourses <em>aCourses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Univerity.uncertainty.aCourses
	 * @generated
	 */
	public Adapter createaCoursesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Univerity.uncertainty.uPerson <em>uPerson</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Univerity.uncertainty.uPerson
	 * @generated
	 */
	public Adapter createuPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Univerity.uncertainty.aPerson <em>aPerson</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Univerity.uncertainty.aPerson
	 * @generated
	 */
	public Adapter createaPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Univerity.uncertainty.uUniversity <em>uUniversity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Univerity.uncertainty.uUniversity
	 * @generated
	 */
	public Adapter createuUniversityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Univerity.uncertainty.aUniversity <em>aUniversity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Univerity.uncertainty.aUniversity
	 * @generated
	 */
	public Adapter createaUniversityAdapter() {
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
