

import java.util.Arrays;
import java.util.Scanner;

public class _1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		
		for(int i=1 ; i<=num ; i++) {
			if(hansoo(i)) sum++;
		}
		
		System.out.println(sum);
	}
	
	private static boolean hansoo(int i) {
		if(i<100) 
			return true;
		if(i==1000) return false;
		
		int[] arr=new int[3];
		for(int j=0;j<=2;j++) {
			arr[j]=i%10;
			i=i/10;
		}
		if(arr[1]-arr[0] == arr[2]-arr[1]) return true;
		return false;
	}

}
