

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14888 {

	static int n;
	static int number[];
	static char operator[];
	static boolean visit[];
	static int je = 0;
	static char after[];
	
	static long max = -100000;
	static long min = 1000000;
	
	private static void make(int d) {
		if(d == n-1) {
			check();
			return;
		}
		
		for (int i = 0; i < n - 1; i++) {
			if(!visit[i]) {
				visit[i] = true;
				after[d] = operator[i];
				make(d+1);
				visit[i] = false;
			}
		}

	}
	
	private static void check() {
		long temp = number[0];
		int j=0;
		
		for(int i=1 ; i < n ; i++) {
			
			if(after[j] == '+')
				temp += number[i];
			else if(after[j] == '-')
				temp -= number[i];
			else if(after[j] == '*')
				temp *= number[i];
			else
				temp /= number[i];
			j++;
			
		}
		
		if(max < temp) max = temp;
		if(min > temp) min = temp;
		
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		number = new int[n];
		operator = new char[n - 1];
		visit = new boolean[n-1];
		after = new char[n-1];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < 4; i++) {
			int temp = Integer.parseInt(st.nextToken());
			while (je != n - 1 && temp > 0) {
				if (i == 0)
					operator[je] = '+';
				else if (i == 1)
					operator[je] = '-';
				else if (i == 2)
					operator[je] = '*';
				else
					operator[je] = '/';
				je++;
				temp--;
			}
		}
		
		make(0);
		
		System.out.println(max);
		System.out.println(min);
	}

}
