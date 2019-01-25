/**
 */
package Univerity.impl;

import Univerity.Courses;
import Univerity.UniverityPackage;

import Univerity.uncertainty.aCourses;
import Univerity.uncertainty.aPerson;
import Univerity.uncertainty.impl.ModelElementImpl;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Courses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Univerity.impl.CoursesImpl#getName <em>Name</em>}</li>
 *   <li>{@link Univerity.impl.CoursesImpl#getCFU <em>CFU</em>}</li>
 *   <li>{@link Univerity.impl.CoursesImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link Univerity.impl.CoursesImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link Univerity.impl.CoursesImpl#getProfessor <em>Professor</em>}</li>
 *   <li>{@link Univerity.impl.CoursesImpl#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoursesImpl extends ModelElementImpl implements Courses {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCFU() <em>CFU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFU()
	 * @generated
	 * @ordered
	 */
	protected static final int CFU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCFU() <em>CFU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFU()
	 * @generated
	 * @ordered
	 */
	protected int cfu = CFU_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMESTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected String semester = SEMESTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<aCourses> links;

	/**
	 * The cached value of the '{@link #getProfessor() <em>Professor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessor()
	 * @generated
	 * @ordered
	 */
	protected aPerson professor;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected EList<aPerson> student;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoursesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniverityPackage.Literals.COURSES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniverityPackage.COURSES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCFU() {
		return cfu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCFU(int newCFU) {
		int oldCFU = cfu;
		cfu = newCFU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniverityPackage.COURSES__CFU, oldCFU, cfu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(String newSemester) {
		String oldSemester = semester;
		semester = newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniverityPackage.COURSES__SEMESTER, oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<aCourses> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<aCourses>(aCourses.class, this, UniverityPackage.COURSES__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public aPerson getProfessor() {
		return professor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfessor(aPerson newProfessor, NotificationChain msgs) {
		aPerson oldProfessor = professor;
		professor = newProfessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniverityPackage.COURSES__PROFESSOR, oldProfessor, newProfessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfessor(aPerson newProfessor) {
		if (newProfessor != professor) {
			NotificationChain msgs = null;
			if (professor != null)
				msgs = ((InternalEObject)professor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniverityPackage.COURSES__PROFESSOR, null, msgs);
			if (newProfessor != null)
				msgs = ((InternalEObject)newProfessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniverityPackage.COURSES__PROFESSOR, null, msgs);
			msgs = basicSetProfessor(newProfessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniverityPackage.COURSES__PROFESSOR, newProfessor, newProfessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<aPerson> getStudent() {
		if (student == null) {
			student = new EObjectContainmentEList<aPerson>(aPerson.class, this, UniverityPackage.COURSES__STUDENT);
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniverityPackage.COURSES__PROFESSOR:
				return basicSetProfessor(null, msgs);
			case UniverityPackage.COURSES__STUDENT:
				return ((InternalEList<?>)getStudent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniverityPackage.COURSES__NAME:
				return getName();
			case UniverityPackage.COURSES__CFU:
				return getCFU();
			case UniverityPackage.COURSES__SEMESTER:
				return getSemester();
			case UniverityPackage.COURSES__LINKS:
				return getLinks();
			case UniverityPackage.COURSES__PROFESSOR:
				return getProfessor();
			case UniverityPackage.COURSES__STUDENT:
				return getStudent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniverityPackage.COURSES__NAME:
				setName((String)newValue);
				return;
			case UniverityPackage.COURSES__CFU:
				setCFU((Integer)newValue);
				return;
			case UniverityPackage.COURSES__SEMESTER:
				setSemester((String)newValue);
				return;
			case UniverityPackage.COURSES__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends aCourses>)newValue);
				return;
			case UniverityPackage.COURSES__PROFESSOR:
				setProfessor((aPerson)newValue);
				return;
			case UniverityPackage.COURSES__STUDENT:
				getStudent().clear();
				getStudent().addAll((Collection<? extends aPerson>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UniverityPackage.COURSES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UniverityPackage.COURSES__CFU:
				setCFU(CFU_EDEFAULT);
				return;
			case UniverityPackage.COURSES__SEMESTER:
				setSemester(SEMESTER_EDEFAULT);
				return;
			case UniverityPackage.COURSES__LINKS:
				getLinks().clear();
				return;
			case UniverityPackage.COURSES__PROFESSOR:
				setProfessor((aPerson)null);
				return;
			case UniverityPackage.COURSES__STUDENT:
				getStudent().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UniverityPackage.COURSES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UniverityPackage.COURSES__CFU:
				return cfu != CFU_EDEFAULT;
			case UniverityPackage.COURSES__SEMESTER:
				return SEMESTER_EDEFAULT == null ? semester != null : !SEMESTER_EDEFAULT.equals(semester);
			case UniverityPackage.COURSES__LINKS:
				return links != null && !links.isEmpty();
			case UniverityPackage.COURSES__PROFESSOR:
				return professor != null;
			case UniverityPackage.COURSES__STUDENT:
				return student != null && !student.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", CFU: ");
		result.append(cfu);
		result.append(", Semester: ");
		result.append(semester);
		result.append(')');
		return result.toString();
	}

} //CoursesImpl
