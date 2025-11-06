import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Buffereader {
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your City: ");
        try {
            String city = br.readLine();
            System.out.println("You entered: " + city);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        }
    }
}