package edu.internship.structural.composite.evaluation;

import edu.internship.structural.composite.evaluation.expressions.*;
import edu.internship.structural.composite.evaluation.expressions.Number;
import java.util.ArrayDeque;
import java.util.Deque;

public class Evaluator {

    public Expression parseExpression(String expression) {
        Deque<Expression> operands = new ArrayDeque<>();
        for (char c : expression.toCharArray()) {
            if (isOperator(c)) {
                operands.push(getOperator(c, operands.pop(), operands.pop()));
            } else {
                operands.push(new Number(c - '0'));
            }
        }
        return operands.pop();
    }

    public Expression getOperator(char operator, Expression operand1, Expression operand2) {
        return switch (operator) {
            case '+' -> new Plus(operand1, operand2);
            case '-' -> new Minus(operand1, operand2);
            case '*' -> new Multiply(operand1, operand2);
            case '/' -> new Divide(operand1, operand2);
            default -> throw new IllegalArgumentException("Unsupported operator: " + operator);
        };
    }

    private boolean isOperator(char symbol) {
        return "+-*/".indexOf(symbol) >= 0;
    }
}
