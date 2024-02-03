import java.util.Scanner;
import java.util.Random;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Numbers Game!");
        while (true) {
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (between 1 and 100): ");
                int userGuess = sc.nextInt();
                if (userGuess <= 0) {
                    System.out.println("Kindly enter a positive number!");
                    continue;
                }

                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + secretNumber +
                            " in " + (attempts + 1) + " attempts.Keep it up!");
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum attempts. The correct number was " +
                        secretNumber + ".");
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }
        System.out.println("Thanks for playing!");
        sc.close();
    }
}