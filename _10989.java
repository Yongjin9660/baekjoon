

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class _10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) 
			arr[i] = Integer.parseInt(br.readLine());
		
		int max=-1;
		
		for(int i : arr)
			if(i>max) 
				max=i;
		
		int[] c = new int[max+1];
		
		Arrays.fill(c, 0);
		
		for(int i : arr) 
			c[i]++;
		
		for(int i=0 ; i < max ;i++) 
			c[i+1] += c[i];
		
		int[] result = new int[n];
		
		for(int i = n-1 ; i>=0 ; i--) {
			c[arr[i]]--;
			int pos = c[arr[i]];
			result[pos] = arr[i];
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i : result) {
			bw.write(i+"\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}

}
