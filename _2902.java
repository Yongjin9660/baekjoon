import java.util.Scanner;

public class _2902 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		System.out.print(input.charAt(0));

		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == '-') {
				System.out.print(input.charAt(i + 1));
			}
		}
	}

}
