import java.util.Scanner;

public class largestnumber
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


//        largestnumber obj = new largestnumber();
//        int res=obj.largestNumber(10,54,3);
//        System.out.println("Largest Number is :" +res);

        System.out.println("Enter the first  number : ");
        int a=sc.nextInt();
        System.out.println("Enter the second number :");
        int b=sc.nextInt();
        System.out.println("Enter te third number ");
        int c=sc.nextInt();

        largestnumber obj = new largestnumber();
        int res=obj.largestNumber(a,b,c);
        System.out.println("Largest number is :"+res);

    }

    public int  largestNumber(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else {
            return c;
        }
    }
}
