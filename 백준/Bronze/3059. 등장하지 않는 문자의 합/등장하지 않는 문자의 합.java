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
		for(int i = 0; i < T; i++) {
			int ans = 0;
			boolean[] check = new boolean[26];
			String line = br.readLine();
			for(int k = 0; k < line.length(); k++) {
				check[line.charAt(k) - 65] = true;
			}
			for(int k = 0; k < 26; k++) {
				if(check[k] == false) ans += k+65;
			}
			bw.write(ans + "\n");
		}
		bw.flush();
		

	}

}
