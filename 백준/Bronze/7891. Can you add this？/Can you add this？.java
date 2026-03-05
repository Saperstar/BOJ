import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N;
		N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			String line = br.readLine();
			String[] lines;
			lines = line.split(" ");
			BigInteger a = new BigInteger(lines[0]);
			BigInteger b = new BigInteger(lines[1]);
			BigInteger sum = a.add(b);
			bw.write(String.valueOf(sum) + "\n");
		}
		bw.flush();
	}

}
