import java.util.Scanner;
public class FindSquarNumber {

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        for(int i= 1; i<=n; i++){
            int squar = n*n;
            int quve= n*n*n;
        System.out.println(" this number squar:" +squar );
        squar++ ;
        System.out.println("this number quve:" +quve);
            } sc.close();
        }
    }
 