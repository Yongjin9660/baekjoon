

import java.util.Arrays;
import java.util.Scanner;

public class star_2447 {

	static char[][] arr;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		
		arr = new char[input][input];
		
		for(int i=0;i<input;i++) {
			Arrays.fill(arr[i], ' ');
		}
		
		star(0,0,input);
		for(int i=0;i<input;i++)
			System.out.println(arr[i]);
	}
	
	private static void star(int x , int y, int n) {
		int temp=n/3;
		if(n == 1) {
			arr[x][y] = '*';
		}
		else {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i==1 && j==1)
						continue;
					else star(x+(temp*i),y+(temp*j),temp);
				}
			}
		}
		
	}
}
