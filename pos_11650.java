

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class pos_11650 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] xy = new int[n][2];
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		for(int i=0 ; i<n ; i++) {
			st = new StringTokenizer(br.readLine());
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(xy, new Comparator<int[]>(){

			@Override
			public int compare(int[] x, int[] y) {
				if(x[0] == y[0])
					return Integer.compare(x[1], y[1]);
				return Integer.compare(x[0], y[0]);
			}
		});
		
		
		for(int i = 0 ; i<n ; i++) {
			bw.write(xy[i][0] + " " + xy[i][1]+"\n");
		}
		
		bw.flush();
		bw.close();
		
	}

}
