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
		double W = Double.parseDouble(line[1]);
		double H = Double.parseDouble(line[2]);
		double length = Math.sqrt(W*W + H*H);
		for(int i = 0; i < N; i++) {
			int input = Integer.parseInt(br.readLine());
			bw.write(input <= length ? "DA\n" : "NE\n");
		}
		bw.flush();
		

	}



}
