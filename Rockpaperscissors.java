import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        // Array of choices
        String[] rps = {"ston", "Paper", "Scissors"};

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Get user's choice
        System.out.println("Enter your choice (ston, Paper, or Scissors): ");
        String userChoice= scanner.nextLine();

        // Generate a random choice for the computer
        Random random = new Random();
        int randomIndex = random.nextInt(3);
        String computerChoice = rps[randomIndex];

        // Print the computer's choice
        System.out.println("Computer chose: " + computerChoice);

        // Determine and print the result of the game
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a draw!");
        } else if (userChoice.equalsIgnoreCase("ston") && computerChoice.equals("Scissors") ||
                   userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("ston") ||
                   userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        scanner.close();
    }
} 
    
