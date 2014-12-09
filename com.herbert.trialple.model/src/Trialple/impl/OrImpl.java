/**
 */
package Trialple.impl;

import Trialple.And;
import Trialple.Not;
import Trialple.Option;
import Trialple.Or;
import Trialple.TrialplePackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Trialple.impl.OrImpl#getOption <em>Option</em>}</li>
 *   <li>{@link Trialple.impl.OrImpl#getAnd <em>And</em>}</li>
 *   <li>{@link Trialple.impl.OrImpl#getNot <em>Not</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrImpl extends MinimalEObjectImpl.Container implements Or {
	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> option;

	/**
	 * The cached value of the '{@link #getAnd() <em>And</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnd()
	 * @generated
	 * @ordered
	 */
	protected EList<And> and;
	/**
	 * The cached value of the '{@link #getNot() <em>Not</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNot()
	 * @generated
	 * @ordered
	 */
	protected EList<Not> not;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrialplePackage.Literals.OR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOption() {
		if (option == null) {
			option = new EObjectContainmentEList<Option>(Option.class, this, TrialplePackage.OR__OPTION);
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<And> getAnd() {
		if (and == null) {
			and = new EObjectContainmentEList<And>(And.class, this, TrialplePackage.OR__AND);
		}
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Not> getNot() {
		if (not == null) {
			not = new EObjectContainmentEList<Not>(Not.class, this, TrialplePackage.OR__NOT);
		}
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrialplePackage.OR__OPTION:
				return ((InternalEList<?>)getOption()).basicRemove(otherEnd, msgs);
			case TrialplePackage.OR__AND:
				return ((InternalEList<?>)getAnd()).basicRemove(otherEnd, msgs);
			case TrialplePackage.OR__NOT:
				return ((InternalEList<?>)getNot()).basicRemove(otherEnd, msgs);
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
			case TrialplePackage.OR__OPTION:
				return getOption();
			case TrialplePackage.OR__AND:
				return getAnd();
			case TrialplePackage.OR__NOT:
				return getNot();
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
			case TrialplePackage.OR__OPTION:
				getOption().clear();
				getOption().addAll((Collection<? extends Option>)newValue);
				return;
			case TrialplePackage.OR__AND:
				getAnd().clear();
				getAnd().addAll((Collection<? extends And>)newValue);
				return;
			case TrialplePackage.OR__NOT:
				getNot().clear();
				getNot().addAll((Collection<? extends Not>)newValue);
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
			case TrialplePackage.OR__OPTION:
				getOption().clear();
				return;
			case TrialplePackage.OR__AND:
				getAnd().clear();
				return;
			case TrialplePackage.OR__NOT:
				getNot().clear();
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
			case TrialplePackage.OR__OPTION:
				return option != null && !option.isEmpty();
			case TrialplePackage.OR__AND:
				return and != null && !and.isEmpty();
			case TrialplePackage.OR__NOT:
				return not != null && !not.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrImpl
