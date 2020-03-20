

import java.util.Scanner;

public class _2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int i=0;
		if(input==1) 
			System.out.println("1");
		else {
			while(true) {
				if(3*i*i-3*i+1 >= input) {
					System.out.println(i);
					break;
				}
				i++;
			}
		}

	}

}
