import java.util.Scanner;

public class Test002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String reply;
        while (true) {
            System.out.println("Reply yes/no: ");
            reply = sc.next();

            if (reply.equalsIgnoreCase("yes")) {
                System.out.println("Happy Sankranthi!");
                break; // Exit the loop after the reply is yes
            } else if (reply.equalsIgnoreCase("no")) {
                System.out.println("No response recorded.");
            } else {
                System.out.println("Invalid input. Please reply with 'yes' or 'no'.");
            }
        }

        sc.close(); // Close the Scanner outside the loop
    }
}
