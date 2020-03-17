

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class movie_1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int num = 666;
		int cnt=0;
		while(true) {
			
			
			String temp = Integer.toString(num);
			
			if(temp.contains("666"))
				cnt++;
			
			if(cnt == n)
				break;
			
			num++;
		}
		
		System.out.println(num);
		
	}

}
