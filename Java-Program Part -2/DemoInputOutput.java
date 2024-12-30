import java.util.Scanner;

public class DemoInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c; // Declare variables
        System.out.println("Enter First number: ");
        a = sc.nextInt(); // Input for the first number
        System.out.println("Enter Second number: ");
        b = sc.nextInt(); // Input for the second number
        c = a + b; // Calculate the sum
        System.out.println("Sum = " + c); // Print the sum
    }
}
