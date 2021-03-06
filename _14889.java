

import java.util.*;
import java.io.*;
 
 
public class _14889 {
	static int n;
	static boolean[] visited;
	static int[][] arr;
	static int min = 987654321;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		
		visited = new boolean[n + 1];
		arr = new int[n + 1][n + 1];

		for (int i = 1; i < n + 1; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < n + 1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		comb(1, 0);
		System.out.println(min);
	}

	static void comb(int start, int depth) {
		if (depth == n / 2) {
			min = Math.min(min, getAbilityDifference());
			return;
		}

		for (int i = start; i < n + 1; i++) {
			if (visited[i] != true) {
				visited[i] = true;
				comb(i + 1, depth + 1);
				visited[i] = false;
			}
		}
	}

	static int getAbilityDifference() {
		int sumStart = 0;
		int sumLink = 0;

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (visited[i] && visited[j])
					sumStart += arr[i][j];

				if (visited[i] != true && visited[j] != true)
					sumLink += arr[i][j];
			}
		}

		return Math.abs(sumStart - sumLink);
	}
}