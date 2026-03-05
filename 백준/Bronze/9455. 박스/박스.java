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
		for(int X = 0; X < T; X++) {
			String[] line = br.readLine().split(" ");
			int m = Integer.parseInt(line[0]);
			int n = Integer.parseInt(line[1]);
			int[][] box = new int[m][n];
			int ans = 0;
			
			for(int i = 0; i < m; i++) {
				line = br.readLine().split(" ");
				for(int k = 0; k < n; k++) {
					box[i][k] = Integer.parseInt(line[k]);
				}
			}
			
			for(int k = 0; k < n; k++) {
				for(int i = 0; i < m; i++) {
					if(box[i][k] == 1) {
						for(int j = m-1; j > i; j--) {
							if(box[j][k] == 0) {
								ans += j - i;
								box[j][k] = 1;
								break;
							}
						}
					}
				}
			}
			bw.write(ans + "\n");
		}
		bw.flush();
		

	}

}
