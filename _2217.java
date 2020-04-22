import java.util.Arrays;
import java.util.Scanner;

public class _2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		Arrays.parallelSort(arr);

		int max = 0;

		for (int i = n - 1; i >= 0; i--) {
			arr[i] = arr[i] * (n - i);
			max = Math.max(arr[i], max);
		}

		System.out.println(max);

	}

}
