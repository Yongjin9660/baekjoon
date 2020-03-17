

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class q_1009 {

	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		while (true) {
			String input = br.readLine();
			int small = 0;
			int big = 0;
			int check = 0;
			boolean no = false;
			if (input.equals("."))
				break;

			char[] arr = input.toCharArray();

			for (char c : arr) {
				
				if (c == '(') {
					small++;
					check=1;
				}
					
				if (c == '[') {
					big++;
					check=-1;
				}
				
				if (c == ')') {
					if(check != 1) {
						System.out.println("no");
						no=true;
						break;
					}
					small--;
				}
					
				if (c == ']') {
					if(check != -1) {
						System.out.println("no");
						no=true;
						break;
					}
					big--;
				}
					
				
				if (small < 0 || big < 0) {
					System.out.println("no");
					no=true;
					break;
				}



			}

			if (small == 0 && big == 0 && no != true)
				System.out.println("yes");

		}

	}

}
