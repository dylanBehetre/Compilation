/*
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.compilation.services.WhileCompGrammarAccess;
import org.xtext.compilation.whileComp.Affectation;
import org.xtext.compilation.whileComp.Command;
import org.xtext.compilation.whileComp.Commands;
import org.xtext.compilation.whileComp.Cons;
import org.xtext.compilation.whileComp.Definition;
import org.xtext.compilation.whileComp.Expr;
import org.xtext.compilation.whileComp.ExprAnd;
import org.xtext.compilation.whileComp.ExprEq;
import org.xtext.compilation.whileComp.ExprNot;
import org.xtext.compilation.whileComp.ExprOr;
import org.xtext.compilation.whileComp.ExprSimple;
import org.xtext.compilation.whileComp.Exprs;
import org.xtext.compilation.whileComp.For;
import org.xtext.compilation.whileComp.Foreach;
import org.xtext.compilation.whileComp.Function;
import org.xtext.compilation.whileComp.Hd;
import org.xtext.compilation.whileComp.If;
import org.xtext.compilation.whileComp.Input;
import org.xtext.compilation.whileComp.Lexpr;
import org.xtext.compilation.whileComp.List;
import org.xtext.compilation.whileComp.Nil2;
import org.xtext.compilation.whileComp.Nop;
import org.xtext.compilation.whileComp.Not;
import org.xtext.compilation.whileComp.Output;
import org.xtext.compilation.whileComp.Program;
import org.xtext.compilation.whileComp.Read;
import org.xtext.compilation.whileComp.Tl;
import org.xtext.compilation.whileComp.Vars;
import org.xtext.compilation.whileComp.While;
import org.xtext.compilation.whileComp.WhileCompPackage;
import org.xtext.compilation.whileComp.Write;

@SuppressWarnings("all")
public class WhileCompSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WhileCompGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == WhileCompPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case WhileCompPackage.AFFECTATION:
				sequence_Affectation(context, (Affectation) semanticObject); 
				return; 
			case WhileCompPackage.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case WhileCompPackage.COMMANDS:
				sequence_Commands(context, (Commands) semanticObject); 
				return; 
			case WhileCompPackage.CONS:
				sequence_Cons(context, (Cons) semanticObject); 
				return; 
			case WhileCompPackage.DEFINITION:
				sequence_Definition(context, (Definition) semanticObject); 
				return; 
			case WhileCompPackage.EXPR:
				sequence_Expr(context, (Expr) semanticObject); 
				return; 
			case WhileCompPackage.EXPR_AND:
				sequence_ExprAnd(context, (ExprAnd) semanticObject); 
				return; 
			case WhileCompPackage.EXPR_EQ:
				sequence_ExprEq(context, (ExprEq) semanticObject); 
				return; 
			case WhileCompPackage.EXPR_NOT:
				sequence_ExprNot(context, (ExprNot) semanticObject); 
				return; 
			case WhileCompPackage.EXPR_OR:
				sequence_ExprOr(context, (ExprOr) semanticObject); 
				return; 
			case WhileCompPackage.EXPR_SIMPLE:
				sequence_ExprSimple(context, (ExprSimple) semanticObject); 
				return; 
			case WhileCompPackage.EXPRS:
				sequence_Exprs(context, (Exprs) semanticObject); 
				return; 
			case WhileCompPackage.FOR:
				sequence_For(context, (For) semanticObject); 
				return; 
			case WhileCompPackage.FOREACH:
				sequence_Foreach(context, (Foreach) semanticObject); 
				return; 
			case WhileCompPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case WhileCompPackage.HD:
				sequence_Hd(context, (Hd) semanticObject); 
				return; 
			case WhileCompPackage.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case WhileCompPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case WhileCompPackage.LEXPR:
				sequence_Lexpr(context, (Lexpr) semanticObject); 
				return; 
			case WhileCompPackage.LIST:
				sequence_List(context, (List) semanticObject); 
				return; 
			case WhileCompPackage.NIL2:
				sequence_Nil2(context, (Nil2) semanticObject); 
				return; 
			case WhileCompPackage.NOP:
				sequence_Nop(context, (Nop) semanticObject); 
				return; 
			case WhileCompPackage.NOT:
				sequence_Not(context, (Not) semanticObject); 
				return; 
			case WhileCompPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case WhileCompPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case WhileCompPackage.READ:
				sequence_Read(context, (Read) semanticObject); 
				return; 
			case WhileCompPackage.TL:
				sequence_Tl(context, (Tl) semanticObject); 
				return; 
			case WhileCompPackage.VARS:
				sequence_Vars(context, (Vars) semanticObject); 
				return; 
			case WhileCompPackage.WHILE:
				sequence_While(context, (While) semanticObject); 
				return; 
			case WhileCompPackage.WRITE:
				sequence_Write(context, (Write) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Affectation returns Affectation
	 *
	 * Constraint:
	 *     (affectation=VARIABLE (valeur=VARIABLE | nil=Nil2))
	 */
	protected void sequence_Affectation(ISerializationContext context, Affectation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Command
	 *
	 * Constraint:
	 *     (
	 *         command=Nop | 
	 *         command=Affectation | 
	 *         command=While | 
	 *         command=For | 
	 *         command=If | 
	 *         command=Foreach
	 *     )
	 */
	protected void sequence_Command(ISerializationContext context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Commands returns Commands
	 *
	 * Constraint:
	 *     (command=Command commands+=Command*)
	 */
	protected void sequence_Commands(ISerializationContext context, Commands semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Cons returns Cons
	 *
	 * Constraint:
	 *     cons='cons'
	 */
	protected void sequence_Cons(ISerializationContext context, Cons semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.CONS__CONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.CONS__CONS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConsAccess().getConsConsKeyword_0(), semanticObject.getCons());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Definition
	 *
	 * Constraint:
	 *     (reads+=Read commands+=Command* writes+=Write)
	 */
	protected void sequence_Definition(ISerializationContext context, Definition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExprAnd returns ExprAnd
	 *
	 * Constraint:
	 *     ((exprOr=ExprOr exprAnd=ExprAnd) | exprOr=ExprOr)
	 */
	protected void sequence_ExprAnd(ISerializationContext context, ExprAnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExprEq returns ExprEq
	 *
	 * Constraint:
	 *     ((exprSimple1=ExprSimple exprSimple2=ExprSimple) | expr=Expr)
	 */
	protected void sequence_ExprEq(ISerializationContext context, ExprEq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExprNot returns ExprNot
	 *
	 * Constraint:
	 *     ((not=Not exprEq=ExprEq) | exprEq=ExprEq)
	 */
	protected void sequence_ExprNot(ISerializationContext context, ExprNot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExprOr returns ExprOr
	 *
	 * Constraint:
	 *     ((exprNot=ExprNot exprOr=ExprOr) | exprNot=ExprNot)
	 */
	protected void sequence_ExprOr(ISerializationContext context, ExprOr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExprSimple returns ExprSimple
	 *
	 * Constraint:
	 *     (
	 *         nil=Nil2 | 
	 *         variable=VARIABLE | 
	 *         symbol=SYMBOL | 
	 *         (cons=Cons lexpr=Lexpr) | 
	 *         (list=List lexpr=Lexpr) | 
	 *         (hd=Hd expr=Expr) | 
	 *         (tl=Tl expr=Expr) | 
	 *         (symbol=SYMBOL lexpr=Lexpr)
	 *     )
	 */
	protected void sequence_ExprSimple(ISerializationContext context, ExprSimple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns Expr
	 *
	 * Constraint:
	 *     (exprsimple=ExprSimple | exprAnd=ExprAnd)
	 */
	protected void sequence_Expr(ISerializationContext context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Exprs returns Exprs
	 *
	 * Constraint:
	 *     ((expr=Expr exprs=Exprs) | expr=Expr)
	 */
	protected void sequence_Exprs(ISerializationContext context, Exprs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     For returns For
	 *
	 * Constraint:
	 *     (expr=Expr commands=Commands)
	 */
	protected void sequence_For(ISerializationContext context, For semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.FOR__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.FOR__EXPR));
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.FOR__COMMANDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.FOR__COMMANDS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getForAccess().getCommandsCommandsParserRuleCall_3_0(), semanticObject.getCommands());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Foreach returns Foreach
	 *
	 * Constraint:
	 *     (expr1=Expr expr2=Expr commands=Commands)
	 */
	protected void sequence_Foreach(ISerializationContext context, Foreach semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.FOREACH__EXPR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.FOREACH__EXPR1));
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.FOREACH__EXPR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.FOREACH__EXPR2));
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.FOREACH__COMMANDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.FOREACH__COMMANDS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForeachAccess().getExpr1ExprParserRuleCall_1_0(), semanticObject.getExpr1());
		feeder.accept(grammarAccess.getForeachAccess().getExpr2ExprParserRuleCall_3_0(), semanticObject.getExpr2());
		feeder.accept(grammarAccess.getForeachAccess().getCommandsCommandsParserRuleCall_5_0(), semanticObject.getCommands());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (function=SYMBOL definition=Definition)
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.FUNCTION__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.FUNCTION__FUNCTION));
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.FUNCTION__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.FUNCTION__DEFINITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionAccess().getFunctionSYMBOLTerminalRuleCall_1_0(), semanticObject.getFunction());
		feeder.accept(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Hd returns Hd
	 *
	 * Constraint:
	 *     hd='hd'
	 */
	protected void sequence_Hd(ISerializationContext context, Hd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.HD__HD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.HD__HD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHdAccess().getHdHdKeyword_0(), semanticObject.getHd());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     If returns If
	 *
	 * Constraint:
	 *     (expr=Expr commands1=Commands commands2=Commands?)
	 */
	protected void sequence_If(ISerializationContext context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     ((variable=VARIABLE input=Input) | variable=VARIABLE)
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Lexpr returns Lexpr
	 *
	 * Constraint:
	 *     (expr=Expr lexpr=Lexpr)
	 */
	protected void sequence_Lexpr(ISerializationContext context, Lexpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.LEXPR__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.LEXPR__EXPR));
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.LEXPR__LEXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.LEXPR__LEXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLexprAccess().getExprExprParserRuleCall_0_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getLexprAccess().getLexprLexprParserRuleCall_1_0(), semanticObject.getLexpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     List returns List
	 *
	 * Constraint:
	 *     list='list'
	 */
	protected void sequence_List(ISerializationContext context, List semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.LIST__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.LIST__LIST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListAccess().getListListKeyword_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Nil2 returns Nil2
	 *
	 * Constraint:
	 *     nil='nil'
	 */
	protected void sequence_Nil2(ISerializationContext context, Nil2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.NIL2__NIL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.NIL2__NIL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNil2Access().getNilNilKeyword_0(), semanticObject.getNil());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Nop returns Nop
	 *
	 * Constraint:
	 *     nop='nop'
	 */
	protected void sequence_Nop(ISerializationContext context, Nop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.NOP__NOP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.NOP__NOP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNopAccess().getNopNopKeyword_0(), semanticObject.getNop());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Not returns Not
	 *
	 * Constraint:
	 *     not='!'
	 */
	protected void sequence_Not(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.NOT__NOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.NOT__NOT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotAccess().getNotExclamationMarkKeyword_0(), semanticObject.getNot());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Output returns Output
	 *
	 * Constraint:
	 *     ((variable=VARIABLE output=Output) | variable=VARIABLE)
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     functions+=Function+
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Read returns Read
	 *
	 * Constraint:
	 *     (variable+=VARIABLE variable+=VARIABLE*)
	 */
	protected void sequence_Read(ISerializationContext context, Read semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tl returns Tl
	 *
	 * Constraint:
	 *     tl='tl'
	 */
	protected void sequence_Tl(ISerializationContext context, Tl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.TL__TL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.TL__TL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTlAccess().getTlTlKeyword_0(), semanticObject.getTl());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Vars returns Vars
	 *
	 * Constraint:
	 *     ((variable=VARIABLE vars=Vars) | variable=VARIABLE)
	 */
	protected void sequence_Vars(ISerializationContext context, Vars semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     While returns While
	 *
	 * Constraint:
	 *     (expr=Expr commands=Commands)
	 */
	protected void sequence_While(ISerializationContext context, While semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.WHILE__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.WHILE__EXPR));
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.WHILE__COMMANDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.WHILE__COMMANDS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhileAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getWhileAccess().getCommandsCommandsParserRuleCall_3_0(), semanticObject.getCommands());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Write returns Write
	 *
	 * Constraint:
	 *     (variable+=VARIABLE variable+=VARIABLE*)
	 */
	protected void sequence_Write(ISerializationContext context, Write semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
