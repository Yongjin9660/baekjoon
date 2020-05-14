import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4963 {

	static int w, h;
	static int map[][];
	static boolean visit[][];

	private static int dfs(int x, int y) {

		int[] dx = { 0, 0, 1, -1, -1, 1, -1, 1 };
		int[] dy = { 1, -1, 0, 0, -1, 1, 1, -1 };

		visit[x][y] = true;

		for (int i = 0; i < 8; i++) {
			int xx = dx[i] + x;
			int yy = dy[i] + y;
			if (xx > 0 && yy > 0 && xx <= h && yy <= w) {
				if (map[xx][yy] == 1 && !visit[xx][yy])
					dfs(xx, yy);
			}
		}

		return 1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while (true) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());

			if (w == 0 && h == 0)
				break;

			map = new int[h + 1][w + 1];
			visit = new boolean[h + 1][w + 1];

			for (int i = 1; i <= h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= w; j++)
					map[i][j] = Integer.parseInt(st.nextToken());
			}

			int cnt = 0;

			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					if (map[i][j] == 1 && !visit[i][j])
						cnt += dfs(i, j);
				}
			}
			System.out.println(cnt);

		}

	}

}
