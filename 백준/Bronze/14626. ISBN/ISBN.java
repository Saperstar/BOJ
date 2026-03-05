import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String ISBN = br.readLine();
		String[] line = new String[13];
		int broken = 0;
		int sum = 0;
		for(int i = 0; i < 13; i++) {
			line[i] = String.valueOf(ISBN.charAt(i));
			if(String.valueOf(ISBN.charAt(i)).equals("*")) broken = i;
		}
		for(int i = 0; i < 13; i++) {
			if(i == broken) continue;
			else if(i == 12) sum += Integer.parseInt(line[i]);
			else if(i % 2 == 0) sum += Integer.parseInt(line[i]);
			else if(i % 2 == 1) sum += 3 * Integer.parseInt(line[i]);
		}
		if(broken % 2 == 0) {
			bw.write(10 - (sum % 10) + " ");
		}
		if(broken % 2 == 1) {
			bw.write((7 * (10 - (sum % 10)) % 10) % 10 + " ");
		}
		bw.flush();

	}

}
