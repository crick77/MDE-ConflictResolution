/**
 */
package Families;

import Families.uncertainty.ModelElement;
import Families.uncertainty.aFamily;
import Families.uncertainty.aFamilyRegistry;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Families.FamilyRegistry#getFamilies <em>Families</em>}</li>
 * </ul>
 *
 * @see Families.FamiliesPackage#getFamilyRegistry()
 * @model
 * @generated
 */
public interface FamilyRegistry extends ModelElement, aFamilyRegistry {
	/**
	 * Returns the value of the '<em><b>Families</b></em>' containment reference list.
	 * The list contents are of type {@link Families.uncertainty.aFamily}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Families</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Families</em>' containment reference list.
	 * @see Families.FamiliesPackage#getFamilyRegistry_Families()
	 * @model containment="true"
	 * @generated
	 */
	EList<aFamily> getFamilies();

} // FamilyRegistry
