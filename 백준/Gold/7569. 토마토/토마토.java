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
        int H = Integer.parseInt(line[2]);
        int[][][] map = new int[N][M][H];
        for(int j = 0; j < H; j++) {
        	for(int i = 0; i < N; i++) {
        		line = br.readLine().split(" ");
        		for(int k = 0; k < M; k++) {
        			map[i][k][j] = Integer.parseInt(line[k]);
        			if(map[i][k][j] == 1) q.add(new int[]{i, k, j});
        		}
        	}
        }
        
        while(!q.isEmpty()) {
        	int[] cur = q.poll();
        	int x = cur[0];
        	int y = cur[1];
        	int h = cur[2];
        	if(x + 1 < N) if(map[x+1][y][h] == 0) {
        		map[x+1][y][h] = map[x][y][h] + 1;
        		q.add(new int[] {x+1, y, h});
        	}
        	if(y + 1 < M) if(map[x][y+1][h] == 0) {
        		map[x][y+1][h] = map[x][y][h] + 1;
        		q.add(new int[] {x, y+1, h});
        	}
        	if(x - 1 >= 0) if(map[x-1][y][h] == 0) {
        		map[x-1][y][h] = map[x][y][h] + 1;
        		q.add(new int[] {x-1, y, h});
        	}
        	if(y - 1 >= 0) if(map[x][y-1][h] == 0) {
        		map[x][y-1][h] = map[x][y][h] + 1;
        		q.add(new int[] {x, y-1, h});
        	}
        	if(h + 1 < H) if(map[x][y][h+1] == 0) {
        		map[x][y][h+1] = map[x][y][h] + 1;
        		q.add(new int[] {x, y, h+1});
        	}
        	if(h - 1 >= 0) if(map[x][y][h-1] == 0) {
        		map[x][y][h-1] = map[x][y][h] + 1;
        		q.add(new int[] {x, y, h-1});
        	}
        	
        }
        
        int ans = -1;
        for(int i = 0; i < N; i++) {
        	for(int k = 0; k < M; k++) {
        		for(int h = 0; h < H; h++) {
        			if(map[i][k][h] == 0) {
        				ans = 0;
        				break;
        			} else {
        				ans = Math.max(ans, map[i][k][h]);
        			}
        		}
        		if(ans == 0) break;
        	}
        	if(ans == 0) break;
        }
        bw.write(ans - 1 + "");
        bw.flush();
    	
    	
    }
}