import java.util.Stack;

public class StackReverseString {
    public static void main(String[] args) {
        String s = "Sandeep";
        Stack<Character> stk = new Stack<>();

        // Push each character onto the stack
        for (int i = 0; i < s.length(); i++) {
            stk.push(s.charAt(i));
        }

        // Pop and print each character
        while (!stk.empty()) {
            System.out.print(stk.pop()+ " "); // Print on the same line
        }
    }
}


//push =insert
//pop = delete
//peek= top element