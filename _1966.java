import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int testcase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testcase; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			Queue<Integer> q = new LinkedList<>();

			st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				int temp = Integer.parseInt(st.nextToken());
				q.add(temp);
				arr[j] = temp;
			}
			Arrays.sort(arr);

			int index = n - 1;
			int result = 0;
			int cnt = 0;

			while (true) {
				int temp = q.poll();

				if (cnt == m) {
					temp += 101;
				}
				cnt++;

				if (arr[index] == temp - 101) {
					result++;
					break;
				} else if (arr[index] == temp) {
					result++;
					index--;

				} else {
					q.add(temp);
				}

			}

			System.out.println(result);
		}

	}
}
