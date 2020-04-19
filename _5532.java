import java.util.Scanner;

public class _5532 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int q1, q2;

		if (a % c == 0)
			q1 = a / c;
		else
			q1 = a / c + 1;

		if (b % d == 0)
			q2 = b / d;
		else
			q2 = b / d + 1;

		System.out.println(l - Math.max(q1, q2));

	}

}
