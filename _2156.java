import java.util.Scanner;

public class _2156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];

		for (int i = 1; i <= n; i++)
			arr[i] = sc.nextInt();

		dp[0] = 0;
		arr[0] = 0;
		
		dp[1] = arr[1];
		if(n>=2)
			dp[2] = arr[1] + arr[2];

		for (int i = 3; i <= n; i++) {
			dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
			dp[i] = Math.max(dp[i], arr[i] + arr[i - 1] + dp[i - 3]);
		}

		System.out.println(dp[n]);

	}

}
