package com.translator.rulestructureclasses;

public class OutcomeConstraint {
    private String operation;
    private String outcome;
    private String event;
    private String value;

    public OutcomeConstraint() {
        this.operation = "not set";
        this.outcome = "not set";
        this.event = "not set";
        this.setValue("not set");
    }

    public OutcomeConstraint(String operation, String outcome, String event, String value) {
        this.operation = operation;
        this.outcome = outcome;
        this.event = event;
        this.setValue(value);
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
