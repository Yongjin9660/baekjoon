import java.util.Scanner;

public class _10797 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[5];

		int cnt = 0;

		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == n)
				cnt++;
		}
		System.out.println(cnt);

	}

}
