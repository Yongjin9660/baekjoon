

import java.util.Scanner;

public class _2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		int min = Math.min(a, b);
		
		while(min != 1) {
			if(a%min==0 && b%min==0) {
				break;
			}
			min--;
		}
		System.out.println(min);
		
		int max = Math.max(a, b);
		min = Math.min(a, b);
		
		int i = 1;
		int j=1;
		while(true) {
			
			while(max*i >= min*j) {
				if(max*i == min*j) {
					break;
				}
				j++;
			}
			
			
			
			if(max*i == min*j) break;
			i++;
			
		}
		
		System.out.println(min*j);
	}

}
