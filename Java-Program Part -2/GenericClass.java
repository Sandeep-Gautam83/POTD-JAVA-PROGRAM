
class demo<T>
{
    public void show(T V){
        System.out.println(V);
    }
}

public class GenericClass
{
    public static void main(String[] args) {
     demo<Integer> obj1 = new demo<>();
       obj1.show(102);

       demo<String > obj2 = new demo<>();
       obj2.show("Sandeep");
    }
}
