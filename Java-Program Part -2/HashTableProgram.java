import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableProgram
{
    public static void main(String[] args) {
        Map<Integer,String > mp=new Hashtable<>();
                mp.put(101,"Sandeep");
        mp.put(102,"pankaj");
        mp.put(103,"alok");
        mp.put(104,"manoj");
        mp.put(105,"anshu");

        mp.forEach((k,v) -> {
            System.out.println(k+ "\t"+v);
        });

    }
}
