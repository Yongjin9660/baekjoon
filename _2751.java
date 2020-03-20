

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class _2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		ArrayList<Integer> data = new ArrayList<Integer>();
		for(int i=0;i<testcase;i++)
			data.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(data);
		
		for(int i=0;i<testcase;i++)
			System.out.println(data.get(i));
	}

}
