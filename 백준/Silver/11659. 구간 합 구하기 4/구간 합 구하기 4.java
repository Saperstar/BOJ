import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		int[] num = new int[N];
		int[] hap = new int[N];
		line = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(line[i]);
		}
		hap[0] = num[0];
		for(int i = 1; i < N; i++) {
			hap[i] = num[i] + hap[i-1];
		}
		for(int i = 0; i < M; i++) {
			int ans = 0;
			line = br.readLine().split(" ");
			int start = Integer.parseInt(line[0]) - 1;
			int end = Integer.parseInt(line[1]) - 1;
			if(start == end) ans = num[start];
			else if(start == 0) {
				ans = hap[end];
			}
			else {
				ans = hap[end] - hap[start - 1];
			}
			bw.write(ans + "\n");
			
		}
		bw.flush();
		
		
		
		
	}
		

}
