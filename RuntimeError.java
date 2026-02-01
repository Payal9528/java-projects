import java.util.Scanner;
public class RuntimeError {

    public static  void main (String[] args){
    try{    int a = 10;
     int b = 0;
     int result = a/b;
     System.out.println(result);
    }
    catch(ArithmeticException e){
        System.out.println("not devided by zero");
    }
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the any number");
    int n= sc.nextInt();
    for( int i= 0; i<=n;i++){
        System.out.println(+i);
    }
      sc.close();
    }
}