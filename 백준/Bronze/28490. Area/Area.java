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
		int[] h = new int[N];
		int[] w = new int[N];
		for(int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			h[i] = Integer.parseInt(line[0]);
			w[i] = Integer.parseInt(line[1]);
		}
		int ans = 0;
		for(int i = 0; i < N; i++) {
			if(ans < h[i] * w[i]) ans = h[i] * w[i];
		}
		bw.write(ans + "");
		bw.flush();
		
		
		

	}

}
