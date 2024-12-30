/*
Inheitance - This is the concepts of reusability.
  SuperClass
   |
   |
  SubClass
Note : remember only public member of super class
inherited in sub class.

 */


public class Inheritance {

    // Method in the parent class
    public void basicPhone() {
        System.out.println("You can only make communication through a basic phone.");
    }

    // Subclass inheriting from Inheritance
    class Multimedia extends Inheritance {
        public void multimediaPhone() {
            System.out.println("Internet and Camera Facility Added.");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the parent class
        Inheritance obj1 = new Inheritance();
        obj1.basicPhone();

        // Creating an instance of the subclass
        Inheritance outer = new Inheritance(); // Outer class instance to create inner class object
        Multimedia obj2 = outer.new Multimedia();
        obj2.basicPhone(); // Calling the inherited method
        obj2.multimediaPhone(); // Calling the subclass-specific method
    }
}
