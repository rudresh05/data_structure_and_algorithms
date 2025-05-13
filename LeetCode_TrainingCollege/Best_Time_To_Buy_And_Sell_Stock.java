package LeetCode_TrainingCollege;


public class Best_Time_To_Buy_And_Sell_Stock {
    public static void main(String[] args){
       int[] arr = {7,1,5,3,6,4};
       int num = findMaxProfit(arr);
       System.out.println("Max Profit is : "+ num); //Max Profit is : 7

    }

    private static int findMaxProfit(int[] arr) {
        int max_profit = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                max_profit +=arr[i+1]-arr[i];
            }
        }
        return max_profit;
        
    }
}
