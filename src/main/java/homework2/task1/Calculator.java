package homework2.task1;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = getInt();
        char operation = getOperation();
        int b = getInt();
        int result = calc(a, b, operation);
        System.out.println("Result: " + result);
    }

    public static int getInt() {
        System.out.println("Enter the number:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Error. Try again.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Enter the arithmetic operation:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Error. Try again.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int a, int b, char operation) {
        int result;
        switch (operation) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            default -> {
                System.out.println("Error. Try again.");
                result = calc(a, b, getOperation());
            }
        }
        return result;
    }
}
