import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _5430 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testcase = Integer.parseInt(br.readLine());

		for (int k = 0; k < testcase; k++) {
			String command = br.readLine();
			char[] commandArr = command.toCharArray();

			int n = Integer.parseInt(br.readLine());

			String input = br.readLine();

			if (n == 0) {
				boolean a = true;
				for (int i = 0; i < commandArr.length; i++) {
					if (commandArr[i] == 'R')
						continue;
					else {
						sb.append("error\n");
						a = false;
						break;
					}
				}
				if (a)
					sb.append("[]\n");
			} else {
				input = input.replace("[", "").replace("]", "");
				String[] token = input.split(",");

				Deque<Integer> de = new ArrayDeque<>();

				for (int i = 0; i < token.length; i++)
					de.add(Integer.parseInt(token[i]));

				int index = 0;
				boolean ok = true;

				for (int i = 0; i < commandArr.length; i++) {
					if (commandArr[i] == 'R') {
						if (index == 0)
							index = de.size() - 1;
						else
							index = 0;
					} else {
						if (de.isEmpty()) {
							sb.append("error\n");
							ok = false;
							break;
						}
						if (index == 0)
							de.pollFirst();
						else
							de.pollLast();
					}
				}

				int len = de.size();

				if (ok) {
					sb.append('[');

					if (index == 0) {
						for (int i = 0; i < len; i++) {
							if (i == len - 1)
								sb.append(de.pollFirst() + "]\n");
							else
								sb.append(de.pollFirst() + ",");
						}

					} else {
						for (int i = 0; i < len; i++) {
							if (i == len - 1)
								sb.append(de.pollLast() + "]\n");
							else
								sb.append(de.pollLast() + ",");
						}
					}

				}
			}
		}
		System.out.println(sb);
	}
}