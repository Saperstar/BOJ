import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		long[] xy = new long[2];
		
		
		for(int i = 0; i < N; i++) {
			long m = Long.parseLong(br.readLine());
			xy = cal(m);
			bw.write(xy[0] + " " + xy[1] + "\n");
			
		}
		
		bw.flush();
		
		

	}
	
	public static long[] cal(long m) {
		long[] xy = new long[2];
		for(int x = 0; x < 60; x++) {
			for(int y = 0; y < 60; y++) {
				if((1L << x) + (1L << y) == m) {
					xy[0] = x;
					xy[1] = y;
					return xy;
				}
			}
		}
		
		return xy;
	}

}
