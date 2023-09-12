package com.translator.antlr;

/*import java.awt.geom.FlatteningPathIterator;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;*/

import org.antlr.v4.runtime.misc.NotNull;
/*import org.omg.CORBA.CTX_RESTRICT_SCOPE;*/

//import com.translator.gui.GuiFrame;
import com.translator.utils.VariableFlagger;
import com.translator.utils.VariablesMemory;

public class EropExtractorListener extends EropcpBaseListener {

    EropcpParser parser;
    TranslationWriter writer;
    VariableFlagger flagger;
    VariablesMemory memory;

    public EropExtractorListener(EropcpParser parser, VariableFlagger flagger, VariablesMemory memory) {
        this.parser = parser;
        //this.writer = writer;
        this.flagger = flagger;
        this.memory = memory;
    }
	
	
/*	@Override 
	public void enterRoleplayerDeclaration(@NotNull EropcpParser.RoleplayerDeclarationContext ctx) { 
		
		writer.writeToTranslationFile("global RolePlayer");

	}*/
	
/*	@Override 
	public void exitRoleplayerDeclaration(@NotNull EropcpParser.RoleplayerDeclarationContext ctx) { 
		
		writer.writeToTranslationFile(" ");

	}*/

    /*	*/

    /**
     * Enter a parse tree produced by {@link EropcpParser#alphanum}.
     *
     * @param ctx the parse tree
     *//*
	@Override 
	public void enterAlphanum(@NotNull EropcpParser.AlphanumContext ctx){
		
		writer.writeToTranslationFile(ctx.getText());
	
		
	}*/
    @Override
    public void enterRulename(@NotNull EropcpParser.RulenameContext ctx) {
        flagger.activateRuleName();
    }

    @Override
    public void exitRulename(@NotNull EropcpParser.RulenameContext ctx) {
        flagger.deactivateRuleName();
    }

    @Override
    public void enterEventmatch(@NotNull EropcpParser.EventmatchContext ctx) {
        flagger.activateEventMatch();
    }

    @Override
    public void exitEventmatch(@NotNull EropcpParser.EventmatchContext ctx) {
        flagger.deactivateEventMatch();
    }


    @Override
    public void enterEventMcond(@NotNull EropcpParser.EventMcondContext ctx) {
        flagger.activateEventCondition();
    }

    @Override
    public void exitEventMcond(@NotNull EropcpParser.EventMcondContext ctx) {
        flagger.deactivateEventCondition();
    }

    @Override
    public void enterRoleplayerConstraint(@NotNull EropcpParser.RoleplayerConstraintContext ctx) {
        flagger.activateRolePlayerConstraint();
    }


    @Override
    public void exitRoleplayerConstraint(@NotNull EropcpParser.RoleplayerConstraintContext ctx) {
        flagger.deactivateRolePlayerConstraint();
    }

    @Override
    public void exitRolePlayerConstraintIssuer(@NotNull EropcpParser.RolePlayerConstraintIssuerContext ctx) {

    }


    @Override
    public void enterLhs(@NotNull EropcpParser.LhsContext ctx) {
        flagger.activateLhs();
    }

    @Override
    public void exitLhs(@NotNull EropcpParser.LhsContext ctx) {
        flagger.deactivateLhs();
    }

    @Override
    public void enterRhs(@NotNull EropcpParser.RhsContext ctx) {
        flagger.activateRhs();
    }

    @Override
    public void exitRhs(@NotNull EropcpParser.RhsContext ctx) {
        flagger.deactivateRhs();
    }


    @Override
    public void enterAlphanum(@NotNull EropcpParser.AlphanumContext ctx) {
        flagger.addVariables(memory, ctx.getText());
    }


    @Override
    public void enterUpalphanum(@NotNull EropcpParser.UpalphanumContext ctx) {
        flagger.addVariables(memory, ctx.getText());
    }


    @Override
    public void enterRoleplayerDeclaration(@NotNull EropcpParser.RoleplayerDeclarationContext ctx) {
        flagger.activateRolePlayer();
    }

    @Override
    public void exitRoleplayerDeclaration(@NotNull EropcpParser.RoleplayerDeclarationContext ctx) {
        flagger.deactivateRolePlayer();
    }


    @Override
    public void enterBusinessOpDeclaration(@NotNull EropcpParser.BusinessOpDeclarationContext ctx) {
        flagger.activateBusinessOp();
    }

    @Override
    public void exitBusinessOpDeclaration(@NotNull EropcpParser.BusinessOpDeclarationContext ctx) {
        flagger.deactivateBusinessOp();
    }

    @Override
    public void enterOutcomeConstraint(@NotNull EropcpParser.OutcomeConstraintContext ctx) {
        flagger.activateOutcomeConstraint();
    }

    @Override
    public void exitOutcomeConstraint(@NotNull EropcpParser.OutcomeConstraintContext ctx) {
        flagger.deactivateOutcomeConstraint();
    }

    @Override
    public void enterTimePartialComparison(@NotNull EropcpParser.TimePartialComparisonContext ctx) {
        flagger.activateTimePartial();
    }

    @Override
    public void exitTimePartialComparison(@NotNull EropcpParser.TimePartialComparisonContext ctx) {
        flagger.deactivateTimePartial();
    }

    @Override
    public void enterTimeDirectComparison(@NotNull EropcpParser.TimeDirectComparisonContext ctx) {
        flagger.activateTimeDirect();
    }

    @Override
    public void exitTimeDirectComparison(@NotNull EropcpParser.TimeDirectComparisonContext ctx) {
        flagger.deactivateTimeDirect();
    }

    @Override
    public void enterHistoricalQuery(@NotNull EropcpParser.HistoricalQueryContext ctx) {
        flagger.activateHistoricalQuery();
    }


    @Override
    public void exitHistoricalQuery(@NotNull EropcpParser.HistoricalQueryContext ctx) {
        flagger.deactivateHistoricalQuery();
    }

    @Override
    public void enterRopConstraint(@NotNull EropcpParser.RopConstraintContext ctx) {
        flagger.activateRopConstraint();
    }

    @Override
    public void exitRopConstraint(@NotNull EropcpParser.RopConstraintContext ctx) {
        flagger.deactivateRopConstraint();
    }

    @Override
    public void enterCondition(@NotNull EropcpParser.ConditionContext ctx) {
        flagger.activateCondition();
    }

    @Override
    public void exitCondition(@NotNull EropcpParser.ConditionContext ctx) {
        flagger.deactivateCondition();
    }

    @Override
    public void enterCompobligDeclaration(@NotNull EropcpParser.CompobligDeclarationContext ctx) {
        flagger.activateCompositeOblig();
    }

    @Override
    public void exitCompobligDeclaration(@NotNull EropcpParser.CompobligDeclarationContext ctx) {
        flagger.deactivateCompositeOblig();
    }


    // Signals to

    @Override
    public void enterBool(@NotNull EropcpParser.BoolContext ctx) {
        flagger.addOutcomeBoolVal(memory, ctx.getText());
    }

    @Override
    public void enterField(@NotNull EropcpParser.FieldContext ctx) {
        flagger.addRuleField(memory, ctx.getText());
    }


    @Override
    public void enterOper(@NotNull EropcpParser.OperContext ctx) {
        flagger.addRuleOperation(memory, ctx.getText());
    }

    @Override
    public void enterRolePlayerConstraintIssuer(@NotNull EropcpParser.RolePlayerConstraintIssuerContext ctx) {
        flagger.addRolePlayerConstraintIssuer(memory, ctx.getText());
    }

    @Override
    public void enterOutcome(@NotNull EropcpParser.OutcomeContext ctx) {
        flagger.addOutcomeConstraintOutcome(memory, ctx.getText());
    }

    @Override
    public void enterTimeOperators(@NotNull EropcpParser.TimeOperatorsContext ctx) {
        flagger.addTimeDirectOperator(memory, ctx.getText());
    }

    @Override
    public void enterAbsoluteTime(@NotNull EropcpParser.AbsoluteTimeContext ctx) {
        flagger.addTimeDirectAbsoluteTime(memory, ctx.getText());
    }

    @Override
    public void enterDayKey(@NotNull EropcpParser.DayKeyContext ctx) {
        flagger.addTimePartialKey(memory, ctx.getText());
    }

    @Override
    public void enterDateKey(@NotNull EropcpParser.DateKeyContext ctx) {
        flagger.addTimePartialKey(memory, ctx.getText());
    }

    @Override
    public void enterMonthKey(@NotNull EropcpParser.MonthKeyContext ctx) {
        flagger.addTimePartialKey(memory, ctx.getText());
    }

    @Override
    public void enterYearKey(@NotNull EropcpParser.YearKeyContext ctx) {
        flagger.addTimePartialKey(memory, ctx.getText());
    }

    @Override
    public void enterDayOfWeek(@NotNull EropcpParser.DayOfWeekContext ctx) {
        flagger.addTimePartialValue(memory, ctx.getText());
    }

    @Override
    public void enterDayRange(@NotNull EropcpParser.DayRangeContext ctx) {
        flagger.addTimePartialValue(memory, ctx.getText());
    }

    @Override
    public void enterDateIdent(@NotNull EropcpParser.DateIdentContext ctx) {
        flagger.addTimePartialValue(memory, ctx.getText());
    }

    @Override
    public void enterDateRange(@NotNull EropcpParser.DateRangeContext ctx) {
        flagger.addTimePartialValue(memory, ctx.getText());
    }

    @Override
    public void enterMonthIdent(@NotNull EropcpParser.MonthIdentContext ctx) {
        flagger.addTimePartialValue(memory, ctx.getText());
    }

    @Override
    public void enterMonthRange(@NotNull EropcpParser.MonthRangeContext ctx) {
        flagger.addTimePartialValue(memory, ctx.getText());
    }

    @Override
    public void enterYearIdent(@NotNull EropcpParser.YearIdentContext ctx) {
        flagger.addTimePartialValue(memory, ctx.getText());
    }

    @Override
    public void enterYearRange(@NotNull EropcpParser.YearRangeContext ctx) {
        flagger.addTimePartialValue(memory, ctx.getText());
    }

    @Override
    public void enterRangeOperators(@NotNull EropcpParser.RangeOperatorsContext ctx) {
        flagger.addRangeOperation(memory, ctx.getText());
    }


    @Override
    public void enterHistoricalQueryOp(@NotNull EropcpParser.HistoricalQueryOpContext ctx) {
        flagger.addHistoricalQueryOperation(memory, ctx.getText());
    }


    @Override
    public void enterGenericString(@NotNull EropcpParser.GenericStringContext ctx) {
        flagger.addHistoricalQueryTimeC(memory, ctx.getText());
    }


    @Override
    public void enterRopset(@NotNull EropcpParser.RopsetContext ctx) {
        flagger.addRopSet(memory, ctx.getText());
    }

    @Override
    public void enterIfstatement(@NotNull EropcpParser.IfstatementContext ctx) {
        flagger.addIfStatement(memory);
    }


    //Change it so that both lhs and rhs create their constraint when they enter this method
    @Override
    public void enterConstraint(@NotNull EropcpParser.ConstraintContext ctx) {
        flagger.addConstraintRhs(memory);
    }


    @Override
    public void enterAndOR(@NotNull EropcpParser.AndORContext ctx) {
        flagger.addIfsOperator(memory, ctx.getText());
    }


    @Override
    public void enterRhsActionNoIfs(@NotNull EropcpParser.RhsActionNoIfsContext ctx) {
        flagger.activateRhsActionNoIfs();
        flagger.addIfsRhsAction(memory, ctx.getText());
    }

    @Override
    public void exitRhsActionNoIfs(@NotNull EropcpParser.RhsActionNoIfsContext ctx) {
        flagger.deactivateRhsActionNoIfs();
    }


    @Override
    public void enterPassaction(@NotNull EropcpParser.PassactionContext ctx) {
        flagger.addPassAction(memory, ctx.getText());
    }

    @Override
    public void enterAddRemAction(@NotNull EropcpParser.AddRemActionContext ctx) {
        flagger.activateAddRemAction();
    }

    @Override
    public void exitAddRemAction(@NotNull EropcpParser.AddRemActionContext ctx) {
        flagger.deactivateAddRemAction();
    }

    @Override
    public void enterResetaction(@NotNull EropcpParser.ResetactionContext ctx) {
        flagger.activateResetAction();
    }

    @Override
    public void exitResetaction(@NotNull EropcpParser.ResetactionContext ctx) {
        flagger.deactivateResetAction();
    }

    @Override
    public void enterIfThen(@NotNull EropcpParser.IfThenContext ctx) {
        flagger.activateIfThen();
        flagger.createIfThen(memory);
    }

    @Override
    public void exitIfThen(@NotNull EropcpParser.IfThenContext ctx) {
        flagger.deactivateIfThen();
    }

    @Override
    public void enterIfElse(@NotNull EropcpParser.IfElseContext ctx) {
        flagger.activateIfElse();
    }

    @Override
    public void exitIfElse(@NotNull EropcpParser.IfElseContext ctx) {
        flagger.deactivateIfElse();
    }

    @Override
    public void enterRhsaction(@NotNull EropcpParser.RhsactionContext ctx) {
        flagger.activareRhsAction();
    }

    @Override
    public void exitRhsaction(@NotNull EropcpParser.RhsactionContext ctx) {
        flagger.deactivateRhsAction();
    }

    @Override
    public void enterAddRemRopOperator(@NotNull EropcpParser.AddRemRopOperatorContext ctx) {
        flagger.addRhsRopOperator(memory, ctx.getText());
    }
}
