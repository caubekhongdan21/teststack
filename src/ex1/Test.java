package ex1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>(10, String.class);
        var input = new Scanner(System.in);
        System.out.print("str : ");
        var str = input.nextLine();
        var test = str.split(" ");
        for (var a : test) {
            stringStack.push(a);
        }
        var count = stringStack.getSize();
        var str1 = "";
        for (int i = count - 1; i >= 0; i--) {
            if (i != 0) {
                str1 += stringStack.getData()[i] + " ";
            } else {
                str1 += stringStack.getData()[i];
            }
        }
        System.out.println(str1);
    }
}
