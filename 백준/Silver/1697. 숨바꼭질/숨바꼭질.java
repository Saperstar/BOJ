import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);
		
		int depth = bfs(N, K);
		
		bw.write(depth + "");
		bw.flush();
	}

    public static int bfs(int start, int target) {
        boolean[] visited = new boolean[100001];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] currunt = queue.poll();
            int pos = currunt[0];
            int depth = currunt[1];

            if (pos == target) return depth;

            int[] nextMoves = {pos - 1, pos + 1, pos * 2};
            for (int next : nextMoves) {
                if (next <= 100000 && next >= 0 && !visited[next]) {
                    visited[next] = true;
                    queue.add(new int[]{next, depth + 1});
                }
            }
        }
        return 0;
    }
}
