package com.translator.rulestructureclasses;
import java.util.LinkedList;

public class Constraint {
    private LinkedList<RolePlayerConstraint> rpConstraints;
    private LinkedList<OutcomeConstraint> outcomeConstraints;
    private LinkedList<TimeDirectComparison> timeDirectComparisons;
    private LinkedList<TimePartialComparison> timePartialComarisons;
    private LinkedList<HistoricalQuery> historicalQueries;
    private LinkedList<RopConstraint> ropConstraints;

    public Constraint() {
        this.rpConstraints = new LinkedList<RolePlayerConstraint>();
        this.outcomeConstraints = new LinkedList<OutcomeConstraint>();
        this.timeDirectComparisons = new LinkedList<TimeDirectComparison>();
        this.timePartialComarisons = new LinkedList<TimePartialComparison>();
        this.historicalQueries = new LinkedList<HistoricalQuery>();
        this.ropConstraints = new LinkedList<RopConstraint>();
    }

    public Constraint(LinkedList<RolePlayerConstraint> rpConstraints, LinkedList<OutcomeConstraint> outcomeConstraint,
                      LinkedList<TimeDirectComparison> tdc, LinkedList<TimePartialComparison> tpc, LinkedList<HistoricalQuery> hq, LinkedList<RopConstraint> ropc) {
        this.rpConstraints = rpConstraints;
        this.outcomeConstraints = outcomeConstraint;
        this.timeDirectComparisons = tdc;
        this.timePartialComarisons = tpc;
        this.historicalQueries = hq;
        this.ropConstraints = ropc;
    }

    public void setRpConstraints(LinkedList<RolePlayerConstraint> rpConstraints) {
        this.rpConstraints = rpConstraints;
    }

    public LinkedList<RolePlayerConstraint> getRpConstraints() {
        return rpConstraints;
    }

    public boolean rpConstraintsEmpty() {
        return rpConstraints.isEmpty();
    }

    public LinkedList<OutcomeConstraint> getOutcomeConstraints() {
        return outcomeConstraints;
    }

    public void setOutcomeConstraints(LinkedList<OutcomeConstraint> outcomeConstraints) {
        this.outcomeConstraints = outcomeConstraints;
    }

    public boolean outcomeConstraintEmpty() {
        return outcomeConstraints.isEmpty();
    }

    public LinkedList<TimeDirectComparison> getTimeDirectComparisons() {
        return timeDirectComparisons;
    }

    public void setTimeDirectComparisons(LinkedList<TimeDirectComparison> timeDirectComparisons) {
        this.timeDirectComparisons = timeDirectComparisons;
    }

    public boolean timeDirectCompEmpty() {
        return timeDirectComparisons.isEmpty();
    }

    public LinkedList<TimePartialComparison> getTimePartialComparisons() {
        return this.timePartialComarisons;
    }

    public void setTimePartialComparisons(LinkedList<TimePartialComparison> timePartialComparisons) {
        this.timePartialComarisons = timePartialComparisons;
    }

    public boolean timePartialCompEmpty() {
        return timePartialComarisons.isEmpty();
    }

    public LinkedList<HistoricalQuery> getHistoricalQueries() {
        return historicalQueries;
    }

    public void setHistoricalQueries(LinkedList<HistoricalQuery> historicalQueries) {
        this.historicalQueries = historicalQueries;
    }

    public boolean historicalQueryEmpty() {
        return historicalQueries.isEmpty();
    }

    public LinkedList<RopConstraint> getRopConstraints() {
        return ropConstraints;
    }

    public void setRopConstraints(LinkedList<RopConstraint> ropConstraints) {
        this.ropConstraints = ropConstraints;
    }

    public boolean ropConstraintsEmpty() {
        return ropConstraints.isEmpty();
    }

    public LinkedList<RolePlayerConstraint> rpConstraintsDeepCopy() {
        LinkedList<RolePlayerConstraint> list = new LinkedList<RolePlayerConstraint>();

        for (RolePlayerConstraint rolePlayerConstraint : rpConstraints) {
            list.addLast(new RolePlayerConstraint(rolePlayerConstraint.getIssuer(), rolePlayerConstraint.getOperator(), rolePlayerConstraint.getValue()));
        }

        return list;
    }


    /*	this.timeDirectComparisons = new LinkedList<TimeDirectComparison>();
        this.timePartialComarisons = new LinkedList<TimePartialComparison>();
        this.historicalQueries = new LinkedList<HistoricalQuery>();
        this.ropConstraints = new LinkedList<RopConstraint>();
        */
    public LinkedList<OutcomeConstraint> outcomeConstraintsDeepCopy() {
        LinkedList<OutcomeConstraint> outcomeCs = new LinkedList<OutcomeConstraint>();

        for (OutcomeConstraint oc : outcomeConstraints) {
            outcomeCs.addLast(new OutcomeConstraint(oc.getOperation(), oc.getOutcome(), oc.getEvent(), oc.getValue()));
        }

        return outcomeCs;
    }

    public LinkedList<TimeDirectComparison> tdcDeepCopy() {
        LinkedList<TimeDirectComparison> list = new LinkedList<TimeDirectComparison>();

        for (TimeDirectComparison t : timeDirectComparisons) {
            list.addLast(new TimeDirectComparison(t.gettDirectComparisonOp(), t.getAbsoluteTime(), t.getTimeAsString()));
        }
        return list;
    }

    public LinkedList<TimePartialComparison> tpcDeepCopy() {
        LinkedList<TimePartialComparison> list = new LinkedList<TimePartialComparison>();

        for (TimePartialComparison t : timePartialComarisons) {
            list.addLast(new TimePartialComparison(t.getKey(), t.getOperation(), t.getValue()));
        }

        return list;
    }

    public LinkedList<HistoricalQuery> historicalQueryDeepCopy() {
        LinkedList<HistoricalQuery> list = new LinkedList<HistoricalQuery>();

        for (HistoricalQuery h : historicalQueries) {
            list.addLast(new HistoricalQuery(h.getOperation(), h.getEventType(), h.getTimeConstraint(), h.getOriginator(), h.getResponder(), h.getStatus()));
        }

        return list;
    }

    public LinkedList<RopConstraint> ropConstraintsDeepCopy() {
        LinkedList<RopConstraint> list = new LinkedList<RopConstraint>();

        for (RopConstraint r : ropConstraints) {
            list.addLast(new RopConstraint(r.getBusinessOp(), r.getOperator(), r.getRoleplayer(), r.getRopSet()));
        }
        return list;
    }
}

