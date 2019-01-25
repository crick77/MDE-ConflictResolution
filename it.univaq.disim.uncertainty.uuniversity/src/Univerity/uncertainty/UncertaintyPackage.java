/**
 */
package Univerity.uncertainty;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Univerity.uncertainty.UncertaintyFactory
 * @model kind="package"
 * @generated
 */
public interface UncertaintyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uncertainty";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "uncertainty";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uncertainty";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UncertaintyPackage eINSTANCE = Univerity.uncertainty.impl.UncertaintyPackageImpl.init();

	/**
	 * The meta object id for the '{@link Univerity.uncertainty.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Univerity.uncertainty.impl.ModelElementImpl
	 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__INCLUDE = 0;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__EXCLUDE = 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Univerity.uncertainty.impl.UDataImpl <em>UData</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Univerity.uncertainty.impl.UDataImpl
	 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getUData()
	 * @generated
	 */
	int UDATA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Utype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDATA__UTYPE = 1;

	/**
	 * The number of structural features of the '<em>UData</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>UData</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Univerity.uncertainty.impl.aCoursesImpl <em>aCourses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Univerity.uncertainty.impl.aCoursesImpl
	 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getaCourses()
	 * @generated
	 */
	int ACOURSES = 3;

	/**
	 * The number of structural features of the '<em>aCourses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOURSES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aCourses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOURSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Univerity.uncertainty.impl.uCoursesImpl <em>uCourses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Univerity.uncertainty.impl.uCoursesImpl
	 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getuCourses()
	 * @generated
	 */
	int UCOURSES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCOURSES__NAME = ACOURSES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Utype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCOURSES__UTYPE = ACOURSES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCOURSES__ULEFT = ACOURSES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCOURSES__URIGHT = ACOURSES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCOURSES__UPOINT = ACOURSES_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>uCourses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCOURSES_FEATURE_COUNT = ACOURSES_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>uCourses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCOURSES_OPERATION_COUNT = ACOURSES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Univerity.uncertainty.impl.aPersonImpl <em>aPerson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Univerity.uncertainty.impl.aPersonImpl
	 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getaPerson()
	 * @generated
	 */
	int APERSON = 5;

	/**
	 * The number of structural features of the '<em>aPerson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERSON_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aPerson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Univerity.uncertainty.impl.uPersonImpl <em>uPerson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Univerity.uncertainty.impl.uPersonImpl
	 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getuPerson()
	 * @generated
	 */
	int UPERSON = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPERSON__NAME = APERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Utype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPERSON__UTYPE = APERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPERSON__ULEFT = APERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPERSON__URIGHT = APERSON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPERSON__UPOINT = APERSON_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>uPerson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPERSON_FEATURE_COUNT = APERSON_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>uPerson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPERSON_OPERATION_COUNT = APERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Univerity.uncertainty.impl.aUniversityImpl <em>aUniversity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Univerity.uncertainty.impl.aUniversityImpl
	 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getaUniversity()
	 * @generated
	 */
	int AUNIVERSITY = 7;

	/**
	 * The number of structural features of the '<em>aUniversity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIVERSITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aUniversity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIVERSITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Univerity.uncertainty.impl.uUniversityImpl <em>uUniversity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Univerity.uncertainty.impl.uUniversityImpl
	 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getuUniversity()
	 * @generated
	 */
	int UUNIVERSITY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUNIVERSITY__NAME = AUNIVERSITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Utype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUNIVERSITY__UTYPE = AUNIVERSITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUNIVERSITY__ULEFT = AUNIVERSITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUNIVERSITY__URIGHT = AUNIVERSITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUNIVERSITY__UPOINT = AUNIVERSITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>uUniversity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUNIVERSITY_FEATURE_COUNT = AUNIVERSITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>uUniversity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUNIVERSITY_OPERATION_COUNT = AUNIVERSITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Univerity.uncertainty.OperatorType <em>Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Univerity.uncertainty.OperatorType
	 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getOperatorType()
	 * @generated
	 */
	int OPERATOR_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link Univerity.uncertainty.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see Univerity.uncertainty.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the reference list '{@link Univerity.uncertainty.ModelElement#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Include</em>'.
	 * @see Univerity.uncertainty.ModelElement#getInclude()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Include();

	/**
	 * Returns the meta object for the reference list '{@link Univerity.uncertainty.ModelElement#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exclude</em>'.
	 * @see Univerity.uncertainty.ModelElement#getExclude()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Exclude();

	/**
	 * Returns the meta object for class '{@link Univerity.uncertainty.UData <em>UData</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UData</em>'.
	 * @see Univerity.uncertainty.UData
	 * @generated
	 */
	EClass getUData();

	/**
	 * Returns the meta object for the attribute '{@link Univerity.uncertainty.UData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Univerity.uncertainty.UData#getName()
	 * @see #getUData()
	 * @generated
	 */
	EAttribute getUData_Name();

	/**
	 * Returns the meta object for the attribute '{@link Univerity.uncertainty.UData#getUtype <em>Utype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utype</em>'.
	 * @see Univerity.uncertainty.UData#getUtype()
	 * @see #getUData()
	 * @generated
	 */
	EAttribute getUData_Utype();

	/**
	 * Returns the meta object for class '{@link Univerity.uncertainty.uCourses <em>uCourses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uCourses</em>'.
	 * @see Univerity.uncertainty.uCourses
	 * @generated
	 */
	EClass getuCourses();

	/**
	 * Returns the meta object for the containment reference list '{@link Univerity.uncertainty.uCourses#getUleft <em>Uleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uleft</em>'.
	 * @see Univerity.uncertainty.uCourses#getUleft()
	 * @see #getuCourses()
	 * @generated
	 */
	EReference getuCourses_Uleft();

	/**
	 * Returns the meta object for the containment reference list '{@link Univerity.uncertainty.uCourses#getUright <em>Uright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uright</em>'.
	 * @see Univerity.uncertainty.uCourses#getUright()
	 * @see #getuCourses()
	 * @generated
	 */
	EReference getuCourses_Uright();

	/**
	 * Returns the meta object for the containment reference list '{@link Univerity.uncertainty.uCourses#getUpoint <em>Upoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upoint</em>'.
	 * @see Univerity.uncertainty.uCourses#getUpoint()
	 * @see #getuCourses()
	 * @generated
	 */
	EReference getuCourses_Upoint();

	/**
	 * Returns the meta object for class '{@link Univerity.uncertainty.aCourses <em>aCourses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aCourses</em>'.
	 * @see Univerity.uncertainty.aCourses
	 * @generated
	 */
	EClass getaCourses();

	/**
	 * Returns the meta object for class '{@link Univerity.uncertainty.uPerson <em>uPerson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uPerson</em>'.
	 * @see Univerity.uncertainty.uPerson
	 * @generated
	 */
	EClass getuPerson();

	/**
	 * Returns the meta object for the containment reference list '{@link Univerity.uncertainty.uPerson#getUleft <em>Uleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uleft</em>'.
	 * @see Univerity.uncertainty.uPerson#getUleft()
	 * @see #getuPerson()
	 * @generated
	 */
	EReference getuPerson_Uleft();

	/**
	 * Returns the meta object for the containment reference list '{@link Univerity.uncertainty.uPerson#getUright <em>Uright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uright</em>'.
	 * @see Univerity.uncertainty.uPerson#getUright()
	 * @see #getuPerson()
	 * @generated
	 */
	EReference getuPerson_Uright();

	/**
	 * Returns the meta object for the containment reference list '{@link Univerity.uncertainty.uPerson#getUpoint <em>Upoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upoint</em>'.
	 * @see Univerity.uncertainty.uPerson#getUpoint()
	 * @see #getuPerson()
	 * @generated
	 */
	EReference getuPerson_Upoint();

	/**
	 * Returns the meta object for class '{@link Univerity.uncertainty.aPerson <em>aPerson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aPerson</em>'.
	 * @see Univerity.uncertainty.aPerson
	 * @generated
	 */
	EClass getaPerson();

	/**
	 * Returns the meta object for class '{@link Univerity.uncertainty.uUniversity <em>uUniversity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uUniversity</em>'.
	 * @see Univerity.uncertainty.uUniversity
	 * @generated
	 */
	EClass getuUniversity();

	/**
	 * Returns the meta object for the containment reference list '{@link Univerity.uncertainty.uUniversity#getUleft <em>Uleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uleft</em>'.
	 * @see Univerity.uncertainty.uUniversity#getUleft()
	 * @see #getuUniversity()
	 * @generated
	 */
	EReference getuUniversity_Uleft();

	/**
	 * Returns the meta object for the containment reference list '{@link Univerity.uncertainty.uUniversity#getUright <em>Uright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uright</em>'.
	 * @see Univerity.uncertainty.uUniversity#getUright()
	 * @see #getuUniversity()
	 * @generated
	 */
	EReference getuUniversity_Uright();

	/**
	 * Returns the meta object for the containment reference list '{@link Univerity.uncertainty.uUniversity#getUpoint <em>Upoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upoint</em>'.
	 * @see Univerity.uncertainty.uUniversity#getUpoint()
	 * @see #getuUniversity()
	 * @generated
	 */
	EReference getuUniversity_Upoint();

	/**
	 * Returns the meta object for class '{@link Univerity.uncertainty.aUniversity <em>aUniversity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aUniversity</em>'.
	 * @see Univerity.uncertainty.aUniversity
	 * @generated
	 */
	EClass getaUniversity();

	/**
	 * Returns the meta object for enum '{@link Univerity.uncertainty.OperatorType <em>Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Type</em>'.
	 * @see Univerity.uncertainty.OperatorType
	 * @generated
	 */
	EEnum getOperatorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UncertaintyFactory getUncertaintyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Univerity.uncertainty.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Univerity.uncertainty.impl.ModelElementImpl
		 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__INCLUDE = eINSTANCE.getModelElement_Include();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__EXCLUDE = eINSTANCE.getModelElement_Exclude();

		/**
		 * The meta object literal for the '{@link Univerity.uncertainty.impl.UDataImpl <em>UData</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Univerity.uncertainty.impl.UDataImpl
		 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getUData()
		 * @generated
		 */
		EClass UDATA = eINSTANCE.getUData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDATA__NAME = eINSTANCE.getUData_Name();

		/**
		 * The meta object literal for the '<em><b>Utype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDATA__UTYPE = eINSTANCE.getUData_Utype();

		/**
		 * The meta object literal for the '{@link Univerity.uncertainty.impl.uCoursesImpl <em>uCourses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Univerity.uncertainty.impl.uCoursesImpl
		 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getuCourses()
		 * @generated
		 */
		EClass UCOURSES = eINSTANCE.getuCourses();

		/**
		 * The meta object literal for the '<em><b>Uleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UCOURSES__ULEFT = eINSTANCE.getuCourses_Uleft();

		/**
		 * The meta object literal for the '<em><b>Uright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UCOURSES__URIGHT = eINSTANCE.getuCourses_Uright();

		/**
		 * The meta object literal for the '<em><b>Upoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UCOURSES__UPOINT = eINSTANCE.getuCourses_Upoint();

		/**
		 * The meta object literal for the '{@link Univerity.uncertainty.impl.aCoursesImpl <em>aCourses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Univerity.uncertainty.impl.aCoursesImpl
		 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getaCourses()
		 * @generated
		 */
		EClass ACOURSES = eINSTANCE.getaCourses();

		/**
		 * The meta object literal for the '{@link Univerity.uncertainty.impl.uPersonImpl <em>uPerson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Univerity.uncertainty.impl.uPersonImpl
		 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getuPerson()
		 * @generated
		 */
		EClass UPERSON = eINSTANCE.getuPerson();

		/**
		 * The meta object literal for the '<em><b>Uleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPERSON__ULEFT = eINSTANCE.getuPerson_Uleft();

		/**
		 * The meta object literal for the '<em><b>Uright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPERSON__URIGHT = eINSTANCE.getuPerson_Uright();

		/**
		 * The meta object literal for the '<em><b>Upoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPERSON__UPOINT = eINSTANCE.getuPerson_Upoint();

		/**
		 * The meta object literal for the '{@link Univerity.uncertainty.impl.aPersonImpl <em>aPerson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Univerity.uncertainty.impl.aPersonImpl
		 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getaPerson()
		 * @generated
		 */
		EClass APERSON = eINSTANCE.getaPerson();

		/**
		 * The meta object literal for the '{@link Univerity.uncertainty.impl.uUniversityImpl <em>uUniversity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Univerity.uncertainty.impl.uUniversityImpl
		 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getuUniversity()
		 * @generated
		 */
		EClass UUNIVERSITY = eINSTANCE.getuUniversity();

		/**
		 * The meta object literal for the '<em><b>Uleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UUNIVERSITY__ULEFT = eINSTANCE.getuUniversity_Uleft();

		/**
		 * The meta object literal for the '<em><b>Uright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UUNIVERSITY__URIGHT = eINSTANCE.getuUniversity_Uright();

		/**
		 * The meta object literal for the '<em><b>Upoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UUNIVERSITY__UPOINT = eINSTANCE.getuUniversity_Upoint();

		/**
		 * The meta object literal for the '{@link Univerity.uncertainty.impl.aUniversityImpl <em>aUniversity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Univerity.uncertainty.impl.aUniversityImpl
		 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getaUniversity()
		 * @generated
		 */
		EClass AUNIVERSITY = eINSTANCE.getaUniversity();

		/**
		 * The meta object literal for the '{@link Univerity.uncertainty.OperatorType <em>Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Univerity.uncertainty.OperatorType
		 * @see Univerity.uncertainty.impl.UncertaintyPackageImpl#getOperatorType()
		 * @generated
		 */
		EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

	}

} //UncertaintyPackage
