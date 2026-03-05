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
		int N = Integer.parseInt(br.readLine());
		int[][] points = new int[N][2];
		for(int i = 0; i < N; i++) {
			String line = br.readLine();
			String[] lines = line.split(" ");
			points[i][0] = Integer.parseInt(lines[0]);
			points[i][1] = Integer.parseInt(lines[1]);
			
		}
		
		Arrays.sort(points, (a, b) -> {
			int x1 = a[0];
			int x2 = b[0];
			int y1 = a[1];
			int y2 = b[1];
			if(x1 != x2) {
				return x1 - x2; 
			}
			else {
				return y1 - y2;
			}
		});
		
		for(int i = 0; i < N; i++) {
			bw.write(points[i][0] + " " + points[i][1] + "\n");
		}
		
		bw.flush();
		

	}

}
	
