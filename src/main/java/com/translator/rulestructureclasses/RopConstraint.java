package com.translator.rulestructureclasses;

public class RopConstraint {

    private String businessOp;
    private String operator;
    private String roleplayer;
    private String ropSet;

    public RopConstraint() {
        this.businessOp = "not set";
        this.operator = "not set";
        this.roleplayer = "not set";
        this.ropSet = "not set";
    }


    public RopConstraint(String businessOp, String operator, String roleplayer, String ropSet) {
        this.businessOp = businessOp;
        this.operator = operator;
        this.roleplayer = roleplayer;
        this.ropSet = ropSet;
    }

    public String getBusinessOp() {
        return businessOp;
    }

    public void setBusinessOp(String businessOp) {
        this.businessOp = businessOp;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getRoleplayer() {
        return roleplayer;
    }

    public void setRoleplayer(String roleplayer) {
        this.roleplayer = roleplayer;
    }

    public String getRopSet() {
        return ropSet;
    }

    public void setRopSet(String ropSet) {
        this.ropSet = ropSet;
    }

    public boolean shouldCreateNew() {
        if (businessOp.equals("not set") || roleplayer.equals("not set")) {
            return false;
        }
        return true;
    }
}
