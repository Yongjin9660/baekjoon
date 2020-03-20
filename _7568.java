

import java.util.Scanner;

public class _7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		int[] x = new int[testcase];
		int[] y = new int[testcase];

		for(int i=0;i<testcase;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int result;
		
		for(int i=0 ; i<testcase ; i++) {
			result=0;
			for(int j = 0; j < testcase ; j++) {
				if(i==j) continue;
				if(x[i] < x[j] && y[i] < y[j] ) result++;
			}
			result+=1;
			System.out.print(result+" ");
		}
		
	}

}
