import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PerpertiesClass
{
    public static void main(String[] args) {
//        Properties p = new Properties();
//        p.put(101,"sandeep");
//        p.put(102,"A");
//        p.put(103,"B");
//        p.put(104,"C");
//        p.put(105,"D");
//        p.put(106,"E");
//        p.put(107,"sandeep");
//
//        p.forEach((k,v) -> {
//            System.out.println(k+ "\t" +v);
//        });


        Properties p = new Properties();

        // Using try-with-resources to automatically close the reader
        try (FileReader reader = new FileReader("db.properties")) {
            // Load properties from the file
            p.load(reader);

            // Retrieve and print the values from the properties
            String username = p.getProperty("username");
            String password = p.getProperty("password");

            // Print the values
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}