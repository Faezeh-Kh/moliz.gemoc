/**
 */
package petrinetTrace.Steps;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gemoc.executionframework.engine.mse.MsePackage;

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
 * @see petrinetTrace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "petrinetTrace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = petrinetTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.SpecificStep
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = MsePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = MsePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = MsePackage.STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = MsePackage.STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_OPERATION_COUNT = MsePackage.STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_RunImpl <em>Petrinet Configuration Net Configuration Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_RunImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Run()
	 * @generated
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Petrinet Configuration Net Configuration Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Petrinet Configuration Net Configuration Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep <em>Petrinet Configuration Net Configuration Run Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Run_AbstractSubStep()
	 * @generated
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Configuration Net Configuration Run Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Petrinet Configuration Net Configuration Run Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_Run_ImplicitStepImpl <em>Petrinet Configuration Net Configuration Run Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_Run_ImplicitStepImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Run_ImplicitStep()
	 * @generated
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP__MSEOCCURRENCE = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP__ENDING_STATE = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP__STARTING_STATE = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Configuration Net Configuration Run Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP_FEATURE_COUNT = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Petrinet Configuration Net Configuration Run Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP_OPERATION_COUNT = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.PetrinetConfiguration_TransitionConfiguration_FireImpl <em>Petrinet Configuration Transition Configuration Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.PetrinetConfiguration_TransitionConfiguration_FireImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_TransitionConfiguration_Fire()
	 * @generated
	 */
	int PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE__MSEOCCURRENCE = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE__ENDING_STATE = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE__STARTING_STATE = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Configuration Transition Configuration Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_FEATURE_COUNT = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE___GET_CALLER = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Petrinet Configuration Transition Configuration Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_OPERATION_COUNT = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.RootImplicitStepImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = MsePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = MsePackage.SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_OPERATION_COUNT = MsePackage.SMALL_STEP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run <em>Petrinet Configuration Net Configuration Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Configuration Net Configuration Run</em>'.
	 * @see petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run
	 * @generated
	 */
	EClass getPetrinetConfiguration_NetConfiguration_Run();

	/**
	 * Returns the meta object for the '{@link petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run#getCaller()
	 * @generated
	 */
	EOperation getPetrinetConfiguration_NetConfiguration_Run__GetCaller();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep <em>Petrinet Configuration Net Configuration Run Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Configuration Net Configuration Run Abstract Sub Step</em>'.
	 * @see petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep
	 * @generated
	 */
	EClass getPetrinetConfiguration_NetConfiguration_Run_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_ImplicitStep <em>Petrinet Configuration Net Configuration Run Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Configuration Net Configuration Run Implicit Step</em>'.
	 * @see petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_ImplicitStep
	 * @generated
	 */
	EClass getPetrinetConfiguration_NetConfiguration_Run_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire <em>Petrinet Configuration Transition Configuration Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Configuration Transition Configuration Fire</em>'.
	 * @see petrinetTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire
	 * @generated
	 */
	EClass getPetrinetConfiguration_TransitionConfiguration_Fire();

	/**
	 * Returns the meta object for the '{@link petrinetTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see petrinetTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire#getCaller()
	 * @generated
	 */
	EOperation getPetrinetConfiguration_TransitionConfiguration_Fire__GetCaller();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see petrinetTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see petrinetTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the meta object for the reference '{@link petrinetTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see petrinetTrace.Steps.SpecificStep#getEndingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link petrinetTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see petrinetTrace.Steps.SpecificStep#getStartingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_StartingState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

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
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_RunImpl <em>Petrinet Configuration Net Configuration Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_RunImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Run()
		 * @generated
		 */
		EClass PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN = eINSTANCE.getPetrinetConfiguration_NetConfiguration_Run();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN___GET_CALLER = eINSTANCE.getPetrinetConfiguration_NetConfiguration_Run__GetCaller();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep <em>Petrinet Configuration Net Configuration Run Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Run_AbstractSubStep()
		 * @generated
		 */
		EClass PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP = eINSTANCE.getPetrinetConfiguration_NetConfiguration_Run_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_Run_ImplicitStepImpl <em>Petrinet Configuration Net Configuration Run Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_Run_ImplicitStepImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Run_ImplicitStep()
		 * @generated
		 */
		EClass PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP = eINSTANCE.getPetrinetConfiguration_NetConfiguration_Run_ImplicitStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.PetrinetConfiguration_TransitionConfiguration_FireImpl <em>Petrinet Configuration Transition Configuration Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.PetrinetConfiguration_TransitionConfiguration_FireImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_TransitionConfiguration_Fire()
		 * @generated
		 */
		EClass PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE = eINSTANCE.getPetrinetConfiguration_TransitionConfiguration_Fire();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE___GET_CALLER = eINSTANCE.getPetrinetConfiguration_TransitionConfiguration_Fire__GetCaller();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.RootImplicitStepImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.SpecificStep
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__ENDING_STATE = eINSTANCE.getSpecificStep_EndingState();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__STARTING_STATE = eINSTANCE.getSpecificStep_StartingState();

	}

} //StepsPackage
