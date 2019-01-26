/**
 */
package Families.uncertainty;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Families.uncertainty.UncertaintyPackage
 * @generated
 */
public interface UncertaintyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UncertaintyFactory eINSTANCE = Families.uncertainty.impl.UncertaintyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>uFamily</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>uFamily</em>'.
	 * @generated
	 */
	uFamily createuFamily();

	/**
	 * Returns a new object of class '<em>uMember</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>uMember</em>'.
	 * @generated
	 */
	uMember createuMember();

	/**
	 * Returns a new object of class '<em>uFamily Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>uFamily Registry</em>'.
	 * @generated
	 */
	uFamilyRegistry createuFamilyRegistry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UncertaintyPackage getUncertaintyPackage();

} //UncertaintyFactory
