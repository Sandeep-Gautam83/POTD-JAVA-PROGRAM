//import java.util.ArrayList;
//import java.util.List;
//
//public class DiamondOperator {
//    public static void main(String[] args) {
//        // First list
//        List<String> lst = new ArrayList<String>();
//        lst.add("Sandeep");
//        lst.add("Om");
//        lst.add("Shyam");
//        lst.add("Abhi");
//        lst.add("Ram");
//
//        for (String n : lst) {
//            System.out.println(n);
//        }
//        System.out.println("___________________");
//
//        // Second list
//        List<String> lst2 = new ArrayList<>();
//        lst2.add("A");
//        lst2.add("B");
//        lst2.add("C");
//        lst2.add("D");
//        lst2.add("E");
//        lst2.add("F");
//
//        // Using lambda expression
//        lst2.forEach((n) -> System.out.println(n));
//    }
//}
//

abstract class work<T> {
    abstract T calc(T a,T b);
}

public  class DiamondOperator
{
    public static void main(String[] args) {
        work<Integer> obj = new work<Integer>() {
        public Integer calc(Integer a, Integer b){
            return a+b;
        }
        };
        System.out.println("Result=" +obj.calc(10,23));
    }
}