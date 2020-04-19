import java.util.Scanner;

public class _2851 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < 10; i++) {

			int temp = sum + arr[i];

			if (Math.abs(100 - temp) <= Math.abs(100 - sum)) {
				sum += arr[i];
			} else
				break;
		}
		System.out.println(sum);

	}

}
