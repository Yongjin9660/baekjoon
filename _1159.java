import java.util.Arrays;
import java.util.Scanner;

public class _1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] input = new String[n];

		int alph[] = new int[26];
		Arrays.fill(alph, 0);

		for (int i = 0; i < n; i++) {
			input[i] = sc.next();
			alph[input[i].charAt(0) - 97]++;
		}
		boolean check = false;

		for (int i = 0; i < 26; i++) {
			if (alph[i] >= 5) {
				check = true;
				System.out.printf("%c", i + 97);
			}
		}

		if (!check)
			System.out.println("PREDAJA");

	}

}
