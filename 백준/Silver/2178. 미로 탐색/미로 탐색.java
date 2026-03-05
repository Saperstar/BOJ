import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static boolean[] visited;
	static int[] depth;;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		String[] Ns = br.readLine().split(" ");
		int N = Integer.parseInt(Ns[0]);
		int M = Integer.parseInt(Ns[1]);
		visited = new boolean[N * M];
		depth = new int[N * M];
		int[][] map = new int[N][M];
		for(int i = 0; i < N; i++) {
			String line = br.readLine();
			for(int k = 0; k < M; k++) {
				map[i][k] = line.charAt(k) - '0';
			}
		}
		
		for(int i = 0; i < N*M; i++) graph.add(new ArrayList<>());
		
		for(int i = 0; i < N; i++) {
			for(int k = 0; k < M; k++) {
				int tempNum = i * M + k;
				if(map[i][k] == 1) {
					if(tempNum - M >= 0 && i != 0) {			//위로
						if(map[i-1][k] == 1) {
							graph.get(tempNum).add(tempNum - M);
							graph.get(tempNum - M).add(tempNum);
						}
					}
					if(tempNum - 1 >= 0 && k != 0) {			//왼쪽으로
						if(map[i][k-1] == 1) {
							graph.get(tempNum).add(tempNum - 1);
							graph.get(tempNum - 1).add(tempNum);
						}
					}
					if(tempNum + M < N*M && i != N-1) {			//밑으로
						if(map[i+1][k] == 1) {
							graph.get(tempNum).add(tempNum + M);
							graph.get(tempNum + M).add(tempNum);
						}
					}
					if(tempNum + 1 < N*M && k != M-1) {			//오른쪽으로
						if(map[i][k+1] == 1) {
							graph.get(tempNum).add(tempNum + 1);
							graph.get(tempNum + 1).add(tempNum);
						}
					}
				}
					
			}
		}
		int ans = bfs(0, graph, N*M-1);
		
		bw.write(ans + "\n");
		bw.flush();
		
		
		
	}
	
	public static int bfs(int start, ArrayList<ArrayList<Integer>> graph, int end) {
	    Queue<Integer> q = new LinkedList<>();
	    depth[start] = 1;
	    visited[start] = true;
	    q.add(start);
	    while (!q.isEmpty()) {
	        int cur = q.poll();
	        for (int next : graph.get(cur)) {
	            if (!visited[next]) {
	                visited[next] = true;
	                q.add(next);
	                if(depth[next] == 0) depth[next] = depth[cur] + 1;
	            }
	        }
	        if(visited[end]) return depth[end];
	    }
	    return depth[end];
	}






}
