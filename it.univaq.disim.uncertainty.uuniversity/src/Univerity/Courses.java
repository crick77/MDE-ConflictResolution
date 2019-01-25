/**
 */
package Univerity;

import Univerity.uncertainty.ModelElement;
import Univerity.uncertainty.aCourses;
import Univerity.uncertainty.aPerson;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Courses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Univerity.Courses#getName <em>Name</em>}</li>
 *   <li>{@link Univerity.Courses#getCFU <em>CFU</em>}</li>
 *   <li>{@link Univerity.Courses#getSemester <em>Semester</em>}</li>
 *   <li>{@link Univerity.Courses#getLinks <em>Links</em>}</li>
 *   <li>{@link Univerity.Courses#getProfessor <em>Professor</em>}</li>
 *   <li>{@link Univerity.Courses#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see Univerity.UniverityPackage#getCourses()
 * @model
 * @generated
 */
public interface Courses extends ModelElement, aCourses {
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
	 * @see Univerity.UniverityPackage#getCourses_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Univerity.Courses#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>CFU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CFU</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CFU</em>' attribute.
	 * @see #setCFU(int)
	 * @see Univerity.UniverityPackage#getCourses_CFU()
	 * @model
	 * @generated
	 */
	int getCFU();

	/**
	 * Sets the value of the '{@link Univerity.Courses#getCFU <em>CFU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CFU</em>' attribute.
	 * @see #getCFU()
	 * @generated
	 */
	void setCFU(int value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semester</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see #setSemester(String)
	 * @see Univerity.UniverityPackage#getCourses_Semester()
	 * @model
	 * @generated
	 */
	String getSemester();

	/**
	 * Sets the value of the '{@link Univerity.Courses#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link Univerity.uncertainty.aCourses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see Univerity.UniverityPackage#getCourses_Links()
	 * @model
	 * @generated
	 */
	EList<aCourses> getLinks();

	/**
	 * Returns the value of the '<em><b>Professor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Professor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professor</em>' containment reference.
	 * @see #setProfessor(aPerson)
	 * @see Univerity.UniverityPackage#getCourses_Professor()
	 * @model containment="true"
	 * @generated
	 */
	aPerson getProfessor();

	/**
	 * Sets the value of the '{@link Univerity.Courses#getProfessor <em>Professor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Professor</em>' containment reference.
	 * @see #getProfessor()
	 * @generated
	 */
	void setProfessor(aPerson value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' containment reference list.
	 * The list contents are of type {@link Univerity.uncertainty.aPerson}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' containment reference list.
	 * @see Univerity.UniverityPackage#getCourses_Student()
	 * @model containment="true"
	 * @generated
	 */
	EList<aPerson> getStudent();

} // Courses
