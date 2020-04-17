import java.util.Scanner;

public class _1977 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int sum = 0;
		int min = -1;

		for (int i = 1; i <= 100; i++) {
			int temp = i * i;

			if (temp < m)
				continue;
			else if (temp > n)
				break;
			else {
				if (min == -1)
					min = temp;
				sum += temp;

			}

		}
		if (min == -1)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
