import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }
}
