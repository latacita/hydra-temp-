/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specializationModel;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see specializationModel.SpecializationModelFactory
 * @model kind="package"
 * @generated
 */
public interface SpecializationModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "specializationModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://specializationmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "specializationModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecializationModelPackage eINSTANCE = specializationModel.impl.SpecializationModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link specializationModel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specializationModel.impl.NodeImpl
	 * @see specializationModel.impl.SpecializationModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FATHER = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link specializationModel.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specializationModel.impl.FeatureImpl
	 * @see specializationModel.impl.SpecializationModelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FATHER = NODE__FATHER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VALUE_TYPE = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Typed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPED_VALUE = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REFERENCES = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CHILDREN = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__STATE = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Real Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REAL_NAME = NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Referenciated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REFERENCIATED = NODE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = NODE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link specializationModel.impl.TypedValueImpl <em>Typed Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specializationModel.impl.TypedValueImpl
	 * @see specializationModel.impl.SpecializationModelPackageImpl#getTypedValue()
	 * @generated
	 */
	int TYPED_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VALUE__INTEGER_VALUE = 0;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VALUE__STRING_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Float Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VALUE__FLOAT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Feature Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VALUE__FEATURE_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Typed Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VALUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link specializationModel.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specializationModel.impl.ProjectImpl
	 * @see specializationModel.impl.SpecializationModelPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RELATIONS = 1;

	/**
	 * The feature id for the '<em><b>Feature Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FEATURE_MODEL_URI = 2;

	/**
	 * The feature id for the '<em><b>Name Constraints File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME_CONSTRAINTS_FILE = 3;

	/**
	 * The feature id for the '<em><b>Name Config File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME_CONFIG_FILE = 4;

	/**
	 * The feature id for the '<em><b>Number Of Products</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NUMBER_OF_PRODUCTS = 5;

	/**
	 * The feature id for the '<em><b>Infinite Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INFINITE_DOMAIN = 6;

	/**
	 * The feature id for the '<em><b>User Constraints State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__USER_CONSTRAINTS_STATE = 7;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link specializationModel.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specializationModel.impl.FeatureGroupImpl
	 * @see specializationModel.impl.SpecializationModelPackageImpl#getFeatureGroup()
	 * @generated
	 */
	int FEATURE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__FATHER = NODE__FATHER;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__LOWER_BOUND = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__UPPER_BOUND = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__TYPE = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CHILDREN = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link specializationModel.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specializationModel.impl.RelationImpl
	 * @see specializationModel.impl.SpecializationModelPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 5;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link specializationModel.impl.RelationFGImpl <em>Relation FG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specializationModel.impl.RelationFGImpl
	 * @see specializationModel.impl.SpecializationModelPackageImpl#getRelationFG()
	 * @generated
	 */
	int RELATION_FG = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FG__SOURCE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FG__TARGET = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation FG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FG_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link specializationModel.impl.RelationFeatureImpl <em>Relation Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specializationModel.impl.RelationFeatureImpl
	 * @see specializationModel.impl.SpecializationModelPackageImpl#getRelationFeature()
	 * @generated
	 */
	int RELATION_FEATURE = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE__SOURCE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE__TARGET = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE__LOWER_BOUND = RELATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE__UPPER_BOUND = RELATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE__TYPE = RELATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relation Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_FEATURE_COUNT = RELATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link specializationModel.ValueType <em>Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specializationModel.ValueType
	 * @see specializationModel.impl.SpecializationModelPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 8;

	/**
	 * The meta object id for the '{@link specializationModel.ConfigState <em>Config State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specializationModel.ConfigState
	 * @see specializationModel.impl.SpecializationModelPackageImpl#getConfigState()
	 * @generated
	 */
	int CONFIG_STATE = 9;

	/**
	 * The meta object id for the '{@link specializationModel.FeatureType <em>Feature Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specializationModel.FeatureType
	 * @see specializationModel.impl.SpecializationModelPackageImpl#getFeatureType()
	 * @generated
	 */
	int FEATURE_TYPE = 10;

	/**
	 * The meta object id for the '{@link specializationModel.FeatureGroupType <em>Feature Group Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specializationModel.FeatureGroupType
	 * @see specializationModel.impl.SpecializationModelPackageImpl#getFeatureGroupType()
	 * @generated
	 */
	int FEATURE_GROUP_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link specializationModel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see specializationModel.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see specializationModel.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.Feature#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see specializationModel.Feature#getValueType()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_ValueType();

	/**
	 * Returns the meta object for the containment reference '{@link specializationModel.Feature#getTypedValue <em>Typed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typed Value</em>'.
	 * @see specializationModel.Feature#getTypedValue()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_TypedValue();

	/**
	 * Returns the meta object for the reference '{@link specializationModel.Feature#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>References</em>'.
	 * @see specializationModel.Feature#getReferences()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_References();

	/**
	 * Returns the meta object for the reference list '{@link specializationModel.Feature#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see specializationModel.Feature#getChildren()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Children();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.Feature#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see specializationModel.Feature#getState()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_State();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.Feature#getRealName <em>Real Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Name</em>'.
	 * @see specializationModel.Feature#getRealName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_RealName();

	/**
	 * Returns the meta object for the reference list '{@link specializationModel.Feature#getReferenciated <em>Referenciated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenciated</em>'.
	 * @see specializationModel.Feature#getReferenciated()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Referenciated();

	/**
	 * Returns the meta object for class '{@link specializationModel.TypedValue <em>Typed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Value</em>'.
	 * @see specializationModel.TypedValue
	 * @generated
	 */
	EClass getTypedValue();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.TypedValue#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer Value</em>'.
	 * @see specializationModel.TypedValue#getIntegerValue()
	 * @see #getTypedValue()
	 * @generated
	 */
	EAttribute getTypedValue_IntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.TypedValue#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see specializationModel.TypedValue#getStringValue()
	 * @see #getTypedValue()
	 * @generated
	 */
	EAttribute getTypedValue_StringValue();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.TypedValue#getFloatValue <em>Float Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float Value</em>'.
	 * @see specializationModel.TypedValue#getFloatValue()
	 * @see #getTypedValue()
	 * @generated
	 */
	EAttribute getTypedValue_FloatValue();

	/**
	 * Returns the meta object for the reference '{@link specializationModel.TypedValue#getFeatureValue <em>Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Value</em>'.
	 * @see specializationModel.TypedValue#getFeatureValue()
	 * @see #getTypedValue()
	 * @generated
	 */
	EReference getTypedValue_FeatureValue();

	/**
	 * Returns the meta object for class '{@link specializationModel.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see specializationModel.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link specializationModel.Project#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see specializationModel.Project#getFeatures()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link specializationModel.Project#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see specializationModel.Project#getRelations()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Relations();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.Project#getFeatureModelURI <em>Feature Model URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Model URI</em>'.
	 * @see specializationModel.Project#getFeatureModelURI()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_FeatureModelURI();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.Project#getNameConstraintsFile <em>Name Constraints File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Constraints File</em>'.
	 * @see specializationModel.Project#getNameConstraintsFile()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_NameConstraintsFile();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.Project#getNameConfigFile <em>Name Config File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Config File</em>'.
	 * @see specializationModel.Project#getNameConfigFile()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_NameConfigFile();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.Project#getNumberOfProducts <em>Number Of Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Products</em>'.
	 * @see specializationModel.Project#getNumberOfProducts()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_NumberOfProducts();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.Project#isInfiniteDomain <em>Infinite Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infinite Domain</em>'.
	 * @see specializationModel.Project#isInfiniteDomain()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_InfiniteDomain();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.Project#isUserConstraintsState <em>User Constraints State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Constraints State</em>'.
	 * @see specializationModel.Project#isUserConstraintsState()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_UserConstraintsState();

	/**
	 * Returns the meta object for class '{@link specializationModel.FeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Group</em>'.
	 * @see specializationModel.FeatureGroup
	 * @generated
	 */
	EClass getFeatureGroup();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.FeatureGroup#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see specializationModel.FeatureGroup#getLowerBound()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EAttribute getFeatureGroup_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.FeatureGroup#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see specializationModel.FeatureGroup#getUpperBound()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EAttribute getFeatureGroup_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.FeatureGroup#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see specializationModel.FeatureGroup#getType()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EAttribute getFeatureGroup_Type();

	/**
	 * Returns the meta object for the reference list '{@link specializationModel.FeatureGroup#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see specializationModel.FeatureGroup#getChildren()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EReference getFeatureGroup_Children();

	/**
	 * Returns the meta object for class '{@link specializationModel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see specializationModel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link specializationModel.Node#getFather <em>Father</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Father</em>'.
	 * @see specializationModel.Node#getFather()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Father();

	/**
	 * Returns the meta object for class '{@link specializationModel.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see specializationModel.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for class '{@link specializationModel.RelationFG <em>Relation FG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation FG</em>'.
	 * @see specializationModel.RelationFG
	 * @generated
	 */
	EClass getRelationFG();

	/**
	 * Returns the meta object for the reference '{@link specializationModel.RelationFG#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see specializationModel.RelationFG#getSource()
	 * @see #getRelationFG()
	 * @generated
	 */
	EReference getRelationFG_Source();

	/**
	 * Returns the meta object for the reference '{@link specializationModel.RelationFG#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see specializationModel.RelationFG#getTarget()
	 * @see #getRelationFG()
	 * @generated
	 */
	EReference getRelationFG_Target();

	/**
	 * Returns the meta object for class '{@link specializationModel.RelationFeature <em>Relation Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Feature</em>'.
	 * @see specializationModel.RelationFeature
	 * @generated
	 */
	EClass getRelationFeature();

	/**
	 * Returns the meta object for the reference '{@link specializationModel.RelationFeature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see specializationModel.RelationFeature#getSource()
	 * @see #getRelationFeature()
	 * @generated
	 */
	EReference getRelationFeature_Source();

	/**
	 * Returns the meta object for the reference '{@link specializationModel.RelationFeature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see specializationModel.RelationFeature#getTarget()
	 * @see #getRelationFeature()
	 * @generated
	 */
	EReference getRelationFeature_Target();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.RelationFeature#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see specializationModel.RelationFeature#getLowerBound()
	 * @see #getRelationFeature()
	 * @generated
	 */
	EAttribute getRelationFeature_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.RelationFeature#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see specializationModel.RelationFeature#getUpperBound()
	 * @see #getRelationFeature()
	 * @generated
	 */
	EAttribute getRelationFeature_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link specializationModel.RelationFeature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see specializationModel.RelationFeature#getType()
	 * @see #getRelationFeature()
	 * @generated
	 */
	EAttribute getRelationFeature_Type();

	/**
	 * Returns the meta object for enum '{@link specializationModel.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Type</em>'.
	 * @see specializationModel.ValueType
	 * @generated
	 */
	EEnum getValueType();

	/**
	 * Returns the meta object for enum '{@link specializationModel.ConfigState <em>Config State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Config State</em>'.
	 * @see specializationModel.ConfigState
	 * @generated
	 */
	EEnum getConfigState();

	/**
	 * Returns the meta object for enum '{@link specializationModel.FeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Type</em>'.
	 * @see specializationModel.FeatureType
	 * @generated
	 */
	EEnum getFeatureType();

	/**
	 * Returns the meta object for enum '{@link specializationModel.FeatureGroupType <em>Feature Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Group Type</em>'.
	 * @see specializationModel.FeatureGroupType
	 * @generated
	 */
	EEnum getFeatureGroupType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpecializationModelFactory getSpecializationModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link specializationModel.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specializationModel.impl.FeatureImpl
		 * @see specializationModel.impl.SpecializationModelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__VALUE_TYPE = eINSTANCE.getFeature_ValueType();

		/**
		 * The meta object literal for the '<em><b>Typed Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__TYPED_VALUE = eINSTANCE.getFeature_TypedValue();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REFERENCES = eINSTANCE.getFeature_References();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CHILDREN = eINSTANCE.getFeature_Children();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__STATE = eINSTANCE.getFeature_State();

		/**
		 * The meta object literal for the '<em><b>Real Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__REAL_NAME = eINSTANCE.getFeature_RealName();

		/**
		 * The meta object literal for the '<em><b>Referenciated</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REFERENCIATED = eINSTANCE.getFeature_Referenciated();

		/**
		 * The meta object literal for the '{@link specializationModel.impl.TypedValueImpl <em>Typed Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specializationModel.impl.TypedValueImpl
		 * @see specializationModel.impl.SpecializationModelPackageImpl#getTypedValue()
		 * @generated
		 */
		EClass TYPED_VALUE = eINSTANCE.getTypedValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_VALUE__INTEGER_VALUE = eINSTANCE.getTypedValue_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_VALUE__STRING_VALUE = eINSTANCE.getTypedValue_StringValue();

		/**
		 * The meta object literal for the '<em><b>Float Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_VALUE__FLOAT_VALUE = eINSTANCE.getTypedValue_FloatValue();

		/**
		 * The meta object literal for the '<em><b>Feature Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_VALUE__FEATURE_VALUE = eINSTANCE.getTypedValue_FeatureValue();

		/**
		 * The meta object literal for the '{@link specializationModel.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specializationModel.impl.ProjectImpl
		 * @see specializationModel.impl.SpecializationModelPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__FEATURES = eINSTANCE.getProject_Features();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__RELATIONS = eINSTANCE.getProject_Relations();

		/**
		 * The meta object literal for the '<em><b>Feature Model URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__FEATURE_MODEL_URI = eINSTANCE.getProject_FeatureModelURI();

		/**
		 * The meta object literal for the '<em><b>Name Constraints File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME_CONSTRAINTS_FILE = eINSTANCE.getProject_NameConstraintsFile();

		/**
		 * The meta object literal for the '<em><b>Name Config File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME_CONFIG_FILE = eINSTANCE.getProject_NameConfigFile();

		/**
		 * The meta object literal for the '<em><b>Number Of Products</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NUMBER_OF_PRODUCTS = eINSTANCE.getProject_NumberOfProducts();

		/**
		 * The meta object literal for the '<em><b>Infinite Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__INFINITE_DOMAIN = eINSTANCE.getProject_InfiniteDomain();

		/**
		 * The meta object literal for the '<em><b>User Constraints State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__USER_CONSTRAINTS_STATE = eINSTANCE.getProject_UserConstraintsState();

		/**
		 * The meta object literal for the '{@link specializationModel.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specializationModel.impl.FeatureGroupImpl
		 * @see specializationModel.impl.SpecializationModelPackageImpl#getFeatureGroup()
		 * @generated
		 */
		EClass FEATURE_GROUP = eINSTANCE.getFeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_GROUP__LOWER_BOUND = eINSTANCE.getFeatureGroup_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_GROUP__UPPER_BOUND = eINSTANCE.getFeatureGroup_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_GROUP__TYPE = eINSTANCE.getFeatureGroup_Type();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_GROUP__CHILDREN = eINSTANCE.getFeatureGroup_Children();

		/**
		 * The meta object literal for the '{@link specializationModel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specializationModel.impl.NodeImpl
		 * @see specializationModel.impl.SpecializationModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Father</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FATHER = eINSTANCE.getNode_Father();

		/**
		 * The meta object literal for the '{@link specializationModel.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specializationModel.impl.RelationImpl
		 * @see specializationModel.impl.SpecializationModelPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '{@link specializationModel.impl.RelationFGImpl <em>Relation FG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specializationModel.impl.RelationFGImpl
		 * @see specializationModel.impl.SpecializationModelPackageImpl#getRelationFG()
		 * @generated
		 */
		EClass RELATION_FG = eINSTANCE.getRelationFG();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_FG__SOURCE = eINSTANCE.getRelationFG_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_FG__TARGET = eINSTANCE.getRelationFG_Target();

		/**
		 * The meta object literal for the '{@link specializationModel.impl.RelationFeatureImpl <em>Relation Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specializationModel.impl.RelationFeatureImpl
		 * @see specializationModel.impl.SpecializationModelPackageImpl#getRelationFeature()
		 * @generated
		 */
		EClass RELATION_FEATURE = eINSTANCE.getRelationFeature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_FEATURE__SOURCE = eINSTANCE.getRelationFeature_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_FEATURE__TARGET = eINSTANCE.getRelationFeature_Target();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_FEATURE__LOWER_BOUND = eINSTANCE.getRelationFeature_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_FEATURE__UPPER_BOUND = eINSTANCE.getRelationFeature_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_FEATURE__TYPE = eINSTANCE.getRelationFeature_Type();

		/**
		 * The meta object literal for the '{@link specializationModel.ValueType <em>Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specializationModel.ValueType
		 * @see specializationModel.impl.SpecializationModelPackageImpl#getValueType()
		 * @generated
		 */
		EEnum VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '{@link specializationModel.ConfigState <em>Config State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specializationModel.ConfigState
		 * @see specializationModel.impl.SpecializationModelPackageImpl#getConfigState()
		 * @generated
		 */
		EEnum CONFIG_STATE = eINSTANCE.getConfigState();

		/**
		 * The meta object literal for the '{@link specializationModel.FeatureType <em>Feature Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specializationModel.FeatureType
		 * @see specializationModel.impl.SpecializationModelPackageImpl#getFeatureType()
		 * @generated
		 */
		EEnum FEATURE_TYPE = eINSTANCE.getFeatureType();

		/**
		 * The meta object literal for the '{@link specializationModel.FeatureGroupType <em>Feature Group Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specializationModel.FeatureGroupType
		 * @see specializationModel.impl.SpecializationModelPackageImpl#getFeatureGroupType()
		 * @generated
		 */
		EEnum FEATURE_GROUP_TYPE = eINSTANCE.getFeatureGroupType();

	}

} //SpecializationModelPackage
