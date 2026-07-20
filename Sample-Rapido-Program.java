import java.util.Random;
import java.util.Scanner;

public class Rapido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.println("\n--- RAPIDO ---");
            System.out.println("1. Car Ride\n2. Bike Ride\n3. Auto Ride\n4. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                if (choice == 4) {
                    System.out.println("Thanks for using RAPIDO, goodbye!");
                    break;
                }

                String mode;
                int rate;

                
                switch (choice) {
                    case 1 -> { mode = "Car";  rate = 35; }
                    case 2 -> { mode = "Bike"; rate = 20; }
                    case 3 -> { mode = "Auto"; rate = 24; }
                    default -> {
                        System.out.println("Invalid choice. Please select 1-4.");
                        continue;
                    }
                }

                
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter phone number: ");
                String phone = sc.nextLine(); 


                System.out.print("Enter starting location: ");
                String start = sc.nextLine();

                System.out.print("Enter ending location: ");
                String end = sc.nextLine();

                System.out.print("Enter distance in km: ");
                double distance = Double.parseDouble(sc.nextLine());

                // Calculate fare and generate a 4-digit code
                double fare = distance * rate;
                int code = 1000 + rand.nextInt(9000);

                // Display booking details
                System.out.println("\nWaiting for driver confirmation...");
                System.out.println("Ride Mode: " + mode);
                System.out.println("Total Fare: Rs. " + fare);
                System.out.println("Your confirmation code is: " + code);
                System.out.println("Driver confirmed! Ride booked for " + name);

            } catch (NumberFormatException ex) {
                System.out.println("Error: Please enter valid numbers for choices and distance.");
            }
        }
        sc.close();
    }
}