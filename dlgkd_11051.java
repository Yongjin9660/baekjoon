import java.util.Scanner;

public class dlgkd_11051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[][] arr = new int[n + 1][n + 1];
		arr[1][0] = 1;
		arr[1][1] = 1;

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					arr[i][j] = 1;
				else
					arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j]) % 10007;
			}
		}

		System.out.println(arr[n][k]);
	}
}
