import java.util.Scanner;

public class _10798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char input[][] = new char[5][15];

		int maxlen = -1;

		for (int i = 0; i < 5; i++) {
			String temp = sc.next().trim();
			maxlen = Math.max(maxlen, temp.length());
			for (int j = 0; j < temp.length(); j++)
				input[i][j] = temp.charAt(j);
		}

		for (int i = 0; i < maxlen; i++) {
			for (int j = 0; j < 5; j++) {
				if (input[j][i] == '\0')
					continue;
				System.out.print(input[j][i]);
			}
		}
	}

}
