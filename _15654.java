import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _15654 {

	static int n, m;
	static int[] arr;
	static boolean[] visit;
	static int[] input;
	static StringBuilder sb = new StringBuilder();

	private static void dfs(int d) {
		if (d == m) {
			for (int a : arr)
				sb.append(a + " ");
			sb.append("\n");
			return;
		}

		for (int i = 0; i < n; i++) {
			int temp = input[i];
			
			if (!visit[i]) {
				visit[i] = true;
				arr[d] = temp;
				dfs(d + 1);
				visit[i] = false;
			}

		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[m];
		visit = new boolean[n + 1];
		input = new int[n];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++)
			input[i] = Integer.parseInt(st.nextToken());
		Arrays.parallelSort(input);

		dfs(0);

		System.out.println(sb);

	}

}
