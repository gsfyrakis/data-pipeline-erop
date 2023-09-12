package com.translator.utils;

import com.translator.rulestructureclasses.AddOrRemoveAction;
import com.translator.rulestructureclasses.CompositeObligation;
import com.translator.rulestructureclasses.HistoricalQuery;
import com.translator.rulestructureclasses.IfStatement;
import com.translator.rulestructureclasses.OutcomeConstraint;
import com.translator.rulestructureclasses.ResetAction;
import com.translator.rulestructureclasses.RhsActionNoIfs;
import com.translator.rulestructureclasses.RopConstraint;


public class VariableFlagger {

    private boolean rolePlayer;
    private boolean businessOperation;
    private boolean compositeObligation;
    //Rule Lhs and Rhs flags
    private boolean ruleLhs;
    private boolean ruleRhs;
    private boolean rhsActionNoIfs;

    // Event Match Flags
    private boolean eventMatch;
    private boolean eventCondition;
    private boolean ruleName;

    // Constraint Flags
    private boolean rolePlayerConstraint;
    private boolean outcomeConstraint;
    private boolean timePartialComparison;
    private boolean timeDirectComparison;
    private boolean historicalQuery;
    private boolean ropConstraint;
    private boolean addRemAction;
    private boolean ifThen;
    private boolean ifElse;
    private boolean rhsAction;
    private boolean condition;
    private boolean resetAction;


    public VariableFlagger() {
        this.rolePlayer = false;
        this.businessOperation = false;
        this.compositeObligation = false;
        this.eventMatch = false;
        this.ruleName = false;
        this.eventCondition = false;
        this.outcomeConstraint = false;
        this.timePartialComparison = false;
        this.timeDirectComparison = false;
        this.historicalQuery = false;
        this.ropConstraint = false;
        this.ruleLhs = false;
        this.ruleRhs = false;
        this.rhsActionNoIfs = false;
        this.addRemAction = false;
        this.resetAction = false;
        this.ifThen = false;
        this.ifElse = false;
        this.rhsAction = false;
        this.condition = false;
/*		this.ruleField = false;
		this.ruleOperation = false;
		this.ruleValue = false;*/
    }

    public void addVariables(VariablesMemory vm, String variableName) {

        if (isDeclarationVar()) {
            addToDeclarationVars(vm, variableName);
        } else {
            if (ruleName) {
                addToRuleVars(vm, variableName);
            } else if (ruleLhs) {
                addToRuleVars(vm, variableName);
            } else if (ruleRhs) {
                addToRuleVarsRhs(vm, variableName);
            }

        }
    }

    private void addToRuleVarsRhs(VariablesMemory vm, String variableName) {

        if (rolePlayerConstraint) {
            if (!vm.getRules().getLast().getEvent().toString().equalsIgnoreCase(variableName)) {
                if (rhsAction) {
                    vm.addRolePlayerConstraintValueRhs(variableName);
                } else {
                    vm.addRolePlayerConstraintValue(variableName);
                }

            }
        } else if (historicalQuery) {
            if (vm.getRules().getLast().getIfConstraints().getHistoricalQueries().isEmpty()) {
                vm.getRules().getLast().getIfConstraints().getHistoricalQueries().add(new HistoricalQuery());
            }
            if (vm.getRules().getLast().getIfConstraints().getHistoricalQueries().getLast().getEventType().equals("not set")) {
                vm.getRules().getLast().getIfConstraints().getHistoricalQueries().getLast().setEventType(variableName);
            } else if (vm.getRules().getLast().getIfConstraints().getHistoricalQueries().getLast().getOriginator().equals("not set")) {
                vm.getRules().getLast().getIfConstraints().getHistoricalQueries().getLast().setOriginator(variableName);
            } else if (vm.getRules().getLast().getIfConstraints().getHistoricalQueries().getLast().getResponder().equals("not set")) {
                vm.getRules().getLast().getIfConstraints().getHistoricalQueries().getLast().setResponder(variableName);
            }
        } else if (ropConstraint) {
/*			if(vm.getRules().getLast().getConstraints().getRopConstraints().isEmpty()){
				
			}*/

            if (vm.getRules().getLast().getIfConstraints().getRopConstraints().isEmpty()) {
                vm.getRules().getLast().getIfConstraints().getRopConstraints().addLast((new RopConstraint()));
            } else if (vm.getRules().getLast().getIfConstraints().getRopConstraints().getLast().shouldCreateNew()) {
                vm.getRules().getLast().getIfConstraints().getRopConstraints().addLast((new RopConstraint()));
            }

            if (vm.getRules().getLast().getIfConstraints().getRopConstraints().getLast().getBusinessOp().equals("not set")) {
                vm.getRules().getLast().getIfConstraints().getRopConstraints().getLast().setBusinessOp(variableName);
            } else if (vm.getRules().getLast().getIfConstraints().getRopConstraints().getLast().getRoleplayer().equals("not set")) {
                vm.getRules().getLast().getIfConstraints().getRopConstraints().getLast().setRoleplayer(variableName);
            }
        } else if (outcomeConstraint && ifThen) {
            if (vm.getRules().getLast().getRhsIfs().getThenActionBlock().getOutcomes().isEmpty()) {
                vm.getRules().getLast().getRhsIfs().getThenActionBlock().getOutcomes().add(new OutcomeConstraint());
            }
            vm.getRules().getLast().getRhsIfs().getThenActionBlock().getOutcomes().getLast().setEvent(variableName);
        } else if (outcomeConstraint && ifElse) {
            if (vm.getRules().getLast().getRhsIfs().getElseActionBlock().getOutcomes().isEmpty()) {
                vm.getRules().getLast().getRhsIfs().getElseActionBlock().getOutcomes().add(new OutcomeConstraint());
            }
            vm.getRules().getLast().getRhsIfs().getElseActionBlock().getOutcomes().getLast().setEvent(variableName);
        } else if (outcomeConstraint && condition) {
            if (vm.getRules().getLast().getRhsIfs().getConstraints().getOutcomeConstraints().isEmpty()) {
                vm.getRules().getLast().getRhsIfs().getConstraints().getOutcomeConstraints().add(new OutcomeConstraint());
            }
            vm.getRules().getLast().getRhsIfs().getConstraints().getOutcomeConstraints().getLast().setEvent(variableName);
        } else if (outcomeConstraint && rhsAction) {
            if (vm.getRules().getLast().getRhs().getOutcomes().isEmpty()) {
                vm.getRules().getLast().getRhs().getOutcomes().add(new OutcomeConstraint());
            }
            vm.getRules().getLast().getRhs().getOutcomes().getLast().setEvent(variableName);
        } else if (ifThen && resetAction) {
            vm.getRules().getLast().getRhsIfs().getThenActionBlock().getResetActions().addLast(new ResetAction(variableName));

        } else if (ifElse && resetAction) {
            vm.getRules().getLast().getRhsIfs().getElseActionBlock().getResetActions().addLast(new ResetAction(variableName));

        } else if (resetAction && (!ifElse && !ifThen)) {
            vm.getRules().getLast().getRhs().getResetActions().addLast(new ResetAction(variableName));

        } else if (ifElse && addRemAction) {

            if (vm.getRules().getLast().getRhsIfs().getElseActionBlock().getAddRemAction().isEmpty() ||
                    vm.getRules().getLast().getRhsIfs().getElseActionBlock().getAddRemAction().getLast().shouldCreateNew()) {
                vm.getRules().getLast().getRhsIfs().getElseActionBlock().getAddRemAction().addLast(new AddOrRemoveAction());
            }

            if (vm.getRules().getLast().getRhsIfs().getElseActionBlock().getAddRemAction().getLast().getRolePlayer().equals("not set")) {
                vm.getRules().getLast().getRhsIfs().getElseActionBlock().getAddRemAction().getLast().setRolePlayer(variableName);
            } else if (vm.getRules().getLast().getRhsIfs().getElseActionBlock().getAddRemAction().getLast().getBusinessOp().equals("not set")) {
                vm.getRules().getLast().getRhsIfs().getElseActionBlock().getAddRemAction().getLast().setBusinessOp(variableName);
            } else if (vm.getRules().getLast().getRhsIfs().getElseActionBlock().getAddRemAction().getLast().getResponder().equals("not set")) {
                vm.getRules().getLast().getRhsIfs().getElseActionBlock().getAddRemAction().getLast().setResponder(variableName);
            }
        } else if (ifThen && addRemAction) {

            if (vm.getRules().getLast().getRhsIfs().getThenActionBlock().getAddRemAction().isEmpty() ||
                    vm.getRules().getLast().getRhsIfs().getThenActionBlock().getAddRemAction().getLast().shouldCreateNew()) {
                vm.getRules().getLast().getRhsIfs().getThenActionBlock().getAddRemAction().addLast(new AddOrRemoveAction());
            }

            if (vm.getRules().getLast().getRhsIfs().getThenActionBlock().getAddRemAction().getLast().getRolePlayer().equals("not set")) {
                vm.getRules().getLast().getRhsIfs().getThenActionBlock().getAddRemAction().getLast().setRolePlayer(variableName);
            } else if (vm.getRules().getLast().getRhsIfs().getThenActionBlock().getAddRemAction().getLast().getBusinessOp().equals("not set")) {
                vm.getRules().getLast().getRhsIfs().getThenActionBlock().getAddRemAction().getLast().setBusinessOp(variableName);
            } else if (vm.getRules().getLast().getRhsIfs().getThenActionBlock().getAddRemAction().getLast().getResponder().equals("not set")) {
                vm.getRules().getLast().getRhsIfs().getThenActionBlock().getAddRemAction().getLast().setResponder(variableName);
            }

        } else if (addRemAction && (!ifThen && !ifElse)) {

            if (vm.getRules().getLast().getRhs().getAddRemAction().isEmpty() ||
                    vm.getRules().getLast().getRhs().getAddRemAction().getLast().shouldCreateNew()) {
                vm.getRules().getLast().getRhs().getAddRemAction().addLast(new AddOrRemoveAction());
            }

            if (vm.getRules().getLast().getRhs().getAddRemAction().getLast().getRolePlayer().equals("not set")) {
                vm.getRules().getLast().getRhs().getAddRemAction().getLast().setRolePlayer(variableName);
            } else if (vm.getRules().getLast().getRhs().getAddRemAction().getLast().getBusinessOp().equals("not set")) {
                vm.getRules().getLast().getRhs().getAddRemAction().getLast().setBusinessOp(variableName);
            } else if (vm.getRules().getLast().getRhs().getAddRemAction().getLast().getResponder().equals("not set")) {
                vm.getRules().getLast().getRhs().getAddRemAction().getLast().setResponder(variableName);
            }
        }

    }

    public void activateRolePlayer() {
        this.rolePlayer = true;
    }

    public void activateRuleName() {
        this.ruleName = true;
    }

    public void activateEventMatch() {
        this.eventMatch = true;
    }

    public void activateEventCondition() {
        this.eventCondition = true;
    }

    public void activateRolePlayerConstraint() {
        this.rolePlayerConstraint = true;
    }


//	public void activateRuleField(){
//		ruleField = true;
//	}
//	
//	public void activateRuleOperation(){
//		ruleOperation = true;
//	}
//	
//	public void activateRuleValue(){
//		ruleValue = true;
//	}

    public void deactivateRolePlayer() {
        rolePlayer = false;
    }

    public void activateBusinessOp() {
        businessOperation = true;
    }

    public void activateOutcomeConstraint() {
        this.outcomeConstraint = true;
    }

    public void activateTimePartial() {
        this.timePartialComparison = true;
    }

    public void deactivateBusinessOp() {
        businessOperation = false;
    }

    public void deactivateRuleName() {
        ruleName = false;
    }

    public void deactivateEventMatch() {
        eventMatch = false;
    }

    public void deactivateEventCondition() {
        eventCondition = false;
    }

    public void deactivateRolePlayerConstraint() {
        rolePlayerConstraint = false;
    }

    public void deactivateOutcomeConstraint() {
        outcomeConstraint = false;
    }

    public void deactivateTimePartial() {
        timePartialComparison = false;
    }


    public void activateTimeDirect() {
        this.timeDirectComparison = true;
    }

    public void deactivateTimeDirect() {
        this.timeDirectComparison = false;
    }

    public void activateHistoricalQuery() {
        this.historicalQuery = true;
    }

    public void deactivateHistoricalQuery() {
        this.historicalQuery = false;
    }

    public void activateRopConstraint() {
        this.ropConstraint = true;
    }

    public void deactivateRopConstraint() {
        this.ropConstraint = false;
    }
	
/*	public void deactivateRuleField(){
		ruleField = false;
	}
	
	public void deactivateRuleOperation(){
		ruleOperation = false;
	}
	
	public void deactivateRuleValue(){
		ruleValue = false;
	}*/

    public void addToDeclarationVars(VariablesMemory vm, String variableName) {
        if (rolePlayer) {
            vm.addRolePlayer(variableName);
        } else if (businessOperation) {
            vm.addBusinessOp(variableName);
        } else if (compositeObligation) {
            if (vm.compObligEmpty() || vm.compObligShouldCreateNew()) {
                vm.addCompOblig(new CompositeObligation());
                vm.getCompObligs().getLast().setName(variableName);
            } else {
                if (vm.getCompObligs().getLast().getFirstBo().equals("not set")) {
                    vm.getCompObligs().getLast().setFirstBo(variableName);
                } else if (vm.getCompObligs().getLast().getSecondBo().equals("not set")) {
                    vm.getCompObligs().getLast().setSecondBo(variableName);
                }
            }
        }
    }

    public void addToRuleVars(VariablesMemory vm, String variableName) {

        if (ruleName) {
            vm.addRuleName(variableName);
        } else if (eventMatch) {
            vm.addEvent(variableName);
        } else if (eventCondition) {
            vm.addEventCondValue(variableName);
        } else if (rolePlayerConstraint) {
            if (!vm.getRules().getLast().getEvent().toString().equalsIgnoreCase(variableName)) {
                vm.addRolePlayerConstraintValue(variableName);
            }
        } else if (historicalQuery) {
            if (vm.getRules().getLast().getConstraints().getHistoricalQueries().isEmpty()) {
                vm.getRules().getLast().getConstraints().getHistoricalQueries().add(new HistoricalQuery());
            }
            if (vm.getRules().getLast().getConstraints().getHistoricalQueries().getLast().getEventType().equals("not set")) {
                vm.getRules().getLast().getConstraints().getHistoricalQueries().getLast().setEventType(variableName);
            } else if (vm.getRules().getLast().getConstraints().getHistoricalQueries().getLast().getOriginator().equals("not set")) {
                vm.getRules().getLast().getConstraints().getHistoricalQueries().getLast().setOriginator(variableName);
            } else if (vm.getRules().getLast().getConstraints().getHistoricalQueries().getLast().getResponder().equals("not set")) {
                vm.getRules().getLast().getConstraints().getHistoricalQueries().getLast().setResponder(variableName);
            }
        } else if (ropConstraint) {
/*			if(vm.getRules().getLast().getConstraints().getRopConstraints().isEmpty()){
				
			}*/

            if (vm.getRules().getLast().getConstraints().getRopConstraints().isEmpty() || vm.getRules().getLast().getConstraints().getRopConstraints().getLast().shouldCreateNew()) {
                vm.getRules().getLast().getConstraints().getRopConstraints().addLast((new RopConstraint()));
            }


            if (vm.getRules().getLast().getConstraints().getRopConstraints().getLast().getBusinessOp().equals("not set")) {
                vm.getRules().getLast().getConstraints().getRopConstraints().getLast().setBusinessOp(variableName);
            } else if (vm.getRules().getLast().getConstraints().getRopConstraints().getLast().getRoleplayer().equals("not set")) {
                vm.getRules().getLast().getConstraints().getRopConstraints().getLast().setRoleplayer(variableName);
            }
        } else if (outcomeConstraint) {
            if (vm.getRules().getLast().getConstraints().getOutcomeConstraints().isEmpty()) {
                vm.getRules().getLast().getConstraints().getOutcomeConstraints().add(new OutcomeConstraint());
            }
            vm.getRules().getLast().getConstraints().getOutcomeConstraints().getLast().setEvent(variableName);
        }
			/*else if(outcomeConstraint){
		}
			if(!vm.getRules().getLast().getEvent().toString().equalsIgnoreCase(variableName)){
				vm.(variableName);
			}
		}*/
		/*else if (ruleField)
		{
			vm.addEventCondField(variableName);
		} else if (ruleValue){
			vm.addEventCondValue(variableName);
		}*/
    }

    public void addRuleField(VariablesMemory vm, String variableName) {
        vm.addEventCondField(variableName);
    }

    public void addRuleOperation(VariablesMemory vm, String variableName) {

        if (ruleLhs) {
            if (eventCondition) {
                vm.addEventCondOperation(variableName);
            } else if (rolePlayerConstraint) {
                vm.addRolePlayerConstraintOperation(variableName);
            } else if (outcomeConstraint) {
                vm.addOutcomeConstraintOperation(variableName);
            } else if (timePartialComparison) {
                vm.addTimePartialOperation(variableName);
            }
        } else if (ruleRhs) {
            if (rolePlayerConstraint) {
                vm.addRolePlayerConstraintOperationRhs(variableName);
            } else if (outcomeConstraint && condition) {
                vm.addOutcomeConstraintOperationRhs(variableName);
            } else if (outcomeConstraint && rhsAction && (!ifThen && !ifElse)) {
                vm.addOutcomeOperationRhsAction(variableName);
            } else if (outcomeConstraint && ifThen) {
                vm.addOutcomeOperationIfThen(variableName);
            } else if (outcomeConstraint && ifElse) {
                vm.addOutcomeOperationIfElse(variableName);
            } else if (timePartialComparison) {
                vm.addTimePartialOperationRhs(variableName);
            }
        }


    }

    public void addOutcomeBoolVal(VariablesMemory vm, String variableName) {
        if (ruleLhs) {
            vm.addOutcomeConstraintBool(variableName);
        } else if (ruleRhs) {
            if (condition) {
                vm.addOutcomeBoolIfCond(variableName);
            } else if (rhsAction && (!ifThen && !ifElse)) {
                vm.addOutcomeBoolRhsAction(variableName);
            } else if (ifThen) {
                vm.addOutcomeBoolIfThen(variableName);
            } else if (ifElse) {
                vm.addOutcomeBoolIfElse(variableName);
            }

        }
    }

    public void addRolePlayerConstraintIssuer(VariablesMemory vm, String variableName) {
        if (ruleLhs) {
            vm.addRolePlayerConstraintIssuer(variableName);
        } else if (ruleRhs) {
            vm.addRolePlayerConstraintIssuerRhs(variableName);
        }

    }

    public boolean isDeclarationVar() {
        if (businessOperation || rolePlayer || compositeObligation) {
            return true;
        } else {
            return false;
        }
    }

    public void addOutcomeConstraintOutcome(VariablesMemory vm, String variableName) {
        if (ruleLhs) {
            if (outcomeConstraint) {
                vm.addOutcomeConstraintOutcome(variableName);
            } else if (historicalQuery) {
                vm.addHistoricalQueryOutcome(variableName);
            }
        } else if (ruleRhs) {
            if (outcomeConstraint && condition) {
                vm.addOutcomeConstraintOutcomeRhs(variableName);
            } else if (outcomeConstraint && rhsAction && (!ifThen && !ifElse)) {
                vm.addOutcomeConstraintOutcomeRhsAction(variableName);
            } else if (outcomeConstraint && ifThen) {
                vm.addOutcomeConstraintOutcomeIfThen(variableName);
            } else if (outcomeConstraint && ifElse) {
                vm.addOutcomeConstraintOutcomeifElse(variableName);
            } else if (historicalQuery) {
                vm.addHistoricalQueryOutcomeRhs(variableName);
            } else if (rhsAction && (!ifThen && !ifElse)) {
                vm.getRules().getLast().getRhs().setOutcome(variableName);
            } else if (ifThen) {
                vm.getRules().getLast().getRhsIfs().getThenActionBlock().setOutcome(variableName);
            } else if (ifElse) {
                vm.getRules().getLast().getRhsIfs().getElseActionBlock().setOutcome(variableName);
            }
        }
    }

    public void addTimeDirectOperator(VariablesMemory vm, String variableName) {
        if (ruleLhs) {
            if (timeDirectComparison) {
                vm.addTimeDirectCompOperator(variableName);
            } else if (timePartialComparison) {
                vm.addTimePartialOperation(variableName);
            }
        } else if (ruleRhs) {
            if (timeDirectComparison) {
                vm.addTimeDirectCompOperatorRhs(variableName);
            } else if (timePartialComparison) {
                vm.addTimePartialOperationRhs(variableName);
            }
        }


    }

    public void addTimeDirectAbsoluteTime(VariablesMemory vm, String variableName) {
        if (ruleLhs) {
            vm.addTimeDirectAbsoluteTime(variableName);
        } else if (ruleRhs) {
            vm.addTimeDirectAbsoluteTimeRhs(variableName);
        }

    }

    public void addTimePartialKey(VariablesMemory vm, String variableName) {

        if (ruleLhs) {
            vm.addTimePartialKey(variableName);
        } else if (ruleRhs) {
            vm.addTimePartialKeyRhs(variableName);
        }
    }

    public void addTimePartialValue(VariablesMemory vm, String variableName) {
        if (ruleLhs) {
            vm.addTimePartialValue(variableName);
        } else if (ruleRhs) {
            vm.addTimePartialValueRhs(variableName);
        }
    }


    public void addHistoricalQueryOperation(VariablesMemory vm, String variableName) {
        if (ruleLhs) {
            vm.addHistoricalQueryOp(variableName);
        } else if (ruleRhs) {
            vm.addHistoricalQueryOpRhs(variableName);
        }
    }

    public void addHistoricalQueryTimeC(VariablesMemory vm, String variableName) {

        if (ruleLhs) {
            vm.addHistoricalQueryTimeC(variableName);
        } else if (ruleRhs) {
            vm.addHistoricalQueryTimeCRhs(variableName);
        }
    }

    public void addRangeOperation(VariablesMemory vm, String variableName) {

        if (ruleLhs) {
            if (timePartialComparison) {
                vm.addTimePartialOperation(variableName);
            } else if (ropConstraint) {
                vm.addRopOperator(variableName);
            }
        } else if (ruleRhs) {
            if (timePartialComparison) {
                vm.addTimePartialOperationRhs(variableName);
            } else if (ropConstraint) {
                vm.addRopOperatorRhs(variableName);
            }
        }

    }

    public void addRopSet(VariablesMemory vm, String variableName) {

        if (ruleLhs) {
            if (ropConstraint) {
                vm.getRules().getLast().getConstraints().getRopConstraints().getLast().setRopSet(variableName);
            }
        } else if (ruleRhs) {
            if (ropConstraint) {
                vm.getRules().getLast().getIfConstraints().getRopConstraints().getLast().setRopSet(variableName);
            } else if (rhsAction && (!ifThen && !ifElse)) {
                vm.getRules().getLast().getRhs().getAddRemAction().getLast().setRopSet(variableName);
            } else if (ifThen) {
                vm.getRules().getLast().getRhsIfs().getThenActionBlock().getAddRemAction().getLast().setRopSet(variableName);
            } else if (ifElse) {
                vm.getRules().getLast().getRhsIfs().getElseActionBlock().getAddRemAction().getLast().setRopSet(variableName);
            } else if (rhsActionNoIfs) {
                vm.getRules().getLast().getRhs().getAddRemAction().getLast().setRopSet(variableName);
            }
        }
    }

    public void activateLhs() {
        this.ruleLhs = true;
    }

    public void deactivateLhs() {
        this.ruleLhs = false;
    }

    public void activateRhs() {
        this.ruleRhs = true;
    }

    public void deactivateRhs() {
        this.ruleRhs = false;
    }

    public void addIfStatement(VariablesMemory memory) {
        if (memory.getRules().getLast().getRhsIfs() == null) {
            //memory.getRules().getLast().setRhs(new RhsAction());
            memory.getRules().getLast().getRhs().setIfs(new IfStatement());
        }
    }

    public void addCondition(VariablesMemory memory) {

    }

    public void addConstraintRhs(VariablesMemory memory) {
        if (ruleRhs) {
            memory.getRules().getLast().getIfConstraints();
        }
    }

    public void addIfsOperator(VariablesMemory vm, String variableName) {
        if (ruleRhs) {
            vm.getRules().getLast().getRhsIfs().getOperators().addLast(variableName);
        }
    }

    // if outcome constraint or addrem add to rule rhs
    public void addIfsRhsAction(VariablesMemory vm, String variableName) {
        if (vm.getRules().getLast().getRhsIfs() == null) {
            //vm.getRules().getLast().getRhs().getOutcomes().addLast(new OutcomeConstraint());
        } else {
            if (vm.getRules().getLast().getRhsIfs().getThenActionBlock() == null) {
                vm.getRules().getLast().getRhsIfs().setThenActionBlock(new RhsActionNoIfs());
            } else if (vm.getRules().getLast().getRhsIfs().getElseActionBlock() == null) {
                vm.getRules().getLast().getRhsIfs().setElseActionBlock(new RhsActionNoIfs());
            }
        }


    }

    public void activateRhsActionNoIfs() {
        this.rhsActionNoIfs = true;
    }

    public void deactivateRhsActionNoIfs() {
        this.rhsActionNoIfs = false;
    }

    public void addPassAction(VariablesMemory vm, String text) {
        if (ifThen) {
            vm.getRules().getLast().getRhsIfs().getThenActionBlock().setPassaction(text);
        } else if (ifElse) {
            vm.getRules().getLast().getRhsIfs().getElseActionBlock().setPassaction(text);
        } else if (rhsAction && (!ifThen && !ifElse)) {
            vm.getRules().getLast().getRhs().setPassaction(text);
        }
    }

    public void activateAddRemAction() {
        this.addRemAction = true;
    }

    public void deactivateAddRemAction() {
        this.addRemAction = true;
    }

    public void activateIfThen() {
        this.ifThen = true;
    }

    public void deactivateIfThen() {
        this.ifThen = false;
    }

    public void activateIfElse() {
        this.ifElse = true;
    }

    public void deactivateIfElse() {
        this.ifElse = false;
    }

    public void activareRhsAction() {
        this.rhsAction = true;
    }

    public void deactivateRhsAction() {
        this.rhsAction = false;
    }

    public void createIfThen(VariablesMemory memory) {
        memory.getRules().getLast().getRhsIfs().setThenActionBlock(new RhsActionNoIfs());
    }

    public void addRhsRopOperator(VariablesMemory memory, String text) {
        if (rhsAction && (!ifThen && !ifElse)) {
            memory.getRules().getLast().getRhs().getAddRemAction().getLast().setOperatior(text);
        } else if (ifThen) {
            memory.getRules().getLast().getRhsIfs().getThenActionBlock().getAddRemAction().getLast().setOperatior(text);
        } else if (ifElse) {
            memory.getRules().getLast().getRhsIfs().getElseActionBlock().getAddRemAction().getLast().setOperatior(text);
        } else if (rhsActionNoIfs) {
            memory.getRules().getLast().getRhs().getAddRemAction().getLast().setOperatior(text);
        }
    }

    public void activateCondition() {
        this.condition = true;
    }

    public void deactivateCondition() {
        this.condition = false;
    }

    public void activateCompositeOblig() {
        compositeObligation = true;
    }

    public void deactivateCompositeOblig() {
        compositeObligation = false;
    }

    public void activateResetAction() {
        resetAction = true;
    }

    public void deactivateResetAction() {
        resetAction = false;
    }


}
