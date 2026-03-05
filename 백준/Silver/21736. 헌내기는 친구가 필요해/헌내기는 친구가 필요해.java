import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static boolean[][] visited;
	public static int ans = 0;
	public static int[] whereP;
	public static List<List<Integer>> graph = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		int totalNodes = (N+1) * (M+1);
		for (int i = 0; i < totalNodes; i++) {
		    graph.add(new ArrayList<>());
		}
		
		visited = new boolean[totalNodes][2];
		int whereI = -1;
		int howManyP = 0;
		char[][] map = new char[N+2][M+2];
		for(int i = 0; i < map.length; i++) {
			Arrays.fill(map[i], 'X');
		}
		for(int i = 1; i < N + 1; i++) {
			String lines = br.readLine();
			for(int k = 1; k < M + 1; k++) {
				map[i][k] = lines.charAt(k - 1);
				if(map[i][k] == 'I') {
					whereI = cal(M, i, k);
				} else if(map[i][k] == 'P') howManyP++;
			}
		}
		whereP = new int[howManyP];
		int l = 0;
		for(int i = 1; i < N + 1; i++) {
			for(int k = 1; k < M + 1; k++) {
				if(map[i][k] == 'P') {
					whereP[l] = cal(M, i, k);
					l++;
				}
				if(map[i][k] != 'X') {
					/*if(map[i][k-1] != 'X') {
						graph.get(cal(M, i, k)).add(cal(M, i, k - 1));
						bw.write(cal(M, i, k) + "랑" + cal(M, i, k-1) + "연결\n");
					}
					if(map[i][k+1] != 'X') {
						graph.get(cal(M, i, k)).add(cal(M, i, k + 1));
						bw.write(cal(M, i, k) + "랑" + cal(M, i, k+1) + "연결\n");
					}
					if(map[i+1][k] != 'X') {
						graph.get(cal(M, i, k)).add(cal(M, i+1, k ));
						bw.write(cal(M, i, k) + "랑" + cal(M, i+1, k) + "연결\n");
					}
					if(map[i-1][k] != 'X') {
						graph.get(cal(M, i, k)).add(cal(M, i-1, k ));
						bw.write(cal(M, i, k) + "랑" + cal(M, i-1, k) + "연결\n");
					}*/
					if(map[i][k+1] != 'X') graph.get(cal(M, i, k))
					.add(cal(M, i, k + 1));
					if(map[i][k-1] != 'X') graph.get(cal(M, i, k))
					.add(cal(M, i, k - 1));
					if(map[i+1][k] != 'X') graph.get(cal(M, i, k))
					.add(cal(M, i + 1, k));
					if(map[i-1][k] != 'X') graph.get(cal(M, i, k))
					.add(cal(M, i - 1, k));
				}
			}
		}
		for(int i = 0; i < howManyP; i++) {
			visited[whereP[i]][1] = true;
		}
		dfs(whereI);
		if(ans == 0) bw.write("TT");
		else bw.write(ans + "");
		bw.flush();
		
	}
	
	public static int cal(int m, int i, int k) {
		return (i-1) * m + k-1;
	}
	
	public static void dfs(int start) {
		visited[start][0] = true;
		if(visited[start][1]) {
			ans++;
			visited[start][1] = false;
		}
		for(int next : graph.get(start)) {
			if(!visited[next][0]) dfs(next);
		}
		
	}

}