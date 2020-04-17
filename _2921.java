import java.util.Scanner;

public class _2921 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;

		for (int i = 0; i <= n; i++) {
			for (int j = i; j <= n; j++)
				result = result + i + j;
		}
		System.out.println(result);

	}

}
