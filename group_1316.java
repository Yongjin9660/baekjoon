

import java.util.Arrays;
import java.util.Scanner;

public class group_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		String[] input = new String[testcase];
		
		int result=0;
		int temp;
		
		for(int i=0;i<testcase;i++) {
			input[i]=sc.next();
			int[] arr = new int[26];
			
			Arrays.fill(arr, 0);
			arr[input[i].charAt(0) - 97]++;
			
			temp=0;
			
			for(int j=1 ; j < input[i].length() ; j++) {
				if( arr[input[i].charAt(j) - 97] != 0 && input[i].charAt(j-1) != input[i].charAt(j) ) {
					temp++;
				}
				arr[input[i].charAt(j) - 97]++;
				
			}
			
			if(temp==0) 
				result++;
		}
		
		System.out.println(result);
		
	}

}
