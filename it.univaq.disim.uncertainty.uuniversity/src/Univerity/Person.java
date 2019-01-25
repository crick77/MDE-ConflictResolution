/**
 */
package Univerity;

import Univerity.uncertainty.ModelElement;
import Univerity.uncertainty.aPerson;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Univerity.Person#getName <em>Name</em>}</li>
 *   <li>{@link Univerity.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link Univerity.Person#getRelatives <em>Relatives</em>}</li>
 * </ul>
 *
 * @see Univerity.UniverityPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends ModelElement, aPerson {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Univerity.UniverityPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Univerity.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see Univerity.UniverityPackage#getPerson_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link Univerity.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Relatives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relatives</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relatives</em>' reference.
	 * @see #setRelatives(aPerson)
	 * @see Univerity.UniverityPackage#getPerson_Relatives()
	 * @model
	 * @generated
	 */
	aPerson getRelatives();

	/**
	 * Sets the value of the '{@link Univerity.Person#getRelatives <em>Relatives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relatives</em>' reference.
	 * @see #getRelatives()
	 * @generated
	 */
	void setRelatives(aPerson value);

} // Person
