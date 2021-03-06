import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _15656 {

	static int n, m;
	static int arr[];
	static int input[];
	static StringBuilder sb = new StringBuilder();

	static private void dfs(int d) {

		if (d == m) {
			for (int a : arr)
				sb.append(a + " ");
			sb.append("\n");
			return;
		}

		for (int i = 0; i < n; i++) {
			int temp = input[i];
			arr[d] = temp;
			dfs(d + 1);
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		input = new int[n];
		arr = new int[m];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++)
			input[i] = Integer.parseInt(st.nextToken());

		Arrays.parallelSort(input);

		dfs(0);

		System.out.println(sb);
	}

}
