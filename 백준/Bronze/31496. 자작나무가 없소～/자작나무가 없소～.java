import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		String S = line[1];
		int ans = 0;
		for(int i = 0; i < N; i++) {
			boolean isThis = false;
			line = br.readLine().split(" ");
			String[] word = line[0].split("_");
			for(int k = 0; k < word.length; k++) {
				if(word[k].equals(S)) isThis = true;
			}
			if(isThis) ans += Integer.parseInt(line[1]);
		}
		bw.write(ans + "");
		bw.flush();
		
		

	}
	
}
