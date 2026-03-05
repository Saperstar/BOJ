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
        int[][] price = new int[N][3];
        int[][] dp = new int[N][3];
        for(int i = 0; i < N; i++) {
        		String[] line = br.readLine().split(" ");
        		for(int k = 0; k < 3; k++) price[i][k] = Integer.parseInt(line[k]);
        }
        dp[0][0] = price[0][0];
        dp[0][1] = price[0][1];
        dp[0][2] = price[0][2];
        for(int i = 1; i < N; i++) {
        		dp[i	][0] = Math.min(dp[i-1][1], dp[i-1][2]) + price[i][0];
        		dp[i	][1] = Math.min(dp[i-1][0], dp[i-1][2]) + price[i][1];
        		dp[i	][2] = Math.min(dp[i-1][0], dp[i-1][1]) + price[i][2];
        }
        int ans = Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2]));
        bw.write(ans + "");
        
        
        
        bw.flush();
    }

}