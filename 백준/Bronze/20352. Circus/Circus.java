import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double a = Double.parseDouble(br.readLine());
		double ans = (2 * Math.sqrt(a)) * Math.sqrt(Math.PI);
		bw.write(ans + "");
		bw.flush();
		

	}

}
