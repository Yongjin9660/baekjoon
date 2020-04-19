import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2630 {

	static int[][] arr;
	static int w;
	static int b;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		arr = new int[n][n];
		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}

		divide(0, 0, n);

		System.out.println(w);
		System.out.println(b);

	}

	private static void divide(int r, int c, int n) {

		if (n == 1) {
			if (arr[r][c] == 1)
				b++;
			else
				w++;
			return;
		}

		int temp = arr[r][c];
		boolean check = true;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (temp != arr[r + i][c + j]) {
					check = false;
					break;
				}
			}
			if (!check)
				break;
		}

		if (check) {
			if (temp == 1)
				b++;
			else
				w++;
			return;
		}

		divide(r, c, n / 2);
		divide(r, c + n / 2, n / 2);
		divide(r + n / 2, c, n / 2);
		divide(r + n / 2, c + n / 2, n / 2);

	}

}
