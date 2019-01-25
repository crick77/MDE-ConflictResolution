/**
 */
package Families;

import Families.uncertainty.ModelElement;
import Families.uncertainty.aFamily;
import Families.uncertainty.aMember;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Families.Family#getLastName <em>Last Name</em>}</li>
 *   <li>{@link Families.Family#getSons <em>Sons</em>}</li>
 *   <li>{@link Families.Family#getDaughters <em>Daughters</em>}</li>
 *   <li>{@link Families.Family#getMother <em>Mother</em>}</li>
 *   <li>{@link Families.Family#getFather <em>Father</em>}</li>
 *   <li>{@link Families.Family#getAddress <em>Address</em>}</li>
 *   <li>{@link Families.Family#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see Families.FamiliesPackage#getFamily()
 * @model
 * @generated
 */
public interface Family extends ModelElement, aFamily {
	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see Families.FamiliesPackage#getFamily_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link Families.Family#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Sons</b></em>' containment reference list.
	 * The list contents are of type {@link Families.uncertainty.aMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sons</em>' containment reference list.
	 * @see Families.FamiliesPackage#getFamily_Sons()
	 * @model containment="true"
	 * @generated
	 */
	EList<aMember> getSons();

	/**
	 * Returns the value of the '<em><b>Daughters</b></em>' containment reference list.
	 * The list contents are of type {@link Families.uncertainty.aMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daughters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daughters</em>' containment reference list.
	 * @see Families.FamiliesPackage#getFamily_Daughters()
	 * @model containment="true"
	 * @generated
	 */
	EList<aMember> getDaughters();

	/**
	 * Returns the value of the '<em><b>Mother</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mother</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mother</em>' containment reference.
	 * @see #setMother(aMember)
	 * @see Families.FamiliesPackage#getFamily_Mother()
	 * @model containment="true"
	 * @generated
	 */
	aMember getMother();

	/**
	 * Sets the value of the '{@link Families.Family#getMother <em>Mother</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mother</em>' containment reference.
	 * @see #getMother()
	 * @generated
	 */
	void setMother(aMember value);

	/**
	 * Returns the value of the '<em><b>Father</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Father</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' containment reference.
	 * @see #setFather(aMember)
	 * @see Families.FamiliesPackage#getFamily_Father()
	 * @model containment="true"
	 * @generated
	 */
	aMember getFather();

	/**
	 * Sets the value of the '{@link Families.Family#getFather <em>Father</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' containment reference.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(aMember value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see Families.FamiliesPackage#getFamily_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link Families.Family#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link Families.uncertainty.aFamily}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see Families.FamiliesPackage#getFamily_Links()
	 * @model
	 * @generated
	 */
	EList<aFamily> getLinks();

} // Family
