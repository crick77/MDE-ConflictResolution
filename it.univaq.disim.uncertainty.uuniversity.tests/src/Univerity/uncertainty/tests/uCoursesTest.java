/**
 */
package Univerity.uncertainty.tests;

import Univerity.uncertainty.UncertaintyFactory;
import Univerity.uncertainty.uCourses;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>uCourses</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class uCoursesTest extends aCoursesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(uCoursesTest.class);
	}

	/**
	 * Constructs a new uCourses test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uCoursesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this uCourses test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected uCourses getFixture() {
		return (uCourses)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UncertaintyFactory.eINSTANCE.createuCourses());
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

} //uCoursesTest
