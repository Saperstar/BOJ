import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int x = 0; x < 10; x++) {
			int ansA = 0, ansB = 0;
			String line; 
			for(int a = 1; a < 10001; a++) {
				bw.write("? A " + a + "\n");
				bw.flush();
				
				if(a == 3586) a++;
				if(a == 7586) a++;
				line = br.readLine();
				try {
					int resp = Integer.parseInt(line);
					if(resp == 1) {
						ansA = a;
						break;
					}
				} catch (NumberFormatException e) {}
			}
			for(int b = 1; b < 10001; b++) {
				bw.write("? B " + b + "\n");
				bw.flush();
				
				if(b == 6325) b++;
				if(b == 8325) b++;
				line = br.readLine();
				try {
					int resp = Integer.parseInt(line);
					if(resp == 1) {
						ansB = b;
						break;
					}
				} catch (NumberFormatException e) {}
			}
			if(ansA == 0) ansA = 3586;
			if(ansB == 0) ansB = 6325;
			
			bw.write("! " + (ansA + ansB) + "\n");
			bw.flush();
			
		}
			
	}
		

}
