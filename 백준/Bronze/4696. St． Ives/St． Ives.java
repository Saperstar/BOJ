import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double num = Double.parseDouble(br.readLine());
		while(num != 0) {
			double ans = num*num*num*num + num*num*num + num*num + num + 1;
			bw.write(String.format("%.2f", ans) + "\n");
			
			num = Double.parseDouble(br.readLine());
		}
		bw.flush();
		
		

	}

}
