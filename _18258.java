import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _18258 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Queue<Integer> q = new LinkedList<>();
		int last = 1526;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {
			case "push":
				int temp = Integer.parseInt(st.nextToken());
				last = temp;
				q.add(temp);
				break;
			case "front":
				if (q.isEmpty()) {
					sb.append("-1\n");
					break;
				}
				sb.append(q.peek() + "\n");
				break;
			case "pop":
				if (q.isEmpty()) {
					sb.append("-1\n");
					break;
				}
				sb.append(q.poll() + "\n");
				break;
			case "size":
				sb.append(q.size() + "\n");
				break;
			case "empty":
				if (q.isEmpty())
					sb.append("1\n");
				else
					sb.append("0\n");
				break;
			case "back":
				if (q.isEmpty()) {
					sb.append("-1\n");
					break;
				}
				sb.append(last + "\n");
				break;
			}

		}
		System.out.println(sb);
	}

}
