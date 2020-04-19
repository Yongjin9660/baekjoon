import java.util.Scanner;

public class _1748 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;

		for (int i = 1; i <= n; i++) {

			if (i / 100000000 >= 1)
				cnt += 9;
			else if (i / 10000000 >= 1)
				cnt += 8;
			else if (i / 1000000 >= 1)
				cnt += 7;
			else if (i / 100000 >= 1)
				cnt += 6;
			else if (i / 10000 >= 1)
				cnt += 5;
			else if (i / 1000 >= 1)
				cnt += 4;
			else if (i / 100 >= 1)
				cnt += 3;
			else if (i / 10 >= 1)
				cnt += 2;
			else if (i / 1 >= 1)
				cnt += 1;

		}
		System.out.println(cnt);
	}

}
