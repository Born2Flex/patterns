package edu.internship.structural.composite.evaluation.expressions;

public class Number implements Expression {
    private final double value;

    public Number(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return toString(0);
    }

    @Override
    public String toString(int level) {
        String indent = "\t".repeat(level);
        return indent + "Operand: " + value + "\n";
    }
}
