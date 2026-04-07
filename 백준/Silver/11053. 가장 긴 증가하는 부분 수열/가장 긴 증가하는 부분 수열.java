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
		String[] line = br.readLine().split(" ");
		int dp[] = new int[N];
		int[] nums = new int[N];
		for(int i = 0; i < N; i++) {
			dp[i] = 1;
			nums[i] = Integer.parseInt(line[i]);
		}
		
		for(int i = 1; i < N; i++) {
			for(int k = i; k >= 0; k--) {
				if(dp[k] >= dp[i]) if(nums[k] < nums[i]) dp[i] = dp[k] + 1;
			}
		}
		
		int ans = 0;
		for(int i : dp) if(i > ans) ans = i;
		bw.write(ans + "");
		bw.flush();
		
		
	}
}
