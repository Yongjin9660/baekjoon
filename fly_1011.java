

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class fly_1011 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int testcase = Integer.parseInt(st.nextToken());
		
		long[] result = new long[testcase];
		
		for(int i=0 ; i<testcase ; i++) {
			
			st = new StringTokenizer(br.readLine());
			long x = Long.parseLong(st.nextToken());
			long y = Long.parseLong(st.nextToken());
			long len = y-x;
			
			long now = len;
			long temp = 1;
			long real=0;
			
			if(now == 1) 
				result[i] = 1;
			else if(now == 2) 
				result[i] = 2;
			else if(now == 3 ) 
				result[i] = 3;
			else {
				while(true) {
					if(now == 0) 
						break;
					else if(now == 1 && temp-2 == real) {
						result[i]++;
						break;
					}
					
					real = temp -1;
					
					if(now >= temp*2) {
						now = now - temp*2;
						temp++;
						result[i] += 2;
						continue;
					}
					else {
						if( Math.abs(real - now) <= 1 ) {
							result[i]++;
							break;
						}
						else if(now - real*2 <= 1 ) {
							result[i] += 2;
							break;
						}
					}
				}
			}
			
		}
		
		for(long i : result) 
			bw.write(Long.toString(i)+"\n");
		
		br.close();
		bw.close();
		
	}

}
