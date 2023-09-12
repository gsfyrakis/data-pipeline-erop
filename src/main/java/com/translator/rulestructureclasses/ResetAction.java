package com.translator.rulestructureclasses;

public class ResetAction {
    private String ropSet;

    public ResetAction() {
        this.ropSet = "not set";
    }

    public ResetAction(String rop) {
        this.ropSet = rop;
    }

    public String getRopSet() {
        return ropSet;
    }

    public void setRopSet(String ropSet) {
        this.ropSet = ropSet;
    }


}
