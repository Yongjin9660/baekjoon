import java.util.Scanner;

public class _11006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();

		for (int i = 0; i < testcase; i++) {
			int u = sc.nextInt();
			int t = sc.nextInt();

			int total = t * 2;

			int cut = total - u;

			System.out.println(cut + " " + (t - cut));

		}
	}

}
