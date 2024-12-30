public abstract class AbstractProgram {

    // Abstract method to find the maximum of three numbers
    abstract int max(int a, int b, int c);

    // Concrete method to find the maximum of two numbers
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        // Create an instance of the concrete subclass
        ConcreteProgram program = new ConcreteProgram();

        // Use the methods
        System.out.println("Max of 3, 5, 2: " + program.max(3, 5, 2));
        System.out.println("Max of 4, 7: " + program.max(4, 7));
    }
}

// Concrete subclass implementing the abstract method
class ConcreteProgram extends AbstractProgram {

    @Override
    int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
