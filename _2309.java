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

		int temp;
		boolean check = false;

		for (int i = 8; i >= 0; i--) {

			temp = sum - arr[i];

			for (int j = 8; j >= 0; j--) {
				if (i == j)
					continue;

				temp -= arr[j];

				if (temp == 100) {
					arr[i] = 0;
					arr[j] = 0;
					check = true;
					break;
				} else
					temp += arr[j];

			}
			if (check)
				break;

		}

		for (int i = 0; i < 9; i++) {
			if (arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}

	}

}
