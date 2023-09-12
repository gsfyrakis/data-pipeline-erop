package com.translator.rulestructureclasses;

public class HistoricalQuery {
    private String operation;
    private String eventType;
    private String timeConstraint;
    private String originator;
    private String responder;
    private String status;

    public HistoricalQuery() {
        this.operation = "not set";
        this.eventType = "not set";
        this.timeConstraint = "not set";
        this.originator = "not set";
        this.responder = "not set";
        this.status = "not set";
    }

    public HistoricalQuery(String op, String et, String tc, String or, String re, String st) {
        operation = op;
        eventType = et;
        timeConstraint = tc;
        originator = or;
        responder = re;
        status = st;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getTimeConstraint() {
        return timeConstraint;
    }

    public void setTimeConstraint(String timeConstraint) {
        this.timeConstraint = timeConstraint;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public String getResponder() {
        return responder;
    }

    public void setResponder(String responder) {
        this.responder = responder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
