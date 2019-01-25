/**
 */
package Families.impl;

import Families.FamiliesPackage;
import Families.Family;

import Families.uncertainty.aMember;

import Families.uncertainty.impl.ModelElementImpl;

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
 * An implementation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Families.impl.FamilyImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link Families.impl.FamilyImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link Families.impl.FamilyImpl#getMother <em>Mother</em>}</li>
 *   <li>{@link Families.impl.FamilyImpl#getFather <em>Father</em>}</li>
 *   <li>{@link Families.impl.FamilyImpl#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyImpl extends ModelElementImpl implements Family {
	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<aMember> children;

	/**
	 * The cached value of the '{@link #getMother() <em>Mother</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMother()
	 * @generated
	 * @ordered
	 */
	protected aMember mother;

	/**
	 * The cached value of the '{@link #getFather() <em>Father</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFather()
	 * @generated
	 * @ordered
	 */
	protected aMember father;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamiliesPackage.Literals.FAMILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesPackage.FAMILY__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<aMember> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<aMember>(aMember.class, this, FamiliesPackage.FAMILY__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public aMember getMother() {
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMother(aMember newMother, NotificationChain msgs) {
		aMember oldMother = mother;
		mother = newMother;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FamiliesPackage.FAMILY__MOTHER, oldMother, newMother);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMother(aMember newMother) {
		if (newMother != mother) {
			NotificationChain msgs = null;
			if (mother != null)
				msgs = ((InternalEObject)mother).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FamiliesPackage.FAMILY__MOTHER, null, msgs);
			if (newMother != null)
				msgs = ((InternalEObject)newMother).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FamiliesPackage.FAMILY__MOTHER, null, msgs);
			msgs = basicSetMother(newMother, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesPackage.FAMILY__MOTHER, newMother, newMother));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public aMember getFather() {
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFather(aMember newFather, NotificationChain msgs) {
		aMember oldFather = father;
		father = newFather;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FamiliesPackage.FAMILY__FATHER, oldFather, newFather);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFather(aMember newFather) {
		if (newFather != father) {
			NotificationChain msgs = null;
			if (father != null)
				msgs = ((InternalEObject)father).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FamiliesPackage.FAMILY__FATHER, null, msgs);
			if (newFather != null)
				msgs = ((InternalEObject)newFather).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FamiliesPackage.FAMILY__FATHER, null, msgs);
			msgs = basicSetFather(newFather, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesPackage.FAMILY__FATHER, newFather, newFather));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesPackage.FAMILY__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FamiliesPackage.FAMILY__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case FamiliesPackage.FAMILY__MOTHER:
				return basicSetMother(null, msgs);
			case FamiliesPackage.FAMILY__FATHER:
				return basicSetFather(null, msgs);
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
			case FamiliesPackage.FAMILY__LAST_NAME:
				return getLastName();
			case FamiliesPackage.FAMILY__CHILDREN:
				return getChildren();
			case FamiliesPackage.FAMILY__MOTHER:
				return getMother();
			case FamiliesPackage.FAMILY__FATHER:
				return getFather();
			case FamiliesPackage.FAMILY__ADDRESS:
				return getAddress();
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
			case FamiliesPackage.FAMILY__LAST_NAME:
				setLastName((String)newValue);
				return;
			case FamiliesPackage.FAMILY__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends aMember>)newValue);
				return;
			case FamiliesPackage.FAMILY__MOTHER:
				setMother((aMember)newValue);
				return;
			case FamiliesPackage.FAMILY__FATHER:
				setFather((aMember)newValue);
				return;
			case FamiliesPackage.FAMILY__ADDRESS:
				setAddress((String)newValue);
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
			case FamiliesPackage.FAMILY__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case FamiliesPackage.FAMILY__CHILDREN:
				getChildren().clear();
				return;
			case FamiliesPackage.FAMILY__MOTHER:
				setMother((aMember)null);
				return;
			case FamiliesPackage.FAMILY__FATHER:
				setFather((aMember)null);
				return;
			case FamiliesPackage.FAMILY__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
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
			case FamiliesPackage.FAMILY__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case FamiliesPackage.FAMILY__CHILDREN:
				return children != null && !children.isEmpty();
			case FamiliesPackage.FAMILY__MOTHER:
				return mother != null;
			case FamiliesPackage.FAMILY__FATHER:
				return father != null;
			case FamiliesPackage.FAMILY__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
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
		result.append(" (lastName: ");
		result.append(lastName);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //FamilyImpl
