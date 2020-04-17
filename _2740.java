import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2740 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] A = new int[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++)
				A[i][j] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());

		int M = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[][] B = new int[M][k];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < k; j++)
				B[i][j] = Integer.parseInt(st.nextToken());
		}

		int[][] result = new int[n][k];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				for (int q = 0; q < m; q++) {
					result[i][j] += A[i][q] * B[q][j];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

}
