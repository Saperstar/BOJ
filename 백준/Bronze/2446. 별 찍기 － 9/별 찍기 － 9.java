import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		if(n == 1) {
			bw.write("*");
			bw.close();
			return;
		}
		for(int i = 0; i < n; i++) {
			int m = i;
			for(int k = 0; k < (2 * n - 1) - 2 * i; k++) {
				bw.write("*");
			}
			if(i == n - 2) break;
			bw.write("\n");
			while(m >= 0) {
				bw.write(" ");
				m--;
			}
		}
		for(int i = n; i >= 0; i--) {
			int m = 0;
			for(int k = (2 * n - 1) - 2 * i; k > 0; k--) {
				bw.write("*");
			}
			bw.write("\n");
			while(m < i - 1) {
				bw.write(" ");
				m++;
			}
			
		}
		
		
		bw.flush();
		

	}
	

}
