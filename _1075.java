import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1075 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());

		n = n / 100 * 100;

		while (true) {

			if (n % f == 0) {
				break;
			}
			n++;
		}

		long temp = n % 100;
		if (temp < 10)
			System.out.println("0" + temp);
		else
			System.out.println(temp);

	}
}
