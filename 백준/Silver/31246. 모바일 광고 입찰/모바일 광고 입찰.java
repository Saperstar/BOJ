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
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);
		int nakchal = 0;
		int ans = 0;
		int[] dist = new int[N];
		int[][] list = new int[N][2];
		for(int i = 0; i < N; i++) {
			line = br.readLine().split(" ");
			list[i][0] = Integer.parseInt(line[0]);
			list[i][1] = Integer.parseInt(line[1]);
			dist[i] = list[i][0] - list[i][1];
			if(dist[i] >= 0) nakchal++;
		}
		if(K > nakchal) {
			Arrays.sort(dist);
			for(int i = N-1; i >= 0; i--) {
				if(K <= nakchal) {
					break;
				}
				if(dist[i] < 0) {
					ans = Math.abs(dist[i]);
					nakchal++;
				}
			}
		}
		bw.write(ans + "");
		bw.flush();
	}

}