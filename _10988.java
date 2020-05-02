import java.util.Scanner;

public class _10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		int mid = input.length() / 2;
		int check = 1;

		for (int i = 0; i < mid; i++) {
			if (input.charAt(i) != input.charAt(input.length() - 1 - i))
				check = 0;
		}
		System.out.println(check);
	}

}
