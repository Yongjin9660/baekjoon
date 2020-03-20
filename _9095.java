import java.util.Scanner;

public class _9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();

			int[] dp = new int[temp + 1];
			
			if(temp >= 1)
				dp[1] = 1;
			if(temp>=2)
				dp[2] = 2;
			if(temp>=3)
				dp[3] = 4;

			for (int j = 4; j <= temp; j++)
				dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];

			System.out.println(dp[temp]);

		}
	}

}
