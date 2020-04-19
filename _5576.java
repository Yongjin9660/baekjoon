import java.util.Arrays;
import java.util.Scanner;

public class _5576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];

		for (int i = 0; i < 10; i++)
			arr1[i] = sc.nextInt();
		for (int i = 0; i < 10; i++)
			arr2[i] = sc.nextInt();

		int sum1 = 0;
		int sum2 = 0;

		Arrays.parallelSort(arr1);
		Arrays.parallelSort(arr2);

		sum1 = arr1[9] + arr1[8] + arr1[7];
		sum2 = arr2[9] + arr2[8] + arr2[7];

		System.out.println(sum1 + " " + sum2);
	}

}
