

import java.util.Scanner;

public class _1267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		int sumY = 0;
		int sumM = 0;
		int temp;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

			temp = arr[i] / 30;

			sumY += 10 * (temp + 1);

			temp = arr[i] / 60;

			sumM += 15 * (temp + 1);

		}

		if(sumY == sumM)
			System.out.println("Y M "+sumY);
		else if(sumY > sumM)
			System.out.println("M "+sumM);
		else
			System.out.println("Y "+sumY);

	}

}
