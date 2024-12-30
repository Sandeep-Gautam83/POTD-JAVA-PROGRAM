import java.util.Scanner;

public class functionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        functionOne obj = new functionOne();
        obj.line('*');
        System.out.println("\t\t\t MNNIT ALLAHABAD");
        obj.line('^');
        obj.line('&');

    }

    public void line(char ch) {
        for (int i = 0; i < 50; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
