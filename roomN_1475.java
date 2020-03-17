

import java.util.Arrays;
import java.util.Scanner;

public class roomN_1475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int[] arr = new int[input.length()];
		
		for(int i=0;i<input.length();i++) {
			arr[i] = input.charAt(i)-'0';
		}
		
		int[] number = new int[10];
		
		
		for(int i=0;i<input.length();i++)
			number[arr[i]]++;
		
		int r = (number[6]+number[9]);
		
		if(r%2==0) {
			number[6]=r/2;
			number[9]=r/2;
		}
		else {
			number[6]=r/2+1;
			number[9]=r/2+1;
		}
		int max =0;
		
		for(int i : number) {
			max = Math.max(max, i);
		}
		System.out.println(max);
	}

}
