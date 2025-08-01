package com.translator.utils;

import java.util.LinkedList;
import java.util.Objects;

import com.translator.antlr.TranslationWriter;
import com.translator.rulestructureclasses.*;

public class Translator {
    private VariablesMemory vm;
    private TranslationWriter writer;
    private XmlLookup lookup;

    public Translator() {
        this.vm = new VariablesMemory();
        this.lookup = new XmlLookup();
    }

    public Translator(VariablesMemory vm, TranslationWriter writer, XmlLookup lookup) {
        this.vm = vm;
        this.writer = writer;
        this.lookup = lookup;
    }

    public void translate() {
        includeImports();
        translateRPdeclarations();
        translateBOdeclarations();
        translateCOdeclarations();
        writer.writeNewLine();
        translateRules();
    }

    private void translateCOdeclarations() {
        for (CompositeObligation co : vm.getCompObligs()) {
            writer.writeToTranslationFile("global GovernanceOperation[] " + firstCharToLower(co.getName()) + ";");
            writer.writeNewLine();
        }
    }

    private void includeImports() {
        writer.writeToTranslationFile("package GovernanceContract");
        writer.writeNewLine();
        writer.writeToTranslationFile("import uk.ac.tees.erop.*;");
        writer.writeNewLine();
        writer.writeToTranslationFile("import  uk.ac.tees.logging.CCCLogger;");
        writer.writeNewLine();
        writer.writeNewLine();
    }

    private void translateRPdeclarations() {
        for (String s : vm.getRolePlayers()) {
            writer.writeToTranslationFile("global RolePlayer " + s + ";");
            writer.writeNewLine();
            writer.writeToTranslationFile("global ROPSet " + "rop" + firstCharToUpper(s));
            writer.writeNewLine();
        }
    }

    private void translateBOdeclarations() {
        for (String s : vm.getGovernanceOps()) {
            writer.writeToTranslationFile("global GovernanceOperation " + firstCharToLower(s) + ";");
            writer.writeNewLine();
        }
    }

    private void translateRules() {
        // Change so that if certain lists are empty no attempts to translate them are made
        for (Rule r : vm.getRules()) {
            StringBuilder sb = new StringBuilder();

            if (needToSplitRule(r)) {
                Rule rulePlusIf = new Rule(r.getName(), r.getEvent(), r.getEventMatchConditions(), mergeLhsAndIfThenConstraints(r), r.getRhs());
                translateIfThenRule(rulePlusIf, sb);
                StringBuilder sbElse = new StringBuilder();
                translateIfElseRule(r, sbElse);
            } else {
                if (isThereIf(r)) {
                    Rule rulePlusIf = new Rule(r.getName(), r.getEvent(), r.getEventMatchConditions(), mergeLhsAndIfThenConstraints(r), r.getRhs());
                    translateRuleNameAndWhen(rulePlusIf);
                    translateEventMatches(rulePlusIf.getEventMatchConditions(), rulePlusIf, sb);
                    translateRolePlayerConstraints(rulePlusIf.getConstraints().getRpConstraints(), rulePlusIf, sb);
                    translateOutcomeConstraints(rulePlusIf.getConstraints().getOutcomeConstraints(), rulePlusIf, sb);
                    translateTimeDirectComparisonConstraints(rulePlusIf.getConstraints().getTimeDirectComparisons(), rulePlusIf, sb);
                    translateTimePartialComparisons(rulePlusIf.getConstraints().getTimePartialComparisons(), rulePlusIf.getEvent());
                    translateHistoricalQueries(rulePlusIf.getConstraints().getHistoricalQueries());
                    translateRopConstraints(rulePlusIf.getConstraints().getRopConstraints());
//
                    translateThen(rulePlusIf);
//
                    translateIfRhs(rulePlusIf.getRhsIfs().getThenActionBlock());
//                    translateRuleRhs(rulePlusIf);

                    writer.writeToTranslationFile("end");
                    writer.writeNewLine();
                    writer.writeNewLine();

                } else {
                    translateRuleNameAndWhen(r);
                    translateEventMatches(r.getEventMatchConditions(), r, sb);
                    translateRolePlayerConstraints(r.getConstraints().getRpConstraints(), r, sb);
                    translateOutcomeConstraints(r.getConstraints().getOutcomeConstraints(), r, sb);
                    translateTimeDirectComparisonConstraints(r.getConstraints().getTimeDirectComparisons(), r, sb);
                    translateTimePartialComparisons(r.getConstraints().getTimePartialComparisons(), r.getEvent());
                    translateHistoricalQueries(r.getConstraints().getHistoricalQueries());
                    translateRopConstraints(r.getConstraints().getRopConstraints());

                    translateThen(r);

                    translateOutcome(r);
                    translatePassAction(r);
                    translateAddRemActionsRuleRhs(r);
                    writer.writeToTranslationFile("end");
                    writer.writeNewLine();
                    writer.writeNewLine();
                }

            }
        }
    }

    private void translateIfElseRule(Rule r, StringBuilder sb) {

        LinkedList<RolePlayerConstraint> negatedRp = negateRolePlayerConstraints(r.getRhsIfs().getConstraints().getRpConstraints());
        sb.setLength(0);
        translateRuleNameAndWhen(r, r.getName() + "IfElse");
        translateEventMatches(r.getEventMatchConditions(), r, sb);
        translateRolePlayerConstraints(r.getConstraints().getRpConstraints(), negatedRp, r, sb);
        translateOutcomeConstraints(r.getConstraints().getOutcomeConstraints(), r, sb);
        translateNegatedOutcomeConstraints(r.getRhsIfs().getConstraints().getOutcomeConstraints(), r, sb);
        translateTimeDirectComparisonConstraints(r.getConstraints().getTimeDirectComparisons(), r, sb);
        translateNegatedTimeDirectComparisonConstraints(r.getRhsIfs().getConstraints().getTimeDirectComparisons(), r, sb);
        translateTimePartialComparisons(r.getConstraints().getTimePartialComparisons(), r.getEvent());
        translateNegatedTimePartialComparisons(r.getRhsIfs().getConstraints().getTimePartialComparisons(), r.getEvent());
        translateHistoricalQueries(r.getConstraints().getHistoricalQueries());
        translateNegatedHistoricalQueries(r.getRhsIfs().getConstraints().getHistoricalQueries());
        translateRopConstraints(r.getConstraints().getRopConstraints());
        translateNegatedRopConstraints(r.getRhsIfs().getConstraints().getRopConstraints());

        translateThen(r);

        translateIfRhs(r.getRhsIfs().getElseActionBlock());
        translateRuleRhs(r);
        writer.writeToTranslationFile("end");
        writer.writeNewLine();
        writer.writeNewLine();

    }


    public LinkedList<RolePlayerConstraint> negateRolePlayerConstraints(LinkedList<RolePlayerConstraint> r) {
        LinkedList<RolePlayerConstraint> negated = new LinkedList<RolePlayerConstraint>();

        for (RolePlayerConstraint rolePlayerConstraint : r) {
            negated.add(new RolePlayerConstraint(rolePlayerConstraint.getIssuer(), negateOperation(rolePlayerConstraint.getOperator()), rolePlayerConstraint.getValue()));
        }

        return negated;
    }

    private String negateOperation(String operator) {
        if (operator.equals("==")) {
            return "!=";
        } else {
            return "==";
        }
    }

    private void translateIfRhs(RhsActionNoIfs thenActionBlock) {
        translateOutome(thenActionBlock);
        translatePassAction(thenActionBlock);
        translateAddRemActionsRuleIfThen(thenActionBlock);
        translateOutcomeManipulationsSet(thenActionBlock);
        translateResetActionIfThen(thenActionBlock);
    }

    private void translateResetActionIfThen(RhsActionNoIfs thenActionBlock) {
        if (thenActionBlock != null && !thenActionBlock.getResetActions().isEmpty()) {
            for (ResetAction reset : thenActionBlock.getResetActions()) {
                writer.writeToTranslationFile("rop" + firstCharToUpper(reset.getRopSet()) + ".reset()");
                writer.writeNewLine();
            }
        }
    }

    private void translateOutcomeManipulationsSet(RhsActionNoIfs thenActionBlock) {
        if (thenActionBlock != null && !thenActionBlock.getOutcomes().isEmpty()) {
            for (OutcomeConstraint outcomeManipulation : thenActionBlock.getOutcomes()) {
                writer.writeToTranslationFile(firstCharToLower(outcomeManipulation.getEvent()) + "." + lookup.getOutcomeSet(outcomeManipulation.getOutcome()) + " " + "(" + outcomeManipulation.getValue() + ")");
                writer.writeNewLine();
            }
        }
    }


    private void translateOutome(RhsActionNoIfs thenActionBlock) {
        if (thenActionBlock != null && thenActionBlock.isThereOutcome()) {
            writer.writeToTranslationFile(thenActionBlock.getOutcome());
            writer.writeNewLine();
        }
    }

    private void translatePassAction(RhsActionNoIfs thenActionBlock) {
        if (thenActionBlock != null && thenActionBlock.isTherePass()) {
            writer.writeToTranslationFile(thenActionBlock.getPassaction());
            writer.writeNewLine();
        }
    }

    private void translateRuleRhs(Rule rulePlusIf) {
        translateOutcome(rulePlusIf);
        translatePassAction(rulePlusIf);
        translateAddRemActionsRuleRhs(rulePlusIf);
        translateResetActions(rulePlusIf);
        translateOutcomeManipulationsSet(rulePlusIf);
    }

    private void translateResetActions(Rule rulePlusIf) {
        if (rulePlusIf.getRhs().isThereResetAction()) {
            for (ResetAction reset : rulePlusIf.getRhs().getResetActions()) {
                writer.writeToTranslationFile("rop" + firstCharToUpper(reset.getRopSet()) + ".reset()");
                writer.writeNewLine();
            }
        }
    }

    private void translateOutcomeManipulationsSet(Rule rulePlusIf) {
        if (rulePlusIf.getRhs().isThereOutcomeManipulation()) {
            for (OutcomeConstraint outcomeManipulation : rulePlusIf.getRhs().getOutcomes()) {
                writer.writeToTranslationFile(firstCharToLower(outcomeManipulation.getEvent()) + "." + lookup.getOutcomeSet(outcomeManipulation.getOutcome()) + " " + "(" + outcomeManipulation.getValue() + ")");
                writer.writeNewLine();
            }
        }
    }

    private boolean isThereIf(Rule r) {
        return r.getRhs().isThereIf();
    }

    private void translateAddRemActionsRuleRhs(Rule r) {
        if (r.getRhs().isThereAddRemAction()) {
            for (AddOrRemoveAction action : r.getRhs().getAddRemAction()) {
                if (action.getOperation().equals("+=")) {
                    if (vm.isCompositeOblig(action.getGovernanceOp())) {
                        writer.writeToTranslationFile("GovernanceOperation[] bos = {" + firstCharToLower(vm.getFirstGovOpFor(action.getGovernanceOp())) + ", " + firstCharToLower(vm.getSecondGovOpFor(action.getGovernanceOp())) + "};");
                        writer.writeNewLine();
                        writer.writeToTranslationFile("rop" + firstCharToUpper(action.getRolePlayer() + ".add" + lookup.getRopManipulationSet(action.getRopSet()) + "(" + firstCharToLower(action.getGovernanceOp()) + ", bos," + action.getResponder() + ")"));
                    } else {
                        if (!Objects.equals(action.getDateTime(), "")){
                            writer.writeToTranslationFile("rop" + firstCharToUpper(action.getRolePlayer() + ".add" + lookup.getRopManipulationSet(action.getRopSet()) + "(" + firstCharToLower(action.getGovernanceOp()) + ", " + action.getResponder() +"," + action.getDateTime() + ")"));
                        } else {
                            writer.writeToTranslationFile("rop" + firstCharToUpper(action.getRolePlayer() + ".add" + lookup.getRopManipulationSet(action.getRopSet()) + "(" + firstCharToLower(action.getGovernanceOp()) + ", " + action.getResponder() + ")"));
                        }
                    }
                } else if (action.getOperation().equals("-=")) {
                    writer.writeToTranslationFile("rop" + firstCharToUpper(action.getRolePlayer() + ".remove" + lookup.getRopManipulationSet(action.getRopSet()) + "(" + firstCharToLower(action.getGovernanceOp()) + ", " + action.getResponder() + ")"));
                }
                writer.writeNewLine();


            }
        }
    }

    private void translateAddRemActionsRuleIfThen(RhsActionNoIfs rhs) {
        if (rhs != null && rhs.isThereAddRemAction()) {
            for (AddOrRemoveAction action : rhs.getAddRemAction()) {
                if (action.getOperation().equals("+=")) {
                    if (vm.isCompositeOblig(action.getGovernanceOp())) {
                        writer.writeToTranslationFile("GovernanceOperation[] bos = {" + firstCharToLower(vm.getFirstGovOpFor(action.getGovernanceOp())) + ", " + firstCharToLower(vm.getSecondGovOpFor(action.getGovernanceOp())) + "};");
                        writer.writeNewLine();
                    }
                    if (!Objects.equals(action.getDateTime(), "")){
                        writer.writeToTranslationFile("rop" + firstCharToUpper(action.getRolePlayer() + ".add" + lookup.getRopManipulationSet(action.getRopSet()) + "(" + firstCharToLower(action.getGovernanceOp()) + ", " + action.getResponder() +"," + action.getDateTime() + ")"));
                    } else {
                        writer.writeToTranslationFile("rop" + firstCharToUpper(action.getRolePlayer() + ".add" + lookup.getRopManipulationSet(action.getRopSet()) + "(" + firstCharToLower(action.getGovernanceOp()) + ", " + action.getResponder() + ")"));
                    }                } else if (action.getOperation().equals("-=")) {
                    writer.writeToTranslationFile("rop" + firstCharToUpper(action.getRolePlayer() + ".remove" + lookup.getRopManipulationSet(action.getRopSet()) + "(" + action.getGovernanceOp() + "," + action.getResponder() + ")"));
                }
                writer.writeNewLine();
            }
        }
    }

    private void translatePassAction(Rule r) {
        if (r.getRhs().isTherePass()) {
            writer.writeToTranslationFile(r.getRhs().getPassaction());
            writer.writeNewLine();
        }
    }

    private void translateOutcome(Rule r) {
        if (r.getRhs().isThereOutcome()) {
            writer.writeToTranslationFile(r.getRhs().getOutcome());
            writer.writeNewLine();
        }
    }

    private void translateThen(Rule r) {
        writer.writeToTranslationFile("then");
        writer.writeNewLine();
    }

    private void translateRuleNameAndWhen(Rule r) {
        writer.writeToTranslationFile("rule " + "\"" + r.getName() + "\"");
        writer.writeNewLine();
        writer.writeToTranslationFile("when $" + r.getEvent() + ": Event(");
    }

    private void translateRuleNameAndWhen(Rule r, String altName) {
        writer.writeToTranslationFile("rule " + "\"" + altName + "\"");
        writer.writeNewLine();
        writer.writeToTranslationFile("when $" + r.getEvent() + ": Event(");
    }


    private void translateEventMatches(LinkedList<EventMatchCondition> c, Rule r, StringBuilder sb) {
        if (!c.isEmpty()) {
            for (EventMatchCondition eventMatchCondition : c) {
                sb.append(lookup.getEventMatchField(eventMatchCondition.getField()) + " " + eventMatchCondition.getOperation() + " " + "\"" + eventMatchCondition.getValue().toLowerCase() + "\"" + ",");
            }

            //writer.writeToTranslationFile(sb.toString().substring(0, sb.toString().length()-1));
            //writer.writeNewLine();
        }
    }

    //Translate RolePlayers Constraints
//    private void translateRolePlayerConstraints(LinkedList<RolePlayerConstraint> rpc, Rule r, StringBuilder sb) {
//        if (!rpc.isEmpty()) {
//            for (RolePlayerConstraint rolePlayerConstraint : rpc) {
//                sb.append(r.getEvent() + "." + rolePlayerConstraint.getIssuer() + " " + rolePlayerConstraint.getOperator() + " " + "\"" + rolePlayerConstraint.getValue() + "\"" + ",");
//            }
//            writer.writeToTranslationFile(sb.toString().substring(0, sb.toString().length() - 1) + ")");
//            writer.writeNewLine();
//        } else {
//            writer.writeToTranslationFile(sb.toString().substring(0, sb.toString().length() - 1) + ")");
//            writer.writeNewLine();
//        }
//    }

    //Translate RolePlayers Constraints
    private void translateRolePlayerConstraints(LinkedList<RolePlayerConstraint> rpc, Rule r, StringBuilder sb) {
        if (!rpc.isEmpty()) {
            for (RolePlayerConstraint rolePlayerConstraint : rpc) {
                sb.append(r.getEvent() + "." + rolePlayerConstraint.getIssuer() + " " + rolePlayerConstraint.getOperator() + " " + "\"" + rolePlayerConstraint.getValue() + "\"" + ",");
            }
            // Check if sb has content before removing last character
            if (sb.length() > 0) {
                writer.writeToTranslationFile(sb.toString().substring(0, sb.toString().length() - 1) + ")");
            } else {
                writer.writeToTranslationFile(")");
            }
            writer.writeNewLine();
        } else {
            // Check if sb has content before removing last character
            if (sb.length() > 0) {
                writer.writeToTranslationFile(sb.toString().substring(0, sb.toString().length() - 1) + ")");
            } else {
                writer.writeToTranslationFile(")");
            }
            writer.writeNewLine();
        }
    }
    private void translateRolePlayerConstraints(LinkedList<RolePlayerConstraint> rpConstraints, LinkedList<RolePlayerConstraint> negatedRp, Rule r, StringBuilder sb) {
        if (!rpConstraints.isEmpty()) {
            for (RolePlayerConstraint rolePlayerConstraint : rpConstraints) {
                sb.append(r.getEvent() + "." + rolePlayerConstraint.getIssuer() + " " + rolePlayerConstraint.getOperator() + " " + "\"" + rolePlayerConstraint.getValue() + "\"" + ",");
            }
            writer.writeToTranslationFile(sb.toString().substring(0, sb.toString().length() - 1) + ")");
            writer.writeNewLine();
        }
        if (!negatedRp.isEmpty()) {
            for (RolePlayerConstraint rolePlayerConstraint : negatedRp) {
                sb.append(r.getEvent() + "." + rolePlayerConstraint.getIssuer() + " " + rolePlayerConstraint.getOperator() + " " + "\"" + rolePlayerConstraint.getValue() + "\"" + ",");
            }
            writer.writeToTranslationFile(sb.toString().substring(0, sb.toString().length() - 1) + ")");
            writer.writeNewLine();
        } else {
            writer.writeToTranslationFile(sb.toString().substring(0, sb.toString().length() - 1) + ")");
            writer.writeNewLine();
        }
    }

    //Translate Outcome Constraints
    private void translateOutcomeConstraints(LinkedList<OutcomeConstraint> oc, Rule r, StringBuilder sb) {
        if (!oc.isEmpty()) {
            for (OutcomeConstraint outcomeConstraint : oc) {
                writer.writeToTranslationFile("eval(" + firstCharToLower(outcomeConstraint.getEvent()) + "." + lookup.getOutcomeGet(outcomeConstraint.getOutcome()) + " " + outcomeConstraint.getOperation() + " " + outcomeConstraint.getValue() + ")");
            }
            writer.writeNewLine();
        }
    }

    private String firstCharToLower(String str) {
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }

    //Translate Negated Outcome Constraints
    private void translateNegatedOutcomeConstraints(LinkedList<OutcomeConstraint> oc, Rule r, StringBuilder sb) {
        if (!oc.isEmpty()) {
            for (OutcomeConstraint outcomeConstraint : oc) {
                writer.writeToTranslationFile("eval((" + firstCharToLower(outcomeConstraint.getEvent()) + "." + lookup.getOutcomeGet(outcomeConstraint.getOutcome()) + " " + outcomeConstraint.getOperation() + " " + outcomeConstraint.getValue() + ") == false)");
            }
            writer.writeNewLine();
        }
    }

    //Translate Time Direct Constraints
    private void translateTimeDirectComparisonConstraints(LinkedList<TimeDirectComparison> tdc, Rule r, StringBuilder sb) {
        if (!tdc.isEmpty()) {
            //Absolute Time Constraints
            for (TimeDirectComparison directTime : tdc) {
                writer.writeToTranslationFile("eval(" + r.getEvent() + "." + directTime.gettDirectComparisonOp() + "(" + "\"" + directTime.getTimeAsString() + "\"" + "))");
            }
            writer.writeNewLine();
        }
    }

    //Translate NegatedTime Direct Constraints
    private void translateNegatedTimeDirectComparisonConstraints(LinkedList<TimeDirectComparison> tdc, Rule r, StringBuilder sb) {
        if (!tdc.isEmpty()) {
            //Absolute Time Constraints
            for (TimeDirectComparison directTime : tdc) {
                writer.writeToTranslationFile("eval(!" + r.getEvent() + "." + directTime.gettDirectComparisonOp() + "(" + "\"" + directTime.getTimeAsString() + "\"" + "))");
            }
            writer.writeNewLine();
        }
    }

    private void translateTimePartialComparisons(LinkedList<TimePartialComparison> tpcp, String event) {
        if (!tpcp.isEmpty()) {
            for (TimePartialComparison tpc : tpcp) {
                if (tpc.isRangeOperation()) {
                    if (tpc.getOperation().equals("in")) {
                        writer.writeToTranslationFile("eval(" + event + "." + lookup.getTimePartialKey(tpc.getKey()) + " >= " + tpc.getLowerBound() + " && e." + lookup.getTimePartialKey(tpc.getKey()) + " <= " + tpc.getUpperBound() + ")");
                    } else if (tpc.getOperation().equals("!in")) {
                        writer.writeToTranslationFile("eval(" + event + "." + lookup.getTimePartialKey(tpc.getKey()) + " <= " + tpc.getLowerBound() + " && e." + lookup.getTimePartialKey(tpc.getKey()) + " >= " + tpc.getUpperBound() + ")");
                    }
                } else {
                    writer.writeToTranslationFile("eval(" + event + "." + lookup.getTimePartialKey(tpc.getKey()) + " " + tpc.getOperation() + " " + tpc.getValue() + ")");
                }
                writer.writeNewLine();
            }
        }
    }

    // Negated time partial comparisons
    private void translateNegatedTimePartialComparisons(LinkedList<TimePartialComparison> tpcp, String event) {
        if (!tpcp.isEmpty()) {
            for (TimePartialComparison tpc : tpcp) {
                if (tpc.isRangeOperation()) {
                    if (tpc.getOperation().equals("in")) {
                        writer.writeToTranslationFile("eval(!" + event + "." + lookup.getTimePartialKey(tpc.getKey()) + " >= " + tpc.getLowerBound() + " && e." + lookup.getTimePartialKey(tpc.getKey()) + " <= " + tpc.getUpperBound() + ")");
                    } else if (tpc.getOperation().equals("!in")) {
                        writer.writeToTranslationFile("eval(!" + event + "." + lookup.getTimePartialKey(tpc.getKey()) + " <= " + tpc.getLowerBound() + " && e." + lookup.getTimePartialKey(tpc.getKey()) + " >= " + tpc.getUpperBound() + ")");
                    }
                } else {
                    writer.writeToTranslationFile("eval(!" + event + "." + lookup.getTimePartialKey(tpc.getKey()) + " " + tpc.getOperation() + " " + tpc.getValue() + ")");
                }
                writer.writeNewLine();
            }
        }
    }

    //Translate Historical Queries
    private void translateHistoricalQueries(LinkedList<HistoricalQuery> queries) {
        if (!queries.isEmpty()) {
            for (HistoricalQuery query : queries) {
                writer.writeToTranslationFile("eval(eventLogger." + query.getOperation() + "(" + query.getEventType() + ", " + query.getTimeConstraint() + ", " + query.getOriginator() + ", " + query.getResponder() + ", " + query.getStatus() + "))");
                writer.writeNewLine();
            }
        }
    }

    //Translate Negated Historical Queries
    private void translateNegatedHistoricalQueries(LinkedList<HistoricalQuery> queries) {
        if (!queries.isEmpty()) {
            for (HistoricalQuery query : queries) {
                writer.writeToTranslationFile("eval(!eventLogger." + query.getOperation() + "(" + query.getEventType() + ", " + query.getTimeConstraint() + ", " + query.getOriginator() + ", " + query.getResponder() + ", " + query.getStatus() + "))");
                writer.writeNewLine();
            }
        }
    }

    // Translate Rop Constraints
    private void translateRopConstraints(LinkedList<RopConstraint> ropConstraints) {
        if (!ropConstraints.isEmpty()) {
            for (RopConstraint ropConstraint : ropConstraints) {
                if (ropConstraint.getOperator().equals("in")) {
                    writer.writeToTranslationFile("eval(rop" + firstCharToUpper(ropConstraint.getRoleplayer()) + ".matches" + firstCharToUpper(ropConstraint.getRopSet() + "(" + firstCharToLower(ropConstraint.getBusinessOp()) + "))"));
                } else if (ropConstraint.getOperator().equals("!in")) {
                    writer.writeToTranslationFile("Augmented Drools doesn't support not in for Rop constraints");
                }
                writer.writeNewLine();
            }
        }
    }

    // Translate Negated Rop Constraints
    private void translateNegatedRopConstraints(LinkedList<RopConstraint> ropConstraints) {
        if (!ropConstraints.isEmpty()) {
            for (RopConstraint ropConstraint : ropConstraints) {
                if (ropConstraint.getOperator().equals("in")) {
                    writer.writeToTranslationFile("eval(!rop" + firstCharToUpper(ropConstraint.getRoleplayer()) + ".matches" + firstCharToUpper(ropConstraint.getRopSet() + "(" + ropConstraint.getBusinessOp() + "))"));
                } else if (ropConstraint.getOperator().equals("!in")) {
                    writer.writeToTranslationFile("Augmented Drools doesn't support not in for Rop constraints");
                }
                writer.writeNewLine();
            }
        }
    }

    private boolean needToSplitRule(Rule r) {
        if (r.getRhs().isThereIf()) {
            if (r.getRhs().getIfs().isThereElse()) {
                if (!r.getRhs().getIfs().getElseActionBlock().getAddRemAction().isEmpty() || r.getRhs().getIfs().getElseActionBlock().getOutcome() != null || r.getRhs().getIfs().getElseActionBlock().getPassaction() != null || !r.getRhs().getIfs().getElseActionBlock().getOutcomes().isEmpty() || !r.getRhs().getIfs().getElseActionBlock().getResetActions().isEmpty())
                    return true;
            }
        }
        return false;

    }

    private String firstCharToUpper(String string) {
        return Character.toUpperCase(string.charAt(0)) + string.substring(1);
    }

    private Constraint mergeLhsAndIfThenConstraints(Rule r) {
        Constraint lhsConstraints = new Constraint(r.getConstraints().rpConstraintsDeepCopy(), r.getConstraints().outcomeConstraintsDeepCopy(), r.getConstraints().tdcDeepCopy(), r.getConstraints().tpcDeepCopy(), r.getConstraints().historicalQueryDeepCopy(), r.getConstraints().ropConstraintsDeepCopy());

        //Constraint lhsConstraints = r.getConstraints();
        Constraint rhsConstraints = r.getRhsIfs().getConstraints();

        lhsConstraints = getLhsPlusRhsConstraints(lhsConstraints, rhsConstraints, r);

        //r.setConstraints(lhsConstraints);

        return lhsConstraints;
    }


    // Lhs of rules containing if consists of lhs constraints of rule + constraints of if
    private Constraint getLhsPlusRhsConstraints(Constraint lhsConstraints, Constraint rhsConstraints, Rule r) {

        if (!rhsConstraints.getRopConstraints().isEmpty()) {
            for (RolePlayerConstraint ropConstraint : rhsConstraints.getRpConstraints()) {
                lhsConstraints.getRopConstraints().addLast(new RopConstraint(r.getEvent(), ropConstraint.getIssuer(), ropConstraint.getOperator(), ropConstraint.getValue()));
            }
        }

        if (!rhsConstraints.getOutcomeConstraints().isEmpty()) {
            for (OutcomeConstraint oc : rhsConstraints.getOutcomeConstraints()) {
                lhsConstraints.getOutcomeConstraints().addLast(new OutcomeConstraint(oc.getOperation(), oc.getOutcome(), oc.getEvent(), oc.getValue()));
            }
        }

        if (!rhsConstraints.getTimeDirectComparisons().isEmpty()) {
            for (TimeDirectComparison tdc : rhsConstraints.getTimeDirectComparisons()) {
                lhsConstraints.getTimeDirectComparisons().addLast(new TimeDirectComparison(tdc.gettDirectComparisonOp(), tdc.getAbsoluteTime(), tdc.getTimeAsString()));
            }
        }

        if (!rhsConstraints.getTimePartialComparisons().isEmpty()) {
            for (TimePartialComparison tpc : rhsConstraints.getTimePartialComparisons()) {
                lhsConstraints.getTimePartialComparisons().addLast(new TimePartialComparison(tpc.getKey(), tpc.getOperation(), tpc.getValue()));
            }
        }

        if (!rhsConstraints.getHistoricalQueries().isEmpty()) {
            for (HistoricalQuery hq : rhsConstraints.getHistoricalQueries()) {
                lhsConstraints.getHistoricalQueries().addLast(new HistoricalQuery(hq.getOperation(), hq.getEventType(), hq.getTimeConstraint(), hq.getOriginator(), hq.getResponder(), hq.getStatus()));
            }
        }

        if (!rhsConstraints.getRopConstraints().isEmpty()) {
            for (RopConstraint rop : rhsConstraints.getRopConstraints()) {
                lhsConstraints.getRopConstraints().addLast(new RopConstraint(rop.getBusinessOp(), rop.getOperator(), rop.getRoleplayer(), rop.getRopSet()));
            }
        }

        return lhsConstraints;
    }


    private void translateIfThenRule(Rule rulePlusIf, StringBuilder sb) {
        translateRuleNameAndWhen(rulePlusIf, rulePlusIf.getName() + "IfThen");
        translateEventMatches(rulePlusIf.getEventMatchConditions(), rulePlusIf, sb);
        translateRolePlayerConstraints(rulePlusIf.getConstraints().getRpConstraints(), rulePlusIf, sb);
        translateOutcomeConstraints(rulePlusIf.getConstraints().getOutcomeConstraints(), rulePlusIf, sb);
        translateTimeDirectComparisonConstraints(rulePlusIf.getConstraints().getTimeDirectComparisons(), rulePlusIf, sb);
        translateTimePartialComparisons(rulePlusIf.getConstraints().getTimePartialComparisons(), rulePlusIf.getEvent());
        translateHistoricalQueries(rulePlusIf.getConstraints().getHistoricalQueries());
        translateRopConstraints(rulePlusIf.getConstraints().getRopConstraints());

        translateThen(rulePlusIf);

        translateIfRhs(rulePlusIf.getRhsIfs().getThenActionBlock());
        translateRuleRhs(rulePlusIf);

        writer.writeToTranslationFile("end");
        writer.writeNewLine();
        writer.writeNewLine();
    }


}
