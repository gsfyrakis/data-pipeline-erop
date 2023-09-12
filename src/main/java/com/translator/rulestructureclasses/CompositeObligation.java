package com.translator.rulestructureclasses;

public class CompositeObligation {
    private String name;
    private String firstBo;
    private String secondBo;


    public CompositeObligation() {
        this.name = "not set";
        this.firstBo = "not set";
        this.secondBo = "not set";
    }

    public CompositeObligation(String name, String first, String second) {
        this.name = name;
        this.firstBo = first;
        this.secondBo = second;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstBo() {
        return firstBo;
    }

    public void setFirstBo(String firstBo) {
        this.firstBo = firstBo;
    }

    public String getSecondBo() {
        return secondBo;
    }

    public void setSecondBo(String secondBo) {
        this.secondBo = secondBo;
    }

}
