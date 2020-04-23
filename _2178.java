import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2178 {

	static int[][] map;
	static int[] row = { 0, 0, 1, -1 };
	static int[] col = { 1, -1, 0, 0 };
	static boolean[][] visit;
	static int n, m;

	private static void bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { i, j });

		while (!q.isEmpty()) {
			int location[] = q.poll();
			visit[i][j] = true;

			for (int dir = 0; dir < 4; dir++) {

				int r = location[0] + row[dir];
				int c = location[1] + col[dir];

				if (r >= 0 && c >= 0 && r < n && c < m) {
					if (map[r][c] != 0 && !visit[r][c]) {
						q.add(new int[] { r, c });
						visit[r][c] = true;
						map[r][c] = map[location[0]][location[1]] + 1;
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		map = new int[n][m];
		visit = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String temp = sc.next();
			for (int j = 0; j < m; j++) {
				map[i][j] = temp.charAt(j) - '0';
			}
		}

		bfs(0, 0);

		System.out.println(map[n - 1][m - 1]);

	}

}
