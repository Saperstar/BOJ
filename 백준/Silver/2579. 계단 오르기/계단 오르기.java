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
		int[] dp = new int[N];
		int[] grades = new int[N];
		for(int i = 0; i < N; i++) {
			grades[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = grades[0];
		if(N > 1) dp[1] = grades[0] + grades[1];
		else {
			bw.write(dp[0] + "");
			bw.flush();
			return;
		}
		if(N > 2) dp[2] = Math.max(grades[0] + grades[2], grades[1] + grades[2]);
		else {
			bw.write(dp[1] + "");
			bw.flush();
			return;
		}
		
		for(int i = 3; i < N; i++) {
			dp[i] = Math.max(dp[i-2] + grades[i], dp[i-3] + grades[i-1] + grades[i]);
		}
		bw.write(dp[N-1] + "");
		
		bw.flush();
		
		
		
	}
		
}
