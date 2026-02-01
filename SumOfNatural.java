import java.util.Scanner;
public class SumOfNatural {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;  // last digit
            sum += digit;          // add to sum
            n /= 10;             // remove last digit
        }
        
        System.out.print(" sum of natural number = "+sum);
        sc.close();
    }
}