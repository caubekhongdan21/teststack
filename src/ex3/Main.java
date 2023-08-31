package ex3;
// tinh value dang hau to
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        while (test > 0) {
            var str = input.nextLine();
            str = addSpace(str);
            var result = calculateResult(str);
            System.out.println(result);
            test--;
        }
    }

    private static double calculateResult(String str) {
        double result;
        Stack<String> stack = new Stack<>(String.class);
        String[] words = str.split("\\s+");
        for (var e : words) {
            if (isOperator(e)) {
                double b = Double.parseDouble(stack.pop());
                double a = Double.parseDouble(stack.pop());
                result = makeResult(a, b, e);
                System.out.println(result);
                stack.push(result + "");
            }
            else{
                stack.push(e);
            }
        }
        return Double.parseDouble(stack.peek());
    }

    private static double makeResult(double a, double b, String e) {
        return switch (e) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            case "^" -> Math.pow(a, b);
            default -> 0;
        };
    }

    private static boolean isOperator(String e) {
        return e.equals("+") || e.equals("-") || e.equals("*")
                || e.equals("/") || e.equals("^");
    }

//    private static boolean isOperator(String e) {
//    }

    private static String addSpace(String str) {
        str = str.replaceAll("\\^", " ^ ");
        str = str.replaceAll("\\+", " + ");
        str = str.replaceAll("-", " - ");
        str = str.replaceAll("\\*", " * ");
        str = str.replaceAll("/", " / ");
        return str;
    }
}
