/**
 */
package Families.uncertainty;

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
 * @see Families.uncertainty.UncertaintyFactory
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
	UncertaintyPackage eINSTANCE = Families.uncertainty.impl.UncertaintyPackageImpl.init();

	/**
	 * The meta object id for the '{@link Families.uncertainty.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Families.uncertainty.impl.ModelElementImpl
	 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getModelElement()
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
	 * The meta object id for the '{@link Families.uncertainty.impl.UDataImpl <em>UData</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Families.uncertainty.impl.UDataImpl
	 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getUData()
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
	 * The meta object id for the '{@link Families.uncertainty.impl.aFamilyImpl <em>aFamily</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Families.uncertainty.impl.aFamilyImpl
	 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getaFamily()
	 * @generated
	 */
	int AFAMILY = 3;

	/**
	 * The number of structural features of the '<em>aFamily</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFAMILY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aFamily</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFAMILY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Families.uncertainty.impl.uFamilyImpl <em>uFamily</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Families.uncertainty.impl.uFamilyImpl
	 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getuFamily()
	 * @generated
	 */
	int UFAMILY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFAMILY__NAME = AFAMILY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Utype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFAMILY__UTYPE = AFAMILY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFAMILY__ULEFT = AFAMILY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFAMILY__URIGHT = AFAMILY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFAMILY__UPOINT = AFAMILY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>uFamily</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFAMILY_FEATURE_COUNT = AFAMILY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>uFamily</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFAMILY_OPERATION_COUNT = AFAMILY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Families.uncertainty.impl.aMemberImpl <em>aMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Families.uncertainty.impl.aMemberImpl
	 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getaMember()
	 * @generated
	 */
	int AMEMBER = 5;

	/**
	 * The number of structural features of the '<em>aMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMEMBER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Families.uncertainty.impl.uMemberImpl <em>uMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Families.uncertainty.impl.uMemberImpl
	 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getuMember()
	 * @generated
	 */
	int UMEMBER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMEMBER__NAME = AMEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Utype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMEMBER__UTYPE = AMEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMEMBER__ULEFT = AMEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMEMBER__URIGHT = AMEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMEMBER__UPOINT = AMEMBER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>uMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMEMBER_FEATURE_COUNT = AMEMBER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>uMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMEMBER_OPERATION_COUNT = AMEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Families.uncertainty.impl.aFamilyRegistryImpl <em>aFamily Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Families.uncertainty.impl.aFamilyRegistryImpl
	 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getaFamilyRegistry()
	 * @generated
	 */
	int AFAMILY_REGISTRY = 7;

	/**
	 * The number of structural features of the '<em>aFamily Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFAMILY_REGISTRY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aFamily Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFAMILY_REGISTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Families.uncertainty.impl.uFamilyRegistryImpl <em>uFamily Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Families.uncertainty.impl.uFamilyRegistryImpl
	 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getuFamilyRegistry()
	 * @generated
	 */
	int UFAMILY_REGISTRY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFAMILY_REGISTRY__NAME = AFAMILY_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Utype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFAMILY_REGISTRY__UTYPE = AFAMILY_REGISTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFAMILY_REGISTRY__ULEFT = AFAMILY_REGISTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFAMILY_REGISTRY__URIGHT = AFAMILY_REGISTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFAMILY_REGISTRY__UPOINT = AFAMILY_REGISTRY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>uFamily Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFAMILY_REGISTRY_FEATURE_COUNT = AFAMILY_REGISTRY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>uFamily Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFAMILY_REGISTRY_OPERATION_COUNT = AFAMILY_REGISTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Families.uncertainty.OperatorType <em>Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Families.uncertainty.OperatorType
	 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getOperatorType()
	 * @generated
	 */
	int OPERATOR_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link Families.uncertainty.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see Families.uncertainty.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the reference list '{@link Families.uncertainty.ModelElement#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Include</em>'.
	 * @see Families.uncertainty.ModelElement#getInclude()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Include();

	/**
	 * Returns the meta object for the reference list '{@link Families.uncertainty.ModelElement#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exclude</em>'.
	 * @see Families.uncertainty.ModelElement#getExclude()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Exclude();

	/**
	 * Returns the meta object for class '{@link Families.uncertainty.UData <em>UData</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UData</em>'.
	 * @see Families.uncertainty.UData
	 * @generated
	 */
	EClass getUData();

	/**
	 * Returns the meta object for the attribute '{@link Families.uncertainty.UData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Families.uncertainty.UData#getName()
	 * @see #getUData()
	 * @generated
	 */
	EAttribute getUData_Name();

	/**
	 * Returns the meta object for the attribute '{@link Families.uncertainty.UData#getUtype <em>Utype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utype</em>'.
	 * @see Families.uncertainty.UData#getUtype()
	 * @see #getUData()
	 * @generated
	 */
	EAttribute getUData_Utype();

	/**
	 * Returns the meta object for class '{@link Families.uncertainty.uFamily <em>uFamily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uFamily</em>'.
	 * @see Families.uncertainty.uFamily
	 * @generated
	 */
	EClass getuFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link Families.uncertainty.uFamily#getUleft <em>Uleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uleft</em>'.
	 * @see Families.uncertainty.uFamily#getUleft()
	 * @see #getuFamily()
	 * @generated
	 */
	EReference getuFamily_Uleft();

	/**
	 * Returns the meta object for the containment reference list '{@link Families.uncertainty.uFamily#getUright <em>Uright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uright</em>'.
	 * @see Families.uncertainty.uFamily#getUright()
	 * @see #getuFamily()
	 * @generated
	 */
	EReference getuFamily_Uright();

	/**
	 * Returns the meta object for the containment reference list '{@link Families.uncertainty.uFamily#getUpoint <em>Upoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upoint</em>'.
	 * @see Families.uncertainty.uFamily#getUpoint()
	 * @see #getuFamily()
	 * @generated
	 */
	EReference getuFamily_Upoint();

	/**
	 * Returns the meta object for class '{@link Families.uncertainty.aFamily <em>aFamily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aFamily</em>'.
	 * @see Families.uncertainty.aFamily
	 * @generated
	 */
	EClass getaFamily();

	/**
	 * Returns the meta object for class '{@link Families.uncertainty.uMember <em>uMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uMember</em>'.
	 * @see Families.uncertainty.uMember
	 * @generated
	 */
	EClass getuMember();

	/**
	 * Returns the meta object for the containment reference list '{@link Families.uncertainty.uMember#getUleft <em>Uleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uleft</em>'.
	 * @see Families.uncertainty.uMember#getUleft()
	 * @see #getuMember()
	 * @generated
	 */
	EReference getuMember_Uleft();

	/**
	 * Returns the meta object for the containment reference list '{@link Families.uncertainty.uMember#getUright <em>Uright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uright</em>'.
	 * @see Families.uncertainty.uMember#getUright()
	 * @see #getuMember()
	 * @generated
	 */
	EReference getuMember_Uright();

	/**
	 * Returns the meta object for the containment reference list '{@link Families.uncertainty.uMember#getUpoint <em>Upoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upoint</em>'.
	 * @see Families.uncertainty.uMember#getUpoint()
	 * @see #getuMember()
	 * @generated
	 */
	EReference getuMember_Upoint();

	/**
	 * Returns the meta object for class '{@link Families.uncertainty.aMember <em>aMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aMember</em>'.
	 * @see Families.uncertainty.aMember
	 * @generated
	 */
	EClass getaMember();

	/**
	 * Returns the meta object for class '{@link Families.uncertainty.uFamilyRegistry <em>uFamily Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uFamily Registry</em>'.
	 * @see Families.uncertainty.uFamilyRegistry
	 * @generated
	 */
	EClass getuFamilyRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link Families.uncertainty.uFamilyRegistry#getUleft <em>Uleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uleft</em>'.
	 * @see Families.uncertainty.uFamilyRegistry#getUleft()
	 * @see #getuFamilyRegistry()
	 * @generated
	 */
	EReference getuFamilyRegistry_Uleft();

	/**
	 * Returns the meta object for the containment reference list '{@link Families.uncertainty.uFamilyRegistry#getUright <em>Uright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uright</em>'.
	 * @see Families.uncertainty.uFamilyRegistry#getUright()
	 * @see #getuFamilyRegistry()
	 * @generated
	 */
	EReference getuFamilyRegistry_Uright();

	/**
	 * Returns the meta object for the containment reference list '{@link Families.uncertainty.uFamilyRegistry#getUpoint <em>Upoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upoint</em>'.
	 * @see Families.uncertainty.uFamilyRegistry#getUpoint()
	 * @see #getuFamilyRegistry()
	 * @generated
	 */
	EReference getuFamilyRegistry_Upoint();

	/**
	 * Returns the meta object for class '{@link Families.uncertainty.aFamilyRegistry <em>aFamily Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aFamily Registry</em>'.
	 * @see Families.uncertainty.aFamilyRegistry
	 * @generated
	 */
	EClass getaFamilyRegistry();

	/**
	 * Returns the meta object for enum '{@link Families.uncertainty.OperatorType <em>Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Type</em>'.
	 * @see Families.uncertainty.OperatorType
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
		 * The meta object literal for the '{@link Families.uncertainty.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Families.uncertainty.impl.ModelElementImpl
		 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getModelElement()
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
		 * The meta object literal for the '{@link Families.uncertainty.impl.UDataImpl <em>UData</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Families.uncertainty.impl.UDataImpl
		 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getUData()
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
		 * The meta object literal for the '{@link Families.uncertainty.impl.uFamilyImpl <em>uFamily</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Families.uncertainty.impl.uFamilyImpl
		 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getuFamily()
		 * @generated
		 */
		EClass UFAMILY = eINSTANCE.getuFamily();

		/**
		 * The meta object literal for the '<em><b>Uleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFAMILY__ULEFT = eINSTANCE.getuFamily_Uleft();

		/**
		 * The meta object literal for the '<em><b>Uright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFAMILY__URIGHT = eINSTANCE.getuFamily_Uright();

		/**
		 * The meta object literal for the '<em><b>Upoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFAMILY__UPOINT = eINSTANCE.getuFamily_Upoint();

		/**
		 * The meta object literal for the '{@link Families.uncertainty.impl.aFamilyImpl <em>aFamily</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Families.uncertainty.impl.aFamilyImpl
		 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getaFamily()
		 * @generated
		 */
		EClass AFAMILY = eINSTANCE.getaFamily();

		/**
		 * The meta object literal for the '{@link Families.uncertainty.impl.uMemberImpl <em>uMember</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Families.uncertainty.impl.uMemberImpl
		 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getuMember()
		 * @generated
		 */
		EClass UMEMBER = eINSTANCE.getuMember();

		/**
		 * The meta object literal for the '<em><b>Uleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMEMBER__ULEFT = eINSTANCE.getuMember_Uleft();

		/**
		 * The meta object literal for the '<em><b>Uright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMEMBER__URIGHT = eINSTANCE.getuMember_Uright();

		/**
		 * The meta object literal for the '<em><b>Upoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMEMBER__UPOINT = eINSTANCE.getuMember_Upoint();

		/**
		 * The meta object literal for the '{@link Families.uncertainty.impl.aMemberImpl <em>aMember</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Families.uncertainty.impl.aMemberImpl
		 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getaMember()
		 * @generated
		 */
		EClass AMEMBER = eINSTANCE.getaMember();

		/**
		 * The meta object literal for the '{@link Families.uncertainty.impl.uFamilyRegistryImpl <em>uFamily Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Families.uncertainty.impl.uFamilyRegistryImpl
		 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getuFamilyRegistry()
		 * @generated
		 */
		EClass UFAMILY_REGISTRY = eINSTANCE.getuFamilyRegistry();

		/**
		 * The meta object literal for the '<em><b>Uleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFAMILY_REGISTRY__ULEFT = eINSTANCE.getuFamilyRegistry_Uleft();

		/**
		 * The meta object literal for the '<em><b>Uright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFAMILY_REGISTRY__URIGHT = eINSTANCE.getuFamilyRegistry_Uright();

		/**
		 * The meta object literal for the '<em><b>Upoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFAMILY_REGISTRY__UPOINT = eINSTANCE.getuFamilyRegistry_Upoint();

		/**
		 * The meta object literal for the '{@link Families.uncertainty.impl.aFamilyRegistryImpl <em>aFamily Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Families.uncertainty.impl.aFamilyRegistryImpl
		 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getaFamilyRegistry()
		 * @generated
		 */
		EClass AFAMILY_REGISTRY = eINSTANCE.getaFamilyRegistry();

		/**
		 * The meta object literal for the '{@link Families.uncertainty.OperatorType <em>Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Families.uncertainty.OperatorType
		 * @see Families.uncertainty.impl.UncertaintyPackageImpl#getOperatorType()
		 * @generated
		 */
		EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

	}

} //UncertaintyPackage
