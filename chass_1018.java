

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class chass_1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[n][m];
		
		for(int i=0 ; i<n ; i++) 
			arr[i] = br.readLine().toCharArray();
		
		
		String[] ex1 = {
				"BWBWBWBW", "WBWBWBWB", "BWBWBWBW","WBWBWBWB",
				"BWBWBWBW", "WBWBWBWB", "BWBWBWBW","WBWBWBWB"
		};
		
		String[] ex2 = {
				"WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW",
				"WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW"
		};
		
		int min=100000;
		int temp=0;
		int row,col;
		
		row = n - 8;
		col = m - 8;
		
		int r=0;
		int c=0;

		while (true) {

			for (int i = r, k = 0; i < r + 8 && k < 8; i++, k++) {
				for (int j = c, l = 0; j < c + 8 && l < 8; j++, l++) {

					if (arr[i][j] != ex1[k].charAt(l)) {
						temp++;
					}

				}
			}

			if (min > temp)
				min = temp;

			temp = 0;

			if (row == r && col == c)
				break;
			else {
				if (c < col)
					c++;
				else if (c == col) {
					c = 0;
					r++;
				}

			}
		}

		c=0;
		r=0;
		while (true) {
			
			for (int i = r, k = 0; i < r + 8 && k < 8; i++, k++) {
				for (int j = c, l = 0; j < c + 8 && l < 8; j++, l++) {
					if (arr[i][j] != ex2[k].charAt(l)) {
						temp++;
					}

				}
			}
			
			
			if(min > temp) 
				min = temp;
			
			temp=0;
			
			if(row == r && col == c ) break;
			else {
				if(c < col) 
					c++;
				else if(c == col) {
					c=0;
					r++;
				}		
			}
		}
		System.out.println(min);
		
	}

}
