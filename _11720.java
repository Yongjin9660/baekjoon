

import java.util.Scanner;

public class _11720 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		String ss = sc.next();
		char a;
		int sum=0;
		for(int i=0;i<input;i++) {
			a = ss.charAt(i);
			int temp = (int)a-48;
			sum+=temp;
		}
		System.out.println(sum);
	}

}
