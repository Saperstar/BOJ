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
		String[] line = br.readLine().split(" ");
		int[] S = new int[N];
		for(int i = 0; i < N; i++) {
			S[i] = Integer.parseInt(line[i]);
		}
		if(N == 1) {
			bw.write("1");
			bw.flush();
			return;
		}
		if(N == 2) {
			bw.write("2");
			bw.flush();
			return;
		}
		int a = S[0], b = S[1];
		int combo = 2;
		int sameCombo = 1;
		if(a == b) {
			sameCombo = 2;
			b = 0;
		}
		int max = 0;
		if(combo > max) max = combo;
		for(int i = 2; i < N; i++) {
			if(S[i] == a) {
				sameCombo = 1;
				combo++;
				if(S[i-1] == b) {
					a = b;
					b = S[i];
				}
			} else if(S[i] == b) {
				sameCombo++;
				combo++;
			} else if(S[i] != a && b == 0){
				b = S[i];
				sameCombo = 1;
				combo++;
			} else {
				a = b;
				b = S[i];
				combo = sameCombo + 1;
				sameCombo = 1;
			}
			if(combo > max) max = combo;
		}
		bw.write(max + "");
		bw.flush();
		

	}

}