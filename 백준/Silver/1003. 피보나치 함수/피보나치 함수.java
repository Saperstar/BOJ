import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int[][] ans = new int[41][2];
		ans[0][0] = 1;
		ans[0][1] = 0;
		ans[1][0] = 0;
		ans[1][1] = 1;
		for(int i = 2; i <= 40; i++) {
			ans[i][0] = ans[i-1][0] + ans[i-2][0];
			ans[i][1] = ans[i-1][1] + ans[i-2][1];
		}
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			bw.write(ans[N][0] + " " + ans[N][1] + "\n");
		}
		bw.flush();
		

	}

}
