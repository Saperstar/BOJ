import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0, ans = 0;
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		int[] value = new int[N];
		for(int i = 0; i < N; i++) {
			value[i] = Integer.parseInt(br.readLine());
		}
		int order = N-1;
		while(sum != M) {
			if(sum + value[order] > M) order--;
			else {
				ans++;
				sum += value[order];
			}
		}
		bw.write(ans + "");
		bw.flush();
		

	}

}
