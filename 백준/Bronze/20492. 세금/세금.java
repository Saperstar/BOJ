import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Double N = Double.parseDouble(br.readLine());
		int a = (int) Math.round(N * 0.78);
		int b = (int) Math.round(N * 0.8 + N * 0.2 * 0.78);
		bw.write(a + " " + b);
		bw.flush();
		
		
		
		

	}

}
