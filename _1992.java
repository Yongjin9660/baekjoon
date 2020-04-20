import java.util.Scanner;

public class _1992 {

	static int[][] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			String temp = sc.next();
			for (int j = 0; j < n; j++)
				arr[i][j] = temp.charAt(j) - 48;
		}

		divide(n, 0, 0);

		System.out.println(sb);

	}

	static private void divide(int n, int r, int c) {

		int cri = arr[r][c];
		boolean check = true;

		for (int i = r; i < r + n; i++) {
			for (int j = c; j < c + n; j++) {
				if (cri != arr[i][j]) {
					check = false;
					break;
				}
			}
			if (!check)
				break;
		}

		if (check) {
			sb.append(cri);
		} else {
			sb.append("(");
			divide(n / 2, r, c);
			divide(n / 2, r, c + n / 2);
			divide(n / 2, r + n / 2, c);
			divide(n / 2, r + n / 2, c + n / 2);
			sb.append(")");
		}

	}

}
