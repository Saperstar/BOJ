import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			int T = Integer.parseInt(br.readLine());
			bw.write(cal(T) + "\n");
		}
		bw.flush();
		
		

	}
	
	public static int cal(int a) {
		int ans = 0;
		for(int i = 0; i < a; i++) {
			ans = (ans * 2) + 1;
		}
		
		return ans;
	}

}
