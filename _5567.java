import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5567 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int f1, f2, result = 0;

		int[][] matrix = new int[n + 1][n + 1];
		boolean[] invite = new boolean[n + 1];

		StringTokenizer st;

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			f1 = Integer.parseInt(st.nextToken());
			f2 = Integer.parseInt(st.nextToken());
			matrix[f1][f2] = 1;
			matrix[f2][f1] = 1;
		}

		for (int i = 2; i < n + 1; i++) {
			if (matrix[1][i] == 1) {
				
				if (!invite[i]) {
					result++;
					invite[i] = true;
				}
				for (int j = 2; j < n + 1; j++) {
					if (matrix[i][j] == 1 && !invite[j]) {
						result++;
						invite[j] = true;
					}
				}
			}
		}
		System.out.println(result);

	}

}
