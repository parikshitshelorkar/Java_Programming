import java.util.Scanner;
public class kmToMile {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Distance in Km: ");
        double a = sc.nextDouble();
        double x = 0.621371;
        double b = a * x;
        System.out.println("The Entered distance is equals to "+ b +" Miles..!");
        
    }
    
}