

import java.util.Scanner;

public class _1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int i=0;
		double num;
		
		while(true) {
			if( 0.5*(i*i+i) >= input) break;
			i++;
		}
		
		num = input-0.5*((i-1)*(i-1)+i-1);
		if(i%2!=0) 
			System.out.println(Math.round((i+1-num))+"/"+Math.round(num));
		
		else 
			System.out.println(Math.round((num))+"/"+Math.round(i+1-num));
		
	}

}
