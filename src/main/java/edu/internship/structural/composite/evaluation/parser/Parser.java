package edu.internship.structural.composite.evaluation.parser;

import java.util.ArrayDeque;
import java.util.Deque;

public class Parser {
    public String convertToRPN(String input) {
        input = input.replaceAll("\\s+", "");
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else if (isOperator(c)) {
                while (!stack.isEmpty() && getPriority(stack.peek()) >= getPriority(c)) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    private int getPriority(char operator) {
        return switch (operator) {
            case '(' -> 0;
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> throw new IllegalArgumentException("Unsupported operator: " + operator);
        };
    }

    private boolean isOperator(char symbol) {
        return "+-*/".indexOf(symbol) >= 0;
    }

    public static void main(String[] args) {
        Parser parser = new Parser();
        System.out.println(parser.convertToRPN("1*(2+3*4)+5"));
    }
}
