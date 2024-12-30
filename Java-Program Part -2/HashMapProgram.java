import java.util.HashMap;
import java.util.Map;

public  class HashMapProgram
{
    public static void main(String[] args) {
//        HashMap<Integer,String > mp = new HashMap<>();
//        mp.put(101,"manoj");
//        mp.put(102,"ram");
//        mp.put(103,"kamal");
//        mp.put(104,"sandeep");
//        System.out.println(mp);
//
//        for(Map.Entry item:mp.entrySet()) {
//            System.out.println(item.getKey()+ "\t" +item.getValue());
//        }

        String name = "Sandeepp Gautam";
        int i;
        char ch;
        HashMap<Character, Integer> mp = new HashMap<>();

        // Loop through the string to calculate frequency
        for (i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                mp.put(ch, mp.get(ch) + 1);
            }
        }

        // Print the frequency table
        System.out.println("Character\tFrequency");
        for (Map.Entry<Character, Integer> item : mp.entrySet()) {
            System.out.println(item.getKey() + "\t\t" + item.getValue());
        }
    }
}