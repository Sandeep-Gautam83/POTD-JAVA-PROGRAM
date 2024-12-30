import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEach
{
    public static void main(String[] args) {
      List<Integer> list = Arrays.asList(10,2,3,4,54,3,43,45,3,4,3,23);
      list.forEach((Integer n)->System.out.println(n));
    }
}
