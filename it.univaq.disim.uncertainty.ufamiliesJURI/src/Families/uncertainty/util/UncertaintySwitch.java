/**
 */
package Families.uncertainty.util;

import Families.uncertainty.*;

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
 * @see Families.uncertainty.UncertaintyPackage
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
			case UncertaintyPackage.UFAMILY: {
				uFamily uFamily = (uFamily)theEObject;
				T result = caseuFamily(uFamily);
				if (result == null) result = caseaFamily(uFamily);
				if (result == null) result = caseUData(uFamily);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintyPackage.AFAMILY: {
				aFamily aFamily = (aFamily)theEObject;
				T result = caseaFamily(aFamily);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintyPackage.UMEMBER: {
				uMember uMember = (uMember)theEObject;
				T result = caseuMember(uMember);
				if (result == null) result = caseaMember(uMember);
				if (result == null) result = caseUData(uMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintyPackage.AMEMBER: {
				aMember aMember = (aMember)theEObject;
				T result = caseaMember(aMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintyPackage.UFAMILY_REGISTRY: {
				uFamilyRegistry uFamilyRegistry = (uFamilyRegistry)theEObject;
				T result = caseuFamilyRegistry(uFamilyRegistry);
				if (result == null) result = caseaFamilyRegistry(uFamilyRegistry);
				if (result == null) result = caseUData(uFamilyRegistry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintyPackage.AFAMILY_REGISTRY: {
				aFamilyRegistry aFamilyRegistry = (aFamilyRegistry)theEObject;
				T result = caseaFamilyRegistry(aFamilyRegistry);
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
	 * Returns the result of interpreting the object as an instance of '<em>uFamily</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uFamily</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuFamily(uFamily object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>aFamily</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>aFamily</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaFamily(aFamily object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uMember</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uMember</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuMember(uMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>aMember</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>aMember</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaMember(aMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uFamily Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uFamily Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuFamilyRegistry(uFamilyRegistry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>aFamily Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>aFamily Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaFamilyRegistry(aFamilyRegistry object) {
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
