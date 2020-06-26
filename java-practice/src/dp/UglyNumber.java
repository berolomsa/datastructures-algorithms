package dp;

import java.util.Arrays;

public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
    public static int nthUglyNumber(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 3;
        for (int i=3; i<=n;i++) {
            int Multiplier2 = Math.min(dp[i-1]*2,Math.min(dp[i-2]*2, dp[i-3]*2));
            int Multiplier3 = Math.min(dp[i-1]*3,Math.min(dp[i-2]*3, dp[i-3]*3));
            int Multiplier5 = Math.min(dp[i-1]*5,Math.min(dp[i-2]*5, dp[i-3]*5));
            dp[i] = Math.min(Multiplier2, Math.min(Multiplier3, Multiplier5));
        }
        System.out.println(Arrays.toString(dp));
        return dp[n-1];
    }

}
