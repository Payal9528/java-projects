import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n number ");
        int n = sc.nextInt();
        if(n == 0){
            System.out.println(" sum = "+n);

        }
       sc.close();
    }
}