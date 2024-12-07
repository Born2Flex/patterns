package edu.internship.structural.composite.evaluation.expressions;

public class Divide implements Expression {
    private final Expression left;
    private final Expression right;

    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate() {
        double divisor = left.evaluate();
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return right.evaluate() / divisor;
    }

    @Override
    public String toString() {
        return toString(0);
    }

    @Override
    public String toString(int level) {
        String indent = "\t".repeat(level);
        StringBuilder sb = new StringBuilder();

        sb.append(indent).append("Divide\n");
        sb.append(left.toString(level + 1));
        sb.append(right.toString(level + 1));
        return sb.toString();
    }
}
