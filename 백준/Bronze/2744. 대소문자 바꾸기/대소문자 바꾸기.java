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
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) >= 97) {
				bw.write(line.charAt(i)-32);
			} else {
				bw.write(line.charAt(i)+32);
			}
		}
		bw.flush();

	}



}
