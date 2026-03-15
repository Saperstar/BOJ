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
        Queue<int[]> q = new LinkedList<>();
        
        String[] line = br.readLine().split(" ");
        int M = Integer.parseInt(line[0]);
        int N = Integer.parseInt(line[1]);
        int[][] map = new int[N][M];
        for(int i = 0; i < N; i++) {
        	line = br.readLine().split(" ");
        	for(int k = 0; k < M; k++) {
        		map[i][k] = Integer.parseInt(line[k]);
        		if(map[i][k] == 1) q.add(new int[]{i, k});
        	}
        }
        
        while(!q.isEmpty()) {
        	int[] cur = q.poll();
        	int x = cur[0];
        	int y = cur[1];
        	if(x + 1 < N) if(map[x+1][y] == 0) {
        		map[x+1][y] = map[x][y] + 1;
        		q.add(new int[] {x+1, y});
        	}
        	if(y + 1 < M) if(map[x][y+1] == 0) {
        		map[x][y+1] = map[x][y] + 1;
        		q.add(new int[] {x, y+1});
        	}
        	if(x - 1 >= 0) if(map[x-1][y] == 0) {
        		map[x-1][y] = map[x][y] + 1;
        		q.add(new int[] {x-1, y});
        	}
        	if(y - 1 >= 0) if(map[x][y-1] == 0) {
        		map[x][y-1] = map[x][y] + 1;
        		q.add(new int[] {x, y-1});
        	}
        	
        }
        
        int ans = -1;
        for(int i = 0; i < N; i++) {
        	for(int k = 0; k < M; k++) {
        		if(map[i][k] == 0) {
        			ans = 0;
        			break;
        		} else {
        			ans = Math.max(ans, map[i][k]);
        		}
        	}
        	if(ans == 0) break;
        }
        bw.write(ans - 1 + "");
        bw.flush();
    	
    	
    }
}