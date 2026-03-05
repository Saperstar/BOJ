import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int X = Integer.parseInt(br.readLine());
		while(X != 0) {
			boolean garo = true;
			int a = 0, b = 0;
			String line = br.readLine();
			char[][] encrypt = new char[X][(int) Math.ceil(((double)line.length() / (double)X))];
			for(int i = 0; i < line.length(); i++) {
				if(garo) {
					encrypt[a][b] = line.charAt(i);
					a++;
					if(a == X) {
						b++;
						garo = false;
						a--;
					}
				} else {
					encrypt[a][b] = line.charAt(i);
					a--;
					if(a == -1) {
						b++;
						garo = true;
						a++;
					}
				}
				
			}
			for(int t = 0; t < X; t++) {
				for(int k = 0; k < (int) Math.ceil(((double)line.length() / (double)X)); k++) {
					bw.write(encrypt[t][k] + "");
				}
			}
			bw.write("\n");
			X = Integer.parseInt(br.readLine());
		}
		bw.flush();
	}
	
}
