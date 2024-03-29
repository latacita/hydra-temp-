/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.tests;

import hydraconstraints.HydraconstraintsFactory;
import hydraconstraints.LessOrEqual;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Less Or Equal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LessOrEqualTest extends ComparisonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LessOrEqualTest.class);
	}

	/**
	 * Constructs a new Less Or Equal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessOrEqualTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Less Or Equal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LessOrEqual getFixture() {
		return (LessOrEqual)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HydraconstraintsFactory.eINSTANCE.createLessOrEqual());
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

} //LessOrEqualTest
