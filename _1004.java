

import java.util.Scanner;

public class _1004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();
		int[] result = new int[testcase];
		
		for (int i = 0; i < testcase; i++) {
			
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			int circle = sc.nextInt();

			int[] Cx = new int[circle];
			int[] Cy = new int[circle];
			int[] r = new int[circle];

			for (int j = 0; j < circle; j++) {
				Cx[j] = sc.nextInt();
				Cy[j] = sc.nextInt();
				r[j] = sc.nextInt();
			}

			for(int j=0 ; j<circle ; j++) {
				if(Math.pow(Cx[j]-x1, 2) + Math.pow(Cy[j]-y1, 2) < Math.pow(r[j], 2)) 
					result[i]++;
				if(Math.pow(Cx[j]-x2, 2) + Math.pow(Cy[j]-y2, 2) < Math.pow(r[j], 2)) 
					result[i]++;
			}
			
		}
		
		for(int i=0;i< testcase;i++) {
			System.out.println(result[i]);
		}
		
	}

}
