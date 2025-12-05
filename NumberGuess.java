import java.util.Random;
import java.util.Scanner;
public class NumberGuess{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playagain;
        System.out.println("Welcome to Number Game!");
        do { 
            int numToGuess = random.nextInt(100)+1;
            int attempts = 0;
            int maxAttempts = 5;
            boolean GuessCorrect = false;
            System.out.println("I have generated a number between 1 and 100. Can you guess it correctly");
            System.err.println("You have "+maxAttempts+" attempts");
            while(attempts<maxAttempts){
                System.out.println("Enter Guess number: ");
                int userGuess = scan.nextInt();
                attempts++;
                if(userGuess == numToGuess){
                    System.out.println("Congratulations! You guessed the correct number in "+attempts+" attempts");
                    GuessCorrect = true;
                    score+= maxAttempts-attempts+1;
                    break; 
                }
                else  if(userGuess > numToGuess){
                    System.out.println("Your Guess is Too High! Try again.");
                }
                else{
                    System.out.println("Your Guess is Too Low! Try again.");
                }
                System.out.println("Attempts remaining: " +(maxAttempts-attempts));
            }
            if(!GuessCorrect){
                System.out.println("Sorry! You are out of attempts. The correct number was: " +numToGuess);
            }
            System.out.println("Do you want to play again? (yes/no): ");
            playagain = scan.next().equalsIgnoreCase("yes");
        } 
        while (playagain);
        System.out.println("Thank you for playing this game. Your Final Score: "+score);
        scan.close();
    }
}