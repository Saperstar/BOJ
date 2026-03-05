import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);
		
		bfs(N, K);
		
	}

	public static void bfs(int start, int target) {
	    Queue<Integer> queue = new LinkedList<>();
	    int[] depth = new int[100001];
	    int[] prev = new int[100001];

	    for (int i = 0; i < 100001; i++) {
	        depth[i] = -1;
	        prev[i] = -1;
	    }

	    depth[start] = 0;
	    queue.add(start);

	    while (!queue.isEmpty()) {
	        int pos = queue.poll();

	        if (pos == target) break;

	        int[] nextMove = {pos - 1, pos + 1, pos * 2};
	        for (int next : nextMove) {
	            if (next >= 0 && next < 100001 && depth[next] == -1) {
	                depth[next] = depth[pos] + 1;
	                prev[next] = pos;
	                queue.add(next);
	            }
	        }
	    }

	    System.out.println(depth[target]);

	    List<Integer> path = new ArrayList<>();
	    for (int cur = target; cur != -1; cur = prev[cur]) {
	        path.add(cur);
	    }
	    Collections.reverse(path);

	    for (int p : path) {
	        System.out.print(p + " ");
	    }
	}



}
