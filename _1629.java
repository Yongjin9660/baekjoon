import java.util.Scanner;

public class _1629 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(divide(a, b, c));
	}

	private static long divide(int a, int b, int c) {
		if (b == 0)
			return 1;
		if (b % 2 == 1) {
			return divide(a, b - 1, c) * a % c;
		} else {
			long temp = divide(a, b / 2, c) % c;
			return temp * temp % c;
		}

	}

}
