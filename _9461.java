

import java.util.Scanner;

public class _9461 {

	static long[] memo;

	private static long pado(int n) {
		if (memo[n] > 0)
			return memo[n];
		else {
			memo[n] = pado(n - 1) + pado(n - 5);
			return memo[n];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		memo = new long[101];

		memo[1] = 1;
		memo[2] = 1;
		memo[3] = 1;
		memo[4] = 2;
		memo[5] = 2;
		
		for (int i = 0; i < t; i++) {
			int temp = sc.nextInt();
			System.out.println(pado(temp));
		}
	}

}
