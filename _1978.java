

import java.util.Scanner;

public class _1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] number = new int[n];
		
		for(int i=0;i<n;i++) 
			number[i] = sc.nextInt();
		
		int result=0;
		
		for(int i = 0;i<n;i++) {
			int temp=0;
			
			if(number[i]==1) continue;
			else {
				for(int j=2 ; j<number[i]-1 ; j++) {
					if( number[i]%j == 0 ) temp++;
					

				}
			}
			if(temp==0) result++;
		}
		System.out.println(result);
		
	}

}
