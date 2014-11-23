/**
 */
package Trialple;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Module Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Trialple.TrialplePackage#getModuleType()
 * @model extendedMetaData="name='ModuleType'"
 * @generated
 */
public enum ModuleType implements Enumerator {
	/**
	 * The '<em><b>Prepare</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPARE_VALUE
	 * @generated
	 * @ordered
	 */
	PREPARE(0, "prepare", "prepare"),

	/**
	 * The '<em><b>Upgrade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPGRADE_VALUE
	 * @generated
	 * @ordered
	 */
	UPGRADE(1, "upgrade", "upgrade"),

	/**
	 * The '<em><b>Revoke</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVOKE_VALUE
	 * @generated
	 * @ordered
	 */
	REVOKE(2, "revoke", "revoke");

	/**
	 * The '<em><b>Prepare</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prepare</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREPARE
	 * @model name="prepare"
	 * @generated
	 * @ordered
	 */
	public static final int PREPARE_VALUE = 0;

	/**
	 * The '<em><b>Upgrade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upgrade</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPGRADE
	 * @model name="upgrade"
	 * @generated
	 * @ordered
	 */
	public static final int UPGRADE_VALUE = 1;

	/**
	 * The '<em><b>Revoke</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Revoke</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVOKE
	 * @model name="revoke"
	 * @generated
	 * @ordered
	 */
	public static final int REVOKE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Module Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModuleType[] VALUES_ARRAY =
		new ModuleType[] {
			PREPARE,
			UPGRADE,
			REVOKE,
		};

	/**
	 * A public read-only list of all the '<em><b>Module Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModuleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Module Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModuleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModuleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Module Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModuleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModuleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Module Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModuleType get(int value) {
		switch (value) {
			case PREPARE_VALUE: return PREPARE;
			case UPGRADE_VALUE: return UPGRADE;
			case REVOKE_VALUE: return REVOKE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ModuleType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ModuleType
