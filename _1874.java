import java.util.Scanner;
import java.util.Stack;

public class _1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++)
			arr[i] = sc.nextInt();
		Stack<Integer> stack = new Stack<>();

		int temp;

		int index = 1;
		int number = 1;
		boolean ok = true;

		while (true) {

			if (arr[index] >= number) {
				stack.push(number);
				number++;
				sb.append("+\n");
			} else {
				temp = stack.pop();
				if (temp != arr[index]) {
					ok = false;
					break;
				}
				index++;
				sb.append("-\n");
			}
			if (index > n)
				break;

		}

		if (ok)
			System.out.println(sb);
		else
			System.out.println("NO");

	}
}
