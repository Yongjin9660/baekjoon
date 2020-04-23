import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1012 {

	static boolean[][] map;
	static int cnt;
	static boolean[][] visit;
	static int mr[] = { 0, 0, -1, 1 };
	static int mc[] = { 1, -1, 0, 0 };
	static int m;
	static int n;

	private static void dfs(int r, int c) {
		visit[r][c] = true;

		for (int i = 0; i < 4; i++) {
			int rtemp = r + mr[i];
			int ctemp = c + mc[i];

			if (ctemp >= 0 && rtemp >= 0 && ctemp < m && rtemp < n) {
				if (map[rtemp][ctemp] == true && !visit[rtemp][ctemp])
					dfs(rtemp, ctemp);
			}
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			cnt = 0;
			st = new StringTokenizer(br.readLine());

			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			map = new boolean[n][m];
			visit = new boolean[n][m];

			while (k-- > 0) {
				st = new StringTokenizer(br.readLine());

				int c = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());

				map[r][c] = true;
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (map[i][j] == true && !visit[i][j]) {
						cnt++;
						dfs(i, j);
					}
				}
			}

			System.out.println(cnt);

		}

	}
}
