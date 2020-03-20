

import java.util.Arrays;
import java.util.Scanner;

public class _2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int[] arr = new int[testcase];
		
		for(int i=0 ; i<testcase ; i++) 
			arr[i] = sc.nextInt();
		
		int temp;
		
		/**********버블정렬*************
		 * for(int i=testcase-1 ; i > 0 ; i--) {
			for(int j = 0 ; j < testcase -1 ; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		*/
		
		//***************삽입정렬******************
		
		int j;
		for(int i=1 ; i<testcase ; i++) {
			temp = arr[i];
			
			for(j = i-1 ; j>=0 ; j--) {
				if(temp < arr[j])
					arr[j+1] = arr[j];
				else break;
				
					
			}
			
			arr[j+1] = temp;
		}
		
		
		
		for(int i : arr) System.out.println(i);
	}

}
