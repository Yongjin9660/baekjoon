

import java.util.Scanner;

public class _2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int min = -1;
		int sum = 0;
		
		for(int i = M ; i<=N ; i++) {
			int temp=0;
			if(i==1) continue;
			for(int j = 2 ; j < i ; j++) {
				if(i%j==0) temp++;  
			}
			
			if(temp == 0) {
				sum+=i;
				if(min==-1) min=i;
			}
			
		}
		if(sum==0) System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(min);
			}
	}
}
