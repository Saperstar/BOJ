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
        
        int N = Integer.parseInt(br.readLine());
        int[][] maps = new int[N][N];
        for(int i = 0; i < N; i++) {
        		String line = br.readLine();
        		for(int k = 0; k < N; k++) {
        			int x = -1;
        			if(line.charAt(k) == 'R') x = 0;
        			if(line.charAt(k) == 'G') x = 1;
        			if(line.charAt(k) == 'B') x = 2;
        			maps[i][k] = x;
        		}
        }
        
        int ans1 = bfs(maps, N);
        
        for(int i = 0; i < N; i++) for(int k = 0; k < N; k++) if(maps[i][k] == 1) maps[i][k] = 0;

        int ans2 = bfs(maps, N);
        
        bw.write(ans1 + " " + ans2);
        
        bw.flush();
    	
    }
    
    public static int bfs(int[][] maps, int N) {
    		int ans = 0;
        boolean[][] visited = new boolean[N][N];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < N; i++) {
        		for(int k = 0; k < N; k++) {
        			if(!visited[i][k]) {
        				q.add(new int[] {i, k});
        				ans++;
        				visited[i][k] = true;
        				while(!q.isEmpty()) {
        					int[] temp = q.poll();
        					int x = temp[0];
        					int y = temp[1];
    						if(x - 1 >= 0) if(maps[x][y] == maps[x - 1][y] && !visited[x - 1][y]) {
    							visited[x-1][y] = true;
    							q.add(new int[] {x-1, y});
    						}
    						if(y - 1 >= 0) if(maps[x][y] == maps[x][y - 1] && !visited[x][y - 1]) {
    							visited[x][y-1] = true;
    							q.add(new int[] {x, y-1});
    						}
    						if(x + 1 < N) if(maps[x][y] == maps[x + 1][y] && !visited[x + 1][y]) {
    							visited[x+1][y] = true;
    							q.add(new int[] {x+1, y});
    						}
    						if(y + 1 < N) if(maps[x][y] == maps[x][y + 1] && !visited[x][y + 1]) {
    							visited[x][y+1] = true;
    							q.add(new int[] {x, y+1});
    						}
        				}
        			} else continue;
        			
        		}
        }
    		return ans;
    	
    }
}