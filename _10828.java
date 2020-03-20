import java.util.Scanner;
import java.util.Stack;

public class _10828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			String temp = sc.next();

			switch (temp) {
			case "push":
				int a = sc.nextInt();
				st.push(a);
				break;
			case "pop":
				if (st.empty())
					System.out.println(-1);
				else
					System.out.println(st.pop());
				break;
			case "size":
				System.out.println(st.size());
				break;
			case "empty":
				if (st.empty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "top":
				if (st.empty())
					System.out.println(-1);
				else
					System.out.println(st.peek());
				break;
			}

		}

	}

}
