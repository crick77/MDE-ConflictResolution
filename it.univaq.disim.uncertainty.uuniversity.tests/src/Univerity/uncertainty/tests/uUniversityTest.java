/**
 */
package Univerity.uncertainty.tests;

import Univerity.uncertainty.UncertaintyFactory;
import Univerity.uncertainty.uUniversity;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>uUniversity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class uUniversityTest extends aUniversityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(uUniversityTest.class);
	}

	/**
	 * Constructs a new uUniversity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uUniversityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this uUniversity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected uUniversity getFixture() {
		return (uUniversity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UncertaintyFactory.eINSTANCE.createuUniversity());
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

} //uUniversityTest
