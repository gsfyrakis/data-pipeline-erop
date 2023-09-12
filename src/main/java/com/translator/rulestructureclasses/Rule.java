package com.translator.rulestructureclasses;

import java.util.LinkedList;


public class Rule {

    private String name;
    private String event;
    private LinkedList<EventMatchCondition> eventMatchConditions;
    private Constraint constraints;
    private RhsAction rhs;

    public Rule() {
        this.name = "not set";
        this.event = "not set";
        this.eventMatchConditions = new LinkedList<EventMatchCondition>();
        this.constraints = new Constraint();
        this.rhs = new RhsAction();
    }

    public Rule(String name, String event, LinkedList<EventMatchCondition> eventMatchCond, Constraint constraints, RhsAction rhs) {
        this.name = name;
        this.event = event;
        this.eventMatchConditions = eventMatchCond;
        this.constraints = constraints;
        this.rhs = rhs;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setEvent(String e) {
        this.event = e;
    }

    public void setEventMatchCondition(LinkedList<EventMatchCondition> c) {
        this.eventMatchConditions = c;
    }

    public void setConstraints(Constraint constraints) {
        this.constraints = constraints;
    }

    public String getName() {
        return this.name;
    }

    public String getEvent() {
        return this.event;
    }

    public LinkedList<EventMatchCondition> getEventMatchConditions() {
        return this.eventMatchConditions;
    }

    public Constraint getConstraints() {
        return this.constraints;
    }

    public RhsAction getRhs() {
        return rhs;
    }

    public void setRhs(RhsAction rhs) {
        this.rhs = rhs;
    }

    public IfStatement getRhsIfs() {
        return rhs.getIfs();
    }


    public Constraint getIfConstraints() {
        return rhs.getIfs().getConstraints();
    }

    public boolean addToIfThen() {
        return rhs.getIfs().getThenActionBlock().getAddRemAction().isEmpty();
    }

}
