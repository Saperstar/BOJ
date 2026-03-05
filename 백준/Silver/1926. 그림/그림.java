import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		String[] Ns = br.readLine().split(" ");
		int N = Integer.parseInt(Ns[0]);
		int M = Integer.parseInt(Ns[1]);
		visited = new boolean[N * M];
		int[][] map = new int[N][M];
		for(int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			for(int k = 0; k < M; k++) {
				map[i][k] = Integer.parseInt(line[k]);
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
		int[] ans = new int[N*M];
		int X = 0;
		for(int i = 0; i < N * M; i++) {
			if(map[i/M][i%M] == 1 && visited[i] == false) {
				ans[X] = dfs(i, graph);
				X++;
			}
		}
		bw.write(X + "\n");
		int max = 0;
		for (int val : ans) {
		    if (val > max) max = val;
		}
		bw.write(max + "\n");
		bw.flush();
		
		
		
	}
	
	public static int dfs(int num, ArrayList<ArrayList<Integer>> graph) {
	    visited[num] = true;
	    int count = 1;
	    for (int next : graph.get(num)) {
	        if (visited[next] == false) {
	            count += dfs(next, graph);
	        }
	    }
	    return count;
	}





}
