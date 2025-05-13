package Bit_Manipulation;
import java.util.*;

public class SumOfAllXorSubset {
    // public static int xorTotal(int[] arr){
    //     int sum=0;
    //     List<Integer> list = new ArrayList<>();
    //     list.add(0);
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=0; j<arr.length; j++){
    //             list.add(arr[i]^arr[j]);
    //         }
    //     }
    //     for(int ele: list){
    //         sum+=ele;
    //     }
    //     return sum;
    // }
    static void xorSubsetTotal(int[] arr){
        // int n = arr.length&1;
        for(int i=0; i<arr.length; i++){
            ArrayList<Integer> list = new ArrayList<>();
            int num =i; 
            int j=0; 
            while(num!=0){
                int bin = num&1;
                if(bin==1){
                    list.add(arr[j]);
                }
                j++;
                num= num>>1;
            }
            System.out.println(list);
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,3,4};
        xorSubsetTotal(arr);
    }
}
