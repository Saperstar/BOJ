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
		for(int i = 0; i < N + 2; i++) {
			if(i == 0 || i == N + 1) {
				for(int k = 0; k < N + 2; k++) {
					bw.write("@");
				}
			} else {
				bw.write("@");
				for(int k = 0; k < N; k++) {
					bw.write(" ");
				}
				bw.write("@");
			}
			bw.write("\n");
		}
		
		
		bw.flush();
	}

}