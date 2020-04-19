import java.util.Scanner;

public class _5596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		int h = sc.nextInt();

		int sum1 = a + b + c + d;
		int sum2 = e + f + g + h;

		System.out.println(Math.max(sum1, sum2));

	}

}
