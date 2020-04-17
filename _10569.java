import java.util.Scanner;

public class _10569 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int v = sc.nextInt();
			int e = sc.nextInt();
			System.out.println(2 - v + e);
		}
	}

}
