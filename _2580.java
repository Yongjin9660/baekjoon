

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _2580 {

	static int[][] arr = new int[10][10];
	static List<int[]> list;
	static int zero;
	static boolean isEnd;

	private static void dfs(int d) {
		if(isEnd) return;

		if (d == zero) {
			isEnd=true;
			print();
			return;
		}

		int[] xy = list.get(d);
		int x = xy[0];
		int y = xy[1];

		for (int i = 1; i <= 9; i++) {
			if (isPossible(x, y, i)) {
				arr[x][y] = i;
				dfs(d + 1);
				arr[x][y] = 0;
			}
		}
	}

	private static boolean isPossible(int x, int y, int in) {

		for (int i = 1; i <= 9; i++) {
			if (arr[x][i] == in)
				return false;
		}
		for (int i = 1; i <= 9; i++) {
			if (arr[i][y] == in)
				return false;
		}

		int tempX = (x - 1) / 3;
		int tempY = (y - 1) / 3;
		int temp = 0;

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int tempI = (i - 1) / 3;
				int tempJ = (j - 1) / 3;
				if (tempI == tempX && tempJ == tempY)
					if (arr[i][j] == in)
						temp++;
			}
		}
		if (temp != 0)
			return false;

		return true;

	}

	private static void print() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		list = new ArrayList<>();

		for (int i = 1; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < 10; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 0)
					list.add(new int[] { i, j });
			}
		}
		zero = list.size();

		int[] temp = list.get(0);
		int[] temp1 = list.get(1);

		dfs(0);

	}

}
