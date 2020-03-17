

import java.util.Scanner;

public class dlgkd_11050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int result = n;

		if (k == 0)
			System.out.println(1);
		else {
			for (int i = 1; i < k; i++) {
				n--;
				result = result * n;
			}

			int temp = 1;

			while (k > 0) {
				temp *= k;
				k--;
			}
			System.out.println(result / temp);
		}

	}

}
