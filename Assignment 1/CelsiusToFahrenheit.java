import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        // Apply the conversion formula: F = (C * 1.8) + 32
        // Using 1.8 or 9.0/5.0 avoids integer division errors
        double fahrenheit = (celsius * 1.8) + 32;
        
        // Display the result
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
        
        input.close();
    }
}
