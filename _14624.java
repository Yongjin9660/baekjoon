import java.util.Scanner;

public class _14624 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		if (input % 2 == 0) {
			System.out.println("I LOVE CBNU");
		} else {
			for (int i = 0; i < input; i++)
				System.out.print("*");
			System.out.println();

			int line = input / 2 + 1;

			for (int i = 0; i < line; i++) {
				for (int j = 0; j < input; j++) {
					if (i == 0 && j == line - 1) {
						System.out.print("*");
						break;
					} else if (j == line - i - 1) {
						System.out.print("*");
					} else if (j == line + i - 1) {
						System.out.print("*");
						break;
					} else
						System.out.print(" ");
				}
				System.out.println();

			}

		}
	}

}
