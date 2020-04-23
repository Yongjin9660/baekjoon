import java.util.Arrays;
import java.util.Scanner;

public class _2667 {

	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { 1, -1, 0, 0 };
	static int[][] map;
	static int[] cnt;
	static int n;
	static boolean[][] visit;

	static int total = 0;

	private static void dfs(int r, int c) {

		visit[r][c] = true;
		cnt[total]++;

		for (int i = 0; i < 4; i++) {
			int nx = r + dx[i];
			int ny = c + dy[i];

			if (nx > 0 && ny > 0 && nx <= n && ny <= n) {
				if (map[nx][ny] == 1 && !visit[nx][ny])
					dfs(nx, ny);
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		map = new int[n + 1][n + 1];
		visit = new boolean[n + 1][n + 1];
		cnt = new int[n * n];

		for (int i = 1; i <= n; i++) {
			String temp = sc.next();
			for (int j = 1; j <= n; j++) {
				map[i][j] = temp.charAt(j - 1) - 48;
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (map[i][j] == 1 && !visit[i][j]) {
					total++;
					dfs(i, j);
				}
			}
		}
		System.out.println(total);
		Arrays.parallelSort(cnt);

		for (int i = 1; i < cnt.length; i++) {
			if (cnt[i] == 0) {

			} else {
				System.out.println(cnt[i]);
			}
		}

	}

}
