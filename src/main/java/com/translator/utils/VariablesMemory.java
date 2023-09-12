package com.translator.utils;

import java.util.LinkedList;
import java.util.Queue;

import com.translator.rulestructureclasses.CompositeObligation;
import com.translator.rulestructureclasses.EventMatchCondition;
import com.translator.rulestructureclasses.HistoricalQuery;
import com.translator.rulestructureclasses.OutcomeConstraint;
import com.translator.rulestructureclasses.RhsAction;
import com.translator.rulestructureclasses.RolePlayerConstraint;
import com.translator.rulestructureclasses.Rule;
import com.translator.rulestructureclasses.TimeDirectComparison;
import com.translator.rulestructureclasses.TimePartialComparison;

public class VariablesMemory {
    private Queue<String> rolePlayers;
    private Queue<String> businessOps;
    private LinkedList<CompositeObligation> compObligs;
    private LinkedList<Rule> rules;
    private RhsAction rhsAction;

    public VariablesMemory() {
        rolePlayers = new LinkedList<String>();
        businessOps = new LinkedList<String>();
        compObligs = new LinkedList<CompositeObligation>();
        rules = new LinkedList<Rule>();
    }

    public void addRolePlayer(String s) {
        rolePlayers.add(s);
    }

    public void addBusinessOp(String s) {
        businessOps.add(s);
    }

    public void addCompOblig(CompositeObligation s) {
        compObligs.addLast(s);
    }

    public Queue<String> getRolePlayers() {
        return rolePlayers;
    }

    public Queue<String> getBusinessOps() {
        return businessOps;
    }

    public LinkedList<CompositeObligation> getCompObligs() {
        return compObligs;
    }


    public void addRuleName(String s) {
        rules.add(new Rule());
        rules.getLast().setName(s);
        ;
    }


    public void addEvent(String e) {
        rules.getLast().setEvent(e);
    }

    public LinkedList<String> getRuleNames() {
        LinkedList<String> names = new LinkedList<String>();

        for (Rule rule : rules) {
            names.add(rule.getName());
        }

        return names;
    }

    public LinkedList<Rule> getRules() {
        return rules;
    }

    public void addEventCondField(String s) {
        rules.getLast().getEventMatchConditions().add(new EventMatchCondition());
        rules.getLast().getEventMatchConditions().getLast().setField(s);
    }

    public void addEventCondOperation(String s) {
        rules.getLast().getEventMatchConditions().getLast().setsetOperation(s);
    }

    public void addEventCondValue(String s) {
        rules.getLast().getEventMatchConditions().getLast().setValue(s);
    }

    public void addRolePlayerConstraintIssuer(String s) {
        if (rules.getLast().getConstraints().rpConstraintsEmpty()) {
            rules.getLast().getConstraints().setRpConstraints(new LinkedList<RolePlayerConstraint>());
        }
        rules.getLast().getConstraints().getRpConstraints().addLast(new RolePlayerConstraint());
        rules.getLast().getConstraints().getRpConstraints().getLast().setIssuer(s);
    }

    public void addRolePlayerConstraintOperation(String s) {
        rules.getLast().getConstraints().getRpConstraints().getLast().setOperator(s);
    }

    public void addRolePlayerConstraintValue(String s) {
        rules.getLast().getConstraints().getRpConstraints().getLast().setValue(s);
    }

    public void addRolePlayerConstraintValueRhs(String s) {
        rules.getLast().getIfConstraints().getRpConstraints().getLast().setValue(s);
    }

    public void addOutcomeConstraintOperation(String variableName) {
        // TODO Auto-generated method stub
        //addOutcomeConstraintEvent();
        rules.getLast().getConstraints().getOutcomeConstraints().getLast().setOperation(variableName);
    }

    public void addOutcomeConstraintEvent() {
        if (rules.getLast().getConstraints().outcomeConstraintEmpty()) {
            rules.getLast().getConstraints().setOutcomeConstraints(new LinkedList<OutcomeConstraint>());
        }
        rules.getLast().getConstraints().getOutcomeConstraints().add(new OutcomeConstraint());
        rules.getLast().getConstraints().getOutcomeConstraints().getLast().setEvent(rules.getLast().getEvent());
    }

    public void addOutcomeConstraintOutcome(String variableName) {
        rules.getLast().getConstraints().getOutcomeConstraints().getLast().setOutcome(variableName);
    }

    public void addTimeDirectCompOperator(String variableName) {
        if (rules.getLast().getConstraints().timeDirectCompEmpty()) {
            //rules.getLast().getConstraints().setTimeDirectComparisons(new LinkedList<TimeDirectComparison>());
        }
        rules.getLast().getConstraints().getTimeDirectComparisons().add(new TimeDirectComparison());
        rules.getLast().getConstraints().getTimeDirectComparisons().getLast().settDirectComparisonOp(variableName);
    }

    public void addTimeDirectAbsoluteTime(String variableName) {
        rules.getLast().getConstraints().getTimeDirectComparisons().getLast().setAbsoluteTime(variableName);
    }

    public void addTimePartialKey(String variableName) {
        rules.getLast().getConstraints().getTimePartialComparisons().add(new TimePartialComparison());
        rules.getLast().getConstraints().getTimePartialComparisons().getLast().setKey(variableName);
    }

    public void addTimePartialOperation(String variableName) {
        rules.getLast().getConstraints().getTimePartialComparisons().getLast().setOperation(variableName);
    }

    public void addTimePartialValue(String variableName) {
        rules.getLast().getConstraints().getTimePartialComparisons().getLast().setValue(variableName);
    }

    public void addHistoricalQueryOp(String variableName) {
        rules.getLast().getConstraints().getHistoricalQueries().add(new HistoricalQuery());
        rules.getLast().getConstraints().getHistoricalQueries().getLast().setOperation(variableName);
    }

    public void addHistoricalQueryTimeC(String variableName) {
        rules.getLast().getConstraints().getHistoricalQueries().getLast().setTimeConstraint(variableName);
    }

    public void addHistoricalQueryOutcome(String variableName) {
        rules.getLast().getConstraints().getHistoricalQueries().getLast().setStatus(variableName);
    }

    public void addRopOperator(String variableName) {
        rules.getLast().getConstraints().getRopConstraints().getLast().setOperator(variableName);
    }

    public RhsAction getRhsAction() {
        return rhsAction;
    }

    public void setRhsAction(RhsAction rhsAction) {
        this.rhsAction = rhsAction;
    }


    // RHS population methods
    public void addRolePlayerConstraintIssuerRhs(String variableName) {
/*		if(rules.getLast().getIfConstraints().isEmpty())
		{
			rules.getLast().getIfConstraints().add(new Constraint());
		}*/
        rules.getLast().getIfConstraints().getRpConstraints().addLast(new RolePlayerConstraint());
        rules.getLast().getIfConstraints().getRpConstraints().getLast().setIssuer(variableName);
    }

    public void addRolePlayerConstraintOperationRhs(String variableName) {
        rules.getLast().getIfConstraints().getRpConstraints().getLast().setOperator(variableName);
    }

    public void addOutcomeConstraintOperationRhs(String variableName) {
        rules.getLast().getIfConstraints().getOutcomeConstraints().getLast().setOperation(variableName);
    }

    public void addTimePartialOperationRhs(String variableName) {
        rules.getLast().getIfConstraints().getTimePartialComparisons().getLast().setOperation(variableName);
    }

    public void addOutcomeConstraintOutcomeRhs(String variableName) {
        rules.getLast().getIfConstraints().getOutcomeConstraints().getLast().setOutcome(variableName);
    }

    public void addHistoricalQueryOutcomeRhs(String variableName) {
        rules.getLast().getIfConstraints().getHistoricalQueries().getLast().setStatus(variableName);

    }

    public void addTimeDirectCompOperatorRhs(String variableName) {
        rules.getLast().getIfConstraints().getTimeDirectComparisons().add(new TimeDirectComparison());
        rules.getLast().getIfConstraints().getTimeDirectComparisons().getLast().settDirectComparisonOp(variableName);
    }

    public void addTimeDirectAbsoluteTimeRhs(String variableName) {
        rules.getLast().getIfConstraints().getTimeDirectComparisons().getLast().setAbsoluteTime(variableName);
    }

    public void addTimePartialKeyRhs(String variableName) {
        rules.getLast().getIfConstraints().getTimePartialComparisons().add(new TimePartialComparison());
        rules.getLast().getIfConstraints().getTimePartialComparisons().getLast().setKey(variableName);
    }

    public void addTimePartialValueRhs(String variableName) {
        rules.getLast().getIfConstraints().getTimePartialComparisons().getLast().setValue(variableName);
    }

    public void addHistoricalQueryOpRhs(String variableName) {
        rules.getLast().getIfConstraints().getHistoricalQueries().add(new HistoricalQuery());
        rules.getLast().getIfConstraints().getHistoricalQueries().getLast().setOperation(variableName);
    }

    public void addHistoricalQueryTimeCRhs(String variableName) {
        rules.getLast().getIfConstraints().getHistoricalQueries().getLast().setTimeConstraint(variableName);
    }

    public void addRopOperatorRhs(String variableName) {
        rules.getLast().getIfConstraints().getRopConstraints().getLast().setOperator(variableName);
    }

    public void addOutcomeConstraintBool(String variableName) {
        rules.getLast().getConstraints().getOutcomeConstraints().getLast().setValue(variableName);
    }

    public void addOutcomeBoolIfCond(String variableName) {
        rules.getLast().getIfConstraints().getOutcomeConstraints().getLast().setValue(variableName);
    }

    public void addOutcomeBoolRhsAction(String variableName) {
        rules.getLast().getRhs().getOutcomes().getLast().setValue(variableName);
    }

    public void addOutcomeBoolIfThen(String variableName) {
        rules.getLast().getRhsIfs().getThenActionBlock().getOutcomes().getLast().setValue(variableName);
    }

    public void addOutcomeBoolIfElse(String variableName) {
        rules.getLast().getRhsIfs().getElseActionBlock().getOutcomes().getLast().setValue(variableName);
    }

    public void addOutcomeOperationRhsAction(String variableName) {
        rules.getLast().getRhs().getOutcomes().getLast().setOperation(variableName);
    }

    public void addOutcomeOperationIfThen(String variableName) {
        rules.getLast().getRhs().getIfs().getThenActionBlock().getOutcomes().getLast().setOperation(variableName);

    }

    public void addOutcomeOperationIfElse(String variableName) {
        rules.getLast().getRhs().getIfs().getElseActionBlock().getOutcomes().getLast().setOperation(variableName);
    }

    public void addOutcomeConstraintOutcomeRhsAction(String variableName) {
        rules.getLast().getRhs().getOutcomes().getLast().setOutcome(variableName);
    }

    public void addOutcomeConstraintOutcomeIfThen(String variableName) {
        rules.getLast().getRhs().getIfs().getThenActionBlock().getOutcomes().getLast().setOutcome(variableName);
    }

    public void addOutcomeConstraintOutcomeifElse(String variableName) {
        rules.getLast().getRhs().getIfs().getElseActionBlock().getOutcomes().getLast().setOutcome(variableName);
    }


    public boolean compObligEmpty() {
        return compObligs.isEmpty();
    }

    public boolean compObligShouldCreateNew() {
        if ((!compObligs.getLast().getName().equals("not set")) &&
                (!compObligs.getLast().getFirstBo().equals("not set")) &&
                (!compObligs.getLast().getSecondBo().equals("not set"))) {
            return true;
        }
        return false;
    }

    public boolean isCompositeOblig(String businessOp) {
        for (CompositeObligation compOblig : compObligs) {
            if (compOblig.getName().equals(businessOp)) {
                return true;
            }
        }
        return false;
    }

    public String getFirstBoFor(String s) {
        for (CompositeObligation compOblig : compObligs) {
            if (compOblig.getName().equals(s)) {
                return compOblig.getFirstBo();
            }
        }

        return "first BO not set";
    }

    public String getSecondBoFor(String s) {
        for (CompositeObligation compOblig : compObligs) {
            if (compOblig.getName().equals(s)) {
                return compOblig.getSecondBo();
            }
        }

        return "second BO not set";
    }
}
