import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = br.readLine();
		String[] lines = line.split(" ");
		int A = Integer.parseInt(lines[0]);
		int B = Integer.parseInt(lines[1]);
		int C = Integer.parseInt(lines[2]);
		int D = Integer.parseInt(lines[3]);
		int ans = (A + D) - (B + C);
		bw.write(Math.abs(ans) + "");
		bw.flush();
		
		
	}

}
