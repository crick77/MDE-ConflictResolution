/**
 */
package Families.uncertainty;

import Families.Family;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uFamily</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Families.uncertainty.uFamily#getUleft <em>Uleft</em>}</li>
 *   <li>{@link Families.uncertainty.uFamily#getUright <em>Uright</em>}</li>
 *   <li>{@link Families.uncertainty.uFamily#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @see Families.uncertainty.UncertaintyPackage#getuFamily()
 * @model
 * @generated
 */
public interface uFamily extends aFamily, UData {
	/**
	 * Returns the value of the '<em><b>Uleft</b></em>' containment reference list.
	 * The list contents are of type {@link Families.Family}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uleft</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uleft</em>' containment reference list.
	 * @see Families.uncertainty.UncertaintyPackage#getuFamily_Uleft()
	 * @model containment="true"
	 * @generated
	 */
	EList<Family> getUleft();

	/**
	 * Returns the value of the '<em><b>Uright</b></em>' containment reference list.
	 * The list contents are of type {@link Families.Family}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uright</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uright</em>' containment reference list.
	 * @see Families.uncertainty.UncertaintyPackage#getuFamily_Uright()
	 * @model containment="true"
	 * @generated
	 */
	EList<Family> getUright();

	/**
	 * Returns the value of the '<em><b>Upoint</b></em>' containment reference list.
	 * The list contents are of type {@link Families.uncertainty.uFamily}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upoint</em>' containment reference list.
	 * @see Families.uncertainty.UncertaintyPackage#getuFamily_Upoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<uFamily> getUpoint();

} // uFamily
