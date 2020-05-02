import java.util.Scanner;

public class _1100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		for (int i = 0; i < 8; i++) {
			String input = sc.next();

			if (i % 2 == 1) {
				for (int j = 1; j < 8; j += 2) {
					if (input.charAt(j) == 'F')
						result++;
				}
			} else {
				for (int j = 0; j < 8; j += 2) {
					if (input.charAt(j) == 'F')
						result++;
				}
			}

		}
		System.out.println(result);

	}

}
