public class OverloadingMethodTwo {
    public static void main(String[] args) {
        OverloadingMethodTwo obj = new OverloadingMethodTwo();
        System.out.println("Reverse Number is : " + obj.reverse(123));
        System.out.println("Reverse String is : " + obj.reverse("Sandeep"));
    }

    // Method to reverse an integer
    public int reverse(int n) {
        int rev = 0, r;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        return rev;
    }

    // Method to reverse a string
    public String reverse(String name) {
        StringBuffer sb = new StringBuffer(name);
        sb.reverse();
        return sb.toString();
    }
}
