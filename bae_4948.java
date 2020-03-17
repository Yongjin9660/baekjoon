

import java.util.Arrays;
import java.util.Scanner;

public class bae_4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int input = sc.nextInt();
			
			if(input==0) break;
			
			boolean[] arr = new boolean[2*input+1];
			
			Arrays.fill(arr, true);
			arr[1] = false;				//true면 소수, false면 소수x
			
			for(int i=2 ; i<=2*input;i++)
				for(int j=2 ; i*j<=2*input ; j++)
					arr[i*j] = false;
			
			int result=0;
			
			for(int i=input+1 ; i <= 2*input ; i++) {
				if(arr[i]==true) 
					result++;
			}
			
			System.out.println(result);
			
		}
	}
}
