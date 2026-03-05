import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<Integer, Integer> m = new HashMap<>();
		Set<Integer> set = new TreeSet<>();
		
		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			set.add(Integer.parseInt(line[i]));
		}
		Integer[] arr = set.toArray(new Integer[0]);
		for(int i = 0; i < set.size(); i++) {
			m.put(arr[i], i);
		}
		for(int i = 0; i < line.length; i++) {
			int x = Integer.parseInt(line[i]);
			bw.write(m.get(x) + " ");
		}
		bw.flush();
		

	}

}
