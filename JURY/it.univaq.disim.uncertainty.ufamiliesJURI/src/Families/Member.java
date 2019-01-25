/**
 */
package Families;

import Families.uncertainty.ModelElement;
import Families.uncertainty.aFamily;
import Families.uncertainty.aMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Families.Member#getFirstName <em>First Name</em>}</li>
 *   <li>{@link Families.Member#getAge <em>Age</em>}</li>
 *   <li>{@link Families.Member#getGuardian <em>Guardian</em>}</li>
 * </ul>
 *
 * @see Families.FamiliesPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends ModelElement, aMember {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see Families.FamiliesPackage#getMember_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link Families.Member#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see Families.FamiliesPackage#getMember_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link Families.Member#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Guardian</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guardian</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guardian</em>' reference.
	 * @see #setGuardian(aFamily)
	 * @see Families.FamiliesPackage#getMember_Guardian()
	 * @model
	 * @generated
	 */
	aFamily getGuardian();

	/**
	 * Sets the value of the '{@link Families.Member#getGuardian <em>Guardian</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guardian</em>' reference.
	 * @see #getGuardian()
	 * @generated
	 */
	void setGuardian(aFamily value);

} // Member
