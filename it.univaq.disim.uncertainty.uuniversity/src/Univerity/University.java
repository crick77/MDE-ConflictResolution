/**
 */
package Univerity;

import Univerity.uncertainty.ModelElement;
import Univerity.uncertainty.aCourses;
import Univerity.uncertainty.aUniversity;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Univerity.University#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see Univerity.UniverityPackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends ModelElement, aUniversity {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link Univerity.uncertainty.aCourses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see Univerity.UniverityPackage#getUniversity_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<aCourses> getCourses();

} // University
