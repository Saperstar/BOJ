import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int ans = 0;
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			ans = solve(n);
			bw.write(ans + "\n");
			
		}
		bw.flush();

	}
	
	public static int solve(int a) {
		int[] dp = new int[a + 1];
		if(a == 1) return 1;
		if(a == 2) return 2;
		if(a == 3) return 4;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for(int i = 4; i < (a + 1); i++) {
			dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
		}
		
		
		return dp[a];
	}
}
