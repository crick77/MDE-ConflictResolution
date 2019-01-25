/**
 */
package Families;

import Families.uncertainty.UncertaintyPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see Families.FamiliesFactory
 * @model kind="package"
 * @generated
 */
public interface FamiliesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Families";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.univaq.disim/families";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Families";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FamiliesPackage eINSTANCE = Families.impl.FamiliesPackageImpl.init();

	/**
	 * The meta object id for the '{@link Families.impl.FamilyImpl <em>Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Families.impl.FamilyImpl
	 * @see Families.impl.FamiliesPackageImpl#getFamily()
	 * @generated
	 */
	int FAMILY = 0;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__INCLUDE = UncertaintyPackage.MODEL_ELEMENT__INCLUDE;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__EXCLUDE = UncertaintyPackage.MODEL_ELEMENT__EXCLUDE;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__LAST_NAME = UncertaintyPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__SONS = UncertaintyPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Daughters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__DAUGHTERS = UncertaintyPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mother</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__MOTHER = UncertaintyPackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Father</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__FATHER = UncertaintyPackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__ADDRESS = UncertaintyPackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__LINKS = UncertaintyPackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_FEATURE_COUNT = UncertaintyPackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_OPERATION_COUNT = UncertaintyPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Families.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Families.impl.MemberImpl
	 * @see Families.impl.FamiliesPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 1;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__INCLUDE = UncertaintyPackage.MODEL_ELEMENT__INCLUDE;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__EXCLUDE = UncertaintyPackage.MODEL_ELEMENT__EXCLUDE;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__FIRST_NAME = UncertaintyPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__AGE = UncertaintyPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relatives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__RELATIVES = UncertaintyPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = UncertaintyPackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = UncertaintyPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Families.impl.FamilyRegistryImpl <em>Family Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Families.impl.FamilyRegistryImpl
	 * @see Families.impl.FamiliesPackageImpl#getFamilyRegistry()
	 * @generated
	 */
	int FAMILY_REGISTRY = 2;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_REGISTRY__INCLUDE = UncertaintyPackage.MODEL_ELEMENT__INCLUDE;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_REGISTRY__EXCLUDE = UncertaintyPackage.MODEL_ELEMENT__EXCLUDE;

	/**
	 * The feature id for the '<em><b>Families</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_REGISTRY__FAMILIES = UncertaintyPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Family Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_REGISTRY_FEATURE_COUNT = UncertaintyPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Family Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_REGISTRY_OPERATION_COUNT = UncertaintyPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Families.Family <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family</em>'.
	 * @see Families.Family
	 * @generated
	 */
	EClass getFamily();

	/**
	 * Returns the meta object for the attribute '{@link Families.Family#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see Families.Family#getLastName()
	 * @see #getFamily()
	 * @generated
	 */
	EAttribute getFamily_LastName();

	/**
	 * Returns the meta object for the containment reference list '{@link Families.Family#getSons <em>Sons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sons</em>'.
	 * @see Families.Family#getSons()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Sons();

	/**
	 * Returns the meta object for the containment reference list '{@link Families.Family#getDaughters <em>Daughters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Daughters</em>'.
	 * @see Families.Family#getDaughters()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Daughters();

	/**
	 * Returns the meta object for the containment reference '{@link Families.Family#getMother <em>Mother</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mother</em>'.
	 * @see Families.Family#getMother()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Mother();

	/**
	 * Returns the meta object for the containment reference '{@link Families.Family#getFather <em>Father</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Father</em>'.
	 * @see Families.Family#getFather()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Father();

	/**
	 * Returns the meta object for the attribute '{@link Families.Family#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see Families.Family#getAddress()
	 * @see #getFamily()
	 * @generated
	 */
	EAttribute getFamily_Address();

	/**
	 * Returns the meta object for the reference list '{@link Families.Family#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see Families.Family#getLinks()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Links();

	/**
	 * Returns the meta object for class '{@link Families.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see Families.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the attribute '{@link Families.Member#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see Families.Member#getFirstName()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link Families.Member#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see Families.Member#getAge()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Age();

	/**
	 * Returns the meta object for the reference '{@link Families.Member#getRelatives <em>Relatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relatives</em>'.
	 * @see Families.Member#getRelatives()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Relatives();

	/**
	 * Returns the meta object for class '{@link Families.FamilyRegistry <em>Family Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family Registry</em>'.
	 * @see Families.FamilyRegistry
	 * @generated
	 */
	EClass getFamilyRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link Families.FamilyRegistry#getFamilies <em>Families</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Families</em>'.
	 * @see Families.FamilyRegistry#getFamilies()
	 * @see #getFamilyRegistry()
	 * @generated
	 */
	EReference getFamilyRegistry_Families();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FamiliesFactory getFamiliesFactory();

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
		 * The meta object literal for the '{@link Families.impl.FamilyImpl <em>Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Families.impl.FamilyImpl
		 * @see Families.impl.FamiliesPackageImpl#getFamily()
		 * @generated
		 */
		EClass FAMILY = eINSTANCE.getFamily();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAMILY__LAST_NAME = eINSTANCE.getFamily_LastName();

		/**
		 * The meta object literal for the '<em><b>Sons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__SONS = eINSTANCE.getFamily_Sons();

		/**
		 * The meta object literal for the '<em><b>Daughters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__DAUGHTERS = eINSTANCE.getFamily_Daughters();

		/**
		 * The meta object literal for the '<em><b>Mother</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__MOTHER = eINSTANCE.getFamily_Mother();

		/**
		 * The meta object literal for the '<em><b>Father</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__FATHER = eINSTANCE.getFamily_Father();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAMILY__ADDRESS = eINSTANCE.getFamily_Address();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__LINKS = eINSTANCE.getFamily_Links();

		/**
		 * The meta object literal for the '{@link Families.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Families.impl.MemberImpl
		 * @see Families.impl.FamiliesPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__FIRST_NAME = eINSTANCE.getMember_FirstName();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__AGE = eINSTANCE.getMember_Age();

		/**
		 * The meta object literal for the '<em><b>Relatives</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__RELATIVES = eINSTANCE.getMember_Relatives();

		/**
		 * The meta object literal for the '{@link Families.impl.FamilyRegistryImpl <em>Family Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Families.impl.FamilyRegistryImpl
		 * @see Families.impl.FamiliesPackageImpl#getFamilyRegistry()
		 * @generated
		 */
		EClass FAMILY_REGISTRY = eINSTANCE.getFamilyRegistry();

		/**
		 * The meta object literal for the '<em><b>Families</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_REGISTRY__FAMILIES = eINSTANCE.getFamilyRegistry_Families();

	}

} //FamiliesPackage
