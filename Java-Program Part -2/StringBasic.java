//public class StringBasic
//{
//    public static void main(String[] args) {
//        char name[]={'a','b','c'};
//        String s =new String();
//        System.out.println(name);
//    }
//}

//
//public class StringBasic
//{
//    public static void main(String[] args) {
//        String s="Sandeep";
//        System.out.println(s);
//        System.out.println(s.length());
//        System.out.println(s.charAt(3));
//    }
//}


import java.util.Scanner;

import java.util.Scanner;

public class StringBasic {
//    public static void main(String[] args) {
//        String s;
//        int i, j;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String: ");
//        s = sc.next();
//
//        // Outer loop for the rows
//        for (i = 0; i < s.length(); i++) {
//            // Inner loop for printing characters
//            for (j = 0; j <= i; j++) {
//                System.out.print(s.charAt(j));
//            }
//            System.out.println();
//        }
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s;
//        System.out.println("Enter the String :");
//        s=sc.nextLine();
//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase());
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s="Sandeep ";
//        System.out.println(s.length());
//        System.out.println(s.trim().length());
//    }


//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        String s1, s2;
//        System.out.println("Enter the first string : ");
//        s1 =sc.nextLine();
//        System.out.println("Enter the second string : ");
//        s2=sc.nextLine();
//        if(s1.equals(s2)){
//            System.out.println("Bouth are equls");
//        }else {
//            System.out.println("Bouth are not equls");
//        }
//    }

//    public static void main(String[] args) {
//        String s[]={"Sandeep Gautam","Vinay","Ram Gautam","Shyam"};
//        for ( int i=0; i<=s.length; i++){
//            if(s[i].endsWith("Gautam")){
//                System.out.println(s[i]);
//            }
//        }
//    }

//    public static void main(String[] args) {
//        String name= "Sandeep kumar Gautam";
//        String n[]=name.split(" ");
//        for(int i=0; i<n.length; i++){
//            System.out.print(n[i].charAt(0)+ ".");
//        }
//    }


//    public static void main(String[] args) {
//    String name ="Sandeep Gautam";
//    char n[]=name.toCharArray();
//        for(char ch :n){
//            System.out.print(ch+ " ");
//        }
//    }
//


//    public static void main(String[] args) {
//        String name = "Sandeep";
//        System.out.println(name.concat("-Gautam"));
//    }


//    public static void main(String[] args) {
//        String name="Sandeep";
//        StringBuffer sb = new StringBuffer(name);
//        sb.append("-Gautam");
//        System.out.println(sb);
//        System.out.println(sb.length());
//        System.out.println(sb.capacity());
//        sb.insert(7,'N');
//        System.out.println(sb);
//    }


    public static void main(String[] args) {
        String name = "Sandeep";
        StringBuffer sb =new StringBuffer(name);
         sb.reverse();
         String rev =new String(sb);
        if(name.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
