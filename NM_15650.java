

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NM_15650 {
	static int n, m;
	static int arr[];
	static boolean visit[];
	static StringBuilder sb = new StringBuilder();

	private static void dfs(int current,int d) {
		if (d == m) {
			for (int i : arr)
				sb.append(i + " ");
			sb.append("\n");
			return;
		}

		for (int i = current ; i <= n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[d] = i;
				dfs(i, d + 1);
				visit[i] = false;
			}
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[m];
		visit = new boolean[n + 1];

		dfs(1,0);
		System.out.println(sb);

	}
}
