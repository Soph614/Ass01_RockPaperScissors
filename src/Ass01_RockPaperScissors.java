import javax.swing.*;
import java.util.Scanner;

public class Ass01_RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playOrNot = "Y";
        String playerA = "";
        String playerB = "";

        do {
            do {
                System.out.println("Player A, please enter your choice, R, P, or S: ");
                playerA = in.nextLine();
                in.nextLine();
            } while(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S"));

            do {
                System.out.println("Player B, please enter your choice: R, P, or S: ");
                playerB = in.nextLine();
                in.nextLine();
            } while(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S"));

            if(playerA.equalsIgnoreCase("R"))
            {
                if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("You both chose Rock, it's a tie!");
                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock, Player B wins!");
                }
                else
                    System.out.println("Rock breaks Scissors, Player A wins!");
            }
            else if(playerA.equalsIgnoreCase("P"))
            {
                if(playerB.equalsIgnoreCase("R")) ;
                {
                    System.out.println("Paper covers Rock, Player A wins!");
                }
                else if(playerB.equalsIgnoreCase("P")) {
                    System.out.println("You both chose Paper, it's a tie!");
                } else
                    System.out.println("Scissors cut Paper, Player B wins!");
            }
            else
                if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks Scissors, Player B wins!");
                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cut Paper, Player A wins!");
                }
                else
                    System.out.println("You both chose Scissors, it's a tie!");

            {
                System.out.println("I really want this to work.");
            }

            } while(playerA.equalsIgnoreCase("R, P, S"));

            System.out.println("Press Y to keep playing or any other key to stop playing: ");
            playOrNot = in.nextLine();
        } while(playOrNot.equalsIgnoreCase("Y"));
    }
