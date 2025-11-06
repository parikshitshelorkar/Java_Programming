package InputOutput;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try (
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("Output.txt")
        ) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
