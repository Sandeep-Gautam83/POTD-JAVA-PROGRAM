interface Operation {
    public int calc(int a, int b);
}

class Calc {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
}
public class MethodReferences {
    public static void main(String[] args) {
        // Using method references to assign static methods to the interface
        Operation addOperation = Calc::add;
        Operation subOperation = Calc::sub;
        Operation mulOperation = Calc::mul;
        Operation divOperation = Calc::div;

        // Performing operations
        System.out.println("Addition: " + addOperation.calc(20, 10));
        System.out.println("Subtraction: " + subOperation.calc(20, 10));
        System.out.println("Multiplication: " + mulOperation.calc(20, 10));
        System.out.println("Division: " + divOperation.calc(20, 10));
    }
}


//non static ke liye (static   - program me) ko remove karna hai