

import java.util.Arrays;
import java.util.Scanner;

public class multi_1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.parallelSort(arr);
		
		System.out.println(arr[0]*arr[n-1]);

	}

}
