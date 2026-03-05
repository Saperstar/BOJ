import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Set<Integer>> graph = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < N ; i++) graph.add(new HashSet<>());
		
		for(int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			for(int k = 0; k < N; k++) {
				if(Integer.parseInt(line[k]) == 1) {
					int y = i;
					int x = k;
					graph.get(y).add(x);
				}
			}
		}
		
		int[][] ans = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int k = 0; k < N; k++) {
				int[] dis = new int[N];
				Queue<Integer> q = new LinkedList<>();
				q.offer(i);
				dis[i] = 0;
				
				while(!q.isEmpty()) {
					int cur = q.poll();
					
					for(int next : graph.get(cur)) {
						if(dis[next] == 0) {
							dis[next] = dis[cur] + 1;
							q.offer(next);
						}
					}
					
				}
				if(dis[k] > 0) ans[i][k] = 1;
				else ans[i][k] = 0;
				
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int k = 0; k < N; k++) {
				bw.write(ans[i][k] + " ");
			}
			bw.write("\n");
		}
		
		bw.flush();

	}

}
