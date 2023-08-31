package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<Student> studentStack = new Stack<>(5, Student.class);
        addData(studentStack);
        var input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n\n\n\t\t MENU");
            System.out.println("0 : Exit");
            System.out.println("1 : Add A Stu");
            System.out.println("2 : Show Stu First");
            System.out.println("3 : Show size Stack");
            System.out.println("4 : Show List");
            System.out.print("choice : ");
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    var stu = createStu(input);
                    studentStack.push(stu);
                    System.out.println("Successfully");
                    break;
                case 2:
                    var a = studentStack.peek();
                    if (a != null) {
                        showAStu(a);
                    } else {
                        System.out.println("False");
                    }
                    break;
                case 3:
                    System.out.println(studentStack.getSize());
                    break;
                case 4:
                    var b = studentStack.getData();
                    if (b.length > 0) {
                        showList(b);
                    } else {
                        System.out.println("False");
                    }
                    break;
                default:
                    System.out.println("False");
            }
        } while (choice != 0);
    }

    private static void addData(Stack<Student> studentStack) {
        studentStack.push(new Student("B25DCCN100", "bui phuong thoa", "hai phong",
                "thoa@gmail.com", 21f, 3f));

        studentStack.push(new Student("B25DCCN101", "bui phuong thoa", "hai phong",
                "thoa@gmail.com", 21f, 3f));

        studentStack.push(new Student("B25DCCN102", "bui phuong thoa", "hai phong",
                "thoa@gmail.com", 21f, 3f));

        studentStack.push(new Student("B25DCCN103", "bui phuong thoa", "hai phong",
                "thoa@gmail.com", 21f, 3f));

        studentStack.push(new Student("B25DCCN104", "bui phuong thoa", "hai phong",
                "thoa@gmail.com", 21f, 3f));

        studentStack.push(new Student("B25DCCN105", "bui phuong thoa", "hai phong",
                "thoa@gmail.com", 21f, 3f));
    }

    private static void showList(Student[] b) {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                "idStu", "fullName", "address", "email", "age", "avg");
        for (var c : b) {
            System.out.printf("%-20s%-20s%-20s%-20s%-20.1f%-20.1f\n",
                    c.getIdStu(), c.getFullName(), c.getAddress(),
                    c.getEmail(), c.getAge(), c.getAvg());
        }
    }

    private static void showAStu(Student a) {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                "idStu", "fullName", "address", "email", "age", "avg");
        System.out.printf("%-20s%-20s%-20s%-20s%-20.1f%-20.1f\n",
                a.getIdStu(), a.getFullName(), a.getAddress(),
                a.getEmail(), a.getAge(), a.getAvg());
    }

    private static Student createStu(Scanner input) {
        System.out.println("idStu : ");
        var idStu = input.nextLine();
        System.out.println("fullName : ");
        var fullName = input.nextLine();
        System.out.println("address : ");
        var address = input.nextLine();
        System.out.println("email : ");
        var email = input.nextLine();
        System.out.println("age : ");
        var age = input.nextFloat();
        System.out.println("avg : ");
        var avg = input.nextFloat();
        return new Student(idStu, fullName, address, email, age, avg);
    }
}
