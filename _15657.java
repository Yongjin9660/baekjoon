import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _15657 {

	static int n, m;
	static int arr[];
	static int input[];
	static StringBuilder sb = new StringBuilder();

	static private void dfs(int current, int d) {

		if (d == m) {
			for (int i : arr)
				sb.append(i + " ");
			sb.append("\n");
			return;
		}

		for (int i = current; i <= n; i++) {
			int temp = input[i - 1];
			arr[d] = temp;
			dfs(i, d + 1);
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[m];

		input = new int[n];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++)
			input[i] = Integer.parseInt(st.nextToken());

		Arrays.parallelSort(input);

		dfs(1, 0);
		System.out.println(sb);

	}

}
