// Generated from Eropcp.g4 by ANTLR 4.4
package com.translator.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EropcpParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            ROLEPLAYER = 1, BUSINESSOP = 2, COMPOBLIG = 3, RULE = 4, END = 5, WHEN = 6, THEN = 7,
            MATCHES = 8, HAPPENED = 9, CTHAPPENED = 10, BEFORE = 11, AFTER = 12, BOTYPE = 13,
            ORIGINATOR = 14, RESPONDER = 15, OUTCOME = 16, TIMESTAMP = 17, DAY = 18, DATE = 19,
            SECOND = 20, MINUTE = 21, HOUR = 22, MONTH = 23, YEAR = 24, IN = 25, NOTIN = 26, EQUALS = 27,
            NOTEQ = 28, AND = 29, OR = 30, NOT = 31, WEEKDAY = 32, MONTHID = 33, SUCCESS = 34, TECFAIL = 35,
            BIZFAIL = 36, INITFAIL = 37, BOOLEANTRUE = 38, BOOLEANFALSE = 39, ADDROP = 40, REMROP = 41,
            TERMINATE = 42, PASS = 43, RESET = 44, OBLIGS = 45, RIGHTS = 46, PROHIBS = 47, IF = 48,
            ELSE = 49, ENDIF = 50, OTHERWISE = 51, LOWER = 52, UPPER = 53, DIGIT = 54, SEMICOLON = 55,
            COLON = 56, HASH = 57, BRA = 58, KET = 59, COMMA = 60, QUOTE = 61, DQUOTE = 62, SQUAREBRA = 63,
            SQUAREKET = 64, DOT = 65, DASH = 66, BACKSLASH = 67, WS = 68;
    public static final String[] tokenNames = {
            "<INVALID>", "'roleplayer'", "'businessoperation'", "'compoblig'", "'rule'",
            "'end'", "'when'", "'then'", "'matches'", "'happened'", "'counthappened'",
            "'before'", "'after'", "'botype'", "'originator'", "'responder'", "'outcome'",
            "'timestamp'", "'day'", "'date'", "'second'", "'minute'", "'hour'", "'month'",
            "'year'", "'in'", "'!in'", "'=='", "'!='", "'&&'", "'||'", "'!'", "WEEKDAY",
            "MONTHID", "'Success'", "'TecFail'", "'BizFail'", "'InitFail'", "'true'",
            "'false'", "'+='", "'-='", "'terminate'", "'pass'", "'reset'", "'obligs'",
            "'rights'", "'prohibs'", "'if'", "'else'", "'endif'", "'Otherwise'", "LOWER",
            "UPPER", "DIGIT", "';'", "':'", "'#'", "'('", "')'", "','", "'''", "'\"'",
            "'['", "']'", "'.'", "'-'", "'\\'", "WS"
    };
    public static final int
            RULE_contractDocument = 0, RULE_declarationSection = 1, RULE_declaration = 2,
            RULE_compobligDeclaration = 3, RULE_businessOpDeclaration = 4, RULE_roleplayerDeclaration = 5,
            RULE_ruleSet = 6, RULE_singlerule = 7, RULE_rulename = 8, RULE_lhs = 9,
            RULE_eventmatch = 10, RULE_eventMcond = 11, RULE_rolePlayerConstraintIssuer = 12,
            RULE_field = 13, RULE_oper = 14, RULE_timeOperators = 15, RULE_rangeOperators = 16,
            RULE_andOR = 17, RULE_bool = 18, RULE_constraint = 19, RULE_attributeConstraint = 20,
            RULE_roleplayerConstraint = 21, RULE_outcomeConstraint = 22, RULE_timeConstraint = 23,
            RULE_timeDirectComparison = 24, RULE_timePartialComparison = 25, RULE_dayKey = 26,
            RULE_dayOfWeek = 27, RULE_dateKey = 28, RULE_dateIdent = 29, RULE_monthKey = 30,
            RULE_monthIdent = 31, RULE_yearKey = 32, RULE_yearIdent = 33, RULE_dayRange = 34,
            RULE_dateRange = 35, RULE_monthRange = 36, RULE_yearRange = 37, RULE_historicalQueryOp = 38,
            RULE_historicalQuery = 39, RULE_ropConstraint = 40, RULE_rhs = 41, RULE_rhsActionNoIfs = 42,
            RULE_rhsaction = 43, RULE_ifThen = 44, RULE_ifElse = 45, RULE_ifstatement = 46,
            RULE_condition = 47, RULE_resetaction = 48, RULE_termaction = 49, RULE_passaction = 50,
            RULE_addRemRopOperator = 51, RULE_addRemAction = 52, RULE_outcome = 53,
            RULE_ropset = 54, RULE_timeSpec = 55, RULE_absoluteTime = 56, RULE_upalphanum = 57,
            RULE_alphanum = 58, RULE_roleplayeridentifyer = 59, RULE_bopIdentifier = 60,
            RULE_genericString = 61;
    public static final String[] ruleNames = {
            "contractDocument", "declarationSection", "declaration", "compobligDeclaration",
            "businessOpDeclaration", "roleplayerDeclaration", "ruleSet", "singlerule",
            "rulename", "lhs", "eventmatch", "eventMcond", "rolePlayerConstraintIssuer",
            "field", "oper", "timeOperators", "rangeOperators", "andOR", "bool", "constraint",
            "attributeConstraint", "roleplayerConstraint", "outcomeConstraint", "timeConstraint",
            "timeDirectComparison", "timePartialComparison", "dayKey", "dayOfWeek",
            "dateKey", "dateIdent", "monthKey", "monthIdent", "yearKey", "yearIdent",
            "dayRange", "dateRange", "monthRange", "yearRange", "historicalQueryOp",
            "historicalQuery", "ropConstraint", "rhs", "rhsActionNoIfs", "rhsaction",
            "ifThen", "ifElse", "ifstatement", "condition", "resetaction", "termaction",
            "passaction", "addRemRopOperator", "addRemAction", "outcome", "ropset",
            "timeSpec", "absoluteTime", "upalphanum", "alphanum", "roleplayeridentifyer",
            "bopIdentifier", "genericString"
    };

    @Override
    public String getGrammarFileName() {
        return "Eropcp.g4";
    }

    @Override
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public EropcpParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ContractDocumentContext extends ParserRuleContext {
        public RuleSetContext ruleSet() {
            return getRuleContext(RuleSetContext.class, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public DeclarationSectionContext declarationSection() {
            return getRuleContext(DeclarationSectionContext.class, 0);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public ContractDocumentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_contractDocument;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterContractDocument(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitContractDocument(this);
        }
    }

    public final ContractDocumentContext contractDocument() throws RecognitionException {
        ContractDocumentContext _localctx = new ContractDocumentContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_contractDocument);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(125);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(124);
                        match(WS);
                    }
                }

                setState(127);
                declarationSection();
                setState(129);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(128);
                        match(WS);
                    }
                }

                setState(131);
                ruleSet();
                setState(133);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(132);
                        match(WS);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DeclarationSectionContext extends ParserRuleContext {
        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public List<DeclarationContext> declaration() {
            return getRuleContexts(DeclarationContext.class);
        }

        public DeclarationContext declaration(int i) {
            return getRuleContext(DeclarationContext.class, i);
        }

        public DeclarationSectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declarationSection;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterDeclarationSection(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitDeclarationSection(this);
        }
    }

    public final DeclarationSectionContext declarationSection() throws RecognitionException {
        DeclarationSectionContext _localctx = new DeclarationSectionContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_declarationSection);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(135);
                declaration();
                setState(140);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(136);
                                match(WS);
                                setState(137);
                                declaration();
                            }
                        }
                    }
                    setState(142);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DeclarationContext extends ParserRuleContext {
        public CompobligDeclarationContext compobligDeclaration() {
            return getRuleContext(CompobligDeclarationContext.class, 0);
        }

        public RoleplayerDeclarationContext roleplayerDeclaration() {
            return getRuleContext(RoleplayerDeclarationContext.class, 0);
        }

        public BusinessOpDeclarationContext businessOpDeclaration() {
            return getRuleContext(BusinessOpDeclarationContext.class, 0);
        }

        public DeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitDeclaration(this);
        }
    }

    public final DeclarationContext declaration() throws RecognitionException {
        DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_declaration);
        try {
            setState(146);
            switch (_input.LA(1)) {
                case BUSINESSOP:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(143);
                    businessOpDeclaration();
                }
                break;
                case ROLEPLAYER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(144);
                    roleplayerDeclaration();
                }
                break;
                case COMPOBLIG:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(145);
                    compobligDeclaration();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CompobligDeclarationContext extends ParserRuleContext {
        public TerminalNode KET() {
            return getToken(EropcpParser.KET, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(EropcpParser.SEMICOLON, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public UpalphanumContext upalphanum(int i) {
            return getRuleContext(UpalphanumContext.class, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public TerminalNode COMPOBLIG() {
            return getToken(EropcpParser.COMPOBLIG, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(EropcpParser.COMMA);
        }

        public List<UpalphanumContext> upalphanum() {
            return getRuleContexts(UpalphanumContext.class);
        }

        public TerminalNode BRA() {
            return getToken(EropcpParser.BRA, 0);
        }

        public TerminalNode COMMA(int i) {
            return getToken(EropcpParser.COMMA, i);
        }

        public CompobligDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_compobligDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterCompobligDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitCompobligDeclaration(this);
        }
    }

    public final CompobligDeclarationContext compobligDeclaration() throws RecognitionException {
        CompobligDeclarationContext _localctx = new CompobligDeclarationContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_compobligDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(148);
                match(COMPOBLIG);
                setState(149);
                match(WS);
                setState(150);
                upalphanum();
                setState(151);
                match(BRA);
                setState(152);
                upalphanum();
                setState(158);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(153);
                            match(COMMA);
                            setState(155);
                            _la = _input.LA(1);
                            if (_la == WS) {
                                {
                                    setState(154);
                                    match(WS);
                                }
                            }

                            setState(157);
                            upalphanum();
                        }
                    }
                    setState(160);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == COMMA);
                setState(162);
                match(KET);
                setState(163);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BusinessOpDeclarationContext extends ParserRuleContext {
        public TerminalNode SEMICOLON() {
            return getToken(EropcpParser.SEMICOLON, 0);
        }

        public UpalphanumContext upalphanum(int i) {
            return getRuleContext(UpalphanumContext.class, i);
        }

        public TerminalNode WS() {
            return getToken(EropcpParser.WS, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(EropcpParser.COMMA);
        }

        public List<UpalphanumContext> upalphanum() {
            return getRuleContexts(UpalphanumContext.class);
        }

        public TerminalNode BUSINESSOP() {
            return getToken(EropcpParser.BUSINESSOP, 0);
        }

        public TerminalNode COMMA(int i) {
            return getToken(EropcpParser.COMMA, i);
        }

        public BusinessOpDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_businessOpDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterBusinessOpDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitBusinessOpDeclaration(this);
        }
    }

    public final BusinessOpDeclarationContext businessOpDeclaration() throws RecognitionException {
        BusinessOpDeclarationContext _localctx = new BusinessOpDeclarationContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_businessOpDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(165);
                match(BUSINESSOP);
                setState(166);
                match(WS);
                setState(167);
                upalphanum();
                setState(172);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(168);
                            match(COMMA);
                            setState(169);
                            upalphanum();
                        }
                    }
                    setState(174);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(175);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RoleplayerDeclarationContext extends ParserRuleContext {
        public TerminalNode ROLEPLAYER() {
            return getToken(EropcpParser.ROLEPLAYER, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(EropcpParser.SEMICOLON, 0);
        }

        public List<AlphanumContext> alphanum() {
            return getRuleContexts(AlphanumContext.class);
        }

        public TerminalNode WS() {
            return getToken(EropcpParser.WS, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(EropcpParser.COMMA);
        }

        public AlphanumContext alphanum(int i) {
            return getRuleContext(AlphanumContext.class, i);
        }

        public TerminalNode COMMA(int i) {
            return getToken(EropcpParser.COMMA, i);
        }

        public RoleplayerDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_roleplayerDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterRoleplayerDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitRoleplayerDeclaration(this);
        }
    }

    public final RoleplayerDeclarationContext roleplayerDeclaration() throws RecognitionException {
        RoleplayerDeclarationContext _localctx = new RoleplayerDeclarationContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_roleplayerDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(177);
                match(ROLEPLAYER);
                setState(178);
                match(WS);
                setState(179);
                alphanum();
                setState(184);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(180);
                            match(COMMA);
                            setState(181);
                            alphanum();
                        }
                    }
                    setState(186);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(187);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RuleSetContext extends ParserRuleContext {
        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public SingleruleContext singlerule(int i) {
            return getRuleContext(SingleruleContext.class, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public List<SingleruleContext> singlerule() {
            return getRuleContexts(SingleruleContext.class);
        }

        public RuleSetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ruleSet;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterRuleSet(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitRuleSet(this);
        }
    }

    public final RuleSetContext ruleSet() throws RecognitionException {
        RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_ruleSet);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(189);
                singlerule();
                setState(194);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(190);
                                match(WS);
                                setState(191);
                                singlerule();
                            }
                        }
                    }
                    setState(196);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SingleruleContext extends ParserRuleContext {
        public TerminalNode RULE() {
            return getToken(EropcpParser.RULE, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public RulenameContext rulename() {
            return getRuleContext(RulenameContext.class, 0);
        }

        public TerminalNode THEN() {
            return getToken(EropcpParser.THEN, 0);
        }

        public TerminalNode WHEN() {
            return getToken(EropcpParser.WHEN, 0);
        }

        public RhsContext rhs() {
            return getRuleContext(RhsContext.class, 0);
        }

        public TerminalNode END() {
            return getToken(EropcpParser.END, 0);
        }

        public LhsContext lhs() {
            return getRuleContext(LhsContext.class, 0);
        }

        public SingleruleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_singlerule;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterSinglerule(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitSinglerule(this);
        }
    }

    public final SingleruleContext singlerule() throws RecognitionException {
        SingleruleContext _localctx = new SingleruleContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_singlerule);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(197);
                match(RULE);
                setState(198);
                match(WS);
                setState(199);
                rulename();
                setState(200);
                match(WS);
                setState(201);
                match(WHEN);
                setState(202);
                match(WS);
                setState(203);
                lhs();
                setState(204);
                match(WS);
                setState(205);
                match(THEN);
                setState(206);
                match(WS);
                setState(207);
                rhs();
                setState(208);
                match(WS);
                setState(209);
                match(END);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RulenameContext extends ParserRuleContext {
        public UpalphanumContext upalphanum() {
            return getRuleContext(UpalphanumContext.class, 0);
        }

        public RulenameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rulename;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterRulename(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitRulename(this);
        }
    }

    public final RulenameContext rulename() throws RecognitionException {
        RulenameContext _localctx = new RulenameContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_rulename);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(211);
                match(DQUOTE);
                setState(212);
                upalphanum();
                setState(213);
                match(DQUOTE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LhsContext extends ParserRuleContext {
        public EventmatchContext eventmatch() {
            return getRuleContext(EventmatchContext.class, 0);
        }

        public TerminalNode KET() {
            return getToken(EropcpParser.KET, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public List<ConstraintContext> constraint() {
            return getRuleContexts(ConstraintContext.class);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(EropcpParser.COMMA);
        }

        public List<EventMcondContext> eventMcond() {
            return getRuleContexts(EventMcondContext.class);
        }

        public EventMcondContext eventMcond(int i) {
            return getRuleContext(EventMcondContext.class, i);
        }

        public TerminalNode BRA() {
            return getToken(EropcpParser.BRA, 0);
        }

        public TerminalNode COMMA(int i) {
            return getToken(EropcpParser.COMMA, i);
        }

        public ConstraintContext constraint(int i) {
            return getRuleContext(ConstraintContext.class, i);
        }

        public LhsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lhs;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterLhs(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitLhs(this);
        }
    }

    public final LhsContext lhs() throws RecognitionException {
        LhsContext _localctx = new LhsContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_lhs);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(215);
                eventmatch();
                setState(216);
                match(WS);
                setState(217);
                match(BRA);
                setState(224);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOTYPE) | (1L << ORIGINATOR) | (1L << RESPONDER) | (1L << OUTCOME) | (1L << TIMESTAMP))) != 0)) {
                    {
                        {
                            setState(218);
                            eventMcond();
                            setState(220);
                            _la = _input.LA(1);
                            if (_la == COMMA) {
                                {
                                    setState(219);
                                    match(COMMA);
                                }
                            }

                        }
                    }
                    setState(226);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(227);
                match(KET);
                setState(232);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(228);
                                match(WS);
                                setState(229);
                                constraint();
                            }
                        }
                    }
                    setState(234);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EventmatchContext extends ParserRuleContext {
        public AlphanumContext alphanum() {
            return getRuleContext(AlphanumContext.class, 0);
        }

        public TerminalNode MATCHES() {
            return getToken(EropcpParser.MATCHES, 0);
        }

        public TerminalNode WS() {
            return getToken(EropcpParser.WS, 0);
        }

        public EventmatchContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_eventmatch;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterEventmatch(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitEventmatch(this);
        }
    }

    public final EventmatchContext eventmatch() throws RecognitionException {
        EventmatchContext _localctx = new EventmatchContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_eventmatch);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(235);
                alphanum();
                setState(236);
                match(WS);
                setState(237);
                match(MATCHES);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EventMcondContext extends ParserRuleContext {
        public OperContext oper() {
            return getRuleContext(OperContext.class, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public AlphanumContext alphanum() {
            return getRuleContext(AlphanumContext.class, 0);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public UpalphanumContext upalphanum() {
            return getRuleContext(UpalphanumContext.class, 0);
        }

        public FieldContext field() {
            return getRuleContext(FieldContext.class, 0);
        }

        public EventMcondContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_eventMcond;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterEventMcond(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitEventMcond(this);
        }
    }

    public final EventMcondContext eventMcond() throws RecognitionException {
        EventMcondContext _localctx = new EventMcondContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_eventMcond);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(239);
                field();
                setState(241);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(240);
                        match(WS);
                    }
                }

                setState(243);
                oper();
                setState(245);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(244);
                        match(WS);
                    }
                }

                setState(249);
                switch (_input.LA(1)) {
                    case LOWER: {
                        setState(247);
                        alphanum();
                    }
                    break;
                    case UPPER: {
                        setState(248);
                        upalphanum();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RolePlayerConstraintIssuerContext extends ParserRuleContext {
        public TerminalNode ORIGINATOR() {
            return getToken(EropcpParser.ORIGINATOR, 0);
        }

        public TerminalNode RESPONDER() {
            return getToken(EropcpParser.RESPONDER, 0);
        }

        public RolePlayerConstraintIssuerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rolePlayerConstraintIssuer;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterRolePlayerConstraintIssuer(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitRolePlayerConstraintIssuer(this);
        }
    }

    public final RolePlayerConstraintIssuerContext rolePlayerConstraintIssuer() throws RecognitionException {
        RolePlayerConstraintIssuerContext _localctx = new RolePlayerConstraintIssuerContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_rolePlayerConstraintIssuer);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(251);
                _la = _input.LA(1);
                if (!(_la == ORIGINATOR || _la == RESPONDER)) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FieldContext extends ParserRuleContext {
        public TerminalNode OUTCOME() {
            return getToken(EropcpParser.OUTCOME, 0);
        }

        public TerminalNode TIMESTAMP() {
            return getToken(EropcpParser.TIMESTAMP, 0);
        }

        public TerminalNode BOTYPE() {
            return getToken(EropcpParser.BOTYPE, 0);
        }

        public TerminalNode ORIGINATOR() {
            return getToken(EropcpParser.ORIGINATOR, 0);
        }

        public TerminalNode RESPONDER() {
            return getToken(EropcpParser.RESPONDER, 0);
        }

        public FieldContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_field;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterField(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitField(this);
        }
    }

    public final FieldContext field() throws RecognitionException {
        FieldContext _localctx = new FieldContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_field);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(253);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOTYPE) | (1L << ORIGINATOR) | (1L << RESPONDER) | (1L << OUTCOME) | (1L << TIMESTAMP))) != 0))) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OperContext extends ParserRuleContext {
        public TerminalNode EQUALS() {
            return getToken(EropcpParser.EQUALS, 0);
        }

        public TerminalNode NOTEQ() {
            return getToken(EropcpParser.NOTEQ, 0);
        }

        public OperContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oper;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterOper(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitOper(this);
        }
    }

    public final OperContext oper() throws RecognitionException {
        OperContext _localctx = new OperContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_oper);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(255);
                _la = _input.LA(1);
                if (!(_la == EQUALS || _la == NOTEQ)) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TimeOperatorsContext extends ParserRuleContext {
        public TerminalNode EQUALS() {
            return getToken(EropcpParser.EQUALS, 0);
        }

        public TerminalNode BEFORE() {
            return getToken(EropcpParser.BEFORE, 0);
        }

        public TerminalNode NOTEQ() {
            return getToken(EropcpParser.NOTEQ, 0);
        }

        public TerminalNode AFTER() {
            return getToken(EropcpParser.AFTER, 0);
        }

        public TimeOperatorsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_timeOperators;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterTimeOperators(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitTimeOperators(this);
        }
    }

    public final TimeOperatorsContext timeOperators() throws RecognitionException {
        TimeOperatorsContext _localctx = new TimeOperatorsContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_timeOperators);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(257);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEFORE) | (1L << AFTER) | (1L << EQUALS) | (1L << NOTEQ))) != 0))) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RangeOperatorsContext extends ParserRuleContext {
        public TerminalNode NOTIN() {
            return getToken(EropcpParser.NOTIN, 0);
        }

        public TerminalNode IN() {
            return getToken(EropcpParser.IN, 0);
        }

        public RangeOperatorsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rangeOperators;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterRangeOperators(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitRangeOperators(this);
        }
    }

    public final RangeOperatorsContext rangeOperators() throws RecognitionException {
        RangeOperatorsContext _localctx = new RangeOperatorsContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_rangeOperators);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(259);
                _la = _input.LA(1);
                if (!(_la == IN || _la == NOTIN)) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AndORContext extends ParserRuleContext {
        public TerminalNode AND() {
            return getToken(EropcpParser.AND, 0);
        }

        public TerminalNode OR() {
            return getToken(EropcpParser.OR, 0);
        }

        public AndORContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_andOR;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterAndOR(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitAndOR(this);
        }
    }

    public final AndORContext andOR() throws RecognitionException {
        AndORContext _localctx = new AndORContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_andOR);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(261);
                _la = _input.LA(1);
                if (!(_la == AND || _la == OR)) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BoolContext extends ParserRuleContext {
        public TerminalNode BOOLEANTRUE() {
            return getToken(EropcpParser.BOOLEANTRUE, 0);
        }

        public TerminalNode BOOLEANFALSE() {
            return getToken(EropcpParser.BOOLEANFALSE, 0);
        }

        public BoolContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bool;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterBool(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitBool(this);
        }
    }

    public final BoolContext bool() throws RecognitionException {
        BoolContext _localctx = new BoolContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_bool);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(263);
                _la = _input.LA(1);
                if (!(_la == BOOLEANTRUE || _la == BOOLEANFALSE)) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConstraintContext extends ParserRuleContext {
        public AttributeConstraintContext attributeConstraint() {
            return getRuleContext(AttributeConstraintContext.class, 0);
        }

        public RopConstraintContext ropConstraint() {
            return getRuleContext(RopConstraintContext.class, 0);
        }

        public HistoricalQueryContext historicalQuery() {
            return getRuleContext(HistoricalQueryContext.class, 0);
        }

        public ConstraintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constraint;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterConstraint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitConstraint(this);
        }
    }

    public final ConstraintContext constraint() throws RecognitionException {
        ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_constraint);
        try {
            setState(268);
            switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(265);
                    attributeConstraint();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(266);
                    historicalQuery();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(267);
                    ropConstraint();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AttributeConstraintContext extends ParserRuleContext {
        public OutcomeConstraintContext outcomeConstraint() {
            return getRuleContext(OutcomeConstraintContext.class, 0);
        }

        public RoleplayerConstraintContext roleplayerConstraint() {
            return getRuleContext(RoleplayerConstraintContext.class, 0);
        }

        public TimeConstraintContext timeConstraint() {
            return getRuleContext(TimeConstraintContext.class, 0);
        }

        public AttributeConstraintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_attributeConstraint;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterAttributeConstraint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitAttributeConstraint(this);
        }
    }

    public final AttributeConstraintContext attributeConstraint() throws RecognitionException {
        AttributeConstraintContext _localctx = new AttributeConstraintContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_attributeConstraint);
        try {
            setState(273);
            switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(270);
                    roleplayerConstraint();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(271);
                    outcomeConstraint();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(272);
                    timeConstraint();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RoleplayerConstraintContext extends ParserRuleContext {
        public TerminalNode DOT() {
            return getToken(EropcpParser.DOT, 0);
        }

        public OperContext oper() {
            return getRuleContext(OperContext.class, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public List<AlphanumContext> alphanum() {
            return getRuleContexts(AlphanumContext.class);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public RolePlayerConstraintIssuerContext rolePlayerConstraintIssuer() {
            return getRuleContext(RolePlayerConstraintIssuerContext.class, 0);
        }

        public AlphanumContext alphanum(int i) {
            return getRuleContext(AlphanumContext.class, i);
        }

        public RoleplayerConstraintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_roleplayerConstraint;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterRoleplayerConstraint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitRoleplayerConstraint(this);
        }
    }

    public final RoleplayerConstraintContext roleplayerConstraint() throws RecognitionException {
        RoleplayerConstraintContext _localctx = new RoleplayerConstraintContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_roleplayerConstraint);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(275);
                alphanum();
                setState(276);
                match(DOT);
                setState(277);
                rolePlayerConstraintIssuer();
                setState(279);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(278);
                        match(WS);
                    }
                }

                setState(281);
                oper();
                setState(283);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(282);
                        match(WS);
                    }
                }

                setState(285);
                alphanum();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OutcomeConstraintContext extends ParserRuleContext {
        public TerminalNode DOT() {
            return getToken(EropcpParser.DOT, 0);
        }

        public OperContext oper() {
            return getRuleContext(OperContext.class, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public UpalphanumContext upalphanum() {
            return getRuleContext(UpalphanumContext.class, 0);
        }

        public OutcomeContext outcome() {
            return getRuleContext(OutcomeContext.class, 0);
        }

        public BoolContext bool() {
            return getRuleContext(BoolContext.class, 0);
        }

        public OutcomeConstraintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_outcomeConstraint;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterOutcomeConstraint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitOutcomeConstraint(this);
        }
    }

    public final OutcomeConstraintContext outcomeConstraint() throws RecognitionException {
        OutcomeConstraintContext _localctx = new OutcomeConstraintContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_outcomeConstraint);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(287);
                upalphanum();
                setState(288);
                match(DOT);
                setState(289);
                outcome();
                setState(291);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(290);
                        match(WS);
                    }
                }

                setState(293);
                oper();
                setState(295);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(294);
                        match(WS);
                    }
                }

                setState(297);
                bool();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TimeConstraintContext extends ParserRuleContext {
        public TimeDirectComparisonContext timeDirectComparison() {
            return getRuleContext(TimeDirectComparisonContext.class, 0);
        }

        public TimePartialComparisonContext timePartialComparison() {
            return getRuleContext(TimePartialComparisonContext.class, 0);
        }

        public TimeConstraintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_timeConstraint;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterTimeConstraint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitTimeConstraint(this);
        }
    }

    public final TimeConstraintContext timeConstraint() throws RecognitionException {
        TimeConstraintContext _localctx = new TimeConstraintContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_timeConstraint);
        try {
            setState(301);
            switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(299);
                    timeDirectComparison();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(300);
                    timePartialComparison();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TimeDirectComparisonContext extends ParserRuleContext {
        public TerminalNode DOT() {
            return getToken(EropcpParser.DOT, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public AlphanumContext alphanum() {
            return getRuleContext(AlphanumContext.class, 0);
        }

        public TerminalNode TIMESTAMP() {
            return getToken(EropcpParser.TIMESTAMP, 0);
        }

        public TimeOperatorsContext timeOperators() {
            return getRuleContext(TimeOperatorsContext.class, 0);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public AbsoluteTimeContext absoluteTime() {
            return getRuleContext(AbsoluteTimeContext.class, 0);
        }

        public TimeDirectComparisonContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_timeDirectComparison;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterTimeDirectComparison(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitTimeDirectComparison(this);
        }
    }

    public final TimeDirectComparisonContext timeDirectComparison() throws RecognitionException {
        TimeDirectComparisonContext _localctx = new TimeDirectComparisonContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_timeDirectComparison);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(303);
                alphanum();
                setState(304);
                match(DOT);
                setState(305);
                match(TIMESTAMP);
                setState(307);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(306);
                        match(WS);
                    }
                }

                setState(309);
                timeOperators();
                setState(311);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(310);
                        match(WS);
                    }
                }

                setState(313);
                absoluteTime();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TimePartialComparisonContext extends ParserRuleContext {
        public YearIdentContext yearIdent() {
            return getRuleContext(YearIdentContext.class, 0);
        }

        public DateKeyContext dateKey() {
            return getRuleContext(DateKeyContext.class, 0);
        }

        public TimeOperatorsContext timeOperators() {
            return getRuleContext(TimeOperatorsContext.class, 0);
        }

        public DayRangeContext dayRange() {
            return getRuleContext(DayRangeContext.class, 0);
        }

        public DateRangeContext dateRange() {
            return getRuleContext(DateRangeContext.class, 0);
        }

        public MonthKeyContext monthKey() {
            return getRuleContext(MonthKeyContext.class, 0);
        }

        public YearKeyContext yearKey() {
            return getRuleContext(YearKeyContext.class, 0);
        }

        public YearRangeContext yearRange() {
            return getRuleContext(YearRangeContext.class, 0);
        }

        public DateIdentContext dateIdent() {
            return getRuleContext(DateIdentContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(EropcpParser.DOT, 0);
        }

        public OperContext oper() {
            return getRuleContext(OperContext.class, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public AlphanumContext alphanum() {
            return getRuleContext(AlphanumContext.class, 0);
        }

        public MonthRangeContext monthRange() {
            return getRuleContext(MonthRangeContext.class, 0);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public MonthIdentContext monthIdent() {
            return getRuleContext(MonthIdentContext.class, 0);
        }

        public RangeOperatorsContext rangeOperators() {
            return getRuleContext(RangeOperatorsContext.class, 0);
        }

        public DayOfWeekContext dayOfWeek() {
            return getRuleContext(DayOfWeekContext.class, 0);
        }

        public DayKeyContext dayKey() {
            return getRuleContext(DayKeyContext.class, 0);
        }

        public TimePartialComparisonContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_timePartialComparison;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterTimePartialComparison(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitTimePartialComparison(this);
        }
    }

    public final TimePartialComparisonContext timePartialComparison() throws RecognitionException {
        TimePartialComparisonContext _localctx = new TimePartialComparisonContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_timePartialComparison);
        int _la;
        try {
            setState(411);
            switch (getInterpreter().adaptivePredict(_input, 41, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(315);
                    alphanum();
                    setState(316);
                    match(DOT);
                    setState(317);
                    dayKey();
                    setState(319);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(318);
                            match(WS);
                        }
                    }

                    setState(321);
                    oper();
                    setState(323);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(322);
                            match(WS);
                        }
                    }

                    setState(325);
                    dayOfWeek();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(327);
                    alphanum();
                    setState(328);
                    match(DOT);
                    setState(329);
                    dayKey();
                    setState(331);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(330);
                            match(WS);
                        }
                    }

                    setState(333);
                    rangeOperators();
                    setState(335);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(334);
                            match(WS);
                        }
                    }

                    setState(337);
                    dayRange();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(339);
                    alphanum();
                    setState(340);
                    match(DOT);
                    setState(341);
                    dateKey();
                    setState(343);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(342);
                            match(WS);
                        }
                    }

                    setState(345);
                    timeOperators();
                    setState(347);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(346);
                            match(WS);
                        }
                    }

                    setState(349);
                    dateIdent();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(351);
                    alphanum();
                    setState(352);
                    match(DOT);
                    setState(353);
                    dateKey();
                    setState(355);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(354);
                            match(WS);
                        }
                    }

                    setState(357);
                    rangeOperators();
                    setState(359);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(358);
                            match(WS);
                        }
                    }

                    setState(361);
                    dateRange();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(363);
                    alphanum();
                    setState(364);
                    match(DOT);
                    setState(365);
                    monthKey();
                    setState(367);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(366);
                            match(WS);
                        }
                    }

                    setState(369);
                    timeOperators();
                    setState(371);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(370);
                            match(WS);
                        }
                    }

                    setState(373);
                    monthIdent();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(375);
                    alphanum();
                    setState(376);
                    match(DOT);
                    setState(377);
                    monthKey();
                    setState(379);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(378);
                            match(WS);
                        }
                    }

                    setState(381);
                    rangeOperators();
                    setState(383);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(382);
                            match(WS);
                        }
                    }

                    setState(385);
                    monthRange();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(387);
                    alphanum();
                    setState(388);
                    match(DOT);
                    setState(389);
                    yearKey();
                    setState(391);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(390);
                            match(WS);
                        }
                    }

                    setState(393);
                    timeOperators();
                    setState(395);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(394);
                            match(WS);
                        }
                    }

                    setState(397);
                    yearIdent();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(399);
                    alphanum();
                    setState(400);
                    match(DOT);
                    setState(401);
                    yearKey();
                    setState(403);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(402);
                            match(WS);
                        }
                    }

                    setState(405);
                    rangeOperators();
                    setState(407);
                    _la = _input.LA(1);
                    if (_la == WS) {
                        {
                            setState(406);
                            match(WS);
                        }
                    }

                    setState(409);
                    yearRange();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DayKeyContext extends ParserRuleContext {
        public TerminalNode DAY() {
            return getToken(EropcpParser.DAY, 0);
        }

        public DayKeyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dayKey;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterDayKey(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitDayKey(this);
        }
    }

    public final DayKeyContext dayKey() throws RecognitionException {
        DayKeyContext _localctx = new DayKeyContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_dayKey);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(413);
                match(DAY);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DayOfWeekContext extends ParserRuleContext {
        public TerminalNode WEEKDAY() {
            return getToken(EropcpParser.WEEKDAY, 0);
        }

        public DayOfWeekContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dayOfWeek;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterDayOfWeek(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitDayOfWeek(this);
        }
    }

    public final DayOfWeekContext dayOfWeek() throws RecognitionException {
        DayOfWeekContext _localctx = new DayOfWeekContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_dayOfWeek);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(415);
                match(WEEKDAY);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DateKeyContext extends ParserRuleContext {
        public TerminalNode DATE() {
            return getToken(EropcpParser.DATE, 0);
        }

        public DateKeyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dateKey;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterDateKey(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitDateKey(this);
        }
    }

    public final DateKeyContext dateKey() throws RecognitionException {
        DateKeyContext _localctx = new DateKeyContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_dateKey);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(417);
                match(DATE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DateIdentContext extends ParserRuleContext {
        public TerminalNode DIGIT(int i) {
            return getToken(EropcpParser.DIGIT, i);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(EropcpParser.DIGIT);
        }

        public DateIdentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dateIdent;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterDateIdent(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitDateIdent(this);
        }
    }

    public final DateIdentContext dateIdent() throws RecognitionException {
        DateIdentContext _localctx = new DateIdentContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_dateIdent);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(419);
                match(DIGIT);
                setState(420);
                match(DIGIT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MonthKeyContext extends ParserRuleContext {
        public TerminalNode MONTH() {
            return getToken(EropcpParser.MONTH, 0);
        }

        public MonthKeyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_monthKey;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterMonthKey(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitMonthKey(this);
        }
    }

    public final MonthKeyContext monthKey() throws RecognitionException {
        MonthKeyContext _localctx = new MonthKeyContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_monthKey);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(422);
                match(MONTH);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MonthIdentContext extends ParserRuleContext {
        public TerminalNode MONTHID() {
            return getToken(EropcpParser.MONTHID, 0);
        }

        public MonthIdentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_monthIdent;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterMonthIdent(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitMonthIdent(this);
        }
    }

    public final MonthIdentContext monthIdent() throws RecognitionException {
        MonthIdentContext _localctx = new MonthIdentContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_monthIdent);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(424);
                match(MONTHID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class YearKeyContext extends ParserRuleContext {
        public TerminalNode YEAR() {
            return getToken(EropcpParser.YEAR, 0);
        }

        public YearKeyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_yearKey;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterYearKey(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitYearKey(this);
        }
    }

    public final YearKeyContext yearKey() throws RecognitionException {
        YearKeyContext _localctx = new YearKeyContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_yearKey);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(426);
                match(YEAR);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class YearIdentContext extends ParserRuleContext {
        public TerminalNode DIGIT(int i) {
            return getToken(EropcpParser.DIGIT, i);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(EropcpParser.DIGIT);
        }

        public YearIdentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_yearIdent;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterYearIdent(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitYearIdent(this);
        }
    }

    public final YearIdentContext yearIdent() throws RecognitionException {
        YearIdentContext _localctx = new YearIdentContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_yearIdent);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(428);
                match(DIGIT);
                setState(429);
                match(DIGIT);
                setState(430);
                match(DIGIT);
                setState(431);
                match(DIGIT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DayRangeContext extends ParserRuleContext {
        public List<TerminalNode> DOT() {
            return getTokens(EropcpParser.DOT);
        }

        public TerminalNode SQUAREBRA() {
            return getToken(EropcpParser.SQUAREBRA, 0);
        }

        public List<TerminalNode> WEEKDAY() {
            return getTokens(EropcpParser.WEEKDAY);
        }

        public TerminalNode SQUAREKET() {
            return getToken(EropcpParser.SQUAREKET, 0);
        }

        public TerminalNode WEEKDAY(int i) {
            return getToken(EropcpParser.WEEKDAY, i);
        }

        public TerminalNode DOT(int i) {
            return getToken(EropcpParser.DOT, i);
        }

        public DayRangeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dayRange;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterDayRange(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitDayRange(this);
        }
    }

    public final DayRangeContext dayRange() throws RecognitionException {
        DayRangeContext _localctx = new DayRangeContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_dayRange);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(433);
                match(SQUAREBRA);
                setState(434);
                match(WEEKDAY);
                setState(435);
                match(DOT);
                setState(436);
                match(DOT);
                setState(437);
                match(WEEKDAY);
                setState(438);
                match(SQUAREKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DateRangeContext extends ParserRuleContext {
        public List<TerminalNode> DOT() {
            return getTokens(EropcpParser.DOT);
        }

        public TerminalNode SQUAREBRA() {
            return getToken(EropcpParser.SQUAREBRA, 0);
        }

        public TerminalNode DIGIT(int i) {
            return getToken(EropcpParser.DIGIT, i);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(EropcpParser.DIGIT);
        }

        public TerminalNode SQUAREKET() {
            return getToken(EropcpParser.SQUAREKET, 0);
        }

        public TerminalNode DOT(int i) {
            return getToken(EropcpParser.DOT, i);
        }

        public DateRangeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dateRange;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterDateRange(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitDateRange(this);
        }
    }

    public final DateRangeContext dateRange() throws RecognitionException {
        DateRangeContext _localctx = new DateRangeContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_dateRange);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(440);
                match(SQUAREBRA);
                setState(441);
                match(DIGIT);
                setState(442);
                match(DIGIT);
                setState(443);
                match(DOT);
                setState(444);
                match(DOT);
                setState(445);
                match(DIGIT);
                setState(446);
                match(DIGIT);
                setState(447);
                match(SQUAREKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MonthRangeContext extends ParserRuleContext {
        public List<TerminalNode> MONTHID() {
            return getTokens(EropcpParser.MONTHID);
        }

        public List<TerminalNode> DOT() {
            return getTokens(EropcpParser.DOT);
        }

        public TerminalNode SQUAREBRA() {
            return getToken(EropcpParser.SQUAREBRA, 0);
        }

        public TerminalNode MONTHID(int i) {
            return getToken(EropcpParser.MONTHID, i);
        }

        public TerminalNode SQUAREKET() {
            return getToken(EropcpParser.SQUAREKET, 0);
        }

        public TerminalNode DOT(int i) {
            return getToken(EropcpParser.DOT, i);
        }

        public MonthRangeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_monthRange;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterMonthRange(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitMonthRange(this);
        }
    }

    public final MonthRangeContext monthRange() throws RecognitionException {
        MonthRangeContext _localctx = new MonthRangeContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_monthRange);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(449);
                match(SQUAREBRA);
                setState(450);
                match(MONTHID);
                setState(451);
                match(DOT);
                setState(452);
                match(DOT);
                setState(453);
                match(MONTHID);
                setState(454);
                match(SQUAREKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class YearRangeContext extends ParserRuleContext {
        public List<TerminalNode> DOT() {
            return getTokens(EropcpParser.DOT);
        }

        public TerminalNode SQUAREBRA() {
            return getToken(EropcpParser.SQUAREBRA, 0);
        }

        public TerminalNode DIGIT(int i) {
            return getToken(EropcpParser.DIGIT, i);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(EropcpParser.DIGIT);
        }

        public TerminalNode SQUAREKET() {
            return getToken(EropcpParser.SQUAREKET, 0);
        }

        public TerminalNode DOT(int i) {
            return getToken(EropcpParser.DOT, i);
        }

        public YearRangeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_yearRange;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterYearRange(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitYearRange(this);
        }
    }

    public final YearRangeContext yearRange() throws RecognitionException {
        YearRangeContext _localctx = new YearRangeContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_yearRange);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(456);
                match(SQUAREBRA);
                setState(457);
                match(DIGIT);
                setState(458);
                match(DIGIT);
                setState(459);
                match(DIGIT);
                setState(460);
                match(DIGIT);
                setState(461);
                match(DOT);
                setState(462);
                match(DOT);
                setState(463);
                match(DIGIT);
                setState(464);
                match(DIGIT);
                setState(465);
                match(DIGIT);
                setState(466);
                match(DIGIT);
                setState(467);
                match(SQUAREKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class HistoricalQueryOpContext extends ParserRuleContext {
        public TerminalNode HAPPENED() {
            return getToken(EropcpParser.HAPPENED, 0);
        }

        public TerminalNode CTHAPPENED() {
            return getToken(EropcpParser.CTHAPPENED, 0);
        }

        public HistoricalQueryOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_historicalQueryOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterHistoricalQueryOp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitHistoricalQueryOp(this);
        }
    }

    public final HistoricalQueryOpContext historicalQueryOp() throws RecognitionException {
        HistoricalQueryOpContext _localctx = new HistoricalQueryOpContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_historicalQueryOp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(469);
                _la = _input.LA(1);
                if (!(_la == HAPPENED || _la == CTHAPPENED)) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class HistoricalQueryContext extends ParserRuleContext {
        public TerminalNode KET() {
            return getToken(EropcpParser.KET, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public List<AlphanumContext> alphanum() {
            return getRuleContexts(AlphanumContext.class);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(EropcpParser.COMMA);
        }

        public GenericStringContext genericString() {
            return getRuleContext(GenericStringContext.class, 0);
        }

        public AlphanumContext alphanum(int i) {
            return getRuleContext(AlphanumContext.class, i);
        }

        public UpalphanumContext upalphanum() {
            return getRuleContext(UpalphanumContext.class, 0);
        }

        public OutcomeContext outcome() {
            return getRuleContext(OutcomeContext.class, 0);
        }

        public TerminalNode BRA() {
            return getToken(EropcpParser.BRA, 0);
        }

        public TerminalNode COMMA(int i) {
            return getToken(EropcpParser.COMMA, i);
        }

        public HistoricalQueryOpContext historicalQueryOp() {
            return getRuleContext(HistoricalQueryOpContext.class, 0);
        }

        public HistoricalQueryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_historicalQuery;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterHistoricalQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitHistoricalQuery(this);
        }
    }

    public final HistoricalQueryContext historicalQuery() throws RecognitionException {
        HistoricalQueryContext _localctx = new HistoricalQueryContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_historicalQuery);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(471);
                historicalQueryOp();
                setState(473);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(472);
                        match(WS);
                    }
                }

                setState(475);
                match(BRA);
                setState(476);
                upalphanum();
                setState(477);
                match(COMMA);
                setState(479);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(478);
                        match(WS);
                    }
                }

                setState(481);
                alphanum();
                setState(482);
                match(COMMA);
                setState(484);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(483);
                        match(WS);
                    }
                }

                setState(486);
                alphanum();
                setState(487);
                match(COMMA);
                setState(489);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(488);
                        match(WS);
                    }
                }

                setState(491);
                genericString();
                setState(492);
                match(COMMA);
                setState(494);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(493);
                        match(WS);
                    }
                }

                setState(496);
                outcome();
                setState(497);
                match(KET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RopConstraintContext extends ParserRuleContext {
        public TerminalNode DOT() {
            return getToken(EropcpParser.DOT, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public AlphanumContext alphanum() {
            return getRuleContext(AlphanumContext.class, 0);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public UpalphanumContext upalphanum() {
            return getRuleContext(UpalphanumContext.class, 0);
        }

        public RangeOperatorsContext rangeOperators() {
            return getRuleContext(RangeOperatorsContext.class, 0);
        }

        public RopsetContext ropset() {
            return getRuleContext(RopsetContext.class, 0);
        }

        public RopConstraintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ropConstraint;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterRopConstraint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitRopConstraint(this);
        }
    }

    public final RopConstraintContext ropConstraint() throws RecognitionException {
        RopConstraintContext _localctx = new RopConstraintContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_ropConstraint);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(499);
                upalphanum();
                setState(501);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(500);
                        match(WS);
                    }
                }

                setState(503);
                rangeOperators();
                setState(505);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(504);
                        match(WS);
                    }
                }

                setState(507);
                alphanum();
                setState(508);
                match(DOT);
                setState(509);
                ropset();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RhsContext extends ParserRuleContext {
        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public RhsActionNoIfsContext rhsActionNoIfs(int i) {
            return getRuleContext(RhsActionNoIfsContext.class, i);
        }

        public List<RhsActionNoIfsContext> rhsActionNoIfs() {
            return getRuleContexts(RhsActionNoIfsContext.class);
        }

        public RhsactionContext rhsaction() {
            return getRuleContext(RhsactionContext.class, 0);
        }

        public RhsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rhs;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterRhs(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitRhs(this);
        }
    }

    public final RhsContext rhs() throws RecognitionException {
        RhsContext _localctx = new RhsContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_rhs);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(511);
                rhsaction();
                setState(518);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 50, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(513);
                                _la = _input.LA(1);
                                if (_la == WS) {
                                    {
                                        setState(512);
                                        match(WS);
                                    }
                                }

                                setState(515);
                                rhsActionNoIfs();
                            }
                        }
                    }
                    setState(520);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 50, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RhsActionNoIfsContext extends ParserRuleContext {
        public OutcomeConstraintContext outcomeConstraint() {
            return getRuleContext(OutcomeConstraintContext.class, 0);
        }

        public TermactionContext termaction() {
            return getRuleContext(TermactionContext.class, 0);
        }

        public ResetactionContext resetaction() {
            return getRuleContext(ResetactionContext.class, 0);
        }

        public AddRemActionContext addRemAction() {
            return getRuleContext(AddRemActionContext.class, 0);
        }

        public PassactionContext passaction() {
            return getRuleContext(PassactionContext.class, 0);
        }

        public RhsActionNoIfsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rhsActionNoIfs;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterRhsActionNoIfs(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitRhsActionNoIfs(this);
        }
    }

    public final RhsActionNoIfsContext rhsActionNoIfs() throws RecognitionException {
        RhsActionNoIfsContext _localctx = new RhsActionNoIfsContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_rhsActionNoIfs);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(526);
                switch (_input.LA(1)) {
                    case TERMINATE: {
                        setState(521);
                        termaction();
                    }
                    break;
                    case PASS: {
                        setState(522);
                        passaction();
                    }
                    break;
                    case RESET: {
                        setState(523);
                        resetaction();
                    }
                    break;
                    case LOWER: {
                        setState(524);
                        addRemAction();
                    }
                    break;
                    case UPPER: {
                        setState(525);
                        outcomeConstraint();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RhsactionContext extends ParserRuleContext {
        public OutcomeConstraintContext outcomeConstraint() {
            return getRuleContext(OutcomeConstraintContext.class, 0);
        }

        public TermactionContext termaction() {
            return getRuleContext(TermactionContext.class, 0);
        }

        public ResetactionContext resetaction() {
            return getRuleContext(ResetactionContext.class, 0);
        }

        public AddRemActionContext addRemAction() {
            return getRuleContext(AddRemActionContext.class, 0);
        }

        public IfstatementContext ifstatement() {
            return getRuleContext(IfstatementContext.class, 0);
        }

        public PassactionContext passaction() {
            return getRuleContext(PassactionContext.class, 0);
        }

        public RhsactionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rhsaction;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterRhsaction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitRhsaction(this);
        }
    }

    public final RhsactionContext rhsaction() throws RecognitionException {
        RhsactionContext _localctx = new RhsactionContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_rhsaction);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(534);
                switch (_input.LA(1)) {
                    case IF: {
                        setState(528);
                        ifstatement();
                    }
                    break;
                    case TERMINATE: {
                        setState(529);
                        termaction();
                    }
                    break;
                    case PASS: {
                        setState(530);
                        passaction();
                    }
                    break;
                    case RESET: {
                        setState(531);
                        resetaction();
                    }
                    break;
                    case LOWER: {
                        setState(532);
                        addRemAction();
                    }
                    break;
                    case UPPER: {
                        setState(533);
                        outcomeConstraint();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IfThenContext extends ParserRuleContext {
        public List<OutcomeConstraintContext> outcomeConstraint() {
            return getRuleContexts(OutcomeConstraintContext.class);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public List<ResetactionContext> resetaction() {
            return getRuleContexts(ResetactionContext.class);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public List<AddRemActionContext> addRemAction() {
            return getRuleContexts(AddRemActionContext.class);
        }

        public TerminalNode THEN() {
            return getToken(EropcpParser.THEN, 0);
        }

        public AddRemActionContext addRemAction(int i) {
            return getRuleContext(AddRemActionContext.class, i);
        }

        public OutcomeConstraintContext outcomeConstraint(int i) {
            return getRuleContext(OutcomeConstraintContext.class, i);
        }

        public ResetactionContext resetaction(int i) {
            return getRuleContext(ResetactionContext.class, i);
        }

        public RhsActionNoIfsContext rhsActionNoIfs() {
            return getRuleContext(RhsActionNoIfsContext.class, 0);
        }

        public IfThenContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifThen;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterIfThen(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitIfThen(this);
        }
    }

    public final IfThenContext ifThen() throws RecognitionException {
        IfThenContext _localctx = new IfThenContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_ifThen);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(536);
                match(THEN);
                setState(537);
                match(WS);
                setState(538);
                rhsActionNoIfs();
                setState(547);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 54, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(539);
                                match(WS);
                                setState(543);
                                switch (_input.LA(1)) {
                                    case LOWER: {
                                        setState(540);
                                        addRemAction();
                                    }
                                    break;
                                    case UPPER: {
                                        setState(541);
                                        outcomeConstraint();
                                    }
                                    break;
                                    case RESET: {
                                        setState(542);
                                        resetaction();
                                    }
                                    break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                        }
                    }
                    setState(549);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 54, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IfElseContext extends ParserRuleContext {
        public List<OutcomeConstraintContext> outcomeConstraint() {
            return getRuleContexts(OutcomeConstraintContext.class);
        }

        public TerminalNode ELSE() {
            return getToken(EropcpParser.ELSE, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public List<ResetactionContext> resetaction() {
            return getRuleContexts(ResetactionContext.class);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public List<AddRemActionContext> addRemAction() {
            return getRuleContexts(AddRemActionContext.class);
        }

        public AddRemActionContext addRemAction(int i) {
            return getRuleContext(AddRemActionContext.class, i);
        }

        public OutcomeConstraintContext outcomeConstraint(int i) {
            return getRuleContext(OutcomeConstraintContext.class, i);
        }

        public ResetactionContext resetaction(int i) {
            return getRuleContext(ResetactionContext.class, i);
        }

        public RhsActionNoIfsContext rhsActionNoIfs() {
            return getRuleContext(RhsActionNoIfsContext.class, 0);
        }

        public IfElseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifElse;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterIfElse(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitIfElse(this);
        }
    }

    public final IfElseContext ifElse() throws RecognitionException {
        IfElseContext _localctx = new IfElseContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_ifElse);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(565);
                switch (getInterpreter().adaptivePredict(_input, 57, _ctx)) {
                    case 1: {
                        setState(550);
                        match(WS);
                        setState(551);
                        match(ELSE);
                        setState(552);
                        match(WS);
                        setState(553);
                        rhsActionNoIfs();
                        setState(562);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 56, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(554);
                                        match(WS);
                                        setState(558);
                                        switch (_input.LA(1)) {
                                            case LOWER: {
                                                setState(555);
                                                addRemAction();
                                            }
                                            break;
                                            case UPPER: {
                                                setState(556);
                                                outcomeConstraint();
                                            }
                                            break;
                                            case RESET: {
                                                setState(557);
                                                resetaction();
                                            }
                                            break;
                                            default:
                                                throw new NoViableAltException(this);
                                        }
                                    }
                                }
                            }
                            setState(564);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 56, _ctx);
                        }
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IfstatementContext extends ParserRuleContext {
        public TerminalNode IF() {
            return getToken(EropcpParser.IF, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public TerminalNode ENDIF() {
            return getToken(EropcpParser.ENDIF, 0);
        }

        public IfThenContext ifThen() {
            return getRuleContext(IfThenContext.class, 0);
        }

        public IfElseContext ifElse() {
            return getRuleContext(IfElseContext.class, 0);
        }

        public ConditionContext condition() {
            return getRuleContext(ConditionContext.class, 0);
        }

        public IfstatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifstatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterIfstatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitIfstatement(this);
        }
    }

    public final IfstatementContext ifstatement() throws RecognitionException {
        IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_ifstatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(567);
                match(IF);
                setState(568);
                match(WS);
                setState(569);
                condition();
                setState(570);
                match(WS);
                setState(571);
                ifThen();
                setState(572);
                ifElse();
                setState(573);
                match(WS);
                setState(574);
                match(ENDIF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConditionContext extends ParserRuleContext {
        public TerminalNode KET() {
            return getToken(EropcpParser.KET, 0);
        }

        public TerminalNode NOT() {
            return getToken(EropcpParser.NOT, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public List<ConstraintContext> constraint() {
            return getRuleContexts(ConstraintContext.class);
        }

        public AndORContext andOR(int i) {
            return getRuleContext(AndORContext.class, i);
        }

        public List<AndORContext> andOR() {
            return getRuleContexts(AndORContext.class);
        }

        public TerminalNode BRA() {
            return getToken(EropcpParser.BRA, 0);
        }

        public ConstraintContext constraint(int i) {
            return getRuleContext(ConstraintContext.class, i);
        }

        public ConditionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_condition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterCondition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitCondition(this);
        }
    }

    public final ConditionContext condition() throws RecognitionException {
        ConditionContext _localctx = new ConditionContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_condition);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(576);
                match(BRA);
                setState(578);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(577);
                        match(WS);
                    }
                }

                setState(581);
                _la = _input.LA(1);
                if (_la == NOT) {
                    {
                        setState(580);
                        match(NOT);
                    }
                }

                setState(583);
                constraint();
                setState(595);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 62, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(585);
                                _la = _input.LA(1);
                                if (_la == WS) {
                                    {
                                        setState(584);
                                        match(WS);
                                    }
                                }

                                setState(587);
                                andOR();
                                setState(589);
                                _la = _input.LA(1);
                                if (_la == WS) {
                                    {
                                        setState(588);
                                        match(WS);
                                    }
                                }

                                setState(591);
                                constraint();
                            }
                        }
                    }
                    setState(597);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 62, _ctx);
                }
                setState(599);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(598);
                        match(WS);
                    }
                }

                setState(601);
                match(KET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ResetactionContext extends ParserRuleContext {
        public TerminalNode RESET() {
            return getToken(EropcpParser.RESET, 0);
        }

        public AlphanumContext alphanum() {
            return getRuleContext(AlphanumContext.class, 0);
        }

        public TerminalNode WS() {
            return getToken(EropcpParser.WS, 0);
        }

        public ResetactionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_resetaction;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterResetaction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitResetaction(this);
        }
    }

    public final ResetactionContext resetaction() throws RecognitionException {
        ResetactionContext _localctx = new ResetactionContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_resetaction);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(603);
                match(RESET);
                setState(604);
                match(WS);
                setState(605);
                alphanum();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TermactionContext extends ParserRuleContext {
        public TerminalNode KET() {
            return getToken(EropcpParser.KET, 0);
        }

        public TerminalNode WS() {
            return getToken(EropcpParser.WS, 0);
        }

        public OutcomeContext outcome() {
            return getRuleContext(OutcomeContext.class, 0);
        }

        public TerminalNode BRA() {
            return getToken(EropcpParser.BRA, 0);
        }

        public TerminalNode TERMINATE() {
            return getToken(EropcpParser.TERMINATE, 0);
        }

        public TermactionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_termaction;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterTermaction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitTermaction(this);
        }
    }

    public final TermactionContext termaction() throws RecognitionException {
        TermactionContext _localctx = new TermactionContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_termaction);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(607);
                match(TERMINATE);
                setState(609);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(608);
                        match(WS);
                    }
                }

                setState(611);
                match(BRA);
                setState(612);
                outcome();
                setState(613);
                match(KET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PassactionContext extends ParserRuleContext {
        public TerminalNode PASS() {
            return getToken(EropcpParser.PASS, 0);
        }

        public PassactionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_passaction;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterPassaction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitPassaction(this);
        }
    }

    public final PassactionContext passaction() throws RecognitionException {
        PassactionContext _localctx = new PassactionContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_passaction);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(615);
                match(PASS);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AddRemRopOperatorContext extends ParserRuleContext {
        public TerminalNode ADDROP() {
            return getToken(EropcpParser.ADDROP, 0);
        }

        public TerminalNode REMROP() {
            return getToken(EropcpParser.REMROP, 0);
        }

        public AddRemRopOperatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_addRemRopOperator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterAddRemRopOperator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitAddRemRopOperator(this);
        }
    }

    public final AddRemRopOperatorContext addRemRopOperator() throws RecognitionException {
        AddRemRopOperatorContext _localctx = new AddRemRopOperatorContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_addRemRopOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(617);
                _la = _input.LA(1);
                if (!(_la == ADDROP || _la == REMROP)) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AddRemActionContext extends ParserRuleContext {
        public TerminalNode KET() {
            return getToken(EropcpParser.KET, 0);
        }

        public TerminalNode DOT() {
            return getToken(EropcpParser.DOT, 0);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public List<AlphanumContext> alphanum() {
            return getRuleContexts(AlphanumContext.class);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public AddRemRopOperatorContext addRemRopOperator() {
            return getRuleContext(AddRemRopOperatorContext.class, 0);
        }

        public TerminalNode COMMA() {
            return getToken(EropcpParser.COMMA, 0);
        }

        public AlphanumContext alphanum(int i) {
            return getRuleContext(AlphanumContext.class, i);
        }

        public UpalphanumContext upalphanum() {
            return getRuleContext(UpalphanumContext.class, 0);
        }

        public RopsetContext ropset() {
            return getRuleContext(RopsetContext.class, 0);
        }

        public TimeSpecContext timeSpec() {
            return getRuleContext(TimeSpecContext.class, 0);
        }

        public TerminalNode BRA() {
            return getToken(EropcpParser.BRA, 0);
        }

        public AddRemActionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_addRemAction;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterAddRemAction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitAddRemAction(this);
        }
    }

    public final AddRemActionContext addRemAction() throws RecognitionException {
        AddRemActionContext _localctx = new AddRemActionContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_addRemAction);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(619);
                alphanum();
                setState(620);
                match(DOT);
                setState(621);
                ropset();
                setState(623);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(622);
                        match(WS);
                    }
                }

                setState(625);
                addRemRopOperator();
                setState(627);
                _la = _input.LA(1);
                if (_la == WS) {
                    {
                        setState(626);
                        match(WS);
                    }
                }

                setState(629);
                upalphanum();
                setState(630);
                match(BRA);
                setState(631);
                alphanum();
                setState(634);
                _la = _input.LA(1);
                if (_la == COMMA) {
                    {
                        setState(632);
                        match(COMMA);
                        setState(633);
                        timeSpec();
                    }
                }

                setState(636);
                match(KET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OutcomeContext extends ParserRuleContext {
        public TerminalNode TECFAIL() {
            return getToken(EropcpParser.TECFAIL, 0);
        }

        public TerminalNode SUCCESS() {
            return getToken(EropcpParser.SUCCESS, 0);
        }

        public TerminalNode BIZFAIL() {
            return getToken(EropcpParser.BIZFAIL, 0);
        }

        public TerminalNode INITFAIL() {
            return getToken(EropcpParser.INITFAIL, 0);
        }

        public OutcomeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_outcome;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterOutcome(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitOutcome(this);
        }
    }

    public final OutcomeContext outcome() throws RecognitionException {
        OutcomeContext _localctx = new OutcomeContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_outcome);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(638);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUCCESS) | (1L << TECFAIL) | (1L << BIZFAIL) | (1L << INITFAIL))) != 0))) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RopsetContext extends ParserRuleContext {
        public TerminalNode RIGHTS() {
            return getToken(EropcpParser.RIGHTS, 0);
        }

        public TerminalNode PROHIBS() {
            return getToken(EropcpParser.PROHIBS, 0);
        }

        public TerminalNode OBLIGS() {
            return getToken(EropcpParser.OBLIGS, 0);
        }

        public RopsetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ropset;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterRopset(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitRopset(this);
        }
    }

    public final RopsetContext ropset() throws RecognitionException {
        RopsetContext _localctx = new RopsetContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_ropset);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(640);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBLIGS) | (1L << RIGHTS) | (1L << PROHIBS))) != 0))) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TimeSpecContext extends ParserRuleContext {
        public AbsoluteTimeContext absoluteTime() {
            return getRuleContext(AbsoluteTimeContext.class, 0);
        }

        public TimeSpecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_timeSpec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterTimeSpec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitTimeSpec(this);
        }
    }

    public final TimeSpecContext timeSpec() throws RecognitionException {
        TimeSpecContext _localctx = new TimeSpecContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_timeSpec);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(642);
                absoluteTime();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AbsoluteTimeContext extends ParserRuleContext {
        public TerminalNode WS() {
            return getToken(EropcpParser.WS, 0);
        }

        public TerminalNode DIGIT(int i) {
            return getToken(EropcpParser.DIGIT, i);
        }

        public TerminalNode COLON(int i) {
            return getToken(EropcpParser.COLON, i);
        }

        public List<TerminalNode> COLON() {
            return getTokens(EropcpParser.COLON);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(EropcpParser.DIGIT);
        }

        public List<TerminalNode> DQUOTE() {
            return getTokens(EropcpParser.DQUOTE);
        }

        public TerminalNode DQUOTE(int i) {
            return getToken(EropcpParser.DQUOTE, i);
        }

        public TerminalNode DASH(int i) {
            return getToken(EropcpParser.DASH, i);
        }

        public List<TerminalNode> DASH() {
            return getTokens(EropcpParser.DASH);
        }

        public AbsoluteTimeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_absoluteTime;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterAbsoluteTime(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitAbsoluteTime(this);
        }
    }

    public final AbsoluteTimeContext absoluteTime() throws RecognitionException {
        AbsoluteTimeContext _localctx = new AbsoluteTimeContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_absoluteTime);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(644);
                match(DQUOTE);
                setState(645);
                match(DIGIT);
                setState(646);
                match(DIGIT);
                setState(647);
                match(DASH);
                setState(648);
                match(DIGIT);
                setState(649);
                match(DIGIT);
                setState(650);
                match(DASH);
                setState(651);
                match(DIGIT);
                setState(652);
                match(DIGIT);
                setState(653);
                match(DIGIT);
                setState(654);
                match(DIGIT);
                setState(655);
                match(WS);
                setState(656);
                match(DIGIT);
                setState(657);
                match(DIGIT);
                setState(658);
                match(COLON);
                setState(659);
                match(DIGIT);
                setState(660);
                match(DIGIT);
                setState(661);
                match(COLON);
                setState(662);
                match(DIGIT);
                setState(663);
                match(DIGIT);
                setState(664);
                match(DQUOTE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class UpalphanumContext extends ParserRuleContext {
        public List<TerminalNode> UPPER() {
            return getTokens(EropcpParser.UPPER);
        }

        public TerminalNode LOWER(int i) {
            return getToken(EropcpParser.LOWER, i);
        }

        public TerminalNode DIGIT(int i) {
            return getToken(EropcpParser.DIGIT, i);
        }

        public TerminalNode UPPER(int i) {
            return getToken(EropcpParser.UPPER, i);
        }

        public List<TerminalNode> LOWER() {
            return getTokens(EropcpParser.LOWER);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(EropcpParser.DIGIT);
        }

        public UpalphanumContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_upalphanum;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterUpalphanum(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitUpalphanum(this);
        }
    }

    public final UpalphanumContext upalphanum() throws RecognitionException {
        UpalphanumContext _localctx = new UpalphanumContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_upalphanum);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(666);
                match(UPPER);
                setState(670);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWER) | (1L << UPPER) | (1L << DIGIT))) != 0)) {
                    {
                        {
                            setState(667);
                            _la = _input.LA(1);
                            if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWER) | (1L << UPPER) | (1L << DIGIT))) != 0))) {
                                _errHandler.recoverInline(this);
                            }
                            consume();
                        }
                    }
                    setState(672);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AlphanumContext extends ParserRuleContext {
        public List<TerminalNode> UPPER() {
            return getTokens(EropcpParser.UPPER);
        }

        public TerminalNode LOWER(int i) {
            return getToken(EropcpParser.LOWER, i);
        }

        public TerminalNode DIGIT(int i) {
            return getToken(EropcpParser.DIGIT, i);
        }

        public TerminalNode UPPER(int i) {
            return getToken(EropcpParser.UPPER, i);
        }

        public List<TerminalNode> LOWER() {
            return getTokens(EropcpParser.LOWER);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(EropcpParser.DIGIT);
        }

        public AlphanumContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_alphanum;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterAlphanum(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitAlphanum(this);
        }
    }

    public final AlphanumContext alphanum() throws RecognitionException {
        AlphanumContext _localctx = new AlphanumContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_alphanum);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(673);
                match(LOWER);
                setState(677);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 69, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(674);
                                _la = _input.LA(1);
                                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWER) | (1L << UPPER) | (1L << DIGIT))) != 0))) {
                                    _errHandler.recoverInline(this);
                                }
                                consume();
                            }
                        }
                    }
                    setState(679);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 69, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RoleplayeridentifyerContext extends ParserRuleContext {
        public AlphanumContext alphanum() {
            return getRuleContext(AlphanumContext.class, 0);
        }

        public RoleplayeridentifyerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_roleplayeridentifyer;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterRoleplayeridentifyer(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitRoleplayeridentifyer(this);
        }
    }

    public final RoleplayeridentifyerContext roleplayeridentifyer() throws RecognitionException {
        RoleplayeridentifyerContext _localctx = new RoleplayeridentifyerContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_roleplayeridentifyer);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(680);
                alphanum();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BopIdentifierContext extends ParserRuleContext {
        public UpalphanumContext upalphanum() {
            return getRuleContext(UpalphanumContext.class, 0);
        }

        public BopIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bopIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterBopIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitBopIdentifier(this);
        }
    }

    public final BopIdentifierContext bopIdentifier() throws RecognitionException {
        BopIdentifierContext _localctx = new BopIdentifierContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_bopIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(682);
                upalphanum();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class GenericStringContext extends ParserRuleContext {
        public List<TerminalNode> SEMICOLON() {
            return getTokens(EropcpParser.SEMICOLON);
        }

        public List<TerminalNode> BACKSLASH() {
            return getTokens(EropcpParser.BACKSLASH);
        }

        public TerminalNode UPPER(int i) {
            return getToken(EropcpParser.UPPER, i);
        }

        public List<TerminalNode> COLON() {
            return getTokens(EropcpParser.COLON);
        }

        public List<TerminalNode> LOWER() {
            return getTokens(EropcpParser.LOWER);
        }

        public List<TerminalNode> DQUOTE() {
            return getTokens(EropcpParser.DQUOTE);
        }

        public TerminalNode COMMA(int i) {
            return getToken(EropcpParser.COMMA, i);
        }

        public TerminalNode DOT(int i) {
            return getToken(EropcpParser.DOT, i);
        }

        public TerminalNode BACKSLASH(int i) {
            return getToken(EropcpParser.BACKSLASH, i);
        }

        public List<TerminalNode> DASH() {
            return getTokens(EropcpParser.DASH);
        }

        public List<TerminalNode> UPPER() {
            return getTokens(EropcpParser.UPPER);
        }

        public List<TerminalNode> DOT() {
            return getTokens(EropcpParser.DOT);
        }

        public TerminalNode LOWER(int i) {
            return getToken(EropcpParser.LOWER, i);
        }

        public TerminalNode WS(int i) {
            return getToken(EropcpParser.WS, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(EropcpParser.WS);
        }

        public TerminalNode DIGIT(int i) {
            return getToken(EropcpParser.DIGIT, i);
        }

        public TerminalNode COLON(int i) {
            return getToken(EropcpParser.COLON, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(EropcpParser.COMMA);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(EropcpParser.DIGIT);
        }

        public TerminalNode SEMICOLON(int i) {
            return getToken(EropcpParser.SEMICOLON, i);
        }

        public List<TerminalNode> QUOTE() {
            return getTokens(EropcpParser.QUOTE);
        }

        public TerminalNode DQUOTE(int i) {
            return getToken(EropcpParser.DQUOTE, i);
        }

        public TerminalNode DASH(int i) {
            return getToken(EropcpParser.DASH, i);
        }

        public TerminalNode QUOTE(int i) {
            return getToken(EropcpParser.QUOTE, i);
        }

        public GenericStringContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_genericString;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).enterGenericString(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EropcpListener) ((EropcpListener) listener).exitGenericString(this);
        }
    }

    public final GenericStringContext genericString() throws RecognitionException {
        GenericStringContext _localctx = new GenericStringContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_genericString);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(684);
                match(DQUOTE);
                setState(688);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (LOWER - 52)) | (1L << (UPPER - 52)) | (1L << (DIGIT - 52)) | (1L << (SEMICOLON - 52)) | (1L << (COLON - 52)) | (1L << (COMMA - 52)) | (1L << (QUOTE - 52)) | (1L << (DOT - 52)) | (1L << (DASH - 52)) | (1L << (BACKSLASH - 52)) | (1L << (WS - 52)))) != 0)) {
                    {
                        {
                            setState(685);
                            _la = _input.LA(1);
                            if (!(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (LOWER - 52)) | (1L << (UPPER - 52)) | (1L << (DIGIT - 52)) | (1L << (SEMICOLON - 52)) | (1L << (COLON - 52)) | (1L << (COMMA - 52)) | (1L << (QUOTE - 52)) | (1L << (DOT - 52)) | (1L << (DASH - 52)) | (1L << (BACKSLASH - 52)) | (1L << (WS - 52)))) != 0))) {
                                _errHandler.recoverInline(this);
                            }
                            consume();
                        }
                    }
                    setState(690);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(691);
                match(DQUOTE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3F\u02b8\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\3\2\5\2\u0080\n\2\3\2\3\2\5\2\u0084\n\2\3\2\3\2\5\2\u0088" +
                    "\n\2\3\3\3\3\3\3\7\3\u008d\n\3\f\3\16\3\u0090\13\3\3\4\3\4\3\4\5\4\u0095" +
                    "\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009e\n\5\3\5\6\5\u00a1\n\5\r\5\16" +
                    "\5\u00a2\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\u00ad\n\6\f\6\16\6\u00b0" +
                    "\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7\u00b9\n\7\f\7\16\7\u00bc\13\7\3" +
                    "\7\3\7\3\b\3\b\3\b\7\b\u00c3\n\b\f\b\16\b\u00c6\13\b\3\t\3\t\3\t\3\t\3" +
                    "\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13" +
                    "\3\13\3\13\5\13\u00df\n\13\7\13\u00e1\n\13\f\13\16\13\u00e4\13\13\3\13" +
                    "\3\13\3\13\7\13\u00e9\n\13\f\13\16\13\u00ec\13\13\3\f\3\f\3\f\3\f\3\r" +
                    "\3\r\5\r\u00f4\n\r\3\r\3\r\5\r\u00f8\n\r\3\r\3\r\5\r\u00fc\n\r\3\16\3" +
                    "\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3" +
                    "\25\3\25\5\25\u010f\n\25\3\26\3\26\3\26\5\26\u0114\n\26\3\27\3\27\3\27" +
                    "\3\27\5\27\u011a\n\27\3\27\3\27\5\27\u011e\n\27\3\27\3\27\3\30\3\30\3" +
                    "\30\3\30\5\30\u0126\n\30\3\30\3\30\5\30\u012a\n\30\3\30\3\30\3\31\3\31" +
                    "\5\31\u0130\n\31\3\32\3\32\3\32\3\32\5\32\u0136\n\32\3\32\3\32\5\32\u013a" +
                    "\n\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0142\n\33\3\33\3\33\5\33\u0146" +
                    "\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u014e\n\33\3\33\3\33\5\33\u0152" +
                    "\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u015a\n\33\3\33\3\33\5\33\u015e" +
                    "\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0166\n\33\3\33\3\33\5\33\u016a" +
                    "\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0172\n\33\3\33\3\33\5\33\u0176" +
                    "\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u017e\n\33\3\33\3\33\5\33\u0182" +
                    "\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u018a\n\33\3\33\3\33\5\33\u018e" +
                    "\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0196\n\33\3\33\3\33\5\33\u019a" +
                    "\n\33\3\33\3\33\5\33\u019e\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37" +
                    "\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3" +
                    "%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3" +
                    "\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\5)\u01dc\n)\3)\3)\3)\3)\5)\u01e2\n" +
                    ")\3)\3)\3)\5)\u01e7\n)\3)\3)\3)\5)\u01ec\n)\3)\3)\3)\5)\u01f1\n)\3)\3" +
                    ")\3)\3*\3*\5*\u01f8\n*\3*\3*\5*\u01fc\n*\3*\3*\3*\3*\3+\3+\5+\u0204\n" +
                    "+\3+\7+\u0207\n+\f+\16+\u020a\13+\3,\3,\3,\3,\3,\5,\u0211\n,\3-\3-\3-" +
                    "\3-\3-\3-\5-\u0219\n-\3.\3.\3.\3.\3.\3.\3.\5.\u0222\n.\7.\u0224\n.\f." +
                    "\16.\u0227\13.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0231\n/\7/\u0233\n/\f/\16/" +
                    "\u0236\13/\5/\u0238\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3" +
                    "\61\3\61\5\61\u0245\n\61\3\61\5\61\u0248\n\61\3\61\3\61\5\61\u024c\n\61" +
                    "\3\61\3\61\5\61\u0250\n\61\3\61\3\61\7\61\u0254\n\61\f\61\16\61\u0257" +
                    "\13\61\3\61\5\61\u025a\n\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\5" +
                    "\63\u0264\n\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66" +
                    "\3\66\5\66\u0272\n\66\3\66\3\66\5\66\u0276\n\66\3\66\3\66\3\66\3\66\3" +
                    "\66\5\66\u027d\n\66\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3:\3:\3:" +
                    "\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\7;\u029f\n;\f;" +
                    "\16;\u02a2\13;\3<\3<\7<\u02a6\n<\f<\16<\u02a9\13<\3=\3=\3>\3>\3?\3?\7" +
                    "?\u02b1\n?\f?\16?\u02b4\13?\3?\3?\3?\2\2@\2\4\6\b\n\f\16\20\22\24\26\30" +
                    "\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\17" +
                    "\3\2\20\21\3\2\17\23\3\2\35\36\4\2\r\16\35\36\3\2\33\34\3\2\37 \3\2()" +
                    "\3\2\13\f\3\2*+\3\2$\'\3\2/\61\3\2\668\5\2\66:>?CF\u02d2\2\177\3\2\2\2" +
                    "\4\u0089\3\2\2\2\6\u0094\3\2\2\2\b\u0096\3\2\2\2\n\u00a7\3\2\2\2\f\u00b3" +
                    "\3\2\2\2\16\u00bf\3\2\2\2\20\u00c7\3\2\2\2\22\u00d5\3\2\2\2\24\u00d9\3" +
                    "\2\2\2\26\u00ed\3\2\2\2\30\u00f1\3\2\2\2\32\u00fd\3\2\2\2\34\u00ff\3\2" +
                    "\2\2\36\u0101\3\2\2\2 \u0103\3\2\2\2\"\u0105\3\2\2\2$\u0107\3\2\2\2&\u0109" +
                    "\3\2\2\2(\u010e\3\2\2\2*\u0113\3\2\2\2,\u0115\3\2\2\2.\u0121\3\2\2\2\60" +
                    "\u012f\3\2\2\2\62\u0131\3\2\2\2\64\u019d\3\2\2\2\66\u019f\3\2\2\28\u01a1" +
                    "\3\2\2\2:\u01a3\3\2\2\2<\u01a5\3\2\2\2>\u01a8\3\2\2\2@\u01aa\3\2\2\2B" +
                    "\u01ac\3\2\2\2D\u01ae\3\2\2\2F\u01b3\3\2\2\2H\u01ba\3\2\2\2J\u01c3\3\2" +
                    "\2\2L\u01ca\3\2\2\2N\u01d7\3\2\2\2P\u01d9\3\2\2\2R\u01f5\3\2\2\2T\u0201" +
                    "\3\2\2\2V\u0210\3\2\2\2X\u0218\3\2\2\2Z\u021a\3\2\2\2\\\u0237\3\2\2\2" +
                    "^\u0239\3\2\2\2`\u0242\3\2\2\2b\u025d\3\2\2\2d\u0261\3\2\2\2f\u0269\3" +
                    "\2\2\2h\u026b\3\2\2\2j\u026d\3\2\2\2l\u0280\3\2\2\2n\u0282\3\2\2\2p\u0284" +
                    "\3\2\2\2r\u0286\3\2\2\2t\u029c\3\2\2\2v\u02a3\3\2\2\2x\u02aa\3\2\2\2z" +
                    "\u02ac\3\2\2\2|\u02ae\3\2\2\2~\u0080\7F\2\2\177~\3\2\2\2\177\u0080\3\2" +
                    "\2\2\u0080\u0081\3\2\2\2\u0081\u0083\5\4\3\2\u0082\u0084\7F\2\2\u0083" +
                    "\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\5\16" +
                    "\b\2\u0086\u0088\7F\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088" +
                    "\3\3\2\2\2\u0089\u008e\5\6\4\2\u008a\u008b\7F\2\2\u008b\u008d\5\6\4\2" +
                    "\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f" +
                    "\3\2\2\2\u008f\5\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0095\5\n\6\2\u0092" +
                    "\u0095\5\f\7\2\u0093\u0095\5\b\5\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2" +
                    "\2\2\u0094\u0093\3\2\2\2\u0095\7\3\2\2\2\u0096\u0097\7\5\2\2\u0097\u0098" +
                    "\7F\2\2\u0098\u0099\5t;\2\u0099\u009a\7<\2\2\u009a\u00a0\5t;\2\u009b\u009d" +
                    "\7>\2\2\u009c\u009e\7F\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e" +
                    "\u009f\3\2\2\2\u009f\u00a1\5t;\2\u00a0\u009b\3\2\2\2\u00a1\u00a2\3\2\2" +
                    "\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5" +
                    "\7=\2\2\u00a5\u00a6\79\2\2\u00a6\t\3\2\2\2\u00a7\u00a8\7\4\2\2\u00a8\u00a9" +
                    "\7F\2\2\u00a9\u00ae\5t;\2\u00aa\u00ab\7>\2\2\u00ab\u00ad\5t;\2\u00ac\u00aa" +
                    "\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af" +
                    "\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\79\2\2\u00b2\13\3\2\2\2" +
                    "\u00b3\u00b4\7\3\2\2\u00b4\u00b5\7F\2\2\u00b5\u00ba\5v<\2\u00b6\u00b7" +
                    "\7>\2\2\u00b7\u00b9\5v<\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba" +
                    "\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2" +
                    "\2\2\u00bd\u00be\79\2\2\u00be\r\3\2\2\2\u00bf\u00c4\5\20\t\2\u00c0\u00c1" +
                    "\7F\2\2\u00c1\u00c3\5\20\t\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4" +
                    "\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\17\3\2\2\2\u00c6\u00c4\3\2\2" +
                    "\2\u00c7\u00c8\7\6\2\2\u00c8\u00c9\7F\2\2\u00c9\u00ca\5\22\n\2\u00ca\u00cb" +
                    "\7F\2\2\u00cb\u00cc\7\b\2\2\u00cc\u00cd\7F\2\2\u00cd\u00ce\5\24\13\2\u00ce" +
                    "\u00cf\7F\2\2\u00cf\u00d0\7\t\2\2\u00d0\u00d1\7F\2\2\u00d1\u00d2\5T+\2" +
                    "\u00d2\u00d3\7F\2\2\u00d3\u00d4\7\7\2\2\u00d4\21\3\2\2\2\u00d5\u00d6\7" +
                    "@\2\2\u00d6\u00d7\5t;\2\u00d7\u00d8\7@\2\2\u00d8\23\3\2\2\2\u00d9\u00da" +
                    "\5\26\f\2\u00da\u00db\7F\2\2\u00db\u00e2\7<\2\2\u00dc\u00de\5\30\r\2\u00dd" +
                    "\u00df\7>\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2" +
                    "\2\2\u00e0\u00dc\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2" +
                    "\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00ea\7=" +
                    "\2\2\u00e6\u00e7\7F\2\2\u00e7\u00e9\5(\25\2\u00e8\u00e6\3\2\2\2\u00e9" +
                    "\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\25\3\2\2" +
                    "\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\5v<\2\u00ee\u00ef\7F\2\2\u00ef\u00f0" +
                    "\7\n\2\2\u00f0\27\3\2\2\2\u00f1\u00f3\5\34\17\2\u00f2\u00f4\7F\2\2\u00f3" +
                    "\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\5\36" +
                    "\20\2\u00f6\u00f8\7F\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8" +
                    "\u00fb\3\2\2\2\u00f9\u00fc\5v<\2\u00fa\u00fc\5t;\2\u00fb\u00f9\3\2\2\2" +
                    "\u00fb\u00fa\3\2\2\2\u00fc\31\3\2\2\2\u00fd\u00fe\t\2\2\2\u00fe\33\3\2" +
                    "\2\2\u00ff\u0100\t\3\2\2\u0100\35\3\2\2\2\u0101\u0102\t\4\2\2\u0102\37" +
                    "\3\2\2\2\u0103\u0104\t\5\2\2\u0104!\3\2\2\2\u0105\u0106\t\6\2\2\u0106" +
                    "#\3\2\2\2\u0107\u0108\t\7\2\2\u0108%\3\2\2\2\u0109\u010a\t\b\2\2\u010a" +
                    "\'\3\2\2\2\u010b\u010f\5*\26\2\u010c\u010f\5P)\2\u010d\u010f\5R*\2\u010e" +
                    "\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f)\3\2\2\2" +
                    "\u0110\u0114\5,\27\2\u0111\u0114\5.\30\2\u0112\u0114\5\60\31\2\u0113\u0110" +
                    "\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114+\3\2\2\2\u0115" +
                    "\u0116\5v<\2\u0116\u0117\7C\2\2\u0117\u0119\5\32\16\2\u0118\u011a\7F\2" +
                    "\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d" +
                    "\5\36\20\2\u011c\u011e\7F\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2" +
                    "\u011e\u011f\3\2\2\2\u011f\u0120\5v<\2\u0120-\3\2\2\2\u0121\u0122\5t;" +
                    "\2\u0122\u0123\7C\2\2\u0123\u0125\5l\67\2\u0124\u0126\7F\2\2\u0125\u0124" +
                    "\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\5\36\20\2" +
                    "\u0128\u012a\7F\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b" +
                    "\3\2\2\2\u012b\u012c\5&\24\2\u012c/\3\2\2\2\u012d\u0130\5\62\32\2\u012e" +
                    "\u0130\5\64\33\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\61\3\2" +
                    "\2\2\u0131\u0132\5v<\2\u0132\u0133\7C\2\2\u0133\u0135\7\23\2\2\u0134\u0136" +
                    "\7F\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137" +
                    "\u0139\5 \21\2\u0138\u013a\7F\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2" +
                    "\2\2\u013a\u013b\3\2\2\2\u013b\u013c\5r:\2\u013c\63\3\2\2\2\u013d\u013e" +
                    "\5v<\2\u013e\u013f\7C\2\2\u013f\u0141\5\66\34\2\u0140\u0142\7F\2\2\u0141" +
                    "\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\5\36" +
                    "\20\2\u0144\u0146\7F\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146" +
                    "\u0147\3\2\2\2\u0147\u0148\58\35\2\u0148\u019e\3\2\2\2\u0149\u014a\5v" +
                    "<\2\u014a\u014b\7C\2\2\u014b\u014d\5\66\34\2\u014c\u014e\7F\2\2\u014d" +
                    "\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\5\"" +
                    "\22\2\u0150\u0152\7F\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152" +
                    "\u0153\3\2\2\2\u0153\u0154\5F$\2\u0154\u019e\3\2\2\2\u0155\u0156\5v<\2" +
                    "\u0156\u0157\7C\2\2\u0157\u0159\5:\36\2\u0158\u015a\7F\2\2\u0159\u0158" +
                    "\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\5 \21\2\u015c" +
                    "\u015e\7F\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2" +
                    "\2\2\u015f\u0160\5<\37\2\u0160\u019e\3\2\2\2\u0161\u0162\5v<\2\u0162\u0163" +
                    "\7C\2\2\u0163\u0165\5:\36\2\u0164\u0166\7F\2\2\u0165\u0164\3\2\2\2\u0165" +
                    "\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\5\"\22\2\u0168\u016a\7" +
                    "F\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b" +
                    "\u016c\5H%\2\u016c\u019e\3\2\2\2\u016d\u016e\5v<\2\u016e\u016f\7C\2\2" +
                    "\u016f\u0171\5> \2\u0170\u0172\7F\2\2\u0171\u0170\3\2\2\2\u0171\u0172" +
                    "\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\5 \21\2\u0174\u0176\7F\2\2\u0175" +
                    "\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\5@" +
                    "!\2\u0178\u019e\3\2\2\2\u0179\u017a\5v<\2\u017a\u017b\7C\2\2\u017b\u017d" +
                    "\5> \2\u017c\u017e\7F\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e" +
                    "\u017f\3\2\2\2\u017f\u0181\5\"\22\2\u0180\u0182\7F\2\2\u0181\u0180\3\2" +
                    "\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\5J&\2\u0184\u019e" +
                    "\3\2\2\2\u0185\u0186\5v<\2\u0186\u0187\7C\2\2\u0187\u0189\5B\"\2\u0188" +
                    "\u018a\7F\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2" +
                    "\2\2\u018b\u018d\5 \21\2\u018c\u018e\7F\2\2\u018d\u018c\3\2\2\2\u018d" +
                    "\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\5D#\2\u0190\u019e\3\2\2" +
                    "\2\u0191\u0192\5v<\2\u0192\u0193\7C\2\2\u0193\u0195\5B\"\2\u0194\u0196" +
                    "\7F\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197" +
                    "\u0199\5\"\22\2\u0198\u019a\7F\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2" +
                    "\2\2\u019a\u019b\3\2\2\2\u019b\u019c\5L\'\2\u019c\u019e\3\2\2\2\u019d" +
                    "\u013d\3\2\2\2\u019d\u0149\3\2\2\2\u019d\u0155\3\2\2\2\u019d\u0161\3\2" +
                    "\2\2\u019d\u016d\3\2\2\2\u019d\u0179\3\2\2\2\u019d\u0185\3\2\2\2\u019d" +
                    "\u0191\3\2\2\2\u019e\65\3\2\2\2\u019f\u01a0\7\24\2\2\u01a0\67\3\2\2\2" +
                    "\u01a1\u01a2\7\"\2\2\u01a29\3\2\2\2\u01a3\u01a4\7\25\2\2\u01a4;\3\2\2" +
                    "\2\u01a5\u01a6\78\2\2\u01a6\u01a7\78\2\2\u01a7=\3\2\2\2\u01a8\u01a9\7" +
                    "\31\2\2\u01a9?\3\2\2\2\u01aa\u01ab\7#\2\2\u01abA\3\2\2\2\u01ac\u01ad\7" +
                    "\32\2\2\u01adC\3\2\2\2\u01ae\u01af\78\2\2\u01af\u01b0\78\2\2\u01b0\u01b1" +
                    "\78\2\2\u01b1\u01b2\78\2\2\u01b2E\3\2\2\2\u01b3\u01b4\7A\2\2\u01b4\u01b5" +
                    "\7\"\2\2\u01b5\u01b6\7C\2\2\u01b6\u01b7\7C\2\2\u01b7\u01b8\7\"\2\2\u01b8" +
                    "\u01b9\7B\2\2\u01b9G\3\2\2\2\u01ba\u01bb\7A\2\2\u01bb\u01bc\78\2\2\u01bc" +
                    "\u01bd\78\2\2\u01bd\u01be\7C\2\2\u01be\u01bf\7C\2\2\u01bf\u01c0\78\2\2" +
                    "\u01c0\u01c1\78\2\2\u01c1\u01c2\7B\2\2\u01c2I\3\2\2\2\u01c3\u01c4\7A\2" +
                    "\2\u01c4\u01c5\7#\2\2\u01c5\u01c6\7C\2\2\u01c6\u01c7\7C\2\2\u01c7\u01c8" +
                    "\7#\2\2\u01c8\u01c9\7B\2\2\u01c9K\3\2\2\2\u01ca\u01cb\7A\2\2\u01cb\u01cc" +
                    "\78\2\2\u01cc\u01cd\78\2\2\u01cd\u01ce\78\2\2\u01ce\u01cf\78\2\2\u01cf" +
                    "\u01d0\7C\2\2\u01d0\u01d1\7C\2\2\u01d1\u01d2\78\2\2\u01d2\u01d3\78\2\2" +
                    "\u01d3\u01d4\78\2\2\u01d4\u01d5\78\2\2\u01d5\u01d6\7B\2\2\u01d6M\3\2\2" +
                    "\2\u01d7\u01d8\t\t\2\2\u01d8O\3\2\2\2\u01d9\u01db\5N(\2\u01da\u01dc\7" +
                    "F\2\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd" +
                    "\u01de\7<\2\2\u01de\u01df\5t;\2\u01df\u01e1\7>\2\2\u01e0\u01e2\7F\2\2" +
                    "\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4" +
                    "\5v<\2\u01e4\u01e6\7>\2\2\u01e5\u01e7\7F\2\2\u01e6\u01e5\3\2\2\2\u01e6" +
                    "\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\5v<\2\u01e9\u01eb\7>\2" +
                    "\2\u01ea\u01ec\7F\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed" +
                    "\3\2\2\2\u01ed\u01ee\5|?\2\u01ee\u01f0\7>\2\2\u01ef\u01f1\7F\2\2\u01f0" +
                    "\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\5l" +
                    "\67\2\u01f3\u01f4\7=\2\2\u01f4Q\3\2\2\2\u01f5\u01f7\5t;\2\u01f6\u01f8" +
                    "\7F\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9" +
                    "\u01fb\5\"\22\2\u01fa\u01fc\7F\2\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2" +
                    "\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\5v<\2\u01fe\u01ff\7C\2\2\u01ff\u0200" +
                    "\5n8\2\u0200S\3\2\2\2\u0201\u0208\5X-\2\u0202\u0204\7F\2\2\u0203\u0202" +
                    "\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\5V,\2\u0206" +
                    "\u0203\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2" +
                    "\2\2\u0209U\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u0211\5d\63\2\u020c\u0211" +
                    "\5f\64\2\u020d\u0211\5b\62\2\u020e\u0211\5j\66\2\u020f\u0211\5.\30\2\u0210" +
                    "\u020b\3\2\2\2\u0210\u020c\3\2\2\2\u0210\u020d\3\2\2\2\u0210\u020e\3\2" +
                    "\2\2\u0210\u020f\3\2\2\2\u0211W\3\2\2\2\u0212\u0219\5^\60\2\u0213\u0219" +
                    "\5d\63\2\u0214\u0219\5f\64\2\u0215\u0219\5b\62\2\u0216\u0219\5j\66\2\u0217" +
                    "\u0219\5.\30\2\u0218\u0212\3\2\2\2\u0218\u0213\3\2\2\2\u0218\u0214\3\2" +
                    "\2\2\u0218\u0215\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219" +
                    "Y\3\2\2\2\u021a\u021b\7\t\2\2\u021b\u021c\7F\2\2\u021c\u0225\5V,\2\u021d" +
                    "\u0221\7F\2\2\u021e\u0222\5j\66\2\u021f\u0222\5.\30\2\u0220\u0222\5b\62" +
                    "\2\u0221\u021e\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222\u0224" +
                    "\3\2\2\2\u0223\u021d\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225" +
                    "\u0226\3\2\2\2\u0226[\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0229\7F\2\2\u0229" +
                    "\u022a\7\63\2\2\u022a\u022b\7F\2\2\u022b\u0234\5V,\2\u022c\u0230\7F\2" +
                    "\2\u022d\u0231\5j\66\2\u022e\u0231\5.\30\2\u022f\u0231\5b\62\2\u0230\u022d" +
                    "\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231\u0233\3\2\2\2\u0232" +
                    "\u022c\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2" +
                    "\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u0228\3\2\2\2\u0237" +
                    "\u0238\3\2\2\2\u0238]\3\2\2\2\u0239\u023a\7\62\2\2\u023a\u023b\7F\2\2" +
                    "\u023b\u023c\5`\61\2\u023c\u023d\7F\2\2\u023d\u023e\5Z.\2\u023e\u023f" +
                    "\5\\/\2\u023f\u0240\7F\2\2\u0240\u0241\7\64\2\2\u0241_\3\2\2\2\u0242\u0244" +
                    "\7<\2\2\u0243\u0245\7F\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245" +
                    "\u0247\3\2\2\2\u0246\u0248\7!\2\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2" +
                    "\2\2\u0248\u0249\3\2\2\2\u0249\u0255\5(\25\2\u024a\u024c\7F\2\2\u024b" +
                    "\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\5$" +
                    "\23\2\u024e\u0250\7F\2\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250" +
                    "\u0251\3\2\2\2\u0251\u0252\5(\25\2\u0252\u0254\3\2\2\2\u0253\u024b\3\2" +
                    "\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256" +
                    "\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u025a\7F\2\2\u0259\u0258\3\2" +
                    "\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\7=\2\2\u025c" +
                    "a\3\2\2\2\u025d\u025e\7.\2\2\u025e\u025f\7F\2\2\u025f\u0260\5v<\2\u0260" +
                    "c\3\2\2\2\u0261\u0263\7,\2\2\u0262\u0264\7F\2\2\u0263\u0262\3\2\2\2\u0263" +
                    "\u0264\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\7<\2\2\u0266\u0267\5l\67" +
                    "\2\u0267\u0268\7=\2\2\u0268e\3\2\2\2\u0269\u026a\7-\2\2\u026ag\3\2\2\2" +
                    "\u026b\u026c\t\n\2\2\u026ci\3\2\2\2\u026d\u026e\5v<\2\u026e\u026f\7C\2" +
                    "\2\u026f\u0271\5n8\2\u0270\u0272\7F\2\2\u0271\u0270\3\2\2\2\u0271\u0272" +
                    "\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\5h\65\2\u0274\u0276\7F\2\2\u0275" +
                    "\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\5t" +
                    ";\2\u0278\u0279\7<\2\2\u0279\u027c\5v<\2\u027a\u027b\7>\2\2\u027b\u027d" +
                    "\5p9\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e" +
                    "\u027f\7=\2\2\u027fk\3\2\2\2\u0280\u0281\t\13\2\2\u0281m\3\2\2\2\u0282" +
                    "\u0283\t\f\2\2\u0283o\3\2\2\2\u0284\u0285\5r:\2\u0285q\3\2\2\2\u0286\u0287" +
                    "\7@\2\2\u0287\u0288\78\2\2\u0288\u0289\78\2\2\u0289\u028a\7D\2\2\u028a" +
                    "\u028b\78\2\2\u028b\u028c\78\2\2\u028c\u028d\7D\2\2\u028d\u028e\78\2\2" +
                    "\u028e\u028f\78\2\2\u028f\u0290\78\2\2\u0290\u0291\78\2\2\u0291\u0292" +
                    "\7F\2\2\u0292\u0293\78\2\2\u0293\u0294\78\2\2\u0294\u0295\7:\2\2\u0295" +
                    "\u0296\78\2\2\u0296\u0297\78\2\2\u0297\u0298\7:\2\2\u0298\u0299\78\2\2" +
                    "\u0299\u029a\78\2\2\u029a\u029b\7@\2\2\u029bs\3\2\2\2\u029c\u02a0\7\67" +
                    "\2\2\u029d\u029f\t\r\2\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0" +
                    "\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1u\3\2\2\2\u02a2\u02a0\3\2\2\2" +
                    "\u02a3\u02a7\7\66\2\2\u02a4\u02a6\t\r\2\2\u02a5\u02a4\3\2\2\2\u02a6\u02a9" +
                    "\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8w\3\2\2\2\u02a9" +
                    "\u02a7\3\2\2\2\u02aa\u02ab\5v<\2\u02aby\3\2\2\2\u02ac\u02ad\5t;\2\u02ad" +
                    "{\3\2\2\2\u02ae\u02b2\7@\2\2\u02af\u02b1\t\16\2\2\u02b0\u02af\3\2\2\2" +
                    "\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5" +
                    "\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6\7@\2\2\u02b6}\3\2\2\2I\177\u0083" +
                    "\u0087\u008e\u0094\u009d\u00a2\u00ae\u00ba\u00c4\u00de\u00e2\u00ea\u00f3" +
                    "\u00f7\u00fb\u010e\u0113\u0119\u011d\u0125\u0129\u012f\u0135\u0139\u0141" +
                    "\u0145\u014d\u0151\u0159\u015d\u0165\u0169\u0171\u0175\u017d\u0181\u0189" +
                    "\u018d\u0195\u0199\u019d\u01db\u01e1\u01e6\u01eb\u01f0\u01f7\u01fb\u0203" +
                    "\u0208\u0210\u0218\u0221\u0225\u0230\u0234\u0237\u0244\u0247\u024b\u024f" +
                    "\u0255\u0259\u0263\u0271\u0275\u027c\u02a0\u02a7\u02b2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}