import java.util.Scanner;

public class _5575 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();

			int hh = sc.nextInt();
			int mm = sc.nextInt();
			int ss = sc.nextInt();

			int H = hh - h;
			int M = mm - m;
			int S = ss - s;
			if (S < 0) {
				M--;
				S += 60;
			}

			if (M < 0) {
				H--;
				M += 60;
			}

			System.out.println(H + " " + M + " " + S);

		}

	}

}
