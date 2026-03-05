import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < 3; i++) {
			String line = br.readLine();
		}
		for(int a = 1; a < 11; a++) {
			for(int b = 1; b < 11; b++) {
				for(int c = 1; c < 11; c++) {
					for(int d = 1; d < 11; d++) {
						bw.write("-1\n");
					}
				}
			}
		}
		bw.flush();
		

	}



}
