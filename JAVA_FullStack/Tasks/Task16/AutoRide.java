package JAVA_FullStack.Tasks.Task16;

public class AutoRide extends Ride {
    @Override
    double calculateFare(double distance) {
        return distance * 25;
    }
}