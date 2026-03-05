import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int hour = 0, min = 0, sec = 0;
		boolean[] time = new boolean[86400];
		int c = Integer.parseInt(line[0]);
		int h = Integer.parseInt(line[1]);
		int[] cS = new int[c];
		int[] hS = new int[h];
		for(int i = 0; i < c; i++) {
			line = br.readLine().split(":");
			hour = Integer.parseInt(line[0]);
			min = Integer.parseInt(line[1]);
			sec = Integer.parseInt(line[2]);
			cS[i] = sec + 60*min + 60*60*hour;
		}
		for(int i = 0; i < h; i++) {
			line = br.readLine().split(":");
			hour = Integer.parseInt(line[0]);
			min = Integer.parseInt(line[1]);
			sec = Integer.parseInt(line[2]);
			hS[i] = sec + 60*min + 60*60*hour;
		}
		for(int i = 0; i < c; i++) {
			for(int k = cS[i]; k < cS[i] + 40; k++) {
				time[k] = true;
			}
		}
		for(int i = 0; i < h; i++) {
			for(int k = hS[i]; k < hS[i] + 40; k++) {
				time[k] = true;
			}
		}
		int ans = 86400;
		for(int i = 0; i < 86400; i++) {
			if(time[i]) ans--;
		}
		bw.write(ans + "");
		bw.flush();
		
		

	}


}
