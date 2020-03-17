

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class triangle_4153 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int temp = 1;
		while (temp != 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			int[] len = {x,y,z};

			Arrays.sort(len);

			if (x == 0) {
				temp = 0;
				break;
			} else {
				if (Math.pow(len[0], 2) + Math.pow(len[1], 2) == Math.pow(len[2], 2))
					System.out.println("right");
				else
					System.out.println("wrong");
			}
		}
	}

}
