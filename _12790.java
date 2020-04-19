import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _12790 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int i = 0; i < t; i++) {
			int[] arr = new int[8];
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < 8; j++)
				arr[j] = Integer.parseInt(st.nextToken());

			int hp = arr[0] + arr[4];
			int mp = arr[1] + arr[5];
			int of = arr[2] + arr[6];
			int de = arr[3] + arr[7];

			if (hp < 1)
				hp = 1;
			if (mp < 1)
				mp = 1;
			if (of < 0)
				of = 0;
			System.out.println(hp + 5 * mp + 2 * of + 2 * de);

		}

	}
}
