//import java.util.ArrayList;
//import java.util.Collections;
//
//public class CollectionOperation {
//    public static void main(String[] args) {
//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(102);
//        al.add(1);
//        al.add(12);
//        al.add(122);
//        al.add(10);
//        al.add(22);
//        al.add(9);
//
//        System.out.println("Original values:");
//        for (int n : al) {
//            System.out.println(n);
//        }
//
//        System.out.println("Maximum value is: " + Collections.max(al));
//        System.out.println("Minimum value is: " + Collections.min(al));
//
//        // Sort the list in ascending order
//        Collections.sort(al);
//        System.out.println("Sorted values (Ascending Order):");
//        for (int n : al) {
//            System.out.print(n + " ");
//        }
//        System.out.println();
//
//        // Sort the list in descending order
//        Collections.sort(al, Collections.reverseOrder());
//        System.out.println("Sorted values (Descending Order):");
//        for (int n : al) {
//            System.out.println(n + " ");
//        }
//        Collections.reverse(al);
//        System.out.println("List Reverse : ");
//        for(int n : al){
//            System.out.println(n+" ");
//        }
//        System.out.println();
//
//        System.out.println("Search list number : "+Collections.binarySearch(al,122));
//    }
//}




import java.util.ArrayList;
import java.util.Collections;

public class CollectionOperation {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(102);
        al.add(1);
        al.add(12);
        al.add(122);
        al.add(10);
        al.add(22);
        al.add(9);

        System.out.println("Original values:");
        for (int n : al) {
            System.out.println(n);
        }

        System.out.println("Maximum value is: " + Collections.max(al));
        System.out.println("Minimum value is: " + Collections.min(al));

        // Sort the list in ascending order
        Collections.sort(al);
        System.out.println("Sorted values (Ascending Order):");
        for (int n : al) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Sort the list in descending order
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Sorted values (Descending Order):");
        for (int n : al) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Reverse the list
        Collections.reverse(al);
        System.out.println("List Reverse: ");
        for (int n : al) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Binary search after sorting in ascending order
        Collections.sort(al); // Ensure sorted order
        int searchKey = 122;
        int searchResult = Collections.binarySearch(al, searchKey);
        if (searchResult >= 0) {
            System.out.println("Element " + searchKey + " found at index: " + searchResult);
        } else {
            System.out.println("Element " + searchKey + " not found in the list.");
        }
    }
}
