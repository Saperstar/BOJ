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
		int[][] dap = new int[1000001][2];
		dap[1][0] = 1;
		dap[1][1] = 0;
		dap[2][1] = 1;
		dap[3][1] = 1;
		for(int i = 2; i <= N; i++) {
			dap[i][0] = i;
			dap[i][1] = dap[i-1][1] + 1;
			if(dap[i][1] > dap[i/2][1] && i%2 == 0) dap[i][1] = dap[i/2][1] + 1;
			if(dap[i][1] > dap[i/3][1] && i%3 == 0) dap[i][1] = dap[i/3][1] + 1;
		}
		bw.write(dap[N][1] + "");
		bw.flush();
			
		
		

	}


}
