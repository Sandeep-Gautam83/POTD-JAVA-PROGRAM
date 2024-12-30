import java.io.FileInputStream;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             FileInputStream fin = new FileInputStream("test.txt")) {
            // Read all bytes from the file and convert to a String
            String s = new String(fin.readAllBytes());
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
