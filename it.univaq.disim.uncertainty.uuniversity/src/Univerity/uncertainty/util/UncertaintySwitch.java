/**
 */
package Univerity.uncertainty.util;

import Univerity.uncertainty.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Univerity.uncertainty.UncertaintyPackage
 * @generated
 */
public class UncertaintySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UncertaintyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintySwitch() {
		if (modelPackage == null) {
			modelPackage = UncertaintyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UncertaintyPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintyPackage.UDATA: {
				UData uData = (UData)theEObject;
				T result = caseUData(uData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintyPackage.UCOURSES: {
				uCourses uCourses = (uCourses)theEObject;
				T result = caseuCourses(uCourses);
				if (result == null) result = caseaCourses(uCourses);
				if (result == null) result = caseUData(uCourses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintyPackage.ACOURSES: {
				aCourses aCourses = (aCourses)theEObject;
				T result = caseaCourses(aCourses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintyPackage.UPERSON: {
				uPerson uPerson = (uPerson)theEObject;
				T result = caseuPerson(uPerson);
				if (result == null) result = caseaPerson(uPerson);
				if (result == null) result = caseUData(uPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintyPackage.APERSON: {
				aPerson aPerson = (aPerson)theEObject;
				T result = caseaPerson(aPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintyPackage.UUNIVERSITY: {
				uUniversity uUniversity = (uUniversity)theEObject;
				T result = caseuUniversity(uUniversity);
				if (result == null) result = caseaUniversity(uUniversity);
				if (result == null) result = caseUData(uUniversity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintyPackage.AUNIVERSITY: {
				aUniversity aUniversity = (aUniversity)theEObject;
				T result = caseaUniversity(aUniversity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UData</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UData</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUData(UData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uCourses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uCourses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuCourses(uCourses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>aCourses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>aCourses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaCourses(aCourses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uPerson</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uPerson</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuPerson(uPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>aPerson</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>aPerson</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaPerson(aPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uUniversity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uUniversity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuUniversity(uUniversity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>aUniversity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>aUniversity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaUniversity(aUniversity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UncertaintySwitch
