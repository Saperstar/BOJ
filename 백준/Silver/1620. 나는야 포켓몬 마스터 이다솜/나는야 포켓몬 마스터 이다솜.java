import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<String, Integer> dogam = new HashMap<>();
		Map<Integer, String> revdogam = new HashMap<>();
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		for(int i = 1; i < N+1; i++) {
			String P = br.readLine();
			dogam.put(P, i);
			revdogam.put(i, P);
		}
		
		for(int i = 0; i < M; i++) {
			String ques = br.readLine();
			try {
				int num = Integer.parseInt(ques);
				bw.write(revdogam.get(num) + "\n");
			} catch(NumberFormatException e) {
				bw.write(dogam.get(ques) + "\n");
			}
		}
		bw.flush();
		
	}
	

}
