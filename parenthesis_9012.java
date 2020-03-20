import java.util.Scanner;
import java.util.Stack;

public class parenthesis_9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String temp = sc.next();
			char[] input = temp.toCharArray();
			Stack<Character> st = new Stack<>();

			boolean ok = true;

			for (int j = 0; j < input.length; j++) {

				if (input[j] == ')') {
					if (st.isEmpty()) {
						ok = false;
						break;
					}
					st.pop();

				} else
					st.push(input[j]);

			}

			if (!st.isEmpty())
				ok = false;

			if (ok)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}

}
