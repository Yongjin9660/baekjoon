

import java.util.Scanner;

public class _3036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) 
			arr[i] = sc.nextInt();
		
		int min;
		
		
		for(int i=1;i<n;i++) {
			min = Math.min(arr[0], arr[i]);
			
			while(min != 0) {
				if(arr[0]%min==0 && arr[i]%min ==0) {
					System.out.println(arr[0]/min + "/" + arr[i]/min);
					break;
				}
				min--;
			}
			
		}
	}

}
