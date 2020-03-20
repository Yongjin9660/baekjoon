import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _4949 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		while (input != ".") {

			if (input.equals("."))
				break;

			char[] arr = input.toCharArray();
			Stack<Character> stack = new Stack<>();

			boolean ok = true;

			for (int i = 0; i < arr.length; i++) {

				if (arr[i] != '(' && arr[i] != ')' && arr[i] != '[' && arr[i] != ']')
					continue;
				else {
					if (arr[i] == '(' || arr[i] == '[')
						stack.push(arr[i]);
					else {
						if (stack.isEmpty()) {
							ok = false;
							break;
						}

						char temp = stack.pop();

						if (temp == '(') {
							if (arr[i] == ']') {
								ok = false;
								break;
							}
						}
						if (temp == '[') {
							if (arr[i] == ')') {
								ok = false;
								break;
							}
						}

					}

				}
			}

			if (!stack.isEmpty())
				ok = false;

			if (ok)
				System.out.println("yes");
			else
				System.out.println("no");

			input = br.readLine();
		}

	}

}
