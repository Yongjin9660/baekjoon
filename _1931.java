import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _1931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] x, int[] y) {

				if (x[1] == y[1])
					return Integer.compare(x[0], y[0]);

				return Integer.compare(x[1], y[1]);
			}
		});

		int result = 0;
		int end = -1;

		for (int i = 0; i < n; i++) {

			if (end <= arr[i][0]) {
				result++;
				end = arr[i][1];
			}
		}
		System.out.println(result);

	}

}
