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
		int[] dp = new int[N * M]; 
		int[][] maze = new int[N][M];
		for(int i = 0; i < N; i++) {
			line = br.readLine().split(" ");
			for(int k = 0; k < M; k++) {
				maze[i][k] = Integer.parseInt(line[k]);
			}
		}
		dp[0] = maze[0][0];
		for(int i = 1; i < N; i++) {
			dp[i] += dp[i-1] + maze[i][0];
		}
		for(int i = 1; i < M; i++) {
			dp[i*N] += dp[(i-1)*N] + maze[0][i];
		}
		for(int i = 1; i < N; i++) {
			for(int k = 1; k < M; k++) {
				dp[i + N*k] = maze[i][k] + Math.max(dp[i + N*k - 1], dp[i + N*(k-1)]);
			}
		}
		int ans = dp[N * M - 1];
		bw.write(ans + "");
		bw.flush();
		
		
		
		

	}

}
