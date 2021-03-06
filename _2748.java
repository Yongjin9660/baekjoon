

import java.io.IOException;
import java.util.Scanner;

public class _2748 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] fibo = new long[n+1];
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int i=2; i < n+1 ;i++) 
			fibo[i] = fibo[i-1]+fibo[i-2];
		
		System.out.println(fibo[n]);
		
	}
}
