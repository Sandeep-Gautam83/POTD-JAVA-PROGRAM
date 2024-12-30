// import java.util.HashMap;
import java.util.HashMap;
public class MajorityElement {
    public static void majorityElement(int nums[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
        }
        for(int key : map.keySet()) {
            if(map.get(key) > n/3) {
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2};
        majorityElement(nums);
    }
}
