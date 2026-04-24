import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

    
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate Area: length * width
        double area = length * width;

        // Calculate Perimeter: 2 * (length + width)
        double perimeter = 2 * (length + width);

        // Output the results
        System.out.println("------------------------------------");
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("------------------------------------");

        // Close the scanner
        scanner.close();
    }
}
