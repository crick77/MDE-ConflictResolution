/**
 */
package Univerity.uncertainty;

import Univerity.University;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uUniversity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Univerity.uncertainty.uUniversity#getUleft <em>Uleft</em>}</li>
 *   <li>{@link Univerity.uncertainty.uUniversity#getUright <em>Uright</em>}</li>
 *   <li>{@link Univerity.uncertainty.uUniversity#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @see Univerity.uncertainty.UncertaintyPackage#getuUniversity()
 * @model
 * @generated
 */
public interface uUniversity extends aUniversity, UData {
	/**
	 * Returns the value of the '<em><b>Uleft</b></em>' containment reference list.
	 * The list contents are of type {@link Univerity.University}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uleft</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uleft</em>' containment reference list.
	 * @see Univerity.uncertainty.UncertaintyPackage#getuUniversity_Uleft()
	 * @model containment="true"
	 * @generated
	 */
	EList<University> getUleft();

	/**
	 * Returns the value of the '<em><b>Uright</b></em>' containment reference list.
	 * The list contents are of type {@link Univerity.University}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uright</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uright</em>' containment reference list.
	 * @see Univerity.uncertainty.UncertaintyPackage#getuUniversity_Uright()
	 * @model containment="true"
	 * @generated
	 */
	EList<University> getUright();

	/**
	 * Returns the value of the '<em><b>Upoint</b></em>' containment reference list.
	 * The list contents are of type {@link Univerity.uncertainty.uUniversity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upoint</em>' containment reference list.
	 * @see Univerity.uncertainty.UncertaintyPackage#getuUniversity_Upoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<uUniversity> getUpoint();

} // uUniversity
