import java.util.Scanner;

public class _10886 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int cute = 0;
		int notcute = 0;

		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			if (temp == 1)
				cute++;
			else
				notcute++;
		}
		if (cute > notcute)
			System.out.println("Junhee is cute!");
		else
			System.out.println("Junhee is not cute!");

	}

}
