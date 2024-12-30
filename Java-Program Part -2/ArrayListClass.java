import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class ArrayListClass
{
    public static void main(String[] args) {
//        ArrayList<Integer> al = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        int i;
//        for( i=0; i<=5; i++){
//            al.add(sc.nextInt());
//        }
//        System.out.println("Enter the given vales : ");
//        for(i=0; i<=5; i++){
//            System.out.println(al.get(i)+ " ");
//        }

                // ArrayList with String values
                ArrayList<String> st = new ArrayList<>();
                st.add("Sandeep");
                st.add("ram");
                st.add("shyam");
                st.add("monu");

                // Using forEach and lambda expression to print each value
                st.forEach(s -> System.out.println(s));



//              Iterator in java
        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        arr.add("F");
        arr.add("G");

        Iterator<String> it =arr.iterator();
        System.out.println(it.next());
        it.next();
        it.remove();

        while (it.hasNext()){
            System.out.print(it.next()+ " ");
        }


        Vector<Integer> v = new Vector<>();
        v.add(120);
        v.add(128);
        v.add(126);
        v.add(1234);
        v.add(125);
        v.add(123);
        v.add(122);
        for(int n:v){
            System.out.println(n+ " ");
        }

    }
}


