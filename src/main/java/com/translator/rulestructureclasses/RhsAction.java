package com.translator.rulestructureclasses;

import java.util.LinkedList;

public class RhsAction {
    private IfStatement ifs;
    private String outcome;
    private String passaction;
    private LinkedList<AddOrRemoveAction> addRemAction;
    private LinkedList<OutcomeConstraint> outcomes;
    private LinkedList<ResetAction> resetActions;

    public RhsAction() {
        this.addRemAction = new LinkedList<AddOrRemoveAction>();
        this.outcomes = new LinkedList<OutcomeConstraint>();
        this.resetActions = new LinkedList<ResetAction>();
    }

    public IfStatement getIfs() {
        return ifs;
    }

    public void setIfs(IfStatement ifs) {
        this.ifs = ifs;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public String getPassaction() {
        return passaction;
    }

    public void setPassaction(String passaction) {
        this.passaction = passaction;
    }

    public LinkedList<AddOrRemoveAction> getAddRemAction() {
        return addRemAction;
    }

    public void setAddRemAction(LinkedList<AddOrRemoveAction> addRemAction) {
        this.addRemAction = addRemAction;
    }

    public boolean isThereIf() {
        return ifs != null ? true : false;
    }

    public boolean isTherePass() {
        return passaction != null ? true : false;
    }

    public boolean isThereOutcome() {
        return outcome != null ? true : false;
    }

    public boolean isThereAddRemAction() {
        return addRemAction != null ? true : false;
    }

    public LinkedList<OutcomeConstraint> getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(LinkedList<OutcomeConstraint> outcomes) {
        this.outcomes = outcomes;
    }

    public boolean isThereOutcomeManipulation() {
        return outcome != null ? true : false;
    }

    public LinkedList<ResetAction> getResetActions() {
        return resetActions;
    }

    public void setResetActions(LinkedList<ResetAction> resetActions) {
        this.resetActions = resetActions;
    }

    public boolean isThereResetAction() {
        return resetActions.isEmpty() ? false : true;
    }
}
