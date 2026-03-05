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
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		for(int i = 0 ; i <= N ; i++) graph.add(new HashSet<>());
		
		for(int i = 0; i < M; i++) {
			line = br.readLine().split(" ");
			graph.get(Integer.parseInt(line[0])).add(Integer.parseInt(line[1]));
			graph.get(Integer.parseInt(line[1])).add(Integer.parseInt(line[0]));
		}
		
		int[] ans = new int[N+1];
		for(int i = 1; i <= N; i++) {
			int[] dis = new int[N+1];
			for(int k = 0; k < N+1; k++) dis[k] = -1;
			Queue<Integer> queue = new LinkedList<>();
			queue.offer(i);
			dis[i] = 0;
			
			while (!queue.isEmpty()) {
				int curr = queue.poll();
				
				for (int next : graph.get(curr)) {
					if (dis[next] == -1) {
						dis[next] = dis[curr] + 1;
						queue.offer(next);
					}
				}
			}
			for(int k : dis) ans[i] += k;
		}
		int min = Integer.MAX_VALUE;
		int minTime = 0;
		for(int i = N; i > 0; i--) if(ans[i] <= min) {
			min = ans[i];
			minTime = i;
		}
		
		bw.write(minTime + "");
		bw.flush();
		
		

	}

}
