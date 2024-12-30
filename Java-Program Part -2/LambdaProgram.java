//interface task{
//    public int add( int a, int b);
//
//}
//
//public class LambdaProgram
//{
//    public static void main(String[] args) {
//        task obj=(int a, int b) -> a+b;
//        System.out.println("Sum = "+obj.add(10,20));
//    }
//}


import java.util.ArrayList;

public class LambdaProgram {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.forEach((n) ->System.out.println(n));
    }
}
