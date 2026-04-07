import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int loc = 1;
        boolean[] visited = new boolean[107];
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        for(int i = 0; i < N; i++) {
        		line = br.readLine().split(" ");
        		int a = Integer.parseInt(line[0]);
        		int b = Integer.parseInt(line[1]);
        		map.put(a, b);
        		
        }
        for(int i = 0; i < M; i++) {
	        	line = br.readLine().split(" ");
	        	int a = Integer.parseInt(line[0]);
	        	int b = Integer.parseInt(line[1]);
	        	map.put(a, b);
        		
        }
        int tempLoc = 1;
        int[] ansMap = new int[107];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        while(!q.isEmpty()) {
        		boolean end = false;
        		tempLoc = q.poll();
        		if(tempLoc == 100) break;
        		if(tempLoc >= 100) end = true;
        		int[] dice = {1,2,3,4,5,6};
        		if(!end){
        			for(int i : dice) {
        				int nextLoc = tempLoc + i;
        				if(nextLoc <= 100) {
        					int finalLoc = map.getOrDefault(nextLoc, nextLoc);
        					if(!visited[finalLoc]) {
        						visited[finalLoc] = true;
        						ansMap[finalLoc] = ansMap[tempLoc] + 1;
        						q.add(finalLoc);
        					}
        					
        				}
        				
        			}
        		}
        }
        bw.write(ansMap[100] + "");
        bw.flush();
        
        
    }

}