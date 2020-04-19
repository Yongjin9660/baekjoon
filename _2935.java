import java.util.Scanner;

public class _2935 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		StringBuilder sb = new StringBuilder();

		char op = b.charAt(0);

		if (a.length() > c.length()) {
			if (op == '*') {
				sb.append("1");
				int temp = a.length() + c.length() - 2;
				for (int i = 0; i < temp; i++)
					sb.append("0");
			} else {
				sb.append("1");
				int temp = a.length() - c.length();
				for (int i = 1; i < a.length(); i++) {
					if (i == temp)
						sb.append("1");
					else
						sb.append("0");
				}
			}

		} else if (a.length() < c.length()) {
			if (op == '*') {
				sb.append("1");
				int temp = a.length() + c.length() - 2;
				for (int i = 0; i < temp; i++)
					sb.append("0");
			} else {
				sb.append("1");
				int temp = c.length() - a.length();
				for (int i = 1; i < c.length(); i++) {
					if (i == temp)
						sb.append("1");
					else
						sb.append("0");
				}
			}

		} else {
			if (op == '*') {
				sb.append("1");
				for (int i = 0; i < (a.length() - 1) * 2; i++)
					sb.append("0");
			} else {
				sb.append("2");
				for (int i = 0; i < a.length() - 1; i++)
					sb.append("0");

			}
		}
		System.out.println(sb);
	}

}
