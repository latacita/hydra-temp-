/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specializationModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import specializationModel.Relation;
import specializationModel.SpecializationModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationTest extends TestCase {

	/**
	 * The fixture for this Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Relation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationTest.class);
	}

	/**
	 * Constructs a new Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Relation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Relation getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpecializationModelFactory.eINSTANCE.createRelation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RelationTest
