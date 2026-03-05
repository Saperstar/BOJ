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
		Map<Integer, Integer> cardMap = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		int[] Ns = new int[line.length];
		for(int i = 0; i < line.length; i++) {
			Ns[i] = Integer.parseInt(line[i]);
		}
		int M = Integer.parseInt(br.readLine());
		line = br.readLine().split(" ");
		int[] Ms = new int[line.length];
		for(int i = 0; i < line.length; i++) {
			Ms[i] = Integer.parseInt(line[i]);
		}
		for(int num : Ns) {
			cardMap.put(num, cardMap.getOrDefault(num, 0) + 1);
		}
		for(int num : Ms) {
			int ans = cardMap.getOrDefault(num, 0);
			bw.write(ans + " ");
		}
		bw.flush();
		
		

	}

}
