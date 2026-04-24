import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
       
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        
        // Print the result formatted to 2 decimal places
        System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius\n", fahrenheit, celsius);
        
        input.close();
    }
}
