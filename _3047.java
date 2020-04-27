import java.util.Arrays;
import java.util.Scanner;

public class _3047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[3];

		for (int i = 0; i < 3; i++)
			arr[i] = sc.nextInt();

		Arrays.parallelSort(arr);

		int A = arr[0];
		int B = arr[1];
		int C = arr[2];

		String s = sc.next();

		for (int i = 0; i < 3; i++) {

			char temp = s.charAt(i);
			if (temp == 'A') {
				System.out.print(A + " ");
			} else if (temp == 'B') {
				System.out.print(B + " ");
			} else {
				System.out.print(C + " ");
			}

		}

	}

}
