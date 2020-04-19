import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _8979 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] num = new int[n];

		int find = 1;

		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			temp = temp.replaceAll(" ", "");
			
			num[i] = Integer.parseInt(temp);
			
			if (num[i] / 1000 == k)
				find = num[i] % 1000;
		}

		int result = 1;

		for (int i = 0; i < n; i++) {
			if (num[i] % 1000 > find)
				result++;
		}

		System.out.println(result);

	}

}
