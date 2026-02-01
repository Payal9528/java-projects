import java.util.Scanner;
class FactorialNumber {
public static void main (String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number ");
  int  n = sc.nextInt ();
    int fact = 1;
    for(int i = 1; i<= n; i++){
        fact =fact*i;
    }System.out.println("factocia of \n "+n+"="+fact);
    sc.close();
}
}
    

