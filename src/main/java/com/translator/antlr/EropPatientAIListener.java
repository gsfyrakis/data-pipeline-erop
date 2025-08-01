// Generated from EropPatientAI.g4 by ANTLR 4.4
package com.translator.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EropPatientAIParser}.
 */
public interface EropPatientAIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#eventmatch}.
	 * @param ctx the parse tree
	 */
	void enterEventmatch(@NotNull EropPatientAIParser.EventmatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#eventmatch}.
	 * @param ctx the parse tree
	 */
	void exitEventmatch(@NotNull EropPatientAIParser.EventmatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RhsactionLabel}
	 * labeled alternative in {@link EropPatientAIParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhsactionLabel(@NotNull EropPatientAIParser.RhsactionLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RhsactionLabel}
	 * labeled alternative in {@link EropPatientAIParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhsactionLabel(@NotNull EropPatientAIParser.RhsactionLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#rulename}.
	 * @param ctx the parse tree
	 */
	void enterRulename(@NotNull EropPatientAIParser.RulenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#rulename}.
	 * @param ctx the parse tree
	 */
	void exitRulename(@NotNull EropPatientAIParser.RulenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeInNotInDigit}
	 * labeled alternative in {@link EropPatientAIParser#timePartialComparison}.
	 * @param ctx the parse tree
	 */
	void enterTimeInNotInDigit(@NotNull EropPatientAIParser.TimeInNotInDigitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeInNotInDigit}
	 * labeled alternative in {@link EropPatientAIParser#timePartialComparison}.
	 * @param ctx the parse tree
	 */
	void exitTimeInNotInDigit(@NotNull EropPatientAIParser.TimeInNotInDigitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInRopSet}
	 * labeled alternative in {@link EropPatientAIParser#ropConstraint}.
	 * @param ctx the parse tree
	 */
	void enterNotInRopSet(@NotNull EropPatientAIParser.NotInRopSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInRopSet}
	 * labeled alternative in {@link EropPatientAIParser#ropConstraint}.
	 * @param ctx the parse tree
	 */
	void exitNotInRopSet(@NotNull EropPatientAIParser.NotInRopSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Success}
	 * labeled alternative in {@link EropPatientAIParser#statusGuard}.
	 * @param ctx the parse tree
	 */
	void enterSuccess(@NotNull EropPatientAIParser.SuccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Success}
	 * labeled alternative in {@link EropPatientAIParser#statusGuard}.
	 * @param ctx the parse tree
	 */
	void exitSuccess(@NotNull EropPatientAIParser.SuccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Otherwise}
	 * labeled alternative in {@link EropPatientAIParser#statusGuard}.
	 * @param ctx the parse tree
	 */
	void enterOtherwise(@NotNull EropPatientAIParser.OtherwiseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Otherwise}
	 * labeled alternative in {@link EropPatientAIParser#statusGuard}.
	 * @param ctx the parse tree
	 */
	void exitOtherwise(@NotNull EropPatientAIParser.OtherwiseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeConstraintText}
	 * labeled alternative in {@link EropPatientAIParser#timeConstraintString}.
	 * @param ctx the parse tree
	 */
	void enterTimeConstraintText(@NotNull EropPatientAIParser.TimeConstraintTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeConstraintText}
	 * labeled alternative in {@link EropPatientAIParser#timeConstraintString}.
	 * @param ctx the parse tree
	 */
	void exitTimeConstraintText(@NotNull EropPatientAIParser.TimeConstraintTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Originator}
	 * labeled alternative in {@link EropPatientAIParser#eventCondition}.
	 * @param ctx the parse tree
	 */
	void enterOriginator(@NotNull EropPatientAIParser.OriginatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Originator}
	 * labeled alternative in {@link EropPatientAIParser#eventCondition}.
	 * @param ctx the parse tree
	 */
	void exitOriginator(@NotNull EropPatientAIParser.OriginatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RemactionLabel}
	 * labeled alternative in {@link EropPatientAIParser#rhsaction}.
	 * @param ctx the parse tree
	 */
	void enterRemactionLabel(@NotNull EropPatientAIParser.RemactionLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RemactionLabel}
	 * labeled alternative in {@link EropPatientAIParser#rhsaction}.
	 * @param ctx the parse tree
	 */
	void exitRemactionLabel(@NotNull EropPatientAIParser.RemactionLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#addaction}.
	 * @param ctx the parse tree
	 */
	void enterAddaction(@NotNull EropPatientAIParser.AddactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#addaction}.
	 * @param ctx the parse tree
	 */
	void exitAddaction(@NotNull EropPatientAIParser.AddactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PassactionLabel}
	 * labeled alternative in {@link EropPatientAIParser#rhsaction}.
	 * @param ctx the parse tree
	 */
	void enterPassactionLabel(@NotNull EropPatientAIParser.PassactionLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PassactionLabel}
	 * labeled alternative in {@link EropPatientAIParser#rhsaction}.
	 * @param ctx the parse tree
	 */
	void exitPassactionLabel(@NotNull EropPatientAIParser.PassactionLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionSimpleCondition}
	 * labeled alternative in {@link EropPatientAIParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionSimpleCondition(@NotNull EropPatientAIParser.ComparisonExpressionSimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionSimpleCondition}
	 * labeled alternative in {@link EropPatientAIParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionSimpleCondition(@NotNull EropPatientAIParser.ComparisonExpressionSimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ActionResponderIdentifier}
	 * labeled alternative in {@link EropPatientAIParser#actionResponder}.
	 * @param ctx the parse tree
	 */
	void enterActionResponderIdentifier(@NotNull EropPatientAIParser.ActionResponderIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ActionResponderIdentifier}
	 * labeled alternative in {@link EropPatientAIParser#actionResponder}.
	 * @param ctx the parse tree
	 */
	void exitActionResponderIdentifier(@NotNull EropPatientAIParser.ActionResponderIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DayInNotInWeekDay}
	 * labeled alternative in {@link EropPatientAIParser#timePartialComparison}.
	 * @param ctx the parse tree
	 */
	void enterDayInNotInWeekDay(@NotNull EropPatientAIParser.DayInNotInWeekDayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DayInNotInWeekDay}
	 * labeled alternative in {@link EropPatientAIParser#timePartialComparison}.
	 * @param ctx the parse tree
	 */
	void exitDayInNotInWeekDay(@NotNull EropPatientAIParser.DayInNotInWeekDayContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(@NotNull EropPatientAIParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(@NotNull EropPatientAIParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BizFailOutcome}
	 * labeled alternative in {@link EropPatientAIParser#outcome}.
	 * @param ctx the parse tree
	 */
	void enterBizFailOutcome(@NotNull EropPatientAIParser.BizFailOutcomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BizFailOutcome}
	 * labeled alternative in {@link EropPatientAIParser#outcome}.
	 * @param ctx the parse tree
	 */
	void exitBizFailOutcome(@NotNull EropPatientAIParser.BizFailOutcomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#rhsactionList}.
	 * @param ctx the parse tree
	 */
	void enterRhsactionList(@NotNull EropPatientAIParser.RhsactionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#rhsactionList}.
	 * @param ctx the parse tree
	 */
	void exitRhsactionList(@NotNull EropPatientAIParser.RhsactionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(@NotNull EropPatientAIParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(@NotNull EropPatientAIParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#happened_expression}.
	 * @param ctx the parse tree
	 */
	void enterHappened_expression(@NotNull EropPatientAIParser.Happened_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#happened_expression}.
	 * @param ctx the parse tree
	 */
	void exitHappened_expression(@NotNull EropPatientAIParser.Happened_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionExpressionTerm}
	 * labeled alternative in {@link EropPatientAIParser#conditionTerm}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpressionTerm(@NotNull EropPatientAIParser.ConditionExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionExpressionTerm}
	 * labeled alternative in {@link EropPatientAIParser#conditionTerm}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpressionTerm(@NotNull EropPatientAIParser.ConditionExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionSimpleCondition}
	 * labeled alternative in {@link EropPatientAIParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionSimpleCondition(@NotNull EropPatientAIParser.LogicalExpressionSimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionSimpleCondition}
	 * labeled alternative in {@link EropPatientAIParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionSimpleCondition(@NotNull EropPatientAIParser.LogicalExpressionSimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfstatementAction}
	 * labeled alternative in {@link EropPatientAIParser#rhsaction}.
	 * @param ctx the parse tree
	 */
	void enterIfstatementAction(@NotNull EropPatientAIParser.IfstatementActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfstatementAction}
	 * labeled alternative in {@link EropPatientAIParser#rhsaction}.
	 * @param ctx the parse tree
	 */
	void exitIfstatementAction(@NotNull EropPatientAIParser.IfstatementActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#statusGuardBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatusGuardBlock(@NotNull EropPatientAIParser.StatusGuardBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#statusGuardBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatusGuardBlock(@NotNull EropPatientAIParser.StatusGuardBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoTypeLogicalExpression}
	 * labeled alternative in {@link EropPatientAIParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoTypeLogicalExpression(@NotNull EropPatientAIParser.BoTypeLogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoTypeLogicalExpression}
	 * labeled alternative in {@link EropPatientAIParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoTypeLogicalExpression(@NotNull EropPatientAIParser.BoTypeLogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TecFail}
	 * labeled alternative in {@link EropPatientAIParser#statusGuard}.
	 * @param ctx the parse tree
	 */
	void enterTecFail(@NotNull EropPatientAIParser.TecFailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TecFail}
	 * labeled alternative in {@link EropPatientAIParser#statusGuard}.
	 * @param ctx the parse tree
	 */
	void exitTecFail(@NotNull EropPatientAIParser.TecFailContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(@NotNull EropPatientAIParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(@NotNull EropPatientAIParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#ropEntity}.
	 * @param ctx the parse tree
	 */
	void enterRopEntity(@NotNull EropPatientAIParser.RopEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#ropEntity}.
	 * @param ctx the parse tree
	 */
	void exitRopEntity(@NotNull EropPatientAIParser.RopEntityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InRopSetSimpleCondition}
	 * labeled alternative in {@link EropPatientAIParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void enterInRopSetSimpleCondition(@NotNull EropPatientAIParser.InRopSetSimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InRopSetSimpleCondition}
	 * labeled alternative in {@link EropPatientAIParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void exitInRopSetSimpleCondition(@NotNull EropPatientAIParser.InRopSetSimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#roleplayerConstraint}.
	 * @param ctx the parse tree
	 */
	void enterRoleplayerConstraint(@NotNull EropPatientAIParser.RoleplayerConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#roleplayerConstraint}.
	 * @param ctx the parse tree
	 */
	void exitRoleplayerConstraint(@NotNull EropPatientAIParser.RoleplayerConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InDotRopSet}
	 * labeled alternative in {@link EropPatientAIParser#booleanConstraint}.
	 * @param ctx the parse tree
	 */
	void enterInDotRopSet(@NotNull EropPatientAIParser.InDotRopSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InDotRopSet}
	 * labeled alternative in {@link EropPatientAIParser#booleanConstraint}.
	 * @param ctx the parse tree
	 */
	void exitInDotRopSet(@NotNull EropPatientAIParser.InDotRopSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InRopSet}
	 * labeled alternative in {@link EropPatientAIParser#ropConstraint}.
	 * @param ctx the parse tree
	 */
	void enterInRopSet(@NotNull EropPatientAIParser.InRopSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InRopSet}
	 * labeled alternative in {@link EropPatientAIParser#ropConstraint}.
	 * @param ctx the parse tree
	 */
	void exitInRopSet(@NotNull EropPatientAIParser.InRopSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#passaction}.
	 * @param ctx the parse tree
	 */
	void enterPassaction(@NotNull EropPatientAIParser.PassactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#passaction}.
	 * @param ctx the parse tree
	 */
	void exitPassaction(@NotNull EropPatientAIParser.PassactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HourEqualsNotEqBeforeAfter}
	 * labeled alternative in {@link EropPatientAIParser#timePartialComparison}.
	 * @param ctx the parse tree
	 */
	void enterHourEqualsNotEqBeforeAfter(@NotNull EropPatientAIParser.HourEqualsNotEqBeforeAfterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HourEqualsNotEqBeforeAfter}
	 * labeled alternative in {@link EropPatientAIParser#timePartialComparison}.
	 * @param ctx the parse tree
	 */
	void exitHourEqualsNotEqBeforeAfter(@NotNull EropPatientAIParser.HourEqualsNotEqBeforeAfterContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#compobligDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCompobligDeclaration(@NotNull EropPatientAIParser.CompobligDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#compobligDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCompobligDeclaration(@NotNull EropPatientAIParser.CompobligDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OriginatorResponderSimpleCondition}
	 * labeled alternative in {@link EropPatientAIParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void enterOriginatorResponderSimpleCondition(@NotNull EropPatientAIParser.OriginatorResponderSimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OriginatorResponderSimpleCondition}
	 * labeled alternative in {@link EropPatientAIParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void exitOriginatorResponderSimpleCondition(@NotNull EropPatientAIParser.OriginatorResponderSimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeConstraintAttr}
	 * labeled alternative in {@link EropPatientAIParser#attributeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTimeConstraintAttr(@NotNull EropPatientAIParser.TimeConstraintAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeConstraintAttr}
	 * labeled alternative in {@link EropPatientAIParser#attributeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTimeConstraintAttr(@NotNull EropPatientAIParser.TimeConstraintAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#termaction}.
	 * @param ctx the parse tree
	 */
	void enterTermaction(@NotNull EropPatientAIParser.TermactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#termaction}.
	 * @param ctx the parse tree
	 */
	void exitTermaction(@NotNull EropPatientAIParser.TermactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeDirectComparisonConstraint}
	 * labeled alternative in {@link EropPatientAIParser#timeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTimeDirectComparisonConstraint(@NotNull EropPatientAIParser.TimeDirectComparisonConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeDirectComparisonConstraint}
	 * labeled alternative in {@link EropPatientAIParser#timeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTimeDirectComparisonConstraint(@NotNull EropPatientAIParser.TimeDirectComparisonConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#outcomeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterOutcomeConstraint(@NotNull EropPatientAIParser.OutcomeConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#outcomeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitOutcomeConstraint(@NotNull EropPatientAIParser.OutcomeConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProhibitionsRopSet}
	 * labeled alternative in {@link EropPatientAIParser#ropset}.
	 * @param ctx the parse tree
	 */
	void enterProhibitionsRopSet(@NotNull EropPatientAIParser.ProhibitionsRopSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProhibitionsRopSet}
	 * labeled alternative in {@link EropPatientAIParser#ropset}.
	 * @param ctx the parse tree
	 */
	void exitProhibitionsRopSet(@NotNull EropPatientAIParser.ProhibitionsRopSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeConstraintItem}
	 * labeled alternative in {@link EropPatientAIParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterAttributeConstraintItem(@NotNull EropPatientAIParser.AttributeConstraintItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeConstraintItem}
	 * labeled alternative in {@link EropPatientAIParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitAttributeConstraintItem(@NotNull EropPatientAIParser.AttributeConstraintItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RopConstraintItem}
	 * labeled alternative in {@link EropPatientAIParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterRopConstraintItem(@NotNull EropPatientAIParser.RopConstraintItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RopConstraintItem}
	 * labeled alternative in {@link EropPatientAIParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitRopConstraintItem(@NotNull EropPatientAIParser.RopConstraintItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#relativeTime}.
	 * @param ctx the parse tree
	 */
	void enterRelativeTime(@NotNull EropPatientAIParser.RelativeTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#relativeTime}.
	 * @param ctx the parse tree
	 */
	void exitRelativeTime(@NotNull EropPatientAIParser.RelativeTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(@NotNull EropPatientAIParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(@NotNull EropPatientAIParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#constraintList}.
	 * @param ctx the parse tree
	 */
	void enterConstraintList(@NotNull EropPatientAIParser.ConstraintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#constraintList}.
	 * @param ctx the parse tree
	 */
	void exitConstraintList(@NotNull EropPatientAIParser.ConstraintListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpr(@NotNull EropPatientAIParser.ConditionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpr(@NotNull EropPatientAIParser.ConditionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GovernanceOperationType}
	 * labeled alternative in {@link EropPatientAIParser#eventCondition}.
	 * @param ctx the parse tree
	 */
	void enterGovernanceOperationType(@NotNull EropPatientAIParser.GovernanceOperationTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GovernanceOperationType}
	 * labeled alternative in {@link EropPatientAIParser#eventCondition}.
	 * @param ctx the parse tree
	 */
	void exitGovernanceOperationType(@NotNull EropPatientAIParser.GovernanceOperationTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Responder}
	 * labeled alternative in {@link EropPatientAIParser#eventCondition}.
	 * @param ctx the parse tree
	 */
	void enterResponder(@NotNull EropPatientAIParser.ResponderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Responder}
	 * labeled alternative in {@link EropPatientAIParser#eventCondition}.
	 * @param ctx the parse tree
	 */
	void exitResponder(@NotNull EropPatientAIParser.ResponderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutcomeConstraintAttr}
	 * labeled alternative in {@link EropPatientAIParser#attributeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterOutcomeConstraintAttr(@NotNull EropPatientAIParser.OutcomeConstraintAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutcomeConstraintAttr}
	 * labeled alternative in {@link EropPatientAIParser#attributeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitOutcomeConstraintAttr(@NotNull EropPatientAIParser.OutcomeConstraintAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddActionLabel}
	 * labeled alternative in {@link EropPatientAIParser#rhsaction}.
	 * @param ctx the parse tree
	 */
	void enterAddActionLabel(@NotNull EropPatientAIParser.AddActionLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddActionLabel}
	 * labeled alternative in {@link EropPatientAIParser#rhsaction}.
	 * @param ctx the parse tree
	 */
	void exitAddActionLabel(@NotNull EropPatientAIParser.AddActionLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#absoluteTime}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteTime(@NotNull EropPatientAIParser.AbsoluteTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#absoluteTime}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteTime(@NotNull EropPatientAIParser.AbsoluteTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#timeConstraintContent}.
	 * @param ctx the parse tree
	 */
	void enterTimeConstraintContent(@NotNull EropPatientAIParser.TimeConstraintContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#timeConstraintContent}.
	 * @param ctx the parse tree
	 */
	void exitTimeConstraintContent(@NotNull EropPatientAIParser.TimeConstraintContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RolePlayerRefId}
	 * labeled alternative in {@link EropPatientAIParser#rolePlayerRef}.
	 * @param ctx the parse tree
	 */
	void enterRolePlayerRefId(@NotNull EropPatientAIParser.RolePlayerRefIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RolePlayerRefId}
	 * labeled alternative in {@link EropPatientAIParser#rolePlayerRef}.
	 * @param ctx the parse tree
	 */
	void exitRolePlayerRefId(@NotNull EropPatientAIParser.RolePlayerRefIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void enterRuleSet(@NotNull EropPatientAIParser.RuleSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void exitRuleSet(@NotNull EropPatientAIParser.RuleSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatusGuardBlockRhs}
	 * labeled alternative in {@link EropPatientAIParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterStatusGuardBlockRhs(@NotNull EropPatientAIParser.StatusGuardBlockRhsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatusGuardBlockRhs}
	 * labeled alternative in {@link EropPatientAIParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitStatusGuardBlockRhs(@NotNull EropPatientAIParser.StatusGuardBlockRhsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RolePlayerAsterisk}
	 * labeled alternative in {@link EropPatientAIParser#rolePlayerRef}.
	 * @param ctx the parse tree
	 */
	void enterRolePlayerAsterisk(@NotNull EropPatientAIParser.RolePlayerAsteriskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RolePlayerAsterisk}
	 * labeled alternative in {@link EropPatientAIParser#rolePlayerRef}.
	 * @param ctx the parse tree
	 */
	void exitRolePlayerAsterisk(@NotNull EropPatientAIParser.RolePlayerAsteriskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeConstraintAsterisk}
	 * labeled alternative in {@link EropPatientAIParser#timeConstraintString}.
	 * @param ctx the parse tree
	 */
	void enterTimeConstraintAsterisk(@NotNull EropPatientAIParser.TimeConstraintAsteriskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeConstraintAsterisk}
	 * labeled alternative in {@link EropPatientAIParser#timeConstraintString}.
	 * @param ctx the parse tree
	 */
	void exitTimeConstraintAsterisk(@NotNull EropPatientAIParser.TimeConstraintAsteriskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompositeObligation}
	 * labeled alternative in {@link EropPatientAIParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterCompositeObligation(@NotNull EropPatientAIParser.CompositeObligationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompositeObligation}
	 * labeled alternative in {@link EropPatientAIParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitCompositeObligation(@NotNull EropPatientAIParser.CompositeObligationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelativeTimeSpec}
	 * labeled alternative in {@link EropPatientAIParser#timeSpec}.
	 * @param ctx the parse tree
	 */
	void enterRelativeTimeSpec(@NotNull EropPatientAIParser.RelativeTimeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelativeTimeSpec}
	 * labeled alternative in {@link EropPatientAIParser#timeSpec}.
	 * @param ctx the parse tree
	 */
	void exitRelativeTimeSpec(@NotNull EropPatientAIParser.RelativeTimeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermactionLabel}
	 * labeled alternative in {@link EropPatientAIParser#rhsaction}.
	 * @param ctx the parse tree
	 */
	void enterTermactionLabel(@NotNull EropPatientAIParser.TermactionLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermactionLabel}
	 * labeled alternative in {@link EropPatientAIParser#rhsaction}.
	 * @param ctx the parse tree
	 */
	void exitTermactionLabel(@NotNull EropPatientAIParser.TermactionLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RightsRopSet}
	 * labeled alternative in {@link EropPatientAIParser#ropset}.
	 * @param ctx the parse tree
	 */
	void enterRightsRopSet(@NotNull EropPatientAIParser.RightsRopSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RightsRopSet}
	 * labeled alternative in {@link EropPatientAIParser#ropset}.
	 * @param ctx the parse tree
	 */
	void exitRightsRopSet(@NotNull EropPatientAIParser.RightsRopSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanConstraintAttr}
	 * labeled alternative in {@link EropPatientAIParser#attributeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConstraintAttr(@NotNull EropPatientAIParser.BooleanConstraintAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanConstraintAttr}
	 * labeled alternative in {@link EropPatientAIParser#attributeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConstraintAttr(@NotNull EropPatientAIParser.BooleanConstraintAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#businessOpDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBusinessOpDeclaration(@NotNull EropPatientAIParser.BusinessOpDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#businessOpDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBusinessOpDeclaration(@NotNull EropPatientAIParser.BusinessOpDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constraints}
	 * labeled alternative in {@link EropPatientAIParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraints(@NotNull EropPatientAIParser.ConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constraints}
	 * labeled alternative in {@link EropPatientAIParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraints(@NotNull EropPatientAIParser.ConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#historicalQuery}.
	 * @param ctx the parse tree
	 */
	void enterHistoricalQuery(@NotNull EropPatientAIParser.HistoricalQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#historicalQuery}.
	 * @param ctx the parse tree
	 */
	void exitHistoricalQuery(@NotNull EropPatientAIParser.HistoricalQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HistoricalQuerySimpleCondition}
	 * labeled alternative in {@link EropPatientAIParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void enterHistoricalQuerySimpleCondition(@NotNull EropPatientAIParser.HistoricalQuerySimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HistoricalQuerySimpleCondition}
	 * labeled alternative in {@link EropPatientAIParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void exitHistoricalQuerySimpleCondition(@NotNull EropPatientAIParser.HistoricalQuerySimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(@NotNull EropPatientAIParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(@NotNull EropPatientAIParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotConditionTerm}
	 * labeled alternative in {@link EropPatientAIParser#conditionTerm}.
	 * @param ctx the parse tree
	 */
	void enterNotConditionTerm(@NotNull EropPatientAIParser.NotConditionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotConditionTerm}
	 * labeled alternative in {@link EropPatientAIParser#conditionTerm}.
	 * @param ctx the parse tree
	 */
	void exitNotConditionTerm(@NotNull EropPatientAIParser.NotConditionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitFail}
	 * labeled alternative in {@link EropPatientAIParser#statusGuard}.
	 * @param ctx the parse tree
	 */
	void enterInitFail(@NotNull EropPatientAIParser.InitFailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitFail}
	 * labeled alternative in {@link EropPatientAIParser#statusGuard}.
	 * @param ctx the parse tree
	 */
	void exitInitFail(@NotNull EropPatientAIParser.InitFailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RolePlayer}
	 * labeled alternative in {@link EropPatientAIParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterRolePlayer(@NotNull EropPatientAIParser.RolePlayerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RolePlayer}
	 * labeled alternative in {@link EropPatientAIParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitRolePlayer(@NotNull EropPatientAIParser.RolePlayerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleConditionTerm}
	 * labeled alternative in {@link EropPatientAIParser#conditionTerm}.
	 * @param ctx the parse tree
	 */
	void enterSimpleConditionTerm(@NotNull EropPatientAIParser.SimpleConditionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleConditionTerm}
	 * labeled alternative in {@link EropPatientAIParser#conditionTerm}.
	 * @param ctx the parse tree
	 */
	void exitSimpleConditionTerm(@NotNull EropPatientAIParser.SimpleConditionTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#singlerule}.
	 * @param ctx the parse tree
	 */
	void enterSinglerule(@NotNull EropPatientAIParser.SingleruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#singlerule}.
	 * @param ctx the parse tree
	 */
	void exitSinglerule(@NotNull EropPatientAIParser.SingleruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#historicalParams}.
	 * @param ctx the parse tree
	 */
	void enterHistoricalParams(@NotNull EropPatientAIParser.HistoricalParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#historicalParams}.
	 * @param ctx the parse tree
	 */
	void exitHistoricalParams(@NotNull EropPatientAIParser.HistoricalParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitFailOutcome}
	 * labeled alternative in {@link EropPatientAIParser#outcome}.
	 * @param ctx the parse tree
	 */
	void enterInitFailOutcome(@NotNull EropPatientAIParser.InitFailOutcomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitFailOutcome}
	 * labeled alternative in {@link EropPatientAIParser#outcome}.
	 * @param ctx the parse tree
	 */
	void exitInitFailOutcome(@NotNull EropPatientAIParser.InitFailOutcomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GovernanceOperation}
	 * labeled alternative in {@link EropPatientAIParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterGovernanceOperation(@NotNull EropPatientAIParser.GovernanceOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GovernanceOperation}
	 * labeled alternative in {@link EropPatientAIParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitGovernanceOperation(@NotNull EropPatientAIParser.GovernanceOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BizFail}
	 * labeled alternative in {@link EropPatientAIParser#statusGuard}.
	 * @param ctx the parse tree
	 */
	void enterBizFail(@NotNull EropPatientAIParser.BizFailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BizFail}
	 * labeled alternative in {@link EropPatientAIParser#statusGuard}.
	 * @param ctx the parse tree
	 */
	void exitBizFail(@NotNull EropPatientAIParser.BizFailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RolePlayerConstraintAttr}
	 * labeled alternative in {@link EropPatientAIParser#attributeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterRolePlayerConstraintAttr(@NotNull EropPatientAIParser.RolePlayerConstraintAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RolePlayerConstraintAttr}
	 * labeled alternative in {@link EropPatientAIParser#attributeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitRolePlayerConstraintAttr(@NotNull EropPatientAIParser.RolePlayerConstraintAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#contractDocument}.
	 * @param ctx the parse tree
	 */
	void enterContractDocument(@NotNull EropPatientAIParser.ContractDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#contractDocument}.
	 * @param ctx the parse tree
	 */
	void exitContractDocument(@NotNull EropPatientAIParser.ContractDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#remaction}.
	 * @param ctx the parse tree
	 */
	void enterRemaction(@NotNull EropPatientAIParser.RemactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#remaction}.
	 * @param ctx the parse tree
	 */
	void exitRemaction(@NotNull EropPatientAIParser.RemactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TecFailOutcome}
	 * labeled alternative in {@link EropPatientAIParser#outcome}.
	 * @param ctx the parse tree
	 */
	void enterTecFailOutcome(@NotNull EropPatientAIParser.TecFailOutcomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TecFailOutcome}
	 * labeled alternative in {@link EropPatientAIParser#outcome}.
	 * @param ctx the parse tree
	 */
	void exitTecFailOutcome(@NotNull EropPatientAIParser.TecFailOutcomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#timeUnit}.
	 * @param ctx the parse tree
	 */
	void enterTimeUnit(@NotNull EropPatientAIParser.TimeUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#timeUnit}.
	 * @param ctx the parse tree
	 */
	void exitTimeUnit(@NotNull EropPatientAIParser.TimeUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualsNotEqWeekDay}
	 * labeled alternative in {@link EropPatientAIParser#timePartialComparison}.
	 * @param ctx the parse tree
	 */
	void enterEqualsNotEqWeekDay(@NotNull EropPatientAIParser.EqualsNotEqWeekDayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualsNotEqWeekDay}
	 * labeled alternative in {@link EropPatientAIParser#timePartialComparison}.
	 * @param ctx the parse tree
	 */
	void exitEqualsNotEqWeekDay(@NotNull EropPatientAIParser.EqualsNotEqWeekDayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbsoluteTimeSpec}
	 * labeled alternative in {@link EropPatientAIParser#timeSpec}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteTimeSpec(@NotNull EropPatientAIParser.AbsoluteTimeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbsoluteTimeSpec}
	 * labeled alternative in {@link EropPatientAIParser#timeSpec}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteTimeSpec(@NotNull EropPatientAIParser.AbsoluteTimeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HappenedExpression}
	 * labeled alternative in {@link EropPatientAIParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterHappenedExpression(@NotNull EropPatientAIParser.HappenedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HappenedExpression}
	 * labeled alternative in {@link EropPatientAIParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitHappenedExpression(@NotNull EropPatientAIParser.HappenedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#timeDirectComparison}.
	 * @param ctx the parse tree
	 */
	void enterTimeDirectComparison(@NotNull EropPatientAIParser.TimeDirectComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#timeDirectComparison}.
	 * @param ctx the parse tree
	 */
	void exitTimeDirectComparison(@NotNull EropPatientAIParser.TimeDirectComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoTypeEqualNotEq}
	 * labeled alternative in {@link EropPatientAIParser#booleanConstraint}.
	 * @param ctx the parse tree
	 */
	void enterBoTypeEqualNotEq(@NotNull EropPatientAIParser.BoTypeEqualNotEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoTypeEqualNotEq}
	 * labeled alternative in {@link EropPatientAIParser#booleanConstraint}.
	 * @param ctx the parse tree
	 */
	void exitBoTypeEqualNotEq(@NotNull EropPatientAIParser.BoTypeEqualNotEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObligsRopSet}
	 * labeled alternative in {@link EropPatientAIParser#ropset}.
	 * @param ctx the parse tree
	 */
	void enterObligsRopSet(@NotNull EropPatientAIParser.ObligsRopSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObligsRopSet}
	 * labeled alternative in {@link EropPatientAIParser#ropset}.
	 * @param ctx the parse tree
	 */
	void exitObligsRopSet(@NotNull EropPatientAIParser.ObligsRopSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OriginatorResponderEqNotEq}
	 * labeled alternative in {@link EropPatientAIParser#booleanConstraint}.
	 * @param ctx the parse tree
	 */
	void enterOriginatorResponderEqNotEq(@NotNull EropPatientAIParser.OriginatorResponderEqNotEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OriginatorResponderEqNotEq}
	 * labeled alternative in {@link EropPatientAIParser#booleanConstraint}.
	 * @param ctx the parse tree
	 */
	void exitOriginatorResponderEqNotEq(@NotNull EropPatientAIParser.OriginatorResponderEqNotEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimePartialComparisonConstraint}
	 * labeled alternative in {@link EropPatientAIParser#timeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTimePartialComparisonConstraint(@NotNull EropPatientAIParser.TimePartialComparisonConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimePartialComparisonConstraint}
	 * labeled alternative in {@link EropPatientAIParser#timeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTimePartialComparisonConstraint(@NotNull EropPatientAIParser.TimePartialComparisonConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateEqNotEqBeforeAfter}
	 * labeled alternative in {@link EropPatientAIParser#timePartialComparison}.
	 * @param ctx the parse tree
	 */
	void enterDateEqNotEqBeforeAfter(@NotNull EropPatientAIParser.DateEqNotEqBeforeAfterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateEqNotEqBeforeAfter}
	 * labeled alternative in {@link EropPatientAIParser#timePartialComparison}.
	 * @param ctx the parse tree
	 */
	void exitDateEqNotEqBeforeAfter(@NotNull EropPatientAIParser.DateEqNotEqBeforeAfterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HistoricalQueryItem}
	 * labeled alternative in {@link EropPatientAIParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterHistoricalQueryItem(@NotNull EropPatientAIParser.HistoricalQueryItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HistoricalQueryItem}
	 * labeled alternative in {@link EropPatientAIParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitHistoricalQueryItem(@NotNull EropPatientAIParser.HistoricalQueryItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#businessOpReference}.
	 * @param ctx the parse tree
	 */
	void enterBusinessOpReference(@NotNull EropPatientAIParser.BusinessOpReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#businessOpReference}.
	 * @param ctx the parse tree
	 */
	void exitBusinessOpReference(@NotNull EropPatientAIParser.BusinessOpReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutcomeCondition}
	 * labeled alternative in {@link EropPatientAIParser#eventCondition}.
	 * @param ctx the parse tree
	 */
	void enterOutcomeCondition(@NotNull EropPatientAIParser.OutcomeConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutcomeCondition}
	 * labeled alternative in {@link EropPatientAIParser#eventCondition}.
	 * @param ctx the parse tree
	 */
	void exitOutcomeCondition(@NotNull EropPatientAIParser.OutcomeConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EropPatientAIParser#roleplayerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRoleplayerDeclaration(@NotNull EropPatientAIParser.RoleplayerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EropPatientAIParser#roleplayerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRoleplayerDeclaration(@NotNull EropPatientAIParser.RoleplayerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotConstraint}
	 * labeled alternative in {@link EropPatientAIParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterNotConstraint(@NotNull EropPatientAIParser.NotConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotConstraint}
	 * labeled alternative in {@link EropPatientAIParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitNotConstraint(@NotNull EropPatientAIParser.NotConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuccessOutcome}
	 * labeled alternative in {@link EropPatientAIParser#outcome}.
	 * @param ctx the parse tree
	 */
	void enterSuccessOutcome(@NotNull EropPatientAIParser.SuccessOutcomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuccessOutcome}
	 * labeled alternative in {@link EropPatientAIParser#outcome}.
	 * @param ctx the parse tree
	 */
	void exitSuccessOutcome(@NotNull EropPatientAIParser.SuccessOutcomeContext ctx);
}