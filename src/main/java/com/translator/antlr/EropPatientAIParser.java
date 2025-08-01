// Generated from EropPatientAI.g4 by ANTLR 4.4
package com.translator.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EropPatientAIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, ROLEPLAYER=5, BUSINESSOP=6, COMPOBLIG=7, 
		RULE=8, END=9, WHEN=10, THEN=11, MATCHES=12, HAPPENED=13, CTHAPPENED=14, 
		BEFORE=15, AFTER=16, BOTYPE=17, ORIGINATOR=18, RESPONDER=19, OUTCOME=20, 
		TIMESTAMP=21, DAY=22, DATE=23, TIME=24, SECOND=25, MINUTE=26, HOUR=27, 
		MONTH=28, YEAR=29, IN=30, NOTIN=31, SUCCESS=32, TECFAIL=33, BIZFAIL=34, 
		INITFAIL=35, ADDROP=36, REMROP=37, TERMINATE=38, PASS=39, OBLIGS=40, RIGHTS=41, 
		PROHIBS=42, IF=43, ELSE=44, ENDIF=45, OTHERWISE=46, WEEKDAY=47, MONTHID=48, 
		EQUALS=49, NOTEQ=50, AND=51, OR=52, NOT=53, LESS=54, LESSEQ=55, GREATER=56, 
		GREATEREQ=57, ASTERISK=58, SEMICOLON=59, COLON=60, HASH=61, BRA=62, KET=63, 
		COMMA=64, QUOTE=65, DQUOTE=66, SQUAREBRA=67, SQUAREKET=68, DOT=69, DASH=70, 
		UNDERSCORE=71, BACKSLASH=72, IDENTIFIER=73, LOWER=74, UPPER=75, DIGIT=76, 
		WS=77, SPACE=78, COMMENT=79;
	public static final String[] tokenNames = {
		"<INVALID>", "'s'", "'d'", "'h'", "'m'", "'roleplayer'", "'businessoperation'", 
		"'compoblig'", "'rule'", "'end'", "'when'", "'then'", "'matches'", "'happened'", 
		"'counthappened'", "'before'", "'after'", "'botype'", "'originator'", 
		"'responder'", "'outcome'", "'timestamp'", "'day'", "'date'", "'time'", 
		"'second'", "'minute'", "'hour'", "'month'", "'year'", "'in'", "'!in'", 
		"'Success'", "'TecFail'", "'BizFail'", "'InitFail'", "'+='", "'-='", "'terminate'", 
		"'pass'", "'obligs'", "'rights'", "'prohibs'", "'if'", "'else'", "'endif'", 
		"'Otherwise'", "WEEKDAY", "MONTHID", "'=='", "'!='", "'&&'", "'||'", "'!'", 
		"'<'", "'<='", "'>'", "'>='", "'*'", "';'", "':'", "'//'", "'('", "')'", 
		"','", "'''", "'\"'", "'['", "']'", "'.'", "'-'", "'_'", "'\\'", "IDENTIFIER", 
		"LOWER", "UPPER", "DIGIT", "WS", "' '", "COMMENT"
	};
	public static final int
		RULE_contractDocument = 0, RULE_declaration = 1, RULE_roleplayerDeclaration = 2, 
		RULE_businessOpDeclaration = 3, RULE_compobligDeclaration = 4, RULE_identifierList = 5, 
		RULE_ruleSet = 6, RULE_singlerule = 7, RULE_rulename = 8, RULE_lhs = 9, 
		RULE_constraintList = 10, RULE_eventmatch = 11, RULE_eventCondition = 12, 
		RULE_businessOpReference = 13, RULE_constraint = 14, RULE_logicalOperator = 15, 
		RULE_attributeConstraint = 16, RULE_roleplayerConstraint = 17, RULE_outcomeConstraint = 18, 
		RULE_booleanConstraint = 19, RULE_timeConstraint = 20, RULE_timeDirectComparison = 21, 
		RULE_timePartialComparison = 22, RULE_historicalQuery = 23, RULE_rolePlayerRef = 24, 
		RULE_timeConstraintString = 25, RULE_timeConstraintContent = 26, RULE_ropConstraint = 27, 
		RULE_rhs = 28, RULE_statusGuardBlock = 29, RULE_statusGuard = 30, RULE_rhsactionList = 31, 
		RULE_rhsaction = 32, RULE_ifstatement = 33, RULE_conditionExpr = 34, RULE_conditionTerm = 35, 
		RULE_simpleCondition = 36, RULE_logicalExpression = 37, RULE_comparisonExpression = 38, 
		RULE_happened_expression = 39, RULE_historicalParams = 40, RULE_termaction = 41, 
		RULE_passaction = 42, RULE_addaction = 43, RULE_remaction = 44, RULE_actionResponder = 45, 
		RULE_ropEntity = 46, RULE_outcome = 47, RULE_ropset = 48, RULE_timeSpec = 49, 
		RULE_absoluteTime = 50, RULE_relativeTime = 51, RULE_timeUnit = 52;
	public static final String[] ruleNames = {
		"contractDocument", "declaration", "roleplayerDeclaration", "businessOpDeclaration", 
		"compobligDeclaration", "identifierList", "ruleSet", "singlerule", "rulename", 
		"lhs", "constraintList", "eventmatch", "eventCondition", "businessOpReference", 
		"constraint", "logicalOperator", "attributeConstraint", "roleplayerConstraint", 
		"outcomeConstraint", "booleanConstraint", "timeConstraint", "timeDirectComparison", 
		"timePartialComparison", "historicalQuery", "rolePlayerRef", "timeConstraintString", 
		"timeConstraintContent", "ropConstraint", "rhs", "statusGuardBlock", "statusGuard", 
		"rhsactionList", "rhsaction", "ifstatement", "conditionExpr", "conditionTerm", 
		"simpleCondition", "logicalExpression", "comparisonExpression", "happened_expression", 
		"historicalParams", "termaction", "passaction", "addaction", "remaction", 
		"actionResponder", "ropEntity", "outcome", "ropset", "timeSpec", "absoluteTime", 
		"relativeTime", "timeUnit"
	};

	@Override
	public String getGrammarFileName() { return "EropPatientAI.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EropPatientAIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ContractDocumentContext extends ParserRuleContext {
		public RuleSetContext ruleSet() {
			return getRuleContext(RuleSetContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(EropPatientAIParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(EropPatientAIParser.WS); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ContractDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterContractDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitContractDocument(this);
		}
	}

	public final ContractDocumentContext contractDocument() throws RecognitionException {
		ContractDocumentContext _localctx = new ContractDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_contractDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106); declaration();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROLEPLAYER) | (1L << BUSINESSOP) | (1L << COMPOBLIG))) != 0) );
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(111); match(WS);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117); ruleSet();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompositeObligationContext extends DeclarationContext {
		public CompobligDeclarationContext compobligDeclaration() {
			return getRuleContext(CompobligDeclarationContext.class,0);
		}
		public CompositeObligationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterCompositeObligation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitCompositeObligation(this);
		}
	}
	public static class GovernanceOperationContext extends DeclarationContext {
		public BusinessOpDeclarationContext businessOpDeclaration() {
			return getRuleContext(BusinessOpDeclarationContext.class,0);
		}
		public GovernanceOperationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterGovernanceOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitGovernanceOperation(this);
		}
	}
	public static class RolePlayerContext extends DeclarationContext {
		public RoleplayerDeclarationContext roleplayerDeclaration() {
			return getRuleContext(RoleplayerDeclarationContext.class,0);
		}
		public RolePlayerContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRolePlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRolePlayer(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(122);
			switch (_input.LA(1)) {
			case ROLEPLAYER:
				_localctx = new RolePlayerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119); roleplayerDeclaration();
				}
				break;
			case BUSINESSOP:
				_localctx = new GovernanceOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120); businessOpDeclaration();
				}
				break;
			case COMPOBLIG:
				_localctx = new CompositeObligationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121); compobligDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleplayerDeclarationContext extends ParserRuleContext {
		public TerminalNode ROLEPLAYER() { return getToken(EropPatientAIParser.ROLEPLAYER, 0); }
		public TerminalNode SEMICOLON() { return getToken(EropPatientAIParser.SEMICOLON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public RoleplayerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleplayerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRoleplayerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRoleplayerDeclaration(this);
		}
	}

	public final RoleplayerDeclarationContext roleplayerDeclaration() throws RecognitionException {
		RoleplayerDeclarationContext _localctx = new RoleplayerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_roleplayerDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(ROLEPLAYER);
			setState(125); identifierList();
			setState(126); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BusinessOpDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(EropPatientAIParser.SEMICOLON, 0); }
		public BusinessOpReferenceContext businessOpReference() {
			return getRuleContext(BusinessOpReferenceContext.class,0);
		}
		public TerminalNode BUSINESSOP() { return getToken(EropPatientAIParser.BUSINESSOP, 0); }
		public BusinessOpDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_businessOpDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterBusinessOpDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitBusinessOpDeclaration(this);
		}
	}

	public final BusinessOpDeclarationContext businessOpDeclaration() throws RecognitionException {
		BusinessOpDeclarationContext _localctx = new BusinessOpDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_businessOpDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(BUSINESSOP);
			setState(129); businessOpReference();
			setState(130); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompobligDeclarationContext extends ParserRuleContext {
		public TerminalNode KET() { return getToken(EropPatientAIParser.KET, 0); }
		public TerminalNode SEMICOLON() { return getToken(EropPatientAIParser.SEMICOLON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COMPOBLIG() { return getToken(EropPatientAIParser.COMPOBLIG, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public TerminalNode BRA() { return getToken(EropPatientAIParser.BRA, 0); }
		public CompobligDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compobligDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterCompobligDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitCompobligDeclaration(this);
		}
	}

	public final CompobligDeclarationContext compobligDeclaration() throws RecognitionException {
		CompobligDeclarationContext _localctx = new CompobligDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compobligDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(COMPOBLIG);
			setState(133); match(IDENTIFIER);
			setState(134); match(BRA);
			setState(135); identifierList();
			setState(136); match(KET);
			setState(137); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(EropPatientAIParser.COMMA); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EropPatientAIParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EropPatientAIParser.IDENTIFIER); }
		public TerminalNode COMMA(int i) {
			return getToken(EropPatientAIParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(IDENTIFIER);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(140); match(COMMA);
				setState(141); match(IDENTIFIER);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleSetContext extends ParserRuleContext {
		public SingleruleContext singlerule(int i) {
			return getRuleContext(SingleruleContext.class,i);
		}
		public List<SingleruleContext> singlerule() {
			return getRuleContexts(SingleruleContext.class);
		}
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRuleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRuleSet(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ruleSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147); singlerule();
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RULE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleruleContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(EropPatientAIParser.RULE, 0); }
		public RulenameContext rulename() {
			return getRuleContext(RulenameContext.class,0);
		}
		public TerminalNode THEN() { return getToken(EropPatientAIParser.THEN, 0); }
		public TerminalNode WHEN() { return getToken(EropPatientAIParser.WHEN, 0); }
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public TerminalNode END() { return getToken(EropPatientAIParser.END, 0); }
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public SingleruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlerule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterSinglerule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitSinglerule(this);
		}
	}

	public final SingleruleContext singlerule() throws RecognitionException {
		SingleruleContext _localctx = new SingleruleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_singlerule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(RULE);
			setState(153); rulename();
			setState(154); match(WHEN);
			setState(155); lhs();
			setState(156); match(THEN);
			setState(157); rhs();
			setState(158); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulenameContext extends ParserRuleContext {
		public List<TerminalNode> DQUOTE() { return getTokens(EropPatientAIParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(EropPatientAIParser.DQUOTE, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public RulenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRulename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRulename(this);
		}
	}

	public final RulenameContext rulename() throws RecognitionException {
		RulenameContext _localctx = new RulenameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rulename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(DQUOTE);
			setState(161); match(IDENTIFIER);
			setState(162); match(DQUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LhsContext extends ParserRuleContext {
		public EventmatchContext eventmatch() {
			return getRuleContext(EventmatchContext.class,0);
		}
		public ConstraintListContext constraintList() {
			return getRuleContext(ConstraintListContext.class,0);
		}
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitLhs(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lhs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); eventmatch();
			setState(166);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (HAPPENED - 13)) | (1L << (CTHAPPENED - 13)) | (1L << (NOT - 13)) | (1L << (BRA - 13)) | (1L << (IDENTIFIER - 13)))) != 0)) {
				{
				setState(165); constraintList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintListContext extends ParserRuleContext {
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public LogicalOperatorContext logicalOperator(int i) {
			return getRuleContext(LogicalOperatorContext.class,i);
		}
		public List<LogicalOperatorContext> logicalOperator() {
			return getRuleContexts(LogicalOperatorContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public ConstraintListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterConstraintList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitConstraintList(this);
		}
	}

	public final ConstraintListContext constraintList() throws RecognitionException {
		ConstraintListContext _localctx = new ConstraintListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constraintList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); constraint();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(169); logicalOperator();
				setState(170); constraint();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventmatchContext extends ParserRuleContext {
		public TerminalNode KET() { return getToken(EropPatientAIParser.KET, 0); }
		public TerminalNode MATCHES() { return getToken(EropPatientAIParser.MATCHES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EropPatientAIParser.COMMA); }
		public EventConditionContext eventCondition(int i) {
			return getRuleContext(EventConditionContext.class,i);
		}
		public List<EventConditionContext> eventCondition() {
			return getRuleContexts(EventConditionContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public TerminalNode BRA() { return getToken(EropPatientAIParser.BRA, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(EropPatientAIParser.COMMA, i);
		}
		public EventmatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventmatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterEventmatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitEventmatch(this);
		}
	}

	public final EventmatchContext eventmatch() throws RecognitionException {
		EventmatchContext _localctx = new EventmatchContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eventmatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(IDENTIFIER);
			setState(178); match(MATCHES);
			setState(179); match(BRA);
			setState(180); eventCondition();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(181); match(COMMA);
				setState(182); eventCondition();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188); match(KET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventConditionContext extends ParserRuleContext {
		public EventConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventCondition; }
	 
		public EventConditionContext() { }
		public void copyFrom(EventConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OriginatorContext extends EventConditionContext {
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public TerminalNode ORIGINATOR() { return getToken(EropPatientAIParser.ORIGINATOR, 0); }
		public OriginatorContext(EventConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterOriginator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitOriginator(this);
		}
	}
	public static class OutcomeConditionContext extends EventConditionContext {
		public TerminalNode OUTCOME() { return getToken(EropPatientAIParser.OUTCOME, 0); }
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public OutcomeContext outcome() {
			return getRuleContext(OutcomeContext.class,0);
		}
		public OutcomeConditionContext(EventConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterOutcomeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitOutcomeCondition(this);
		}
	}
	public static class GovernanceOperationTypeContext extends EventConditionContext {
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public TerminalNode BOTYPE() { return getToken(EropPatientAIParser.BOTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public GovernanceOperationTypeContext(EventConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterGovernanceOperationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitGovernanceOperationType(this);
		}
	}
	public static class ResponderContext extends EventConditionContext {
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public TerminalNode RESPONDER() { return getToken(EropPatientAIParser.RESPONDER, 0); }
		public ResponderContext(EventConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterResponder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitResponder(this);
		}
	}

	public final EventConditionContext eventCondition() throws RecognitionException {
		EventConditionContext _localctx = new EventConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_eventCondition);
		try {
			setState(202);
			switch (_input.LA(1)) {
			case BOTYPE:
				_localctx = new GovernanceOperationTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(190); match(BOTYPE);
				setState(191); match(EQUALS);
				setState(192); match(IDENTIFIER);
				}
				}
				break;
			case ORIGINATOR:
				_localctx = new OriginatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(193); match(ORIGINATOR);
				setState(194); match(EQUALS);
				setState(195); match(IDENTIFIER);
				}
				}
				break;
			case RESPONDER:
				_localctx = new ResponderContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(196); match(RESPONDER);
				setState(197); match(EQUALS);
				setState(198); match(IDENTIFIER);
				}
				}
				break;
			case OUTCOME:
				_localctx = new OutcomeConditionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(199); match(OUTCOME);
				setState(200); match(EQUALS);
				setState(201); outcome();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BusinessOpReferenceContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(EropPatientAIParser.COMMA); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EropPatientAIParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EropPatientAIParser.IDENTIFIER); }
		public TerminalNode COMMA(int i) {
			return getToken(EropPatientAIParser.COMMA, i);
		}
		public BusinessOpReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_businessOpReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterBusinessOpReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitBusinessOpReference(this);
		}
	}

	public final BusinessOpReferenceContext businessOpReference() throws RecognitionException {
		BusinessOpReferenceContext _localctx = new BusinessOpReferenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_businessOpReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(IDENTIFIER);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205); match(COMMA);
				setState(206); match(IDENTIFIER);
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
	 
		public ConstraintContext() { }
		public void copyFrom(ConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstraintsContext extends ConstraintContext {
		public TerminalNode KET() { return getToken(EropPatientAIParser.KET, 0); }
		public ConstraintListContext constraintList() {
			return getRuleContext(ConstraintListContext.class,0);
		}
		public TerminalNode BRA() { return getToken(EropPatientAIParser.BRA, 0); }
		public ConstraintsContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitConstraints(this);
		}
	}
	public static class NotConstraintContext extends ConstraintContext {
		public TerminalNode NOT() { return getToken(EropPatientAIParser.NOT, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public NotConstraintContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterNotConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitNotConstraint(this);
		}
	}
	public static class AttributeConstraintItemContext extends ConstraintContext {
		public AttributeConstraintContext attributeConstraint() {
			return getRuleContext(AttributeConstraintContext.class,0);
		}
		public AttributeConstraintItemContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterAttributeConstraintItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitAttributeConstraintItem(this);
		}
	}
	public static class HistoricalQueryItemContext extends ConstraintContext {
		public HistoricalQueryContext historicalQuery() {
			return getRuleContext(HistoricalQueryContext.class,0);
		}
		public HistoricalQueryItemContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterHistoricalQueryItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitHistoricalQueryItem(this);
		}
	}
	public static class RopConstraintItemContext extends ConstraintContext {
		public RopConstraintContext ropConstraint() {
			return getRuleContext(RopConstraintContext.class,0);
		}
		public RopConstraintItemContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRopConstraintItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRopConstraintItem(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constraint);
		try {
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new NotConstraintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212); match(NOT);
				setState(213); constraint();
				}
				break;
			case 2:
				_localctx = new ConstraintsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214); match(BRA);
				setState(215); constraintList();
				setState(216); match(KET);
				}
				break;
			case 3:
				_localctx = new AttributeConstraintItemContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(218); attributeConstraint();
				}
				break;
			case 4:
				_localctx = new HistoricalQueryItemContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(219); historicalQuery();
				}
				break;
			case 5:
				_localctx = new RopConstraintItemContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(220); ropConstraint();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(EropPatientAIParser.AND, 0); }
		public TerminalNode OR() { return getToken(EropPatientAIParser.OR, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitLogicalOperator(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeConstraintContext extends ParserRuleContext {
		public AttributeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeConstraint; }
	 
		public AttributeConstraintContext() { }
		public void copyFrom(AttributeConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeConstraintAttrContext extends AttributeConstraintContext {
		public TimeConstraintContext timeConstraint() {
			return getRuleContext(TimeConstraintContext.class,0);
		}
		public TimeConstraintAttrContext(AttributeConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterTimeConstraintAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitTimeConstraintAttr(this);
		}
	}
	public static class OutcomeConstraintAttrContext extends AttributeConstraintContext {
		public OutcomeConstraintContext outcomeConstraint() {
			return getRuleContext(OutcomeConstraintContext.class,0);
		}
		public OutcomeConstraintAttrContext(AttributeConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterOutcomeConstraintAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitOutcomeConstraintAttr(this);
		}
	}
	public static class RolePlayerConstraintAttrContext extends AttributeConstraintContext {
		public RoleplayerConstraintContext roleplayerConstraint() {
			return getRuleContext(RoleplayerConstraintContext.class,0);
		}
		public RolePlayerConstraintAttrContext(AttributeConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRolePlayerConstraintAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRolePlayerConstraintAttr(this);
		}
	}
	public static class BooleanConstraintAttrContext extends AttributeConstraintContext {
		public BooleanConstraintContext booleanConstraint() {
			return getRuleContext(BooleanConstraintContext.class,0);
		}
		public BooleanConstraintAttrContext(AttributeConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterBooleanConstraintAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitBooleanConstraintAttr(this);
		}
	}

	public final AttributeConstraintContext attributeConstraint() throws RecognitionException {
		AttributeConstraintContext _localctx = new AttributeConstraintContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attributeConstraint);
		try {
			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new RolePlayerConstraintAttrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225); roleplayerConstraint();
				}
				break;
			case 2:
				_localctx = new OutcomeConstraintAttrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226); outcomeConstraint();
				}
				break;
			case 3:
				_localctx = new TimeConstraintAttrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227); timeConstraint();
				}
				break;
			case 4:
				_localctx = new BooleanConstraintAttrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(228); booleanConstraint();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleplayerConstraintContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EropPatientAIParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EropPatientAIParser.IDENTIFIER); }
		public TerminalNode ORIGINATOR() { return getToken(EropPatientAIParser.ORIGINATOR, 0); }
		public TerminalNode NOTEQ() { return getToken(EropPatientAIParser.NOTEQ, 0); }
		public TerminalNode RESPONDER() { return getToken(EropPatientAIParser.RESPONDER, 0); }
		public RoleplayerConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleplayerConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRoleplayerConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRoleplayerConstraint(this);
		}
	}

	public final RoleplayerConstraintContext roleplayerConstraint() throws RecognitionException {
		RoleplayerConstraintContext _localctx = new RoleplayerConstraintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_roleplayerConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(IDENTIFIER);
			setState(232); match(DOT);
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==ORIGINATOR || _la==RESPONDER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(234);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NOTEQ) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(235); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutcomeConstraintContext extends ParserRuleContext {
		public TerminalNode OUTCOME() { return getToken(EropPatientAIParser.OUTCOME, 0); }
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public OutcomeContext outcome() {
			return getRuleContext(OutcomeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public TerminalNode NOTEQ() { return getToken(EropPatientAIParser.NOTEQ, 0); }
		public OutcomeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outcomeConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterOutcomeConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitOutcomeConstraint(this);
		}
	}

	public final OutcomeConstraintContext outcomeConstraint() throws RecognitionException {
		OutcomeConstraintContext _localctx = new OutcomeConstraintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_outcomeConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(IDENTIFIER);
			setState(238); match(DOT);
			setState(239); match(OUTCOME);
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NOTEQ) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(241); outcome();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanConstraintContext extends ParserRuleContext {
		public BooleanConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConstraint; }
	 
		public BooleanConstraintContext() { }
		public void copyFrom(BooleanConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoTypeEqualNotEqContext extends BooleanConstraintContext {
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EropPatientAIParser.IDENTIFIER, i);
		}
		public TerminalNode BOTYPE() { return getToken(EropPatientAIParser.BOTYPE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EropPatientAIParser.IDENTIFIER); }
		public TerminalNode NOTEQ() { return getToken(EropPatientAIParser.NOTEQ, 0); }
		public BoTypeEqualNotEqContext(BooleanConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterBoTypeEqualNotEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitBoTypeEqualNotEq(this);
		}
	}
	public static class InDotRopSetContext extends BooleanConstraintContext {
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EropPatientAIParser.IDENTIFIER, i);
		}
		public RopsetContext ropset() {
			return getRuleContext(RopsetContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EropPatientAIParser.IDENTIFIER); }
		public TerminalNode IN() { return getToken(EropPatientAIParser.IN, 0); }
		public InDotRopSetContext(BooleanConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterInDotRopSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitInDotRopSet(this);
		}
	}
	public static class OriginatorResponderEqNotEqContext extends BooleanConstraintContext {
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EropPatientAIParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EropPatientAIParser.IDENTIFIER); }
		public TerminalNode ORIGINATOR() { return getToken(EropPatientAIParser.ORIGINATOR, 0); }
		public TerminalNode NOTEQ() { return getToken(EropPatientAIParser.NOTEQ, 0); }
		public TerminalNode RESPONDER() { return getToken(EropPatientAIParser.RESPONDER, 0); }
		public OriginatorResponderEqNotEqContext(BooleanConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterOriginatorResponderEqNotEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitOriginatorResponderEqNotEq(this);
		}
	}

	public final BooleanConstraintContext booleanConstraint() throws RecognitionException {
		BooleanConstraintContext _localctx = new BooleanConstraintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_booleanConstraint);
		int _la;
		try {
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new InDotRopSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243); match(IDENTIFIER);
				setState(244); match(IN);
				setState(245); match(IDENTIFIER);
				setState(246); match(DOT);
				setState(247); ropset();
				}
				break;
			case 2:
				_localctx = new BoTypeEqualNotEqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248); match(IDENTIFIER);
				setState(249); match(DOT);
				setState(250); match(BOTYPE);
				setState(251);
				_la = _input.LA(1);
				if ( !(_la==EQUALS || _la==NOTEQ) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(252); match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new OriginatorResponderEqNotEqContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(253); match(IDENTIFIER);
				setState(254); match(DOT);
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==ORIGINATOR || _la==RESPONDER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(256);
				_la = _input.LA(1);
				if ( !(_la==EQUALS || _la==NOTEQ) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(257); match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeConstraintContext extends ParserRuleContext {
		public TimeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeConstraint; }
	 
		public TimeConstraintContext() { }
		public void copyFrom(TimeConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeDirectComparisonConstraintContext extends TimeConstraintContext {
		public TimeDirectComparisonContext timeDirectComparison() {
			return getRuleContext(TimeDirectComparisonContext.class,0);
		}
		public TimeDirectComparisonConstraintContext(TimeConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterTimeDirectComparisonConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitTimeDirectComparisonConstraint(this);
		}
	}
	public static class TimePartialComparisonConstraintContext extends TimeConstraintContext {
		public TimePartialComparisonContext timePartialComparison() {
			return getRuleContext(TimePartialComparisonContext.class,0);
		}
		public TimePartialComparisonConstraintContext(TimeConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterTimePartialComparisonConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitTimePartialComparisonConstraint(this);
		}
	}

	public final TimeConstraintContext timeConstraint() throws RecognitionException {
		TimeConstraintContext _localctx = new TimeConstraintContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_timeConstraint);
		try {
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new TimeDirectComparisonConstraintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260); timeDirectComparison();
				}
				break;
			case 2:
				_localctx = new TimePartialComparisonConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261); timePartialComparison();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeDirectComparisonContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public TerminalNode TIMESTAMP() { return getToken(EropPatientAIParser.TIMESTAMP, 0); }
		public TerminalNode BEFORE() { return getToken(EropPatientAIParser.BEFORE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public AbsoluteTimeContext absoluteTime() {
			return getRuleContext(AbsoluteTimeContext.class,0);
		}
		public TerminalNode NOTEQ() { return getToken(EropPatientAIParser.NOTEQ, 0); }
		public TerminalNode AFTER() { return getToken(EropPatientAIParser.AFTER, 0); }
		public TimeDirectComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeDirectComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterTimeDirectComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitTimeDirectComparison(this);
		}
	}

	public final TimeDirectComparisonContext timeDirectComparison() throws RecognitionException {
		TimeDirectComparisonContext _localctx = new TimeDirectComparisonContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_timeDirectComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); match(IDENTIFIER);
			setState(265); match(DOT);
			setState(266); match(TIMESTAMP);
			setState(267);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEFORE) | (1L << AFTER) | (1L << EQUALS) | (1L << NOTEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(268); absoluteTime();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimePartialComparisonContext extends ParserRuleContext {
		public TimePartialComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timePartialComparison; }
	 
		public TimePartialComparisonContext() { }
		public void copyFrom(TimePartialComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualsNotEqWeekDayContext extends TimePartialComparisonContext {
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public TerminalNode WEEKDAY() { return getToken(EropPatientAIParser.WEEKDAY, 0); }
		public TerminalNode DAY() { return getToken(EropPatientAIParser.DAY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public TerminalNode NOTEQ() { return getToken(EropPatientAIParser.NOTEQ, 0); }
		public EqualsNotEqWeekDayContext(TimePartialComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterEqualsNotEqWeekDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitEqualsNotEqWeekDay(this);
		}
	}
	public static class DayInNotInWeekDayContext extends TimePartialComparisonContext {
		public List<TerminalNode> DOT() { return getTokens(EropPatientAIParser.DOT); }
		public TerminalNode SQUAREBRA() { return getToken(EropPatientAIParser.SQUAREBRA, 0); }
		public List<TerminalNode> WEEKDAY() { return getTokens(EropPatientAIParser.WEEKDAY); }
		public TerminalNode SQUAREKET() { return getToken(EropPatientAIParser.SQUAREKET, 0); }
		public TerminalNode DAY() { return getToken(EropPatientAIParser.DAY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public TerminalNode NOTIN() { return getToken(EropPatientAIParser.NOTIN, 0); }
		public TerminalNode WEEKDAY(int i) {
			return getToken(EropPatientAIParser.WEEKDAY, i);
		}
		public TerminalNode DOT(int i) {
			return getToken(EropPatientAIParser.DOT, i);
		}
		public TerminalNode IN() { return getToken(EropPatientAIParser.IN, 0); }
		public DayInNotInWeekDayContext(TimePartialComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterDayInNotInWeekDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitDayInNotInWeekDay(this);
		}
	}
	public static class DateEqNotEqBeforeAfterContext extends TimePartialComparisonContext {
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public TerminalNode DIGIT(int i) {
			return getToken(EropPatientAIParser.DIGIT, i);
		}
		public TerminalNode BEFORE() { return getToken(EropPatientAIParser.BEFORE, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(EropPatientAIParser.DIGIT); }
		public TerminalNode DATE() { return getToken(EropPatientAIParser.DATE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public TerminalNode NOTEQ() { return getToken(EropPatientAIParser.NOTEQ, 0); }
		public TerminalNode AFTER() { return getToken(EropPatientAIParser.AFTER, 0); }
		public DateEqNotEqBeforeAfterContext(TimePartialComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterDateEqNotEqBeforeAfter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitDateEqNotEqBeforeAfter(this);
		}
	}
	public static class HourEqualsNotEqBeforeAfterContext extends TimePartialComparisonContext {
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public TerminalNode BEFORE() { return getToken(EropPatientAIParser.BEFORE, 0); }
		public TerminalNode DIGIT(int i) {
			return getToken(EropPatientAIParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(EropPatientAIParser.DIGIT); }
		public TerminalNode HOUR() { return getToken(EropPatientAIParser.HOUR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public TerminalNode NOTEQ() { return getToken(EropPatientAIParser.NOTEQ, 0); }
		public TerminalNode AFTER() { return getToken(EropPatientAIParser.AFTER, 0); }
		public HourEqualsNotEqBeforeAfterContext(TimePartialComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterHourEqualsNotEqBeforeAfter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitHourEqualsNotEqBeforeAfter(this);
		}
	}
	public static class TimeInNotInDigitContext extends TimePartialComparisonContext {
		public List<TerminalNode> DOT() { return getTokens(EropPatientAIParser.DOT); }
		public TerminalNode SQUAREBRA() { return getToken(EropPatientAIParser.SQUAREBRA, 0); }
		public TerminalNode TIME() { return getToken(EropPatientAIParser.TIME, 0); }
		public TerminalNode DIGIT(int i) {
			return getToken(EropPatientAIParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(EropPatientAIParser.DIGIT); }
		public TerminalNode SQUAREKET() { return getToken(EropPatientAIParser.SQUAREKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public TerminalNode NOTIN() { return getToken(EropPatientAIParser.NOTIN, 0); }
		public TerminalNode DOT(int i) {
			return getToken(EropPatientAIParser.DOT, i);
		}
		public TerminalNode IN() { return getToken(EropPatientAIParser.IN, 0); }
		public TimeInNotInDigitContext(TimePartialComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterTimeInNotInDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitTimeInNotInDigit(this);
		}
	}

	public final TimePartialComparisonContext timePartialComparison() throws RecognitionException {
		TimePartialComparisonContext _localctx = new TimePartialComparisonContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_timePartialComparison);
		int _la;
		try {
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new EqualsNotEqWeekDayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270); match(IDENTIFIER);
				setState(271); match(DOT);
				setState(272); match(DAY);
				setState(273);
				_la = _input.LA(1);
				if ( !(_la==EQUALS || _la==NOTEQ) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(274); match(WEEKDAY);
				}
				break;
			case 2:
				_localctx = new DayInNotInWeekDayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275); match(IDENTIFIER);
				setState(276); match(DOT);
				setState(277); match(DAY);
				setState(278);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==NOTIN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(279); match(SQUAREBRA);
				setState(280); match(WEEKDAY);
				setState(281); match(DOT);
				setState(282); match(DOT);
				setState(283); match(WEEKDAY);
				setState(284); match(SQUAREKET);
				}
				break;
			case 3:
				_localctx = new DateEqNotEqBeforeAfterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(285); match(IDENTIFIER);
				setState(286); match(DOT);
				setState(287); match(DATE);
				setState(288);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEFORE) | (1L << AFTER) | (1L << EQUALS) | (1L << NOTEQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(289); match(DIGIT);
				setState(290); match(DIGIT);
				}
				break;
			case 4:
				_localctx = new HourEqualsNotEqBeforeAfterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(291); match(IDENTIFIER);
				setState(292); match(DOT);
				setState(293); match(HOUR);
				setState(294);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEFORE) | (1L << AFTER) | (1L << EQUALS) | (1L << NOTEQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(295); match(DIGIT);
					}
					}
					setState(298); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case 5:
				_localctx = new TimeInNotInDigitContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(300); match(IDENTIFIER);
				setState(301); match(DOT);
				setState(302); match(TIME);
				setState(303);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==NOTIN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(304); match(SQUAREBRA);
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(305); match(DIGIT);
					}
					}
					setState(308); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(310); match(DOT);
				setState(311); match(DOT);
				setState(312); match(DOT);
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(313); match(DIGIT);
					}
					}
					setState(316); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(318); match(SQUAREKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HistoricalQueryContext extends ParserRuleContext {
		public TerminalNode KET() { return getToken(EropPatientAIParser.KET, 0); }
		public TimeConstraintStringContext timeConstraintString() {
			return getRuleContext(TimeConstraintStringContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(EropPatientAIParser.COMMA); }
		public TerminalNode HAPPENED() { return getToken(EropPatientAIParser.HAPPENED, 0); }
		public List<RolePlayerRefContext> rolePlayerRef() {
			return getRuleContexts(RolePlayerRefContext.class);
		}
		public OutcomeContext outcome() {
			return getRuleContext(OutcomeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public RolePlayerRefContext rolePlayerRef(int i) {
			return getRuleContext(RolePlayerRefContext.class,i);
		}
		public TerminalNode BRA() { return getToken(EropPatientAIParser.BRA, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(EropPatientAIParser.COMMA, i);
		}
		public TerminalNode CTHAPPENED() { return getToken(EropPatientAIParser.CTHAPPENED, 0); }
		public HistoricalQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_historicalQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterHistoricalQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitHistoricalQuery(this);
		}
	}

	public final HistoricalQueryContext historicalQuery() throws RecognitionException {
		HistoricalQueryContext _localctx = new HistoricalQueryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_historicalQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !(_la==HAPPENED || _la==CTHAPPENED) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(322); match(BRA);
			setState(323); match(IDENTIFIER);
			setState(324); match(COMMA);
			setState(325); rolePlayerRef();
			setState(326); match(COMMA);
			setState(327); rolePlayerRef();
			setState(328); match(COMMA);
			setState(329); outcome();
			setState(330); match(COMMA);
			setState(331); timeConstraintString();
			setState(332); match(KET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RolePlayerRefContext extends ParserRuleContext {
		public RolePlayerRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rolePlayerRef; }
	 
		public RolePlayerRefContext() { }
		public void copyFrom(RolePlayerRefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RolePlayerAsteriskContext extends RolePlayerRefContext {
		public TerminalNode ASTERISK() { return getToken(EropPatientAIParser.ASTERISK, 0); }
		public RolePlayerAsteriskContext(RolePlayerRefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRolePlayerAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRolePlayerAsterisk(this);
		}
	}
	public static class RolePlayerRefIdContext extends RolePlayerRefContext {
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public RolePlayerRefIdContext(RolePlayerRefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRolePlayerRefId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRolePlayerRefId(this);
		}
	}

	public final RolePlayerRefContext rolePlayerRef() throws RecognitionException {
		RolePlayerRefContext _localctx = new RolePlayerRefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rolePlayerRef);
		try {
			setState(336);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new RolePlayerRefIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(334); match(IDENTIFIER);
				}
				break;
			case ASTERISK:
				_localctx = new RolePlayerAsteriskContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(335); match(ASTERISK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeConstraintStringContext extends ParserRuleContext {
		public TimeConstraintStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeConstraintString; }
	 
		public TimeConstraintStringContext() { }
		public void copyFrom(TimeConstraintStringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeConstraintTextContext extends TimeConstraintStringContext {
		public TimeConstraintContentContext timeConstraintContent() {
			return getRuleContext(TimeConstraintContentContext.class,0);
		}
		public List<TerminalNode> DQUOTE() { return getTokens(EropPatientAIParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(EropPatientAIParser.DQUOTE, i);
		}
		public TimeConstraintTextContext(TimeConstraintStringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterTimeConstraintText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitTimeConstraintText(this);
		}
	}
	public static class TimeConstraintAsteriskContext extends TimeConstraintStringContext {
		public TerminalNode ASTERISK() { return getToken(EropPatientAIParser.ASTERISK, 0); }
		public TimeConstraintAsteriskContext(TimeConstraintStringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterTimeConstraintAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitTimeConstraintAsterisk(this);
		}
	}

	public final TimeConstraintStringContext timeConstraintString() throws RecognitionException {
		TimeConstraintStringContext _localctx = new TimeConstraintStringContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_timeConstraintString);
		try {
			setState(343);
			switch (_input.LA(1)) {
			case DQUOTE:
				_localctx = new TimeConstraintTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(338); match(DQUOTE);
				setState(339); timeConstraintContent();
				setState(340); match(DQUOTE);
				}
				break;
			case ASTERISK:
				_localctx = new TimeConstraintAsteriskContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(342); match(ASTERISK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeConstraintContentContext extends ParserRuleContext {
		public List<TerminalNode> LESS() { return getTokens(EropPatientAIParser.LESS); }
		public TerminalNode GREATER(int i) {
			return getToken(EropPatientAIParser.GREATER, i);
		}
		public TerminalNode UPPER(int i) {
			return getToken(EropPatientAIParser.UPPER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(EropPatientAIParser.COLON); }
		public List<TerminalNode> LOWER() { return getTokens(EropPatientAIParser.LOWER); }
		public List<TerminalNode> GREATER() { return getTokens(EropPatientAIParser.GREATER); }
		public TerminalNode DOT(int i) {
			return getToken(EropPatientAIParser.DOT, i);
		}
		public List<TerminalNode> DASH() { return getTokens(EropPatientAIParser.DASH); }
		public TerminalNode LESS(int i) {
			return getToken(EropPatientAIParser.LESS, i);
		}
		public List<TerminalNode> UPPER() { return getTokens(EropPatientAIParser.UPPER); }
		public List<TerminalNode> DOT() { return getTokens(EropPatientAIParser.DOT); }
		public List<TerminalNode> EQUALS() { return getTokens(EropPatientAIParser.EQUALS); }
		public TerminalNode LOWER(int i) {
			return getToken(EropPatientAIParser.LOWER, i);
		}
		public TerminalNode DIGIT(int i) {
			return getToken(EropPatientAIParser.DIGIT, i);
		}
		public TerminalNode COLON(int i) {
			return getToken(EropPatientAIParser.COLON, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(EropPatientAIParser.DIGIT); }
		public TerminalNode EQUALS(int i) {
			return getToken(EropPatientAIParser.EQUALS, i);
		}
		public List<TerminalNode> QUOTE() { return getTokens(EropPatientAIParser.QUOTE); }
		public TerminalNode DASH(int i) {
			return getToken(EropPatientAIParser.DASH, i);
		}
		public TerminalNode QUOTE(int i) {
			return getToken(EropPatientAIParser.QUOTE, i);
		}
		public TimeConstraintContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeConstraintContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterTimeConstraintContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitTimeConstraintContent(this);
		}
	}

	public final TimeConstraintContentContext timeConstraintContent() throws RecognitionException {
		TimeConstraintContentContext _localctx = new TimeConstraintContentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_timeConstraintContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (EQUALS - 49)) | (1L << (LESS - 49)) | (1L << (GREATER - 49)) | (1L << (COLON - 49)) | (1L << (QUOTE - 49)) | (1L << (DOT - 49)) | (1L << (DASH - 49)) | (1L << (LOWER - 49)) | (1L << (UPPER - 49)) | (1L << (DIGIT - 49)))) != 0)) {
				{
				{
				setState(345);
				_la = _input.LA(1);
				if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (EQUALS - 49)) | (1L << (LESS - 49)) | (1L << (GREATER - 49)) | (1L << (COLON - 49)) | (1L << (QUOTE - 49)) | (1L << (DOT - 49)) | (1L << (DASH - 49)) | (1L << (LOWER - 49)) | (1L << (UPPER - 49)) | (1L << (DIGIT - 49)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RopConstraintContext extends ParserRuleContext {
		public RopConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ropConstraint; }
	 
		public RopConstraintContext() { }
		public void copyFrom(RopConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InRopSetContext extends RopConstraintContext {
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EropPatientAIParser.IDENTIFIER, i);
		}
		public RopsetContext ropset() {
			return getRuleContext(RopsetContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EropPatientAIParser.IDENTIFIER); }
		public TerminalNode IN() { return getToken(EropPatientAIParser.IN, 0); }
		public InRopSetContext(RopConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterInRopSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitInRopSet(this);
		}
	}
	public static class NotInRopSetContext extends RopConstraintContext {
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EropPatientAIParser.IDENTIFIER, i);
		}
		public RopsetContext ropset() {
			return getRuleContext(RopsetContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EropPatientAIParser.IDENTIFIER); }
		public TerminalNode NOTIN() { return getToken(EropPatientAIParser.NOTIN, 0); }
		public NotInRopSetContext(RopConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterNotInRopSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitNotInRopSet(this);
		}
	}

	public final RopConstraintContext ropConstraint() throws RecognitionException {
		RopConstraintContext _localctx = new RopConstraintContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ropConstraint);
		try {
			setState(361);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new InRopSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(351); match(IDENTIFIER);
				setState(352); match(IN);
				setState(353); match(IDENTIFIER);
				setState(354); match(DOT);
				setState(355); ropset();
				}
				break;
			case 2:
				_localctx = new NotInRopSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(356); match(IDENTIFIER);
				setState(357); match(NOTIN);
				setState(358); match(IDENTIFIER);
				setState(359); match(DOT);
				setState(360); ropset();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RhsContext extends ParserRuleContext {
		public RhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
	 
		public RhsContext() { }
		public void copyFrom(RhsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatusGuardBlockRhsContext extends RhsContext {
		public StatusGuardBlockContext statusGuardBlock(int i) {
			return getRuleContext(StatusGuardBlockContext.class,i);
		}
		public List<StatusGuardBlockContext> statusGuardBlock() {
			return getRuleContexts(StatusGuardBlockContext.class);
		}
		public StatusGuardBlockRhsContext(RhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterStatusGuardBlockRhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitStatusGuardBlockRhs(this);
		}
	}
	public static class RhsactionLabelContext extends RhsContext {
		public RhsactionContext rhsaction(int i) {
			return getRuleContext(RhsactionContext.class,i);
		}
		public List<RhsactionContext> rhsaction() {
			return getRuleContexts(RhsactionContext.class);
		}
		public RhsactionLabelContext(RhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRhsactionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRhsactionLabel(this);
		}
	}

	public final RhsContext rhs() throws RecognitionException {
		RhsContext _localctx = new RhsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_rhs);
		int _la;
		try {
			setState(373);
			switch (_input.LA(1)) {
			case SUCCESS:
			case TECFAIL:
			case BIZFAIL:
			case INITFAIL:
			case OTHERWISE:
				_localctx = new StatusGuardBlockRhsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(363); statusGuardBlock();
					}
					}
					setState(366); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUCCESS) | (1L << TECFAIL) | (1L << BIZFAIL) | (1L << INITFAIL) | (1L << OTHERWISE))) != 0) );
				}
				break;
			case TERMINATE:
			case PASS:
			case IF:
			case IDENTIFIER:
				_localctx = new RhsactionLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(368); rhsaction();
					}
					}
					setState(371); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (TERMINATE - 38)) | (1L << (PASS - 38)) | (1L << (IF - 38)) | (1L << (IDENTIFIER - 38)))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatusGuardBlockContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(EropPatientAIParser.COLON, 0); }
		public StatusGuardContext statusGuard() {
			return getRuleContext(StatusGuardContext.class,0);
		}
		public RhsactionListContext rhsactionList() {
			return getRuleContext(RhsactionListContext.class,0);
		}
		public StatusGuardBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statusGuardBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterStatusGuardBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitStatusGuardBlock(this);
		}
	}

	public final StatusGuardBlockContext statusGuardBlock() throws RecognitionException {
		StatusGuardBlockContext _localctx = new StatusGuardBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statusGuardBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375); statusGuard();
			setState(376); match(COLON);
			setState(377); rhsactionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatusGuardContext extends ParserRuleContext {
		public StatusGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statusGuard; }
	 
		public StatusGuardContext() { }
		public void copyFrom(StatusGuardContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BizFailContext extends StatusGuardContext {
		public TerminalNode BIZFAIL() { return getToken(EropPatientAIParser.BIZFAIL, 0); }
		public BizFailContext(StatusGuardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterBizFail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitBizFail(this);
		}
	}
	public static class OtherwiseContext extends StatusGuardContext {
		public TerminalNode OTHERWISE() { return getToken(EropPatientAIParser.OTHERWISE, 0); }
		public OtherwiseContext(StatusGuardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterOtherwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitOtherwise(this);
		}
	}
	public static class TecFailContext extends StatusGuardContext {
		public TerminalNode TECFAIL() { return getToken(EropPatientAIParser.TECFAIL, 0); }
		public TecFailContext(StatusGuardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterTecFail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitTecFail(this);
		}
	}
	public static class InitFailContext extends StatusGuardContext {
		public TerminalNode INITFAIL() { return getToken(EropPatientAIParser.INITFAIL, 0); }
		public InitFailContext(StatusGuardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterInitFail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitInitFail(this);
		}
	}
	public static class SuccessContext extends StatusGuardContext {
		public TerminalNode SUCCESS() { return getToken(EropPatientAIParser.SUCCESS, 0); }
		public SuccessContext(StatusGuardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterSuccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitSuccess(this);
		}
	}

	public final StatusGuardContext statusGuard() throws RecognitionException {
		StatusGuardContext _localctx = new StatusGuardContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statusGuard);
		try {
			setState(384);
			switch (_input.LA(1)) {
			case SUCCESS:
				_localctx = new SuccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(379); match(SUCCESS);
				}
				break;
			case TECFAIL:
				_localctx = new TecFailContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(380); match(TECFAIL);
				}
				break;
			case BIZFAIL:
				_localctx = new BizFailContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(381); match(BIZFAIL);
				}
				break;
			case INITFAIL:
				_localctx = new InitFailContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(382); match(INITFAIL);
				}
				break;
			case OTHERWISE:
				_localctx = new OtherwiseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(383); match(OTHERWISE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RhsactionListContext extends ParserRuleContext {
		public RhsactionContext rhsaction(int i) {
			return getRuleContext(RhsactionContext.class,i);
		}
		public List<RhsactionContext> rhsaction() {
			return getRuleContexts(RhsactionContext.class);
		}
		public RhsactionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhsactionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRhsactionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRhsactionList(this);
		}
	}

	public final RhsactionListContext rhsactionList() throws RecognitionException {
		RhsactionListContext _localctx = new RhsactionListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_rhsactionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(386); rhsaction();
				}
				}
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (TERMINATE - 38)) | (1L << (PASS - 38)) | (1L << (IF - 38)) | (1L << (IDENTIFIER - 38)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RhsactionContext extends ParserRuleContext {
		public RhsactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhsaction; }
	 
		public RhsactionContext() { }
		public void copyFrom(RhsactionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfstatementActionContext extends RhsactionContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public IfstatementActionContext(RhsactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterIfstatementAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitIfstatementAction(this);
		}
	}
	public static class AddActionLabelContext extends RhsactionContext {
		public AddactionContext addaction() {
			return getRuleContext(AddactionContext.class,0);
		}
		public AddActionLabelContext(RhsactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterAddActionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitAddActionLabel(this);
		}
	}
	public static class RemactionLabelContext extends RhsactionContext {
		public RemactionContext remaction() {
			return getRuleContext(RemactionContext.class,0);
		}
		public RemactionLabelContext(RhsactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRemactionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRemactionLabel(this);
		}
	}
	public static class PassactionLabelContext extends RhsactionContext {
		public PassactionContext passaction() {
			return getRuleContext(PassactionContext.class,0);
		}
		public PassactionLabelContext(RhsactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterPassactionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitPassactionLabel(this);
		}
	}
	public static class TermactionLabelContext extends RhsactionContext {
		public TermactionContext termaction() {
			return getRuleContext(TermactionContext.class,0);
		}
		public TermactionLabelContext(RhsactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterTermactionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitTermactionLabel(this);
		}
	}

	public final RhsactionContext rhsaction() throws RecognitionException {
		RhsactionContext _localctx = new RhsactionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_rhsaction);
		try {
			setState(396);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new IfstatementActionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(391); ifstatement();
				}
				break;
			case 2:
				_localctx = new TermactionLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(392); termaction();
				}
				break;
			case 3:
				_localctx = new PassactionLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(393); passaction();
				}
				break;
			case 4:
				_localctx = new AddActionLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(394); addaction();
				}
				break;
			case 5:
				_localctx = new RemactionLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(395); remaction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(EropPatientAIParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(EropPatientAIParser.IF, 0); }
		public TerminalNode THEN() { return getToken(EropPatientAIParser.THEN, 0); }
		public TerminalNode ENDIF() { return getToken(EropPatientAIParser.ENDIF, 0); }
		public List<RhsactionListContext> rhsactionList() {
			return getRuleContexts(RhsactionListContext.class);
		}
		public RhsactionListContext rhsactionList(int i) {
			return getRuleContext(RhsactionListContext.class,i);
		}
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitIfstatement(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398); match(IF);
			setState(399); conditionExpr();
			setState(400); match(THEN);
			setState(401); rhsactionList();
			setState(404);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(402); match(ELSE);
				setState(403); rhsactionList();
				}
			}

			setState(406); match(ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionExprContext extends ParserRuleContext {
		public ConditionTermContext conditionTerm(int i) {
			return getRuleContext(ConditionTermContext.class,i);
		}
		public LogicalOperatorContext logicalOperator(int i) {
			return getRuleContext(LogicalOperatorContext.class,i);
		}
		public List<ConditionTermContext> conditionTerm() {
			return getRuleContexts(ConditionTermContext.class);
		}
		public List<LogicalOperatorContext> logicalOperator() {
			return getRuleContexts(LogicalOperatorContext.class);
		}
		public ConditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterConditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitConditionExpr(this);
		}
	}

	public final ConditionExprContext conditionExpr() throws RecognitionException {
		ConditionExprContext _localctx = new ConditionExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conditionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); conditionTerm();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(409); logicalOperator();
				setState(410); conditionTerm();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionTermContext extends ParserRuleContext {
		public ConditionTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionTerm; }
	 
		public ConditionTermContext() { }
		public void copyFrom(ConditionTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleConditionTermContext extends ConditionTermContext {
		public SimpleConditionContext simpleCondition() {
			return getRuleContext(SimpleConditionContext.class,0);
		}
		public SimpleConditionTermContext(ConditionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterSimpleConditionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitSimpleConditionTerm(this);
		}
	}
	public static class NotConditionTermContext extends ConditionTermContext {
		public TerminalNode NOT() { return getToken(EropPatientAIParser.NOT, 0); }
		public ConditionTermContext conditionTerm() {
			return getRuleContext(ConditionTermContext.class,0);
		}
		public NotConditionTermContext(ConditionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterNotConditionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitNotConditionTerm(this);
		}
	}
	public static class ConditionExpressionTermContext extends ConditionTermContext {
		public TerminalNode KET() { return getToken(EropPatientAIParser.KET, 0); }
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public TerminalNode BRA() { return getToken(EropPatientAIParser.BRA, 0); }
		public ConditionExpressionTermContext(ConditionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterConditionExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitConditionExpressionTerm(this);
		}
	}

	public final ConditionTermContext conditionTerm() throws RecognitionException {
		ConditionTermContext _localctx = new ConditionTermContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_conditionTerm);
		try {
			setState(424);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotConditionTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(417); match(NOT);
				setState(418); conditionTerm();
				}
				break;
			case BRA:
				_localctx = new ConditionExpressionTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(419); match(BRA);
				setState(420); conditionExpr();
				setState(421); match(KET);
				}
				break;
			case HAPPENED:
			case CTHAPPENED:
			case IDENTIFIER:
				_localctx = new SimpleConditionTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(423); simpleCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleConditionContext extends ParserRuleContext {
		public SimpleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCondition; }
	 
		public SimpleConditionContext() { }
		public void copyFrom(SimpleConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalExpressionSimpleConditionContext extends SimpleConditionContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicalExpressionSimpleConditionContext(SimpleConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterLogicalExpressionSimpleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitLogicalExpressionSimpleCondition(this);
		}
	}
	public static class InRopSetSimpleConditionContext extends SimpleConditionContext {
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EropPatientAIParser.IDENTIFIER, i);
		}
		public RopsetContext ropset() {
			return getRuleContext(RopsetContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EropPatientAIParser.IDENTIFIER); }
		public TerminalNode IN() { return getToken(EropPatientAIParser.IN, 0); }
		public InRopSetSimpleConditionContext(SimpleConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterInRopSetSimpleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitInRopSetSimpleCondition(this);
		}
	}
	public static class HistoricalQuerySimpleConditionContext extends SimpleConditionContext {
		public HistoricalQueryContext historicalQuery() {
			return getRuleContext(HistoricalQueryContext.class,0);
		}
		public HistoricalQuerySimpleConditionContext(SimpleConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterHistoricalQuerySimpleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitHistoricalQuerySimpleCondition(this);
		}
	}
	public static class ComparisonExpressionSimpleConditionContext extends SimpleConditionContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public ComparisonExpressionSimpleConditionContext(SimpleConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterComparisonExpressionSimpleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitComparisonExpressionSimpleCondition(this);
		}
	}
	public static class OriginatorResponderSimpleConditionContext extends SimpleConditionContext {
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EropPatientAIParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EropPatientAIParser.IDENTIFIER); }
		public TerminalNode ORIGINATOR() { return getToken(EropPatientAIParser.ORIGINATOR, 0); }
		public TerminalNode RESPONDER() { return getToken(EropPatientAIParser.RESPONDER, 0); }
		public OriginatorResponderSimpleConditionContext(SimpleConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterOriginatorResponderSimpleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitOriginatorResponderSimpleCondition(this);
		}
	}

	public final SimpleConditionContext simpleCondition() throws RecognitionException {
		SimpleConditionContext _localctx = new SimpleConditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_simpleCondition);
		int _la;
		try {
			setState(439);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new OriginatorResponderSimpleConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(426); match(IDENTIFIER);
				setState(427); match(DOT);
				setState(428);
				_la = _input.LA(1);
				if ( !(_la==ORIGINATOR || _la==RESPONDER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(429); match(EQUALS);
				setState(430); match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new InRopSetSimpleConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(431); match(IDENTIFIER);
				setState(432); match(IN);
				setState(433); match(IDENTIFIER);
				setState(434); match(DOT);
				setState(435); ropset();
				}
				break;
			case 3:
				_localctx = new HistoricalQuerySimpleConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(436); historicalQuery();
				}
				break;
			case 4:
				_localctx = new LogicalExpressionSimpleConditionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(437); logicalExpression();
				}
				break;
			case 5:
				_localctx = new ComparisonExpressionSimpleConditionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(438); comparisonExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
	 
		public LogicalExpressionContext() { }
		public void copyFrom(LogicalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HappenedExpressionContext extends LogicalExpressionContext {
		public Happened_expressionContext happened_expression() {
			return getRuleContext(Happened_expressionContext.class,0);
		}
		public HappenedExpressionContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterHappenedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitHappenedExpression(this);
		}
	}
	public static class BoTypeLogicalExpressionContext extends LogicalExpressionContext {
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EropPatientAIParser.IDENTIFIER, i);
		}
		public TerminalNode BOTYPE() { return getToken(EropPatientAIParser.BOTYPE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EropPatientAIParser.IDENTIFIER); }
		public BoTypeLogicalExpressionContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterBoTypeLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitBoTypeLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_logicalExpression);
		try {
			setState(447);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new BoTypeLogicalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(441); match(IDENTIFIER);
				setState(442); match(DOT);
				setState(443); match(BOTYPE);
				setState(444); match(EQUALS);
				setState(445); match(IDENTIFIER);
				}
				break;
			case HAPPENED:
				_localctx = new HappenedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(446); happened_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public TerminalNode KET() { return getToken(EropPatientAIParser.KET, 0); }
		public TerminalNode LESSEQ() { return getToken(EropPatientAIParser.LESSEQ, 0); }
		public TerminalNode EQUALS() { return getToken(EropPatientAIParser.EQUALS, 0); }
		public TerminalNode DIGIT(int i) {
			return getToken(EropPatientAIParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(EropPatientAIParser.DIGIT); }
		public TerminalNode GREATEREQ() { return getToken(EropPatientAIParser.GREATEREQ, 0); }
		public HistoricalParamsContext historicalParams() {
			return getRuleContext(HistoricalParamsContext.class,0);
		}
		public TerminalNode CTHAPPENED() { return getToken(EropPatientAIParser.CTHAPPENED, 0); }
		public TerminalNode BRA() { return getToken(EropPatientAIParser.BRA, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitComparisonExpression(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); match(CTHAPPENED);
			setState(450); match(BRA);
			setState(451); historicalParams();
			setState(452); match(KET);
			setState(453);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << LESSEQ) | (1L << GREATEREQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(455); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(454); match(DIGIT);
				}
				}
				setState(457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Happened_expressionContext extends ParserRuleContext {
		public TerminalNode KET() { return getToken(EropPatientAIParser.KET, 0); }
		public TerminalNode HAPPENED() { return getToken(EropPatientAIParser.HAPPENED, 0); }
		public HistoricalParamsContext historicalParams() {
			return getRuleContext(HistoricalParamsContext.class,0);
		}
		public TerminalNode BRA() { return getToken(EropPatientAIParser.BRA, 0); }
		public Happened_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_happened_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterHappened_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitHappened_expression(this);
		}
	}

	public final Happened_expressionContext happened_expression() throws RecognitionException {
		Happened_expressionContext _localctx = new Happened_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_happened_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); match(HAPPENED);
			setState(460); match(BRA);
			setState(461); historicalParams();
			setState(462); match(KET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HistoricalParamsContext extends ParserRuleContext {
		public TimeConstraintStringContext timeConstraintString() {
			return getRuleContext(TimeConstraintStringContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(EropPatientAIParser.COMMA); }
		public List<RolePlayerRefContext> rolePlayerRef() {
			return getRuleContexts(RolePlayerRefContext.class);
		}
		public OutcomeContext outcome() {
			return getRuleContext(OutcomeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public RolePlayerRefContext rolePlayerRef(int i) {
			return getRuleContext(RolePlayerRefContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(EropPatientAIParser.COMMA, i);
		}
		public HistoricalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_historicalParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterHistoricalParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitHistoricalParams(this);
		}
	}

	public final HistoricalParamsContext historicalParams() throws RecognitionException {
		HistoricalParamsContext _localctx = new HistoricalParamsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_historicalParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); match(IDENTIFIER);
			setState(465); match(COMMA);
			setState(466); rolePlayerRef();
			setState(467); match(COMMA);
			setState(468); rolePlayerRef();
			setState(469); match(COMMA);
			setState(470); outcome();
			setState(471); match(COMMA);
			setState(472); timeConstraintString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermactionContext extends ParserRuleContext {
		public TerminalNode KET() { return getToken(EropPatientAIParser.KET, 0); }
		public TerminalNode SEMICOLON() { return getToken(EropPatientAIParser.SEMICOLON, 0); }
		public List<TerminalNode> DQUOTE() { return getTokens(EropPatientAIParser.DQUOTE); }
		public OutcomeContext outcome() {
			return getRuleContext(OutcomeContext.class,0);
		}
		public TerminalNode DQUOTE(int i) {
			return getToken(EropPatientAIParser.DQUOTE, i);
		}
		public TerminalNode BRA() { return getToken(EropPatientAIParser.BRA, 0); }
		public TerminalNode TERMINATE() { return getToken(EropPatientAIParser.TERMINATE, 0); }
		public TermactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterTermaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitTermaction(this);
		}
	}

	public final TermactionContext termaction() throws RecognitionException {
		TermactionContext _localctx = new TermactionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_termaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474); match(TERMINATE);
			setState(475); match(BRA);
			setState(476); match(DQUOTE);
			setState(477); outcome();
			setState(478); match(DQUOTE);
			setState(479); match(KET);
			setState(480); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PassactionContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(EropPatientAIParser.PASS, 0); }
		public PassactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterPassaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitPassaction(this);
		}
	}

	public final PassactionContext passaction() throws RecognitionException {
		PassactionContext _localctx = new PassactionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_passaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482); match(PASS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddactionContext extends ParserRuleContext {
		public TerminalNode KET() { return getToken(EropPatientAIParser.KET, 0); }
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode SEMICOLON() { return getToken(EropPatientAIParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(EropPatientAIParser.COMMA, 0); }
		public RopsetContext ropset() {
			return getRuleContext(RopsetContext.class,0);
		}
		public TerminalNode ADDROP() { return getToken(EropPatientAIParser.ADDROP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public ActionResponderContext actionResponder() {
			return getRuleContext(ActionResponderContext.class,0);
		}
		public TimeSpecContext timeSpec() {
			return getRuleContext(TimeSpecContext.class,0);
		}
		public RopEntityContext ropEntity() {
			return getRuleContext(RopEntityContext.class,0);
		}
		public TerminalNode BRA() { return getToken(EropPatientAIParser.BRA, 0); }
		public AddactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterAddaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitAddaction(this);
		}
	}

	public final AddactionContext addaction() throws RecognitionException {
		AddactionContext _localctx = new AddactionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_addaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484); match(IDENTIFIER);
			setState(485); match(DOT);
			setState(486); ropset();
			setState(487); match(ADDROP);
			setState(488); ropEntity();
			setState(495);
			_la = _input.LA(1);
			if (_la==BRA) {
				{
				setState(489); match(BRA);
				setState(490); actionResponder();
				setState(491); match(COMMA);
				setState(492); timeSpec();
				setState(493); match(KET);
				}
			}

			setState(497); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemactionContext extends ParserRuleContext {
		public TerminalNode KET() { return getToken(EropPatientAIParser.KET, 0); }
		public TerminalNode DOT() { return getToken(EropPatientAIParser.DOT, 0); }
		public TerminalNode SEMICOLON() { return getToken(EropPatientAIParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(EropPatientAIParser.COMMA, 0); }
		public RopsetContext ropset() {
			return getRuleContext(RopsetContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public ActionResponderContext actionResponder() {
			return getRuleContext(ActionResponderContext.class,0);
		}
		public TimeSpecContext timeSpec() {
			return getRuleContext(TimeSpecContext.class,0);
		}
		public TerminalNode REMROP() { return getToken(EropPatientAIParser.REMROP, 0); }
		public RopEntityContext ropEntity() {
			return getRuleContext(RopEntityContext.class,0);
		}
		public TerminalNode BRA() { return getToken(EropPatientAIParser.BRA, 0); }
		public RemactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRemaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRemaction(this);
		}
	}

	public final RemactionContext remaction() throws RecognitionException {
		RemactionContext _localctx = new RemactionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_remaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499); match(IDENTIFIER);
			setState(500); match(DOT);
			setState(501); ropset();
			setState(502); match(REMROP);
			setState(503); ropEntity();
			setState(510);
			_la = _input.LA(1);
			if (_la==BRA) {
				{
				setState(504); match(BRA);
				setState(505); actionResponder();
				setState(506); match(COMMA);
				setState(507); timeSpec();
				setState(508); match(KET);
				}
			}

			setState(512); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionResponderContext extends ParserRuleContext {
		public ActionResponderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionResponder; }
	 
		public ActionResponderContext() { }
		public void copyFrom(ActionResponderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActionResponderIdentifierContext extends ActionResponderContext {
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public ActionResponderIdentifierContext(ActionResponderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterActionResponderIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitActionResponderIdentifier(this);
		}
	}

	public final ActionResponderContext actionResponder() throws RecognitionException {
		ActionResponderContext _localctx = new ActionResponderContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_actionResponder);
		try {
			_localctx = new ActionResponderIdentifierContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(514); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RopEntityContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EropPatientAIParser.IDENTIFIER, 0); }
		public RopEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ropEntity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRopEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRopEntity(this);
		}
	}

	public final RopEntityContext ropEntity() throws RecognitionException {
		RopEntityContext _localctx = new RopEntityContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ropEntity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutcomeContext extends ParserRuleContext {
		public OutcomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outcome; }
	 
		public OutcomeContext() { }
		public void copyFrom(OutcomeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BizFailOutcomeContext extends OutcomeContext {
		public TerminalNode BIZFAIL() { return getToken(EropPatientAIParser.BIZFAIL, 0); }
		public BizFailOutcomeContext(OutcomeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterBizFailOutcome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitBizFailOutcome(this);
		}
	}
	public static class InitFailOutcomeContext extends OutcomeContext {
		public TerminalNode INITFAIL() { return getToken(EropPatientAIParser.INITFAIL, 0); }
		public InitFailOutcomeContext(OutcomeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterInitFailOutcome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitInitFailOutcome(this);
		}
	}
	public static class SuccessOutcomeContext extends OutcomeContext {
		public TerminalNode SUCCESS() { return getToken(EropPatientAIParser.SUCCESS, 0); }
		public SuccessOutcomeContext(OutcomeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterSuccessOutcome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitSuccessOutcome(this);
		}
	}
	public static class TecFailOutcomeContext extends OutcomeContext {
		public TerminalNode TECFAIL() { return getToken(EropPatientAIParser.TECFAIL, 0); }
		public TecFailOutcomeContext(OutcomeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterTecFailOutcome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitTecFailOutcome(this);
		}
	}

	public final OutcomeContext outcome() throws RecognitionException {
		OutcomeContext _localctx = new OutcomeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_outcome);
		try {
			setState(522);
			switch (_input.LA(1)) {
			case SUCCESS:
				_localctx = new SuccessOutcomeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(518); match(SUCCESS);
				}
				break;
			case TECFAIL:
				_localctx = new TecFailOutcomeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(519); match(TECFAIL);
				}
				break;
			case INITFAIL:
				_localctx = new InitFailOutcomeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(520); match(INITFAIL);
				}
				break;
			case BIZFAIL:
				_localctx = new BizFailOutcomeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(521); match(BIZFAIL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RopsetContext extends ParserRuleContext {
		public RopsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ropset; }
	 
		public RopsetContext() { }
		public void copyFrom(RopsetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObligsRopSetContext extends RopsetContext {
		public TerminalNode OBLIGS() { return getToken(EropPatientAIParser.OBLIGS, 0); }
		public ObligsRopSetContext(RopsetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterObligsRopSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitObligsRopSet(this);
		}
	}
	public static class RightsRopSetContext extends RopsetContext {
		public TerminalNode RIGHTS() { return getToken(EropPatientAIParser.RIGHTS, 0); }
		public RightsRopSetContext(RopsetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRightsRopSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRightsRopSet(this);
		}
	}
	public static class ProhibitionsRopSetContext extends RopsetContext {
		public TerminalNode PROHIBS() { return getToken(EropPatientAIParser.PROHIBS, 0); }
		public ProhibitionsRopSetContext(RopsetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterProhibitionsRopSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitProhibitionsRopSet(this);
		}
	}

	public final RopsetContext ropset() throws RecognitionException {
		RopsetContext _localctx = new RopsetContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ropset);
		try {
			setState(527);
			switch (_input.LA(1)) {
			case RIGHTS:
				_localctx = new RightsRopSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(524); match(RIGHTS);
				}
				break;
			case OBLIGS:
				_localctx = new ObligsRopSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(525); match(OBLIGS);
				}
				break;
			case PROHIBS:
				_localctx = new ProhibitionsRopSetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(526); match(PROHIBS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeSpecContext extends ParserRuleContext {
		public TimeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeSpec; }
	 
		public TimeSpecContext() { }
		public void copyFrom(TimeSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AbsoluteTimeSpecContext extends TimeSpecContext {
		public AbsoluteTimeContext absoluteTime() {
			return getRuleContext(AbsoluteTimeContext.class,0);
		}
		public AbsoluteTimeSpecContext(TimeSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterAbsoluteTimeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitAbsoluteTimeSpec(this);
		}
	}
	public static class RelativeTimeSpecContext extends TimeSpecContext {
		public RelativeTimeContext relativeTime() {
			return getRuleContext(RelativeTimeContext.class,0);
		}
		public RelativeTimeSpecContext(TimeSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRelativeTimeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRelativeTimeSpec(this);
		}
	}

	public final TimeSpecContext timeSpec() throws RecognitionException {
		TimeSpecContext _localctx = new TimeSpecContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_timeSpec);
		try {
			setState(531);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new RelativeTimeSpecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(529); relativeTime();
				}
				break;
			case 2:
				_localctx = new AbsoluteTimeSpecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(530); absoluteTime();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbsoluteTimeContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(EropPatientAIParser.DIGIT, i);
		}
		public TerminalNode COLON(int i) {
			return getToken(EropPatientAIParser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(EropPatientAIParser.COLON); }
		public List<TerminalNode> DIGIT() { return getTokens(EropPatientAIParser.DIGIT); }
		public List<TerminalNode> DQUOTE() { return getTokens(EropPatientAIParser.DQUOTE); }
		public TerminalNode SPACE() { return getToken(EropPatientAIParser.SPACE, 0); }
		public TerminalNode DQUOTE(int i) {
			return getToken(EropPatientAIParser.DQUOTE, i);
		}
		public TerminalNode DASH(int i) {
			return getToken(EropPatientAIParser.DASH, i);
		}
		public List<TerminalNode> DASH() { return getTokens(EropPatientAIParser.DASH); }
		public AbsoluteTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterAbsoluteTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitAbsoluteTime(this);
		}
	}

	public final AbsoluteTimeContext absoluteTime() throws RecognitionException {
		AbsoluteTimeContext _localctx = new AbsoluteTimeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_absoluteTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); match(DQUOTE);
			setState(534); match(DIGIT);
			setState(535); match(DIGIT);
			setState(536); match(DASH);
			setState(537); match(DIGIT);
			setState(538); match(DIGIT);
			setState(539); match(DASH);
			setState(540); match(DIGIT);
			setState(541); match(DIGIT);
			setState(542); match(DIGIT);
			setState(543); match(DIGIT);
			setState(544); match(SPACE);
			setState(545); match(DIGIT);
			setState(546); match(DIGIT);
			setState(547); match(COLON);
			setState(548); match(DIGIT);
			setState(549); match(DIGIT);
			setState(550); match(COLON);
			setState(551); match(DIGIT);
			setState(552); match(DIGIT);
			setState(553); match(DQUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelativeTimeContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(EropPatientAIParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(EropPatientAIParser.DIGIT); }
		public List<TerminalNode> DQUOTE() { return getTokens(EropPatientAIParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(EropPatientAIParser.DQUOTE, i);
		}
		public TimeUnitContext timeUnit() {
			return getRuleContext(TimeUnitContext.class,0);
		}
		public RelativeTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterRelativeTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitRelativeTime(this);
		}
	}

	public final RelativeTimeContext relativeTime() throws RecognitionException {
		RelativeTimeContext _localctx = new RelativeTimeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_relativeTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); match(DQUOTE);
			setState(557); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(556); match(DIGIT);
				}
				}
				setState(559); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(561); timeUnit();
			setState(562); match(DQUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeUnitContext extends ParserRuleContext {
		public TimeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).enterTimeUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EropPatientAIListener ) ((EropPatientAIListener)listener).exitTimeUnit(this);
		}
	}

	public final TimeUnitContext timeUnit() throws RecognitionException {
		TimeUnitContext _localctx = new TimeUnitContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_timeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << DAY) | (1L << MINUTE) | (1L << HOUR) | (1L << MONTH) | (1L << YEAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Q\u0239\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\6\2n\n\2\r\2\16\2o\3\2\7\2s\n\2\f\2\16\2v"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\5\3}\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0091\n\7\f\7\16\7\u0094\13\7"+
		"\3\b\6\b\u0097\n\b\r\b\16\b\u0098\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\5\13\u00a9\n\13\3\f\3\f\3\f\3\f\7\f\u00af\n\f\f"+
		"\f\16\f\u00b2\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00cd\n\16\3\17\3\17\3\17\7\17\u00d2\n\17\f\17\16\17\u00d5\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e0\n\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\5\22\u00e8\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0105\n\25\3\26\3\26\5\26\u0109"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\6\30\u012b\n\30\r\30\16\30\u012c\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\6\30\u0135\n\30\r\30\16\30\u0136\3\30\3\30\3\30\3\30"+
		"\6\30\u013d\n\30\r\30\16\30\u013e\3\30\5\30\u0142\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u0153"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u015a\n\33\3\34\7\34\u015d\n\34\f"+
		"\34\16\34\u0160\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u016c\n\35\3\36\6\36\u016f\n\36\r\36\16\36\u0170\3\36\6\36\u0174"+
		"\n\36\r\36\16\36\u0175\5\36\u0178\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \5 \u0183\n \3!\6!\u0186\n!\r!\16!\u0187\3\"\3\"\3\"\3\"\3\"\5\"\u018f"+
		"\n\"\3#\3#\3#\3#\3#\3#\5#\u0197\n#\3#\3#\3$\3$\3$\3$\7$\u019f\n$\f$\16"+
		"$\u01a2\13$\3%\3%\3%\3%\3%\3%\3%\5%\u01ab\n%\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\5&\u01ba\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01c2\n\'\3(\3("+
		"\3(\3(\3(\3(\6(\u01ca\n(\r(\16(\u01cb\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\5-\u01f2\n-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0201\n"+
		".\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u020d\n\61\3\62\3\62"+
		"\3\62\5\62\u0212\n\62\3\63\3\63\5\63\u0216\n\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\65\3\65\6\65\u0230\n\65\r\65\16\65\u0231\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\2\2\67\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\13\3\2\65\66\3\2\24\25"+
		"\3\2\63\64\4\2\21\22\63\64\3\2 !\3\2\17\20\t\2\63\6388::>>CCGHLN\5\2\63"+
		"\6399;;\5\2\3\6\30\30\34\37\u0244\2m\3\2\2\2\4|\3\2\2\2\6~\3\2\2\2\b\u0082"+
		"\3\2\2\2\n\u0086\3\2\2\2\f\u008d\3\2\2\2\16\u0096\3\2\2\2\20\u009a\3\2"+
		"\2\2\22\u00a2\3\2\2\2\24\u00a6\3\2\2\2\26\u00aa\3\2\2\2\30\u00b3\3\2\2"+
		"\2\32\u00cc\3\2\2\2\34\u00ce\3\2\2\2\36\u00df\3\2\2\2 \u00e1\3\2\2\2\""+
		"\u00e7\3\2\2\2$\u00e9\3\2\2\2&\u00ef\3\2\2\2(\u0104\3\2\2\2*\u0108\3\2"+
		"\2\2,\u010a\3\2\2\2.\u0141\3\2\2\2\60\u0143\3\2\2\2\62\u0152\3\2\2\2\64"+
		"\u0159\3\2\2\2\66\u015e\3\2\2\28\u016b\3\2\2\2:\u0177\3\2\2\2<\u0179\3"+
		"\2\2\2>\u0182\3\2\2\2@\u0185\3\2\2\2B\u018e\3\2\2\2D\u0190\3\2\2\2F\u019a"+
		"\3\2\2\2H\u01aa\3\2\2\2J\u01b9\3\2\2\2L\u01c1\3\2\2\2N\u01c3\3\2\2\2P"+
		"\u01cd\3\2\2\2R\u01d2\3\2\2\2T\u01dc\3\2\2\2V\u01e4\3\2\2\2X\u01e6\3\2"+
		"\2\2Z\u01f5\3\2\2\2\\\u0204\3\2\2\2^\u0206\3\2\2\2`\u020c\3\2\2\2b\u0211"+
		"\3\2\2\2d\u0215\3\2\2\2f\u0217\3\2\2\2h\u022d\3\2\2\2j\u0236\3\2\2\2l"+
		"n\5\4\3\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pt\3\2\2\2qs\7O\2\2r"+
		"q\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\5\16\b\2"+
		"x\3\3\2\2\2y}\5\6\4\2z}\5\b\5\2{}\5\n\6\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2"+
		"\2}\5\3\2\2\2~\177\7\7\2\2\177\u0080\5\f\7\2\u0080\u0081\7=\2\2\u0081"+
		"\7\3\2\2\2\u0082\u0083\7\b\2\2\u0083\u0084\5\34\17\2\u0084\u0085\7=\2"+
		"\2\u0085\t\3\2\2\2\u0086\u0087\7\t\2\2\u0087\u0088\7K\2\2\u0088\u0089"+
		"\7@\2\2\u0089\u008a\5\f\7\2\u008a\u008b\7A\2\2\u008b\u008c\7=\2\2\u008c"+
		"\13\3\2\2\2\u008d\u0092\7K\2\2\u008e\u008f\7B\2\2\u008f\u0091\7K\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\r\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\5\20\t\2\u0096\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\17\3\2\2\2\u009a\u009b\7\n\2\2\u009b\u009c\5\22\n\2\u009c\u009d\7\f\2"+
		"\2\u009d\u009e\5\24\13\2\u009e\u009f\7\r\2\2\u009f\u00a0\5:\36\2\u00a0"+
		"\u00a1\7\13\2\2\u00a1\21\3\2\2\2\u00a2\u00a3\7D\2\2\u00a3\u00a4\7K\2\2"+
		"\u00a4\u00a5\7D\2\2\u00a5\23\3\2\2\2\u00a6\u00a8\5\30\r\2\u00a7\u00a9"+
		"\5\26\f\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\25\3\2\2\2\u00aa"+
		"\u00b0\5\36\20\2\u00ab\u00ac\5 \21\2\u00ac\u00ad\5\36\20\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\27\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7K\2\2"+
		"\u00b4\u00b5\7\16\2\2\u00b5\u00b6\7@\2\2\u00b6\u00bb\5\32\16\2\u00b7\u00b8"+
		"\7B\2\2\u00b8\u00ba\5\32\16\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00be\u00bf\7A\2\2\u00bf\31\3\2\2\2\u00c0\u00c1\7\23\2\2\u00c1"+
		"\u00c2\7\63\2\2\u00c2\u00cd\7K\2\2\u00c3\u00c4\7\24\2\2\u00c4\u00c5\7"+
		"\63\2\2\u00c5\u00cd\7K\2\2\u00c6\u00c7\7\25\2\2\u00c7\u00c8\7\63\2\2\u00c8"+
		"\u00cd\7K\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00cb\7\63\2\2\u00cb\u00cd\5"+
		"`\61\2\u00cc\u00c0\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc"+
		"\u00c9\3\2\2\2\u00cd\33\3\2\2\2\u00ce\u00d3\7K\2\2\u00cf\u00d0\7B\2\2"+
		"\u00d0\u00d2\7K\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\35\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d7\7\67\2\2\u00d7\u00e0\5\36\20\2\u00d8\u00d9\7@\2\2\u00d9\u00da\5"+
		"\26\f\2\u00da\u00db\7A\2\2\u00db\u00e0\3\2\2\2\u00dc\u00e0\5\"\22\2\u00dd"+
		"\u00e0\5\60\31\2\u00de\u00e0\58\35\2\u00df\u00d6\3\2\2\2\u00df\u00d8\3"+
		"\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\37\3\2\2\2\u00e1\u00e2\t\2\2\2\u00e2!\3\2\2\2\u00e3\u00e8\5$\23\2\u00e4"+
		"\u00e8\5&\24\2\u00e5\u00e8\5*\26\2\u00e6\u00e8\5(\25\2\u00e7\u00e3\3\2"+
		"\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"#\3\2\2\2\u00e9\u00ea\7K\2\2\u00ea\u00eb\7G\2\2\u00eb\u00ec\t\3\2\2\u00ec"+
		"\u00ed\t\4\2\2\u00ed\u00ee\7K\2\2\u00ee%\3\2\2\2\u00ef\u00f0\7K\2\2\u00f0"+
		"\u00f1\7G\2\2\u00f1\u00f2\7\26\2\2\u00f2\u00f3\t\4\2\2\u00f3\u00f4\5`"+
		"\61\2\u00f4\'\3\2\2\2\u00f5\u00f6\7K\2\2\u00f6\u00f7\7 \2\2\u00f7\u00f8"+
		"\7K\2\2\u00f8\u00f9\7G\2\2\u00f9\u0105\5b\62\2\u00fa\u00fb\7K\2\2\u00fb"+
		"\u00fc\7G\2\2\u00fc\u00fd\7\23\2\2\u00fd\u00fe\t\4\2\2\u00fe\u0105\7K"+
		"\2\2\u00ff\u0100\7K\2\2\u0100\u0101\7G\2\2\u0101\u0102\t\3\2\2\u0102\u0103"+
		"\t\4\2\2\u0103\u0105\7K\2\2\u0104\u00f5\3\2\2\2\u0104\u00fa\3\2\2\2\u0104"+
		"\u00ff\3\2\2\2\u0105)\3\2\2\2\u0106\u0109\5,\27\2\u0107\u0109\5.\30\2"+
		"\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109+\3\2\2\2\u010a\u010b\7"+
		"K\2\2\u010b\u010c\7G\2\2\u010c\u010d\7\27\2\2\u010d\u010e\t\5\2\2\u010e"+
		"\u010f\5f\64\2\u010f-\3\2\2\2\u0110\u0111\7K\2\2\u0111\u0112\7G\2\2\u0112"+
		"\u0113\7\30\2\2\u0113\u0114\t\4\2\2\u0114\u0142\7\61\2\2\u0115\u0116\7"+
		"K\2\2\u0116\u0117\7G\2\2\u0117\u0118\7\30\2\2\u0118\u0119\t\6\2\2\u0119"+
		"\u011a\7E\2\2\u011a\u011b\7\61\2\2\u011b\u011c\7G\2\2\u011c\u011d\7G\2"+
		"\2\u011d\u011e\7\61\2\2\u011e\u0142\7F\2\2\u011f\u0120\7K\2\2\u0120\u0121"+
		"\7G\2\2\u0121\u0122\7\31\2\2\u0122\u0123\t\5\2\2\u0123\u0124\7N\2\2\u0124"+
		"\u0142\7N\2\2\u0125\u0126\7K\2\2\u0126\u0127\7G\2\2\u0127\u0128\7\35\2"+
		"\2\u0128\u012a\t\5\2\2\u0129\u012b\7N\2\2\u012a\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0142\3\2\2\2\u012e"+
		"\u012f\7K\2\2\u012f\u0130\7G\2\2\u0130\u0131\7\32\2\2\u0131\u0132\t\6"+
		"\2\2\u0132\u0134\7E\2\2\u0133\u0135\7N\2\2\u0134\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\7G\2\2\u0139\u013a\7G\2\2\u013a\u013c\7G\2\2\u013b\u013d\7N\2\2"+
		"\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\7F\2\2\u0141\u0110\3\2\2\2\u0141"+
		"\u0115\3\2\2\2\u0141\u011f\3\2\2\2\u0141\u0125\3\2\2\2\u0141\u012e\3\2"+
		"\2\2\u0142/\3\2\2\2\u0143\u0144\t\7\2\2\u0144\u0145\7@\2\2\u0145\u0146"+
		"\7K\2\2\u0146\u0147\7B\2\2\u0147\u0148\5\62\32\2\u0148\u0149\7B\2\2\u0149"+
		"\u014a\5\62\32\2\u014a\u014b\7B\2\2\u014b\u014c\5`\61\2\u014c\u014d\7"+
		"B\2\2\u014d\u014e\5\64\33\2\u014e\u014f\7A\2\2\u014f\61\3\2\2\2\u0150"+
		"\u0153\7K\2\2\u0151\u0153\7<\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2"+
		"\2\u0153\63\3\2\2\2\u0154\u0155\7D\2\2\u0155\u0156\5\66\34\2\u0156\u0157"+
		"\7D\2\2\u0157\u015a\3\2\2\2\u0158\u015a\7<\2\2\u0159\u0154\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015a\65\3\2\2\2\u015b\u015d\t\b\2\2\u015c\u015b\3\2\2"+
		"\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\67"+
		"\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7K\2\2\u0162\u0163\7 \2\2\u0163"+
		"\u0164\7K\2\2\u0164\u0165\7G\2\2\u0165\u016c\5b\62\2\u0166\u0167\7K\2"+
		"\2\u0167\u0168\7!\2\2\u0168\u0169\7K\2\2\u0169\u016a\7G\2\2\u016a\u016c"+
		"\5b\62\2\u016b\u0161\3\2\2\2\u016b\u0166\3\2\2\2\u016c9\3\2\2\2\u016d"+
		"\u016f\5<\37\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0178\3\2\2\2\u0172\u0174\5B\"\2\u0173"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0178\3\2\2\2\u0177\u016e\3\2\2\2\u0177\u0173\3\2\2\2\u0178"+
		";\3\2\2\2\u0179\u017a\5> \2\u017a\u017b\7>\2\2\u017b\u017c\5@!\2\u017c"+
		"=\3\2\2\2\u017d\u0183\7\"\2\2\u017e\u0183\7#\2\2\u017f\u0183\7$\2\2\u0180"+
		"\u0183\7%\2\2\u0181\u0183\7\60\2\2\u0182\u017d\3\2\2\2\u0182\u017e\3\2"+
		"\2\2\u0182\u017f\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183"+
		"?\3\2\2\2\u0184\u0186\5B\"\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188A\3\2\2\2\u0189\u018f\5D#\2\u018a"+
		"\u018f\5T+\2\u018b\u018f\5V,\2\u018c\u018f\5X-\2\u018d\u018f\5Z.\2\u018e"+
		"\u0189\3\2\2\2\u018e\u018a\3\2\2\2\u018e\u018b\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018e\u018d\3\2\2\2\u018fC\3\2\2\2\u0190\u0191\7-\2\2\u0191\u0192"+
		"\5F$\2\u0192\u0193\7\r\2\2\u0193\u0196\5@!\2\u0194\u0195\7.\2\2\u0195"+
		"\u0197\5@!\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2"+
		"\2\u0198\u0199\7/\2\2\u0199E\3\2\2\2\u019a\u01a0\5H%\2\u019b\u019c\5 "+
		"\21\2\u019c\u019d\5H%\2\u019d\u019f\3\2\2\2\u019e\u019b\3\2\2\2\u019f"+
		"\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1G\3\2\2\2"+
		"\u01a2\u01a0\3\2\2\2\u01a3\u01a4\7\67\2\2\u01a4\u01ab\5H%\2\u01a5\u01a6"+
		"\7@\2\2\u01a6\u01a7\5F$\2\u01a7\u01a8\7A\2\2\u01a8\u01ab\3\2\2\2\u01a9"+
		"\u01ab\5J&\2\u01aa\u01a3\3\2\2\2\u01aa\u01a5\3\2\2\2\u01aa\u01a9\3\2\2"+
		"\2\u01abI\3\2\2\2\u01ac\u01ad\7K\2\2\u01ad\u01ae\7G\2\2\u01ae\u01af\t"+
		"\3\2\2\u01af\u01b0\7\63\2\2\u01b0\u01ba\7K\2\2\u01b1\u01b2\7K\2\2\u01b2"+
		"\u01b3\7 \2\2\u01b3\u01b4\7K\2\2\u01b4\u01b5\7G\2\2\u01b5\u01ba\5b\62"+
		"\2\u01b6\u01ba\5\60\31\2\u01b7\u01ba\5L\'\2\u01b8\u01ba\5N(\2\u01b9\u01ac"+
		"\3\2\2\2\u01b9\u01b1\3\2\2\2\u01b9\u01b6\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01b8\3\2\2\2\u01baK\3\2\2\2\u01bb\u01bc\7K\2\2\u01bc\u01bd\7G\2\2\u01bd"+
		"\u01be\7\23\2\2\u01be\u01bf\7\63\2\2\u01bf\u01c2\7K\2\2\u01c0\u01c2\5"+
		"P)\2\u01c1\u01bb\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2M\3\2\2\2\u01c3\u01c4"+
		"\7\20\2\2\u01c4\u01c5\7@\2\2\u01c5\u01c6\5R*\2\u01c6\u01c7\7A\2\2\u01c7"+
		"\u01c9\t\t\2\2\u01c8\u01ca\7N\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01ccO\3\2\2\2\u01cd\u01ce"+
		"\7\17\2\2\u01ce\u01cf\7@\2\2\u01cf\u01d0\5R*\2\u01d0\u01d1\7A\2\2\u01d1"+
		"Q\3\2\2\2\u01d2\u01d3\7K\2\2\u01d3\u01d4\7B\2\2\u01d4\u01d5\5\62\32\2"+
		"\u01d5\u01d6\7B\2\2\u01d6\u01d7\5\62\32\2\u01d7\u01d8\7B\2\2\u01d8\u01d9"+
		"\5`\61\2\u01d9\u01da\7B\2\2\u01da\u01db\5\64\33\2\u01dbS\3\2\2\2\u01dc"+
		"\u01dd\7(\2\2\u01dd\u01de\7@\2\2\u01de\u01df\7D\2\2\u01df\u01e0\5`\61"+
		"\2\u01e0\u01e1\7D\2\2\u01e1\u01e2\7A\2\2\u01e2\u01e3\7=\2\2\u01e3U\3\2"+
		"\2\2\u01e4\u01e5\7)\2\2\u01e5W\3\2\2\2\u01e6\u01e7\7K\2\2\u01e7\u01e8"+
		"\7G\2\2\u01e8\u01e9\5b\62\2\u01e9\u01ea\7&\2\2\u01ea\u01f1\5^\60\2\u01eb"+
		"\u01ec\7@\2\2\u01ec\u01ed\5\\/\2\u01ed\u01ee\7B\2\2\u01ee\u01ef\5d\63"+
		"\2\u01ef\u01f0\7A\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01eb\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\7=\2\2\u01f4Y\3\2\2\2\u01f5\u01f6"+
		"\7K\2\2\u01f6\u01f7\7G\2\2\u01f7\u01f8\5b\62\2\u01f8\u01f9\7\'\2\2\u01f9"+
		"\u0200\5^\60\2\u01fa\u01fb\7@\2\2\u01fb\u01fc\5\\/\2\u01fc\u01fd\7B\2"+
		"\2\u01fd\u01fe\5d\63\2\u01fe\u01ff\7A\2\2\u01ff\u0201\3\2\2\2\u0200\u01fa"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\7=\2\2\u0203"+
		"[\3\2\2\2\u0204\u0205\7K\2\2\u0205]\3\2\2\2\u0206\u0207\7K\2\2\u0207_"+
		"\3\2\2\2\u0208\u020d\7\"\2\2\u0209\u020d\7#\2\2\u020a\u020d\7%\2\2\u020b"+
		"\u020d\7$\2\2\u020c\u0208\3\2\2\2\u020c\u0209\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020c\u020b\3\2\2\2\u020da\3\2\2\2\u020e\u0212\7+\2\2\u020f\u0212"+
		"\7*\2\2\u0210\u0212\7,\2\2\u0211\u020e\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0210\3\2\2\2\u0212c\3\2\2\2\u0213\u0216\5h\65\2\u0214\u0216\5f\64\2"+
		"\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216e\3\2\2\2\u0217\u0218\7"+
		"D\2\2\u0218\u0219\7N\2\2\u0219\u021a\7N\2\2\u021a\u021b\7H\2\2\u021b\u021c"+
		"\7N\2\2\u021c\u021d\7N\2\2\u021d\u021e\7H\2\2\u021e\u021f\7N\2\2\u021f"+
		"\u0220\7N\2\2\u0220\u0221\7N\2\2\u0221\u0222\7N\2\2\u0222\u0223\7P\2\2"+
		"\u0223\u0224\7N\2\2\u0224\u0225\7N\2\2\u0225\u0226\7>\2\2\u0226\u0227"+
		"\7N\2\2\u0227\u0228\7N\2\2\u0228\u0229\7>\2\2\u0229\u022a\7N\2\2\u022a"+
		"\u022b\7N\2\2\u022b\u022c\7D\2\2\u022cg\3\2\2\2\u022d\u022f\7D\2\2\u022e"+
		"\u0230\7N\2\2\u022f\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u022f\3\2"+
		"\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\5j\66\2\u0234"+
		"\u0235\7D\2\2\u0235i\3\2\2\2\u0236\u0237\t\n\2\2\u0237k\3\2\2\2*ot|\u0092"+
		"\u0098\u00a8\u00b0\u00bb\u00cc\u00d3\u00df\u00e7\u0104\u0108\u012c\u0136"+
		"\u013e\u0141\u0152\u0159\u015e\u016b\u0170\u0175\u0177\u0182\u0187\u018e"+
		"\u0196\u01a0\u01aa\u01b9\u01c1\u01cb\u01f1\u0200\u020c\u0211\u0215\u0231";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}