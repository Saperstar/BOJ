import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N+1; i++) list.add(new ArrayList<>());
		for(int i = 0; i < N-1; i++) {
			String[] line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		int[] parent = new int[N + 1];
		q.add(1);
		parent[1] = -1;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			
			for(int next : list.get(cur)) {
				if(parent[next] == 0) {
					parent[next] = cur;
					q.add(next);
				}
			}
		}
		
		for(int i = 2; i < N+1; i++) bw.write(parent[i] + "\n");
		bw.flush();
		
	}
}
