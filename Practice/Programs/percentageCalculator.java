//Percentage calculator
import java.util.Scanner;
class percentageCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Subject 1 ");
        System.out.println("Enter the marks of Subject 2 ");
        System.out.println("Enter the marks of Subject 3 ");
        System.out.println("Enter the marks of Subject 4 ");
        int s1, s2, s3, s4;
        double percentage;
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        s4 = sc.nextInt();
        percentage = (s1+s2+s3+s4)/4;
        System.out.println("The Aggregate percentage is: "+ percentage);
    }
}