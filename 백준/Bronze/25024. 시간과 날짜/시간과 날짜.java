import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			String[] line = br.readLine().split(" ");
			int f = Integer.parseInt(line[0]);
			int s = Integer.parseInt(line[1]);
			if(f < 24 && s < 60) bw.write("Yes ");
			else bw.write("No ");
			if(f < 13) {
				if(f == 1 || f == 3 || f == 5 || f == 7 || f == 8 || f == 10 || f == 12) {
					if(s < 32 && s != 0) bw.write("Yes\n");
					else bw.write("No\n");
				} else if(f == 4 || f == 6 || f == 9 || f == 11) {
					if(s < 31 && s != 0) bw.write("Yes\n");
					else bw.write("No\n");
				} else if(f == 2) {
					if(s < 30 && s != 0) bw.write("Yes\n");
					else bw.write("No\n");
				} else bw.write("No\n");
			} else bw.write("No\n");
		}
		bw.flush();
		
		
	}
}
