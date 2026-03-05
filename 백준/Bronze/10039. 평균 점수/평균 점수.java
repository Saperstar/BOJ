import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int avg = 0, total = 0;
		for(int i = 0; i < 5; i++) {
			int input = Integer.parseInt(br.readLine());
			if(input <= 40) {
				input = 40;
			}
			total += input;
		}
		avg = total/5;
		
		
		bw.write(String.valueOf(avg));
		bw.newLine();
		bw.close();
	}

}