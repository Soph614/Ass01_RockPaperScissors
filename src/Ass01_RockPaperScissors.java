import java.util.Scanner; // imports scanner

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // names Scanner "in"
        String playOrNot = "Y"; // makes playOrNot equal to Y so that the while loop runs the first time
        String playerA = "";
        String playerB = "";
        boolean done = false;

        do {
            do {
                System.out.print("Player A, please enter your choice, R, P, or S: "); // collecting Player A's choice
                playerA = in.nextLine(); // storing choice in value playerA
                if(playerA.equalsIgnoreCase("R") | playerA.equalsIgnoreCase("P") | playerA.equalsIgnoreCase("S"))
                {
                    done = true;
                }
                else {
                    System.out.print("That is an incorrect value. ");
                }
                // System.out.println("That is an incorrect value.");
            } while(!done);

            done = false;

            do {
                System.out.print("Player B, please enter your choice, R, P, or S: ");
                playerB = in.nextLine();
                if(playerB.equalsIgnoreCase("R") | playerB.equalsIgnoreCase("P") | playerB.equalsIgnoreCase("S"))
                {
                    done = true;
                }
                else {
                    System.out.print("That is an incorrect value. ");
                }
            } while(!done);

            done = false;

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
                if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock, Player A wins!");

                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("You both chose Paper, it's a tie!");
                }
                else
                    System.out.println("Scissors cut Paper, Player B wins!");
            }
            else
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks Scissors, Player B wins!");
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cut Paper, Player A wins!");
                }
                else
                {
                    System.out.println("You both chose Scissors, it's a tie!");
                }
            }

            done = false;

            do {
                System.out.print("Play again? (Y for yes, N for no): ");
                playOrNot = in.nextLine();
                if(playOrNot.equalsIgnoreCase("Y") | playOrNot.equalsIgnoreCase("N"))
                {
                    done = true;
                }
                else
                {
                    System.out.print("That is an incorrect value. ");
                }
            } while(!done);

        } while(playOrNot.equalsIgnoreCase("Y"));
    }
}