import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			boolean isCan = true;
			double[][] points = new double[4][2];
			for(int k = 0; k < 4; k++) {
				String[] line = br.readLine().split(" ");
				points[k][0] = Double.parseDouble(line[0]);
				points[k][1] = Integer.parseInt(line[1]);
			}

			double[] dis4 = new double[6];
			int dummy = 0;
			for(int a = 0; a < 4; a++) {
				for(int b = 0; b < 4; b++) {
					if(a < b) {
						dis4[dummy] = distance(points[a][0], points[a][1], points[b][0], points[b][1]);
						dummy++;
					}
				}
			}
			Arrays.sort(dis4);
			int good = 0;
			if(Double.compare(dis4[0], dis4[1]) == 0 && Double.compare(dis4[1], dis4[2]) == 0 && Double.compare(dis4[2], dis4[3]) == 0) {
				if(Double.compare(dis4[4], dis4[5]) == 0 && Double.compare(dis4[4], dis4[0] * 2) == 0) {
					good = 1;
				}
			}
			if(good == 0) isCan = false;
			
			String ans = (isCan ? "1" : "0");
			bw.write(ans + "\n");
		}
		bw.flush();

	}
	
	public static double distance(double A, double B, double C, double D) {
		double di1, di2;
		di1 = Math.pow(C - A, 2);
		di2 = Math.pow(D - B, 2);
		return di1 + di2;
	}


}
