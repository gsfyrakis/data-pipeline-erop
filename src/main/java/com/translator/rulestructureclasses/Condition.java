package com.translator.rulestructureclasses;

import java.util.LinkedList;

public class Condition {
    private LinkedList<Constraint> constraints;
    private LinkedList<String> operators;

    public Condition() {
        this.constraints = new LinkedList<Constraint>();
        this.operators = new LinkedList<String>();
    }

    public LinkedList<Constraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(LinkedList<Constraint> constraints) {
        this.constraints = constraints;
    }

    public LinkedList<String> getOperators() {
        return operators;
    }

    public void setOperators(LinkedList<String> operators) {
        this.operators = operators;
    }
}
