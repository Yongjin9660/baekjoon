import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9465 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());

			int[][] arr = new int[3][n + 1];
			int[][] dp = new int[3][n + 1];

			for (int i = 1; i <= 2; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= n; j++)
					arr[i][j] = Integer.parseInt(st.nextToken());
			}

			dp[0][1] = 0;
			dp[1][1] = arr[1][1];
			dp[2][1] = arr[2][1];

			for (int i = 2; i <= n; i++) {
				dp[0][i] = Math.max(dp[0][i - 1], Math.max(dp[1][i - 1], dp[2][i - 1]));
				dp[1][i] = Math.max(dp[0][i - 1], dp[2][i - 1]) + arr[1][i];
				dp[2][i] = Math.max(dp[0][i - 1], dp[1][i - 1]) + arr[2][i];
			}

			System.out.println(Math.max(dp[0][n], Math.max(dp[1][n], dp[2][n])));

		}

	}

}
