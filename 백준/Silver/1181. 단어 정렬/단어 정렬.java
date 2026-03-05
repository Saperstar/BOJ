import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		String[][] line = new String[num][2];
		for(int i = 0; i < num; i++) {
			line[i][0] = br.readLine();
			line[i][1] = String.valueOf(line[i][0].length());
		}
		Arrays.sort(line, Comparator.comparingInt((String[] a) -> Integer.parseInt(a[1])).thenComparing(a -> a[0]));
		
		for(int i = 0; i < num; i++) {
			if(i > 0 && line[i][0].equals(line[i-1][0])) continue;
			bw.write(line[i][0]);
			bw.newLine();
		}
		bw.flush();
		
		

	}

}
