import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static int[] ball = new int[4];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line[] = br.readLine().split(" ");
		int firWon = Integer.parseInt(line[0]);
		int secWon = Integer.parseInt(line[1]);
		int ans;
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			int useE = Integer.parseInt(br.readLine());
			if(useE > 1000) {
				int over1000 = useE - 1000;
				ans = firWon * 1000 + secWon * over1000;
				bw.write(useE + " " + ans + "\n");
			} else {
				ans = firWon * useE;
				bw.write(useE + " " + ans + "\n");
			}
		}
		bw.flush();
		

	}

}
