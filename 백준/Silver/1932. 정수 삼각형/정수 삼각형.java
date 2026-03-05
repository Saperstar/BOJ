import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++) {
		    	for(int k = 0; k < n; k++) {
		    		map[i][k] = -1;
		    		dp[i][k] = -1;
		    	}
        }
        
        for(int i = 0; i < n; i++) {
        		String[] line = br.readLine().split(" ");
        		for(int k = 0; k <= i; k++) {
        			map[i][k] = Integer.parseInt(line[k]);
        		}
        }
        dp[0][0] = map[0][0];
        for (int i = 1; i < n; i++) {
            for (int k = 0; k <= i; k++) {
                if (k == 0) {
                    dp[i][k] = dp[i-1][k] + map[i][k];
                } else if (k == i) {
                    dp[i][k] = dp[i-1][k-1] + map[i][k];
                } else {
                    dp[i][k] = Math.max(dp[i-1][k-1], dp[i-1][k]) + map[i][k];
                }
            }
        }

        
        int ans = 0;
        for(int i : dp[n-1]) {
        		if(ans < i) ans = i;
        }
        bw.write(ans + "");
        
        bw.flush();
    }

}