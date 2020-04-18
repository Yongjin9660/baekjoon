import java.util.Scanner;

public class _9550 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();

		for (int i = 0; i < testcase; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			int[] arr = new int[n];

			int result = 0;

			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
				result += arr[j] / k;
			}
			System.out.println(result);
		}
	}

}
