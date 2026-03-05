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
		line = br.readLine();
		lines = line.split(" ");
		
		int C = Integer.parseInt(lines[0]);
		int D = Integer.parseInt(lines[1]);
		
		if(A + D > B + C) {
			bw.write("Persepolis");
		}
		else if(A + D < B + C) {
			bw.write("Esteghlal");
		}
		else {
			if(B > D) {
				bw.write("Esteghlal");
			}
			else if(B < D) {
				bw.write("Persepolis");
			}
			else {
				bw.write("Penalty");
			}
		}
		bw.flush();
		
		
	}

}
