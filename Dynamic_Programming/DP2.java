package Dynamic_Programming;

public class DP2 {
    public static int fiboSum(int n, int[] arr){
        if(n==0) return 0; 
        if(n==1) return 1;
        int lastTerm = arr[n-1]==0?fiboSum(n-1, arr):arr[n-1];
        int secondLastTerm = arr[n-2]==0? fiboSum(n-2, arr):arr[n-2];
        int currentTerm = lastTerm+secondLastTerm;
        arr[n] = currentTerm;
        return currentTerm;
       
    }
    public static void main(String[] args){
        int n= 7;
        int[] arr = new int[n+1];
       arr[1]= 0;
       arr[2]=1;
       System.out.println(fiboSum(n, arr));

        
    }
}
