import java.util.Scanner;

public class DayPrint
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day;
        System.out.println("Enter Day number " );
        day=sc.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3 :
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Tue");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("San");
            default:
                System.out.println("Invaild day number ");
        }
    }
}
