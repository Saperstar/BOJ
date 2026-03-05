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
		int N = Integer.parseInt(br.readLine());
		double[] grades = new double[N];
		for(int i = 0; i < N; i++) {
			grades[i] = Double.parseDouble(br.readLine());
		}
		Arrays.sort(grades);
		for(int i = 0; i < 7; i++) {
			bw.write(String.format("%.3f",grades[i]) + "\n");
		}
		bw.flush();
		
		
		
	}
}
