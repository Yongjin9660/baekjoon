

import java.util.Scanner;

public class tkdrms_5543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int sum=0;
		int temp;
		
		if(a>=b) temp=b;
		else temp=a;
		
		if(c<temp) temp=c;
		
		sum+=temp;
		
		if(A>B) sum = B+sum-50;
		else sum = A+sum-50;
		
		System.out.println(sum);
	}

}
