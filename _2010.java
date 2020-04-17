import java.util.Scanner;

public class _2010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 1;
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			sum += temp;
		}

		sum = sum - n;
		System.out.println(sum);
	}

}
