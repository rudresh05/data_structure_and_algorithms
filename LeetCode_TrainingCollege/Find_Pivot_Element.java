package LeetCode_TrainingCollege;

public class Find_Pivot_Element {
    public static int findPivotElement(int[] arr){
        int n = arr.length; 
        int sum =0; 
        for(int ele : arr){
            sum+=ele;
        }
        int cs=0;
        for(int i=0; i<n; i++){
            int ls =cs; 
            int rs = sum- ls - arr[i];
            if(ls==rs){
                return i;
            }
            cs+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3}; 
        System.out.println("The pivot element is : "+ findPivotElement(arr));

    }
}
