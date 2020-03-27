import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class _1021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Deque<Integer> dq = new ArrayDeque<>();

		for (int i = 1; i <= n; i++)
			dq.add(i);

		st = new StringTokenizer(br.readLine());

		int target;
		int cnt = 0;
		int index;

		for (int i = 0; i < m; i++) {
			target = Integer.parseInt(st.nextToken());
			index = 1;
			Iterator<Integer> it = dq.iterator();

			while (it.hasNext()) {
				if (it.next() == target)
					break;
				index++;
			}

			int size = dq.size();

			if (size / 2 + 1 >= index) {
				for (int j = 1; j < index; j++) {
					dq.addLast(dq.pollFirst());
					cnt++;
				}
				dq.pollFirst();
			} else {
				for (int j = size; j >= index; j--) {
					dq.addFirst(dq.pollLast());
					cnt++;
				}
				dq.pollFirst();
			}

		}
		System.out.println(cnt);
	}
}
