

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class one_1463 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int temp;
		boolean check = false;
		int result=0;
		
		while(n != 1) {
			if(n%2 != 0 && n%3 != 0)
				n--;
			else if(n%3 == 0)
				n/=3;
			else {
				temp = n-1;
				for(int i = 2 ; i < 15 ; i++) {
					if(Math.pow(3,i) == temp){
						check = true;
						break;
					}
				}
				if(check) n--;
				else n/=2;
			}
			result++;
		}
		
		System.out.println(result);
	}

}
