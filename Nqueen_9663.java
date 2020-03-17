

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nqueen_9663 {
	static int ans, n;
	static int[] col;
	
	
	
	private static void nQueen(int row) {
		if(row == n) {
			
		}
		
		for(int i=1; i <= n ; i++) {
			col[row+1] = i;
			
		}
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		for(int i = 1 ; i<=n ; i++) {
			col = new int[n];
			col[1] = i;
			nQueen(1);
		}
		
	}

}
