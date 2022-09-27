package com.kaparzh.behavioral.interpreter;

import java.util.Iterator;

public class InterpreterRunner {

    public static void main(String[] args) {
        Expression sum = sum(2, 5);
        Expression sub = sub(2, 5);
        Expression multi = multi(2, 5);

        System.out.println(sum.interpret());
        System.out.println(sub.interpret());
        System.out.println(multi.interpret());
    }

    public static Sum sum(int a, int b) {
        return new Sum(new TerminalExpression(a), new TerminalExpression(b));
    }

    public static Substract sub(int a, int b) {
        return new Substract(new TerminalExpression(a), new TerminalExpression(b));
    }

    public static Multiply multi(int a, int b) {
        return new Multiply(new TerminalExpression(a), new TerminalExpression(b));
    }
}
