package com.translator.rulestructureclasses;

public class RolePlayerConstraint {
    private String issuer;
    private String operator;
    private String value;

    public RolePlayerConstraint() {
        this.issuer = "not set";
        this.operator = "not set";
        this.value = "not set";
    }

    public RolePlayerConstraint(String issuer, String operation, String value) {
        this.issuer = issuer;
        this.operator = operation;
        this.value = value;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getOperator() {
        return operator;
    }

    public String getValue() {
        return value;
    }


}
