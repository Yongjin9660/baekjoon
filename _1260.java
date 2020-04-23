import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1260 {

	static int map[][];
	static boolean[] visit;
	static int n, m, v;
	static StringBuilder sb1 = new StringBuilder();
	static StringBuilder sb2 = new StringBuilder();

	private static void dfs(int i) {
		visit[i] = true;
		sb1.append(i + " ");

		for (int j = 1; j < n + 1; j++) {
			if (map[i][j] == 1 && visit[j] == false)
				dfs(j);
		}
	}

	private static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(i);
		visit[i] = true;

		while (!q.isEmpty()) {
			int temp = q.poll();
			sb2.append(temp + " ");
			for (int j = 1; j <= n; j++) {
				if (map[temp][j] == 1 && visit[j] == false) {
					q.add(j);
					visit[j] = true;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());

		map = new int[n + 1][n + 1];
		visit = new boolean[n + 1];

		for (int i = 0; i < n + 1; i++)
			Arrays.fill(map[i], 0);

		Arrays.fill(visit, false);

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a][b] = 1;
			map[b][a] = 1;
		}

		dfs(v);

		System.out.println(sb1);
		Arrays.fill(visit, false);
		bfs(v);
		System.out.println(sb2);
	}

}
