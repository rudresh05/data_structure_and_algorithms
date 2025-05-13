package LeetCode_TrainingCollege;
import java.util.*;

public class TwoSum {
    public static int[] printIndex(int[] arr, int target){
        Map<Integer,Integer> list = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int req_num = target - arr[i];
            if(list.containsKey(req_num)){
                int[] num = {list.get(req_num) , i};
                return num;
            }
            list.put(arr[i], i);
            
        }
        return null;
        
    }
    @SuppressWarnings("unused")
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;
        
        
       
    }
}
