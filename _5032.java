import java.util.Scanner;

public class _5032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int e = sc.nextInt();
		int f = sc.nextInt();
		int c = sc.nextInt();

		e += f;

		int result = 0;

		while (true) {

			if (e < c)
				break;

			result += e / c;

			e = e % c + e / c;

		}
		System.out.println(result);

	}

}
