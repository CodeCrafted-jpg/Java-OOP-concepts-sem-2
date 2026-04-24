import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Conversion factor: 1 mile = 1.609344 kilometers
        final double MILES_TO_KM = 1.609344;

        System.out.print("Enter distance in miles: ");
        double miles = input.nextDouble();

        // Calculate kilometers
        double kilometers = miles * MILES_TO_KM;

        // Display results
        System.out.printf("%.2f miles is equal to %.2f kilometers.\n", miles, kilometers);
        
        input.close();
    }
}
