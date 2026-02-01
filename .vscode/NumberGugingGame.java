import java.util.Random;
import java.util.Scanner;
public class NumberGugingGame{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int number = r.nextInt(10);
        int guess = 0;
        while(guess!= number){
            for(int i = 0; i <= guess; i++){
        System.out.println("ente your guess");
         guess = sc.nextInt();
        if(guess >number){      
       System.out.println("Too High");
    }
            else if(guess < number){
                System.out.println("Too Low");
            }
                else{
                    System.out.println(" Coungretulation ");
                }
            }
                sc.close();
            }
        }
    }
    
