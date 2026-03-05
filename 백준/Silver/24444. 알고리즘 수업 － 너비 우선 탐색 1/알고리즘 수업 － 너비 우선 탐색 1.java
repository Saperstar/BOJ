import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static boolean[] visited;
	static int[] ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		String[] Ns = br.readLine().split(" ");
		int N = Integer.parseInt(Ns[0]);
		int M = Integer.parseInt(Ns[1]);
		int start = Integer.parseInt(Ns[2]) - 1;
		visited = new boolean[N];
		ans = new int[N];
		ans[start] = 1;
		
		for(int i = 0; i < N; i++) graph.add(new ArrayList<>());
		for(int i = 0; i < M; i++) {
			String[] line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]) - 1;
			int b = Integer.parseInt(line[1]) - 1;
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		for (int i = 0; i < N; i++) Collections.sort(graph.get(i));

		
		bfs(start, graph);
		for(int i : ans) bw.write(i + "\n");
		
		bw.flush();
		
	}
	
	public static void bfs(int start, ArrayList<ArrayList<Integer>> tempGraph) {
		Queue<Integer> q = new LinkedList<>();
		int X = 2;
		visited[start] = true;
		q.add(start);
		while(!q.isEmpty()) {
			int tem = q.poll();
			for(int next : tempGraph.get(tem)) {
				if(!visited[next]) {
					visited[next] = true;
					ans[next] = X;
					X++;
					q.add(next);
				}
			}
			
		}
	}
	

}
