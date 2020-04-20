import java.util.Scanner;

public class _1733 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		boolean[] check = new boolean[c + 1];

		for (int i = 0; i < n; i++) {
			int temp = arr[i];

			for (int j = temp; j <= c; j += temp) {
				if (!check[j])
					check[j] = true;
			}
		}
		int result = 0;
		for (int i = 1; i <= c; i++) {
			if (check[i])
				result++;
		}
		System.out.println(result);
	}

}
