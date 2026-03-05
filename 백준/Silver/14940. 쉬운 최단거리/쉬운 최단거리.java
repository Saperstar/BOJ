import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
		Arrays.fill(depth, -1);
		int[][] map = new int[N][M];
		int mok = 0;
		for(int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			for(int k = 0; k < M; k++) {
				map[i][k] = Integer.parseInt(line[k]);
				if(map[i][k] == 2) {
					mok = i * M + k;
					map[i][k] = 1;
				}
			}
		}
		
		for(int i = 0; i < N*M; i++) graph.add(new ArrayList<>());
		
		for(int i = 0; i < N; i++) {
			for(int k = 0; k < M; k++) {
				int tempNum = i * M + k;
				if(map[i][k] == 1) {
					if(tempNum - M >= 0 && i != 0) {			//위로
						if(map[i-1][k] != 0) {
							graph.get(tempNum).add(tempNum - M);
							graph.get(tempNum - M).add(tempNum);
						}
					}
					if(tempNum - 1 >= 0 && k != 0) {			//왼쪽으로
						if(map[i][k-1] != 0) {
							graph.get(tempNum).add(tempNum - 1);
							graph.get(tempNum - 1).add(tempNum);
						}
					}
					if(tempNum + M < N*M && i != N-1) {			//밑으로
						if(map[i+1][k] != 0) {
							graph.get(tempNum).add(tempNum + M);
							graph.get(tempNum + M).add(tempNum);
						}
					}
					if(tempNum + 1 < N*M && k != M-1) {			//오른쪽으로
						if(map[i][k+1] != 0) {
							graph.get(tempNum).add(tempNum + 1);
							graph.get(tempNum + 1).add(tempNum);
						}
					}
				}
					
			}
		}
		bfs(mok, graph);
		for (int i = 0; i < N; i++) {
		    for (int k = 0; k < M; k++) {
		        int idx = i * M + k;
		        if (map[i][k] == 0) {
		            bw.write("0 "); // 벽은 항상 0으로 출력
		        } else {
		            bw.write(depth[idx] + " ");
		        }
		    }
		    bw.write("\n");
		}

		
		bw.flush();
		
		
		
	}
	
	public static void bfs(int end, ArrayList<ArrayList<Integer>> tempGraph) {
	    Queue<Integer> q = new LinkedList<>();
	    depth[end] = 0;
	    visited[end] = true;
	    q.add(end);
	    while (!q.isEmpty()) {
	        int cur = q.poll();
	        for (int next : tempGraph.get(cur)) {
	            if (!visited[next]) {
	                visited[next] = true;
	                q.add(next);
	                depth[next] = depth[cur] + 1;
	            }
	        }
	    }
	    return;
	}






}
