/**
 */
package Families.uncertainty;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UData</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Families.uncertainty.UData#getName <em>Name</em>}</li>
 *   <li>{@link Families.uncertainty.UData#getUtype <em>Utype</em>}</li>
 * </ul>
 *
 * @see Families.uncertainty.UncertaintyPackage#getUData()
 * @model abstract="true"
 * @generated
 */
public interface UData extends EObject {
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
	 * @see Families.uncertainty.UncertaintyPackage#getUData_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Families.uncertainty.UData#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Utype</b></em>' attribute.
	 * The literals are from the enumeration {@link Families.uncertainty.OperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utype</em>' attribute.
	 * @see Families.uncertainty.OperatorType
	 * @see #setUtype(OperatorType)
	 * @see Families.uncertainty.UncertaintyPackage#getUData_Utype()
	 * @model
	 * @generated
	 */
	OperatorType getUtype();

	/**
	 * Sets the value of the '{@link Families.uncertainty.UData#getUtype <em>Utype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utype</em>' attribute.
	 * @see Families.uncertainty.OperatorType
	 * @see #getUtype()
	 * @generated
	 */
	void setUtype(OperatorType value);

} // UData
