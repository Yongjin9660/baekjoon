import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1789 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());

		long cnt = 1;
		long sum = 1;

		while (n > sum) {
			cnt++;
			sum += cnt;
		}
		if (n < sum)
			cnt--;

		System.out.println(cnt);

	}

}
