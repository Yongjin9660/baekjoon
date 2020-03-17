

import java.util.Scanner;

public class star_2446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		int temp = 2 * n - 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < temp; j++) {
				if (i <= j && j < temp - i) {
					System.out.print("*");
					if(i==n-1) 
						continue;
					sb.append("*");
				}
				else {
					System.out.print(" ");
					sb.append(" ");
				}
			}
			System.out.println();
			if(i==n-1) continue;
			else
				sb.append("\n");
		}
		sb.reverse();
		sb.delete(0, temp);

		System.out.println(sb);
		
		
		/*Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		
		for(int i = N-1; i >= 0 ; i--) {
			for(int j = 1; j < N-i; j++)
				System.out.print(" ");
			for(int j = 0; j < i*2+1; j++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i = 1; i < N ; i++) {
			for(int j = 1; j < N-i; j++)
				System.out.print(" ");
			for(int j = 0; j < i*2+1; j++)
				System.out.print("*");
			System.out.println();
		}*/
		
	}

}
