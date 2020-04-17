import java.util.Scanner;

public class _3046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int s = sc.nextInt();

		if (s - r1 >= 0)
			System.out.println(s + s - r1);
		else if (r1 - s > 0)
			System.out.println(s - r1 + s);

	}

}
