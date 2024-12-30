/*
static keyword name
1.static block   2.static variable
3.static methods  4.static class

 */



/*
// main se phelhe kaam karvani ke liye static used hota hai

public class StaticKeyword
{
    static {
        System.out.println("This block execute before the main()");
    }
    public static void main(String[] args) {

    }
}


 */

//static variable

public class StaticKeyword {
    static int num; // Shared across all instances

    // Increment the shared variable
    public void set() {
        num++;
    }

    // Display the shared variable
    public void get() {
        System.out.println(num);
    }

    public static void main(String[] args) {
        StaticKeyword obj1 = new StaticKeyword();
        StaticKeyword obj2 = new StaticKeyword();
        StaticKeyword obj3 = new StaticKeyword();

        // Increment the shared variable
        obj1.set();
        obj2.set();
        obj3.set();

        // Display the shared variable
        obj1.get(); // Alternatively, you can call obj2.get() or obj3.get() (all show the same value)
    }
}

