import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = getInt();
        int b = getInt();
        char operation = getOperation();
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

    public static int calc(int A, int B, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = A+B;
                break;
            case '-':
                result = A-B;
                break;
            case '*':
                result = A*B;
                break;
            case '/':
                result = A/B;
                break;
            default:
                System.out.println("Error. Try again.");
                result = calc(A, B, getOperation());
        }
        return result;
    }
}
