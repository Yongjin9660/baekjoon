import java.util.Arrays;
import java.util.Scanner;

public class _2804 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		int n = a.length();
		int m = b.length();

		char[][] matrix = new char[m][n];

		for (int i = 0; i < m; i++)
			Arrays.fill(matrix[i], '.');

		int[] alphabet = new int[26];

		for (int i = 0; i < n; i++)
			alphabet[a.charAt(i) - 65]++;

		int indexOfb = 0;
		int alpha = 0;

		for (int i = 0; i < m; i++) {
			int temp = b.charAt(i) - 65;
			if (alphabet[temp] != 0) {
				indexOfb = i;
				alpha = temp;
				break;
			}
		}

		int indexOfa = 0;

		for (int i = 0; i < n; i++) {
			matrix[indexOfb][i] = a.charAt(i);
		}

		for (int i = 0; i < n; i++) {
			if (alpha == a.charAt(i) - 65) {
				indexOfa = i;
				break;
			}
		}

		for (int i = 0; i < m; i++)
			matrix[i][indexOfa] = b.charAt(i);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(matrix[i][j]);
			System.out.println();
		}

	}

}
