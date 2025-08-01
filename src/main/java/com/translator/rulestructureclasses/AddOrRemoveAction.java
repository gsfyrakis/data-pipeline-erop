package com.translator.rulestructureclasses;

public class AddOrRemoveAction {
    private String rolePlayer;
    private String ropSet;
    private String operation;
    private String governanceOp;
    private String responder;
    private String dateTime;

    public AddOrRemoveAction() {
        this.rolePlayer = "not set";
        this.ropSet = "not set";
        this.operation = "not set";
        this.governanceOp = "not set";
        this.responder = "not set";
        this.dateTime = "not set";
    }

    public String getRolePlayer() {
        return rolePlayer;
    }

    public void setRolePlayer(String rolePlayer) {
        this.rolePlayer = rolePlayer;
    }

    public String getRopSet() {
        return ropSet;
    }

    public void setRopSet(String ropSet) {
        this.ropSet = ropSet;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getGovernanceOp() {
        return governanceOp;
    }

    public void setGovernanceOp(String governanceOp) {
        this.governanceOp = governanceOp;
    }

    public boolean shouldCreateNew() {
        return (rolePlayer.equals("not set") || governanceOp.equals("not set") || responder.equals("not set") || dateTime.equals("not set")) ? false : true;
//        return (rolePlayer.equals("not set") || governanceOp.equals("not set") ||  dateTime.equals("not set")) ? false : true;
    }

    public String getResponder() {
        return responder;
    }

    public void setResponder(String responder) {
        this.responder = responder;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
