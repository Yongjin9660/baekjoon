import java.util.Scanner;

public class _2455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = -1;

		int[] arr = new int[8];

		for (int i = 0; i < 8; i++)
			arr[i] = sc.nextInt();

		int temp = arr[1];
		max = temp;

		for (int i = 2; i < 8; i++) {
			if (i % 2 == 0) {
				temp -= arr[i];
			} else {
				temp += arr[i];
				max = Math.max(max, temp);
			}
		}
		System.out.println(max);
	}

}
