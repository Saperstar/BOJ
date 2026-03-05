import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int ans = 0;
		int N = Integer.parseInt(br.readLine());
		int[][] P = new int[N][2];
		String[] line = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			P[i][0] = i;
			P[i][1] = Integer.parseInt(line[i]);
		}
		Arrays.sort(P, Comparator.comparingInt(a -> a[1]));
		
		for(int i = 0; i < N; i++) {
			for(int k = 0; k <= i; k++) {
				ans += P[k][1];
			}
		}
		bw.write(ans + "");
		bw.flush();
		

	}

}
