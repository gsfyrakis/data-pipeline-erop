package com.translator.rulestructureclasses;

public class RopConstraint {

    private String governanceOp;
    private String operator;
    private String roleplayer;
    private String ropSet;

    public RopConstraint() {
        this.governanceOp = "not set";
        this.operator = "not set";
        this.roleplayer = "not set";
        this.ropSet = "not set";
    }


    public RopConstraint(String governanceOp, String operator, String roleplayer, String ropSet) {
        this.governanceOp = governanceOp;
        this.operator = operator;
        this.roleplayer = roleplayer;
        this.ropSet = ropSet;
    }

    public String getBusinessOp() {
        return governanceOp;
    }

    public void setBusinessOp(String governanceOp) {
        this.governanceOp = governanceOp;
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
        if (governanceOp.equals("not set") || roleplayer.equals("not set")) {
            return false;
        }
        return true;
    }
}
