import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2563 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean[][] arr = new boolean[101][101];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			for (int i = a; i < a + 10; i++) {
				for (int j = b; j < b + 10; j++) {
					if (!arr[i][j])
						arr[i][j] = true;
				}
			}
		}
		int cnt = 0;
		for (int i = 1; i < 101; i++) {
			for (int j = 1; j < 101; j++) {
				if (arr[i][j])
					cnt++;
			}
		}
		System.out.println(cnt);
	}

}
