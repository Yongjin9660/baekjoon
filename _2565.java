import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _2565 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		StringTokenizer st;

		int[][] arr = new int[t][2];

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());

			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				return Integer.compare(a[0], b[0]);
			}
		});

		int[] dp = new int[t];
		Arrays.fill(dp, 1);

		for (int i = 1; i < t; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i][1] > arr[j][1])
					dp[i] = Math.max(dp[i], dp[j] + 1);
			}
		}
		int max = -1;

		for (int i = 1; i < t; i++) {
			if (max < dp[i])
				max = dp[i];
		}
		System.out.println(t - max);
	}

}
