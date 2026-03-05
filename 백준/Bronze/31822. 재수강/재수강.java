import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int ans = 0;
		String retry = br.readLine();
		int N = Integer.parseInt(br.readLine());
		String[] subjects = new String[N];
		for(int i = 0; i < N; i++) {
			subjects[i] = br.readLine();
		}
		for(int i = 0; i < N; i++) {
			int correct = 0;
			for(int k = 0; k < 5; k++) {
				if(subjects[i].charAt(k) == retry.charAt(k)) correct++;
			}
			if(correct == 5) ans++;
		}
		
		bw.write(ans + "");
		bw.flush();
		
		
		

	}

}
