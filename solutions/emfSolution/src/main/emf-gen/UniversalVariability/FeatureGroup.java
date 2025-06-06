/**
 */
package UniversalVariability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversalVariability.FeatureGroup#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see UniversalVariability.UniversalVariabilityPackage#getFeatureGroup()
 * @model abstract="true"
 * @generated
 */
public interface FeatureGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link UniversalVariability.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see UniversalVariability.UniversalVariabilityPackage#getFeatureGroup_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // FeatureGroup
