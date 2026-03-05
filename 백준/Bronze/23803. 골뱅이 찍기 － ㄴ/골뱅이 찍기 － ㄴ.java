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
		for(int i = 0; i < N * 4; i++) {
			for(int k = 0; k < N; k++) {
				bw.write("@");
			}
			bw.write("\n");
		}
		for(int i = 0; i < N; i++) {
			for(int k = 0; k < N * 5; k++) {
				bw.write("@");
			}
			bw.write("\n");
		}
		bw.flush();
		
	}
	
}
