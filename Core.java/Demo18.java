import java.util.Scanner;

class MinutesToYears {
    void minToYrs() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter minutes
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        // Convert minutes to years
        int year = minutes / (365 * 24 * 60);
        System.out.println("Years: " + year);

        // Calculate remaining days
        int days = (minutes / (24 * 60)) % 365;
        System.out.println("Days: " + days);

        // Calculate remaining hours
        int hours = (minutes / 60) % 24;
        System.out.println("Hours: " + hours);

        // Calculate remaining minutes
        int remainingMinutes = minutes % 60;
        System.out.println("Minutes: " + remainingMinutes);

        scanner.close(); // Close the scanner
    }
}

public class Demo18 {
    public static void main(String[] args) {
        MinutesToYears obj = new MinutesToYears();
        obj.minToYrs();
    }
}
