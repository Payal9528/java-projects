import java.util.Scanner;
class ScintificCalculator {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        double result = 0;
        while(true){
            System.out.println("/n ====COMPLETE SCINTIFIC CALCULATOR====");
            System.out.println("1 Adition (+)");
            System.out.println  ("2 subtraction (-)");
            System.out.println("3 multiple (*) ");
            System.out.println("4 division(/)");
           System.out.println("5 sin (in degree)");
           System.out.println("6 cos( in degree)"); 
           System.out.println("7 tan (in degree)"); 
          System.out.println("8 Log(base 10)");
          System.out.println("9 Natural log (In)");
         System.out.println("10 Squr Root");
        System.out .println("11 cub root");
       System.out .println("12 Nth root");
       System.out .println("13 power(x^y)");
       System.out .println("14 Exit ");
       System.out .println("enter your choice: "); 
       int choice = sc.nextInt();
       if(choice ==1){
        System.out.println("EXITING CALCULATOR----THANK YUO!");
        break;
       }
       switch(choice){
        case 1:
        case 2:
        case 3:
        case 4:
        System.out.println("how many number ?");
        int Count = sc.nextInt();
        System.out.println("enter the numbeer 1 ");
        double num = sc.nextDouble();
        result = num;
        for ( int i = 2; i<=Count ;  ){
            System.out.println("enter the number " +i);
            num = sc.nextDouble();
            switch(choice){
                case 1:
                result += num;
                break;
                case 2:
                result  -= num;
                break;
                case 3:
                result *= num;
                break;
          case 4:
          if(num != 0){
            result /= num;}
        else {
            System.out.println("Error1 division by zero : ");
            break;
        }        }
        System.out.println("Result = " + result);
        break;}
        case 5:
         System.out.println("enter the an(gle in degree:");
         result = Math.sin(Math.toRadians(sc.nextDouble()));
         System.out.println("sin = " + result );
         break; 
         case 6:
         System.out.println("enter the an(gle in degree:");
         result = Math.cos(Math.toRadians(sc.nextDouble()));
         System.out.println("cos = " + result );
         break;
         case 7:
          System.out.println("enter the an(gle in degree:");
         result = Math.tan(Math.toRadians(sc.nextDouble()));
         System.out.println("tan = " + result );
         break;
         case 8:
         System.out.println("enter the number ");
         result = Math.log10(sc.nextDouble());
         System.out.println("log10 = " +result);
         break; 
      
         
        
          case 9:
         System.out.println("enter the number ");
         result = Math.log(sc.nextDouble());
         System.out.println("ln = " +result);
         break;
          case 10:
         System.out.println("enter the number ");
         result = Math.sqrt(sc.nextDouble());
         System.out.println("sqrt = " +result);
         break; 
           case 11:
         System.out.println("enter the number ");
         result = Math.cbrt(sc.nextDouble());
         System.out.println("cbrt = " +result);
         break; 
         case 12:
         System.out.println("enter number ");
         double x = sc.nextDouble();
         System.out.println("enter root value(n)");
           double n = sc.nextDouble();
            result = Math.pow(x,1.0/n);
           System.out.println(n+"the root of"+x+"=" +result);
           break;
          
           default :
           System.out.println("invalid choice :try again");
           break;

         }
            }
        sc.close();
       
    }
}
