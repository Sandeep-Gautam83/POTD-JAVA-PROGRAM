import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        int num, i;
        boolean isprime = false;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (i = 2; i < num-1; i++) {
            if (num % i !=0) {
                System.out.println("true");
                isprime=true;
            } else {
                System.out.println("false");
//                isprime=false;
                break;
            }
        }
    }
}
