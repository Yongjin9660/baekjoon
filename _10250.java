

import java.util.Scanner;

public class _10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		int[] h = new int[testcase];
		int[] w = new int[testcase];
		int[] n = new int[testcase];
		
		int[] flour = new int[testcase];
		int[] room = new int[testcase];
		
		for(int i=0 ; i<testcase ; i++) {
			h[i]=sc.nextInt();
			w[i]=sc.nextInt();
			n[i]=sc.nextInt();
					
			flour[i] = n[i] % h[i];
			if(flour[i]==0) flour[i]=h[i];
			
			room[i]= n[i]/h[i]+1;
			if(n[i]%h[i]==0) room[i]-=1;
		}
		
		for(int i=0 ; i<testcase ; i++) {
			System.out.println(flour[i]*100+room[i]);
		}
		
	}

}
