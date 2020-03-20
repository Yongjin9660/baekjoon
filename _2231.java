

import java.util.Scanner;

public class _2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int result=0;
		int sum=0;
		int temp;
		for(int i=1 ; i < input ; i++) {
			temp=i;
			sum=i;
			
			do {
				sum+=temp%10;
				temp/=10;
			}while(temp>0);
			
			if(sum==input) {
				result=i;
				break;
			}
			
		}
		
		System.out.println(result);
	}

}
