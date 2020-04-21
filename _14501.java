import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14501 {
	static int n, max = -1;
	static int[][] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());

		arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		schedule(0, 0);

		System.out.println(max);

	}

	private static void schedule(int day, int money) {
		if (day >= n) {
			max = Math.max(max, money);
			return;
		}

		if (day + arr[day][0] <= n)
			schedule(day + arr[day][0], money + arr[day][1]);

		schedule(day + 1, money);

	}

}
