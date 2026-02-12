package JAVA_FullStack.Tasks.Task16;

public class CarRide extends Ride {
    @Override
    double calculateFare(double distance) {
        return distance * 50;
    }
}