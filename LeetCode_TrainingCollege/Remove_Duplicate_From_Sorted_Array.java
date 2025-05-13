package LeetCode_TrainingCollege;

import java.util.*;
public class Remove_Duplicate_From_Sorted_Array {
    public static int removeDuplicates(int[] arr){
        if(arr.length==0) return 0;
        int count =0;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]== arr[i] ){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int num = sc.nextInt();
        System.out.println("Enter the element of array : ");
        int arr[]  = new int[num];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("The removed duplicate number is "+ removeDuplicates(arr));
        sc.close();
    }
}
