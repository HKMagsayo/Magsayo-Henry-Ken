import java.util.Scanner;
import java.util.Stack;

public class APEMDAS {
    public static void main(String[] args) {
        String EQ = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rules: \n-Up to four(4) numbers \n-No Exponents \n\nInput your Equation: ");
        EQ = scanner.nextLine();

        String result = evaluateExpression(EQ);
        System.out.println("Result: " + result);
    }

    public static String evaluateExpression(String expression) {
        Stack<Character> operators = new Stack<>();
        Stack<Double> operands = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                StringBuilder num = new StringBuilder();
                num.append(c);
                while (i + 1 < expression.length() && (Character.isDigit(expression.charAt(i + 1)) || expression.charAt(i + 1) == '.')) {
                    num.append(expression.charAt(++i));
                }
                operands.push(Double.parseDouble(num.toString()));
            } else if (c == '-') {
                while (!operators.isEmpty() && (operators.peek() == '-' || operators.peek() == '+' || operators.peek() == '/' || operators.peek() == '*')) {
                    applyOperator(operators, operands);
                }
                operators.push(c);
            } else if (c == '+') {
                while (!operators.isEmpty() && (operators.peek() == '+' || operators.peek() == '/' || operators.peek() == '*')) {
                    applyOperator(operators, operands);
                }
                operators.push(c);
            } else if (c == '/') {
                while (!operators.isEmpty() && (operators.peek() == '/' || operators.peek() == '*')) {
                    applyOperator(operators, operands);
                }
                operators.push(c);
            } else if (c == '*') {
                while (!operators.isEmpty() && operators.peek() == '*') {
                    applyOperator(operators, operands);
                }
                operators.push(c);
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (operators.peek() != '(') {
                    applyOperator(operators, operands);
                }
                operators.pop(); // Pop the '('
            }
        }

        while (!operators.isEmpty()) {
            applyOperator(operators, operands);
        }

        if (!operands.isEmpty()) {
            return String.valueOf(operands.peek());
        } else {
            return "Invalid expression";
        }
    }

    public static void applyOperator(Stack<Character> operators, Stack<Double> operands) {
        char operator = operators.pop();
        double rightOperand = operands.pop();
        double leftOperand = operands.pop();

        double result;
        switch (operator) {
            case '+':
                result = leftOperand + rightOperand;
                break;
            case '-':
                result = leftOperand - rightOperand;
                break;
            case '*':
                result = leftOperand * rightOperand;
                break;
            case '/':
                if (rightOperand != 0) {
                    result = leftOperand / rightOperand;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
        operands.push(result);
    }
}