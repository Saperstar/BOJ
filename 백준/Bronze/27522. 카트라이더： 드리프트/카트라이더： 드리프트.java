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
		double[] recordTime = new double[8];
		String[] recordTeam = new String[8];
		String[][] record = new String[8][2];
		int blue = 0, red = 0;
		int[] score = {10, 8, 6, 5, 4, 3, 2, 1};
		for(int i = 0; i < 8; i++) {
			String input = br.readLine();
			String[] line = input.split(" ");
			String[] recordCal = line[0].split(":");
			recordTime[i] = 60 * Double.parseDouble(recordCal[0])
					+ Double.parseDouble(recordCal[1])
					+ Double.parseDouble(recordCal[2]) / 1000;
			recordTeam[i] = line[1];
			record[i][0] = String.valueOf(recordTime[i]);
			record[i][1] = recordTeam[i];
		}
		
		Arrays.sort(record, (a, b) -> {
		    double timeA = Double.parseDouble(a[0]);
		    double timeB = Double.parseDouble(b[0]);
		    return Double.compare(timeA, timeB);
		});

		for (int i = 0; i < 8; i++) {
		    if(record[i][1].equals("B")) blue += score[i];
	    	if(record[i][1].equals("R")) red += score[i];
		}
		if(blue > red) bw.write("Blue");
		if(blue < red) bw.write("Red");
		
		bw.flush();
		
		
	}

}
