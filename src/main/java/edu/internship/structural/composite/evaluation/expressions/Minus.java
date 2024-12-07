package edu.internship.structural.composite.evaluation.expressions;

public class Minus implements Expression {
    private final Expression left;
    private final Expression right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate() {
        return right.evaluate() - left.evaluate();
    }

    @Override
    public String toString() {
        return toString(0);
    }

    @Override
    public String toString(int level) {
        String indent = "\t".repeat(level);
        StringBuilder sb = new StringBuilder();

        sb.append(indent).append("Minus\n");
        sb.append(right.toString(level + 1));
        sb.append(left.toString(level + 1));
        return sb.toString();
    }
}
