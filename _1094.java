import java.util.Scanner;

public class _1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;

		while (true) {
			if (n == 64) {
				cnt++;
				break;
			} else if (n >= 32) {
				n -= 32;
				cnt++;
			} else if (n >= 16) {
				n -= 16;
				cnt++;
			} else if (n >= 8) {
				n -= 8;
				cnt++;
			} else if (n >= 4) {
				n -= 4;
				cnt++;
			} else if (n >= 2) {
				n -= 2;
				cnt++;
			} else if (n == 1) {
				cnt++;
				break;
			} else
				break;

		}

		System.out.println(cnt);

	}

}
