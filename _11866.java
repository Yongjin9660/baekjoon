import java.util.LinkedList;
import java.util.Scanner;

public class _11866 {

	static StringBuilder sb = new StringBuilder();
	static int now;
	static int size;
	static int n;
	static int k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		k = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 1; i <= n; i++)
			list.add(i);

		now = -1;
		int t = 0;

		sb.append("<");

		while (!list.isEmpty()) {

			size = list.size();
			findN();
			int temp = list.remove(now);

			if (t == n - 1)
				sb.append(temp);
			else
				sb.append(temp + ", ");

			t++;
			now -= 1;
		}

		sb.append(">");

		System.out.println(sb);

	}

	private static void findN() {

		now += k;

		if (now > size - 1)
			now = now % size;

	}

}
