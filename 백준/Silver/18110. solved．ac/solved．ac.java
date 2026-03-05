import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0; 
		int N = Integer.parseInt(br.readLine());
		int[] grades = new int[N];
		for(int i = 0; i < N; i++) {
			grades[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(grades);
		double trash = Math.round(Double.valueOf(N) * 0.15); 
		for(int i = (int)trash; i < N - (int)trash; i++) {
			sum += grades[i];
		}
		int ans = (int)Math.round(Double.valueOf(sum) / (Double.valueOf(N) - trash*2));
		bw.write(ans + "");
		bw.flush();
		
		

	}

}
