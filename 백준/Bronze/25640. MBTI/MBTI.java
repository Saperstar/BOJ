import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String myM = br.readLine();
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		for(int i = 0; i < N; i++) {
			String friM = br.readLine();
			if(myM.equals(friM)) ans++;
		}
		
		bw.write(ans + "\n");
		bw.flush();
		
		

	}
	

}
