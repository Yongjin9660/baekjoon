

import java.util.Scanner;

public class word_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int length = input.length();
		
		int[] al = new int[26];
		
		for(int i=0;i<length;i++) {
			char temp = input.charAt(i);
			if(temp<97) temp+=32;
			al[temp-97]++;
		}
		int max = -1;
		int result=0;
		
		for(int i=0;i<26;i++) {
			if(al[i]>max) {
				max = al[i];
				result=i;
			}
		}
		int temp=0;
		
		for(int a :al) {
			if(max ==a) temp++;
		}
		
		if(temp==1) {
			System.out.println((char)(result+65));
		}else {
			System.out.println("?");
		}
		
	}

}
