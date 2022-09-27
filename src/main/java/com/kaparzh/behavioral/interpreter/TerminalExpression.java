package com.kaparzh.behavioral.interpreter;

public class TerminalExpression implements Expression {

    private final int n;

    public TerminalExpression(int n) {
        this.n = n;
    }

    @Override
    public int interpret() {
        return n;
    }
}
