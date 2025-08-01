package com.translator.antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
/*import org.omg.CORBA.CTX_RESTRICT_SCOPE;*/

//import com.translator.gui.GuiFrame;
import com.translator.utils.VariableFlagger;
import com.translator.utils.VariablesMemory;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class EropExtractorListener extends EropcpBaseListener {
    EropPatientAIParser parser;
    TranslationWriter writer;
    VariableFlagger flagger;
    VariablesMemory memory;

    public EropExtractorListener(EropPatientAIParser parser, VariableFlagger flagger, VariablesMemory memory) {
        this.parser = parser;
        //this.writer = writer;
        this.flagger = flagger;
        this.memory = memory;
    }

    @Override
    public void enterOutcomeConstraintAttr(EropPatientAIParser.OutcomeConstraintAttrContext ctx) {
        System.out.println("Enter outcome constraint attr");
        System.out.println(ctx.getText());
    }

    @Override
    public void enterRolePlayerRefId(EropPatientAIParser.RolePlayerRefIdContext ctx) {
        System.out.println("Enter role player ref id");
        System.out.println(ctx.getText());
        memory.addRolePlayer(ctx.getText());
    }

    @Override
    public void enterRuleSet(EropPatientAIParser.RuleSetContext ctx) {
        System.out.println("Enter rule set");
//        System.out.println(ctx.getText());
//        flagger.addVariables(memory,  ctx.getText());
//        flagger.activateRuleName();
//        flagger.addToRuleVars(memory, ctx.getText());

    }

    @Override
    public void enterRulename(EropPatientAIParser.RulenameContext ctx) {
        System.out.println("Enter rule name");
        System.out.println(ctx.getText());
        flagger.activateRuleName();
        flagger.addToRuleVars(memory, ctx.getText());
    }


	
/*	@Override 
	public void enterRoleplayerDeclaration(@NotNull EropPatientAIParser.RoleplayerDeclarationContext ctx) { 
		writer.writeToTranslationFile("global RolePlayer");
	}*/
	
/*	@Override 
	public void exitRoleplayerDeclaration(@NotNull EropPatientAIParser.RoleplayerDeclarationContext ctx) { 
		
		writer.writeToTranslationFile(" ");

	}*/

    /*	*/
/*
	@Override
	public void enterAlphanum(@NotNull EropPatientAIParser.AlphanumContext ctx){
		
		writer.writeToTranslationFile(ctx.getText());
	
		
	}*/
//    Override
//    public void enterRulename(@NotNull EropPatientAIParser.RulenameContext ctx) {
//        flagger.activateRuleName();
//    }

    @Override
    public void exitRulename(@NotNull EropPatientAIParser.RulenameContext ctx) {
        flagger.deactivateRuleName();
    }

    @Override
    public void enterEventmatch(@NotNull EropPatientAIParser.EventmatchContext ctx) {
        System.out.println("Enter event match" + ctx.getText());
        flagger.activateEventMatch();
    }

    @Override
    public void exitEventmatch(@NotNull EropPatientAIParser.EventmatchContext ctx) {
        flagger.deactivateEventMatch();
    }


//    @Override
//    public void enterEventMcond(@NotNull EropPatientAIParser.EventMcondContext ctx) {
//        flagger.activateEventCondition();
//    }
//
//    @Override
//    public void exitEventMcond(@NotNull EropPatientAIParser.EventMcondContext ctx) {
//        flagger.deactivateEventCondition();
//    }

    @Override
    public void enterRoleplayerConstraint(@NotNull EropPatientAIParser.RoleplayerConstraintContext ctx) {
        System.out.println("Enter roleplayer constraint" + ctx.getText());
        flagger.activateRolePlayerConstraint();
    }


    @Override
    public void exitRoleplayerConstraint(@NotNull EropPatientAIParser.RoleplayerConstraintContext ctx) {
        flagger.deactivateRolePlayerConstraint();
    }

//    @Override
//    public void exitRolePlayerConstraintIssuer(@NotNull EropPatientAIParser.RolePlayerConstraintIssuerContext ctx) {
//
//    }


    @Override
    public void enterLhs(@NotNull EropPatientAIParser.LhsContext ctx) {
        System.out.println("Enter lhs " + ctx.getText());

        flagger.activateLhs();
    }

    @Override
    public void exitLhs(@NotNull EropPatientAIParser.LhsContext ctx) {
        flagger.deactivateLhs();
    }

    public void enterRhs(@NotNull EropPatientAIParser.RhsContext ctx) {
        flagger.activateRhs();
    }

    public void exitRhs(@NotNull EropPatientAIParser.RhsContext ctx) {
        flagger.deactivateRhs();
    }


//    public void enterAlphanum(@NotNull EropPatientAIParser.AlphanumContext ctx) {
//        flagger.addVariables(memory, ctx.getText());
//    }
//
//
//    public void enterUpalphanum(@NotNull EropPatientAIParser.UpalphanumContext ctx) {
//        flagger.addVariables(memory, ctx.getText());
//    }

    @Override
    public void enterRoleplayerDeclaration(@NotNull EropPatientAIParser.RoleplayerDeclarationContext ctx) {
        flagger.activateRolePlayer();
    }

    @Override
    public void exitRoleplayerDeclaration(@NotNull EropPatientAIParser.RoleplayerDeclarationContext ctx) {
        flagger.deactivateRolePlayer();
    }


    @Override
    public void enterBusinessOpDeclaration(@NotNull EropPatientAIParser.BusinessOpDeclarationContext ctx) {
        flagger.activateBusinessOp();
    }

    @Override
    public void exitBusinessOpDeclaration(@NotNull EropPatientAIParser.BusinessOpDeclarationContext ctx) {
        flagger.deactivateBusinessOp();
    }

    @Override
    public void enterOutcomeConstraint(@NotNull EropPatientAIParser.OutcomeConstraintContext ctx) {
        flagger.activateOutcomeConstraint();
    }

    @Override
    public void exitOutcomeConstraint(@NotNull EropPatientAIParser.OutcomeConstraintContext ctx) {
        flagger.deactivateOutcomeConstraint();
    }

    public void enterTimePartialComparison(@NotNull EropPatientAIParser.TimePartialComparisonContext ctx) {
        flagger.activateTimePartial();
    }

    public void exitTimePartialComparison(@NotNull EropPatientAIParser.TimePartialComparisonContext ctx) {
        flagger.deactivateTimePartial();
    }

    @Override
    public void enterTimeDirectComparison(@NotNull EropPatientAIParser.TimeDirectComparisonContext ctx) {
        flagger.activateTimeDirect();
    }

    @Override
    public void exitTimeDirectComparison(@NotNull EropPatientAIParser.TimeDirectComparisonContext ctx) {
        flagger.deactivateTimeDirect();
    }

    @Override
    public void enterHistoricalQuery(@NotNull EropPatientAIParser.HistoricalQueryContext ctx) {
        flagger.activateHistoricalQuery();
    }

    @Override
    public void exitHistoricalQuery(@NotNull EropPatientAIParser.HistoricalQueryContext ctx) {
        flagger.deactivateHistoricalQuery();
    }

    public void enterRopConstraint(@NotNull EropPatientAIParser.RopConstraintContext ctx) {
        flagger.activateRopConstraint();
    }

    public void exitRopConstraint(@NotNull EropPatientAIParser.RopConstraintContext ctx) {
        flagger.deactivateRopConstraint();
    }

//    public void enterCondition(@NotNull EropPatientAIParser.ConditionContext ctx) {
//        flagger.activateCondition();
//    }
//
//    public void exitCondition(@NotNull EropPatientAIParser.ConditionContext ctx) {
//        flagger.deactivateCondition();
//    }

    @Override
    public void enterCompobligDeclaration(@NotNull EropPatientAIParser.CompobligDeclarationContext ctx) {
        flagger.activateCompositeOblig();
    }

    @Override
    public void exitCompobligDeclaration(@NotNull EropPatientAIParser.CompobligDeclarationContext ctx) {
        flagger.deactivateCompositeOblig();
    }


    // Signals to

//    @Override
//    public void enterBool(@NotNull EropPatientAIParser.BoolContext ctx) {
//        flagger.addOutcomeBoolVal(memory, ctx.getText());
//    }
//
//    @Override
//    public void enterField(@NotNull EropPatientAIParser.FieldContext ctx) {
//        flagger.addRuleField(memory, ctx.getText());
//    }
//
//
//    @Override
//    public void enterOper(@NotNull EropPatientAIParser.OperContext ctx) {
//        flagger.addRuleOperation(memory, ctx.getText());
//    }
//
//    @Override
//    public void enterRolePlayerConstraintIssuer(@NotNull EropPatientAIParser.RolePlayerConstraintIssuerContext ctx) {
//        flagger.addRolePlayerConstraintIssuer(memory, ctx.getText());
//    }

    public void enterOutcome(@NotNull EropPatientAIParser.OutcomeContext ctx) {
        flagger.addOutcomeConstraintOutcome(memory, ctx.getText());
    }

// TODO: fix issues with date and time operators
//    @Override
//    public void enterTimeOperators(@NotNull EropPatientAIParser.TimeOperatorsContext ctx) {
//        flagger.addTimeDirectOperator(memory, ctx.getText());
//    }

    @Override
    public void enterAbsoluteTime(@NotNull EropPatientAIParser.AbsoluteTimeContext ctx) {
        flagger.addTimeDirectAbsoluteTime(memory, ctx.getText());
    }

//    @Override
//    public void enterDayKey(@NotNull EropPatientAIParser.DayKeyContext ctx) {
//        flagger.addTimePartialKey(memory, ctx.getText());
//    }

//    @Override
//    public void enterDateKey(@NotNull EropPatientAIParser.DateKeyContext ctx) {
//        flagger.addTimePartialKey(memory, ctx.getText());
//    }

//    @Override
//    public void enterMonthKey(@NotNull EropPatientAIParser.MonthKeyContext ctx) {
//        flagger.addTimePartialKey(memory, ctx.getText());
//    }

//    @Override
//    public void enterYearKey(@NotNull EropPatientAIParser.YearKeyContext ctx) {
//        flagger.addTimePartialKey(memory, ctx.getText());
//    }


//    @Override
//    public void enterDayRange(@NotNull EropPatientAIParser.DayRangeContext ctx) {
//        flagger.addTimePartialValue(memory, ctx.getText());
//    }

//    @Override
//    public void enterDateIdent(@NotNull EropPatientAIParser.DateIdentContext ctx) {
//        flagger.addTimePartialValue(memory, ctx.getText());
//    }

//    @Override
//    public void enterDateRange(@NotNull EropPatientAIParser.DateRangeContext ctx) {
//        flagger.addTimePartialValue(memory, ctx.getText());
//    }

//    @Override
//    public void enterMonthIdent(@NotNull EropPatientAIParser.MonthIdentContext ctx) {
//        flagger.addTimePartialValue(memory, ctx.getText());
//    }

//    @Override
//    public void enterMonthRange(@NotNull EropPatientAIParser.MonthRangeContext ctx) {
//        flagger.addTimePartialValue(memory, ctx.getText());
//    }

//    @Override
//    public void enterYearIdent(@NotNull EropPatientAIParser.YearIdentContext ctx) {
//        flagger.addTimePartialValue(memory, ctx.getText());
//    }

//    @Override
//    public void enterYearRange(@NotNull EropPatientAIParser.YearRangeContext ctx) {
//        flagger.addTimePartialValue(memory, ctx.getText());
//    }

//    @Override
//    public void enterRangeOperators(@NotNull EropPatientAIParser.RangeOperatorsContext ctx) {
//        flagger.addRangeOperation(memory, ctx.getText());
//    }


//    @Override
//    public void enterHistoricalQueryOp(@NotNull EropPatientAIParser.HistoricalQueryOpContext ctx) {
//        flagger.addHistoricalQueryOperation(memory, ctx.getText());
//    }


//    public void enterGenericString(@NotNull EropPatientAIParser.GenericStringContext ctx) {
//        flagger.addHistoricalQueryTimeC(memory, ctx.getText());
//    }

    @Override
    public void enterIfstatement(@NotNull EropPatientAIParser.IfstatementContext ctx) {
        System.out.println("Ifstatement " + ctx.getText());
        flagger.activateIfThen();
        flagger.addIfStatement(memory);
    }


    //Change it so that both lhs and rhs create their constraint when they enter this method
    public void enterConstraint(@NotNull EropPatientAIParser.ConstraintContext ctx) {
        flagger.addConstraintRhs(memory);
    }


//    @Override
//    public void enterAndOR(@NotNull EropPatientAIParser.AndORContext ctx) {
//        flagger.addIfsOperator(memory, ctx.getText());
//    }


//    @Override
//    public void enterRhsActionNoIfs(@NotNull EropPatientAIParser.RhsActionNoIfsContext ctx) {
//        flagger.activateRhsActionNoIfs();
//        flagger.addIfsRhsAction(memory, ctx.getText());
//    }

//    @Override
//    public void exitRhsActionNoIfs(@NotNull EropPatientAIParser.RhsActionNoIfsContext ctx) {
//        flagger.deactivateRhsActionNoIfs();
//    }


    @Override
    public void enterPassaction(@NotNull EropPatientAIParser.PassactionContext ctx) {
        flagger.addPassAction(memory, ctx.getText());
    }

//    @Override
//    public void enterAddRemAction(@NotNull EropPatientAIParser.AddRemActionContext ctx) {
//        flagger.activateAddRemAction();
//    }

//    @Override
//    public void exitAddRemAction(@NotNull EropPatientAIParser.AddRemActionContext ctx) {
//        flagger.deactivateAddRemAction();
//    }

//    @Override
//    public void enterResetaction(@NotNull EropPatientAIParser.ResetactionContext ctx) {
//        flagger.activateResetAction();
//    }

//    @Override
//    public void exitResetaction(@NotNull EropPatientAIParser.ResetactionContext ctx) {
//        flagger.deactivateResetAction();
//    }

//    @Override
//    public void enterIfThen(@NotNull EropPatientAIParser.IfThenContext ctx) {
//        flagger.activateIfThen();
//        flagger.createIfThen(memory);
//    }

//    @Override
//    public void exitIfThen(@NotNull EropPatientAIParser.IfThenContext ctx) {
//        flagger.deactivateIfThen();
//    }

//    @Override
//    public void enterIfElse(@NotNull EropPatientAIParser.IfElseContext ctx) {
//        flagger.activateIfElse();
//    }

//    @Override
//    public void exitIfElse(@NotNull EropPatientAIParser.IfElseContext ctx) {
//        flagger.deactivateIfElse();
//    }

    public void enterRhsaction(@NotNull EropPatientAIParser.RhsactionContext ctx) {
        flagger.activareRhsAction();
    }

    public void exitRhsaction(@NotNull EropPatientAIParser.RhsactionContext ctx) {
        flagger.deactivateRhsAction();
    }

//    @Override
//    public void enterAddRemRopOperator(@NotNull EropPatientAIParser.AddRemRopOperatorContext ctx) {
//        flagger.addRhsRopOperator(memory, ctx.getText());
//    }


    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitOutcomeConstraintAttr(EropPatientAIParser.OutcomeConstraintAttrContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterAddActionLabel(EropPatientAIParser.AddActionLabelContext ctx) {
        System.out.println("Enter add action label " + ctx.getText());
        flagger.activateRhs();
        flagger.activateAddRemAction();
        flagger.activateIfThen();
        flagger.addIfsRhsAction(memory, ctx.getText());
        String identifier = ctx.children.get(0).getChild(0).getText();
        String ropset = ctx.children.get(0).getChild(2).getText();
        System.out.println("Identifier: " + identifier);
        System.out.println("Ropset: " + ropset);
        flagger.addVariables(memory, identifier);
        flagger.addRopSet(memory, ropset);
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitAddActionLabel(EropPatientAIParser.AddActionLabelContext ctx) {
        flagger.deactivateRhs();
        flagger.deactivateAddRemAction();
        flagger.deactivateIfThen();
    }


    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitAbsoluteTime(EropPatientAIParser.AbsoluteTimeContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterRhsactionLabel(EropPatientAIParser.RhsactionLabelContext ctx) {
        System.out.println("Enter rhsaction label " + ctx.getText());
        flagger.activateRhs();
        flagger.activareRhsAction();
//        flagger.addIfsRhsAction(memory, ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRhsactionLabel(EropPatientAIParser.RhsactionLabelContext ctx) {
        flagger.deactivateRhs();
        flagger.deactivateRhsAction();

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterTimeConstraintContent(EropPatientAIParser.TimeConstraintContentContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitTimeConstraintContent(EropPatientAIParser.TimeConstraintContentContext ctx) {

    }


    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRolePlayerRefId(EropPatientAIParser.RolePlayerRefIdContext ctx) {
        System.out.println("exitRolePlayerRefId: " + ctx.getText());
    }


    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRuleSet(EropPatientAIParser.RuleSetContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterTimeInNotInDigit(EropPatientAIParser.TimeInNotInDigitContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitTimeInNotInDigit(EropPatientAIParser.TimeInNotInDigitContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterNotInRopSet(EropPatientAIParser.NotInRopSetContext ctx) {
        System.out.println("NotInRopSet: " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitNotInRopSet(EropPatientAIParser.NotInRopSetContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterSuccess(EropPatientAIParser.SuccessContext ctx) {
        System.out.println("Success: " + ctx.getText());


    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitSuccess(EropPatientAIParser.SuccessContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterStatusGuardBlockRhs(EropPatientAIParser.StatusGuardBlockRhsContext ctx) {
        System.out.println("StatusGuardBlockRhs: " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitStatusGuardBlockRhs(EropPatientAIParser.StatusGuardBlockRhsContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterOtherwise(EropPatientAIParser.OtherwiseContext ctx) {
        System.out.println("Otherwise: " + ctx.getText());
//        flagger.activateIfElse();
//        flagger.activateOutcomeConstraint();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitOtherwise(EropPatientAIParser.OtherwiseContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterTimeConstraintText(EropPatientAIParser.TimeConstraintTextContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitTimeConstraintText(EropPatientAIParser.TimeConstraintTextContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterRolePlayerAsterisk(EropPatientAIParser.RolePlayerAsteriskContext ctx) {
        System.out.println("RolePlayerAsterisk: " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRolePlayerAsterisk(EropPatientAIParser.RolePlayerAsteriskContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterTimeConstraintAsterisk(EropPatientAIParser.TimeConstraintAsteriskContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitTimeConstraintAsterisk(EropPatientAIParser.TimeConstraintAsteriskContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterOriginator(EropPatientAIParser.OriginatorContext ctx) {
        System.out.println("Enter originator " + ctx.getText());
        parseEventMatch(ctx);

    }

    private void parseEventMatch(EropPatientAIParser.EventConditionContext ctx) {
        String text = ctx.getText();
        String operator = "==";
//        flagger.addRuleField(memory, "originator");
//        flagger.addRuleOperation(memory, "==");
        int operatorIndex = text.indexOf(operator);
        if (operatorIndex != -1) {
            String field = text.substring(0, operatorIndex).trim();
            String value = text.substring(operatorIndex + operator.length()).trim();
            flagger.activateEventCondition();
            flagger.addRuleField(memory, field);
            flagger.addRuleOperation(memory, operator);
            memory.addEventCondValue(value);
        }
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitOriginator(EropPatientAIParser.OriginatorContext ctx) {
        flagger.deactivateEventCondition();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterRemactionLabel(EropPatientAIParser.RemactionLabelContext ctx) {
        System.out.println("RemactionLabel: " + ctx.getText());
        flagger.activateAddRemAction();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRemactionLabel(EropPatientAIParser.RemactionLabelContext ctx) {
        flagger.deactivateAddRemAction();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterRhsAction(EropPatientAIParser.RhsactionContext ctx) {
        System.out.println("Enter Rhsaction " + ctx.getText());
        flagger.activareRhsAction();
        flagger.addIfsRhsAction(memory, ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRhsAction(EropPatientAIParser.RhsactionContext ctx) {
        flagger.deactivateRhsAction();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterAddaction(EropPatientAIParser.AddactionContext ctx) {
        System.out.println("Enter addaction " + ctx.getText());
        flagger.activateRopConstraint();
        flagger.activareRhsAction();
        flagger.activateIfThen();
//        flagger.addRopSet(memory, ctx.getText());
        flagger.addIfsRhsAction(memory, ctx.getText());
        flagger.addRhsRopOperator(memory, "+=");
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitAddaction(EropPatientAIParser.AddactionContext ctx) {
        flagger.deactivateRopConstraint();
        flagger.deactivateRhsAction();
        flagger.deactivateIfThen();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterCompositeObligation(EropPatientAIParser.CompositeObligationContext ctx) {
        System.out.println("CompositeObligation: " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitCompositeObligation(EropPatientAIParser.CompositeObligationContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterPassactionLabel(EropPatientAIParser.PassactionLabelContext ctx) {
        System.out.println("PassactionLabel: " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitPassactionLabel(EropPatientAIParser.PassactionLabelContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterComparisonExpressionSimpleCondition(EropPatientAIParser.ComparisonExpressionSimpleConditionContext ctx) {
        System.out.println("Enter comparison expression simple condition " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitComparisonExpressionSimpleCondition(EropPatientAIParser.ComparisonExpressionSimpleConditionContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterRelativeTimeSpec(EropPatientAIParser.RelativeTimeSpecContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRelativeTimeSpec(EropPatientAIParser.RelativeTimeSpecContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterTermactionLabel(EropPatientAIParser.TermactionLabelContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitTermactionLabel(EropPatientAIParser.TermactionLabelContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterDayInNotInWeekDay(EropPatientAIParser.DayInNotInWeekDayContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitDayInNotInWeekDay(EropPatientAIParser.DayInNotInWeekDayContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterIdentifierList(EropPatientAIParser.IdentifierListContext ctx) {
        flagger.addVariables(memory, ctx.getText());
        System.out.println("identifier list: " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitIdentifierList(EropPatientAIParser.IdentifierListContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterRightsRopSet(EropPatientAIParser.RightsRopSetContext ctx) {
        System.out.println("enter RightsRopSet: " + ctx.getText());
        flagger.activateRopConstraint();
        flagger.addRopSet(memory, ctx.getText());

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRightsRopSet(EropPatientAIParser.RightsRopSetContext ctx) {
        flagger.deactivateRopConstraint();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterBizFailOutcome(EropPatientAIParser.BizFailOutcomeContext ctx) {
//        flagger.addOutcomeConstraintOutcome(memory, ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitBizFailOutcome(EropPatientAIParser.BizFailOutcomeContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterBooleanConstraintAttr(EropPatientAIParser.BooleanConstraintAttrContext ctx) {
        System.out.println("Enter boolean constraint attribute " + ctx.getText());
//        flagger.addC
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitBooleanConstraintAttr(EropPatientAIParser.BooleanConstraintAttrContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterRhsactionList(EropPatientAIParser.RhsactionListContext ctx) {
        System.out.println("Enter Rhsaction list " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRhsactionList(EropPatientAIParser.RhsactionListContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterConstraints(EropPatientAIParser.ConstraintsContext ctx) {
        System.out.println("Enter constraints " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitConstraints(EropPatientAIParser.ConstraintsContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterHistoricalQuerySimpleCondition(EropPatientAIParser.HistoricalQuerySimpleConditionContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitHistoricalQuerySimpleCondition(EropPatientAIParser.HistoricalQuerySimpleConditionContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterLogicalOperator(EropPatientAIParser.LogicalOperatorContext ctx) {
        System.out.println("Enter logical operator " + ctx.getText());
        flagger.addIfsOperator(memory, ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitLogicalOperator(EropPatientAIParser.LogicalOperatorContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitIfstatement(EropPatientAIParser.IfstatementContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterNotConditionTerm(EropPatientAIParser.NotConditionTermContext ctx) {
        System.out.println("Enter not condition term " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitNotConditionTerm(EropPatientAIParser.NotConditionTermContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterHappened_expression(EropPatientAIParser.Happened_expressionContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitHappened_expression(EropPatientAIParser.Happened_expressionContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterConditionExpressionTerm(EropPatientAIParser.ConditionExpressionTermContext ctx) {
        System.out.println("Enter condition expression term " + ctx.getText());
        flagger.activateIfThen();
//        flagger.activateRopConstraint();
//        flagger.addVariables(memory, ctx.getText());
//        flagger.activateOutcomeConstraint();
//        flagger.addOutcomeConstraintOutcome(memory, ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitConditionExpressionTerm(EropPatientAIParser.ConditionExpressionTermContext ctx) {
        flagger.deactivateIfThen();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterInitFail(EropPatientAIParser.InitFailContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitInitFail(EropPatientAIParser.InitFailContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterRolePlayer(EropPatientAIParser.RolePlayerContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRolePlayer(EropPatientAIParser.RolePlayerContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterLogicalExpressionSimpleCondition(EropPatientAIParser.LogicalExpressionSimpleConditionContext ctx) {
        System.out.println("Enter logical expression simple condition " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitLogicalExpressionSimpleCondition(EropPatientAIParser.LogicalExpressionSimpleConditionContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterSimpleConditionTerm(EropPatientAIParser.SimpleConditionTermContext ctx) {
        System.out.println("Enter simple condition term " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitSimpleConditionTerm(EropPatientAIParser.SimpleConditionTermContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterIfstatementAction(EropPatientAIParser.IfstatementActionContext ctx) {
        System.out.println("Enter if statement action " + ctx.getText());
//        flagger.activateIfThen();
//        flagger.createIfThen(memory);

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitIfstatementAction(EropPatientAIParser.IfstatementActionContext ctx) {
        flagger.deactivateIfThen();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterStatusGuardBlock(EropPatientAIParser.StatusGuardBlockContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitStatusGuardBlock(EropPatientAIParser.StatusGuardBlockContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterSinglerule(EropPatientAIParser.SingleruleContext ctx) {
        System.out.println("singlerule: " + ctx.getText());
//        flagger.addVariables(memory, ctx.getText());
        flagger.activateRhs();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitSinglerule(EropPatientAIParser.SingleruleContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterBoTypeLogicalExpression(EropPatientAIParser.BoTypeLogicalExpressionContext ctx) {
        System.out.println("Enter bo type logical expression " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitBoTypeLogicalExpression(EropPatientAIParser.BoTypeLogicalExpressionContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterHistoricalParams(EropPatientAIParser.HistoricalParamsContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitHistoricalParams(EropPatientAIParser.HistoricalParamsContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterInitFailOutcome(EropPatientAIParser.InitFailOutcomeContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitInitFailOutcome(EropPatientAIParser.InitFailOutcomeContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterTecFail(EropPatientAIParser.TecFailContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitTecFail(EropPatientAIParser.TecFailContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterComparisonExpression(EropPatientAIParser.ComparisonExpressionContext ctx) {
        System.out.println("Enter comparison expression " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitComparisonExpression(EropPatientAIParser.ComparisonExpressionContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterRopEntity(EropPatientAIParser.RopEntityContext ctx) {
        System.out.println("Enter rop entity " + ctx.getText());
//        flagger.activateAddRemAction();
        flagger.addVariables(memory, ctx.getText());
//        memory.addRopOperator(ctx.getText());
//        flagger.addRhsRopOperator(memory, ctx.getText());
//        flagger.addToRuleVars(memory, ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRopEntity(EropPatientAIParser.RopEntityContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterGovernanceOperation(EropPatientAIParser.GovernanceOperationContext ctx) {
        System.out.println("Enter business operation " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitGovernanceOperation(EropPatientAIParser.GovernanceOperationContext ctx) {
        System.out.println("exitGovernanceOperation");
        System.out.println("ctx: " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterBizFail(EropPatientAIParser.BizFailContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitBizFail(EropPatientAIParser.BizFailContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterInRopSetSimpleCondition(EropPatientAIParser.InRopSetSimpleConditionContext ctx) {
        System.out.println("Enter in rop set simple condition " + ctx.getText());
        flagger.activateRopConstraint();
        String operation = ctx.getChild(0).getText();
        System.out.println("operation: " + operation);
        String IN = ctx.getChild(1).getText();
        String originator = ctx.getChild(2).getText();
        System.out.println("originator: " + originator);

        flagger.addVariables(memory, operation);
        memory.addRopRolePlayerRhs(originator);
        flagger.addRangeOperation(memory, IN);
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitInRopSetSimpleCondition(EropPatientAIParser.InRopSetSimpleConditionContext ctx) {
        flagger.deactivateRopConstraint();
//    flagger.deactivateRhs();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterRolePlayerConstraintAttr(EropPatientAIParser.RolePlayerConstraintAttrContext ctx) {
        System.out.println("Enter role player constraint attr " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRolePlayerConstraintAttr(EropPatientAIParser.RolePlayerConstraintAttrContext ctx) {

    }


    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterInDotRopSet(EropPatientAIParser.InDotRopSetContext ctx) {
        System.out.println("Enter in dot rop set " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitInDotRopSet(EropPatientAIParser.InDotRopSetContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterInRopSet(EropPatientAIParser.InRopSetContext ctx) {
        System.out.println("Enter in rop set " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitInRopSet(EropPatientAIParser.InRopSetContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitPassaction(EropPatientAIParser.PassactionContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterContractDocument(EropPatientAIParser.ContractDocumentContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitContractDocument(EropPatientAIParser.ContractDocumentContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterRemaction(EropPatientAIParser.RemactionContext ctx) {
        System.out.println("Enter remaction " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRemaction(EropPatientAIParser.RemactionContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterHourEqualsNotEqBeforeAfter(EropPatientAIParser.HourEqualsNotEqBeforeAfterContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitHourEqualsNotEqBeforeAfter(EropPatientAIParser.HourEqualsNotEqBeforeAfterContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterOriginatorResponderSimpleCondition(EropPatientAIParser.OriginatorResponderSimpleConditionContext ctx) {
        System.out.println("originatorResponderSimpleCondition: " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitOriginatorResponderSimpleCondition(EropPatientAIParser.OriginatorResponderSimpleConditionContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterGovernanceOperationType(EropPatientAIParser.GovernanceOperationTypeContext ctx) {
        System.out.println("governanceOperationType: " + ctx.getText());
//        flagger.addRuleField(memory, ctx.getText());
        parseEventMatch(ctx);
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitGovernanceOperationType(EropPatientAIParser.GovernanceOperationTypeContext ctx) {
        flagger.deactivateEventCondition();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterTecFailOutcome(EropPatientAIParser.TecFailOutcomeContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitTecFailOutcome(EropPatientAIParser.TecFailOutcomeContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterTimeUnit(EropPatientAIParser.TimeUnitContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitTimeUnit(EropPatientAIParser.TimeUnitContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterTimeConstraintAttr(EropPatientAIParser.TimeConstraintAttrContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitTimeConstraintAttr(EropPatientAIParser.TimeConstraintAttrContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterEqualsNotEqWeekDay(EropPatientAIParser.EqualsNotEqWeekDayContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitEqualsNotEqWeekDay(EropPatientAIParser.EqualsNotEqWeekDayContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterAbsoluteTimeSpec(EropPatientAIParser.AbsoluteTimeSpecContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitAbsoluteTimeSpec(EropPatientAIParser.AbsoluteTimeSpecContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterTermaction(EropPatientAIParser.TermactionContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitTermaction(EropPatientAIParser.TermactionContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterHappenedExpression(EropPatientAIParser.HappenedExpressionContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitHappenedExpression(EropPatientAIParser.HappenedExpressionContext ctx) {

    }


    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterBoTypeEqualNotEq(EropPatientAIParser.BoTypeEqualNotEqContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitBoTypeEqualNotEq(EropPatientAIParser.BoTypeEqualNotEqContext ctx) {
        System.out.println("BoTypeEqualNotEq: " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterTimeDirectComparisonConstraint(EropPatientAIParser.TimeDirectComparisonConstraintContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitTimeDirectComparisonConstraint(EropPatientAIParser.TimeDirectComparisonConstraintContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterObligsRopSet(EropPatientAIParser.ObligsRopSetContext ctx) {
        flagger.activateRopConstraint();
        System.out.println("enter ObligsRopSet: " + ctx.getText());
        flagger.addRopSet(memory, ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitObligsRopSet(EropPatientAIParser.ObligsRopSetContext ctx) {
        flagger.deactivateRopConstraint();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterOriginatorResponderEqNotEq(EropPatientAIParser.OriginatorResponderEqNotEqContext ctx) {
        System.out.println("originatorResponderEqNotEq: " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitOriginatorResponderEqNotEq(EropPatientAIParser.OriginatorResponderEqNotEqContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterTimePartialComparisonConstraint(EropPatientAIParser.TimePartialComparisonConstraintContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitTimePartialComparisonConstraint(EropPatientAIParser.TimePartialComparisonConstraintContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterDateEqNotEqBeforeAfter(EropPatientAIParser.DateEqNotEqBeforeAfterContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitDateEqNotEqBeforeAfter(EropPatientAIParser.DateEqNotEqBeforeAfterContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterProhibitionsRopSet(EropPatientAIParser.ProhibitionsRopSetContext ctx) {
        System.out.println("prohibitionsRopSet: " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitProhibitionsRopSet(EropPatientAIParser.ProhibitionsRopSetContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterAttributeConstraintItem(EropPatientAIParser.AttributeConstraintItemContext ctx) {
        System.out.println("attributeConstraintItem: " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitAttributeConstraintItem(EropPatientAIParser.AttributeConstraintItemContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterHistoricalQueryItem(EropPatientAIParser.HistoricalQueryItemContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitHistoricalQueryItem(EropPatientAIParser.HistoricalQueryItemContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterRopConstraintItem(EropPatientAIParser.RopConstraintItemContext ctx) {
        System.out.println("RopConstraintItem: " + ctx.getText());

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRopConstraintItem(EropPatientAIParser.RopConstraintItemContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterRelativeTime(EropPatientAIParser.RelativeTimeContext ctx) {
        System.out.println("relativeTime: " + ctx.getText());
        flagger.activateTimeDirect();
        flagger.addDateTimeInThen(memory, ctx.getText());
        // TODO  fix the tranlation of the business operations in the  
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitRelativeTime(EropPatientAIParser.RelativeTimeContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterBusinessOpReference(EropPatientAIParser.BusinessOpReferenceContext ctx) {
        System.out.println("enterBusinessOpReference");
        System.out.println("EropPatientAIParser.BusinessOpReference: " + ctx.getText());
        String bOperations = ctx.getText();
        if (bOperations.contains(",")) {
            String[] operations = bOperations.split(",");
            for (String operation : operations) {
                memory.addGovernanceOp(operation);
            }
        } else {
            memory.addGovernanceOp(bOperations);
        }


    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitBusinessOpReference(EropPatientAIParser.BusinessOpReferenceContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterConstraintList(EropPatientAIParser.ConstraintListContext ctx) {
        System.out.println("enterConstraintList: " + ctx.getText());

        flagger.activateEventCondition();
        flagger.addToRuleVars(memory, ctx.getText());

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitConstraintList(EropPatientAIParser.ConstraintListContext ctx) {
        flagger.deactivateEventCondition();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterOutcomeCondition(EropPatientAIParser.OutcomeConditionContext ctx) {
        System.out.println("enterOutcomeCondition: " + ctx.getText());
        flagger.activateCondition();
        flagger.addCondition(memory);
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitOutcomeCondition(EropPatientAIParser.OutcomeConditionContext ctx) {
        flagger.deactivateCondition();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterConditionExpr(EropPatientAIParser.ConditionExprContext ctx) {
        System.out.println("enterConditionExpr: " + ctx.getText());
        flagger.activateCondition();
        flagger.addCondition(memory);
        flagger.addIfStatement(memory);

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitConditionExpr(EropPatientAIParser.ConditionExprContext ctx) {
        flagger.deactivateCondition();
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterNotConstraint(EropPatientAIParser.NotConstraintContext ctx) {
        System.out.println("enterNotConstraint: " + ctx.getText());

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitNotConstraint(EropPatientAIParser.NotConstraintContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterSuccessOutcome(EropPatientAIParser.SuccessOutcomeContext ctx) {
        System.out.println("enterSuccessOutcome: " + ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitSuccessOutcome(EropPatientAIParser.SuccessOutcomeContext ctx) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterResponder(EropPatientAIParser.ResponderContext ctx) {
        System.out.println("enterResponder: " + ctx.getText());
        parseEventMatch(ctx);
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitResponder(EropPatientAIParser.ResponderContext ctx) {
        flagger.deactivateEventCondition();
    }

    /**
     * @param terminalNode
     */
    @Override
    public void visitTerminal(TerminalNode terminalNode) {
//        System.out.println("visitTerminal: " + terminalNode.getText());

    }

    /**
     * @param errorNode
     */
    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    /**
     * @param parserRuleContext
     */
    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    /**
     * @param parserRuleContext
     */
    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void enterActionResponderIdentifier(EropPatientAIParser.ActionResponderIdentifierContext ctx) {
            System.out.println("enterActionResponderIdentifier: " + ctx.getText());
            flagger.addVariables(memory, ctx.getText());
    }

    /**
     * @param ctx the parse tree
     */
    @Override
    public void exitActionResponderIdentifier(EropPatientAIParser.ActionResponderIdentifierContext ctx) {
        System.out.println("exitActionResponderIdentifier: " + ctx.getText());
    }

}
