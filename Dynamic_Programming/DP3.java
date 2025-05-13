package Dynamic_Programming;
//Dice-Roll -> Find Ways
public class DP3 {
    public static int findWays(int d, int f, int target){
    int[][] dp = new int[d + 1][target + 1];
    dp[0][0] = 1;

    for (int i = 1; i <= d; i++) {
        for (int j = 1; j <= target; j++) {
            for (int k = 1; k <= f; k++) {
                if (j - k >= 0) {
                    dp[i][j] += dp[i - 1][j - k];
                }
            }
        }
    }
    return dp[d][target];
    }
    public static void main(String[] args){
        int d =7; 
        int f =7; 
        int target = 7;
        System.out.println(findWays(d, f, target));

    }
    
}
