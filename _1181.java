

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=0;i<n;i++) {
			String temp = br.readLine();
			if(!arr.contains(temp )) 
				arr.add(temp);
		}
		
		Collections.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				if(a.length() == b.length()) {
					a.compareTo(b);
				}
				
				return Integer.compare(a.length(), b.length());
			}
			
		});
		
		
		for(String a : arr)
			System.out.println(a);
		
	}

}
