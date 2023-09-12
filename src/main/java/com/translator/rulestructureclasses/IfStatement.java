package com.translator.rulestructureclasses;

import java.util.LinkedList;

public class IfStatement {
    private Constraint constraints;
    private LinkedList<String> operators;
    private RhsActionNoIfs thenActionBlock;
    private RhsActionNoIfs elseActionBlock;

    public IfStatement() {
        this.setConstraints(new Constraint());
        this.operators = new LinkedList<String>();
        this.thenActionBlock = null;
        this.elseActionBlock = null;
    }

    public LinkedList<String> getOperators() {
        return operators;
    }

    public void setOperators(LinkedList<String> operators) {
        this.operators = operators;
    }

    public RhsActionNoIfs getThenActionBlock() {
        return thenActionBlock;
    }

    public void setThenActionBlock(RhsActionNoIfs thenActionBlock) {
        this.thenActionBlock = thenActionBlock;
    }

    public RhsActionNoIfs getElseActionBlock() {
        return elseActionBlock;
    }


    public void setElseActionBlock(RhsActionNoIfs elseActionBlock) {
        this.elseActionBlock = elseActionBlock;
    }


    public Constraint getConstraints() {
        return constraints;
    }


    public void setConstraints(Constraint constraints) {
        this.constraints = constraints;
    }

    public boolean isThereElse() {
        return elseActionBlock != null ? true : false;
    }
}
