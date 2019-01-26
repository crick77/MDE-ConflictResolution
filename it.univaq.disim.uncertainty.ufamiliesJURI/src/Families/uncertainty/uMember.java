/**
 */
package Families.uncertainty;

import Families.Member;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uMember</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Families.uncertainty.uMember#getUleft <em>Uleft</em>}</li>
 *   <li>{@link Families.uncertainty.uMember#getUright <em>Uright</em>}</li>
 *   <li>{@link Families.uncertainty.uMember#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @see Families.uncertainty.UncertaintyPackage#getuMember()
 * @model
 * @generated
 */
public interface uMember extends aMember, UData {
	/**
	 * Returns the value of the '<em><b>Uleft</b></em>' containment reference list.
	 * The list contents are of type {@link Families.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uleft</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uleft</em>' containment reference list.
	 * @see Families.uncertainty.UncertaintyPackage#getuMember_Uleft()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getUleft();

	/**
	 * Returns the value of the '<em><b>Uright</b></em>' containment reference list.
	 * The list contents are of type {@link Families.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uright</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uright</em>' containment reference list.
	 * @see Families.uncertainty.UncertaintyPackage#getuMember_Uright()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getUright();

	/**
	 * Returns the value of the '<em><b>Upoint</b></em>' containment reference list.
	 * The list contents are of type {@link Families.uncertainty.uMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upoint</em>' containment reference list.
	 * @see Families.uncertainty.UncertaintyPackage#getuMember_Upoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<uMember> getUpoint();

} // uMember
