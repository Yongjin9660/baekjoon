

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15651 {
	static int n, m;
	static int arr[];
	static StringBuilder sb = new StringBuilder();

	private static void dfs(int d) {
		if (d == m) {
			for (int i : arr)
				sb.append(i + " ");
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= n; i++) {
			arr[d] = i;
			dfs(d + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[m];

		dfs(0);
		System.out.println(sb);

	}
}
