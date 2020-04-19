import java.util.Scanner;

public class _8320 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = 0;

		boolean[][] matrix = new boolean[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; i <= n; j++) {
				if (i * j <= n && !matrix[i][j]) {
					result++;
					matrix[j][i] = true;
					matrix[i][j] = true;
				} else if (i * j > n)
					break;
			}
		}
		System.out.println(result);

	}

}
