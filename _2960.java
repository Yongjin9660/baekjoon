import java.util.Arrays;
import java.util.Scanner;

public class _2960 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		boolean[] arr = new boolean[n + 1];

		Arrays.fill(arr, true);

		int cnt = 0;
		boolean check = false;

		for (int i = 2; i <= n; i++) {
			for (int j = 1; i * j <= n; j++) {
				if (arr[i * j]) {
					arr[i * j] = false;
					cnt++;
					if (cnt == k) {
						System.out.println(i * j);
						check = true;
						break;
					}
				}
			}
			if (check)
				break;
		}

	}
}
