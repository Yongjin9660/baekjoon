

import java.util.Scanner;

public class sweet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int output;
		int remain;
		int three, five;
		
		five = input/5;
		remain = input%5;
		int j=0;
		for(int i=five ; i>=0 ; i--) {
			if(i==0) {
				if(input%3 != 0) {
					System.out.println("-1");
				}
				else System.out.println(input/3);
			}
			else {
				
				
				five = input/(5);
				remain = remain+5*j;
				
				if(remain%3==0) {
					three = remain/3;
					System.out.println(i + three);
					break;
				}
				j++;
				
			}
			
		}
	}

}
