
import java.util.Scanner;

//Create a menu-driven Java console application that simulates a transportation booking system. 
// The system should use runtime polymorphism to calculate fares for different ride types. 

public class SmartTransportationBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ride bikeRide = new BikeRide();
        Ride autoRide = new AutoRide();
        Ride carRide = new CarRide();
        Ride luxuryRide = new LuxuryRide();

        // while (true) {

            System.out.println("Welcome to Smart Transportation Booking System!");
            System.out.println("Select Ride Type:");
            System.out.println("1. Bike Ride");
            System.out.println("2. Auto Ride");
            System.out.println("3. Car Ride");
            System.out.println("4. Luxury Ride");
            int choice = sc.nextInt();
            
            System.out.print("Enter distance in kilometers: ");
            double distance = sc.nextDouble();

            switch (choice) {
                case 1:

                    System.out.println("Fare for Bike Ride: " + bikeRide.calculateFare(distance));
                    break;

                case 2:

                    System.out.println("Fare for Auto Ride: " + autoRide.calculateFare(distance));
                    break;

                case 3:

                    System.out.println("Fare for the Car Ride: " + carRide.calculateFare(distance));
                    break;
                case 4:

                    System.out.println("Fare for the Luxury Ride: " + luxuryRide.calculateFare(distance));
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid ride type.");
                    break;
            }

        // }    
        sc.close();

    }
}

// abstract class
abstract class Ride {
    double distance;

    // abstract method
    abstract double calculateFare(double distance);

}

class AutoRide extends Ride {
    @Override
    double calculateFare(double distance) {
        return distance * 25;
    }
}

class BikeRide extends Ride {
    @Override
    double calculateFare(double distance) {
        return distance * 10;
    }
}

class CarRide extends Ride {
    @Override
    double calculateFare(double distance) {
        return distance * 50;
    }
}

class LuxuryRide extends Ride {
    @Override
    double calculateFare(double distance) {
        return distance * 100;
    }
}
