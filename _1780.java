import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1780 {

	static int[][] arr;
	static int minus = 0, zero = 0, one = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}

		divide(n, 0, 0);

		System.out.println(minus);
		System.out.println(zero);
		System.out.println(one);

	}

	private static void divide(int n, int r, int c) {
		int cri = arr[r][c];
		boolean check = true;

		for (int i = r; i < r + n; i++) {
			for (int j = c; j < c + n; j++) {
				if (cri != arr[i][j]) {
					check = false;
					break;
				}
			}
			if (!check)
				break;
		}

		if (check) {
			if (cri == -1)
				minus++;
			else if (cri == 0)
				zero++;
			else
				one++;
		} else {
			int t = n / 3;

			divide(t, r, c);
			divide(t, r, c + t);
			divide(t, r, c + 2 * t);

			divide(t, r + t, c);
			divide(t, r + t, c + t);
			divide(t, r + t, c + 2 * t);

			divide(t, r + 2 * t, c);
			divide(t, r + 2 * t, c + t);
			divide(t, r + 2 * t, c + 2 * t);
		}

	}

}
