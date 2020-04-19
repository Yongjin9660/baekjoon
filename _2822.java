import java.util.Arrays;
import java.util.Scanner;

public class _2822 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for (int i = 1; i <= 8; i++) {
			arr[i] = sc.nextInt();
		}
		int[] copy = new int[9];

		for (int i = 1; i <= 8; i++)
			copy[i] = arr[i];

		Arrays.parallelSort(arr);

		int sum = arr[8] + arr[7] + arr[6] + arr[5] + arr[4];

		System.out.println(sum);

		for (int i = 1; i <= 8; i++) {
			if (copy[i] == arr[8] || copy[i] == arr[6] || copy[i] == arr[5] || copy[i] == arr[4] || copy[i] == arr[7])
				System.out.print(i + " ");
		}

	}

}
