import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];

		for (int i = 1; i <= n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		arr[0] = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i] = Math.max(dp[i], arr[j] + dp[i - j]);
			}
		}

		System.out.println(dp[n]);

	}

}
