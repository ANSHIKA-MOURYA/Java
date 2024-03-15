import java.util.Scanner;
import java.util.Random;
import java.util.*;
 public class GuessTheNumber{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        final int max=1000;
        final int min_attempts=10;
        int numbergenerated=random.nextInt(max)+1;
        int attempts =0;
        int score=0;

        System.out.println("Welcome to the number guessing game");
        System.out.println("Enter your player name");
         int name=sc.nextInt();
        System.out.println("Welcome"+ name);
        System.out.println("I have selected a number between 1 and " + max);
        System.out.println("You have " + min_attempts + " attempts to guess it.");

        while (attempts < min_attempts) {
            System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();
            attempts++;

            if (userGuess == numbergenerated) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                score += (min_attempts - attempts) * 10; 
                break;
            }
            else if (userGuess < numbergenerated) {
                System.out.println("Try again! The number is higher than your guess.");
            } 
            else {
                System.out.println("Try again! The number is lower than your guess.");
            }
        }

        if (attempts == min_attempts) {
            System.out.println("Sorry, you've run out of attempts. The number was: " +numbergenerated);
        }

        System.out.println("Your score: " + score);
        
    }
}


    
    
 