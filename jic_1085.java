

import java.util.Scanner;

public class jic_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int minX, minY;
		
		if( Math.abs(w-x) >= x ) minX = x;
		else minX=Math.abs(w-x);
		
		if( Math.abs(h-y) >= y ) minY = y;
		else minY=Math.abs(h-y);
		
		if(minX > minY) System.out.println(minY);
		else System.out.println(minX);
		
	}

}
