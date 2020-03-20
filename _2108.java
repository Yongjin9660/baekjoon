

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) 
			arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		
		int sum=0;
		for(int i:arr)
			sum+=i;
		
		System.out.println(Math.round((double)sum/(double)n));
		
		System.out.println(arr[n/2]);
		
		
		int[] num = new int[8001];
		
		
		for(int i : arr) {
			if(i==0) num[4000]++;
			else if(i<0) num[4000+i]++;
			else num[i+4000]++;
		}
		
		int max=-1;
		
		for(int i = 0 ; i < 8001 ; i++) {
			if(num[i] == 0) continue;
			else { 
				if(num[i] > max) 
					max = num[i];
			}
		}
		
		int cnt=0;
		
		for(int i = 0 ; i < 8001 ; i++) {
			if(num[i] == 0) continue;
			else {
				if(num[i] == max) 
					cnt++;
			}
		}
		
		int temp=0;
		
		if(cnt==1) {
			for(int i = 0 ; i < 8001 ; i++) {
				if(num[i] == 0) continue;
				else {
					if(num[i] == max) {
						if(i==4000) System.out.println("0");
						else if(i < 4000) System.out.println(-4000+i);
						else System.out.println(i-4000);
					}
				}
						
			}
		}else {
			for(int i = 0 ; i < 8001 ; i++) {
				if(num[i] == 0) continue;
				else {
					if(num[i] == max  && temp == 0) {
						temp++;
					}
					else if(num[i] == max  && temp != 0) {
						if(i==4000) System.out.println("0");
						else if(i<4000) System.out.println(-4000+i);
						else System.out.println(i-4000);
						break;
					}
				}
						
			}
		}
		
		System.out.println(arr[n-1] - arr[0]);
	}

}
