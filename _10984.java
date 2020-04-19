import java.util.Scanner;

public class _10984 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();

			double[][] arr = new double[n][2];

			double total = 0;
			double sum = 0;

			for (int i = 0; i < n; i++) {
				arr[i][0] = sc.nextDouble();
				arr[i][1] = sc.nextDouble();
				total += arr[i][0];
				sum += arr[i][0] * arr[i][1];
			}
			double temp = sum / total;

			System.out.println(Math.round(total) + " " + Math.round(temp * 10) / 10.0);

		}
	}

}
