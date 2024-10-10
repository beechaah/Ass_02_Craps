import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean donePlayAgain = false;
        boolean doneCrapsGame = false;
        boolean donePoint = false;
        Scanner in = new Scanner(System.in);
        String playAgain = "";

        Random gen = new Random();
        int die1 = 0;
        int die2 = 0;
        int crapsRoll = 0;
        int point = 0;

        do
        {
            do
            {
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                crapsRoll = die1 + die2;

                System.out.println("Die1 was " + die1 + " and Die2 was " + die2 + ", the sum was " + crapsRoll);


                if (crapsRoll == 2)
                {
                    System.out.println("You crapped out! You lose, game over!");
                    doneCrapsGame = true;
                }
                else if (crapsRoll == 3)
                {
                    System.out.println("You crapped out! You lose, game over!");
                    doneCrapsGame = true;
                }
                else if (crapsRoll == 12)
                {
                    System.out.println("You crapped out! You lose, game over!");
                    doneCrapsGame = true;
                }
                else if (crapsRoll == 7)
                {
                    System.out.println("You got a natural! You win, game over!");
                    doneCrapsGame = true;
                }
                else if (crapsRoll == 11)
                {
                    System.out.println("You got a natural! You win, game over!");
                    doneCrapsGame = true;
                }
                else // rolling for point
                {
                    donePoint = false;
                    point = crapsRoll;
                    System.out.println("You set the point to: " + point + "! Keep rolling!");

                    while(!donePoint)
                    {
                        die1 = gen.nextInt(6) + 1;
                        die2 = gen.nextInt(6) + 1;
                        crapsRoll = die1 + die2;
                        System.out.println(" Rolling for point: Die1 was " + die1 + " and Die2 was " + die2 + ", the sum was " + crapsRoll);

                        if(crapsRoll == point)
                        {
                            System.out.println("You got the point! You win!");
                            donePoint = true;
                            doneCrapsGame = true;
                        }

                        else if(crapsRoll == 7)
                        {
                            System.out.println("You crapped out! You lose, game over!");
                            donePoint = true;
                            doneCrapsGame = true;
                        }
                    }
                }

            } while (!doneCrapsGame);

            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("N"))
            {
                donePlayAgain = true;
            }
            else if (!playAgain.equalsIgnoreCase("Y"))
            {
                System.out.println("Invalid input, exiting the game.");
                donePlayAgain = true;
            }

        } while (!donePlayAgain);
    }
}
