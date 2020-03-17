

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB_1149 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int[][] cost = new int[n+1][3];

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				cost[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=2 ; i<=n;i++) {
			cost[i][0] += Math.min(cost[i-1][1], cost[i-1][2]);
			cost[i][1] += Math.min(cost[i-1][0], cost[i-1][2]);
			cost[i][2] += Math.min(cost[i-1][1], cost[i-1][0]);
		}
		
		int min = Math.min(cost[n][0], cost[n][1]);
		System.out.println(Math.min(min, cost[n][2]));
		

	}

}
