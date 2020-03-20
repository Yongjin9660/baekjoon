

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int[] a = new int[N+1];
		
		Arrays.fill(a, 0);
		a[1] = 1;  				//소수이면 0 소수가 아니면 1
		 
		for(int i=2 ; i<= N ; i++) 
			for(int j=2 ; i*j <= N ; j++)
				a[i*j]=1;
		
		for(int i = M ; i<=N;i++)
			if(a[i] != 1)
				System.out.println(i);
		
		br.close();
		
		
	}
}
