package com.translator.rulestructureclasses;

public class AddOrRemoveAction {
    private String rolePlayer;
    private String ropSet;
    private String operatior;
    private String businessOp;
    private String responder;

    public AddOrRemoveAction() {
        this.rolePlayer = "not set";
        this.ropSet = "not set";
        this.operatior = "not set";
        this.businessOp = "not set";
        this.responder = "not set";
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

    public String getOperatior() {
        return operatior;
    }

    public void setOperatior(String operatior) {
        this.operatior = operatior;
    }

    public String getBusinessOp() {
        return businessOp;
    }

    public void setBusinessOp(String businessOp) {
        this.businessOp = businessOp;
    }

    public boolean shouldCreateNew() {
        return (rolePlayer.equals("not set") || businessOp.equals("not set") || responder.equals("not set")) ? false : true;
    }

    public String getResponder() {
        return responder;
    }

    public void setResponder(String responder) {
        this.responder = responder;
    }
}
