
import java.io.IOException;
import java.util.Scanner;

public class _1904 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] result = new int[n + 1];

		result[1] = 1;
		if (n != 1)
			result[2] = 2;

		for (int i = 3; i <= n; i++) {
			result[i] = (result[i - 1] + result[i - 2]) % 15746;
		}
		System.out.println(result[n]);

	}

}
