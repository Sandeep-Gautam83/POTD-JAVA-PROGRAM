import java.util.Scanner;

public class SwitchStatements
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int phy, che,math,tot, per;
        String div;
        System.out.println("Enter Marks in physics");
        phy=sc.nextInt();
        System.out.println("Enter marks in chemistry");
        che= sc.nextInt();
        System.out.println("Enter marks in math");
        math=sc.nextInt();
        tot=phy+che+math;
        per=(tot*100)/300;
        if(per >=60)
            div="First";
        else if (per>=45 && per <60)
            div="Second";
        else if (per >=33 && per<45)
            div="Third";
        else
            div="Failed";
        System.out.println("Total = " +tot);
        System.out.println("Percentage = "+per);
        System.out.println("Division " +div);
    }
}
