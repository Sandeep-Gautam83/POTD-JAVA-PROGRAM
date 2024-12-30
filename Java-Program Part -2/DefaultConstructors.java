//import java.util.*;
//
//public class DefaultConstructors {
//
//    class cons {
//        String name;
//        int age;
//
//        // Default constructor
//        public cons() {
//            name = "Sandeep";
//            age = 23;
//        }
//
//        // Method to display details
//        public void show() {
//            System.out.println("Name: " + name);
//            System.out.println("Age: " + age);
//        }
//    }
//
//    public static void main(String[] args) {
//        // Create an instance of the outer class
//        DefaultConstructors obj = new DefaultConstructors();
//
//        // Create an instance of the inner class
//        cons innerObj = obj.new cons();
//
//        // Call the show() method
//        innerObj.show();
//    }
//}



/*

//Program qus 2
public class DefaultConstructors {
    String name;
    int age;

    // Parameterized constructor
    public DefaultConstructors(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display details
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Demo {
    public static void main(String[] args) {
        // Creating objects using the parameterized constructor
        DefaultConstructors obj1 = new DefaultConstructors("Sandeep", 23);
        DefaultConstructors obj2 = new DefaultConstructors("Rahul", 25);
        DefaultConstructors obj3 = new DefaultConstructors("Anjali", 22);

        // Calling the show method for each object
        obj1.show();
        obj2.show();
        obj3.show();
    }
}


 */


public class DefaultConstructors {
    int i;

    // Default constructor
    public DefaultConstructors() {
        for (i = 1; i <= 70; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Parameterized constructor with a character and size
    public DefaultConstructors(char ch, int size) {
        for (i = 1; i <= size; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    // Parameterized constructor with only a character
    public DefaultConstructors(char ch) {
        for (i = 1; i <= 70; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating objects and demonstrating line styles
        System.out.println("First Line style:");
        DefaultConstructors obj1 = new DefaultConstructors();

        System.out.println("Second Line style:");
        DefaultConstructors obj2 = new DefaultConstructors('&');

        System.out.println("Third Line style:");
        DefaultConstructors obj3 = new DefaultConstructors('^', 35);
    }
}




