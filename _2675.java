

import java.util.Scanner;

public class _2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		for(int i=0 ; i<testcase ; i++) {
			int r = sc.nextInt();
			String s = sc.next();
			int len = s.length();
			
			for(int j=0;j<len;j++) {
				char temp = s.charAt(j);
				for(int k=0;k<r;k++) {
					System.out.print(temp);
				}
			}
			System.out.println();
		}
		

	}

}
