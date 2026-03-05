import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int hour = 0, min = 0, sec = 0;
			String[] line = br.readLine().split(" ");
			double M = Double.parseDouble(line[0]);
			double A = Double.parseDouble(line[1]);
			double B = Double.parseDouble(line[2]);
			if(Double.compare(M, 0) == 0 && Double.compare(A, 0) == 0 && Double.compare(B, 0) == 0) break;
			double timeA = M / A;
			double timeB = M / B;
			double timeDif = Math.abs(timeA - timeB);
			while(timeDif >= 1) {
				hour++;
				timeDif--;
			}
			timeDif *= 60;
			while(timeDif >= 1) {
				min++;
				timeDif--;
			}
			timeDif = Math.round(timeDif * 60);
			sec = (int)timeDif;
			bw.write(hour + ":" + String.format("%02d", min) + ":" + String.format("%02d", sec) + "\n");
		}
		bw.flush();
			

	}

}
