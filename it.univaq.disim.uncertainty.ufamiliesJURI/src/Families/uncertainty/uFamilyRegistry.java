/**
 */
package Families.uncertainty;

import Families.FamilyRegistry;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uFamily Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Families.uncertainty.uFamilyRegistry#getUleft <em>Uleft</em>}</li>
 *   <li>{@link Families.uncertainty.uFamilyRegistry#getUright <em>Uright</em>}</li>
 *   <li>{@link Families.uncertainty.uFamilyRegistry#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @see Families.uncertainty.UncertaintyPackage#getuFamilyRegistry()
 * @model
 * @generated
 */
public interface uFamilyRegistry extends aFamilyRegistry, UData {
	/**
	 * Returns the value of the '<em><b>Uleft</b></em>' containment reference list.
	 * The list contents are of type {@link Families.FamilyRegistry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uleft</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uleft</em>' containment reference list.
	 * @see Families.uncertainty.UncertaintyPackage#getuFamilyRegistry_Uleft()
	 * @model containment="true"
	 * @generated
	 */
	EList<FamilyRegistry> getUleft();

	/**
	 * Returns the value of the '<em><b>Uright</b></em>' containment reference list.
	 * The list contents are of type {@link Families.FamilyRegistry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uright</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uright</em>' containment reference list.
	 * @see Families.uncertainty.UncertaintyPackage#getuFamilyRegistry_Uright()
	 * @model containment="true"
	 * @generated
	 */
	EList<FamilyRegistry> getUright();

	/**
	 * Returns the value of the '<em><b>Upoint</b></em>' containment reference list.
	 * The list contents are of type {@link Families.uncertainty.uFamilyRegistry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upoint</em>' containment reference list.
	 * @see Families.uncertainty.UncertaintyPackage#getuFamilyRegistry_Upoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<uFamilyRegistry> getUpoint();

} // uFamilyRegistry
