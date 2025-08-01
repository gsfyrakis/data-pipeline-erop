package com.translator.rulestructureclasses;

public class CompositeObligation {
    private String name;
    private String firstGovOp;
    private String secondGovOp;


    public CompositeObligation() {
        this.name = "not set";
        this.firstGovOp = "not set";
        this.secondGovOp = "not set";
    }

    public CompositeObligation(String name, String first, String second) {
        this.name = name;
        this.firstGovOp = first;
        this.secondGovOp = second;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstGovOp() {
        return firstGovOp;
    }

    public void setFirstGovOp(String firstGovOp) {
        this.firstGovOp = firstGovOp;
    }

    public String getSecondGovOp() {
        return secondGovOp;
    }

    public void setSecondGovOp(String secondGovOp) {
        this.secondGovOp = secondGovOp;
    }

}
