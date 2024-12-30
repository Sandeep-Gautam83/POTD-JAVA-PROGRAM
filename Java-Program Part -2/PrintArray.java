import java.util.Scanner;

public class PrintArray
{
    public static void main(String[] args) {
//        int arr[] = new int[5];
//        int i;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        for ( i=0; i<arr.length; i++){
//        arr[i]=sc.nextInt();
//        }
//        System.out.println("The Given Elements are : ");
//        for(i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }

        Scanner sc = new Scanner(System.in);
        int num, noe = 0, r;
        int[] bin = new int[1000];

        System.out.println("Enter the number: ");
        num = sc.nextInt();

        // Convert decimal to binary
        while (num > 0) {
            r = num % 2;
            bin[noe++] = r; // Store the remainder in the array
            num = num / 2;
        }

        System.out.println("Binary representation: ");
        // Print binary in reverse order
        for (int i = noe - 1; i >= 0; i--) {
            System.out.print(bin[i]);
        }
    }
}