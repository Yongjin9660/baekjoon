import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("\\-");

		int sum = 0;

		for (int i = 0; i < input.length; i++) {
			String[] temp = input[i].split("\\+");

			int tempsum = 0;

			if (i == 0) {
				for (String t : temp)
					tempsum += Integer.parseInt(t);
				sum += tempsum;
			} else {
				for (String t : temp)
					tempsum += Integer.parseInt(t);
				sum -= tempsum;
			}

		}

		System.out.println(sum);
	}

}
