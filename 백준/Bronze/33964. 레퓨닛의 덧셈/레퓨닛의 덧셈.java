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
		int X = Integer.parseInt(lines[0]);
		int Y = Integer.parseInt(lines[1]);
		int k = 1;
		int A = 0;
		int B = 0;
		for(int i = 0; i < X; i++) {
			A += 1 * k;
			k *= 10;
		}
		k = 1;
		for(int i = 0; i < Y; i++) {
			B += 1 * k;
			k *= 10;
		}
		bw.write(A + B + "");
		bw.flush();
		
		
	}

}
