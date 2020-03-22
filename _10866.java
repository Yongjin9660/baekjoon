import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> de = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			String command = st.nextToken();
			int temp;
			switch (command) {
			case "push_front":
				temp = Integer.parseInt(st.nextToken());
				de.addFirst(temp);
				break;
			case "push_back":
				temp = Integer.parseInt(st.nextToken());
				de.addLast(temp);
				break;
			case "pop_front":
				if (de.isEmpty())
					System.out.println("-1");
				else
					System.out.println(de.removeFirst());
				break;
			case "pop_back":
				if (de.isEmpty())
					System.out.println("-1");
				else
					System.out.println(de.removeLast());
				break;
			case "size":
				System.out.println(de.size());
				break;
			case "empty":
				if (de.isEmpty())
					System.out.println("1");
				else
					System.out.println("0");
				break;
			case "front":
				if (de.isEmpty())
					System.out.println("-1");
				else
					System.out.println(de.getFirst());
				break;
			case "back":
				if (de.isEmpty())
					System.out.println("-1");
				else
					System.out.println(de.getLast());
				break;
			}

		}

	}

}
