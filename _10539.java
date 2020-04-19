import java.util.Arrays;
import java.util.Scanner;

public class _10539 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] result = new int[n];

		result[0] = arr[0];
		System.out.print(result[0]);
		for (int i = 1; i < n; i++) {
			result[i] = arr[i] * (i + 1) - arr[i - 1] * i;
			System.out.print(" " + result[i]);
		}
	}

}
