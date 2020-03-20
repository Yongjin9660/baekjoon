

import java.util.Scanner;

public class _5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int num[] = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		int sum=0;
		int len = s.length();
		for(int i=0;i<len;i++) {
			sum+=num[s.charAt(i)-65];
		}
		System.out.println(sum);
	}

}
