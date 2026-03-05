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
        int[][] dp1 = new int[N][3];
        int[][] dp2 = new int[N][3];
        int[][] dp3 = new int[N][3];
        if(N == 2) {
	        	String[] line = br.readLine().split(" ");
        		price[0][0] = Integer.parseInt(line[0]);
        		price[0][1] = Integer.parseInt(line[1]);
	        	line = br.readLine().split(" ");
	        	price[1][0] = Integer.parseInt(line[0]);
	        	price[1][1] = Integer.parseInt(line[1]);
	        	int tlqkf = Math.max(price[0][1] + price[1][0], price[1][0] + price[0][1]);
	        	bw.write(tlqkf + "");
	        	bw.flush();
	        	return;
        }
        for(int i = 0; i < N; i++) {
        		String[] line = br.readLine().split(" ");
        		for(int k = 0; k < 3; k++) price[i][k] = Integer.parseInt(line[k]);
        }
        dp1[0][0] = price[0][0];
        dp1[0][1] = 10000000;
        dp1[0][2] = 10000000;
        for(int i = 1; i < N-1; i++) {
        		dp1[i][0] = Math.min(dp1[i-1][1], dp1[i-1][2]) + price[i][0];
        		dp1[i][1] = Math.min(dp1[i-1][0], dp1[i-1][2]) + price[i][1];
        		dp1[i][2] = Math.min(dp1[i-1][0], dp1[i-1][1]) + price[i][2];
        }
        dp1[N-1][0] = 10000000;
    		dp1[N-1][1] = Math.min(dp1[N-2][0], dp1[N-2][2]) + price[N-1][1];
    		dp1[N-1][2] = Math.min(dp1[N-2][0], dp1[N-2][1]) + price[N-1][2];
        int ans1 = Math.min(dp1[N-1][0], Math.min(dp1[N-1][1], dp1[N-1][2]));
        
        dp2[0][0] = 10000000;
        dp2[0][1] = price[0][1];
        dp2[0][2] = 10000000;
        for(int i = 1; i < N; i++) {
	        	dp2[i][0] = Math.min(dp2[i-1][1], dp2[i-1][2]) + price[i][0];
	        	dp2[i][1] = Math.min(dp2[i-1][0], dp2[i-1][2]) + price[i][1];
	        	dp2[i][2] = Math.min(dp2[i-1][0], dp2[i-1][1]) + price[i][2];
        }
        dp2[N-1][1] = 10000000;
		dp2[N-1][2] = Math.min(dp2[N-2][0], dp2[N-2][1]) + price[N-1][2];
		dp2[N-1][0] = Math.min(dp2[N-2][1], dp2[N-2][2]) + price[N-1][0];
        int ans2 = Math.min(dp2[N-1][0], Math.min(dp2[N-1][1], dp2[N-1][2]));
        
        dp3[0][0] = 10000000;
        dp3[0][1] = 10000000;
        dp3[0][2] = price[0][2];
        for(int i = 1; i < N; i++) {
	        	dp3[i][0] = Math.min(dp3[i-1][1], dp3[i-1][2]) + price[i][0];
	        	dp3[i][1] = Math.min(dp3[i-1][0], dp3[i-1][2]) + price[i][1];
	        	dp3[i][2] = Math.min(dp3[i-1][0], dp3[i-1][1]) + price[i][2];
        }
        dp3[N-1][2] = 10000000;
        dp3[N-1][0] = Math.min(dp3[N-2][1], dp3[N-2][2]) + price[N-1][0];
        dp3[N-1][1] = Math.min(dp3[N-2][0], dp3[N-2][2]) + price[N-1][1];
        int ans3 = Math.min(dp3[N-1][0], Math.min(dp3[N-1][1], dp3[N-1][2]));
        
        int ans = Math.min(ans1, Math.min(ans2, ans3));
        bw.write(ans + "");
        
        
        bw.flush();
    }

}
