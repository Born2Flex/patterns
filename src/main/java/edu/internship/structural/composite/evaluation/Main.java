package edu.internship.structural.composite.evaluation;

import edu.internship.structural.composite.evaluation.expressions.Expression;
import edu.internship.structural.composite.evaluation.parser.Parser;

public class Main {
    public static void main(String[] args) {
        String expressionText = "1 * ( 2 + 3 * 4 ) + 5 / 7 + 9 * (5 - 3 * (7 + 1))";
        System.out.println("Expression: " + expressionText);
        Parser parser = new Parser();
        String expressionInRPN = parser.convertToRPN(expressionText);
        System.out.println("Expression in RPN: " + expressionInRPN);
        Evaluator evaluator = new Evaluator();
        System.out.println();
        Expression expression = evaluator.parseExpression(expressionInRPN);
        System.out.println(expression);
        System.out.println("Result of computation: " + expression.evaluate());
    }
}
