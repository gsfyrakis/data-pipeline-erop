package com.translator.rulestructureclasses;

public class EventMatchCondition {
    private String field;
    private String operation;
    private String value;

    public EventMatchCondition() {
        this.field = "not set";
        this.operation = "not set";
        this.value = "not set";
    }

    public EventMatchCondition(String field, String operation, String value) {
        this.field = field;
        this.operation = operation;
        this.value = value;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setsetOperation(String operation) {
        this.operation = operation;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getField() {
        return field;
    }

    public String getOperation() {
        return operation;
    }

    public String getValue() {
        return value;
    }
}