import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static int ansDepth = -1;
	public static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);
		
		bfs(N, K);
		
		bw.write(ansDepth + "\n" + count);
		bw.flush();
	}

	public static void bfs(int start, int target) {
		Queue<Integer> queue = new LinkedList<>();
		int[] depth = new int[100001];
		int[] canGo = new int[100001];
		
		for(int i = 0; i < 100001; i++) depth[i] = -1;
		
		depth[start] = 0;
		canGo[start] = 1;
		queue.add(start);
		
		while(!queue.isEmpty()) {
			int pos = queue.poll();
			int[] nextMove = {pos - 1, pos + 1, pos * 2};
			for(int next : nextMove) {
				if(next >= 0 && next < 100001) {
					if(depth[next] == -1) {
						depth[next] = depth[pos] + 1;
						canGo[next] = canGo[pos];
						queue.add(next);
					} else if(depth[next] == depth[pos] + 1) {
						canGo[next] += canGo[pos];
					}
				}
			}
		}
		ansDepth = depth[target];
		count = canGo[target];
		
	}


}
