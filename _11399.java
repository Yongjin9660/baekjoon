import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11399 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		Arrays.parallelSort(arr);

		int[] sum = new int[n];

		Arrays.fill(sum, 0);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				sum[i] += arr[j];
			}
		}

		int result = 0;
		for (int i = 0; i < n; i++)
			result += sum[i];
		System.out.println(result);

	}

}
