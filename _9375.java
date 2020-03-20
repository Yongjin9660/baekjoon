import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _9375 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < testcase; i++) {
			int n = Integer.parseInt(br.readLine());
			HashMap<String, Integer> clothes = new HashMap<>();

			for (int j = 1; j <= n; j++) {
				st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				String kind = st.nextToken();

				if (clothes.containsKey(kind))
					clothes.put(kind, clothes.get(kind) + 1);
				else
					clothes.put(kind, 1);
			}

			int result = 1;
			for (int temp : clothes.values())
				result *= temp + 1;
			System.out.println(result - 1);
		}
	}

}
