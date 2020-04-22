import java.util.Arrays;
import java.util.Scanner;

public class _2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		Arrays.parallelSort(arr);

	}

}
