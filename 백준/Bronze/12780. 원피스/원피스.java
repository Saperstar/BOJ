import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String H = br.readLine();
		String N = br.readLine();
		int ans = 0;
		for(int i = 0; i <= H.length() - N.length(); i++) {
			int combo = 0;
			int t = i;
			for(int k = 0; k < N.length(); k++) {
				if(N.charAt(k) != H.charAt(t)) {
					combo = -1;
					break;
				}
				t++;
			}
			if(combo == 0) ans++;
		}
		bw.write(ans + "");
		bw.flush();
			

	}

}
