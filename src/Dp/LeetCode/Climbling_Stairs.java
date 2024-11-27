package Dp.LeetCode;

public class Climbling_Stairs {
    public static int method(int n) {
        if(n <= 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
//        if(n <= 1) return 1;
//        int prev1 = 1;
//        int prev2 = 1;
//        int curr = 0;
//        for(int i = 2; i <= n; i++){
//            curr = prev1 + prev2;
//            prev2 = prev1;
//            prev1 = curr;
//        }
//        return prev1;
    }
}
