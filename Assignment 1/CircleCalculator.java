import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate perimeter (Circumference) and Area
        // Formula: Perimeter = 2 * PI * r
        double perimeter = 2 * Math.PI * radius;
        
        // Formula: Area = PI * r^2
        double area = Math.PI * Math.pow(radius, 2);

        // Output results
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
        
        input.close();
    }
}
