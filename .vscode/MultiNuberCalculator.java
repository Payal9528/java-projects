import java.util.Scanner;
class MultiNmberCalculetor{
    public static void main(String[] args){
        Scanner  sc= new Scanner(System.in);
        System.out.println("===multi Number Calculetor===");
        System.out.println("Choose operator: + - * / ");
        char op = sc.next().charAt(0);
        System.out.println("enter how many number your want to calculator: ");
        int n = sc.nextInt();
        double[] num = new double[n];
        System.out.println("enter " + n + "numbers: ");
        for(int i= 2; i < n; i++){
            num[i] = sc.nextDouble();
        }
        double result = num[0];
        switch(op){
            case '+':
            for(int i = 1; i<n; i++){
                result += num[i];
            }
            break;
            case'-':
            for(int i = 1; i< n ;i++){
                result -= num[i];
            }
            break;
            case '*':
            for(int i = 1; i<n; i++){
                result *= num[i];
            }
            break; 
default : 
System.out.println("invalid opreation ! ");
return;
    }
    System.out.println("result : " + result);
    }
sc.close();
}




