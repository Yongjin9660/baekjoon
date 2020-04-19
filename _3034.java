import java.util.Scanner;

public class _3034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		while (n-- > 0) {
			int temp = sc.nextInt();
			if (temp * temp <= w * w + h * h)
				System.out.println("DA");
			else
				System.out.println("NE");

		}
	}

}
