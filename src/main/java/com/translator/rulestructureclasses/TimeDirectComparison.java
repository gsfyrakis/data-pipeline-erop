package com.translator.rulestructureclasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeDirectComparison {
    private String tDirectComparisonOp;
    private Date absoluteTime;
    private String timeAsString;

    public TimeDirectComparison() {
        this.tDirectComparisonOp = "not set";
        this.absoluteTime = null;
        this.timeAsString = "not set";
    }

    public TimeDirectComparison(String op, Date absoluteTime, String timeAsString) {
        this.tDirectComparisonOp = op;
        this.absoluteTime = absoluteTime;
        this.timeAsString = timeAsString;
    }


    public String gettDirectComparisonOp() {
        return tDirectComparisonOp;
    }

    public void settDirectComparisonOp(String tDirectComparisonOp) {
        this.tDirectComparisonOp = tDirectComparisonOp;
    }

    public Date getAbsoluteTime() {
        return absoluteTime;
    }

    public void setAbsoluteTime(Date absoluteTime) {
        this.absoluteTime = absoluteTime;
    }

    public void setAbsoluteTime(String variableName) {
        String editedStr = variableName.substring(1, variableName.length() - 1);
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        try {
            absoluteTime = sf.parse(editedStr);
        } catch (ParseException e) {
            System.err.println("Parsing error for time: " + e);
        }
        setTimeAsString(sf.format(absoluteTime));
    }

    public String getTimeAsString() {
        return timeAsString;
    }

    public void setTimeAsString(String timeAsString) {
        this.timeAsString = timeAsString;
    }
}
