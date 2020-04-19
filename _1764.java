import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class _1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Set<String> set = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();

		while (n-- > 0) {
			String temp = br.readLine();
			set.add(temp);
		}
		while (m-- > 0) {
			String temp = br.readLine();
			if (set.contains(temp)) {
				list.add(temp);
			}
		}
		Collections.sort(list);
		System.out.println(list.size());

		for (String a : list)
			System.out.println(a);

	}

}
