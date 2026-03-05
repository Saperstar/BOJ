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
		int P = Integer.parseInt(line[0]);
		int C = Integer.parseInt(line[1]);
		
		if(P > C) {
			bw.write(C * 2 + 1 + "");
		} else {
			bw.write(P * 2 - 1 + "");
		}
		bw.flush();
		
	}

}
