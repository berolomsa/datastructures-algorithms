package stackandqueues;

import java.util.Deque;
import java.util.LinkedList;

public class RPNExpression {
    public static void main(String[] args) {
        String expr = "3,4,+,2,X,1,+";
        String[] exprParts = expr.split(",");

        if (exprParts.length == 1) {
            System.out.println(exprParts[0]);
            return;
        }
        Deque<String> deque = new LinkedList<>();

        for(int i =0; i<exprParts.length; i++) {
            deque.addFirst(exprParts[i]);
        }
        Integer A = null;
        Integer B = null;
        boolean isItA = true;
        while (deque.size() != 0) {
            String obj = deque.removeLast();
            switch (obj) {
                case "+":
                    deque.addLast(Integer.toString(A+B));
                    break;
                case "/":
                    deque.addLast(Integer.toString(A/B));
                    break;
                case "-":
                    deque.addLast(Integer.toString(A-B));
                    break;
                case "X":
                    deque.addLast(Integer.toString(A*B));
                    break;
                default:
                    if (isItA) {
                        A = Integer.parseInt(obj);
                        isItA = false;
                    } else {
                        B = Integer.parseInt(obj);
                        isItA = true;
                    }
            }
        }

        System.out.println(A);

        solution2(exprParts);
    }

    private static void solution2(String[] exprParts) {
        int A = 0;
        int B = 0;
        boolean isA = true;

        for (String expr: exprParts) {
            switch (expr) {
                case "+":
                    A = A+B;
                    isA = false;
                    break;
                case "/":
                    A = A/B;
                    isA = false;
                    break;
                case "-":
                    A = A-B;
                    isA = false;
                    break;
                case "X":
                    A = A*B;
                    isA = false;
                    break;
                default:
                    if (isA) {
                        A = Integer.parseInt(expr);
                        isA = false;
                    } else {
                        B = Integer.parseInt(expr);
                        isA = true;
                    }
                }
        }
        System.out.println(A);
    }
}
