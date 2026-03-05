import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static int[] ball = new int[4];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line[] = br.readLine().split(" ");
		int n1 = Integer.parseInt(line[0]);
		int k1 = Integer.parseInt(line[1]);
		int n2 = Integer.parseInt(line[2]);
		int k2 = Integer.parseInt(line[3]);
		
		bw.write(n1*k1 + n2*k2 + "");
		bw.flush();
		

	}

}
