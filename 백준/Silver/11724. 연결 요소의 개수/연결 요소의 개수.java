import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	
	public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	public static boolean[] visited;
	public static int N, ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] line = br.readLine().split(" ");
        N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        visited = new boolean[N];
        for(int i = 0 ; i < N ; i++) list.add(new ArrayList<>());
        for(int i = 0; i < M; i++) {
        	line = br.readLine().split(" ");
        	int x = Integer.parseInt(line[0]) - 1;
        	int y = Integer.parseInt(line[1]) - 1;
        	list.get(x).add(y);
        	list.get(y).add(x);
        }
        for(int i = 0; i < N; i++){
            if(!visited[i]){
                dfs(i);
                ans++;
            }
        }
        bw.write(ans + "");
        bw.flush();
        
        
    }
    
    public static void dfs(int start) {
    	visited[start] = true;
    	for (int next : list.get(start)) {
    		if (!visited[next]) dfs(next);
    	}
    	
    }
}

