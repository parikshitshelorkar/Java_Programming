import java.util.Scanner;

public class greet{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name Please..!");
        String userName = sc.nextLine();
        System.out.println("Hello " + userName + " \nHow may I help you..? ");
    }
}

