import java.util.Scanner;
public class qus4 {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++ ){
for(int j=1;j<=i;j++){
    System.out.print("* ");
}
System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
System.out.print("* ");
            }
            System.out.println();
        }
    }

}
