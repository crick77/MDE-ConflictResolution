/**
 */
package Families.uncertainty.tests;

import Families.uncertainty.UncertaintyFactory;
import Families.uncertainty.uFamilyRegistry;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>uFamily Registry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class uFamilyRegistryTest extends aFamilyRegistryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(uFamilyRegistryTest.class);
	}

	/**
	 * Constructs a new uFamily Registry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uFamilyRegistryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this uFamily Registry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected uFamilyRegistry getFixture() {
		return (uFamilyRegistry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UncertaintyFactory.eINSTANCE.createuFamilyRegistry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //uFamilyRegistryTest
