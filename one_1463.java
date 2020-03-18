
import java.io.IOException;
import java.util.Scanner;

public class one_1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] dp = new int[n + 1];
		
		dp[1] = 0;

		for (int i = 2; i <= n; i++) {

			if (i % 2 == 0 && i % 3 == 0) {
				dp[i] = Math.min(dp[i / 2], dp[i / 3]);
				dp[i] = Math.min(dp[i], dp[i - 1]);
			} else if (i % 2 != 0 && i % 3 == 0) {
				dp[i] = Math.min(dp[i / 3], dp[i - 1]);
			} else if (i % 2 == 0 && i % 3 != 0) {
				dp[i] = Math.min(dp[i / 2], dp[i - 1]);
			} else {
				dp[i] = dp[i - 1];
			}
			
			dp[i]++;
			
		}

		System.out.println(dp[n]);

	}

}
