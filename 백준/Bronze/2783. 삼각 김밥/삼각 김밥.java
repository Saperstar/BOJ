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
		String[] lines = new String[2];
		lines = line.split(" ");
		double best = Double.parseDouble(lines[0]) / Double.parseDouble(lines[1]);
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			line = br.readLine();
			lines = line.split(" ");
			double isBest = Double.parseDouble(lines[0]) / Double.parseDouble(lines[1]);
			if(isBest < best) best = isBest;
			
		}
		double ans = best * 1000;
		bw.write(String.format("%.2f", ans) + "");
		bw.flush();
	}

}

