package homework2.task1;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       Calculator app = new Calculator();
       app.startCalculator();
    }

    public void startCalculator() {
        int a = getInt();
        char operation = getOperation();
        int b = getInt();
        int result = calc(a, b, operation);
        System.out.println("Result= " + result);
    }

    public int getInt() {
        boolean isCorrect = false;
        System.out.println("Enter the number:");
        int num = 0;
        while (!isCorrect) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                isCorrect = true;
            } else {
                System.out.println("Error. Try again.");
            }
        }
        return num;
    }

    public char getOperation() {
        boolean isCorrect = false;
        System.out.println("Enter the arithmetic operation:");
        char operation = 0;
        while (!isCorrect) {
            operation = scanner.next().charAt(0);
            isCorrect = operation == '+' || operation == '-' || operation == '*' || operation == '/';
            if (!isCorrect) {
                System.out.println("Error. Try again.");
            }
        }
        return operation;
    }

    public int calc(int a, int b, char operation) {
        int result = 0;
        switch (operation) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            default -> System.exit(-1);
        }
        return result;
    }
}
