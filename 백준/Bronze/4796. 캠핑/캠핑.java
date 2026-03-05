import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int order = 0;
		while(true) {
			int ans = 0;
			order++;
			String[] line = br.readLine().split(" ");
			int L = Integer.parseInt(line[0]);
			int P = Integer.parseInt(line[1]);
			int V = Integer.parseInt(line[2]);
			if(L == 0 && P == 0 && V == 0) break;
			
			int howMul = V / P;
			ans += L * howMul;
			int howPer = V % P;
			if(howPer > L) {
				ans += L;
			} else {
				ans += howPer;
			}
			bw.write("Case " + order + ": " + ans + "\n");
		}
		bw.flush();
		
		
		
		
	}

}
