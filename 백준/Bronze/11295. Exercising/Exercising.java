import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int user = 0;
		double L = Double.parseDouble(br.readLine());
		while(L != 0) {
			user++;
			bw.write("User " + user + "\n");
			int N = Integer.parseInt(br.readLine());
			double[] Ns = new double[N];
			for(int i = 0; i < N; i++) {
				Ns[i] = Double.parseDouble(br.readLine());
				bw.write(String.format("%.5f", Ns[i] * (L/100000)) + "\n");
			}
			L = Double.parseDouble(br.readLine());
		}
		bw.flush();
		

	}
	
}
