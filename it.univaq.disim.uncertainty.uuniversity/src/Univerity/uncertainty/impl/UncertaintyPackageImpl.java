/**
 */
package Univerity.uncertainty.impl;

import Univerity.UniverityPackage;

import Univerity.impl.UniverityPackageImpl;

import Univerity.uncertainty.ModelElement;
import Univerity.uncertainty.OperatorType;
import Univerity.uncertainty.UData;
import Univerity.uncertainty.UncertaintyFactory;
import Univerity.uncertainty.UncertaintyPackage;
import Univerity.uncertainty.aCourses;
import Univerity.uncertainty.aPerson;
import Univerity.uncertainty.aUniversity;
import Univerity.uncertainty.uCourses;
import Univerity.uncertainty.uPerson;
import Univerity.uncertainty.uUniversity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UncertaintyPackageImpl extends EPackageImpl implements UncertaintyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uCoursesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aCoursesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uUniversityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aUniversityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Univerity.uncertainty.UncertaintyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UncertaintyPackageImpl() {
		super(eNS_URI, UncertaintyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UncertaintyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UncertaintyPackage init() {
		if (isInited) return (UncertaintyPackage)EPackage.Registry.INSTANCE.getEPackage(UncertaintyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUncertaintyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UncertaintyPackageImpl theUncertaintyPackage = registeredUncertaintyPackage instanceof UncertaintyPackageImpl ? (UncertaintyPackageImpl)registeredUncertaintyPackage : new UncertaintyPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UniverityPackage.eNS_URI);
		UniverityPackageImpl theUniverityPackage = (UniverityPackageImpl)(registeredPackage instanceof UniverityPackageImpl ? registeredPackage : UniverityPackage.eINSTANCE);

		// Create package meta-data objects
		theUncertaintyPackage.createPackageContents();
		theUniverityPackage.createPackageContents();

		// Initialize created meta-data
		theUncertaintyPackage.initializePackageContents();
		theUniverityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUncertaintyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UncertaintyPackage.eNS_URI, theUncertaintyPackage);
		return theUncertaintyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Include() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Exclude() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUData() {
		return uDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUData_Name() {
		return (EAttribute)uDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUData_Utype() {
		return (EAttribute)uDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuCourses() {
		return uCoursesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCourses_Uleft() {
		return (EReference)uCoursesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCourses_Uright() {
		return (EReference)uCoursesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCourses_Upoint() {
		return (EReference)uCoursesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaCourses() {
		return aCoursesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuPerson() {
		return uPersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPerson_Uleft() {
		return (EReference)uPersonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPerson_Uright() {
		return (EReference)uPersonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPerson_Upoint() {
		return (EReference)uPersonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaPerson() {
		return aPersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuUniversity() {
		return uUniversityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuUniversity_Uleft() {
		return (EReference)uUniversityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuUniversity_Uright() {
		return (EReference)uUniversityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuUniversity_Upoint() {
		return (EReference)uUniversityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaUniversity() {
		return aUniversityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperatorType() {
		return operatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyFactory getUncertaintyFactory() {
		return (UncertaintyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEReference(modelElementEClass, MODEL_ELEMENT__INCLUDE);
		createEReference(modelElementEClass, MODEL_ELEMENT__EXCLUDE);

		uDataEClass = createEClass(UDATA);
		createEAttribute(uDataEClass, UDATA__NAME);
		createEAttribute(uDataEClass, UDATA__UTYPE);

		uCoursesEClass = createEClass(UCOURSES);
		createEReference(uCoursesEClass, UCOURSES__ULEFT);
		createEReference(uCoursesEClass, UCOURSES__URIGHT);
		createEReference(uCoursesEClass, UCOURSES__UPOINT);

		aCoursesEClass = createEClass(ACOURSES);

		uPersonEClass = createEClass(UPERSON);
		createEReference(uPersonEClass, UPERSON__ULEFT);
		createEReference(uPersonEClass, UPERSON__URIGHT);
		createEReference(uPersonEClass, UPERSON__UPOINT);

		aPersonEClass = createEClass(APERSON);

		uUniversityEClass = createEClass(UUNIVERSITY);
		createEReference(uUniversityEClass, UUNIVERSITY__ULEFT);
		createEReference(uUniversityEClass, UUNIVERSITY__URIGHT);
		createEReference(uUniversityEClass, UUNIVERSITY__UPOINT);

		aUniversityEClass = createEClass(AUNIVERSITY);

		// Create enums
		operatorTypeEEnum = createEEnum(OPERATOR_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UniverityPackage theUniverityPackage = (UniverityPackage)EPackage.Registry.INSTANCE.getEPackage(UniverityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uCoursesEClass.getESuperTypes().add(this.getaCourses());
		uCoursesEClass.getESuperTypes().add(this.getUData());
		uPersonEClass.getESuperTypes().add(this.getaPerson());
		uPersonEClass.getESuperTypes().add(this.getUData());
		uUniversityEClass.getESuperTypes().add(this.getaUniversity());
		uUniversityEClass.getESuperTypes().add(this.getUData());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElement_Include(), this.getModelElement(), null, "include", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Exclude(), this.getModelElement(), null, "exclude", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uDataEClass, UData.class, "UData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUData_Name(), ecorePackage.getEString(), "name", null, 0, 1, UData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUData_Utype(), this.getOperatorType(), "utype", null, 0, 1, UData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uCoursesEClass, uCourses.class, "uCourses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuCourses_Uleft(), theUniverityPackage.getCourses(), null, "uleft", null, 0, -1, uCourses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuCourses_Uright(), theUniverityPackage.getCourses(), null, "uright", null, 0, -1, uCourses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuCourses_Upoint(), this.getuCourses(), null, "upoint", null, 0, -1, uCourses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aCoursesEClass, aCourses.class, "aCourses", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uPersonEClass, uPerson.class, "uPerson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuPerson_Uleft(), theUniverityPackage.getPerson(), null, "uleft", null, 0, -1, uPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuPerson_Uright(), theUniverityPackage.getPerson(), null, "uright", null, 0, -1, uPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuPerson_Upoint(), this.getuPerson(), null, "upoint", null, 0, -1, uPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aPersonEClass, aPerson.class, "aPerson", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uUniversityEClass, uUniversity.class, "uUniversity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuUniversity_Uleft(), theUniverityPackage.getUniversity(), null, "uleft", null, 0, -1, uUniversity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuUniversity_Uright(), theUniverityPackage.getUniversity(), null, "uright", null, 0, -1, uUniversity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuUniversity_Upoint(), this.getuUniversity(), null, "upoint", null, 0, -1, uUniversity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aUniversityEClass, aUniversity.class, "aUniversity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(operatorTypeEEnum, OperatorType.class, "OperatorType");
		addEEnumLiteral(operatorTypeEEnum, OperatorType.XOR);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.AND);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.OR);
	}

} //UncertaintyPackageImpl
