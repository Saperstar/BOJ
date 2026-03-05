import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int pan[][] = new int[9][9];
		int max = 0;
		int maxPosX = 0;
		int maxPosY = 0;
		for(int i = 0; i < 9; i++) {
			String line[] = br.readLine().split(" ");
			for(int k = 0; k < 9; k++) {
				pan[k][i] = Integer.parseInt(line[k]);
				if(pan[k][i] >= max) {
					max = pan[k][i];
					maxPosY = i+1;
					maxPosX = k+1;
				}
			}
		}
		bw.write(max + "\n" + maxPosY + " "	+ maxPosX);
		bw.flush();

	}

}
