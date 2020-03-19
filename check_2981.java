
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class check_2981 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(br.readLine());

		Arrays.sort(arr);

		int temp = arr[1] - arr[0];

		for (int i = 2; i < n; i++)
			temp = gcd(temp, arr[i] - arr[i - 1]);

		for (int i = 2; i <= temp; i++) {
			if (temp % i == 0)
				System.out.print(i + " ");
		}

	}

	private static int gcd(int a, int b) {
		if (a % b == 0)
			return b;

		return gcd(b, a % b);
	}

}
