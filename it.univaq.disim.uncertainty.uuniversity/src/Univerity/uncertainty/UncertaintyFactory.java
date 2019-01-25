/**
 */
package Univerity.uncertainty;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Univerity.uncertainty.UncertaintyPackage
 * @generated
 */
public interface UncertaintyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UncertaintyFactory eINSTANCE = Univerity.uncertainty.impl.UncertaintyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>uCourses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>uCourses</em>'.
	 * @generated
	 */
	uCourses createuCourses();

	/**
	 * Returns a new object of class '<em>uPerson</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>uPerson</em>'.
	 * @generated
	 */
	uPerson createuPerson();

	/**
	 * Returns a new object of class '<em>uUniversity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>uUniversity</em>'.
	 * @generated
	 */
	uUniversity createuUniversity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UncertaintyPackage getUncertaintyPackage();

} //UncertaintyFactory
