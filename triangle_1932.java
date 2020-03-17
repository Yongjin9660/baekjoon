

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class triangle_1932 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		int[][] arr = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int temp;
		if (n == 1)
			System.out.println(arr[1][1]);
		else {
			for (int i = 2; i <= n; i++) {

				for (int j = 1; j <= i; j++) {

					if (j - 1 > 0 && j <= i - 1) { // 후보 두개
						temp = Math.max(arr[i - 1][j], arr[i - 1][j - 1]);
						arr[i][j] += temp;
					} else if (j == 1) {
						arr[i][j] += arr[i - 1][j];
					} else {
						arr[i][j] += arr[i - 1][j - 1];
					}
				}

			}

		}

		int max = -1;

		for (int i = 1; i <= n; i++) {
			max = Math.max(max, arr[n][i]);
		}
		System.out.println(max);

	}

}
