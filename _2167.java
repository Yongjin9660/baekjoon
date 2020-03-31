import java.util.Scanner;

public class _2167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int k = sc.nextInt();

		for (int z = 0; z < k; z++) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;

			int sum = 0;

			for (int a = i; a <= x; a++) {
				for (int b = j; b <= y; b++) {
					if (a == i && b < j)
						continue;
					else
						sum += arr[a][b];
				}
			}

			System.out.println(sum);

		}

	}

}
