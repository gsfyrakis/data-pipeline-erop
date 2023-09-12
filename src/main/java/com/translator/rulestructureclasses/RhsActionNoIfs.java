package com.translator.rulestructureclasses;

import java.util.LinkedList;

public class RhsActionNoIfs {
    private String outcome;
    private String passaction;
    private LinkedList<AddOrRemoveAction> addRemAction;
    private LinkedList<OutcomeConstraint> outcomes;
    private LinkedList<ResetAction> resetActions;

    public RhsActionNoIfs() {
        addRemAction = new LinkedList<AddOrRemoveAction>();
        outcomes = new LinkedList<OutcomeConstraint>();
        resetActions = new LinkedList<ResetAction>();
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

    public boolean isTherePass() {
        return passaction != null ? true : false;
    }

    public boolean isThereOutcome() {
        return outcome != null ? true : false;
    }

    public boolean isThereAddRemAction() {
        return !addRemAction.isEmpty() ? true : false;
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

}
