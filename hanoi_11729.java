

import java.util.Scanner;

public class hanoi_11729 {
	
	static int result=0;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		hanoi(input,1,2,3);
		System.out.println(result);
		System.out.println(sb);
	}
	private static void hanoi(int n,int from,int by,int to) {
		result++;
		if(n==1) 
			sb.append(from+" "+to+"\n");
		else {
			hanoi(n-1,from,to,by);
			sb.append(from+" "+to+"\n");
			hanoi(n-1,by,from,to);
		}
	}

}
