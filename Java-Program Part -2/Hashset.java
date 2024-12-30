import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {
    public static void main(String[] args) {
        String s = "Sandeep";
//        Set<Character> myset = new LinkedHashSet<>();
Set<Character> myset = new TreeSet<>();
        // Adding characters of the string to the set
        for (int i = 0; i < s.length(); i++) {
            myset.add(s.charAt(i));
        }

        // Printing the results
        System.out.println("Given Name = " + s);
        System.out.println("The Unique Characters are:");
        Iterator<Character> it = myset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
