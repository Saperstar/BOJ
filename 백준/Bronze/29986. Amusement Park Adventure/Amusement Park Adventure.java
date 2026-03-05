import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line[] = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);		
		int H = Integer.parseInt(line[1]);
		int ans = 0;
		String lines[] = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			int minH = Integer.parseInt(lines[i]);
			if(H >= minH) ans++;
		}
		bw.write(ans + "");
		bw.flush();

	}

}
