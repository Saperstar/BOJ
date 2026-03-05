import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] powNum = new int[230];
		int ans = 0;
		for(int i = 1; i < 230; i++) {
			powNum[i] = (int)Math.pow(i, 2);
		}
		int n = Integer.parseInt(br.readLine());
		for(int a = 1; a < 224; a++) {
			for(int b = a; b < 224; b++) {
				for(int c = b; c < 224; c++) {
					for(int d = c; d < 224; d++) {
						if(powNum[a] + powNum[b] + powNum[c] + powNum[d] == n) ans = 4;
					}
				}
			}
		}
		for(int a = 1; a < 224; a++) {
			for(int b = a; b < 224; b++) {
				for(int c = b; c < 224; c++) {
					if(powNum[a] + powNum[b] + powNum[c] == n) ans = 3;
				}
			}
		}
		for(int a = 1; a < 224; a++) {
			for(int b = a; b < 224; b++) {
				if(powNum[a] + powNum[b] == n) ans = 2;
			}
		}
		for(int a = 1; a < 224; a++) {
			if(powNum[a] == n) ans = 1;
		}
		bw.write(ans + "");
		bw.flush();
		
		
		

	}

}
