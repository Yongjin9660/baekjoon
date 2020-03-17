

import java.util.Scanner;

public class number_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result1=0;
		int result2=0;
		
		result1=a%10*100;
		result2=b%10*100;
		
		a = a/10;
		b=b/10;
		
		result1 += a%10*10;
		result2 += b%10*10;
		
		result1 += a/10;
		result2+=b/10;
		
		if(result1 > result2) System.out.println(result1);
		else System.out.println(result2);

	}

}
