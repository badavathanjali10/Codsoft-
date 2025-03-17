import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String[] args){
        Scanner scanner = new
        Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int roundsPlayed = 0;
        while(true){
            System.out.println("\nNew Round!");
            totalScore += playGame(scanner,random);
            roundsPlayed++;
            System.out.println("Do You Want To Play again?(Yes/No):");
            String playAgain = scanner.next().trim().toLowerCase();
            if(!playAgain.equals("yes"))
            {
                break;
            }
        }
        System.out.println("\nGame Over! You Played " + roundsPlayed+" rounds with a total score of " + totalScore + ".");
        scanner.close();
    }
    public static int playGame(Scanner scanner, Random random){
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1)+ lowerBound;
    int attempts =0;
     int maxAttempts = 10;
    System.out.println("Guess the number between"+lowerBound+"and"+upperBound+".");
while(attempts< maxAttempts){
    System.out.println("Enter your Guess:");
    if (!scanner.hasNextInt()){
        System.out.println("invalid  input! Please enter a valid number.");
        scanner.next();
        continue;
    }
    int guess =scanner.nextInt();
    attempts++;
    if(guess< lowerBound || guess> upperBound){
        System.out.println("Please enter a number between"+lowerBound+"and"+upperBound+".");
        continue;
    }
    if(guess< numberToGuess){
        System.out.println("Too Low! Try again.");
    }
    else if(guess> numberToGuess){
        System.out.println("Too High! Try again.");
    }else{
        System.out.println("Congratulations! You guessed the number in"+ attempts+ " attempts.");
        return maxAttempts - attempts +1;
    }
}
System.out.println("Sorry ,Your's used all" + maxAttempts + " attempts. The number was " + numberToGuess + ".");
return 0;
}
}
