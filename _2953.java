import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[][] arr = new int[5][5];

		int[] sum = new int[5];
		Arrays.fill(sum, 0);
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 4; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				sum[i] += arr[i][j];
			}
		}

		int maxIndex = -1;
		int maxSum = -1;

		for (int i = 0; i < 5; i++) {
			if (maxSum < sum[i]) {
				maxIndex = i;
				maxSum = sum[i];
			}
		}
		System.out.println(maxIndex + 1 + " " + maxSum);

	}

}
