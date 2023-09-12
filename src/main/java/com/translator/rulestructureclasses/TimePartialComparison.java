package com.translator.rulestructureclasses;

import java.util.ArrayList;
import java.util.Arrays;

public class TimePartialComparison {
    private String key;
    private String operation;
    private String value;
    private final ArrayList<String> daysOfWeek = new ArrayList<String>(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
    private final ArrayList<String> monthsOfYear = new ArrayList<String>(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));

    public TimePartialComparison() {
        this.key = "not set";
        this.operation = "not set";
        this.value = "not set";
    }

    public TimePartialComparison(String key, String operation, String value) {
        this.key = key;
        this.operation = operation;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //If value beginns with " it's a range operation
    public boolean isRangeOperation() {
        return value.charAt(0) == '[' ? true : false;
    }

    public int getLowerBound() {
        if (isRangeOperation()) {
            String searchString;
            if (key.equals("day")) {
                searchString = value.substring(1, 4);
                return daysOfWeek.indexOf(searchString) + 1;
            } else if (key.equals("month")) {
                searchString = value.substring(1, 4);
                return monthsOfYear.indexOf(searchString) + 1;
            } else if (key.equals("year")) {
                searchString = value.substring(1, 5);
                return Integer.parseInt(searchString);
            }
        }
        return -1;
    }

    public int getUpperBound() {
        if (isRangeOperation()) {
            String searchString;
            if (key.equals("day")) {
                searchString = value.substring(value.length() - 4, value.length() - 1);
                return daysOfWeek.indexOf(searchString) + 1;
            } else if (key.equals("month")) {
                searchString = value.substring(value.length() - 4, value.length() - 1);
                return monthsOfYear.indexOf(searchString) + 1;
            } else if (key.equals("year")) {
                searchString = value.substring(value.length() - 5, value.length() - 1);
                return Integer.parseInt(searchString);
            }
        }
        return -1;
    }

}
