import java.util.Scanner;

public class functionProgram
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
      functionProgram obj= new functionProgram();
        obj.line();
        System.out.println("\n\t\t\t MNNIT ALLAHABAD");
        obj.line();
    }
    public  void line(){
        int i;
        for(i=0; i<=70; i++){
            System.out.print("*");
        }
   }


}
