

import java.util.Scanner;

public class alphabet_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String input = sc.next();
		
		String s = "baekjoon";
		
		//System.out.println(s.indexOf("a"));
		
		for(char i='a';i<='z';i++) {
			System.out.print(s.indexOf(i)+" ");
		}
	}

}
