import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	static List<List<Integer>> graph;
	static Queue<Integer> queue;
	static boolean[] visited;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		int V = Integer.parseInt(line[2]);
		graph = new ArrayList<>();
		queue = new LinkedList<>();
		visited = new boolean[N+1];
		
		graph = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i = 0; i < M; i++) {
			line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		for (int i = 0; i <= N; i++) {
			Collections.sort(graph.get(i));
		}
		dfs(V);
		bw.write("\n");
		Arrays.fill(visited, false);
		bfs(V);
		
		bw.flush();
	}
	
	public static void dfs(int n) throws IOException {
		visited[n] = true;
		bw.write(n + " ");
		for(int next : graph.get(n)) {
			if(!visited[next]) dfs(next);
		}
	}
	
	public static void bfs(int n) throws IOException {
		visited[n] = true;
		queue.add(n);
		
		while(!queue.isEmpty()) {
			int node = queue.poll();
			bw.write(node + " ");
			for(int next : graph.get(node)) {
			    if (!visited[next]) {
			        visited[next] = true;
			        queue.add(next);
			    }
			}
		}
		
	}

}
