import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int w = 0, h = 0;
		int rankCal;
		int N;
		String[] arrLine;
		N = Integer.parseInt(br.readLine());
		int[] rank = new int[N];
		int[] arrW = new int[N];
		int[] arrH = new int[N];
		for(int i = 0; i < N; i++) {
			String line = br.readLine();
			arrLine = line.split(" ");
			arrW[i] = Integer.parseInt(arrLine[0]);
			arrH[i] = Integer.parseInt(arrLine[1]);
		}
		for(int i = 0; i < N; i++) {
			rankCal = 1;
			for(int k = 0; k < N; k++) {
				if(arrW[i] < arrW[k] && arrH[i] < arrH[k]) rankCal++;
			}
			rank[i] = rankCal;
		}
		for(int ranks : rank) {
			bw.write(ranks + " ");
		}
		bw.flush();

	}

}
