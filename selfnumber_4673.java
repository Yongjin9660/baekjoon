

import java.util.Arrays;

public class selfnumber_4673 {

	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		Arrays.fill(arr, true);
		int temp;
		
		for(int i=1; i<=10000 ; i++) {
			temp=selfnumber(i);
			if(temp>10000) continue;
			arr[temp]=false;
		}
		
		for(int i=1;i<=10000;i++) {
			if(arr[i]==true) {
				System.out.println(i);
			}
		}
	}
	private static int selfnumber(int i) {
		int sum=i;
		
		while(true) {
			if(i<10) {
				sum+=i;
				break;
			}
			sum = sum+i%10;
			i=i/10;
			
		}
		return sum;
	}

}
