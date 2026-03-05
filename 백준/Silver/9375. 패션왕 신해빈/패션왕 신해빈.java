import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line;
		int T = Integer.parseInt(br.readLine());
		for(int t = 0; t < T; t++) {
			Map<String, Integer> map = new HashMap<>();
			int ans = 1;
			int n = Integer.parseInt(br.readLine());
			for(int i = 0; i < n; i++) {
				line = br.readLine().split(" ");
				map.put(line[1], map.getOrDefault(line[1], 0) + 1);
			}
			Set<String> keys = map.keySet();
			for(String k : keys) {
				ans *= map.get(k) + 1;
			}
			bw.write((ans-1) + "\n");
		}
		bw.flush();
			
	}
		

}
