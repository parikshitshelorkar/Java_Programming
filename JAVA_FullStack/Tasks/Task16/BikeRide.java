package JAVA_FullStack.Tasks.Task16;

public class BikeRide extends Ride {
    @Override
    double calculateFare(double distance) {
        return distance * 10;
    }
}