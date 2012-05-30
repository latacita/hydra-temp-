/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.tests;

import hydraconstraints.HydraconstraintsFactory;
import hydraconstraints.MultipleFeature;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multiple Feature</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultipleFeatureTest extends NumOperandChoicesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultipleFeatureTest.class);
	}

	/**
	 * Constructs a new Multiple Feature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleFeatureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multiple Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MultipleFeature getFixture() {
		return (MultipleFeature)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HydraconstraintsFactory.eINSTANCE.createMultipleFeature());
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

} //MultipleFeatureTest
