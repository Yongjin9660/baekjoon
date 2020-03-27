import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(br.readLine());

		int cnt = 0;
		int remain = k;
		
		for (int i = n - 1; i >= 0; i--) {
			if(remain < arr[i])
				continue;
			else {
				int temp = remain/arr[i];
				cnt += temp;
				remain = remain - temp*arr[i];
			}
		}
		
		System.out.println(cnt);

	}

}
