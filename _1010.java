import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1010 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		long n, m;

		StringTokenizer st;

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			n = Long.parseLong(st.nextToken());
			m = Long.parseLong(st.nextToken());

			long temp = m - n;
			if (temp < n)
				System.out.println(fuc(temp, m));
			else
				System.out.println(fuc(n, m));
		}
	}

	private static long fuc(long n, long m) {

		long a = 1;
		long b = 1;

		if (n == m)
			return 1;
		if (n == 1)
			return m;

		for (long i = 0; i < n; i++) {
			a *= m;
			m--;
		}

		while (n > 0) {
			b *= n;
			n--;
		}
		return (a / b);
	}

}
