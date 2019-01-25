/**
 */
package Families.uncertainty.tests;

import Families.uncertainty.UncertaintyFactory;
import Families.uncertainty.uMember;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>uMember</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class uMemberTest extends aMemberTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(uMemberTest.class);
	}

	/**
	 * Constructs a new uMember test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uMemberTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this uMember test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected uMember getFixture() {
		return (uMember)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UncertaintyFactory.eINSTANCE.createuMember());
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

} //uMemberTest
