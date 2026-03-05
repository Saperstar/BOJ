import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int ans, peo;
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			ans = 0;
			peo = 0;
			int M = Integer.parseInt(br.readLine());
			for(int k = 0; k < M; k++) {
				String line = br.readLine();
				if(line == null) break;
				String[] lines = line.split("\\s+");
				peo = peo + Integer.parseInt(lines[0]) - Integer.parseInt(lines[1]);
				if(peo < ans) ans = peo;
			}
			ans *= -1;
			bw.write(ans + "\n");
		}
		bw.flush();
		
		
	}

}

