import java.util.Scanner;
public class RockPaperScissorsGame {

public static String moveToString(int move){
    switch(move){
        case 1: return "Rock" ;
        case 2: return "paper";
        case 3: return "Scissors";
        default : return "Unknown";
    }
}
//jfkd
public static int deciseWinner( int player , int computer ){
    if(player==computer )
    return 0;
    if((player == 0 && computer == 2)||(player==1 && computer==0)||(player== 2 && computer ==1) ){
        return 1;
    }
    else{
        return -1 ;
    }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("=== Rock paper Scissors===");
        System.out.println("Instruction : Type 1 for Rock ,2 for paper ,3 for Scissors.");
        System.out.println("Type 'q' to quit.\n" );
        int playerWins = 0,compWins = 0, ties = 0;
        int result = 0;
        while(true){
        System.out.println("your move(1 = Rock, 2 = paper,3= Scisssors or q to qyit ):");
        String input = sc.next().trim();
        if(input.equalsIgnoreCase("q")){
            System.out.println("\nGame Over!");
            break;
        }
        int playerMove = 0;
        try{
            playerMove = Integer.parseInt(input);
        }
        catch(NumberFormatException e){
            System.out.println("you" +moveToString(playerMove));
            if(result == 1){
              System.out.println("Result :it's a ties"); 
              ties++ ;
            }
             else if(result == 2){
                System.out.println("Result : you win !");
                playerWins++ ;
            }
            else{
                System.out.println("Result : computer wins ");
                compWins++ ;
            }
            System.out.println("score -> you"+playerWins+"computer"+compWins+"ties:"+ties);
        }
        System.out.println("finalscore -> you "+playerWins+"computer "+compWins+"ties"+ties);
        System.out.println("Thank you playing !");
        sc.close();
        }
    }
    



}
