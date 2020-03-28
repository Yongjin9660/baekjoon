import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14625 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int h1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int h2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());

		int n = Integer.parseInt(br.readLine());

		int cnt = 0;

		while (true) {

			if (h1 % 10 == n || h1 / 10 == n || m1 % 10 == n || m1 / 10 == n)
				cnt++;

			if (h1 == h2 && m1 == m2)
				break;

			m1++;
			if (m1 == 60) {
				m1 = 0;
				h1++;
			}

		}
		System.out.println(cnt);
	}

}
