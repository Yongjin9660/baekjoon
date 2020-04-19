import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2783 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double x = Double.parseDouble(st.nextToken());
		double y = Double.parseDouble(st.nextToken());
		
		double min = x/y;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			
			min = Math.min(min, a/b);
		}
		System.out.println(min*1000);
		
	}

}
