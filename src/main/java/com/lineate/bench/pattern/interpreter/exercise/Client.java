package com.lineate.bench.pattern.interpreter.exercise;

public class Client {

    public static void main(String[] args) {
        Expression jason = new TerminalExpression("Jason");
        Expression married = new TerminalExpression("Married");
        Expression myra = new TerminalExpression("Myra");
        Expression lucy = new TerminalExpression("Lucy");

        Expression jasonMarried = new NonTerminalExpression((a, b) -> a && b, jason, married);
        Expression lucyOrMyra = new NonTerminalExpression((a, b) -> a || b, lucy, myra);

        Context lucyIsFemaleContext = new Context("Lucy is female");
        Context myraIsFemaleContext = new Context("Myra is female");
        Context jasonIsFemaleContext = new Context("Jason is female");
        Context jasonIsMarriedContext = new Context("Jason is married");
        Context johnIsMarriedContext = new Context("John is married");

        System.out.println(lucyIsFemaleContext.getInput() + "? " + lucyOrMyra.interpret(lucyIsFemaleContext));
        System.out.println(myraIsFemaleContext.getInput() + "? " + lucyOrMyra.interpret(myraIsFemaleContext));
        System.out.println(jasonIsFemaleContext.getInput() + "? " + lucyOrMyra.interpret(jasonIsFemaleContext));
        System.out.println(jasonIsMarriedContext.getInput() + "? " + jasonMarried.interpret(jasonIsMarriedContext));
        System.out.println(johnIsMarriedContext.getInput() + "? " + jasonMarried.interpret(johnIsMarriedContext));


    }
}
