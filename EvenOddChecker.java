import java.util.Scanner;

public class EvenOddChecker {

    // Method to get integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Prompt the user for input
        System.out.print("Enter an integer: ");
        
        // Validate the user input
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a valid integer. Please try again.");
            System.out.print("Enter an integer: ");
            scanner.next(); // Consume the invalid input
        }
        
        // Return the valid integer
        number = scanner.nextInt();
        return number;
    }

    // Method to check if the number is even or odd
    public static String checkEvenOrOdd(int number) {
        // Use modulo operator to check if the number is divisible by 2
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    // Main method to tie everything together
    public static void main(String[] args) {
        // Get the integer input from the user
        int number = getIntegerInput();
        
        // Check if the number is even or odd and store the result message
        String resultMessage = checkEvenOrOdd(number);
        
        // Display the result
        System.out.println(resultMessage);
    }
}
