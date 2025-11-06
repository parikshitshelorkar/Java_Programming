import java.util.Scanner;
class Fibonacci{
    int a = 0;
    int b = 1;
    public void fibo(){
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter the length of the Fibo Series: ");
        int len = scan.nextInt();
        System.out.print(a +" "+ b + " ");
        for(int i = 0; i<= len; i++){

            int c = a + b;
            System.out.print(c +  " ");
            a = b;
            b = c;
        }
    }
}
public class PrintFibo{
    public static void main(String args[]){
        Fibonacci fb = new Fibonacci();
        fb.fibo();
    }
}