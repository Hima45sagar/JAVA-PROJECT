import java.util.Scanner;

public class game {
    
    public static void main(String[] args){

           System.out.println("WELCOME TO GAME ");


            Scanner input = new Scanner(System.in);
            Scanner scam = new Scanner(System.in);
          System.out.println("enetr player1 name");
                String name = input.nextLine();

                System.out.println("enetr player2 name");
                String name2 = input.nextLine();


                System.out.println("choice 1 = stone, 2 = paper, 3 = sizor");
                 

                System.out.println("player 1 enter you choice");
                 int player1 = scam.nextInt();

                System.out.println("player 2 enter your choice");
                 int player2 = scam.nextInt();


                if(player1 < 1 || player1 > 3 && player2 < 1 || player2 > 3){
                    System.out.println("invalid choice");

                }
                else if(player1 == player2){
                    System.out.println("MATCH DRAW");
                }
                else if((player1 == 1 && player2 == 3) ||
            (player1 == 2 && player2 == 1) ||
        (player1 == 3 && player2 == 2)){
            System.out.println("PLAYER1 WIN THE GAME");
        }
        else {
            System.out.println("PLAYER 2 WIN");
        }






                

                
               }
}
