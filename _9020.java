

import java.util.Arrays;
import java.util.Scanner;

public class _9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		for(int i=0;i<testcase;i++) {
			int input = sc.nextInt();
			
			boolean[] arr = new boolean[input+1];
			Arrays.fill(arr, true);
			arr[1] = false;
			
			for(int j=2;j<input;j++)
				for(int k=2;j*k<input;k++)
					arr[j*k] = false;
			
			
			int half = input/2;
			int conti=-1;
			for(int j=half ; j>=2 ; j--) {
				if(arr[j]) {
					for(int k = half;k<input;k++) {
						if(arr[k] && (j+k)==input) {
							System.out.println(j+" "+k);
							conti=1;
							break;
						}
					}
					if(conti==1) break;
				}
			}
			
		}
	}

}
