/**
 */
package Families.uncertainty;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Families.uncertainty.ModelElement#getInclude <em>Include</em>}</li>
 *   <li>{@link Families.uncertainty.ModelElement#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @see Families.uncertainty.UncertaintyPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' reference list.
	 * The list contents are of type {@link Families.uncertainty.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' reference list.
	 * @see Families.uncertainty.UncertaintyPackage#getModelElement_Include()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getInclude();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' reference list.
	 * The list contents are of type {@link Families.uncertainty.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' reference list.
	 * @see Families.uncertainty.UncertaintyPackage#getModelElement_Exclude()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getExclude();

} // ModelElement
