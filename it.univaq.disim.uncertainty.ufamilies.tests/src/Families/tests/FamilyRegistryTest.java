/**
 */
package Families.tests;

import Families.FamiliesFactory;
import Families.FamilyRegistry;

import Families.uncertainty.tests.ModelElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Family Registry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FamilyRegistryTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FamilyRegistryTest.class);
	}

	/**
	 * Constructs a new Family Registry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyRegistryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Family Registry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FamilyRegistry getFixture() {
		return (FamilyRegistry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FamiliesFactory.eINSTANCE.createFamilyRegistry());
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

} //FamilyRegistryTest
