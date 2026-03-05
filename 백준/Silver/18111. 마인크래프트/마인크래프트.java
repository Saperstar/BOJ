import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		int B = Integer.parseInt(line[2]);
		int[][] map = new int[N][M];
		for(int i = 0; i < N; i++) {
			line = br.readLine().split(" ");
			for(int k = 0; k < M; k++) {
				map[i][k] = Integer.parseInt(line[k]);
			}
		}
		int ans = Integer.MAX_VALUE;
		int ansMokpyo = -1;
		for(int mokpyo = 0; mokpyo <= 256; mokpyo++) {
			int broke = 0, blocked = 0, inventory = B;
			for(int i = 0; i < N; i++) {
				for(int k = 0; k < M; k++) {
					if(map[i][k] > mokpyo) {
						broke += map[i][k] - mokpyo;
						inventory += map[i][k] - mokpyo;
					}
					if(map[i][k] < mokpyo) {
						inventory -= mokpyo - map[i][k];
						blocked += mokpyo - map[i][k];
					}
				}
			}
			if(inventory >= 0 && ans >= blocked + (2 * broke)) {
				ans = blocked + (2 * broke);
				ansMokpyo = mokpyo;
			}
		}
		bw.write(ans + " " + ansMokpyo);
		bw.flush();
		
		
	}

}