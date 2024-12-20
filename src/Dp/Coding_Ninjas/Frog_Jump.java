package Dp.Coding_Ninjas;

import java.util.Arrays;

public class Frog_Jump {
    public static int method(int n, int[] heights){
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        //Memoization
//        return helper(n - 1, heights, dp);
        //Tabulation
        dp[0] = 0;
        for(int i = 1;i < n; i++){
            int left = dp[i-1] + Math.abs(heights[i] - heights[i-1]);
            int right = Integer.MAX_VALUE;
            if(i > 1){
                right = dp[i-2] + Math.abs(heights[i] - heights[i-2]);
            }
            dp[i] = Math.min(left, right);
        }
        return dp[n-1];
    }
    public static int helper(int n, int[] heights, int[] dp){
        if(n == 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int left = helper(n-1, heights, dp) + Math.abs(heights[n-1] - heights[n]);
        int right = Integer.MAX_VALUE;
        if(n > 1){
            right = helper(n-2, heights, dp) + Math.abs(heights[n-2] - heights[n]);
        }
        return dp[n] = Math.min(left, right);
    }
}
