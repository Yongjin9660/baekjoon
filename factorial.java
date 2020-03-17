

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		System.out.println(fac(input));
	}

	private static int fac(int n) {
		if(n==1) return 1;
		else if(n==0) return 1;
		else return n*fac(n-1);
	}
}
