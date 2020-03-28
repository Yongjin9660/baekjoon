import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _5430 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testcase; i++) {
			String[] command = br.readLine().split("");

			int n = Integer.parseInt(br.readLine());

			String[] arr = br.readLine().replace("[", "").replace("]", "").split(",");

			ac(command, n, arr);

		}

	}

	private static void ac(String[] command, int n, String[] arr) {
		Deque<Integer> dq = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++)
			dq.add(Integer.parseInt(arr[i]));

		String dir = "left";

		for (String order : command) {
			if ("R".equals(order)) {
				if (dir.equals("left"))
					dir = "right";
				else
					dir = "left";
			} else {
				if (dq.isEmpty()) {
					sb.append("error");
					System.out.println(sb);
					return;
				} else {
					if (dir.equals("left"))
						dq.pollFirst();
					else
						dq.pollLast();
				}

			}
		}

		int dqlen = dq.size();
		sb.append("[");

		for (int i = 0; i < dqlen; i++) {
			if (dir.equals("left"))
				sb.append(dq.pollFirst());
			else
				sb.append(dq.pollLast());
			if (!dq.isEmpty())
				sb.append(",");
		}
		sb.append("]");
		System.out.println(sb);
		return;

	}

}