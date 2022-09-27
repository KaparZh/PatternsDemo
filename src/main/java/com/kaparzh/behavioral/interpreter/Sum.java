package com.kaparzh.behavioral.interpreter;

public class Sum implements Expression {

    private final Expression expression1;
    private final Expression expression2;

    public Sum(Expression leftExpression, Expression rightExpression) {
        this.expression1 = leftExpression;
        this.expression2 = rightExpression;
    }

    @Override
    public int interpret() {
        return expression1.interpret() + expression2.interpret();
    }
}
