

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class klo_2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] al = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0 ; i<al.length ; i++) {
			input = input.replace(al[i], "a");
		}
		System.out.println(input.length());
	}
}
