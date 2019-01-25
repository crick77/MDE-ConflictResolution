/**
 */
package Families.uncertainty.tests;

import Families.uncertainty.UncertaintyFactory;
import Families.uncertainty.uFamily;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>uFamily</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class uFamilyTest extends aFamilyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(uFamilyTest.class);
	}

	/**
	 * Constructs a new uFamily test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uFamilyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this uFamily test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected uFamily getFixture() {
		return (uFamily)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UncertaintyFactory.eINSTANCE.createuFamily());
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

} //uFamilyTest
