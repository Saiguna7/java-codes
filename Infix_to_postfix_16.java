import java.util.*;
import java.util.Stack;
public class Infix_to_postfix_16 {
    public static String infixToPostfix(String infixExpression) {
        StringBuilder postfixExpression = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();
        for (int i = 0; i < infixExpression.length(); i++) {
            char ch = infixExpression.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfixExpression.append(ch);
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfixExpression.append(operatorStack.pop());
                }
                if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
                    operatorStack.pop();
                }
            } else {
                while (!operatorStack.isEmpty() && precedence(ch) <= precedence(operatorStack.peek())) {
                    postfixExpression.append(operatorStack.pop());
                }
                operatorStack.push(ch);
            }
        }

        while (!operatorStack.isEmpty()) {
            postfixExpression.append(operatorStack.pop());
        }

        return postfixExpression.toString();
    }

    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String infixExpression = sc.nextLine();
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println(postfixExpression);
    }
}
