import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static Deque<Integer> stack = new ArrayDeque<>();
	public static boolean[] visited;
	public static int ans = -1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<Integer, List<Integer>> g = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		visited = new boolean[N + 1];
		for(int i = 1; i < N + 1; i++) {
			g.put(i, new ArrayList<>());
		}
		for(int i = 0; i < M; i++) {
			String[] line = br.readLine().split(" ");
			g.get(Integer.parseInt(line[0])).add(Integer.parseInt(line[1]));
			g.get(Integer.parseInt(line[1])).add(Integer.parseInt(line[0]));
		}
		dfs(g);
		bw.write(ans + "");
		bw.flush();
		
		
	}
	
	public static void dfs(Map<Integer, List<Integer>> graph) {
		stack.push(1);
		visited[1] = true;
		
		while(!stack.isEmpty()) {
			int now = stack.pop();
			
			for(int beside : graph.get(now)) {
				if(!visited[beside]) {
					visited[beside] = true;
					stack.push(beside);
				}
			}
			ans++;
			
		}
		
		
	}
	
}
