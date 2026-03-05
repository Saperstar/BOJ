import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		int[] a = new int[N];
		int[] b = new int[M];
		
		line = br.readLine().split(" ");
		long ans = 0;
		for(int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(line[i]);
			ans += a[i];
		}
		line = br.readLine().split(" ");
		for(int i = 0; i < M; i++) {
			b[i] = Integer.parseInt(line[i]);
			if(b[i] != 0) ans *= b[i];
		}
		bw.write(ans + "");
		bw.flush();

	}

}
