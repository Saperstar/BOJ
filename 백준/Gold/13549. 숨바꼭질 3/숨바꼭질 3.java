import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static int ansDepth = -1;
	public static int ansDepth2 = -1;
	public static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);
		
		bfs(N, K);
		bfs2(N, K);
		int ans = Math.min(ansDepth, ansDepth2);
		
		bw.write(ans + "");
		bw.flush();
	}

	public static void bfs(int start, int target) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[100001];
		int[] time = new int[100001];
		
		visited[start] = true;
		time[start] = 0;
		queue.add(start);
		while(!queue.isEmpty()) {
			int pos = queue.poll();
			
			for(int i = 3; i > -2; i -= 2) {
				if(i == 3) {
					if(pos * 2 >= 0 && pos * 2 < 100001 && !visited[pos * 2]) {
						visited[pos * 2] = true;
						time[pos * 2] = time[pos];
						queue.add(pos * 2);
					}
				} else {
					if(pos + i >= 0 && pos + i < 100001 && !visited[pos + i]) {
						visited[pos + i] = true;
						time[pos + i] += time[pos] + 1;
						queue.add(pos + i);
					}
				}
			}
			
		}
		ansDepth = time[target];
		
	}
	public static void bfs2(int start, int target) {
		Queue<Integer> queue2 = new LinkedList<>();
		boolean[] visited2 = new boolean[100001];
		int[] time2 = new int[100001];
		
		visited2[start] = true;
		time2[start] = 0;
		queue2.add(start);
		while(!queue2.isEmpty()) {
			int pos = queue2.poll();
			
			for(int i = -1; i < 4; i += 2) {
				if(i == 3) {
					if(pos * 2 >= 0 && pos * 2 < 100001 && !visited2[pos * 2]) {
						visited2[pos * 2] = true;
						time2[pos * 2] = time2[pos];
						queue2.add(pos * 2);
					}
				} else {
					if(pos + i >= 0 && pos + i < 100001 && !visited2[pos + i]) {
						visited2[pos + i] = true;
						time2[pos + i] += time2[pos] + 1;
						queue2.add(pos + i);
					}
				}
			}
			
		}
		ansDepth2 = time2[target];
		
	}


}
