import java.util.Scanner;

public class FinallyExample {

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        }

        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}

