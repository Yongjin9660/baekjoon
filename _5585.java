import java.util.Scanner;

public class _5585 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int temp = 1000 - n;
		int cnt = 0;
		while (true) {
			int a;

			if (temp >= 500) {
				cnt += 1;
				temp -= 500;
			} else if (temp >= 100) {
				a = temp / 100;
				cnt += a;
				temp -= 100 * a;
			} else if (temp >= 50) {
				a = temp / 50;
				cnt += a;
				temp -= 50 * a;
			} else if (temp >= 10) {
				a = temp / 10;
				cnt += a;
				temp -= 10 * a;
			} else if (temp >= 5) {
				a = temp / 5;
				cnt += a;
				temp -= 5 * a;
			} else if (temp > 0) {
				a = temp / 1;
				cnt += a;
				temp -= 1 * a;
			}
			if (temp == 0)
				break;

		}
		System.out.println(cnt);

	}

}
