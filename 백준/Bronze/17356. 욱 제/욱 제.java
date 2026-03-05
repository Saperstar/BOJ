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
		double A = Double.parseDouble(line[0]);
		double B = Double.parseDouble(line[1]);
		double M = (B - A) / 400;
		double ans = 1 / (1 + Math.pow(10, M));
		bw.write(ans + "");
		bw.flush();
		
		

	}

}
