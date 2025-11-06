import java.util.Scanner;

public class Pattern {
    public static void pyramid() {
        System.out.println("Enter the number of lines ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        for (int i=1; i <=N; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        pyramid();
    }
}