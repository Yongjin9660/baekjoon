import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2606 {

	static int cnt = 0;
	static boolean[][] map;
	static boolean[] visit;
	static int n;
	static int m;

	private static void dfs(int d) {

		visit[d] = true;

		for (int i = 1; i <= n; i++) {
			if (map[d][i] == true && !visit[i]) {
				dfs(i);
				cnt++;
			}
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());

		map = new boolean[n + 1][n + 1];
		visit = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			map[a][b] = true;
			map[b][a] = true;
		}

		dfs(1);

		System.out.println(cnt);
	}

}
