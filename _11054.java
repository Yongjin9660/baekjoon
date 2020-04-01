import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11054 {

	static int[] arr;
	static int n;
	static int index;
	static int[] temp1;
	static int[] temp2;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		arr = new int[n + 1];

		for (int i = 1; i <= n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		if (n == 1)
			System.out.println("1");
		else {

			dp(1, n);
			reversedp(n, 1);

			int max = -1;
			for (int i = 1; i <= n; i++) {
				if (max < temp1[i] + temp2[i] - 1) {
					max = temp1[i] + temp2[i] - 1;
				}
			}
			System.out.println(max);
		}
	}

	static private void dp(int start, int last) {

		temp1 = new int[n + 1];
		Arrays.fill(temp1, 1);

		for (int i = start + 1; i <= last; i++) {
			if (arr[i] == arr[index])
				continue;
			for (int j = start; j < i; j++) {
				if (arr[i] > arr[j])
					temp1[i] = Math.max(temp1[i], temp1[j] + 1);
			}
		}
	}

	static private void reversedp(int start, int last) {
		temp2 = new int[n + 1];
		Arrays.fill(temp2, 1);

		for (int i = start - 1; i >= last; i--) {
			if (arr[i] == arr[index])
				continue;
			for (int j = start; j > i; j--) {
				if (arr[i] > arr[j])
					temp2[i] = Math.max(temp2[i], temp2[j] + 1);
			}
		}

	}
}
