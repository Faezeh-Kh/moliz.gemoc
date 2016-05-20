/**
 */
package umlTrace.Steps;

import org.gemoc.executionframework.engine.mse.SmallStep;

import umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution New Integer Less Function Behavior Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution()
 * @model
 * @generated
 */
public interface FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution extends FumlConfiguration_Classes_Kernel_Value_Copy_Value_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedIntegerLessFunctionBehaviorExecution getCaller();

} // FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution
