import java.util.Scanner;

public class Demo012 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Calculate the area
        double area = Math.PI * Math.pow(radius, 2);
        
        // Display the result
        System.out.println("The area of the circle is: " + area);
        
        // Close the scanner
        scanner.close();
    }
}
