import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int ansA = 0, ansB = 0;
		String line; 
		for(int a = 1; a < 10; a++) {
			bw.write("? A " + a + "\n");
			bw.flush();
			
			line = br.readLine();
			try {
				int resp = Integer.parseInt(line);
				if(resp == 1) {
					ansA = a;
					break;
				}
			} catch (NumberFormatException e) {
					a--;
				}
		}
		for(int b = 1; b < 10; b++) {
			bw.write("? B " + b + "\n");
			bw.flush();
			
			line = br.readLine();
			try {
				int resp = Integer.parseInt(line);
				if(resp == 1) {
					ansB = b;
					break;
				}
			} catch (NumberFormatException e) {
					b--;
				}
		}
		
		bw.write("! " + (ansA + ansB));
		bw.flush();

	}

}
