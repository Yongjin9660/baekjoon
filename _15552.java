

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = Integer.parseInt(bf.readLine());
		
		
		for(int i=0;i<testcase;i++) {
			String ss = bf.readLine();
			StringTokenizer st = new StringTokenizer(ss);
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int sum=a+b;
			bw.write(sum+"\n");
		}
		bw.flush();
	}

}
