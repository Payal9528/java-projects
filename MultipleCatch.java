import java.util.Scanner;

public class MultipleCatch {

    public static void main(String[] args) {
        try {
            int[] number = {1, 2, 3};
            System.out.println(number[5]); // This will throw ArrayIndexOutOfBoundsException
            int result = 10 / 0;           // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        }

        int a = 21;
        int b= 30;
       int sub = a-b;
        System.out.println("RESULT = " +sub);
    }
}
