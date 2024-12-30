/*
two type : 1.this statement   2. this() method

 */

/*
// 1.this statement

public class keyword {
    int a, b;

    // Method to initialize the variables
    public void get(int a, int b) {
        // Using 'this' keyword to differentiate instance variables from parameters
        this.a = a;
        this.b = b;
    }

    // Method to print the values of the variables
    public void put() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        // Creating an object of the class
        keyword obj = new keyword();
        obj.get(10, 20); // Assigning values using the 'get' method
        obj.put(); // Printing the values using the 'put' method
    }
}

*/


/*
// this() method

public class keyword {

    // Constructor chaining
    public keyword () {
        this(10); // Calls the second constructor
        System.out.println("First Constructor");
    }

    public keyword(int n) {
        System.out.println("Second Constructor");
    }

    public static void main(String[] args) {
        // Creating an object of the class
     keyword obj = new keyword();
    }
}

*/


// super keyword
//1.super staement    2.super() method

public class keyword {
    int a, b;

    // Method to set values for a and b in the outer class
    public void get(int x, int y) {
        a = x;
        b = y;
    }

    // Inner class extending the outer class
    class InnerGet extends keyword {
        int a, b;

        // Method to copy values from the outer class to the inner class
        public void set() {
            this.a = keyword.this.a; // Access outer class's 'a'
            this.b = keyword.this.b; // Access outer class's 'b'
        }

        public void put() {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class
        keyword outerObj = new keyword();
        outerObj.get(10, 20);

        // Creating an instance of the inner class
        InnerGet innerObj = outerObj.new InnerGet();
        innerObj.set();
        innerObj.put();
    }
}

