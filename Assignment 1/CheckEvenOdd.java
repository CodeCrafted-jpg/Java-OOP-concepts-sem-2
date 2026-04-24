import java.util.Scanner; // Import the Scanner class for user input

public class CheckEvenOdd {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt(); // Read the integer entered by the user

        // Use the modulus operator to check if the remainder is 0
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        // Close the scanner to release resources
        reader.close();
    }
}
