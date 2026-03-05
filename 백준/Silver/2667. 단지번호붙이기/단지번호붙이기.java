import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		visited = new boolean[N * N];
		int[][] map = new int[N][N];
		for(int i = 0; i < N; i++) {
			String line = br.readLine();
			for(int k = 0; k < N; k++) {
				map[i][k] = line.charAt(k) - '0';
			}
		}
		
		for(int i = 0; i < N*N; i++) graph.add(new ArrayList<>());
		
		for(int i = 0; i < N; i++) {
			for(int k = 0; k < N; k++) {
				int tempNum = i * N + k;
				if(map[i][k] == 1) {
					if(tempNum - N >= 0 && i != 0) {			//위로
						if(map[i-1][k] == 1) {
							graph.get(tempNum).add(tempNum - N);
							graph.get(tempNum - N).add(tempNum);
						}
					}
					if(tempNum - 1 >= 0 && k != 0) {			//왼쪽으로
						if(map[i][k-1] == 1) {
							graph.get(tempNum).add(tempNum - 1);
							graph.get(tempNum - 1).add(tempNum);
						}
					}
					if(tempNum + N < N*N && i != N-1) {			//밑으로
						if(map[i+1][k] == 1) {
							graph.get(tempNum).add(tempNum + N);
							graph.get(tempNum + N).add(tempNum);
						}
					}
					if(tempNum + 1 < N*N && k != N-1) {			//오른쪽으로
						if(map[i][k+1] == 1) {
							graph.get(tempNum).add(tempNum + 1);
							graph.get(tempNum + 1).add(tempNum);
						}
					}
				}
					
			}
		}
		int[] ans = new int[N*N];
		int X = 0;
		for(int i = 0; i < N * N; i++) {
			if(map[i/N][i%N] == 1 && visited[i] == false) {
				ans[X] = dfs(i, graph);
				X++;
			}
		}
		bw.write(X + "\n");
		Arrays.sort(ans);
		for(int i : ans) {
			if(i != 0) bw.write(i + "\n");
		}
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
