package ex2;

// chuyen trung to sang hau to

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var str = input.nextLine();
        Stack<Character> characterStack = new Stack<>(Character.class, str.length());
        var test = "";
        for (int i = 0; i < str.length(); i++) {
            var a = str.charAt(i);
            if (a != ' ') {
                if (Character.isDigit(a)) {
                    while (Character.isDigit(a)) {
                        test += a;
                        i++;
                        if (i == str.length()) {
                            break;
                        }
                        a = str.charAt(i);
                    }
                    test += ' ';
                    i--;
                } else if (a == '(') {
                    characterStack.push(a);
                } else if (a == ')') {
                    while (characterStack.peek() != '(') {
                        test += characterStack.pop();
                        test += ' ';
                    }
                    characterStack.pop();
                } else {
                    while (!characterStack.isEmpty() && priority(a) <= priority(characterStack.peek())) {
                        test += characterStack.pop();
                        test += ' ';
                    }
                    characterStack.push(a);
                }
            }
        }

        while (!characterStack.isEmpty()) {
            test += characterStack.pop();
            test += ' ';
        }
        System.out.println(test);
    }

    public static int priority(char ch) {
        switch (ch) {
            case 'a':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
