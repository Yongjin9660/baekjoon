
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class q_1009 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a;
		int b;
		int temp;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			temp = a%10;

			for (int j = 2; j <= b; j++) {
				temp = temp * a;
				temp = temp % 10;
			}

			if (temp == 0)
				System.out.println("10");
			else
				System.out.println(temp);

		}

	}

}
