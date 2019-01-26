/**
 */
package Families.uncertainty.impl;

import Families.Family;

import Families.uncertainty.OperatorType;
import Families.uncertainty.UData;
import Families.uncertainty.UncertaintyPackage;
import Families.uncertainty.uFamily;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>uFamily</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Families.uncertainty.impl.uFamilyImpl#getName <em>Name</em>}</li>
 *   <li>{@link Families.uncertainty.impl.uFamilyImpl#getUtype <em>Utype</em>}</li>
 *   <li>{@link Families.uncertainty.impl.uFamilyImpl#getUleft <em>Uleft</em>}</li>
 *   <li>{@link Families.uncertainty.impl.uFamilyImpl#getUright <em>Uright</em>}</li>
 *   <li>{@link Families.uncertainty.impl.uFamilyImpl#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class uFamilyImpl extends aFamilyImpl implements uFamily {
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
	 * The default value of the '{@link #getUtype() <em>Utype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtype()
	 * @generated
	 * @ordered
	 */
	protected static final OperatorType UTYPE_EDEFAULT = OperatorType.XOR;

	/**
	 * The cached value of the '{@link #getUtype() <em>Utype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtype()
	 * @generated
	 * @ordered
	 */
	protected OperatorType utype = UTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUleft() <em>Uleft</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUleft()
	 * @generated
	 * @ordered
	 */
	protected EList<Family> uleft;

	/**
	 * The cached value of the '{@link #getUright() <em>Uright</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUright()
	 * @generated
	 * @ordered
	 */
	protected EList<Family> uright;

	/**
	 * The cached value of the '{@link #getUpoint() <em>Upoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<uFamily> upoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected uFamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UncertaintyPackage.Literals.UFAMILY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyPackage.UFAMILY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorType getUtype() {
		return utype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtype(OperatorType newUtype) {
		OperatorType oldUtype = utype;
		utype = newUtype == null ? UTYPE_EDEFAULT : newUtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyPackage.UFAMILY__UTYPE, oldUtype, utype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Family> getUleft() {
		if (uleft == null) {
			uleft = new EObjectContainmentEList<Family>(Family.class, this, UncertaintyPackage.UFAMILY__ULEFT);
		}
		return uleft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Family> getUright() {
		if (uright == null) {
			uright = new EObjectContainmentEList<Family>(Family.class, this, UncertaintyPackage.UFAMILY__URIGHT);
		}
		return uright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uFamily> getUpoint() {
		if (upoint == null) {
			upoint = new EObjectContainmentEList<uFamily>(uFamily.class, this, UncertaintyPackage.UFAMILY__UPOINT);
		}
		return upoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UncertaintyPackage.UFAMILY__ULEFT:
				return ((InternalEList<?>)getUleft()).basicRemove(otherEnd, msgs);
			case UncertaintyPackage.UFAMILY__URIGHT:
				return ((InternalEList<?>)getUright()).basicRemove(otherEnd, msgs);
			case UncertaintyPackage.UFAMILY__UPOINT:
				return ((InternalEList<?>)getUpoint()).basicRemove(otherEnd, msgs);
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
			case UncertaintyPackage.UFAMILY__NAME:
				return getName();
			case UncertaintyPackage.UFAMILY__UTYPE:
				return getUtype();
			case UncertaintyPackage.UFAMILY__ULEFT:
				return getUleft();
			case UncertaintyPackage.UFAMILY__URIGHT:
				return getUright();
			case UncertaintyPackage.UFAMILY__UPOINT:
				return getUpoint();
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
			case UncertaintyPackage.UFAMILY__NAME:
				setName((String)newValue);
				return;
			case UncertaintyPackage.UFAMILY__UTYPE:
				setUtype((OperatorType)newValue);
				return;
			case UncertaintyPackage.UFAMILY__ULEFT:
				getUleft().clear();
				getUleft().addAll((Collection<? extends Family>)newValue);
				return;
			case UncertaintyPackage.UFAMILY__URIGHT:
				getUright().clear();
				getUright().addAll((Collection<? extends Family>)newValue);
				return;
			case UncertaintyPackage.UFAMILY__UPOINT:
				getUpoint().clear();
				getUpoint().addAll((Collection<? extends uFamily>)newValue);
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
			case UncertaintyPackage.UFAMILY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UncertaintyPackage.UFAMILY__UTYPE:
				setUtype(UTYPE_EDEFAULT);
				return;
			case UncertaintyPackage.UFAMILY__ULEFT:
				getUleft().clear();
				return;
			case UncertaintyPackage.UFAMILY__URIGHT:
				getUright().clear();
				return;
			case UncertaintyPackage.UFAMILY__UPOINT:
				getUpoint().clear();
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
			case UncertaintyPackage.UFAMILY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UncertaintyPackage.UFAMILY__UTYPE:
				return utype != UTYPE_EDEFAULT;
			case UncertaintyPackage.UFAMILY__ULEFT:
				return uleft != null && !uleft.isEmpty();
			case UncertaintyPackage.UFAMILY__URIGHT:
				return uright != null && !uright.isEmpty();
			case UncertaintyPackage.UFAMILY__UPOINT:
				return upoint != null && !upoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == UData.class) {
			switch (derivedFeatureID) {
				case UncertaintyPackage.UFAMILY__NAME: return UncertaintyPackage.UDATA__NAME;
				case UncertaintyPackage.UFAMILY__UTYPE: return UncertaintyPackage.UDATA__UTYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == UData.class) {
			switch (baseFeatureID) {
				case UncertaintyPackage.UDATA__NAME: return UncertaintyPackage.UFAMILY__NAME;
				case UncertaintyPackage.UDATA__UTYPE: return UncertaintyPackage.UFAMILY__UTYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", utype: ");
		result.append(utype);
		result.append(')');
		return result.toString();
	}

} //uFamilyImpl
