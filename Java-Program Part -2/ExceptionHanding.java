/*

import java.util.Scanner;

public class ExceptionHanding
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a, b, c;
        System.out.println("First number ");
        a=sc.nextInt();
        System.out.println("Second number ");
        b =sc.nextInt();
        try{
            c=a/b;
            System.out.println("Result = "+c);
        }catch (Exception e ){
            System.out.println("Problem in Divide");
        }
        finally {
            System.out.println("Out of finally block");
        }
        System.out.println("Some other work");
    }
}

*/



public class ExceptionHanding
{
    public static void main(String[] args) {
        int i;
        for( i=1; i<=3; i++){
            try{
                switch(i){
                    case 1 :
                        int arr[]=new int[5];
                        System.out.println(arr[10]);
                        break;
                    case 2 :
                        String s="Sandeep";
                        System.out.println(s.charAt(15));
                        break;
                    case 3 :
                        int a=10,b=0;
                        System.out.println(a/b);
                        break;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array Related Problem");
            }catch (StringIndexOutOfBoundsException se){
                System.out.println("String Related Problem");
            }catch (ArithmeticException ae){
                System.out.println("Number is Divide by Zero");
            }
        }
    }
}
