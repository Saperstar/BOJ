import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		Set<String> ansPerson = new HashSet<>();
		
		String[] line = br.readLine().split(" "); 
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		for(int i = 0; i < N; i++) {
			list1.add(br.readLine());
		}
		for(int i = 0; i < M; i++) {
			list2.add(br.readLine());
		}
		Set<String> set2 = new HashSet<>(list2);
		for(String A : list1) {
			if(set2.contains(A)) {
				ansPerson.add(A);
			}
		}
		List<String> answer = new ArrayList<>(ansPerson);
		answer.sort(null);
		bw.write(ansPerson.size() + "\n");
		for(String K : answer) {
			bw.write(K + "\n");
		}
		bw.flush();
		

	}

}
