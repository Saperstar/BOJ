import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean isCan = true;
		int T = Integer.parseInt(br.readLine());
		int[] ansLines = new int[26];
		int[] lines = new int[26];
		for(int i = 0; i < T; i++) {
			Arrays.fill(ansLines, 0);
			String line = br.readLine();
			for(int k = 0; k < line.length(); k++) {
				ansLines[line.charAt(k) - 'A']++; 
			}
			int W = Integer.parseInt(br.readLine());
			for(int k = 0; k < W; k++) {
				String Q = br.readLine();
				for(int j = 0; j < Q.length(); j++) {
					lines[Q.charAt(j) - 'A']++;
				}
				for(int j = 0; j < 26; j++) {
					if(ansLines[j] < lines[j]) isCan = false;
				}
				if(isCan) bw.write("YES\n");
				else bw.write("NO\n");
				isCan = true;
				Arrays.fill(lines, 0);
			}
		}
		bw.flush();
		
		
		
		
	}

}
