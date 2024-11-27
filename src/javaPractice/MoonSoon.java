package javaPractice;

import java.util.Arrays;

public class MoonSoon {

	public static int solve(int requirements, int[] sizes) {
		int[] dp = new int [requirements +1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		dp[0] = 0;
		for(int size : sizes) {
			for(int i = size; i <= requirements; i++) {
				if(dp[i - size] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[i - size] + 1);
				}
			}
		}
		
		return dp[requirements] == Integer.MAX_VALUE ? -1 : dp[requirements];
	}

}
